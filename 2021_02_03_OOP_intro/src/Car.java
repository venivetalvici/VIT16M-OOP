public class Car {
    int wheels = 4;
    int mileAge;
    String color;
    String carID;
    int doors;
    String brandName;
    String label;
    boolean registration;

    public void move(int distance){
        System.out.println("Поехали");
        mileAge += distance;
        //mileAge = mileAge + distance; тоже самое что и 12 строчка
    }
    public void displayInfo(){
        System.out.println("количество колёс " + wheels);
        System.out.println("километраж " + mileAge);
        System.out.println("цвет " + color);
        System.out.println("номер двигателя " + carID);
        System.out.println("количество дверей " + doors);
        System.out.println("Название марки " + brandName);
        System.out.println("Название модели " + label);
        System.out.println("Регистрация " + registration);
    }

}

class TestCar{
        public static void main (String[] args){
            Car car = new Car();
            Car toyota = new Car();
            Car porsche = new Car();
            //System.out.println(porsche.brandName);
            //System.out.println(porsche.doors);
            System.out.println(porsche.registration);
            porsche.move(1200);
            porsche.displayInfo();
}

}