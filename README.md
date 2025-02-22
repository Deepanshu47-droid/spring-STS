🚀 UC5 - REST API: Greeting with Path Variable & Query Parameter (PUT Request)

This guide helps you set up and test a Spring Boot REST API that accepts a first name as a Path Variable and a last name as a Query Parameter in a PUT request.

📌 Steps to Implement UC5

✅ Step 1: Create a Spring Boot Project

🔹 Use Spring Initializr or your IDE to create a new project.

🔹 Add the Spring Web dependency if not already added.


✅ Step 2: Modify the Controller

🔹 Update the REST controller to handle PUT requests.

🔹 Modify the endpoint to accept:


First Name as a Path Variable ({firstName})

Last Name as a Query Parameter (?lastName=Taylor)

🔹 Return a personalized greeting message.

✅ Step 3: Build and Run the Application

🔹 Use Maven (mvn spring-boot:run) or your IDE to start the application.

🔹 Ensure the server starts successfully on port 8080.

🛠 Step 4: Testing the API

Since this is a PUT request, you cannot test it in a browser. Instead, you need to use Postman or cURL.



1️⃣ Test Using Postman 📬

If you have Postman installed, follow these steps:

Open Postman.

Create a new request.

Select PUT from the dropdown.

Enter the API URL:

http://localhost:8080/hello/put/Mark?lastName=Taylor

Click "Send".

Check the Response Body:

Expected response:


Hello Mark Taylor from BridgeLabz!

Status Code: 200 OK

2️⃣ Test Using cURL (Command Line / Terminal) 🖥️

If you don’t have Postman, you can use cURL to test the API from your terminal or command prompt:

🔹 Run the following command:

curl -X PUT "http://localhost:8080/hello/put/Mark?lastName=Taylor" -w "\n"

🔹 Expected Output:

Hello Mark Taylor from BridgeLabz!

✅ Step 5: Verify the Output

If everything is correct, your API should return:

Hello Mark Taylor from BridgeLabz!

If you get an error:

🔹 Check if the server is running.

🔹 Verify the endpoint URL.

🔹 Look at the console logs for errors.

🔹 Ensure that you're using a PUT request, not GET or POST.