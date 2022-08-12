import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        // Parse String To Int
        {
            String str = sc.nextLine();
            int val = Integer.parseInt(str);
            System.out.println(val);
        }
        //Parse Int to String
        {
            int a = sc.nextInt();
            String str = String.valueOf(a);
            System.out.println(a);
        }
    }
}
