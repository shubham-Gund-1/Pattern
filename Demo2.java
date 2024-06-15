import java.util.*;
public class Demo2{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}