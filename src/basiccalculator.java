import java.util.Scanner;
public class basiccalculator
{
    public static void main(String[] args)
    {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=input.nextInt();
        System.out.println("Enter operator:+,-,*,/");
        char operator=input.next().charAt(0);
        System.out.println("Enter second number:");
        double n2=input.nextDouble();
        double result;
        if(operator=='+'|| operator=='-'||operator=='*'||operator=='/')
        {
            switch(operator) {
                case '+':
                    result = n1 + n2;
                    System.out.println("Sum is:" + result);
                    break;
                case '-':
                    result = n1 - n2;
                    System.out.println("Difference is:" + result);
                    break;
                case '*':
                    result = n1 * n2;
                    System.out.println("Product is:" + result);
                    break;
                case '/':
                    result = n1 / n2;
                    System.out.println("Quotient is:" + result);
                    break;
            }

        }
        else
        {
            System.out.println("eRROR");
        }
            input.close();

    }
    }

