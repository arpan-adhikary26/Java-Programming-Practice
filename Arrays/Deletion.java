package Arrays;
import java.util.*;
public class Deletion {
    // Deletion At End
    public static int DeletionAtEnd(int[] arr, int size){
         System.out.println("Array before deletion");
       for(int i=0; i<size; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       if(size == 0){
           System.out.println("Deletion not possible, array is empty");
       }else{
           size--;
       }
       
       System.out.println("Array after deletion");
       for(int i=0; i<size; i++){
           System.out.print(arr[i] + " ");
       }
        return size;
    }

    //Deletion at Specific Position
    public static int DeletionAtPosition(int arr[], int pos, int size){
        System.out.println("Array before deletion");
        for(int i=0; i<size; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();

        if(size == 0){
            System.out.println("Deletion not possible due to empty array");
            return size;
        }
        if(pos<0 || pos>=size){
            System.out.println("Deletion not possible due to invalid position");
            return size;
        }
        for(int i=pos; i<=size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;

        System.out.println("Array after deletion");
        for(int i=0; i<size; i++){
           System.out.print(arr[i] + " ");
       }

        return size;
    }

    //Deletion at beginning
    public static int DeletionAtBeginning(int arr[], int size){
        System.out.println("Array before deletion");
        for(int i=0; i<size; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println();

       if(size == 0){
            System.out.println("Deletion not possible due to empty array");
            return size;
        }
        for(int i=0; i<size-1; i++){
            arr[i] = arr[i+1];
        };
        
        size--;

       System.out.println("Array after deletion");
        for(int i=0; i<size; i++){
           System.out.print(arr[i] + " ");
       }
        return size;
    }
     public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[10];
       arr[0] = 10;
       arr[1] = 20;
       arr[2] = 30;
       arr[3] = 40;
       arr[4] = 50;
       
       int size=5;

       System.out.println("Enter the position to delete");
       int pos = sc.nextInt();
       sc.close();
       
    //    size = DeletionAtEnd(arr, size);
    //    size = DeletionAtPosition(arr, pos, size);
          size = DeletionAtBeginning(arr, size);
    }
}
