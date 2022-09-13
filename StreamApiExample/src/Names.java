import java.util.*;
import java.util.stream.Collectors;

public class Names {
    public void names() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        //list ABC order
        memberNames.stream()
                .sorted()
                .forEach(memberName -> System.out.println(memberName));

        //count and filter names starting with S
        long namesStartingWithS = memberNames.stream()
                .filter(memberName -> memberName.startsWith("S"))
                .count();
        System.out.println("Names starting with S: " + namesStartingWithS);

                //list of min 6 characters long Names
        memberNames.stream()
                .filter(memberName -> memberName.length() > 6)
                .forEach(memberName -> System.out.println(memberName));

        // is that true there is a name starting with A
        boolean anyNameStartsWithA = memberNames.stream()
                .anyMatch(memberName -> memberName.startsWith("A"));
        System.out.println("Any names starting with A: " + anyNameStartsWithA);

        // write a random name starting A
        Optional<String> optionalName = memberNames.stream()
                .filter(memberName -> memberName.startsWith("A"))
                .findAny();
        if(optionalName.isPresent()){
            System.out.println("Random starting with A: " + optionalName.get());
        }

        // is that true there is no "space" in any name

        boolean isThereSpaceName =  memberNames.stream()
                .noneMatch(memberName -> memberName.contains(" "));
        System.out.println("Any names has space: " + isThereSpaceName);

        // is that true all names contains A
        boolean isAllNameContainsA = memberNames.stream()
                .allMatch(memberName -> memberName.contains("A"));
        System.out.println("All names has A: " + isAllNameContainsA);


    }
}
