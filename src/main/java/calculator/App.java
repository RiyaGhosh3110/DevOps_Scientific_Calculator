package calculator;
import java.util.*;
public class App
{
    public static void main(String args[])
    {
        int choice, flag=0;
        double num1 = 0,num2 =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculator");
        do {
            System.out.println("1 for Square root function - √x\n2 for Factorial function - x!\n3 for Natural logarithm (base е) - ln(x)\n4 for Power function - x^b\n");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            if (choice > 4 || choice <1) {
                flag = 1;
                System.out.println("Invalid choice, exiting\n");
            }
            else if (choice>=1 && choice<=3) {
                System.out.println("Enter the number");
                num1 = scan.nextDouble();
            }
            else if(choice == 4)
            {
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = scan.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = scan.nextDouble();
            }

                 switch(choice) {
                 case 1: System.out.println(num1  +" Square Root : "+SquareRoot(num1));
                 		break;
                 case 2: System.out.println(num1+" Factorial : "+Factorial(num1));
                 		break;
                 case 3: System.out.println(num1+" Natural logarithm: "+ Logarithm(num1));
                 		break;
                 case 4: System.out.println(num1+" power "+num2+" = "+Power(num1, num2));
                		break;
                default: System.out.println("Exiting, Bye");
                flag=1;
            }
            System.out.println("\n");
            }while(flag==0);
    }
    
    static double SquareRoot(double a) {
    	return Math.sqrt(a);
    }
    static double Factorial(double a) {

    	return (a == 1 || a == 0) ? 1 : a * Factorial(a - 1);
    }
    static double Logarithm(double a) {
    	return Math.log(a);
    }
    static double Power(double a, double b) {
    	return Math.pow(a, b);
    }
}