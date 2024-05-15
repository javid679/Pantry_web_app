# Pantry Web App

## Introduction

### Purpose
The Pantry Web App helps the pantry maintain and manage products available in the pantry inventory. It also allows customers to choose and reserve up to 15 products online through the website.

### Scope
- Build an application through which customers can create a new account and link it to the pantry database.
- Allow customers to log in to their accounts and reserve up to 15 products in their cart for online orders.
- Provide a dashboard of products for clients created by the Pantry/Admin.
- Enable customers to add, view, update, and delete products in their cart.
- Allow Admin/Manager to manage the inventory of products.
- Facilitate customers in collecting their products at the reserved time slot.

## Software Interfaces

- **Frontend:** React
- **Backend:** Spring (JAVA)
- **Server:** MySQL Database hosted in a Linux environment

## Requirements

### Functional Requirements

#### User Registration
- **Input:** Users fill out a new user registration form to create an account.
- **Process:**
  - Enter username
  - Enter password
  - Confirm password
  - Authenticate email address by adding OTP to the popup window
- **Output:** New customer registration form is filled out and submitted.

#### Login
- **Input:** Customer enters email address and password to log in to their account.
- **Process:**
  - Enter email address
  - Enter password
- **Output:** Customer is authenticated and logged in to their account.

#### Product Dashboard Creation (Admin)
- **Input:** Admin is given privileges to add, delete, update, and view products shown on the dashboard to customers.
- **Process:**
  - Admin logs in with super user credentials
  - Admin manages the pantry inventory
- **Output:** Dashboard is generated with updated products for end users.

#### Product Cart Creation
- **Input:** Users manage the products in their cart.
- **Process:**
  - Click the add to cart button
  - Proceed to checkout with items in the cart
  - Click cart icon to update or delete products
- **Output:** Products added to the cart are viewed on the checkout page.

#### Reserve Order
- **Input:** Customer schedules the pickup of items in the cart by reserving items for a time.
  - Select time from combo box to reserve the order
- **Output:** Reservation is confirmed, and a reservation ID is given to the user.

### Non-Functional Requirements

#### Security
- Only customers with login credentials can access the website.
- Only users with the admin role can create and manage products on the dashboard.

#### Performance
- The web application’s load time should not exceed 5 seconds.

#### Usability
- The web application’s interface must be user-friendly and easy to navigate.

#### Reliability
- Users should access the product without failure.

#### Availability
- Users can add products on the web app at any time throughout the week.
- In case of unplanned system downtime, all features will be available within a few minutes.

#### Environmental
- Admin or manager can track the availability of items and products ordered by customers at any time.

## Screenshots

### User Registration Page
![User Registration](https://github.com/javid679/Pantry_web_app/blob/main/Pantry_web_app/screenshoots/WhatsApp%20Image%202022-12-10%20at%2014.44.05%20(6).jpeg?raw=true)

### Login Page
![Login Page](https://github.com/javid679/Pantry_web_app/blob/main/Pantry_web_app/screenshoots/WhatsApp%20Image%202022-12-10%20at%2014.44.05%20(1).jpeg?raw=true)

### Product Dashboard 
![Product Dashboard](https://github.com/javid679/Pantry_web_app/blob/main/Pantry_web_app/screenshoots/WhatsApp%20Image%202022-12-10%20at%2014.44.05%20(17).jpeg?raw=true)

### Product Cart Creation
![Product Cart](https://github.com/javid679/Pantry_web_app/blob/main/Pantry_web_app/screenshoots/WhatsApp%20Image%202022-12-10%20at%2014.44.05%20(21).jpeg?raw=true)

