import java.util.*;
public class Pattern15{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(j%2==1) System.out.print(" 1");
                else System.out.print(" 0");
            }
            System.out.println();
        }
    }
}