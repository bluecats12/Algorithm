package Q4;
import java.util.Scanner;

public class q4 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("input A");
        int A = scanIn.nextInt();
        System.out.println("input B");
        int B = scanIn.nextInt();
        System.out.println("input C");
        int C = scanIn.nextInt();
        if (A >= B && A >= C) {
            System.out.println("Max valu A");

        } else if (B >= A && B >= C) {
            System.out.println("Max valu B");

        } else {
            System.out.println("Max valu C");
        }

    }

}
