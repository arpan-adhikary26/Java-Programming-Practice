package Arrays;
import java.util.*;
public class LinearSearch{

    public static int linearSearch(int numbers[], int key){
        System.out.println("Searching For Key " + key);
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }

    }
     return -1;
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int numbers[] = {12,34,78,19,10,31,45,21};
        System.out.println("Enter key to search:");
        int key = sc.nextInt();
        int index = linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index " + index);
        }
        sc.close();
    }
}
