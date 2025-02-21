
package lab211_tranthidiemkieu_de190595_assignment;

import java.util.Scanner;
import week2.Matrix;

public class TestCalculateMatrix {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix();
        int choice = 0;
       
       while(choice !=4){
           System.out.println("============Calculator program============");
           System.out.println("1. Addition Matrix");
           System.out.println("2. Subtraction Matrix");
           System.out.println("3. Multiplication Matrix");
           System.out.println("4. exit");
           System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1->{
                    System.out.println("-------Addition-----------");
                    
                    matrix.printMatrix(matrix.addditionMatrix(addMatrix(), addMatrix()));
                    
                }
                case 2->{
                    System.out.println("-------Subtraction-----------");
                    matrix.printMatrix(matrix.subtractionMatrix(addMatrix(), addMatrix()));
                }
                case 3->{
                    System.out.println("-------Multi-----------");
                    matrix.printMatrix(matrix.multiplicationMatrix(addMatrix(), addMatrix()));

                }
                case 4->{
                    System.out.println("Exting program");
                    return;
                }
                default-> System.out.println("Sai r, nhap lai di");
            }
       }
         
    }
    
    
    public static Matrix addMatrix(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row for Matrix: ");
        int row = scanner.nextInt();
        System.out.print("Enter colum for Matrix: ");
        int col = scanner.nextInt();
        Matrix matrix = new Matrix(row, col);
        System.out.println("Enter elements for Matrix:");
        int[][] data1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("data [" +i+ "][" + j+ "]");
                data1[i][j] = scanner.nextInt();
            }
        }
        matrix.setArray(data1);
        return matrix;
    }
}
