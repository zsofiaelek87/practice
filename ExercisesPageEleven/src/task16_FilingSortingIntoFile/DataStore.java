package task16_FilingSortingIntoFile;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private String inputText = "2022/bevallas/003-123-546-zoli@gmail.com";
    private final TextSplitter textSplitter = new TextSplitter();


    private String[] inputArray = textSplitter.splittedText(inputText);

    private String year = inputArray[0]; // adding 0th element of inputText to year
    private String docType = inputArray[1]; // adding 1th element of inputText to docType

    private String ssnDelimiter = "-";  // need a delimiter to construct the SSN number from array elements
    private String[] ssnArray = new String[3]; // need a new, 3 element array to store SSN number



    public String[] createSsnArray(){           //constructing the SSN number by adding the specific elements from the old array to the new array for the SSN elements
           ssnArray[0] =inputArray [2];
           ssnArray[1] =inputArray [3];
           ssnArray[2] =inputArray [4];
           return ssnArray;
    }

    private String[] ssnInput = createSsnArray(); // creating a new array to construct the SSN number

    private String ssn = String.join(ssnDelimiter,ssnInput); // combining the SSN elements with a delimiter


    private String email = inputArray[5]; // adding 5th element of inputText to email


    public String getYear() {
        return year;
    }

    public String getDocType() {
        return docType;
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmail() {
        return email;
    }

    public DataStore(String year, String docType, String ssn, String email) {
        this.year = year;
        this.docType = docType;
        this.ssn = ssn;
        this.email = email;
    }
}
