public class EXER_1_Functional {

    // Functional approach recursion, no loops, no mutable state
    public static String reverse(String text) {
        // Base case: if the string is empty, return it as is
        if (text.isEmpty()) return text;

        // Recursive case:
        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {
        // Original string
        String text = "Paradigm";

        // Call the recursive function to reverse the string
        System.out.println("Functional Reversed: " + reverse(text));
    }
}
