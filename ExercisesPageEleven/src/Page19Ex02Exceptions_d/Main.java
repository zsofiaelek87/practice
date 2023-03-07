package Page19Ex02Exceptions_d;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String pathWrong =  "C:\\Users\\Zsofia\\IdeaProjects\\practice\\ExercisesPageEleven\\src\\Practice_File\\test.txt";
        String pathGood =  "C:\\Users\\Zsofia\\IdeaProjects\\practice\\ExercisesPageEleven\\src\\Page19Ex02_d\\test.txt";


        try{
            ReadFile readFile = new ReadFile();
            List<String> result = readFile.readFile(pathGood);
            result.forEach(System.out::println);
        }
       catch(Exception e){
        System.out.println(e);
    }


    }
}
