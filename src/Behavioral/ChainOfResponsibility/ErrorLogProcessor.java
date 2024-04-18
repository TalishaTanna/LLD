package Behavioral.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor {

    ErrorLogProcessor(LogProcessor nextlogProcessor)
    {
        super(nextlogProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == ERROR)
            System.out.println("ERROR: " + message);
        else
            super.log(logLevel, message);
    }
}
