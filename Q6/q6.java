package Q6;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int sum =1;
        int a = scanIn.nextInt();
        scanIn.close();
        for(int i = 1; i<=a; i++){
            sum = sum*i;
        }
        System.out.println(sum);
    }
    
}
