import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void simpleTest1() {
        assertEquals("ps", Solution.removeAdjacentDuplicates("pbbcggttciiippooaais", 2));

    }

    @org.junit.jupiter.api.Test
    void simpleTest2() {
        assertEquals("abcd", Solution.removeAdjacentDuplicates("abcd", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleTest3() {
        assertEquals("i", Solution.removeAdjacentDuplicates("iii", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleTest4() {
        assertEquals("", Solution.removeAdjacentDuplicates("iibb", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleTest5() {
        assertEquals("", Solution.removeAdjacentDuplicates("iibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleTest6() {
        assertEquals("i", Solution.removeAdjacentDuplicates("i", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleTest7() {
        assertEquals("aa", Solution.removeAdjacentDuplicates("deeedbbcccbdaa", 3));
    }

    @org.junit.jupiter.api.Test
    void simpleTest8() {
        assertEquals("r", Solution.removeAdjacentDuplicates("reee", 3));
    }

    @org.junit.jupiter.api.Test
    void simpleTest9() {
        assertEquals("wwwu", Solution.removeAdjacentDuplicates("wwwqqqqqu", 5));
    }
}