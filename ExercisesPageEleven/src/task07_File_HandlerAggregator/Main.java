package task07_File_HandlerAggregator;

public class Main {
    public static void main(String[] args) {

        HandlerAggregator handlerAggregator = new HandlerAggregator();
        handlerAggregator.handler("zsofi.pdf");
        handlerAggregator.handler("zsofi.jpg");
        handlerAggregator.handler("zsofi.kic");
        handlerAggregator.handler("zsofi");
    }
}
