package chapter16.arrays.task17;

import java.math.BigDecimal;

public class BigDecimalGenerator implements Generator<BigDecimal> {
    BigDecimal bd = new BigDecimal(0);
    @Override
    public BigDecimal next() {
        bd = bd.add(BigDecimal.ONE);
        return bd;
    }
}
