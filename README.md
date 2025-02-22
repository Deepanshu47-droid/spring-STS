🚀 UC1 - REST API: Hello from BridgeLabz
This guide helps you set up and test a simple Spring Boot REST API that responds with a greeting message.

📌 Steps to Implement UC1
✅ Step 1: Create a Spring Boot Project
🔹 Set up a new Spring Boot project using Spring Initializr or your IDE.
🔹 Add the Spring Web dependency.

✅ Step 2: Define a Controller
🔹 Create a REST controller that handles GET requests.
🔹 Implement an endpoint to return "Hello from BridgeLabz!".

✅ Step 3: Build and Run the Application
🔹 Use Maven (mvn spring-boot:run) or your IDE to start the application.
🔹 Ensure the server starts successfully and listens on port 8080.

🛠 Step 4: Testing the API
Once your application is running, you can test the API in different ways:

1️⃣ Test Using a Web Browser 🌐
🔹 Open Google Chrome, Edge, or Firefox.
🔹 Enter the following URL in the address bar:

http://localhost:8080/hello
🔹 Expected Output: The browser should display:
      Hello from BridgeLabz!
      
🔹 If the browser downloads a file instead of displaying text, open it with Notepad or try using Postman.

2️⃣ Test Using Postman 📬
If you have Postman installed, follow these steps:

Open Postman.
Create a new request.
Select GET from the dropdown.
Enter the API URL:

    http://localhost:8080/hello
Click "Send".
Check the Response Body:
Expected response:

    Hello from BridgeLabz!
Status Code: 200 OK
3️⃣ Test Using cURL (Command Line / Terminal) 🖥️
If you don’t have Postman, you can use cURL to test the API from your terminal or command prompt:

🔹 Run the following command:

curl -X GET http://localhost:8080/hello -w "\n"

🔹 Expected Output:
    Hello from BridgeLabz!
    
✅ Step 5: Verify the Output
If everything is correct, your API should return:

    Hello from BridgeLabz!
If you get an error:
🔹 Check if the server is running.
🔹 Verify the endpoint URL.
🔹 Look at the console logs for errors.
