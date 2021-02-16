package de.telran.application;

import de.telran.data.Student;

/**
 * 16M-OOP
 * 11 11 : 49
 */
public class StartMyLovelyApplicationOld {
    public static void main(String[] args) {
        Student vasyaPupkin = new Student();
        Student sergej = new Student();
        Student varvara = new Student();
        Student afdofia = new Student(
                "Афдофья",
                "Ивановна",
                18);
/*        System.out.println(vasyaPupkin.toDisplay());
        System.out.println();
        System.out.println(vasyaPupkin.age);
        System.out.println();
        System.out.println(afdofia.toDisplay());*/
        // 1

        Student[] groupTUBerlin = new Student[]{vasyaPupkin, sergej, varvara, afdofia};
        /*System.out.println(group[3].age);*/
        // 2

        studentsPrint(groupTUBerlin);
    }

    public static void studentsPrint(Student[] group) {

        for (int i = 0; i < group.length ; i++) {
            System.out.println(group[i].toDisplay());
        }
    }
}