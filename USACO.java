 import java.util.*;
import java.io.*;

public class USACO {

  public int col;
  public int row;
  public int ele;
  public int number;
  /*
  row = //first int in line.
  col = //second int in line.
  ele = //third int in line.
  number = //fourth int in line.
  */
   public static int bronze(String filename){
    File f = new File(filename);
    Scanner s = new Scanner(f);

    String[] info = scan.nextLine().split(" ");
    row = Integer.parseInt(RCEN[0]);
    col = Integer.parseInt(RCEN[1]);
    ele = Integer.parseInt(RCEN[2]);
    number = Integer.parseInt(RCEN[3]);

      int[][] lake = new int[row][col];

          for (int i = 0; i < row; i++){
            for (int x = 0; x < col; x++){
              lake[i][x] = scan.nextInt();
            }
          }

    int[][] moves = new int[number][3];

    for(int i = 0; i < number; i++){
     for (int x = 0; x < 3; x++){
       moves[i][i2] = scan.nextInt();
       //System.out.println(moves[i][x]);
     }
   }

   for (int i = 0; i < moves.length; i++){
    int row = moves[i][0] - 1;
    int col = moves[i][1] - 1;
    int subtract = moves[i][2];

    int max = 0;

    for (int i = row; i-row < 3 && i < r; i++){
      for (int x = col; x-col < 3 && x < c; x++){
        if (lake[i][x] > max){
          max = lake[i][x];
        }
      }
    }
    max -= subtract;

}




  public static int silver(String filename) {

  }














}
