package ru.mirea.task18.Task4;

import java.util.Arrays;

public class TestMatrix {
    public static void main(String[] args) {
        Integer[][] array1 = {{1, 2}, {3, 4}};
        Integer[][] array2 = {{5, 6}, {7, 8}};

        Matrix<Integer> matrix1 = new Matrix<>(array1);
        Matrix<Integer> matrix2 = new Matrix<>(array2);

        Integer[][] result = matrix1.sum(array1, array2);
        System.out.println(Arrays.deepToString(result));

        Double[][] doubles1 = {{1.0, 2.0}, {3.0, 4.0}};
        Double[][] doubles2 = {{5.0, 6.0}, {7.0, 8.0}};

        Matrix<Double> matrixDouble1 = new Matrix<>(doubles1);
        Matrix<Double> matrixDouble2 = new Matrix<>(doubles2);

        Double[][] resultDouble = matrixDouble1.sum(doubles1, doubles2);
        System.out.println(Arrays.deepToString(resultDouble));
    }
}
