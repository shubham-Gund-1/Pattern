import java.util.*;
public class Pattern6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,n,f1=1;
        System.out.println("Enter a number :");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(f1+" ");
                f1++;
            }
            System.out.println();
        }
    }
}