package com.Khaimura;

import com.Khaimura.Exception.MyExeption;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Group gr = new Group();
        try {
            gr.addStudent(new Student("Max", "Orlov", 20, Employee.Gender.M, "DOT-21", 111));
            gr.addStudent(new Student("Roma", "Belov", 17, Employee.Gender.M, "DOT-11", 112));
            gr.addStudent(new Student("Olga", "Shevchenko", 18, Employee.Gender.F, "DOT-21", 113));
            gr.addStudent(new Student("Mariya", "Lozova", 20, Employee.Gender.F, "DOT-21", 114));
            gr.addStudent(new Student("Max", "Kruz", 20, Employee.Gender.M, "DOT-21", 115));
            gr.addStudent(new Student("Liza", "Orlova", 20, Employee.Gender.F, "DOT-21", 116));
            gr.addStudent(new Student("Taras", "Lobov", 20, Employee.Gender.M, "DOT-11", 117));
            gr.addStudent(new Student("Vasya", "King", 19, Employee.Gender.M, "DOT-21", 118));
            gr.addStudent(new Student("Henri", "lirn", 19, Employee.Gender.M, "DOT-21", 119));

        } catch (MyExeption e) {
            System.out.println(e.getMessage());

        }
        System.out.println(gr);

        System.out.println(gr.deleteStudent(5473241));


        Student[] armyArray = gr.getVoencom();
        for (Student student : armyArray) {
            System.out.println("army" + student);
        }
    }
}
