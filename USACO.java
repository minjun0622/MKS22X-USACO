import java.util.*;
import java.io.*;

private int col;
private int row;
private int ele;
private int number;


public class USACO {
  public static void main(String[] args) {

  }

  public USACO(){
    makelake(/*file name*/);
  }

  public int makelake(String file) {
    File f = new File(file);
    Scanner s = new Scanner(file);
    while (file.hasNextLine()){
      row++;
      col++;
    }
    int[][] data = new int[row][col];
    for (int i = 0; i < row; i++){
      for (int x = 0; x < col; x++){
        if (data[i][x] < data[i + 1][x]){
          return data[i][x]

        }
      }
    }
  }














}
