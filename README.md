🚀 UC3 - REST API: Greeting with Path Variable

This guide helps you set up and test a Spring Boot REST API that accepts a name as a path variable and responds with a personalized greeting.

📌 Steps to Implement UC3

✅ Step 1: Create a Spring Boot Project

🔹 Use Spring Initializr or your IDE to create a new project.

🔹 Add the Spring Web dependency if not already added.


✅ Step 2: Modify the Controller

🔹 Update the REST controller to handle GET requests with a path variable.

🔹 Modify the endpoint to accept a name in the URL path and return a personalized greeting.

✅ Step 3: Build and Run the Application

🔹 Use Maven (mvn spring-boot:run) or your IDE to start the application.

🔹 Ensure the server starts successfully on port 8080.

🛠 Step 4: Testing the API

Once your application is running, you can test the API in different ways:


1️⃣ Test Using a Web Browser 🌐

🔹 Open Google Chrome, Edge, or Firefox.

🔹 Enter the following URL in the address bar:

http://localhost:8080/hello/param/Deepanshu

🔹 Expected Output: The browser should display:

Hello Deepanshu from BridgeLabz!

🔹 If the browser downloads a file instead of displaying text, open it with Notepad or try using Postman.

2️⃣ Test Using Postman 📬

If you have Postman installed, follow these steps:


Open Postman.

Create a new request.

Select GET from the dropdown.

Enter the API URL:

http://localhost:8080/hello/param/Deepanshu

Click "Send".

Check the Response Body:

Expected response:

Hello Deepanshu from BridgeLabz!

Status Code: 200 OK

3️⃣ Test Using cURL (Command Line / Terminal) 🖥️

If you don’t have Postman, you can use cURL to test the API from your terminal or command prompt:



🔹 Run the following command:


curl -X GET "http://localhost:8080/hello/param/Deepanshu" -w "\n"

🔹 Expected Output:

Hello Deepanshu from BridgeLabz!

✅ Step 5: Verify the Output

If everything is correct, your API should return:

Hello Deepanshu from BridgeLabz!

If you get an error:

🔹 Check if the server is running.

🔹 Verify the endpoint URL.

🔹 Look at the console logs for errors.
