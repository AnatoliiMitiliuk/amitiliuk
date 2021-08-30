package homework4;

public class Task13 {
    public static void main(String[] args) {
        String[][] arrayR =  {{"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"}};
        for (int i = 0; i < arrayR.length; i++) {
            for (int j = 0; j < arrayR.length; j++) {
                System.out.print(" "+ arrayR[i][j]);
            }
            System.out.println();
        }

    }
}
