abstract class Job extends Thread {
    protected final String jobName;
    private final int durationMs;
    public Job(String jobName, int durationMs) {
        this.jobName = jobName;
        this.durationMs = durationMs;
    }
    protected abstract String action();
    @Override
    public void run() {
        System.out.println("[" + jobName + "] Started " + action());
        try { Thread.sleep(durationMs); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        System.out.println("[" + jobName + "] Finished " + action());
    }
}
class FileDownloader extends Job {
    private final String fileName;
    public FileDownloader(String fileName, int durationMs) {
        super("Downloader", durationMs);
        this.fileName = fileName;
    }
    @Override
    protected String action() { return "downloading " + fileName; }
}
class DataProcessor extends Job {
    private final int records;
    public DataProcessor(int records, int durationMs) {
        super("Processor", durationMs);
        this.records = records;
    }
    @Override
    protected String action() { return "processing " + records + " records"; }
}
class PrintJob extends Job {
    private final String document;
    public PrintJob(String document, int durationMs) {
        super("Printer", durationMs);
        this.document = document;
    }
    @Override
    protected String action() { return "printing " + document; }
}
public class Q10_MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Job[] jobs = {
            new FileDownloader("video.mp4", 3000),   // Role: downloads a large file
            new DataProcessor(500, 2000),            // Role: processes data records
            new PrintJob("report.pdf", 1000)         // Role: prints a document
        };
        for (Job job : jobs) job.start();
        for (Job job : jobs) job.join();
        System.out.println("All jobs completed");
        // All three run concurrently, so total time is about 3 seconds (the longest job)
        // instead of 6 seconds if done one after another.
    }
}
