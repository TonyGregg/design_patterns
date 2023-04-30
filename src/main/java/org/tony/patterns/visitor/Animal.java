package org.tony.patterns.visitor;

public interface Animal {

  public String getName();
  public int getAge();
  // other Animal-specific methods...
  public void accept(AnimalVisitor visitor);

}
