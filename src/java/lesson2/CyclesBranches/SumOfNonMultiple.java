package lesson2.CyclesBranches;

import org.w3c.dom.ls.LSOutput;

public class SumOfNonMultiple {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (n <= 100) {
            if ((n % 3) == 0) {
                n++;
                continue;
            } else {
                sum+=n;
                System.out.println("Числа не кратные " + 3 + " :  " + n);
            }
            n++;
            }
        System.out.println("Сумма чисел не кратных " + 3 + " равно  " + sum);
}
}