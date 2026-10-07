import java.util.*;
import java.io.*;

public class Secure {

    static boolean validate(String username, String password) {
        
        if (username.length() < 3 || username.length() > 20)
            return false;

        if (password.length() < 6 || password.length() > 20)
            return false;

        if (username == null || password == null)
            return false;
        return (username.equals("admin") && password.equals("admin123"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();

            try {
                if (validate(username, password))
                    System.out.println("SUCCESS");
                else
                    System.out.println("FAILURE");
            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        }

        sc.close();
    }
}