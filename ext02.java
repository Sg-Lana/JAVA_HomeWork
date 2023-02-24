/*Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5: входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000 */

package homework;
import java.util.Scanner; //Получение данных из терминала

public class ext02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите число а - ");
       int a = sc.nextInt();
       System.out.println("Введите число b - ");
       int b = sc.nextInt();
       sc.close();   
    }

    static double factor(int a, int b) {
        double result = 1;
        if (a == 0) return 0;    
        if ((b % 2 == 0) && (b >= 0)) {
            for (int i = 0; i < b / 2; i++) {
                result *= a;
            }
            result *= result;
            return result;
        } else if ((b % 2 != 0) && (b > 0)) {
            b = b - 1;
            for (int i = 0; i < b / 2; i++) {
                result *= a;
            }
            result = (result * result) * a;
            return result;
        } else if (b < 0) {
            for (int i = 0; i > b; i--) {
                result *= a;
            }
            result = 1 / result;
            return result;
        }
        return 0;
    }
}
