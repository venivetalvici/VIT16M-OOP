package de.telran.application;

import de.telran.dao.Group;
import de.telran.data.Student;

/**
 * 16M-OOP
 * 11 12 : 57
 */
public class MyStart {
    public static void main(String[] args) {
        Group group17 = new Group(5);
        Student sasha = new Student("Sasha", "Ivanow", 30);
        group17.addStudent(sasha);
        System.out.println(group17.size);
        Student dasha = new Student("Dasha", "Чижикова", 25);
        System.out.println(group17.addStudent(dasha));
        System.out.println(group17.size);
        Student glasha = new Student("Глаша", "Васильева", 35);
        System.out.println(group17.addStudent(glasha));
        System.out.println(group17.size);
        Student masha = new Student("Маша", "Ковалёва", 40);
        System.out.println("Добавление студента: " + group17.addStudent(masha));

        // удаление
        System.out.println("Удаление студента: " + group17.deleteStudentFromGroup(sasha));
        System.out.println(group17.size);
        System.out.println(group17.students[0].firstName);
    }
}