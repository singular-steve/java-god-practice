package ch10;

public class Inheritance {
  public static void main(String[] args) {
    Inheritance inheritance = new Inheritance();

    inheritance.objectCast();
    inheritance.objectCast2();
    inheritance.callPrintNames();
  }

  public void objectCast() {
    System.out.println("===objectCast===");

//    Parent parent = new Parent();
    Child child = new Child();

    Parent parent2 = child;
//    Child child2 = (Child) parent;
    Child child2 = (Child) parent2;
  }

  public void objectCast2() {
    System.out.println("===objectCast2===");

    Parent[] parentArray = new Parent[3];
    parentArray[0] = new Child();
    parentArray[1] = new Parent();
    parentArray[2] = new Child();

    for (Parent tempParent : parentArray) {
      if (tempParent instanceof Child) {
        System.out.println("Child");
        Child tempChild = (Child) tempParent;
        tempChild.printAge();
      } else if (tempParent instanceof Parent) {
        System.out.println("Parent");
      }
    }
  }

  public void callPrintNames() {
    System.out.println("===callPrintNames===");

    Parent parent1 = new Parent();
    Parent parent2 = new Child();
    Parent parent3 = new ChildOther();

    parent1.printName();
    parent2.printName();
    parent3.printName();
  }
}
