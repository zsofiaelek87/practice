package task07_File_HandlerAggregator.handler;

public class NoFileTypeHandler implements FileHandler {
    @Override
    public boolean check(String filename) {
        if (filename == null) {
            return false;
        }
        return !filename.contains(".");
    }

    @Override
    public void doOnSuccess() {
        throw new RuntimeException("No extension found");
    }
}
