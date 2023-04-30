package org.tony.patterns.visitor;

import lombok.Data;

/**
 * Created on Sat, 4/29/23 at 10:59 PM by Genil.
 */
@Data
public class Giraffe implements Animal {

  private String name;
  private int age;

  public Giraffe(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void accept(AnimalVisitor visitor) {
    visitor.visit(this);
  }
  // other giraffe-specific methods...
}
