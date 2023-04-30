package org.tony.patterns.visitor;

import lombok.Data;

/**
 * Created on Sat, 4/29/23 at 10:49 PM by Genil.
 */
@Data
public class Lion implements Animal {
    private String name;
    private int age;
    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // other lion-specific methods...
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

}
