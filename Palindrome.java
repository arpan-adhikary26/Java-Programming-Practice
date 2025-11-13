import java.util.*;
public class Palindrome {   

    public static boolean palindromeCheck(int n){
            int rev = 0;
            int original = n;
            while(n!=0){
                int lastDigit = n%10;
                rev = rev*10+lastDigit;
                n=n/10;
            }
            
        return original==rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        sc.close();
        if(palindromeCheck(n)){
            System.out.println(n + " Is a palindrome number");
        }else{
            System.out.println(n + " Is not a palindrome number");
        }
    }
}
