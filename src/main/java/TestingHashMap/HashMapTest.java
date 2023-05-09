package TestingHashMap;

//Setting keys value pairs. We're gonna use HashMap to organize a list with names and id numbers of an imaginary company

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.replaceAll;

public class HashMapTest {
    public static void main(String[] args) {
        //Here we specify for Java that the map will receive strings and integers
        HashMap<String,String> empIds = new HashMap<>();
        // Implementing values in empIds

        empIds.put("Matheus","8776307");
        empIds.put("Bjorn","84527642");
        empIds.put("Ragnar","33453463");

        System.out.println("Find ID by primary Key: " + empIds.get("Matheus"));


    }
}
