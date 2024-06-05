public class Pattern23{
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < cols - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
