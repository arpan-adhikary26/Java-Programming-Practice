package Arrays;
import java.util.*;
public class Insertion {

    public static void InsertionAtEnd(int[] arr, int element, int size){
        if(size==arr.length){
            System.out.println("Insertion not possible: Array is full");
        }else{
            arr[size] = element;
            size++;
        };

        System.out.println("Array after insertion");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [10];
        
        int size = 4;

        arr[0] = 20;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;

        System.out.println("Enter the element to insert at end");
        int element = sc.nextInt();

        InsertionAtEnd(arr,element,size);
        sc.close();
    }
}
