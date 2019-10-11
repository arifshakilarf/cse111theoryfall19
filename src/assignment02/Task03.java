package assignment02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] x = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] y = {{1,2,3},{4,5,6},{7,8,9}};

        print(x); //{{1,1,1},{2,2,2},{3,3,3}}
        print(y); //{{1,2,3},{4,5,6},{7,8,9}}

        swap(x,y);

        print(x); //{{1,2,3},{4,5,6},{7,8,9}}
        print(y); //{{1,1,1},{2,2,2},{3,3,3}}

        int[][] z = {{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}};

        int a[][] = reverseRow(z);

        print(z); //{{1,1,1},{2,2,2},{3,3,3},{4,4,4},{5,5,5},{6,6,6},{7,7,7}}
        print(a); //{{7,7,7},{6,6,6},{5,5,5},{4,4,4},{3,3,3},{2,2,2},{1,1,1}};

        int b[][] = join(x,y);

        print(b); //{{1,2,3},{4,5,6},{7,8,9},{1,1,1},{2,2,2},{3,3,3}}
    } 
    public static void print(int [][]x){
      System.out.print("{");
      for(int i=0;i<x.length;i++){
        if(i>0)
          System.out.print(",");
        System.out.print("{");
        for(int j=0;j<x[0].length;j++){
          System.out.print(x[i][j]+",");
        }
        System.out.print("}");
      }
      System.out.println("}");
    }
    public static void swap(int [][]x, int [][]y){
      int b[][]=new int[x.length][x[0].length];
      for(int i=0;i<x.length;i++){
        for(int j=0;j<x[0].length;j++){
          b[i][j]=x[i][j];
          x[i][j]=y[i][j];
          y[i][j]=b[i][j];
        }
      }
    }
    public static int[][] reverseRow(int [][]x){
      int b[][]=new int[x.length][x[0].length];
      for(int i=0;i<x.length;i++){
        for(int j=0;j<x[0].length;j++){
          b[i][j]=x[x.length-1-i][j];
        }
      }
      return b;
    }
    public static int[][] join(int [][]x,int [][]y){
      int b[][]=new int[x.length+y.length][x[0].length];
      for(int i=0;i<x.length;i++){
        for(int j=0;j<x[0].length;j++){
          b[i][j]=x[i][j];
        }
      }
      for(int i=x.length;i<b.length;i++){
        for(int j=0;j<b[0].length;j++){
          b[i][j]=y[i-x.length][j];
        }
      }
      return b;
    }

   


}
