public class Pattern14{
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
