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

}
