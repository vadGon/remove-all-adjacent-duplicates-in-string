import java.util.Stack;
import java.util.stream.Collectors;

public class Solution {
    public static String removeAdjacentDuplicates(String data, int k) {

        Stack<Character> stack = new Stack<>();

        char[] arr = data.toCharArray();

        for (int i = 0; i < arr.length; i++) {


            if (!stack.empty() && stack.size() >= k - 1 && stack.peek().charValue() == arr[i]) {

                boolean allSame = true;

                for (int j = 1; j < k; j++) {
                    if (stack.get(stack.size() - j).charValue() != arr[i]) {
                        allSame = false;
                    }
                }
                if (allSame) {
                    for (int q = 1; q < k; q++) {
                        stack.pop();
                    }
                } else {
                    stack.push(arr[i]);
                }
            } else {
                stack.push(arr[i]);
            }
        }
        return stack.stream().map(i -> i.toString()).collect(Collectors.joining(""));
    }
}