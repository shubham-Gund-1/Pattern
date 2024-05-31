import java.util.*;
public class Pattern2{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int row,col,n;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(" "+row);
            }
            System.out.println();
        }
    }
}