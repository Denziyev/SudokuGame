public class Main {
    public static void main(String[] args) {

       Sudoku sudoku=new Sudoku();
       sudoku.shuffle();
       sudoku.creategaps();
       System.out.println("After creat gaps:");
       sudoku.Display(sudoku.table);
       sudoku.solver();
       System.out.println();
       System.out.println("After solver method:");
       System.out.println();
       System.out.println("Result 1:");
       sudoku.Result1();
       sudoku.Display(sudoku.table1);
       System.out.println("Result 2:");
       sudoku.Result2();
       sudoku.Display(sudoku.table1);
       System.out.println("Result 3:");
       sudoku.Result3();
       sudoku.Display(sudoku.table1);
       System.out.println("Result 4:");
       sudoku.Result4();
       sudoku.Display(sudoku.table1);
       System.out.println("Result 5:");
       sudoku.Result5();
       sudoku.Display(sudoku.table1);
       System.out.println("Result 6:");
       sudoku.Result6();
       sudoku.Display(sudoku.table1);

    }
}