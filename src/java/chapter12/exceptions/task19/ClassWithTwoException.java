package chapter12.exceptions.task19;

public class ClassWithTwoException {
    public void exceptionNumOne() throws VeryImportantExceptionOne {
        throw new VeryImportantExceptionOne();
    }
    public void exceptionNumTwo() throws VeryImportantExceptionTwo {
        throw new VeryImportantExceptionTwo();
    }
}
