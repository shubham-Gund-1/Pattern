public class Pattern17_1{
    public static void main(String[] args) {
        char startChar = 'a';
        int rows = 4;
        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (startChar + j) + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (startChar + j) + " ");
            }
            System.out.println();
        }
    }
}
