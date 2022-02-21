public class SPattern {
    public static void main(String[] args) {
        for (int rows = 1; rows <= 9; rows++) {
            for (int cols = 1; cols <= 10; cols++) {
                if (rows == 1 || rows == 10 / 2 || rows == 9) {
                    System.out.print("*");
                } else if (rows < 10 / 2 && cols == 1) {
                    System.out.print("*");
                } else if (rows > 9 / 2 && cols == 10) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}