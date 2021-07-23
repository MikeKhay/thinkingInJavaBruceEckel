package chapter12.exceptions.task6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class App {
    private static Logger logger = Logger.getLogger("LoggingExceptionNumOne.");

    static void logExecutor(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try{
            throw new ExceptionNumOne("It is one");
        }
        catch (ExceptionNumOne e1){
            logExecutor(e1);
        }

        try{
            throw new ExceptionNumTwo("It is two");
        } catch (ExceptionNumTwo e2) {
            logExecutor(e2);
        }
    }
}
