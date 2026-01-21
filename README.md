# Java Programming Examples

This repository contains simple Java programs that demonstrate basic Java concepts, including class structure, ArrayList, and LinkedList usage.

---

## 1. Hello World Java Program

**Description:**  
A simple Java program that demonstrates the basic structure of a Java application. The program begins execution from the `main` method and prints a message to the console.

**Program Overview:**  
- Defines a class named `HelloWorld`  
- Includes the `main` method, which serves as the entry point of the program  
- Uses `System.out.println()` to display text in the terminal  

**Purpose:**  
- Understand how a Java class is created  
- Learn how the `main` method works  
- Print output to the console  

**Output:**  
Hello, World


---

## 2. Java ArrayList Sorting Program

**Description:**  
Demonstrates how to store numbers in an `ArrayList`, sort them in ascending order, and display the sorted result.

**Program Overview:**  
- Creates an `ArrayList` to store integer values  
- Adds multiple numbers to the list  
- Sorts the list using `Collections.sort()`  
- Prints each sorted number using a loop  

**Key Concepts Used:**  
- `ArrayList` from `java.util`  
- `Collections` class for sorting  
- Enhanced for loop for iteration  

**Purpose:**  
- Learn how to use `ArrayList` in Java  
- Understand sorting using `Collections.sort()`  
- Iterate through a collection and print values  

**Output:**  
8
12
15
20
33
34


---

## 3. Java LinkedList Program

**Description:**  
Demonstrates the use of a `LinkedList` to store and manage string elements. Shows how to add elements at specific positions and traverse the list.

**Program Overview:**  
- Creates a `LinkedList` of `String` values  
- Adds elements to the list  
- Inserts an element at a specific index  
- Displays the list using a for loop  
- Displays the list again using an enhanced for-each loop  

**Key Concepts Used:**  
- `LinkedList` from `java.util`  
- Adding elements and inserting at a specific index  
- Accessing elements using index-based iteration  
- Iterating using for-each loop  

**Purpose:**  
- Understand how `LinkedList` works in Java  
- Learn different ways to traverse a `LinkedList`  
- See how insertion at a specific position affects the list  

**Output:**  
Welcome to Java Programming
Welcome to Java Programming

---

## 4. Java Stack Program

**Description:**  
Demonstrates the use of the Stack class in Java to store integer values and perform stack operations following the Last In, First Out (LIFO) principle.

**Program Overview:**  
- Creates a Stack of Integer values 
- Pushes multiple elements onto the stack 
- Uses a while loop to check if the stack is empty
- Removes and prints elements using the pop() method

**Key Concepts Used:**  
- Stack class from java.util  
- Stack operations: push(), pop(), isEmpty()
- LIFO data structure
- Looping through stack elements

**Purpose:**  
- Understand how Stack works in Java
- Learn basic stack operations
- Observe LIFO behavior during element removal

**Output:**  
4
3
2
1

---

## 5. Java Queue Program (PriorityQueue)

**Description:**  
Demonstrates the use of a Queue in Java using the PriorityQueue class. Shows how elements are added, displayed, and removed from the queue.

**Program Overview:**  
- Creates a Queue of String values using PriorityQueue
- Adds elements to the queue
- Displays the queue contents
- Removes a specific element using remove()
- Displays the queue after removal

**Key Concepts Used:**  
- Queue interface from java.util
- PriorityQueue implementation
- Queue operations: add(), remove()
- Automatic ordering in PriorityQueue

**Purpose:**  
- Learn how Queue works in Java
- Understand PriorityQueue behavior
- Practice basic queue operations

**Output:**  
[20, 50, 30]
After Remove: [30, 50]