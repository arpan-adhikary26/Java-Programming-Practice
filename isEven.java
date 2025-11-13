import java.util.*;
public class isEven {
    public static boolean EvenorNot(int n){
        
        boolean result;

        if(n%2==0){
            result = true;
        }else{
            result = false;
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        System.out.println(EvenorNot(n));
        sc.close();
    }
}
