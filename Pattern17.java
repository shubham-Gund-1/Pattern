public class Pattern17{
    public static void main(String[] args) {
        char startChar = 'a';
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (startChar + j) + " ");
            }
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (startChar + j) + " ");
            }
            System.out.println();
        }
    }
}
