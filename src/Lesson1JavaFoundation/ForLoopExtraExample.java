package Lesson1JavaFoundation;

public class ForLoopExtraExample {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            System.out.println("row " + row + ":");
            for (int col = 0; col < 10; col++) {
                System.out.println(col + " ");
            }
            System.out.println("-----------------------------");
        }
        myLoop();
        myLoop2();
        myLoop3();
    }

    //----------------------------------------------------------------------------
    public static void myLoop() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner j = " + j);
            }
        }
        System.out.println("-----------------------------");
    }

    //----------------------------------------------------------------------------
    public static void myLoop2() {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.println("0 ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    //----------------------------------------------------------------------------
    public static void myLoop3() {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == col) {
                    System.out.println("1 ");
                } else {
                    System.out.println("0 ");
                }
                System.out.println();
            }
        }
    }

}
