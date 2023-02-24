package task16_FilingSortingIntoFile;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final String inputText = "2022/bevallas/003-123-546-zoli@gmail.com";

        TextSplitter textSplitter = new TextSplitter();
        System.out.println(Arrays.toString(textSplitter.splittedText(inputText)));

        //DataStore dataStore = new DataStore();

        //System.out.println("Year: " + dataStore.getYear());
       // System.out.println("Document Type: " + dataStore.getDocType());
        //System.out.println("Social Security Number: " + dataStore.getSsn());
      //  System.out.println("Email: "+ dataStore.getEmail());
    }
}
