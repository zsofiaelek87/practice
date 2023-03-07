package Page19Ex04StreamApi_e;

import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberFinder {
    public List<Integer> findPrime(List<Integer> numberList){

       return numberList.stream()
                .filter(integer -> this.isPrime(integer))
                .collect(Collectors.toList());
    }

    public Boolean isPrime(Integer number){
        Integer counter = 0;
        for(int i=1; i<=number; i++){
            if(number%i==0){
                counter++;
            }
        }

        return counter==2;
    /*    if(counter==2){
            return true;
        } else {
            return false;
        }

     */

    }
}
