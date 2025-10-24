import java.util.*;
public class StringSortAndCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] strings = new String[n];
        // Input strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
            strings[i]=strings[i].toLowerCase();
        }
        // Sort strings alphabetically
        Arrays.sort(strings);
        System.out.println("\nStrings in alphabetical order with vowel and consonant count:");
        for (String str : strings) {
            int vowels = 0, consonants = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if ("aeiouAEIOU".indexOf(ch) != -1) {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }
            System.out.println(str + " -> Vowels: " + vowels + ", Consonants: " + consonants);
        }
        sc.close();
    }
}