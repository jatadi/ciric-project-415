<h1>Bookshelf Management Application</h1>

This is a library application project built using Spring Boot and deployed on Kubernetes. The project consists of the following microservices:

•__book-service__: microservice responsible for managing books using CRUD operations on in-memory repository of books

•	__bookshelf-service__: microservice responsible for managing bookshelfs containing book details using CRUD operations and RestTemplate

The bookshelf-service calls the book-service using a REST call to get bookshelves with all books inside of them.

 
<h2>Languages and Frameworks</h2>

•	Java

•	Maven

•	MySQL

<h2>Setup</h2>


Clone this repository to your local machine.

Navigate to the root directory of the project.

Build the Docker images for all microservices by running the docker build command.

Deploy the microservices by using the command:

kubectl apply -f ./

once inside the kubernetes directory.

<h2>Modules</h2>


The application consists of the following modules:

•	Book search and display

•	Rating and review system

•	Posting and getting books to a bookshelf

•	Searching books and bookshelfs with IDs

<h2>Accessing the Microservices</h2>


After the microservices have been deployed, you can access them using the following curls:

book-service:

POST http://<external_ip>/book

example entries:

`{
        "id": 1,
        
         "name": "1984",
         
         "year": 1949,
         
         "author": "George Orwell",
         
          "rating": 9,
         
          "bookshelfId": 1
}`

`{

"id": 3,

"name": "Post Office",

"year": 1971,

"author": "Charles Bukowski",

"rating": 10,

"bookshelfId": 3

}`

GET http://<external_ip>/book

GET http://<external_ip>/book/bookId

bookshelf-service:

http://<external_ip>/bookshelf

POST http://<external_ip>/bookshelf

example entries:

`{

	“id”: “1”,
	
	“floor”: “2”
	
}`


GET http://<external_ip>/bookshelf

GET http://<external_ip>/bookshelf/{bookshelfId}

GET http://<external_ip>/bookshelf/withBooks




The following picture illustrates the architecture of the application:

![useremtiseuzivotprojekteprokleti](https://github.com/jatadi/ciric-project-415/assets/119642721/fc58b423-7619-4b64-9931-1a172c85b5b1)

