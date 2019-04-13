package ru.pushkarev.task2;


/*
Создать консольное Java-приложение «Горячо-Холодно»
1. Вначале программа «загадывает» случайное число от 1 до 100.
2. Пользователь вводит с консоли число.
3. Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно»,
   И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее
4. Для первого ввода пользователя считаем предыдущим введенным числом 0.
5. Предусмотреть возможность выхода из игры до отгадывания числа.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
План решения
1.  Через хз какой метод, рандомный выбор числа от 1 до 100
2.  Введите число
    Через Баффер ввод с консоли
3. Короче делим 100 попполам и смотрим если от 0 до 50 то...., если от50 до 100 то...., и так для каждый
   отрезок делим пополам

*/
public class TaskWithStar {
    public static void main(String[] args) throws IOException {
        int rnd = (int) (Math.random() * 100 + 1);
        System.out.println(rnd); //вывел для себя, чтоб знать и ориентироваться

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от 1 до 100");

        int val = Integer.parseInt(reader.readLine());



    }
}


