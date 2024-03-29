package tasks.dif1000;

// Театральная площадь

// Театральная площадь в столице Берляндии представляет собой прямоугольник n×m метров. По случаю очередного юбилея города,
// было принято решение о замощении площади квадратными гранитными плитами. Каждая плита имеет размер a×a.
// Какое наименьшее количество плит понадобится для замощения площади? Разрешено покрыть плитами большую поверхность,
// чем театральная площадь, но она должна быть покрыта обязательно. Гранитные плиты нельзя ломать или дробить,
// а разрешено использовать только целиком. Границы плит должны быть параллельны границам площади.

// Входные данные
// В первой строке записано три целых натуральных числа n,m и a (1 ≤ n,m,a ≤ 109).
// Выходные данные
// Выведите искомое количество плит.
// Примеры
// входные данные
// 6 6 4
// выходные данныe
// 4

import java.util.Scanner;

public class task1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println((long) (Math.ceil((double) n / a) * Math.ceil((double) m / a)));
    }
}
