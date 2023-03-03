import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public static String removeAdjacentDuplicates(String data) {

        Stack<Character> stack = new Stack<>();

        char[] arr = data.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (!stack.empty() && stack.peek().charValue() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);

            }
        }
        return stack.stream().map(i -> i.toString()).collect(Collectors.joining(""));
    }
}