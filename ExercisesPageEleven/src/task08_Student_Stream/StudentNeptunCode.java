package task08_Student_Stream;

import java.util.HashSet;
import java.util.Set;

public class StudentNeptunCode {

    private final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

    final Set<String> identifiers = new HashSet<String>();
    final java.util.Random rand = new java.util.Random();


    public String generateRandomId(){
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();

    }


}
