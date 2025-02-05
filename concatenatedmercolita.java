public class Main {
    public static String concatenateStrings(String str1, String str2, String str3) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        
        // Create a char array large enough to hold all characters from the four strings
        char[] result = new char[len1 + len2 + len3];

        int i = 0;
        // Copy characters from str1
        while (i < len1) {
            result[i] = str1.charAt(i);
            i++;
        }

        // Copy characters from str2
        int j = 0;
        while (i < len1 + len2) {
            result[i] = str2.charAt(j);
            i++;
            j++;
        }

        // Copy characters from str3
        j = 0;
        while (i < len1 + len2 + len3) {
            result[i] = str3.charAt(j);
            i++;
            j++;
        }

        // Return the concatenated string
        return new String(result);
    }

    public static void main(String[] args) {
        String str1 = "Meann";
        String str2 = "Maudo";
        String str3 = "Mercolita";

        // Call the method with 4 strings
        String concatenatedString = concatenateStrings(str1, str2, str3);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}