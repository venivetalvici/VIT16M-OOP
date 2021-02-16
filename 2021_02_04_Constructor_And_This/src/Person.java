public class Person {
    String firstname;
    String lastname;
    int passportID;
    String date;
    boolean marriageStatus;
    int children;
    String gender;
    // enum;

    public Person(int personID,
                  String personFN,
                  String personLN,
                  String personGender,
                  boolean personMstatus,
                  int personChildren) {

        firstname = personFN;
        lastname = personLN;
        passportID = personID;
        marriageStatus = personMstatus;
        children = personChildren;
        gender = personGender;
    }

    public Person(String personFN, int personID) {
        firstname = personFN;
        passportID = personID;
    }


    public Person(String personFN, int personID, String personGender, boolean marriageS) {
        firstname = personFN;
        passportID = personID;
        gender = personGender;
        marriageStatus = marriageS;
    }

    public void toDisplay() {
        System.out.println(marriageStatus ? "Интересен" : "Скучный");
        System.out.println("Пол пользователя: " + gender);
        System.out.println("Имя пользователя: " + firstname);
    }
}

class PersonTest {
    public static void main(String[] args) {
        try2();
        Person javaCoder = new Person("Ilon", 100, "m", true);
        javaCoder.toDisplay();
    }

    private static void try2() {
    }

    private static void telran() {
        Person student1 = new Person("Ganna", 1);
        System.out.println(student1.firstname);
        Person student2 = new Person("Natalia", 2);
        Person student3 = new Person("Ekaterina", 3);
        Person student4 = new Person("Anastasia", 4);


        Person[] group = new Person[]{student1, student2, student3, student4};
        System.out.println(group[2].firstname);
        System.out.println(group[2]);
        System.out.println(group);
    }
}