/**
 * @author webpantry
 * 	@RequestMapping("checkout_order") this API is being used for checkout order or place order of the items added by user
 */
package com.project.pantry.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pantry.Controller.pojo.ApiResponse;
import com.project.pantry.JWTToken.ShoppingCartCheck;
import com.project.pantry.model.Cart;
import com.project.pantry.model.CheckoutCart;
import com.project.pantry.service.AddtoCartService;
import com.project.pantry.service.impl.ProductServices;

@RestController
@RequestMapping("api/order")
public class OrderController {
	@Autowired
	AddtoCartService cartService;
	ProductServices proService;

	@RequestMapping("checkout_order")
	@CrossOrigin
	public ResponseEntity<?> checkout_order(@RequestBody HashMap<String, String> addCartRequest) {
		try {
			String keys[] = { "email" };
			if (ShoppingCartCheck.validationWithHashMap(keys, addCartRequest)) {// Validating User Email

			}
			String email = addCartRequest.get("email");
			List<Cart> cartItems = cartService.getCartByUserId(email);// Fetching All Cart Items
			List<CheckoutCart> tmp = new ArrayList<CheckoutCart>();
			for (Cart addCart : cartItems) {
				String orderId = "" + getOrderId();//Setting Values for Cart 
				CheckoutCart cart = new CheckoutCart();
				cart.setEmail(email);
				cart.setOrder_id(orderId);
				cart.setProduct(addCart.getProduct());// Adding Product Details to the cart as it is referenced by foreign key
				cart.setQty(addCart.getQty());
				tmp.add(cart);

			}
			cartService.saveProductsForCheckout(tmp, email);// Savinf Products for Checkout in Orders Table and Deleting Cart Items and sending email confirmationwith ORDER ID
			return ResponseEntity.ok(new ApiResponse("Order placed successfully", ""));

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage(), ""));// handling Exceptions
		}
	}

	public int getOrderId() {// Function to create Random Order ID
		Random r = new Random(System.currentTimeMillis());
		return 10000 + r.nextInt(20000);
	}

	@RequestMapping("getOrdersByUserId")
	@CrossOrigin
	public ResponseEntity<?> getOrdersByUserId(@RequestBody HashMap<String, String> ordersRequest) {
		try {
			String keys[] = { "userId" };
			return ResponseEntity.ok(new ApiResponse("Order placed successfully", ""));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(new ApiResponse(e.getMessage(), ""));
		}

	}
}