import java.util.*;
public class Demo5{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n,j;
        System.out.println("Enter a number :");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=2*i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}