package chapter16.arrays.task17;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestBigDecimalGenerator {
    public static void main(String[] args) {
        BigDecimal[] b = Generated.array(BigDecimal.class, new BigDecimalGenerator(), 10);
        System.out.println(Arrays.toString(b));
    }

}
