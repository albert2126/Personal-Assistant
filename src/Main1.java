import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int sum = 0;
        int limit = number.length() / 2;
        char [] numArr = number.toCharArray();
        for (int i=0; i < limit; i++) {
            sum = sum + (int)numArr[i] - (int)numArr[i+limit];
        }
        if(sum == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}