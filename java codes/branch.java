import java.util.Scanner;
public class branch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a code: ");
        String code = sc.nextLine();
        switch(code){
            case "1":
                System.out.println("CSE");
                break;
            case "2":
                System.out.println("IT");
                break;
            case "3":
                System.out.println("ECE");
                break;
            default:
                System.out.println("Invalid code");
        }
    }
}
