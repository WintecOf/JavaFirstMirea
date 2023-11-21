package ru.mirea.task20.task5;

import java.util.Random;

public class Matrix<N extends Number> {
    private N[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = (N[][]) new Number[rows][cols];
    }

    public Matrix(N[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public N get(int i, int j) {
        return data[i][j];
    }

    public void set(int i, int j, N value) {
        data[i][j] = value;
    }

    public Matrix<N> add(Matrix<N> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        Matrix<N> result = new Matrix<>(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Assuming the type N supports addition
                result.set(i, j, add(this.get(i, j), other.get(i, j)));
            }
        }

        return result;
    }

    public Matrix<N> multiply(Matrix<N> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }

        Matrix<N> result = new Matrix<>(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                N sum = multiply(this.get(i, j), other.get(j, i));
                result.set(i, j, sum);
            }
        }

        return result;
    }

    // Define your own add and multiply methods based on the specific type N
    private N add(N a, N b) {
        Number n = a.doubleValue() + b.doubleValue();
        // Implement addition for type N
        return (N) n;
    }

    private N multiply(N a, N b) {
        // Implement multiplication for type N
        Number n = a.doubleValue() * b.doubleValue();
        return (N) n;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.append(data[i][j]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}