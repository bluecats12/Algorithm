package Q8;

import java.util.Scanner;

public class q8 {public static void main(String[] args) {
        int sum1While = 0;
        int num1 = 10;
        System.out.print("8.1) Sequence (while): ");
        while (num1 >= 1) {
            System.out.print(num1 + " ");
            sum1While += num1;
            num1--;
        }
        System.out.println("\nSum = " + sum1While);
        int sum1For = 0;
        System.out.print("8.1) Sequence (for): ");
        for (int num1For = 10; num1For >= 1; num1For--) {
            System.out.print(num1For + " ");
            sum1For += num1For;
        }
        System.out.println("\nSum = " + sum1For);
        int sum2While = 0;
        int num2 = 1;
        System.out.print("8.2) Sequence (while): ");
        while (num2 <= 19) {
            System.out.print(num2 + " ");
            sum2While += num2;
            num2 += 2;
        }
        System.out.println("\nSum = " + sum2While);
        int sum2For = 0;
        System.out.print("8.2) Sequence (for): ");
        for (int num2For = 1; num2For <= 19; num2For += 2) {
            System.out.print(num2For + " ");
            sum2For += num2For;
        }
        System.out.println("\nSum = " + sum2For);
        int sum3While = 0;
        int num3 = 1;
        int sign = 1;
        System.out.print("8.3) Sequence (while): ");
        while (num3 <= 19) {
            System.out.print(num3 * sign + " ");
            sum3While += num3 * sign; 
            sign = -sign;
            num3 += 2;
        }
        System.out.println("\nSum = " + sum3While);
        int sum3For = 0;
        int signFor = 1;
        System.out.print("8.3) Sequence (for): ");
        for (int num3For = 1; num3For <= 19; num3For += 2) {
            System.out.print(num3For * signFor + " ");
            sum3For += num3For * signFor;
            signFor = -signFor; 
        }
        System.out.println("\nSum = " + sum3For);
    }
}
