package task07_File_HandlerAggregator.handler;

public interface FileHandler {
    boolean check(String filename);
    void doOnSuccess();
}
