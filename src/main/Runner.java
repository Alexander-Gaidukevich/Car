package main;

import beans.Car;

/*
1.Создать класс базовый класс Car, от него наследуются 2 класса ToyotaCar и MersedesCar.
  Car имеет поля cost, color,volume. ToyotaCar - добавляется поле марка.MersedesCar не добавляет полей.
2.Реализовать метод getDiscountCost() возвращающий стоимость со скидкой.
  В классе Car скидка 10%. ToyotaCar - 20%. MersedesCar - 50 %. Сответсвенно переопределяешь метод в потомках.
  Создать по 2 объекта на каждый класс. Вывести полную инфу по всем полям каждого объекта.
  И также стоимость со скидкой каждой машины.
 */
public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Black",3.5,5000);
        System.out.println(Car.getDiscountCost());
    }
}
