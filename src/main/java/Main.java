import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args ){

        System.out.println("Hi, what is your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();

        if (userName.equalsIgnoreCase("Alice") || userName.equalsIgnoreCase("Bob")) {
            System.out.println("Nice you meet you " + userName + "!");
        } else {
            System.out.println("Wierd name....");
        }
    }
}
