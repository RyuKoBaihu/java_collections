package SetandHashSetTest;

import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Bjorn");
        names.add("Ragnar");
        names.add("Althered");
        names.add("Berserk");
        names.add("Berserk");
        names.add("Tom Ford");
        names.add("Nightwolf");

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

    }

}
