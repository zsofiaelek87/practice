package task14_Message;

import java.time.Instant;
import java.util.Objects;

public class Message {
    private String messageText;
    private Instant messageDate;

    public Message(String messageText, Instant messageDate) {
        this.messageText = messageText;
        this.messageDate = messageDate;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Instant getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Instant messageDate) {
        this.messageDate = messageDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(messageText, message.messageText) && Objects.equals(messageDate, message.messageDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageText, messageDate);
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                ", messageDate=" + messageDate +
                '}';
    }
}
