
package third;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 1st Number: ");
            String temp1 = scanner.nextLine();
            int a = Integer.parseInt(temp1);
            System.out.print("Enter 2nd Number: ");
            String temp2 = scanner.nextLine();
            int b = Integer.parseInt(temp2);
            System.out.print("Enter 1 for Summation, 2 for Subtraction, 3 for Multiplication, 4 for Division: ");
            String temp3 = scanner.nextLine();
            int c = Integer.parseInt(temp3);
            switch (c) {
                case 1:
                    System.out.println("Summation: " + (a+b));
                    break;
                case 2: {
                    if (a > b)
                        System.out.println("Subtraction: " + (a-b));
                    if (b > a)
                        System.out.println("Subtraction: " + (b-a));
                    break;
                }
                case 3:
                    System.out.println("Multiplication: " + (a*b));
                    break;
                case 4:
                    System.out.println("Division: " + (a/b));
                    break;
            }
        }
    }