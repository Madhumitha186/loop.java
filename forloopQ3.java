import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the a:");
        int a = scan.nextInt();

        System.out.println("Enter the b:");
        int b = scan.nextInt();
        {
          for (int i=a;i<=b;i++)
          {
            
            System.out.println(i);
          }  
        }
    }
}