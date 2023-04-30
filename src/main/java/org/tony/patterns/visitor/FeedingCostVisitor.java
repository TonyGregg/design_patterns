package org.tony.patterns.visitor;

/**
 * Created on Sat, 4/29/23 at 11:02 PM by Genil.
 */
public class FeedingCostVisitor implements AnimalVisitor {
    private int totalCost = 0;

    @Override
    public void visit(Elephant elephant) {
        totalCost += 100;
    }

    @Override
    public void visit(Lion lion) {
        totalCost += 80;
    }

    @Override
    public void visit(Giraffe giraffe) {
        totalCost += 50;
    }

    public int getTotalCost() {
        return totalCost;
    }

}
