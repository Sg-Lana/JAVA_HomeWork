//Написать программу вычисления n-ого треугольного числа

package homework;

import java.util.Scanner; //Получение данных из терминала

import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

public class ext01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число- ");
        int a = iScanner.nextInt();
        iScanner.close();
    }
    


    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1)+ num;
    }
}