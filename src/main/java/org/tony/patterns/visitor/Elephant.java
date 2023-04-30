package org.tony.patterns.visitor;

import lombok.Data;

/**
 * Created on Sat, 4/29/23 at 10:58 PM by Genil.
 */
@Data
public class Elephant implements Animal{
    private String name;
    private int age;
    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
    // other elephant-specific methods.

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }


}
