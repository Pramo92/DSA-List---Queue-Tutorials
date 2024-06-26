# DSA-List---Queue-Tutorials
01. You are developing an order management system for an online store. The system is responsible for handling incoming orders, processing them, updating their status, and providing order status to customers. You'll be using the List and Queue data structures to efficiently manage orders and their processing.
   
Order Details:

Order Number Customer Name Order Details Status

101 &emsp; &emsp; &emsp; &emsp; Nimal  &ensp; &emsp; &emsp; Product A &emsp;  Processing

102 &emsp; &emsp; &emsp; &emsp; Kamala  &emsp; &emsp; &emsp; Product B &emsp;  Pending

103 &emsp; &emsp; &emsp; &emsp; Sunil &emsp; &emsp; &emsp; &emsp; Product C &emsp;  Processing

104 &emsp; &emsp; &emsp; &emsp; Amal &emsp; &emsp; &emsp; &emsp; Product D &emsp;  Pending

105 &emsp; &emsp; &emsp; &emsp; Nayana  &emsp; &emsp; &emsp; Product D &emsp;  Processing

a. Who placed the first order in the system?

b. How many orders are currently being processed?

c. Implement a method named processNextOrder that dequeues the next order from the processing queue and updates its status to "Processed" in the order list.

d. Design a function called printOrderStatus that takes an order number as input and prints the current status of that order.

e. Develop a method named cancelOrder that cancels an order by updating its status to "Canceled" in the order list.

02) You are developing a library management system to help manage the library's collection of books and patron requests. The system should allow librarians to track book information, process book checkouts and returns, and manage patron requests. You will use the List data structure to store book details and the Queue data structure to manage patron requests.
   
Book Details:

Book Id Book Title  &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; Available Copies Number of times Burrowed

B101 &emsp; Introduction to Programming  &emsp; 5 &emsp; &emsp; &emsp; &emsp; &emsp; 0

B102 &emsp; History of Science &emsp; &emsp; &emsp; &emsp; &emsp; 4 &emsp; &emsp; &emsp; &emsp; &emsp; 0

B103 &emsp; The Lord of the Rings &emsp; &emsp; &emsp; &emsp; 6 &emsp; &emsp; &emsp; &emsp; &emsp; 0

B104 &emsp; Jane Eyre &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; 7 &emsp; &emsp; &emsp; &emsp; &emsp; 0

B105 &emsp; David Copperfield &emsp; &emsp; &emsp; &emsp; &emsp;1 &emsp; &emsp; &emsp; &emsp; &emsp; 0

patron request list.
Book Id Book Title Number 
of 
requests
B101 Introduction to Programming 2
B102 History of Science 1
B103 The Lord of the Rings 4
B104 Jane Eyre 0
B105 David Copperfield 0
Guidelines:
• Initialize a List to store book details.
• Initialize a Queue to manage patron requests.
• Implement a method to add books to the collection, where each book is inserted 
into the List.
• Implement a method to process patron requests by dequeuing requests from the 
Department of Statistics & Computer Science, University of 
Kelaniya 
Academic Year – 2021/2022
COSC 21063/BECS 21223/ COST 44233
Data Structures & Algorithms
Practical Tutorial 06
2
request Queue and updating book availability.
• Create a method to find the available copies of a specific book by examining the 
book list.
• Implement a method to find the most borrowed book by analyzing the request 
history.
• Design the processNextRequest method to dequeue a request, update book 
availability, and update the request list.
• Develop the printBookAvailability function to find a book by title and print its 
available copies.
Note: You can create a Book class to encapsulate book details and methods required for this 
scenario.
Questions:
a. How many copies of the book "Introduction to Programming" are available for 
checkout?
b. What is the most borrowed book (has the highest number of requests) in the library?
c. Implement a method named processNextRequest that dequeues the next patron request 
from the request queue and updates the available copies of the requested book.
d. Design a function called printBookAvailability that takes a book title as input and 
prints the current available copies of that book

f. Create a method named printOrderStatusAfterCancellation that prints the status of an order after it has been canceled.
