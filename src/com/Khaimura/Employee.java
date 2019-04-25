package com.Khaimura;

public class Employee {


    private String name;
    private int age;
    private Gender gender;
    private String lastName;


    public Employee(String name, String lastName, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lastName = lastName;
        // printGender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public enum Gender {
        M, F, UNKNOWN
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


