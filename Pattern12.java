public class Pattern12{
    public static void main(String[] args) {
        int rows = 4;
        char cuc = 'A';
        char clc = 'a';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(cuc + "" + clc + " ");
                clc++;
                cuc++;
            }
            System.out.println();
        }
    }
}
