package Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int go = 0;
        while(go == 0) {
            System.out.println("Enter first Number: ");
            int a = sc.nextInt();
            System.out.println("Enter second Number: ");
            int b = sc.nextInt();
            System.out.println("Which operation would you like to perform");
            int operator = sc.nextInt();
            long result = 1;

            switch (operator) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Invalid Division");
                    } else {
                        System.out.println(a / b);
                    }
                    break;
                case 5:
                    if (b == 0) {
                        System.out.println();
                    } else {
                        System.out.println(a % b);
                    }
                    break;
                case 6:
                    int base = sc.nextInt();
                    int exponent = sc.nextInt();
                    while (exponent != 0) {
                        result *= base;
                        --exponent;
                    }
                    System.out.println("Answer = " + result);
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
            System.out.println("Do you want to continue");
            go = sc.nextInt();
        }
            System.out.println("Thank you for using simple calculator");
    }
}
