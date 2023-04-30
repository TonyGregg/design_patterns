package org.tony.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on Sat, 4/29/23 at 11:04 PM by Genil.
 */
public class Zoo {
  private List<Animal> animals = new ArrayList<>();

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public int getTotalFeedingCost() {
    FeedingCostVisitor visitor = new FeedingCostVisitor();
    for (Animal animal : animals) {
      animal.accept(visitor);
    }
    return visitor.getTotalCost();
  }

  public static void main(String[] args) {
    Animal elephant = new Elephant("Jumbo", 10);
    Animal lion = new Lion("Simba", 5);
    Animal giraffe = new Giraffe("Gerry", 7);
    Zoo zoo = new Zoo();
    zoo.addAnimal(elephant);
    zoo.addAnimal(lion);
    zoo.addAnimal(giraffe);
    zoo.addAnimal(new Elephant("Jumbo2", 10));
    zoo.addAnimal(new Lion("Simba2", 5));
    System.out.println("Total cost: " + zoo.getTotalFeedingCost());
  }

}
