package de.telran.dao;

import de.telran.data.Student;

/**
 * 16M-OOP
 * 11 12 : 31
 */
public class Group {
    public Student[] students;
    public int size;

    public Group(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public boolean addStudent(Student student) {
        if (size < students.length) {
            students[size] = student;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteStudentFromGroup(Student person) {
        // equals
        for (int i = 0; i < size; i++) {
            if (students[i].equals(person)) {
                // нам надо удалить итый
                // нам надо перетянуть последний элемент в дырку
                // нам надо уменьшить размер
                // что делать с последним-ненужным больше элемент
                //1
                //students[i] = null;
                students[i] = students[size - 1];
                //students[size-1] = null;  на ваш выбор.
                // будет работать и так и так. так как это после SIZE
                size--;
                return true;
            }
        }


        return false;
    }
}