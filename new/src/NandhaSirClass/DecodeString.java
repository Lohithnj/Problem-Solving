package NandhaSirClass;

import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static String decodedString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        String currentString = "";
        int currentNum = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the number
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                // Push the current string and number onto the stacks
                counts.push(currentNum);
                stack.push(currentString);
                currentString = "";  // Reset current string
                currentNum = 0;      // Reset current number
            } else if (c == ']') {
                // Pop from stacks and form the new string
                StringBuilder temp = new StringBuilder(stack.pop());
                int repeatCount = counts.pop();
                for (int i = 0; i < repeatCount; i++) {
                    temp.append(currentString);
                }
                currentString = temp.toString();  // Update current string
            } else {
                currentString += c;  // Append regular character
            }
        }

        return currentString;
    }

    public static void main(String[] args) {
        Scanner solution = new Scanner(System.in);
        System.out.println(decodedString("3[b2[ca]]"));  // Output: "bcacabcacabcaca"
        System.out.println(decodedString("1[b]"));       // Output: "b"
    }
}
