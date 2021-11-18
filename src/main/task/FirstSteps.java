package main.task;

public class FirstSteps {
    public int sum(int x, int y) {
        return x + y;
    }

    //2
    public int mul(int x, int y) {
        return x * y;
    }

    //3
    public int div(int x, int y) {
        return x / y;
    }

    //4
    public int mod(int x, int y) {
        return x % y;
    }

    //5
    public boolean isEqual(int x, int y) {
        return x == y;
    }


    //6
    public boolean isGreater(int x, int y) {


        return x > y;


    }

    //7
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y <= yBottom && y >= yTop;
    }

    //8
    public int sum(int[] array) {
        int sum = 0;
        if (array.length == 0) {
            return 0;

        }

        for (int elem : array) {
            sum += elem;
        }
        return sum;

    }

    //9
    public int mul(int[] array) {
        int mul = 1;
        if (array.length == 0) {
            return 0;
        }
        for (int elem : array) {
            mul *= elem;
        }
        return mul;

    }

    //10
    public int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int elem : array) {

            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    //11
    public int max(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int elem : array) {

            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    //12
    public double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return (double) sum(array) / array.length;
    }

    //13
    public boolean isSortedDescendant(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] > array[i + 1])) {
                return false;
            }
        }
        return true;

    }

    //14
    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {

            array[i] *= array[i] * array[i];
        }

    }

    //15
    public boolean find(int[] array, int value) {
        for (int elem : array) {
            if (elem == value) {
                return true;
            }

        }
        return false;
    }

    //16
    public void reverse(int[] array) {
        int length = array.length / 2;
        int temp;
        for (int i = 0; i < length; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    //17
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

    //18
    public int sum(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            sum += sum(array);
        }
        return sum;
    }

    //19
    public int max(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int tempMax = 0;
        for (int[] array : matrix) {
            tempMax = max(array);
            if (tempMax > max) {
                max = tempMax;
            }

        }
        return max;
    }

    //20
    public int diagonalMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] array : matrix) {
            if (array.length == 0) {
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

    //21
    public boolean isSortedDescendant(int[][] matrix) {
        for (int[] array : matrix) {
            if (!isSortedDescendant(array)) {
                return false;
            }
        }
        return true;
    }


}
