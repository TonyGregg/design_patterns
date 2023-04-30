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

## 2. Command Pattern.
The command pattern is a behavioral design pattern that allows you to encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
In this pattern, you create a separate object called the Invoker that receives the command object and invokes the command. 
The invoker object then forwards the request to the appropriate object, called the Receiver, which performs the actual work.

Here's an example of how to implement the Command Pattern in Java:

Let's say we have a light switch that can be turned on and off. We want to be able to turn the light on and off using a remote control, but we don't want to have to modify the light switch's code to add this functionality. Instead, we can use the Command Pattern.

We create a Command interface that has methods to execute and undo the command.

We then create ConcreteCommand classes that implement the Command interface. For example, we can create a class called LightOnCommand that turns the light on

The LightOnCommand class takes a Light object in its constructor and implements the execute() and undo() methods. The execute() method calls the turnOn() method on the Light object, and the undo() method calls the turnOff() method on the Light object.

We then create an Invoker class that takes a Command object in its constructor and has a method called executeCommand() that calls the execute() method on the Command object.

Finally, we create a Receiver class that has a method called turnOn() that turns the light on and a method called turnOff() that turns the light off.

The RemoteControl class takes a Command object in its setCommand() method and invokes the execute() method on it in its pressButton() method. The pressUndo() method calls the undo() method on the Command object.

We can then use the Command Pattern to turn on the light: