import java.util.Scanner;
import java.lang.RuntimeException;
public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        boolean[] al = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            al[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (al[i] == false)
                flag = 0;
        }
        System.out.print("String: " + str);
        if (flag == 1)
            System.out.print("\nThe above string is a pangram.");
        else
            throw new RuntimeException("The above string is not a pangram");
    }
}