import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Age : ");
        int Age = input.nextInt();

        ITarget Factor = new Adapter();

        System.out.println(Factor.Request(Age));
    }
}