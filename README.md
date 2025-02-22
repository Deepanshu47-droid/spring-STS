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
----------------------------------------------------------------------------------------------------------------------------------------------------


🚀 UC2 - REST API: Greeting with Query Parameter

This guide helps you set up and test a Spring Boot REST API that accepts a name as a query parameter and responds with a personalized 
greeting.

📌 Steps to Implement UC2

✅ Step 1: Create a Spring Boot Project



🔹 Use Spring Initializr or your IDE to create a new project.

🔹 Add the Spring Web dependency if not already added.


✅ Step 2: Modify the Controller
🔹 Update the REST controller to handle GET requests with a query parameter.

🔹 Modify the endpoint to accept a name parameter and return a personalized greeting.



✅ Step 3: Build and Run the Application

🔹 Use Maven (mvn spring-boot:run) or your IDE to start the application.

🔹 Ensure the server starts successfully on port 8080.


🛠 Step 4: Testing the API

Once your application is running, you can test the API in different ways:



1️⃣ Test Using a Web Browser 🌐
🔹 Open Google Chrome, Edge, or Firefox.

🔹 Enter the following URL in the address bar:


http://localhost:8080/hello/query?name=Deepanshu

🔹 Expected Output: The browser should display:


Hello Deepanshu from BridgeLabz!

🔹 If the browser downloads a file instead of displaying text, open it with Notepad or try using Postman.


2️⃣ Test Using Postman 📬

If you have Postman installed, follow these steps:


Open Postman.

Create a new request.

Select GET from the dropdown.

Enter the API URL:

http://localhost:8080/hello/query?name=Deepanshu

Click "Send".

Check the Response Body:

Expected response:

Hello Deepanshu from BridgeLabz!


Status Code: 200 OK

3️⃣ Test Using cURL (Command Line / Terminal) 🖥️

If you don’t have Postman, you can use cURL to test the API from your terminal or command prompt:

🔹 Run the following command:

curl -X GET "http://localhost:8080/hello/query?name=Deepanshu" -w "\n"

🔹 Expected Output:

Hello Deepanshu from BridgeLabz!

✅ Step 5: Verify the Output

If everything is correct, your API should return:

Hello Deepanshu from BridgeLabz!

If you get an error:

🔹 Check if the server is running.

🔹 Verify the endpoint URL.

🔹 Look at the console logs for errors.
----------------------------------------------------------------------------------------------------------------------------------------------------

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

----------------------------------------------------------------------------------------------------------------------------------------------------

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


----------------------------------------------------------------------------------------------------------------------------------------------------

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
