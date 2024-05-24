package com.example.util;

public class ExerciseMath {
    public int factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("渡された値が正しくありません");
            }
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
    }
}

