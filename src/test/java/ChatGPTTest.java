public class ChatGPTTest {
    private static void testPushAndPeek() {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        assertEqual(s.peek(), 20, "testPushAndPeek\t\t\t");
    }

    private static void testPop() {
        Stack s = new Stack(3);
        s.push(5);
        s.push(15);
        int popped = s.pop();
        assertEqual(popped, 15, "testPop - popped value\t\t");
        assertEqual(s.size(), 1, "testPop - size after pop\t");
    }

    private static void testIsEmptyInitially() {
        Stack s = new Stack(2);
        assertTrue(s.isEmpty(), "testIsEmptyInitially\t\t");
    }

    private static void testIsFull() {
        Stack s = new Stack(2);
        s.push(1);
        s.push(2);
        assertTrue(s.isFull(), "testIsFull\t\t\t");
    }

    private static void testSizeIncreasesOnPush() {
        Stack s = new Stack(5);
        s.push(100);
        s.push(200);
        assertEqual(s.size(), 2, "testSizeIncreasesOnPush\t\t");
    }

    private static void testSizeDecreasesOnPop() {
        Stack s = new Stack(3);
        s.push(7);
        s.push(8);
        s.pop();
        assertEqual(s.size(), 1, "testSizeDecreasesOnPop\t\t");
    }

    private static void testPopOnEmptyStack() {
        Stack s = new Stack(2);
        try {
            s.pop();
            System.out.println("testPopOnEmptyStack FAILED (no exception thrown)");
        } catch (IllegalStateException e) {
            System.out.println("testPopOnEmptyStack \t\t PASSED");
        }
    }

    private static void testPushOnFullStack() {
        Stack s = new Stack(2);
        s.push(10);
        s.push(20);
        try {
            s.push(30);
            System.out.println("testPushOnFullStack FAILED (no exception thrown)");
        } catch (IllegalStateException e) {
            System.out.println("testPushOnFullStack \t\t PASSED");
        }
    }

    private static void testPeekOnEmptyStack() {
        Stack s = new Stack(3);
        try {
            s.peek();
            System.out.println("testPeekOnEmptyStack FAILED (no exception thrown)");
        } catch (IllegalStateException e) {
            System.out.println("testPeekOnEmptyStack \t\t PASSED");
        }
    }

    private static void testPushPopSequence() {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        int a = s.pop();
        int b = s.pop();
        int c = s.pop();
        if (a == 3 && b == 2 && c == 1 && s.isEmpty()) {
            System.out.println("testPushPopSequence \t\t PASSED");
        } else {
            System.out.println("testPushPopSequence FAILED");
        }
    }

    // === Helper assertion methods ===
    private static void assertEqual(int actual, int expected, String testName) {
        if (actual == expected) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName + " FAILED (expected " + expected + ", got " + actual + ")");;
        }
    }

    private static void assertTrue(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName + " FAILED");
        }
    }
    
    public static void main(String[] args) {
        testPushAndPeek();
        testPop();
        testIsEmptyInitially();
        testIsFull();
        testSizeIncreasesOnPush();
        testSizeDecreasesOnPop();
        testPopOnEmptyStack();
        testPushOnFullStack();
        testPeekOnEmptyStack();
        testPushPopSequence();
    }
}
