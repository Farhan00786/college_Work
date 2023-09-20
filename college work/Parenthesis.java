import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char ch : s.toCharArray()) {
            if (bracketMap.containsKey(ch)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMap.get(ch)) {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string containing brackets: ");
        String inputString = scanner.nextLine();

        if (isValid(inputString)) {
            System.out.println("Valid Syntax");
        } else {
            System.out.println("Invalid Syntax");
        }
    }
}