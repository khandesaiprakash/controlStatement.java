import java.util.Scanner;
public class rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rank:");
        int number = sc.nextInt();
        switch(number) {
            case 1:
            System.out.println("You are passed the exsam in first place");
            break;
            case 2:
            System.out.println("You are passed the exsam in second place");
            break;
            case 3:
            System.out.println("you are passed the exsam in third place");
            break;
            case 4:
            System.out.println("you are passed the exsam average marks");
            break;
            case 5:
            System.out.println("you are jest passed the exsam");
            break;
            default:
            System.out.println("you are not passed the exsam");
        }
    }
}