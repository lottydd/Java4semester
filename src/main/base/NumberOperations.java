package main.base;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberOperations {

    public static Integer find(int[] array, int value) {
        for (int i = 0; i < array.length ; i++) {

            if (array[i] == value) {
                return i;
            }
        }
        return null;
    }

    public static Integer find(double[] array, double value, double eps) {
        for (int i = 0; i < array.length ; i++) {
            if (Math.abs(array[i] - value) < eps) {
                return i;
            }
        }
        return null;
    }

    public static Double calculateDensity(double weight, double volume,
                                          double min, double max) {
        double result = weight / volume;
        if (min < result && result < max) {
            return result;
        }
        return null;
    }

    public static Integer find(BigInteger[] array, BigInteger value) {

        Integer result = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return result;
    }

    public static BigDecimal calculateDensity
            (BigDecimal weight, BigDecimal volume,
             BigDecimal min, BigDecimal max) {
        BigDecimal result = weight.divide(volume);
        if (min.compareTo(result) <= 0 && result.compareTo(max) <= 0) {
            return result;
        }
        return null;
    }
}
