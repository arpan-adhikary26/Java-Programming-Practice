package Arrays;
import java.util.*;

public class Insertion {

    // Insertion at end
    public static int InsertionAtEnd(int[] arr, int element, int size){
        if(size == arr.length){
            System.out.println("Insertion not possible: Array is full");
            return size;
        }

        arr[size] = element;
        size++;

        System.out.println("Array after insertion at end:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return size;
    }

    // Insertion at specific position
    public static int InsertionAtPosition(int[] arr, int element, int size, int pos){

        if(size == arr.length){
            System.out.println("Insertion not possible: Array is full");
            return size;
        }

        if(pos < 0 || pos > size){
            System.out.println("Invalid position");
            return size;
        }

        // Shift elements right
        for(int i = size - 1; i >= pos; i--){
            arr[i + 1] = arr[i];
        }

        // Insert element
        arr[pos] = element;
        size++;

        System.out.println("Array after insertion at position:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int size = 4;

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println("Enter element to insert:");
        int element = sc.nextInt();

        System.out.println("Enter position to insert:");
        int pos = sc.nextInt();

        // size = InsertionAtPosition(arr, element, size, pos);

        // size = InsertionAtEnd(arr, element, size);

        sc.close();
    }
}
