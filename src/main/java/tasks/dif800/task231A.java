package tasks.dif800;
/*
        A. Команда
        Однажды трое лучших друзей Петя, Вася и Тоня решили создать команду и участвовать в соревновании по программированию.
        Обычно на соревнованиях по программированию участникам предлагается несколько задач.
        Еще перед началом друзья договорились, что они будут реализовывать задачу,
        если как минимум двое из них придумали и уверены в решении, в противном случае ребята не будут писать решение этой задачи.

        На этом соревновании организаторы предложили n задач.
        Для каждой задачи известно, кто из друзей придумал и уверен в ее решении. Помогите друзьям найти количество задач,
        по которым они будут писать решение.

        Входные данные
        В первой строке входных данных записано единственное целое число n (1 ≤ n ≤ 1000)
        — количество задач на соревновании. Далее в n строках записано по три целых числа,
         каждое из которых равно 0 или 1. Если первое число в строке равно 1,
         то Петя уверен в решении этой задачи, в противном случае он не уверен в решении.
         Второе число обозначает мнение Васи, а третье — мнение Тони. Числа в строках разделены пробелами.

        Выходные данные
        Выведите единственное целое число — количество задач, которые друзья будут реализовывать на соревновании.

        Примеры
        входные данные
        3
        1 1 0
        1 1 1
        1 0 0
        выходные данные
        2
        входные данные
        2
        1 0 0
        0 1 1
        выходные данныеСкопировать
        1
*/


import java.util.Scanner;

public class task231A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int taskDo = 0;
        for (int i = 0; i < count; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += scanner.nextInt();
            }
            if (sum > 1) {
                taskDo++;
            }
        }
        System.out.println(taskDo);
    }
}