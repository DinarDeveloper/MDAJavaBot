package answers;

public class HomeWork2Answers {
    public static String getAnswer() {
        return """
                Задание 2.3 курс Java
                1  Дано число минут, переведите в часы, в дни и недели
                30 –> 0.5 -> 0.0208333 -> 0.00297619
                Тут нужно лишь посчитать сколько минут в часе, дне, недели.

                2  Найти максимальное из трех чисел
                В помощь приходит if else, a>b & a>c => a = max и т.д.
                Есть способ более эстетичнее – Max.math, но с if else нужно решить обязательно
                http://proglang.su/java/numbers-max

                3  Дано число n, распечатайте треугольник из символов @
                n = 1
                @
                n = 2
                @
                @@
                n = 3
                @
                @@
                @@@
                Можно использовать Scanner, if else, for – логику реализации можете придумать свою,
                главное чтобы результат соответствовал  ТЗ.

                4  Посчитать сумму четных чисел строго меньше заданного числа
                https://clck.ru/gcose\s
                a.\tИспользуйте цикл for
                 https://javarush.ru/groups/posts/for-v-java
                http://proglang.su/java/loop-for\s
                      b. Используйте цикл while
                http://developer.alexanderklimov.ru/android/java/while.php\s

                5  Дано число, для всех чисел > 0 и <= n распечатайте “Ho” если число делится на 3 без остатка,
                 “Go” если делится на 5 без остатка и “HoGo” если делится на 3 и 5
                https://vertex-academy.com/tutorials/ru/delenie-po-modulyu-v-java/\s

                6  Факториалом числа называется произведение всех чисел больше 1 и меньше-равно самому числу,
                (n!) = 1 * 2 * 3 * 4 * ... * n. Напишите программу нахождения факториала данного числа
                https://javarush.ru/groups/posts/2797-faktorial-v-java-programmirovanii\s
                a.\tИспользуйте for цикл
                b.\tИспользуйте while цикл
                c.\tИспользуя рекурсию
                https://clck.ru/gcp4i\s

                7 Посчитать количество цифр в числе. Пример (123) – 3, (123456) – 6, (100) – 3
                https://clck.ru/gcp6x\s
                """;
    }
}
