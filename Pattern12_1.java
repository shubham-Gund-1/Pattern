public class Pattern12_1{
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            char cpc = (char) ('A' + i);
            char clc = (char) ('a' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(cpc + "" + clc + " ");
            }
            System.out.println();
        }
    }
}
