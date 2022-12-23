package org.example;

public class School {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setRollNo(5);
        obj.setName("sanjay");
        obj.setMarks(75);
        obj.setAge(25);
        obj.write();
        obj.write("assignment");

        System.out.println(obj.getName());

        double percent = obj.getPercent();
        System.out.println(percent);

        Teacher obj1 = new Teacher();
        obj1.seteId(33);
        obj1.setAge(56);
        obj1.setName("Ravi");
        obj1.setSalary(400000);
        obj1.write();

        int asal= obj1.annualSalary();
        System.out.println(asal);

    }
}
