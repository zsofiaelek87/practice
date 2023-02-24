package task14_Message;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class Main {
    public static void main(String[] args) {
        Message message1 = new Message("Hello", LocalDateTime.of(2022,10,27,12,38).toInstant(ZoneOffset.UTC));
        Message message2 = new Message("Hello World", LocalDateTime.of(2022,10,28,12,38).toInstant(ZoneOffset.UTC));
        Instant instant = Instant.now();
        instant.toString();

        System.out.println(message1);
        System.out.println(message2);
        System.out.println("Now:" + instant);

        Instant now = Instant.now();
        Instant nowMinusFiveMin = now.minus(5, ChronoUnit.MINUTES);


        System.out.println("5 minutes ago:"+ nowMinusFiveMin);

        List<Message> messageList = new ArrayList<>();
        messageList.add(message1);
        messageList.add(message2);

        List<Message> filteredMessages = messageList.stream()
                .filter(message->message.getMessageDate().isAfter(nowMinusFiveMin))
                .collect(Collectors.toList());

        System.out.println(filteredMessages);

    }
}
