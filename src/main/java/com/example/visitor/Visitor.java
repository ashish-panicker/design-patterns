package com.example.visitor;

/**
 * Visitor - interface that defines the mthods that needs to be visited
 */

public interface Visitor {
  void visitCircle(Circle circle);

  void visitRectangle(Rectangle rectangle);
}

/**
 * Concrete Visitor - implementation of the Visitor and defines seperate
 * operations
 */
class DrawingVisitor implements Visitor {
  @Override
  public void visitCircle(Circle circle) {
    System.out.println("Drawing circle with radius: " + circle.getRadius());
  }

  @Override
  public void visitRectangle(Rectangle rectangle) {
    System.out
        .println("Drawing rectangle with length:" + rectangle.getLength()
            + " and bread: " + rectangle.getBreadth());
  }
}

class ColouringVistor implements Visitor {
  @Override
  public void visitCircle(Circle circle) {
    System.out.println("Colouring circle with " + circle.getColour());
  }

  @Override
  public void visitRectangle(Rectangle rectangle) {
    System.out.println("Colouring rectangle with " + rectangle.getColour());
  }
}
