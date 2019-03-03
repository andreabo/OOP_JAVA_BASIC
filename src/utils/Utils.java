package utils;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Utils {
    public static double calculateAverage(int[] grades) {
        return IntStream.of(grades).average().getAsDouble();
    }

    public static double calculateAverage(double[] grades) {
        return DoubleStream.of(grades).average().getAsDouble();
    }
}
