package task06_Town_Stream;

import java.util.*;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Town town1 = new Town("City1",1000, Country.FRANCE);
        Town town2 = new Town("City2",50000, Country.FRANCE);
        Town town3 = new Town("City3",20, Country.HUNGARY);
        Town town4 = new Town("City4",300, Country.HUNGARY);
        Town town5 = new Town("City5",40000, Country.GERMANY);
        Town town6 = new Town("City6",600000, Country.GERMANY);
        Town town7 = new Town("City7",5125, Country.UNITED_STATES);
        Town town8 = new Town("City8",666, Country.UNITED_STATES);
        Town town9 = new Town("CityH",1, Country.FRANCE);
        Town town10 = new Town("CityL",123456, Country.FRANCE);

        Set<Town> townSet = new HashSet<>();
        townSet.add(town1);
        townSet.add(town2);
        townSet.add(town3);
        townSet.add(town4);
        townSet.add(town5);
        townSet.add(town6);
        townSet.add(town7);
        townSet.add(town8);
        townSet.add(town9);
        townSet.add(town10);

        System.out.println(townSet);

        //Hány különböző országból vannak felsorolva a városok?

        /*townSet.stream()
                .filter(distinctByKey(Town::getCountry))
                .forEach(System.out::println);


         */
        List<Country> distinctCounties = townSet.stream()
                .map(town -> town.getCountry())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctCounties);
        System.out.println(distinctCounties.size());

       /* long Count = townSet.stream()
                .filter(distinctByKey(Town::getCountry))
                .count();

        System.out.println(Count);
        */

        //Írd ki a városok nevét sorrendben.
        
        List<String> nameOfCities = townSet.stream()
                .map(Town::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nameOfCities);

        Map<Country,List<Town>> listOfTownsByCountry = townSet.stream()
                .collect(Collectors.toMap(
                        town -> town.getCountry(),
                        town -> List.of(town),
                        (list1, list2) -> {
                            List<Town> list3 = new ArrayList<>();
                            list3.addAll(list1);
                            list3.addAll(list2);
                            return list3;
                        }
                ));
        System.out.println(listOfTownsByCountry);

        //Melyik a legnépesebb város?
        Optional<Town> townWithMaxPeopleOptional = townSet.stream()
                .max((towni, townj)-> towni.getNumberOfCitizens() - townj.getNumberOfCitizens());

        if(townWithMaxPeopleOptional.isPresent()){
            System.out.println(townWithMaxPeopleOptional.get());
        }

        //Melyik országban van a legnépesebb város, ha csak olyan országokat veszünk figyelembe, amelyek elnevezésében van H betű.

        Optional<Town> townWithMaxPeopleWithHCountryOptional = townSet.stream()
                .filter(town -> town.getCountry().name().contains("H"))
                .max((towni, townj)-> towni.getNumberOfCitizens() - townj.getNumberOfCitizens());

        if(townWithMaxPeopleWithHCountryOptional.isPresent()){
            System.out.println(townWithMaxPeopleWithHCountryOptional.get());
        }

        //Melyik országban van a legnépesebb város, ha csak olyan országokat veszünk figyelembe, amelyek legalább kétszer felsorolásra kerültek.

        Map<Country,Integer> numberOfCountries = townSet.stream()
                .collect(Collectors.toMap(
                        town -> town.getCountry(),
                        town -> 1,
                        (value1, value2) -> value1 + value2
                ));

        Set<Country> moreThanOneCountries = numberOfCountries.entrySet().stream()
                .filter(keyvalue -> keyvalue.getValue()>1)
                .map(keyvalue -> keyvalue.getKey())
                .collect(Collectors.toSet());

        Optional<Town> moreThanOneCountriesOptional = townSet.stream()
                .filter(town -> moreThanOneCountries.contains(town.getCountry()))
                .max((towni, townj)-> towni.getNumberOfCitizens() - townj.getNumberOfCitizens());

        if(moreThanOneCountriesOptional.isPresent()){
            System.out.println(moreThanOneCountriesOptional.get());
        }

    }

    /*public static <T>Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));

     */
    }





