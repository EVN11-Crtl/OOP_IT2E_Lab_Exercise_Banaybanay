public class EXER_1_Imperative {
    public static void main(String[] args) {
        // Original string
        String text = "Paradigm";

        // Variable to store the reversed version
        String reversed = "";

        // Start from the last character and go backwards
        for (int i = text.length() - 1; i >= 0; i--) {
            // Append each character in reverse order
            reversed += text.charAt(i);
        }

        // Print the reversed string
        System.out.println("Imperative Reversed: " + reversed);
    }
}

