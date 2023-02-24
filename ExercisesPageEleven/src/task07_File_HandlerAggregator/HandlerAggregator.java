package task07_File_HandlerAggregator;

import task07_File_HandlerAggregator.handler.*;

import java.util.List;

public class HandlerAggregator {
    private final List<FileHandler> handlers = List.of(new PictureHandler(), new PdfHandler(), new OtherFileTypeHandler(), new NoFileTypeHandler());

    public void handler(String filename){
        for(FileHandler f:handlers ){
            if (f.check(filename)){
                f.doOnSuccess();
            }
        }
    }
}
