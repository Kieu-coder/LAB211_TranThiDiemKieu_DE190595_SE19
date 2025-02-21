
package week2;

public class Matrix {
   private int row;
   private int column;
   private int[][] array;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.array = new int[row][column];
    }

    public Matrix() {
    }
    
    


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
   
   public Matrix addditionMatrix(Matrix matrix, Matrix matrix1){
       if (matrix.row != matrix1.getRow() || matrix.column != matrix1.getColumn()){
           throw new IllegalArgumentException("Error because not equal rows or column");
       }
       Matrix result = new Matrix(matrix.row,matrix.column);
       for (int i = 0; i < matrix.row; i++) {
           for (int j = 0; j < matrix.column; j++) {
               result.array[i][j] = matrix.array[i][j] + matrix1.array[i][j];
           }
       }
       return result;
   }
   
   public void printMatrix(Matrix matrix){
       System.out.println("Result: ");
       for (int i = 0; i < matrix.row; i++) {
           for (int j = 0; j < matrix.column; j++) {
               System.out.print("[" + matrix.array[i][j]+ "]" + "   " );
           }
           System.out.println("");
       }
   }
   
    public Matrix subtractionMatrix(Matrix matrix, Matrix matrix1){
       if (matrix.row != matrix1.getRow() || matrix.column != matrix1.getColumn()){
           throw new IllegalArgumentException("Error because not equal rows or column");
       }
       Matrix result = new Matrix(matrix.row,matrix.column);
       for (int i = 0; i < matrix.row; i++) {
           for (int j = 0; j < matrix.column; j++) {
               result.array[i][j] = matrix.array[i][j] - matrix1.array[i][j];
           }
       }
       return result;
   }
    
     public Matrix multiplicationMatrix(Matrix matrix, Matrix matrix1){
       if (matrix.column != matrix1.row){
           throw new IllegalArgumentException("Error because not equal column and row");
       }
       Matrix result = new Matrix(matrix.row,matrix.column);
       for (int i = 0; i < matrix.row; i++) {
           for (int j = 0; j < matrix1.getColumn(); j++) {
               result.array[i][j] = 0;
               for (int k = 0; k < matrix.column; k++) {
                  result.array[i][j] += matrix.array[i][j]*matrix1.array[k][j];
                   
               }
           }
       }
       return result;
   }
}
