package Review04_SocialMedia;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String imagePath1 = "path/to/your/image.jpg";
        String imagePath2 = "path/to/your/image.jpg";
        BufferedImage myPicture1 = ImageIO.read(new File(imagePath1));
        BufferedImage myPicture2 = ImageIO.read(new File(imagePath2));

        User user1 = new User("Zsofia","Elek", "Hi, I am Zsofia", myPicture1,  Instant.parse("2023-01-19T12:42:15.972727900Z"), Instant.parse("1987-01-01T12:42:15.972727900Z"), Gender.FEMALE);
        User user2 = new User("John","Smith", "Smith, the great", myPicture2,  Instant.parse("2022-01-19T12:42:15.972727900Z"), Instant.parse("2013-01-01T12:42:15.972727900Z"), Gender.MALE);


        String imagePath3 = "path/to/your/image.jpg";
        String imagePath4 = "path/to/your/image.jpg";
        BufferedImage myPicture3 = ImageIO.read(new File(imagePath3));
        BufferedImage myPicture4 = ImageIO.read(new File(imagePath4));

        List<Image> myPostPictures = new ArrayList<>();
            myPostPictures.add(myPicture3);
            myPostPictures.add(myPicture4);

        Post post1 = new Post("This is my first post!!!", "Hello world, I just created my first post", myPostPictures, user1, Instant.parse("2023-01-20T12:42:15.972727900Z"));

        user2.likePost(post1);
        user1.addFriend(user2);

        Comment comment1 = new Comment("This is my first comment", user1, Instant.now());
        post1.commentPost(comment1);


    }
}
