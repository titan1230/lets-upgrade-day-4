import java.util.Scanner;

public class SumOf5 {
    public static void main(String[] args) {

        int a,b,c,d,e;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number :- ");
        a = scan.nextInt();
        System.out.print("Enter second number :- ");
        b = scan.nextInt();
        System.out.print("Enter third number :- ");
        c = scan.nextInt();
        System.out.print("Enter fourth number :- ");
        d = scan.nextInt();
        System.out.print("Enter fifth number :- ");
        e = scan.nextInt();

        System.out.println(a+b+c+d+e);
    }
}
