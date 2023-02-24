package Review04_SocialMedia;

import java.time.Instant;
import java.util.Objects;

public class Comment  {

    private String commentText;
    private User commentedBy;
    private Instant commentedDate;

    public Comment(String commentText, User commentedBy, Instant commentedDate) {
        this.commentText = commentText;
        this.commentedBy = commentedBy;
        this.commentedDate = commentedDate;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public User getCommentedBy() {
        return commentedBy;
    }

    public void setCommentedBy(User commentedBy) {
        this.commentedBy = commentedBy;
    }

    public Instant getCommentedDate() {
        return commentedDate;
    }

    public void setCommentedDate(Instant commentedDate) {
        this.commentedDate = commentedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(commentText, comment.commentText) && Objects.equals(commentedBy, comment.commentedBy) && Objects.equals(commentedDate, comment.commentedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentText, commentedBy, commentedDate);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentText='" + commentText + '\'' +
                ", commentedBy=" + commentedBy +
                ", commentedDate=" + commentedDate +
                '}';
    }

}
