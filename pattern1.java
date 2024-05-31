import java.util.*;
public class Pattern1{
    public static void main(String args[]){
        int row,col,n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}