package chapter12.exceptions.task18;

public class ClassWithThreeException {
    public void exceptionNumOne() throws VeryImportantExceptionOne {
        throw new VeryImportantExceptionOne();
    }
    public void exceptionNumTwo() throws VeryImportantExceptionTwo {
        throw new VeryImportantExceptionTwo();
    }
    public void ExceptionNumThree() throws VeryImportantExceptionThree {
        throw new VeryImportantExceptionThree();
    }
}
