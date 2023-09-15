package SeminarsOOP.VendingMachine.Domen;
/**
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
Задача со *: Разработать интерфейс для VendingMachines на JFrame. В интерфейсе отобразить добавленные в main продукты(ListBox).
Поле ввода наличности и кнопку "купить товар"! Все необходимые дополнительные методы класса VendingMachines и Product добавить самостоятельно.

 */
public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "Product: price=" + super.getPrice() + "; name=" + super.getName() + "; temperature=" + this.temperature;
    }

}
