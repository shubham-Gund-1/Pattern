public class Pattern11_1{
    public static void main(String[] args) {
        char cc = 'A';
        int rows = 4;
        int ccount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cc + " ");
                cc++;
                ccount++;
            }
            for (int k = ccount; k < rows; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
