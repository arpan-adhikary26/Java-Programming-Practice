import java.util.*;
public class PrimesinRange{

    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        }
        return isPrime;
    }
    
    public static void CheckPrime(int n){
       
       for(int i=1; i<=n; i++){
        if(isPrime(i)){
            System.out.println(i);
        }
       }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        CheckPrime(n);
        
        sc.close();
    } 
}