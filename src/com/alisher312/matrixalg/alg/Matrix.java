package com.alisher312.matrixalg.alg;

public class Matrix {
    private int mRows;
    private int mCols;

    private double[][] mMatrix;

    public int getRows() {
        return mRows;
    }

    public int getCols() {
        return mCols;
    }

    public Matrix(int rows, int cols) {
        mRows = rows;
        mCols = cols;

        mMatrix = new double[rows][cols];
    }
}
