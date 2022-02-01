package main.task;

public class FirstSteps {
    public int sum(int x, int y) {
        return x + y;
    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {return x > y;}

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y <= yBottom && y >= yTop;}

    public int sum(int[] array) {
        int sum = 0;
        if (array.length == 0) {
            return 0;
        }
        for (int elem : array) {sum += elem;}
        return sum;
    }

    public int mul(int[] array) {
        int mul = 1;
        if (array.length == 0) {return 0;}
        for (int elem : array) {mul *= elem;}
        return mul;
    }

    public int min(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem < min) {min = elem;
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public double average(int[] array) {
        if (array == null || array.length == 0) {return 0;}
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] > array[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i] * array[i];
        }
    }

    public boolean find(int[] array, int value) {
        for (int elem : array) {
            if (elem == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        int length = array.length / 2;
        int temp;
        for (int i = 0; i < length; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array.length == 0) {
            return true;
        }
        int length = array.length / 2;
        for (int i = 0; i < length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int sum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            sum += sum(row);
        }
        return sum;
    }

    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }return max;
    }

    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            if (row.length == 0) {
                return max;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] row : matrix) {
            if (!isSortedDescendant(row)) {
                return false;
            }
        } return true;
    }
}
