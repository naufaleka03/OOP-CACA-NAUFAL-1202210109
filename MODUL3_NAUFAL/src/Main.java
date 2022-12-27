import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Calculation calculate = new Calculation();
        boolean repeat = true;
        int menu;
        double side;
        double radius;
        double base;
        double upper;
        double height;
        do {
            System.out.println("==Menu Program==\n1. Square\n2. Circle\n3. Trapezoid");
            System.out.print("Select menu: ");
            menu = input.nextInt();
            try {
                switch(menu) {
                    case 1:
                        System.out.print("Enter the length of the side of the Square: ");
                        side = input.nextFloat();
                        break;
                    case 2:
                        System.out.print("Enter the radius of the Circle: ");
                        radius = input.nextFloat();
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of the Trapezoid: ");
                        base = input.nextFloat();
                        System.out.print("Enter the upper side of the Trapezoid: ");
                        upper = input.nextFloat();
                        System.out.print("Enter the height of the Trapezoid: ");
                        height = input.nextFloat();
                        break;
                    case 0:
                        System.out.println("Program selesai");
                    default:
                        System.out.println("Option not available");
                        continue;
                }
                repeat = false;

            } catch(InputMismatchException e) {
                System.out.println("Input must be a number");
            } catch(IllegalArgumentException e) {
                System.out.println("Input must be a number");
            } catch(InterruptedException e) {
                System.out.println("Input must be a number");
        }
    } while(repeat);
        input.close();
    }
}
