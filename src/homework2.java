import java.util.*;

public class homework2 {
    public static void main(String[] args) {

        //check if the strings are equal
        //concatenate them into one single string
        String s1 = "Prima";
        String s2 = "vara";

        // Comparing strings
        System.out.println("Comparing " + s1 + " and " + s2 + " : " + s1.equals(s2));
        System.out.println("Single string " + s1 + " and " + s2 + " : " + s1.concat(s2));

        //string is a palindrome
        String s3 = "abbya";
        String reverse = new StringBuffer(s3).reverse().toString();
        if (s3.equals(reverse))
            System.out.println("String " + s3 + " is palindrome");
        else
            System.out.println("String is not palindrome");

        //exercise 3
        String empty = "";
        List<String>EmptyList = Collections.emptyList();
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("Mango");
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Grapes");
        ArrayList<String> vowel=new ArrayList<String>();
        vowel.add("a");
        vowel.add("e");
        vowel.add("i");
        vowel.add("o");
        vowel.add("u");
        //If the word starts with a vowel, make it all lowercase and append it to the empty string



        // Map
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("Maria","test@email.com");
        map.put("Ioana","t@email.com");
        map.put("Ana","testing@email.com");
        map.put("Ana Maria","tes@email.com");

        //map size
        System.out.println("The size of the map is " + map.size());
        //check for a specific name
        String a = "Ana";
        //check the email contains a specific name
        System.out.println("The email for " + a + " is " + map.get(a));
        //remove an entry
        System.out.println("The entry removed is: " + map.remove(a));
        //sort
        SortedSet<String> keySet = new TreeSet<>(map.keySet());
        System.out.println("Sorted map is " + keySet);
    }
}
