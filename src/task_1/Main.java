package task_1;

/*
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), колір(String).
Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
*/

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.age = 3;
        ford.color = "blue";
        System.out.println("Рік = " + ford.age + ", Колір = " + ford.color);

        Car bmw = new Car(5);
        bmw.color = "black";
        System.out.println("Рік = " + bmw.age + ", Колір = " + bmw.color);

        Car tesla = new Car(1, "white");
        System.out.println("Рік = " + tesla.age + ", Колір = " + tesla.color);



    }
}