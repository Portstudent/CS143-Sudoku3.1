public class SudokuEngine {
	public static void main(String[] args) {
		SudokuBoard3_1 board = new SudokuBoard3_1("boards/data1.sdk");
      System.out.print(board);
      
      //Check for valid board
      boolean isValid = board.isValid();
		System.out.println("Is valid? " + board.isValid());
      
      //Check for solved board
      boolean isSolved = board.isSolved();
		System.out.println("Is solved? " + board.isSolved());
      
      //Solve the board if it is valid and not solved
      if(isValid && !isSolved){
          if(board.solve()){
              System.out.println("board is now solved!");
              System.out.println(board);
          } else {
              System.out.println("board could not be solved");
          }
      }
      
      
		
	}
}
/*
+-----------------------+
| 2 . . | 1 . 5 | . . 3 |
| . 5 4 | . . . | 7 1 . |
| . 1 . | 2 . 3 | . 8 . |
|-------|-------|-------|
| 6 . 2 | 8 . 7 | 3 . 4 |
| . . . | . . . | . . . |
| 1 . 5 | 3 . 9 | 8 . 6 |
|-------|-------|-------|
| . 2 . | 7 . 1 | . 6 . |
| . 8 1 | . . . | 2 4 . |
| 7 . . | 4 . 2 | . . 1 |
+-----------------------+
Is valid? true
Is solved? false
*/