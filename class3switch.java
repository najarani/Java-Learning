import java.util.Scanner;

public  class class3switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case  1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namasete");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid number");
        }

    }
}