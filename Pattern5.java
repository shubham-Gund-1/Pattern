public class Pattern5{
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num=num+2;
            }
            System.out.println();
        }
    }
}
