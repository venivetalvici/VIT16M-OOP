public class MyTest {
    public static void main(String[] args) {
        Article art1 = new Article(
                "Достопримечательности Берлина",
                "Текст статьи"
        );
        Article art2 = new Article("Достопримечательности Потсдама", "Текст");
        System.out.println(art1.title);
        System.out.println(art2.announce);
        // Создали конструктор с параметрами

        Article art3 = new Article(13,
                "Самая главная статья в мире",
                "Я памятник воздвиг себе нерукотворный"
        );
        System.out.println(art3.title);
    }
}