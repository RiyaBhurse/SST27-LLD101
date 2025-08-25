interface Logger {
    void log(String msg);
}

class ConsoleLogger implements Logger {
    public void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}

public class ReportService {
    private final Logger logger;

    public ReportService() {
        this(new ConsoleLogger());
    }

    public ReportService(Logger logger) {
        this.logger = logger;
    }

    void generate() {
        logger.log("Generating daily report...");
        System.out.println("Report contents...");
    }
}