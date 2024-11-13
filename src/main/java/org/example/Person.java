package org.example;

public class Person {
    String firstName,lastName,eyeColor;
    int age;
    double weight,height;
    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName, String lastName, int age, String eyeColor, double weight, double height) {
        this(firstName,lastName,age);
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

}
