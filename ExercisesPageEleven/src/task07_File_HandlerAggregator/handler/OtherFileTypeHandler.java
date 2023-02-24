package task07_File_HandlerAggregator.handler;


import java.util.List;

public class OtherFileTypeHandler implements FileHandler {

    private static final List<String> EXCLUSIONS = List.of(".pdf", ".jpg", ".jpeg");

    @Override
    public boolean check(String filename) {
        if (filename == null) {
            return false;
        }
        return filename.contains(".") && EXCLUSIONS.stream()
                .noneMatch(exclusion -> filename.endsWith(exclusion));
    }



    @Override
    public void doOnSuccess() {
        System.out.println("Further investigation...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double r = Math.random();
        if (r < 0.5) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}
