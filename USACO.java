 import java.util.*;
import java.io.*;

public class USACO {
  /*
  row = //first int in line.
  col = //second int in line.
  ele = //third int in line.
  number = //fourth int in line.
  */
   public static int bronze(String filename)throws FileNotFoundException{
    File f = new File(filename);
    Scanner s = new Scanner(f);

    String[] info = s.nextLine().split(" ");

    int r = Integer.parseInt(info[0]);
    int c = Integer.parseInt(info[1]);
    int e = Integer.parseInt(info[2]);
    int n = Integer.parseInt(info[3]);

    int[][] lake = new int[r][c];

    for (int i = 0; i < r; i++){
      for (int x = 0; x < c; x++){
        lake[i][x] = s.nextInt();
      }
    }

    int[][] moves = new int[n][3];

    for(int i = 0; i < n; i++){
     for (int x = 0; x < 3; x++){
       moves[i][x] = s.nextInt();
       System.out.println(moves[i][x]);
     }
   }

   for (int i = 0; i < moves.length; i++){
    int row = moves[i][0] - 1;
    int col = moves[i][1] - 1;
    int subtract = moves[i][2];
    int max = 0;

    for (int i2 = row; i2- row < 3 && i2 < r; i2++){
      for (int x2 = col; x2 - col < 3 && x2 < c; x2++){
        if (lake[i2][x2] > max){
          max = lake[i2][x2];
        }
      }
    }

    max -= subtract;

    for (int i2 = row; i2 - row < 3 && i2 < r; i2++){
      for (int x2 = col; x2 - col < 3 && x2 < c; x2++){
        if (lake[i2][x2] > max){
          lake[i2][x2] = max;
        }
      }
    }

    for (int ii = 0; ii < lake.length; ii++){
      for (int xx = 0; xx < lake[0].length; xx++){
        System.out.print(lake[ii][xx] + " ");
      }
      System.out.print("\n");
    }
  }

  int totDepth = 0;

  for (int i = 0; i < lake.length; i++){
    for (int x = 0; x < lake[0].length; x++){
      if (e - lake[i][x] > 0){
        totDepth += e - lake[i][x];
      }
    }
  }

  return totDepth * 72 * 72;
}

    public int silver(String filename) throws FileNotFoundException {
      File f = new File(filename);
	    Scanner s = new Scanner(f);
	    int r = s.nextInt();
	    int c = s.nextInt();
	    int t = s.nextInt();

	    int[][]board = new int[r][c];

	    for (int i = 0; i < r; i++){
        String result = s.next();
        for (int x = 0; x < c; x++){
          if (result.charAt(x) == '.'){
            board[i][x] = 0;
          }
          else if (result.charAt(x) == '*'){
            board[i][x] = -1;
          }
        }
      }





  }
