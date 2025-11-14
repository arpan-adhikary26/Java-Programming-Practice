public class butterflyPattern{

    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            //outer loop
            for(int j=1; j<=i; j++){
                //prints prefix stars
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                //prints spaces
                System.out.print(" ");
            }
            for(int m=1; m<=i; m++){
                //prints postfix stars
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
            //outer loop
            for(int j=1; j<=i; j++){
                //prints prefix stars
                System.out.print("*");
            }
            for(int k=1; k<=2*(n-i); k++){
                //prints spaces
                System.out.print(" ");
            }
            for(int m=1; m<=i; m++){
                //prints postfix stars
                System.out.print("*");
            }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}