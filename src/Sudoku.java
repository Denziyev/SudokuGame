import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sudoku {
    public int[][] table;
    private static final SecureRandom rand = new SecureRandom();

    public Sudoku() {
        table = new int[3][3];
        int a = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = ++a;
            }
        }
    }

    public void shuffle() {
        int a, b, temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a = rand.nextInt(3);
                b = rand.nextInt(3);
                temp = table[i][j];
                table[i][j] = table[a][b];
                table[a][b] = temp;
            }
        }
    }

    public void Display(int[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("   ");
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void creategaps() {
        int a, b;
        for (int z = 0; z < 3; z++) {
            a = rand.nextInt(3);
            b = rand.nextInt(3);
            table[a][b] = 0;
        }
    }

    ArrayList<Integer> numbersingaps = new ArrayList<Integer>();

    public void solver() {
        ArrayList<Integer> numbersdefinit = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int t = 1; t < 10; t++) {
                    if (table[i][j] == t) {
                        numbersdefinit.add(t);
                    }
                }
            }
        }


        for (int j = 1; j < 10; j++) {
            if (!numbersdefinit.contains(j)) {
                numbersingaps.add(j);
            }

        }
    }

    public int[][] table1 = new int[3][3];

    private void newtable() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table1[i][j] = table[i][j];
            }
        }
    }

    private int[] a = {0, 1, 2};
    private int[] b = {0, 2, 1};
    private int[] c = {2, 0, 1};


    public void Result1() {
        int t = 0;
        newtable();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table1[i][j] == 0) {
                    table1[i][j] = numbersingaps.get(a[t++]);
                }
            }

        }

    }

    public void Result2() {
        int t = 2;
        newtable();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table1[i][j] == 0) {
                    table1[i][j] = numbersingaps.get(a[t--]);
                }
            }

        }
    }

    public void Result3() {
        int t = 0;
        newtable();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table1[i][j] == 0) {
                    table1[i][j] = numbersingaps.get(b[t++]);
                }
            }

        }
    }

    public void Result4() {
        int t = 2;
        newtable();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table1[i][j] == 0) {
                    table1[i][j] = numbersingaps.get(b[t--]);
                }
            }

        }
    }

    public void Result5() {
        int t = 2;
        newtable();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table1[i][j] == 0) {
                    table1[i][j] = numbersingaps.get(c[t--]);
                }
            }

        }
    }


    public void Result6() {
        int t = 0;
        newtable();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table1[i][j] == 0) {
                    table1[i][j] = numbersingaps.get(c[t++]);
                }
            }

        }


    }
    }


