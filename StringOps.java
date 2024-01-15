public class StringOps {
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("One two tHRee world"));
    }

    public static String capVowelsLowRest (String string) {
        String  vowels = "aioueAIOUE";
        String res = "";
        int size = string.length();

        for (int i = 0; i < size; i++){
            char ch = string.charAt(i);
            if(ch == ' '){
                res = res + ch;
            }
            else if(vowels.indexOf(ch) != -1){
                if(ch >='A' && ch <='Z') {
                    res = res + ch;
                }
                else{
                    res = res +  (char) (ch - ('a' - 'A'));
                }
            }
            else{
                if(ch >='a' && ch <='z') {
                    res = res + ch;
                }
                else{
                    res = res +  (char) (ch + ('a' - 'A'));
                }
            }
        }
        return res;
    }

    public static String camelCase (String string) {
         
        if (string == null || string.isEmpty()) {
            return "";
        }

        // Rule 1: The first word should be in lowercase.
        string = makeFirstWordLowercase(string);

        // Rule 2: Every word should start with an uppercase letter, and the rest should be lowercase.
        string = capitalizeWords(string);


        return string;
            
    }

    private static String makeFirstWordLowercase(String input) {
        return input.trim().split("\\s+")[0].toLowerCase() + input.substring(input.indexOf(" ") + 1);
    } 

    private static String capitalizeWords(String input) {
          String[] words = input.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
        }

        return result.toString();
    }

    public static int[] allIndexOf(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                indices[index++] = i;
            }
        }

        return indices;
    }
}

