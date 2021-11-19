import java.util.Scanner;

public class lead_zero {
    public static String remove(String num){
        int i;
        char charArray[] = num.toCharArray();
        for(i=0; i<= charArray.length; i++){
            if(charArray[i] != '0'){
                break;
            }
        }
        if(i==0)
            return num;
        else
            return num.substring(i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String num = sc.next();
        String r = lead_zero.remove(num);
        System.out.println(r);
    }
}