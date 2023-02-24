package task07_File_HandlerAggregator.handler;

import java.util.List;

public class PictureHandler implements FileHandler {
    private static final List<String> EXTENSIONS = List.of(".jpg", ".jpeg");

    @Override
    public boolean check(String filename) {
        if(filename == null){
            return false;
        }
        return EXTENSIONS.stream()
                .anyMatch(extension -> filename.endsWith(extension));
    }

    @Override
    public void doOnSuccess() {
        System.out.println("This is an image");
    }
}
