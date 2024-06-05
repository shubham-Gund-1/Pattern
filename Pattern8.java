public class Pattern8{
    public static void main(String[] args) {
        char sc ='A';
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            char ch = sc;
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            sc++;
        }
    }
}
