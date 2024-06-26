# DSA-List---Queue-Tutorials
01. You are developing an order management system for an online store. The system is responsible for handling incoming orders, processing them, updating their status, and providing order status to customers. You'll be using the List and Queue data structures to efficiently manage orders and their processing.
   
Order Details:

Order Number Customer Name Order Details Status

101 &emsp; &emsp; &emsp; &emsp; Nimal &emsp; &emsp; &emsp; &emsp; Product A &emsp;  Processing

102 &emsp; &emsp; &emsp; &emsp; Kamala  &emsp; &emsp; &emsp; Product B &emsp;  Pending

103 &emsp; &emsp; &emsp; &emsp; Sunil &emsp; &emsp; &emsp; &emsp; Product C &emsp;  Processing

104 &emsp; &emsp; &emsp; &emsp; Amal &emsp; &emsp; &emsp; &emsp; Product D &emsp;  Pending

105 &emsp; &emsp; &emsp; &emsp; Nayana &ensp; &emsp; &emsp; &emsp; Product D &emsp;  Processing
a. Who placed the first order in the system?
b. How many orders are currently being processed?
c. Implement a method named processNextOrder that dequeues the next order from the 
processing queue and updates its status to "Processed" in the order list.
d. Design a function called printOrderStatus that takes an order number as input and 
prints the current status of that order.
e. Develop a method named cancelOrder that cancels an order by updating its status to 
"Canceled" in the order list.
f. Create a method named printOrderStatusAfterCancellation that prints the status of an 
order after it has been canceled.
