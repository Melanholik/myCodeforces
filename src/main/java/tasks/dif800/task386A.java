package tasks.dif800;
/*
A. Аукцион второй цены
ограничение по времени на тест1 секунда
ограничение по памяти на тест256 мегабайт
ввод стандартный
вывод стандартный вывод
В этой задаче мы рассмотрим один из вариантов проведения аукциона,
который носит название аукцион второй цены. Как и в любом аукционе,
n участников стремятся приобрести выставляемый на аукцион товар,
предлагая за него свои цены. Будем считать, что участники пронумерованы целыми числами от 1 до n.
Аукцион является закрытым, то есть каждый участник тайно сообщает организатору аукциона цену,
которую он готов заплатить за товар. После этого победителем аукциона становится участник,
предложивший наибольшую цену. Однако уплачивает он не ту цену, которую предложил,
а наибольшую цену среди предложенных другими участниками (отсюда и название — аукцион второй цены).
Напишите программу, которая по списку цен, предложенных участниками аукциона,
определяет победителя аукциона и сумму, которую он заплатит за товар. Считайте, что все предложенные цены различны.

Входные данные
В первой строке записано целое число n (2 ≤ n ≤ 1000) — количество участников аукциона.
Вторая строка содержит n целых чисел p1, p2, ... pn, разделенных одиночными пробелами (1 ≤ pi ≤ 10000).
Число pi означает цену, предложенную участником с номером i. Гарантируется, что все предложенные цены различны.

Выходные данные
В единственной строке выходного файла выведите два целых числа,
разделенных пробелом: номер участника, победившего в аукционе,
и сумму, которую он должен уплатить.

Примеры
входные данныеСкопировать
2
5 7
выходные данныеСкопировать
2 5
входные данныеСкопировать
3
10 2 8
выходные данныеСкопировать
1 8
входные данныеСкопировать
6
3 8 2 9 4 14
выходные данныеСкопировать
6 9
*/


import java.util.Scanner;

public class task386A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int maxPrice = -1;
        int secondPrice = -2;
        int indexPeople = 0;
        for (int i = 0; i < count; i++) {
            int price = scanner.nextInt();
            if (price > maxPrice) {
                secondPrice = maxPrice;
                maxPrice = price;
                indexPeople = i + 1;
            } else if (price > secondPrice) {
                secondPrice = price;
            }
        }
        System.out.println(indexPeople + " " + secondPrice);
    }
}
