public class Timetable {
    String[][] table = new String[5][10];

    public Timetable() {
        table[0][0] = "Montag";
        table[0][1] = "Informatik";
        table[0][2] = "Mathe";
        table[0][3] = "Deutsch";

        table[1][0] = "Dienstag";
        table[1][1] = "Englisch";
        table[1][2] = "GLG";
        table[1][3] = "BWL";

        table[2][0] = "Mittwoch";
        table[2][1] = "Informatik";
        table[2][2] = "Sport";
        table[2][3] = "Sport";
        table[2][4] = "Spanisch";

        table[3][0] = "Donnerstag";
        table[3][1] = "Spanisch";
        table[3][2] = "BWL";

        table[4][0] = "Freitag";
        table[4][1] = "Psychologie";
        table[4][2] = "Philosophie";
    }
    
    public void printTimetable() {
        int[] maxLengths = new int[table.length];
        int maxHeight = 0;

        for (int i = 0; i < table.length; i++) {
            maxLengths[i] = 0;

            for (int j = 0; j < table[0].length; j++) {
                if (table[i][j] != null) {
                    if (table[i][j].length() > maxLengths[i]) {
                        maxLengths[i] = table[i][j].length();
                    }

                    if (j > maxHeight) {
                        maxHeight = j;
                    }
                }
            }
        }

        for (int i = 0; i < maxHeight + 1; i++) {
            printline(maxLengths);

            for (int j = 0; j < table.length; j++) {
                if (table[j][i] != null) {
                    System.out.print("| " + table[j][i] + " ");

                    for (int k = 0; k < maxLengths[j] - table[j][i].length(); k++) {
                        System.out.print(" ");
                    }
                }
                else {
                    System.out.print("|  ");

                    for (int k = 0; k < maxLengths[j]; k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        }

        printline(maxLengths);
    }

    void printline(int[] maxLengths) {
        for (int j = 0; j < table.length; j++) {
            System.out.print("+");
            for (int k = 0; k < maxLengths[j] + 2; k++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }
}