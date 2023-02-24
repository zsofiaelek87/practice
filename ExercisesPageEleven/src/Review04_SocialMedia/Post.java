package Review04_SocialMedia;

import java.awt.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class Post {
    private String postTitle;
    private String postDescription;
    private List<Image> postPictures;

    private User createdBy;
    private Instant publishDate;

    private List<User> likedBy;
    private List<Comment> comments;

    private boolean liked;

    public boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }



    public Post(String postTitle, String postDescription, List<Image> postPictures, User createdBy, Instant publishDate) {
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.postPictures = postPictures;
        this.createdBy = createdBy;
        this.publishDate = publishDate;
    }

    public Post(String postTitle, String postDescription, User createdBy, Instant publishDate) {
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.createdBy = createdBy;
        this.publishDate = publishDate;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public List<Image> getPostPictures() {
        return postPictures;
    }

    public void setPostPictures(List<Image> postPictures) {
        this.postPictures = postPictures;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Instant publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(postTitle, post.postTitle) && Objects.equals(postDescription, post.postDescription) && Objects.equals(postPictures, post.postPictures) && Objects.equals(createdBy, post.createdBy) && Objects.equals(publishDate, post.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postTitle, postDescription, postPictures, createdBy, publishDate);
    }

    @Override
    public String toString() {
        return "Post{" +
                "postTitle='" + postTitle + '\'' +
                ", postDescription='" + postDescription + '\'' +
                ", postPictures=" + postPictures +
                ", createdBy='" + createdBy + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }

    public void likingPost(User user, Boolean liked){
        if(Boolean.TRUE.equals(liked)){
            setLiked(liked);
            likedBy.add(user);
        }
    }

    public void removeLikingPost(User user, Boolean liked){
        if(Boolean.FALSE.equals(liked)){
            setLiked(Boolean.FALSE);
            likedBy.remove(user);
        }
    }

    public void commentPost(Comment comment){
        comments.add(comment);
    }
}
