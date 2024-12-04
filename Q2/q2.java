package Q2;
import java.util.Scanner;
public class q2 {
    public String getGreeting() {
    return "Hello World!";
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Input your score: ");
    int score = scanner.nextInt();
    
    String grade;
    
    if (score >= 80 && score <= 100) {
        grade = "A";
    } else if (score >= 70 && score < 80) {
        grade = "B";
    } else if (score >= 60 && score < 70) {
        grade = "C";
    } else if (score >= 50 && score < 60) {
        grade = "D";
    } else if (score >= 0 && score < 50) {
        grade = "F";
    } else {
        grade = "Invalid score";
    }
    
    System.out.println("Your grade is " + grade);
    
    scanner.close();
}
}



