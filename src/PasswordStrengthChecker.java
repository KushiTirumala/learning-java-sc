import java.util.Scanner;
public class PasswordStrengthChecker
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password:");
        String password=sc.nextLine();
        int pw=0;
        if(password.length()>=8) {
            pw++;
        }
        if(password.contains(".*[A-Z]*")) {
            pw++;
        }
        if(password.contains(".*[a-z]*")){
            pw++;
        }
            switch (pw) {
                case 3:
                    System.out.println("strong");
                    break;
                case 2:
                    System.out.println("medium");
                    break;
                case 1:
                    System.out.println("weak");
                    break;
                default:
                    System.out.println("Very weak");
            }
        sc.close();

        }
    }

