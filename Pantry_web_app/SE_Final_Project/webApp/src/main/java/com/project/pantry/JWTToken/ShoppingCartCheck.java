/**
 * @author webpantry
 * checking if keys are missing as validation check and send error the Frontend
 */
package com.project.pantry.JWTToken;
import java.util.HashMap;

public class ShoppingCartCheck {

	public static Boolean validationWithHashMap(String keys[],HashMap<String,String> request) throws Exception{
		Boolean status = false;
		try {
			for(int start = 0;start<keys.length;start++) {
				
				if(request.containsKey(keys[start])) {
					if(request.get(keys[start]).equals("")){
						throw new Exception(keys[start]+" Should not be empty");
					}
				}else {
					throw new Exception(keys[start]+" is missing");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Error is "+e.getMessage());// Handling Excpetions 
		}
		return status;
	}
}