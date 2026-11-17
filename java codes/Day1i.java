import java.util.*;
public class Day1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        int age= sc.nextInt();
        char grade= sc.next().charAt(0);
        String result=sc.next();
        long Total_marks= sc.nextLong();
        double percentage= sc.nextDouble();
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
        System.out.println("Total Marks: " + Total_marks);
        System.out.println("Percentage: " + percentage);
    }
}
