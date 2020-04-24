package extra;

import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {

    public static void main(String[] args) {

        Map<String, String> englGermanDictionary = new HashMap<String, String>();

        englGermanDictionary.put("Monday", "Montag");
        englGermanDictionary.put("Tuesday", "Dienstag");
        englGermanDictionary.put("Wednesday", "Mittwoch");
        englGermanDictionary.put("Thursday", "Donnerstag");
        englGermanDictionary.put("Friday", "Freitag");
        englGermanDictionary.put("Saturday", "Samstag");
        englGermanDictionary.put("Sunday", "Sonntag");

        System.out.println(englGermanDictionary.get("Monday"));
        System.out.println(englGermanDictionary.get("Tuesday"));
        System.out.println(englGermanDictionary.get("Wednesday"));
        System.out.println(englGermanDictionary.get("Thursday"));
        System.out.println(englGermanDictionary.get("Friday"));
        System.out.println(englGermanDictionary.get("Saturday"));
        System.out.println(englGermanDictionary.get("Sunday"));
        //Print all keys
        System.out.println(englGermanDictionary.keySet());
        //Printing values of the keys
        System.out.println(englGermanDictionary.values());
        //Printing out size
        System.out.println("The size of our dictionary is: " + englGermanDictionary.size());

        System.out.println();
        System.out.println();

        //Shopping list
        Map<String, Boolean> basket = new HashMap<String, Boolean>();
        basket.put("Avokado", true);
        basket.put("Meat", Boolean.TRUE);
        basket.put("Bread", Boolean.TRUE);
        basket.put("Eggs", Boolean.FALSE);
        basket.put("Sugar", false);
        // Retrive items
        System.out.println(basket.get("Bread"));
        System.out.println(basket.get("Sugar"));

        basket.remove("Eggs");
        System.out.println(basket.toString());
        System.out.println(" This basket is empty? " + basket.isEmpty());
        basket.clear();

        System.out.println(basket.toString());
        System.out.println(" This basket is empty? " + basket.isEmpty());

    }
}
