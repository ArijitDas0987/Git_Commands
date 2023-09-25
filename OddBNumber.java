import java.util.Scanner;

public class OddBNumber {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber : ");
        number=sc.nextInt();
        if((number & 1) == 1)
            System.out.println(number+" is Odd.");
        else
            System.out.println(number+" is Even.");
    }
}
