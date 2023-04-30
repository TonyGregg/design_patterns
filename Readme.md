# Important 18 design patterns every developer should know

This project consists of 18 key design patterns that every developer should know. 

## 1. Visitor Pattern.

The Visitor Pattern is a design pattern in Java that allows you to separate the algorithms that operate on data structures from the data structures themselves. This pattern can be useful when you have a complex data structure that you want to apply various algorithms to without modifying the structure's code.

Here's an example of how to implement the Visitor Pattern in Java:

Let's say we have a simple program that models a zoo, and we have a number of different animals in our zoo. We want to be able to calculate the total feeding cost of all the animals in our zoo, but we don't want to modify the code of each animal's class to add this functionality. Instead, we can use the Visitor Pattern.

First, we create an interface for the visitor, which defines the methods that will be used to visit each of the different animal types:
refer AnimalVisitor.java

Next, we modify each Animal class to accept a visitor object.

Now we can create a visitor class that implements the AnimalVisitor interface and performs the calculation we want:
refer FeedingCostVisitor.java

Finally, we can create a Zoo class that contains a list of animals and uses the visitor to calculate the total feeding cost:

## 2. Momento Pattern.
// TODO: Create classes for the Momento Pattern in package pattern.momento
