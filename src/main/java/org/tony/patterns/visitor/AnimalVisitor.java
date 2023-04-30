package org.tony.patterns.visitor;

public interface AnimalVisitor {

    public void visit(Elephant elephant);
    public void visit(Lion lion);

    public void visit(Giraffe giraffe);


}
