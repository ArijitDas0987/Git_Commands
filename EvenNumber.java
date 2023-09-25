
import java.util.*;

public class EvenNumber {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuber : ");
        number=sc.nextInt();
        if((number & 1) == 0)
            System.out.println(number+" is Even.");
        else
            System.out.println(number+" is odd.");
    }
}
