🚀 UC4 - REST API: Greeting with JSON Body (POST Request)

This guide helps you set up and test a Spring Boot REST API that accepts a name in the request body (JSON format) and responds with a personalized greeting.


📌 Steps to Implement UC4

✅ Step 1: Create a Spring Boot Project

🔹 Use Spring Initializr or your IDE to create a new project.

🔹 Add the Spring Web dependency if not already added.

✅ Step 2: Modify the Controller

🔹 Update the REST controller to handle POST requests.

🔹 Create a UserDTO class to receive firstName and lastName from the request body.

🔹 Modify the endpoint to accept a JSON body and return a personalized greeting.



✅ Step 3: Build and Run the Application

🔹 Use Maven (mvn spring-boot:run) or your IDE to start the application.

🔹 Ensure the server starts successfully on port 8080.



🛠 Step 4: Testing the API

Since this is a POST request, you cannot test it in a browser. Instead, you need to use Postman or cURL.


1️⃣ Test Using Postman 📬

If you have Postman installed, follow these steps:

Open Postman.

Create a new request.

Select POST from the dropdown.

Enter the API URL:

http://localhost:8080/hello/post

Go to the "Body" tab → Select raw → Choose JSON format.

Enter this JSON data:

{
  "firstName": "Deepanshu",
  "lastName": "Malviya"
}

Click "Send".

Check the Response Body:

Expected response:

Hello Deepanshu Malviya from BridgeLabz!

Status Code: 200 OK

2️⃣ Test Using cURL (Command Line / Terminal) 🖥️

If you don’t have Postman, you can use cURL to test the API from your terminal or command prompt:

🔹 Run the following command:

curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Deepanshu", "lastName": "Malviya"}' "http://localhost:8080/hello/post" -w "\n"

🔹 Expected Output:

Hello Deepanshu Malviya from BridgeLabz!

✅ Step 5: Verify the Output

If everything is correct, your API should return:

Hello Deepanshu Malviya from BridgeLabz!

If you get an error:

🔹 Check if the server is running.

🔹 Verify the endpoint URL.

🔹 Look at the console logs for errors.

🔹 Ensure that the request body is in valid JSON format.

