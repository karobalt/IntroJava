package com.company;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private double BMI;


    // Constructor - A constructor is a utility that allows us to
    // create instances of objects

    // Method/ Constructor overloading -> This is a way to define multiple constructors or methods
    //  with the same name but they must have different method/constructor signatures.

    // Method/Constructor signatures -> This is the number and data type of the parameters and
    // the order in which those parameters are defined.


    public Person() {

    }
    public Person (String name, int age, double height, double weight){
        this.name = name;
        this.age= age;
        this.height = height;
        this.weight = weight;
    }

    // Getter -  allow us read data from the class
    // setter - allow us write data to the class

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge () {
        return age;
    }
    public void changeAge () {
        age++;
    }
    public double personBMI (){
        BMI = weight/(height*height);
        return BMI;
    }


}
