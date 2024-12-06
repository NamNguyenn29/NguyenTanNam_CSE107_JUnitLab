package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        char[] characters = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = characters.length - 1; i >= 0; i--) {
            sb.append(characters[i]);
        }
        return sb.toString();
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String[] characters = input.split("");
        int j = characters.length - 1;
        for (int i = 0; i < characters.length / 2; i++) {
            if (!(characters[i].equals(characters[j]))) {
                return false;
            }
            j--;
        }
        return true;
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        if (!(input.contains(part))) {
            return false;
        }
        return true;
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {

        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        String[] tokens = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            String eachTokens = tokens[i];
            sb.append(eachTokens.substring(0, 1).toUpperCase() + eachTokens.substring(1).toLowerCase()).append(" ");
        }

        return sb.toString().trim();
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        int count = 0;
        String vowels = "ueoaiUEOAI";
        String[] characters = input.split("");
        for (int i = 0; i < characters.length; i++) {
            if (vowels.indexOf(characters[i]) != -1) {
                count++;
            }

        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        String[] tokens = sentence.split(" ");
        return tokens.length;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        if (input.contains(substring)) {
            return input.indexOf(substring);
        }
        return -1;
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        String tokens[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = tokens.length - 1; i >= 0; i--) {
            sb.append(tokens[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
