import java.io.*; // for handling input/output
import java.util.*;
class Main {
    public static int check(int n,int j)
    {
        if(n<1 && j<9)
        {
            return j;
        }
        if(n<1 && j>9)
        {
            return check(j,0);
        }
        j += n%10;
        return check(n/10,j);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = check(n,0);
        System.out.print(z);
    }
}