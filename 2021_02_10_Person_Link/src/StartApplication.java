public class StartApplication {
    public static void main(String[] args) {
        // SPA
        Person p1 = new Person("Andrej", 18, 100);
        Person p2 = new Person("Merkel", 28, 101);
        Person p3 = new Person("Лёша", 38, 102);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        Person p4 = p1;
        p4.firstName = "Сергей";
        System.out.println(p1.firstName);
        System.out.println(p4);

        Person p5 = new Person();
        p5 = p1;
        p5.firstName = "Света";
        System.out.println(p1.firstName);
    }
}
