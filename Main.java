package reverse.hack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("Enter resultant number: ");
        int res = sc.nextInt();
        GetInput ip = new GetInput();
        ip.game(num1,num2,num3,num4,res);
    }
}
