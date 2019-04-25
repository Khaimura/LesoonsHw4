package com.Khaimura;

public class Student extends Employee {
    private String group;
    private int studentRecordOfCredits;


    public Student(String name, String lastName, int age, Gender gender, String group, int studentRecordOfCredits) {
        super(name, lastName, age, gender);
        this.group = group;
        this.studentRecordOfCredits = studentRecordOfCredits;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentRecordOfCredits() {
        return studentRecordOfCredits;
    }

    public void setStudentRecordOfCredits(int studentRecordOfCredits) {
        this.studentRecordOfCredits = studentRecordOfCredits;
    }


    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "group='" + group + '\'' +
                ", studentRecordOfCredits='" + studentRecordOfCredits + '\'' +
                '}';
    }
}
