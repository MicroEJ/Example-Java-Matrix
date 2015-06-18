/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */

package com.is2t.examples.numeric.matrix;

import ej.numeric.DoubleMatrix;

/**
 * This example use some matrix operations.
 */
public class MatrixExample {
	
	public static void main(String[] args) {
		creation();
		basicOperations();
	}
	
	/*
	 * Several ways to create a matrix.
	 */
	private static void creation () {
		int size = 3;

		println("zeros matrix", DoubleMatrix.zeros(size));
		println("ones matrix", DoubleMatrix.ones(size));
		println("eye matrix", DoubleMatrix.eye(size));
		println("replication matrix",DoubleMatrix.repmat(1.414213562, size, size));
		println("random matrix",DoubleMatrix.rand(size));
		
		println("Matrix data[]", new DoubleMatrix(new double[] {1,2,3,4,5,6,7,8,9}));
		println("Matrix data[][]", new DoubleMatrix(new double[][] {{1,2,3},{4,5,6},{7,8,9}}));
		println("raw matrix", new DoubleMatrix(size, 5));
	}
	
	/*
	 * Some basic operations
	 */
	private static void basicOperations () {
		System.out.println("================== Matrix Operations ==================");

		DoubleMatrix A = new DoubleMatrix(3, 3, new double []{1,1,1, 0,2,5, 2,5,-1});
		DoubleMatrix B = new DoubleMatrix(3, 3, new double []{-2,1,3, 4,2,7, 2,-5,9});
		
		println("Matrix A", A);
		println("Matrix B", B);
		
		println("add ", A.add(B));
		println("sub ", A.sub(A, B, 2, 2, 0, 0, 0, 0, 1, 1));
		println("mul in place", A.muli(B));
		println("div scalar", A.div(2));
		println("less than ", A.le(0.5));
		println("greater than ", A.ge(0.5));
		println("Transpose ", A.transpose());
		System.out.println("Determinant " + A.det());
	}
	
	private static void println(String message, DoubleMatrix doubleMatrix) {
		System.out.println("================== " + message + " ==================");
		System.out.println(doubleMatrix);
	}
}

