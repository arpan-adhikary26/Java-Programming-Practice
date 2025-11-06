public class invertedStarpattern{
    public static void main(String args []){
        int n=4; //rows
        for(int i=1; i<=n; i++){
            //outer loop
            for(int j=1; j<=n-i+1; j++){
                //inner loop
                System.out.print("*");
            }
            System.out.println();
        }
     }
    
}