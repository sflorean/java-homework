import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class homework3 {
    public static void main(String[] args) {
        System.out.println(compareStrings("hello", "summer"));
        System.out.println(changeString("paralelipiped"));
        System.out.println(getEvenAndOdd());

        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;
        getUniqueValues(arr, n);

        System.out.println(findSmth("tesstingg"));

    }

    //2. Create a method that takes two strings as input, and returns true if the strings are equal in length
    static boolean compareStrings(String s1, String s2) {
        boolean result;
        result = s1.length() == s2.length();
        return result;
    }

    //3. Create a method that takes a string as input, formats the string so that the
    // vowels are uppercase and consonants are lowercase and returns the formatted string
    static String changeString(String s3) {
        System.out.println("original string = " + s3);
        return s3.replaceAll("a", "A").replaceAll("e", "E")
                .replaceAll("i", "I").replaceAll("o", "O")
                .replaceAll("u", "U");
    }

    //4. Create a method that takes an array of integers as input, and returns a map containing the number
    // of even integers and odd integers as two separate keys with corresponding values.
    //Example: [1,2,6,13,1,20,56,17,12] -> {even:5 ,odd: 4}
    public static char getEvenAndOdd() {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
        return 0;
    }

    //5. Create a method that takes as input an array of integers that can contain
    // multiple occurrences of the same value, return an array containing only the unique values
    //Example: [1,4,5,4,2,5] -> [1,4,5,2]
    public static void getUniqueValues(int[] arr, int n) {
        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier,
            // then print it
            if (i == j)
                System.out.print("Unique elements: " + arr[i] + " ");
        }
    }


    //6. Create a method that takes as input an array of strings array (List<List<String>>).
    // Find the string with the largest number of vowels, and the string with the largest number
    // of consonants respectively. If there are multiple strings with the same max number,
    // save them both as an array. Return the result as a map:
    //Result example: {largestVowelsNo : {[aaaastring,eeaastring]: 5} ,largestConsonantsNo: {bbbbstring: 9}}
    // public static String findLargestNrVowels (String s1, String s2, String s3) {
    ArrayList<String> l = new ArrayList<String>();

    static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U');
    }

    static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) // Check for vowel
                ++count;
        return count;
    }


    //7.Create a method that takes a string as input. If it contains multiple occurrences
    // of the same character consecutively, return that occurrence sequence:
    //Example: thisstringisweird -> ss
    //Optional: if there are multiple occurrences (sss, aaa etc), return them as an array
    public static boolean findSmth(String s4) {
        int n = s4.length();
        char res = s4.charAt(0);

        // Traverse string except last character
        for (int i = 0; i < n; i++) {
            // If current character matches with next
            if (i < n - 1 && s4.charAt(i) == s4.charAt(i + 1))
                System.out.println("String: ");

        }
        return false;
    }
}
