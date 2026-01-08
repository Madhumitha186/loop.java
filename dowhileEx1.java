import java.util.Scanner;

class demo{
    public static void main(String args[])
    {

    Scanner scan = new Scanner(System.in);
    

    int count = 0;
    do{
        System.out.println("Enter the number > 10:");
        count = scan.nextInt();
        count++ ; 
    }
    while(count<10);
    }
}