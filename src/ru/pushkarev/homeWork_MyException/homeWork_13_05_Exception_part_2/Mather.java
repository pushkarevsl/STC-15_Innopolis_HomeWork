package ru.pushkarev.homeWork_MyException.homeWork_13_05_Exception_part_2;

/**
 * Написать программу "воспитанный ребенок".
 * <p>
 * Программа должна имитировать поведение воспитанного ребенка, которого мама кормит вкусной или невкусной едой.
 * Если еда не нравится, ребенок ее не ест: выбрасывается исключительная ситуация, которая обрабатывается «мамой».
 * Воспитанный ребенок, даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.
 * <p>
 * Создать перечисление «Еда» с несколькими вариантами еды: морковь, яблоко, каша и т.д.
 * Создать класс «ребенок» с методом «кушать», принимающий на вход некоторую еду. В методе происходит сравнение
 * поступившей еды с вкусовыми предпочтениями и в случае если они не совпадают, выбрасывается исключение.
 * «Одобренная» ребенком еда съедается: возвращается сообщение «съел … за обе щеки».
 * Вне зависимости съел ребенок еду или выплюнул, ребенок благодарит маму, печатая в консоль «спасибо, мама».
 * Создать главный класс и метод main - это будет «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения ребенка.
 */
/*
1. Создаем класс Mother -main :
- метод eat, принимающий на вход еду из enum;
- сравниваем еду с предпочтениями ребенка, если нет то выбрасывается исключение.
2. Child:
- ребенок благодарит маму, печатая в консоль «спасибо, мама».
enum Food
 */

public class Mather {

    public static void main(String[] args) {

    }

    public static void eat() {

    }
}
