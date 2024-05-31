import java.util.*;
public class Pattern3{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int row,col,n;
        System.out.println("Enter number :");
        n=input.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}