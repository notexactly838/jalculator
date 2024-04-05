import java.util.*;

public class cliCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator 0.0.1");
        System.out.println("1 - Addition, 2 - Subtraction, 3 - Multiplication, 4 - Division, 5 - Area Finder");

        Scanner command=new Scanner(System.in); System.out.println("Enter Operation: ");

        int comm = command.nextInt();

        if (comm == 1) {
            System.out.println("You have Chosen Addition");

            System.out.println("First Number: ");
            Scanner n1 = new Scanner(System.in);
            double num1 = n1.nextDouble();

            System.out.println("Second number: ");
            Scanner n2 = new Scanner(System.in);
            double num2 = n2.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is: " + sum);
        }
        else if (comm == 2) {
            System.out.println("You have chosen Subtraction");

            System.out.println("First Number: ");
            Scanner n1 = new Scanner(System.in);
            double num1 = n1.nextDouble();

            System.out.println("Second number: ");
            Scanner n2 = new Scanner(System.in);
            double num2 = n2.nextDouble();

            double sum = num1 - num2;

            System.out.println("The difference is: " + sum);
        }
        else if (comm == 3) {
            System.out.println("You have chosen Multiplication");

            System.out.println("First Number: ");
            Scanner n1 = new Scanner(System.in);
            double num1 = n1.nextDouble();

            System.out.println("Second number: ");
            Scanner n2 = new Scanner(System.in);
            double num2 = n2.nextDouble();

            double sum = num1 * num2;
            double truncated = Math.floor(sum * 100) / 100;

            System.out.println("The multiple is: " + truncated);
        }
        else if (comm == 4) {
            System.out.println("You have chosen Division");

            System.out.println("First Number: ");
            Scanner n1 = new Scanner(System.in);
            double num1 = n1.nextDouble();

            System.out.println("Second number: ");
            Scanner n2 = new Scanner(System.in);
            double num2 = n2.nextDouble();

            double sum = num1 / num2;
            double truncated = Math.floor(sum * 100) / 100;

            System.out.println("The quotient is: " + truncated);
        }
        else if (comm == 5) {
            System.out.println("Area Finder");
            System.out.println("1 - Rectangle, 2 - Triangle/Rhombus, 3 - Rhombus");

            System.out.println("Area of Which Figure: ");
            Scanner aOf = new Scanner(System.in);
            double areaOf = aOf.nextDouble();

            if (areaOf == 1) {
                System.out.println("Area of Rectangle/Square");
                System.out.println("Length:");
                Scanner l = new Scanner(System.in);
                double length = l.nextDouble();

                System.out.println("Breadth:");
                Scanner b = new Scanner(System.in);
                double breadth = b.nextDouble();

                double area = length * breadth;

                System.out.println("Area is " + area);
            }
            else if (areaOf == 2) {
                System.out.println("Area of Triangle/Rhombus");

                System.out.println("Base/Diagonal 1:");
                Scanner b = new Scanner(System.in);
                double base = b.nextDouble();

                System.out.println("Height/Diagonal 2:");
                Scanner h = new Scanner(System.in);
                double height = h.nextDouble();

                double area = base * height * 0.5;

                System.out.println("Area is " + area);
            }
            else if (areaOf == 3) {
                System.out.println("Area of Parallelogram");

                System.out.println("Base:");
                Scanner b = new Scanner(System.in);
                double base = b.nextDouble();

                System.out.println("Height:");
                Scanner h = new Scanner(System.in);
                double height = h.nextDouble();

                double area = height * base;

                System.out.println("Area is " + area);
            }

        }

    }
}
