package task07_File_HandlerAggregator.handler;

public class PdfHandler implements FileHandler {

    private static final String EXTENSION = ".pdf";

    @Override
    public boolean check(String filename) {
        if(filename == null){
            return false;
        }
        return filename.endsWith(EXTENSION);
    }

    @Override
    public void doOnSuccess() {
        System.out.println("This is a PDF file");
    }
}
