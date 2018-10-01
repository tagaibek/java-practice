package challenge.a.day;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.Stack;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class BraceBracketParentheses {

    private static boolean isValid(String code) {
        Stack<Character> openers = new Stack<>();

        for (char c : code.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                openers.push(c); //blindly add any opener to the stack
            } else {
                //you cannot have closer without its opener
                if (openers.isEmpty()) return false;

                char opener = openers.pop();

                //check that closer matches the opener
                if (c == ')' && opener != '(' ||
                    c == ']' && opener != '[' ||
                    c == '}' && opener != '{') {
                    return false;
                }
            }
        }

        return openers.isEmpty();
    }

    @Test
    public void validShortCodeTest() {
        final boolean result = isValid("()");
        assertTrue(result);
    }

    @Test
    public void validLongerCodeTest() {
        final boolean result = isValid("([]{[]})[]{{}()}");
        assertTrue(result);
    }

    @Test
    public void mismatchedOpenerAndCloserTest() {
        final boolean result = isValid("([][]}");
        assertFalse(result);
    }

    @Test
    public void interleavedOpenersAndClosersTest() {
        final boolean result = isValid("([)]");
        assertFalse(result);
    }

    @Test
    public void missingCloserTest() {
        final boolean result = isValid("[[]()");
        assertFalse(result);
    }

    @Test
    public void extraCloserTest() {
        final boolean result = isValid("[[]]())");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = isValid("");
        assertTrue(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
