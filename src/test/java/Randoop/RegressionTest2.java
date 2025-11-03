package Randoop;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (short) 1);
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(2);
        stack1.push(35);
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        stack1.push((int) (byte) 1);
        stack1.push((int) (byte) -1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 0);
        stack1.push(4);
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) ' ');
        stack1.push(0);
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        stack1.push(35);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.peek();
        int int14 = stack1.size();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isFull();
        stack1.push(52);
        int int17 = stack1.peek();
        stack1.push((-1));
        int int20 = stack1.size();
        java.lang.Class<?> wildcardClass21 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        stack1.push(100);
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.pop();
        stack1.push(35);
        int int12 = stack1.size();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        stackproject.Stack stack1 = new stackproject.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.pop();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        stack1.push(1);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        stackproject.Stack stack1 = new stackproject.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        stack1.push((int) (byte) 10);
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 100);
        stack1.push(2);
        int int4 = stack1.peek();
        stack1.push(97);
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        int int17 = stack1.peek();
        boolean boolean18 = stack1.isEmpty();
        boolean boolean19 = stack1.isFull();
        stack1.push(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        stack1.push(35);
        stack1.push((-1));
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        int int15 = stack1.peek();
        stack1.push((int) '#');
        stack1.push((int) (short) 10);
        int int20 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(52);
        boolean boolean12 = stack1.isFull();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) (byte) -1);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push(1);
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(52);
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        stack1.push(3);
        boolean boolean16 = stack1.isFull();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        int int9 = stack1.peek();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        stack1.push(35);
        stack1.push((-1));
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(3);
        stack1.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) (byte) -1);
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(52);
        stack1.push(52);
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) (short) 1);
        int int18 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 100);
        stack1.push(3);
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 100);
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        stack1.push(52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(100);
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        stackproject.Stack stack1 = new stackproject.Stack(97);
        boolean boolean2 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        int int15 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        stack1.push(100);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        stack1.push(4);
        stack1.push(5);
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        stack1.push(3);
        int int11 = stack1.size();
        stack1.push(52);
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        stackproject.Stack stack1 = new stackproject.Stack(35);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        int int14 = stack1.peek();
        stack1.push(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.pop();
        stack1.push(32);
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        stackproject.Stack stack1 = new stackproject.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        stack1.push(0);
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.pop();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        stack1.push(0);
        boolean boolean11 = stack1.isFull();
        stack1.push(35);
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        stack1.push(35);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        stack1.push((int) ' ');
        stack1.push(35);
        stack1.push((int) ' ');
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) (byte) 1);
        stack1.push((int) (byte) 10);
        int int17 = stack1.size();
        int int18 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(1);
        int int10 = stack1.pop();
        stack1.push((int) (byte) 1);
        int int13 = stack1.size();
        stack1.push((int) (short) -1);
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) 'a');
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        boolean boolean4 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        stack1.push((int) (byte) 10);
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        int int11 = stack1.peek();
        stack1.push((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        stackproject.Stack stack1 = new stackproject.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (byte) 1);
        int int7 = stack1.size();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 1);
        int int9 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(100);
        boolean boolean15 = stack1.isEmpty();
        stack1.push(32);
        stack1.push((int) (short) -1);
        boolean boolean20 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        stack1.push(3);
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        stack1.push(52);
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 100);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        stack1.push(32);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        stack1.push(10);
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        int int3 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        stack1.push(0);
        boolean boolean11 = stack1.isFull();
        stack1.push(35);
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.peek();
        stack1.push(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push(97);
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        stack1.push(1);
        boolean boolean10 = stack1.isFull();
        stack1.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(10);
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        stack1.push((int) (byte) 100);
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        stackproject.Stack stack1 = new stackproject.Stack((int) 'a');
        stack1.push(2);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int11 = stack1.pop();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(3);
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(1);
        boolean boolean18 = stack1.isFull();
        int int19 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        stack1.push((int) (short) 0);
        boolean boolean17 = stack1.isFull();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        stack1.push(1);
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.peek();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        int int17 = stack1.pop();
        stack1.push((int) (short) 0);
        boolean boolean20 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(1);
        int int10 = stack1.pop();
        stack1.push((int) (byte) 1);
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) 'a');
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push((int) (short) 100);
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        stack1.push(32);
        int int13 = stack1.peek();
        stack1.push(5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        stack1.push(97);
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) 'a');
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        int int13 = stack1.size();
        int int14 = stack1.peek();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        stack1.push(10);
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        stack1.push((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        stackproject.Stack stack1 = new stackproject.Stack(100);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) ' ');
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        stackproject.Stack stack1 = new stackproject.Stack((int) '#');
        int int2 = stack1.size();
        int int3 = stack1.size();
        int int4 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        int int15 = stack1.peek();
        stack1.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.peek();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        int int12 = stack1.peek();
        stack1.push((int) (short) 0);
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.pop();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        stack1.push(2);
        int int17 = stack1.peek();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        stack1.push((int) (short) 1);
        int int19 = stack1.peek();
        java.lang.Class<?> wildcardClass20 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 1);
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(10);
        int int10 = stack1.size();
        int int11 = stack1.pop();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        stack1.push(3);
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        stackproject.Stack stack1 = new stackproject.Stack((int) '#');
        int int2 = stack1.size();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        int int12 = stack1.pop();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.size();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) 'a');
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.peek();
        stack1.push(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        stack1.push((int) '#');
        int int17 = stack1.pop();
        int int18 = stack1.pop();
        stack1.push(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push(97);
        int int13 = stack1.size();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        int int14 = stack1.size();
        boolean boolean15 = stack1.isEmpty();
        stack1.push(3);
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        stack1.push(97);
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        stack1.push((int) '4');
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        int int6 = stack1.size();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        int int12 = stack1.peek();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push(32);
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        stack1.push((int) (short) 0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) '4');
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        stackproject.Stack stack1 = new stackproject.Stack((int) 'a');
        stack1.push(2);
        int int4 = stack1.pop();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        stackproject.Stack stack1 = new stackproject.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean7 = stack1.isEmpty();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        stackproject.Stack stack1 = new stackproject.Stack(0);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        int int11 = stack1.peek();
        stack1.push((int) (short) 0);
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isFull();
        stack1.push(6);
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        stack1.push((int) '4');
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        stackproject.Stack stack1 = new stackproject.Stack(2);
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean5 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.size();
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isEmpty();
        stack1.push(4);
        int int21 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.peek();
        int int14 = stack1.size();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(52);
        int int12 = stack1.peek();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        int int18 = stack1.size();
        int int19 = stack1.peek();
        int int20 = stack1.pop();
        boolean boolean21 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        stackproject.Stack stack1 = new stackproject.Stack(2);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        boolean boolean8 = stack1.isFull();
        stack1.push(52);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push((int) ' ');
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) 10);
        stack1.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        stack1.push((int) (byte) -1);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        stack1.push(3);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) (byte) 1);
        stack1.push((int) (byte) 10);
        int int17 = stack1.size();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (byte) -1);
        int int11 = stack1.peek();
        stack1.push((int) (byte) -1);
        int int14 = stack1.pop();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push(2);
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push(3);
        stack1.push((int) (short) 10);
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 100);
        stack1.push(2);
        int int4 = stack1.peek();
        stack1.push((int) ' ');
        stack1.push((-1));
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        stack1.push((int) (short) 0);
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        stack1.push((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        stack1.push((int) (short) 0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        stackproject.Stack stack1 = new stackproject.Stack((int) ' ');
        boolean boolean2 = stack1.isFull();
        stack1.push(52);
        boolean boolean5 = stack1.isFull();
        stack1.push((int) 'a');
        boolean boolean8 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        int int12 = stack1.peek();
        stack1.push((int) (short) 0);
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.size();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        stackproject.Stack stack1 = new stackproject.Stack((int) ' ');
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(1);
        int int10 = stack1.pop();
        stack1.push((int) (short) 1);
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        int int15 = stack1.pop();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        int int18 = stack1.size();
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        boolean boolean18 = stack1.isFull();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        stack1.push(35);
        stack1.push(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        int int16 = stack1.peek();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean16 = stack1.isFull();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isEmpty();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        stack1.push(3);
        int int11 = stack1.size();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        stackproject.Stack stack1 = new stackproject.Stack(0);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.size();
        int int17 = stack1.size();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        stack1.push((int) (short) 0);
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        stack1.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(100);
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 0);
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.size();
        stack1.push(100);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(52);
        stack1.push(52);
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) (short) 1);
        boolean boolean18 = stack1.isEmpty();
        stack1.push((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        stack1.push((int) (byte) 10);
        int int10 = stack1.size();
        int int11 = stack1.size();
        stack1.push(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        int int8 = stack1.pop();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 0);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        stack1.push(32);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        int int12 = stack1.peek();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        int int17 = stack1.pop();
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        stack1.push((int) '#');
        int int11 = stack1.peek();
        stack1.push(3);
        int int14 = stack1.size();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        int int4 = stack1.pop();
        stack1.push(5);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        int int4 = stack1.size();
        stack1.push(6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push(1);
        int int14 = stack1.size();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.pop();
        stack1.push(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isEmpty();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        stack1.push((int) (short) 0);
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) ' ');
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) (short) 10);
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        stack1.push(6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (short) 10);
        int int13 = stack1.size();
        stack1.push((int) (short) -1);
        int int16 = stack1.size();
        boolean boolean17 = stack1.isFull();
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        stack1.push(52);
        boolean boolean14 = stack1.isEmpty();
        stack1.push(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push(0);
        stack1.push((int) (short) -1);
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        stack1.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.size();
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (short) 1);
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        stack1.push(0);
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push(0);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push(1);
        stack1.push((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        stackproject.Stack stack1 = new stackproject.Stack((int) 'a');
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean7 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) 'a');
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        stack1.push(97);
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        stack1.push((int) (short) 100);
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(2);
        stack1.push(35);
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        stack1.push((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.pop();
        int int17 = stack1.size();
        int int18 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) 'a');
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(52);
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        stackproject.Stack stack1 = new stackproject.Stack(100);
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) 'a');
        int int10 = stack1.pop();
        stack1.push((int) (short) 100);
        int int13 = stack1.size();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        stack1.push(52);
        boolean boolean15 = stack1.isFull();
        stack1.push(32);
        java.lang.Class<?> wildcardClass18 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        stack1.push((int) (byte) 1);
        int int6 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push(32);
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.size();
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isFull();
        stack1.push(4);
        int int8 = stack1.size();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push(0);
        stack1.push((int) (short) -1);
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        stackproject.Stack stack1 = new stackproject.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        stack1.push((int) ' ');
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        stack1.push((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.size();
        stack1.push((int) (byte) 10);
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        stack1.push(0);
        int int13 = stack1.pop();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((int) (byte) 100);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        int int14 = stack1.size();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        stack1.push(5);
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        stackproject.Stack stack1 = new stackproject.Stack(0);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.peek();
        stack1.push((int) (byte) 100);
        boolean boolean16 = stack1.isFull();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        stack1.push((int) (byte) 100);
        stack1.push(35);
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        int int15 = stack1.pop();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        stackproject.Stack stack1 = new stackproject.Stack(10);
        stack1.push(6);
        int int4 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) (byte) 1);
        stack1.push(52);
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.size();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 100);
        stack1.push(2);
        int int4 = stack1.peek();
        stack1.push((int) ' ');
        boolean boolean7 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        stackproject.Stack stack1 = new stackproject.Stack((int) 'a');
        stack1.push(2);
        boolean boolean4 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isFull();
        stack1.push(4);
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        stack1.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(97);
        int int13 = stack1.pop();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(100);
        int int15 = stack1.peek();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        stack1.push((int) (short) 10);
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push(0);
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        stack1.push((int) (short) 100);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        int int12 = stack1.peek();
        stack1.push((int) (short) 0);
        boolean boolean15 = stack1.isFull();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        int int16 = stack1.peek();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        stack1.push(100);
        boolean boolean5 = stack1.isFull();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        stack1.push(10);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        boolean boolean2 = stack1.isEmpty();
        stack1.push(100);
        boolean boolean5 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.pop();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 100);
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.size();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        stackproject.Stack stack1 = new stackproject.Stack((int) '#');
        int int2 = stack1.size();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 100);
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.pop();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        stack1.push(1);
        int int12 = stack1.pop();
        stack1.push((int) ' ');
        int int15 = stack1.peek();
        stack1.push((int) (byte) 100);
        boolean boolean18 = stack1.isEmpty();
        int int19 = stack1.peek();
        boolean boolean20 = stack1.isEmpty();
        int int21 = stack1.pop();
        boolean boolean22 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int11 = stack1.size();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        stackproject.Stack stack1 = new stackproject.Stack(100);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int6 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        int int8 = stack1.size();
        stack1.push(3);
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) (short) 1);
        boolean boolean8 = stack1.isFull();
        stack1.push(0);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        stackproject.Stack stack1 = new stackproject.Stack(0);
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        stack1.push(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        stack1.push((int) (short) 1);
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        int int9 = stack1.size();
        stack1.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 100);
        stack1.push(2);
        stack1.push(5);
        stack1.push((int) (byte) 100);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push(52);
        stack1.push(2);
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push(52);
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(3);
        stack1.push((int) (byte) 10);
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        stackproject.Stack stack1 = new stackproject.Stack(52);
        stack1.push((int) (short) 1);
        stack1.push((int) '#');
        int int6 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        stack1.push(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        stack1.push((int) '#');
        int int17 = stack1.pop();
        int int18 = stack1.pop();
        int int19 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(3);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(52);
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        int int15 = stack1.peek();
        int int16 = stack1.size();
        int int17 = stack1.pop();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        stack1.push(32);
        stack1.push((int) (short) -1);
        int int15 = stack1.pop();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        stack1.push(100);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        stack1.push(32);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        int int15 = stack1.peek();
        int int16 = stack1.size();
        int int17 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        stackproject.Stack stack1 = new stackproject.Stack(2);
        boolean boolean2 = stack1.isFull();
        stack1.push(0);
        int int5 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        stack1.push(97);
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int16 = stack1.peek();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push(2);
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        int int15 = stack1.size();
        int int16 = stack1.pop();
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) 'a');
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.pop();
        stack1.push((int) (short) 10);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        int int6 = stack1.pop();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isFull();
        stack1.push(52);
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        stack1.push(3);
        int int13 = stack1.pop();
        stack1.push(100);
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isFull();
        int int19 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        stack1.push((int) (short) 0);
        stack1.push(100);
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push(3);
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        stack1.push(52);
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 1);
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        stackproject.Stack stack1 = new stackproject.Stack((int) '#');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        stackproject.Stack stack1 = new stackproject.Stack((int) '4');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push(32);
        boolean boolean14 = stack1.isFull();
        stack1.push(52);
        int int17 = stack1.peek();
        stack1.push((-1));
        boolean boolean20 = stack1.isFull();
        int int21 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        stack1.push((int) (short) 0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(0);
        int int15 = stack1.size();
        int int16 = stack1.size();
        int int17 = stack1.size();
        int int18 = stack1.peek();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 100);
        stack1.push(2);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        int int8 = stack1.pop();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) (byte) 1);
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) 'a');
        stack1.push((-1));
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) '4');
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) 'a');
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        stack1.push(32);
        int int12 = stack1.size();
        stack1.push((int) '#');
        stack1.push(0);
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) 'a');
        int int10 = stack1.pop();
        stack1.push((int) (short) 100);
        int int13 = stack1.pop();
        int int14 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) (byte) 1);
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(2);
        stack1.push(35);
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        stack1.push(3);
        boolean boolean16 = stack1.isFull();
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        stack1.push(52);
        int int10 = stack1.pop();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.peek();
        stack1.push((int) (byte) 100);
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        int int15 = stack1.size();
        boolean boolean16 = stack1.isFull();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        boolean boolean4 = stack1.isFull();
        stack1.push((-1));
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) -1);
        stack1.push(4);
        int int13 = stack1.size();
        stack1.push(3);
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        int int7 = stack1.pop();
        stack1.push((int) 'a');
        int int10 = stack1.pop();
        stack1.push((int) (short) 100);
        stack1.push(100);
        int int15 = stack1.size();
        int int16 = stack1.peek();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        int int18 = stack1.size();
        boolean boolean19 = stack1.isFull();
        java.lang.Class<?> wildcardClass20 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        stack1.push(3);
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push((int) ' ');
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 1);
        boolean boolean2 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        stack1.push((int) (byte) 0);
        int int16 = stack1.pop();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        stack1.push(100);
        stack1.push((int) (byte) 0);
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.size();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        stack1.push(0);
        boolean boolean11 = stack1.isFull();
        stack1.push(35);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(52);
        stack1.push(32);
        int int14 = stack1.peek();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push(0);
        int int12 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean15 = stack1.isFull();
        stack1.push(10);
        stack1.push((int) (byte) -1);
        int int20 = stack1.pop();
        boolean boolean21 = stack1.isFull();
        int int22 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push(3);
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        stackproject.Stack stack1 = new stackproject.Stack((int) (byte) 10);
        stack1.push((int) (short) 100);
        int int4 = stack1.peek();
        stack1.push((int) (short) 10);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push(0);
        int int13 = stack1.size();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }
}

