package com.Khaimura;

import com.Khaimura.Exception.MyExeption;

import java.util.Arrays;

public class Group {

    private Student[] st = new Student[10];

    public void addStudent(Student student) throws MyExeption {

        if (student == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < st.length; i++) {
            if (st[i] == null) {
                st[i] = student;
                return;
            }
        }
        throw new MyExeption();
    }

    public boolean deleteStudent(long cardNumber) {

        for (int i = 0; i < st.length; i++) {
            if (st[i] != null && st[i].getStudentRecordOfCredits() == cardNumber) {
                st[i] = null;
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(String lastName) {

        for (Student student : st) {
            if (student != null && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }


    public int compare(Student st1, Student st2) {
        if (st1 != null && st2 == null) {
            return 1;
        }
        if (st1 == null && st2 != null) {
            return -1;
        }
        if (st1 == null && st2 == null) {
            return 0;
        }
        return st1.getLastName().compareTo(st2.getLastName());
    }

    @Override
    public String toString() {
        return "Group{" +
                "st=" + Arrays.toString(st) +
                '}';
    }

    public Student[] getVoencom() {
        int n = 0;
        for (Student student : st) {
            if (student != null && student.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] armyArray = new Student[n];
        int i = 0;
        for (Student student : this.st) {
            if (student != null && student.getAge() >= 18) {
                armyArray[i++] = student;
            }
        }
        return armyArray;
    }
}

