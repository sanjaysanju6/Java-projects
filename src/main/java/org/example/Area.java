package org.example;
// Encapsulation
class Area {
    int length;
    int breadth;


    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void getArea(){
        int area = length* breadth;
        System.out.println("area:"+ area);
    }
}
class Main{
    public static void main(String[] args) {
      Area rec = new Area(3,5);
      rec.getArea();
    }

}