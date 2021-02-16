public class Swan {
    String name;
    String color;
    int id;
    int age;

    public void toDisplay() {
        System.out.println(
                "Имя лебедя " + name + "\n" +
                        "Цвет лебедя " + color + "\n"+
                        "Возраст лебедя " + age);
    }
}