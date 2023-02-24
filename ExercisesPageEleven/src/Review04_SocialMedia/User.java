package Review04_SocialMedia;

import java.awt.*;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String bio;
    private Image profilePicture;
    private Instant registrationDate;
    private Instant birthDate;

    private List<Post> postFeed;

    private List<User> friends;

    public User(String firstName, String lastName, String bio, Image profilePicture, Instant registrationDate, Instant birthDate, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.profilePicture = profilePicture;
        this.registrationDate = registrationDate;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    private Gender gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Instant getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Instant registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(bio, user.bio) && Objects.equals(profilePicture, user.profilePicture) && Objects.equals(registrationDate, user.registrationDate) && Objects.equals(birthDate, user.birthDate) && gender == user.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, bio, profilePicture, registrationDate, birthDate, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", profilePicture=" + profilePicture +
                ", registrationDate=" + registrationDate +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }

    public void addFriend(User user) {
        this.friends.add(user);
        user.friends.add(this);
    }

    public void likePost(Post post){
        postFeed.add(post);
    }
}
