import java.util.*;
import java.io.*;

private int col;
private int row;
private int ele;
private int number;
/*
row = //first int in line.
col = //second int in line.
ele = //third int in line.
number = //fourth int in line.
*/


public class USACO {
   public static int bronze(String filename){
    File f = new File(filename);
    Scanner s = new Scanner(f);
    for (int i = 0; i < 4; i++){
      //reads through each line.
      String result;
      result += s.nextLine();

/*
  private void subtract(int r, int c) {
    int count;
    for (int i = 0; i < 2; i++){
      if (data[r][c] >data[r + i][c]){
        data[r][c] = count;
      }
      else {
        data[r + i][c] = count;
      }
      if (data[r][c] > data[r][c + i]){
        data[r][c] = count;
      }

    }

  }
  */

  public static int silver(String filename) {

  }














}
