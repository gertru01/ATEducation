package ru.gertru;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Homework1 {
    public static void main(String[] args) {
        String regionName = "Санкт-Петербург ";
        System.out.println("Строка: \"" + regionName + "\"");

        int result = regionName.length();
        System.out.println("Кол-во символов в строке: " + result);

        boolean result1 = regionName.isEmpty(); // возвращает true, если переменная содержит пустое значение или null
        System.out.println("Строка пустая? - " + result1);

        boolean result2 = regionName.isBlank(); // возвращает true, если переменная содержит пустое значение, null  или содержит только сиволы множества white space (пробел, табуляция, перенос строки и т.д.)
        System.out.println("Строка пустая или только сиволы множества white space? - " + result2);

        String result3 = regionName.substring(5,6); // Извлечение подстроки по индексам начального и конечного символов
        System.out.println("6й сивол в строке: \"" + result3 + "\"");

        int result4 = regionName.indexOf('е'); //Возвращается индекс первого найденного символа 'е' в строке
        System.out.println("Индекс первого символа 'е': " + result4);

        int result5 = regionName.lastIndexOf('е'); //Возвращается индекс последнего найденного символа 'е' в строке
        System.out.println("Индекс последнего символа 'е': " + result5);

        String result6 = regionName.toLowerCase(); // Перевод строки в нижний регистр
        System.out.println("Строка в нижнем регистре: \"" + result6 + "\"");

        String result7 = regionName.toUpperCase(); // Перевод строки в верхний регистр
        System.out.println("Строка в верхнем регистре: \"" + result7 + "\"");

        String result8 = regionName.replace("Санкт-Петербург", "Питер"); // Заменяется выбранная подстрока на новую
        System.out.println("Замена подстроки на новую: \"" + result8 + "\"");

        boolean result9 =  regionName.startsWith("г. "); // Проверка, начинается ли строка с указанной подстроки
        System.out.println("Строка начинается с подстроки \"г. \"? - " + result9);

        boolean result10 = regionName.endsWith(" "); // Проверка, заканчивается ли строка указанной подстрокой
        System.out.println("Строка заканчивается подстрокой \" \"? - " + result10);

        String result11 = regionName.repeat(2); // Возвращает строку повторенную n раз, если n = 0, возвращает пустую строку, если n < 0, возвращает ошибку
        System.out.println("Строка, повторенная два раза: \"" + result11 + "\"");

        boolean result12 = regionName.contains("Санкт"); // Проверяет, встречается ли в строке переданная последовательность символов
        System.out.println("Строка содержит последовательность сиволов \"Санкт\"? - " + result12);

        String result13 = regionName.concat("город"); // Добавление к строке переданного значения
        System.out.println("Строка + \"город\": \"" + result13 + "\"");

        String result14 = regionName.trim(); // Удаление начальные и конечные пробелы
        System.out.println("Строка без начальных и конечных пробелов: \"" + result14 + "\"");

        boolean result15 = regionName.equals("Санкт-Петербург"); // Проверка равенства строк
        System.out.println("Эта строка равна строке \"Санкт-Петербург\"? - " + result15);
    }
}
