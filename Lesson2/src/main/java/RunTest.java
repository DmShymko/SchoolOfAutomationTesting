import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RunTest {
    public static void main(String[] args) {
        String driver = RunTest.setDriver("chromeDriver");
        switch (driver) {
            case "firefoxDriver":
                // some code
                System.out.println("firefoxDriver");
                break;
            case "chromeDriver":
                // some code
                System.out.println("chromeDriver");
                break;
            case "operaDriver":
                // some code
                System.out.println("operaDriver");
                break;
            default:
                //some code
                System.out.println("default browser");
        }

        int arayInt[];
        arayInt = new int[6];
        arayInt[0] = 1;
        arayInt[1] = 2;
        arayInt[2] = 3;
        arayInt[3] = 4;
        arayInt[4] = 5;
        arayInt[5] = 6;

        String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[0]);

        Film films [] = new Film[3];
        films [0] = new Film();
        System.out.println("aray size: "+ week.length);
        System.out.println(week);

        for (int i = 0; i < week.length; i++ ){
            System.out.println(week[i]);
        }

        for (String day : week){
            System.out.println(day);
        }

        String name = "Dymitr Shymka";
        System.out.println(name.length());

        List<Film> greatFilmList = new ArrayList<>(); //import java.util.*;
        greatFilmList.add(new Film());
        List<Film> badFilmList = new ArrayList<>();
        badFilmList.add(new Film());
        badFilmList.add(new Film());
        badFilmList.add(new Film());

        System.out.println("Size badFilmsList collections: "+ badFilmList.size());
        System.out.println("Size greatFilmsList collections: "+ greatFilmList.size());
        greatFilmList.addAll(badFilmList);
        System.out.println("Size greatFilmsList collections: "+ badFilmList.size());
        System.out.println("Size greatFilmsList collections: "+ greatFilmList.size());

        badFilmList.clear();
        System.out.println("Is the collection empty? "+ badFilmList.isEmpty());
        System.out.println("Is the collection empty? "+ greatFilmList.isEmpty());

        List<String> users = new ArrayList<>();
        users.add("Joe");
        users.add("Bob");
        users.add("Rob");
        users.add("Alex");
        users.add(0,"Alex");
        System.out.println(users.get(0)); //Give value with index 0
        System.out.println("Joe`s index : "+ users.indexOf("Joe"));

        for (String user : users){
            System.out.println(user);
        }
        System.out.println(users.contains("Michael")); //Is Michael on the list?

        users.remove("Rob"); //deletion and return true if deletion is correct

        String [] usersArray = users.toArray(new String[0]);
        System.out.println(usersArray);

        Set<String> usersSet = new HashSet<>(); // set // import java.util.Set //import java.util.HashSet
        System.out.println(usersSet.add("Mike"));
        System.out.println(usersSet.add("Jack"));
        System.out.println(usersSet.add("Sonia"));
        System.out.println(usersSet.add("Sonia"));

        for (String userSet : usersSet){
            System.out.println("Set value: ");
            System.out.println(userSet);  // iteration for set
        }

        Set<String> users2Set = Set.of("Tod", "Kolt", "Wolt", "Iga");
        System.out.println("Size second set: "+users2Set);

        String name1 = "Greg";
        String name2 = new String("Jerry");
        String name3 = "Marry";
        String name4 = name3;
        String name5 = "Greg";
        System.out.println(name3);
        name3.toUpperCase(); //String is immutable. Should be assigned to a new String
        System.out.println(name3);//String is immutable Should be assigned to a new String
        String nameToUpperCase = name3.toUpperCase(); //Assignment to a new String
        System.out.println(nameToUpperCase);
        name3.toLowerCase();
        name3.length();
        name3.charAt(3);
        System.out.println(name3.contains("abc")); //search abc in name3 (Marry)
        System.out.println(name3.contains("Mar")); //search Mar in name3 (Marry)
        System.out.println(name3.indexOf("a")); // What position is the letter a in name3 (Marry)
        String par = name3.concat(" and Joseph"); //Concatenation
        System.out.println(par);
        System.out.println(name1==name5);
        System.out.println(name1.equals(name5));

        String stringNumber = "1983";
        int intNumber = Integer.parseInt(stringNumber);
        double doubleNumber = Double.parseDouble(stringNumber);
        System.out.println(stringNumber);
        System.out.println(intNumber);
        System.out.println(doubleNumber);

        System.out.println(stringNumber.getClass().getSimpleName()); //check variable type
        System.out.println(((Object) stringNumber).getClass().getSimpleName());//customization//change type value na other type value

        boolean boolStr = stringNumber instanceof String? true:false; //operator checking type variable
        System.out.println(boolStr);

        Integer intNunber = new Integer(1983);
        boolean boolInt = intNunber instanceof Integer?true:false;
        System.out.println(boolStr);

    }

    private static String setDriver(String driver) {
        return driver;
    }
}
