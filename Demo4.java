import java.util.*;
public class Demo4{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,n,j;
        System.out.print("Enter a  number :");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<2*i-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}