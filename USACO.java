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
public static int silver(String filename) throws FileNotFoundException{
	int[][] oldNums;
  int[][] newNums;
	char [][] map;

	int row;
  int col;
  int num;
  int sRow;
  int sCol;
  int eRow;
  int eCol;

  File f = new File(filename);
  Scanner s = new Scanner(f);

	    row = s.nextInt();
	    col = s.nextInt();
	    num= s.nextInt();
	    map = new char[row][col];
	    newNums = new int[row][col];
	    oldNums = new int[row][col];

	    for (int i = 0; i < row; i++){
        String result = s.next();
          for(int x = 0; x < col; x++){
		          map[i][x] = result.charAt(x);
            }
          }

	    sRow = s.nextInt() - 1;
	    sCol = s.nextInt() - 1;
	    eRow = s.nextInt() - 1;
	    eCol = s.nextInt() - 1;

	    oldNums[sRow][sCol] = 1;

	    for(int i = 0; i < num; i++){
		      for(int x = 0; x < row; x++){
		    for(int j = 0; j < col; j++){
			       if (map[x][j] != '*'){

			    int sumN = 0;

			    if(checker(x-1,j,row,col)){
            sumN = sumN + oldNums[x-1][j];
			    }
			    if(checker(x+1,j,row,col)){
            sumN = sumN + oldNums[x+1][j];
			    }
			    if(checker(x,j-1,row,col)){
            sumN = sumN + oldNums[x][j-1];
			    }
			    if(checker(x,j+1,row,col)){
            sumN = sumN + oldNums[x][j+1];
			    }
			    newNums[x][j] = sumN;
			}
		    }
		}
		oldNums = newNums;
		newNums = new int[row][col];
	    }
	    return oldNums[eRow][eCol];
    }

    private static boolean checker(int cR,int cC, int r, int c){
	     return cR >= 0 && cC >= 0 && cR < r && cC < c;
    }
}
