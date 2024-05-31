import java.util.*;
public class Pattern16{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i%2==0) System.out.print(" 0");
                else System.out.print(" 1");
            }
            System.out.println();
        }
    }
}