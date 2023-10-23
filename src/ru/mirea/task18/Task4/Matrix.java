package ru.mirea.task18.Task4;

public class Matrix<T> {
    private T[][] matrix;
    Matrix(T[][] matrix){
        this.matrix = matrix;
    }
    public T[][] sum(T[][]matrix1, T[][] matrix2){
        if(matrix1.length == matrix2[0].length && matrix1[0].length == matrix2.length){
            for (int i = 0; i < matrix1.length;i++){
                for(int j = 0; j < matrix1.length;j++) {
                    matrix1[i][j] = summator(matrix1[i][j],matrix2[i][j]);
                }
            }
            return matrix1;
        }
        return null;
    }
    public T summator(T a, T b){
        if(a instanceof Integer){
            return (T)(Integer)((Integer) a+  (Integer) b);
        }
        if(a instanceof Double){
            return (T)(Double)((Double) a+ (Double) b);
        }
        if(a instanceof Float){
            return (T)(Float)((Float) a+ (Float) b);
        }
        if(a instanceof Long){
            return (T)(Long)((Long) a+  (Long) b);
        }
        else{
            throw new UnsupportedOperationException("Не возможно сложить матрицы данного типа");
        }
    }
    public T[][] devide(T[][]matrix1, T[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            for (int i = 0; i < matrix1.length;i++){
                for(int j = 0; j < matrix1.length;j++) {
                    matrix1[i][j] = minus(matrix1[i][j],matrix2[i][j]);
                }
            }
            return matrix1;
        }
        return null;
    }
    public T minus(T a, T b){
        if(a instanceof Integer){
            return (T)(Integer)((Integer) a - (Integer) b);
        }
        if(a instanceof Double){
            return (T)(Double)((Double) a - (Double) b);
        }
        if(a instanceof Float){
            return (T)(Float)((Float) a - (Float) b);
        }
        if(a instanceof Long){
            return (T)(Long)((Long) a - (Long) b);
        }
        else{
            throw new UnsupportedOperationException("Не возможно вычесть матрицы данного типа");
        }
    }
    public T[][] multiply(T[][]matrix1, T[][] matrix2){
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            for (int i = 0; i < matrix1.length;i++){
                for(int j = 0; j < matrix1.length;j++) {
                    matrix1[i][j] = mult(matrix1[i][j],matrix2[j][i]);
                }
            }
            return matrix1;
        }
        return null;
    }
    public T mult(T a, T b){
        if(a instanceof Integer){
            return (T)(Integer)((Integer) a * (Integer) b);
        }
        if(a instanceof Double){
            return (T)(Double)((Double) a * (Double) b);
        }
        if(a instanceof Float){
            return (T)(Float)((Float) a * (Float) b);
        }
        if(a instanceof Long){
            return (T)(Long)((Long) a * (Long) b);
        }
        else{
            throw new UnsupportedOperationException("Не возможно вычесть матрицы данного типа");
        }
    }

    public T[][] multiplyNum(T number ,T[][]matrix){
        if(matrix.length == 0){
            for (int i = 0; i < matrix.length;i++){
                for(int j = 0; j < matrix.length;j++) {
                    matrix[i][j] = multNum(number,matrix[j][i]);
                }
            }
            return matrix;
        }
        return null;
    }
    public T multNum(T a, T b){
        if(a instanceof Integer){
            return (T)(Integer)((Integer) a * (Integer) b);
        }
        if(a instanceof Double){
            return (T)(Double)((Double) a * (Double) b);
        }
        if(a instanceof Float){
            return (T)(Float)((Float) a * (Float) b);
        }
        if(a instanceof Long){
            return (T)(Long)((Long) a * (Long) b);
        }
        else{
            throw new UnsupportedOperationException("Не возможно умножить число на матрицу данного типа");
        }
    }
    public T[][] Trans(T[][]matrix){
        if(matrix.length > 0){
            for (int i = 0; i < matrix.length - 1;i++){
                for(int j = i + 1; j < matrix.length;j++) {
                    T swap = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = swap;
                }
            }
            return matrix;
        }
        return null;
    }
}
