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

    for (int i = 0; i < row; i++){
      for (int x = 0; x < col; x++){
        lake[i][x] = s.nextInt();
      }
    }

    int[][] moves = new int[number][3];

    for(int i = 0; i < number; i++){
     for (int x = 0; x < 3; x++){
       moves[i][x] = s.nextInt();
       System.out.println(moves[i][x]);
     }
   }

   for (int i = 0; i < moves.length; i++){
    int row2 = moves[i][0] - 1;
    int col2 = moves[i][1] - 1;
    int subtract = moves[i][2];

    int max = 0;

    for (int i2 = row2; i2- row2 < 3 && i2 < row; i2++){
      for (int x2 = col2; x2 -col2 < 3 && x2 < col; x2++){
        if (lake[i2][x2] > max){
          max = lake[i2][x2];
        }
      }
    }

    max -= subtract;

    for (int i3 = row2; i3 -row2 < 3 && i3 < row; i3++){
      for (int x3 = col2; x3 -col2 < 3 && x3 < col; x3++){
        if (lake[i3][x3] > max){
          lake[i3][x3] = max;
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

  for (int i = 0; row < lake.length; i++){
    for (int x = 0; col < lake[0].length; x++){
      if (ele - lake[i][x] > 0){
        totDepth += ele - lake[i][x];
      }
    }
  }

  return totDepth * 72 * 72;
}

}
