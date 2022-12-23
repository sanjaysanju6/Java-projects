package org.example;
//subclass
public class Student extends Human{
    private int rollNo;

   private double marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getPercent(){
        return (marks/100)*100;
    }

//method Overriding
   public void write(){
    System.out.println("I am writing exam");
    }

    //method overriding
    public void write(String assign){
        System.out.println("Im writing an assignment");
    }
}
