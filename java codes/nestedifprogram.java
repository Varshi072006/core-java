import java.util.Scanner;
public class nestedifprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>=20){
            if (num>20){
                System.out.println("Condition1");
            }
            System.out.println("Condition2");
        
        }
    }   
    
}
