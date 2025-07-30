import java.util.Scanner;
public class fakelogindetect
{
    public static void main(String[] args)
{
    String correctUserName= "K";
    String correctPassword= "K123";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter UserName:");
    String UserName=sc.nextLine();
    System.out.println("Enter Password:");
    String Password= sc.nextLine();
    if(Password==correctPassword && UserName==correctUserName ){
        System.out.println("Login successfull");
    }
    else{
        System.out.println("Login Failed!");
    }
    sc.close();
}
}
