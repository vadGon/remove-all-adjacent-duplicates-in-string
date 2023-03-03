import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void simpleTest1() {
        assertEquals("ps", Solution.removeAdjacentDuplicates("pbbcggttciiippooaais"));
        //pbcgtcipoais
    }

    @org.junit.jupiter.api.Test
    void simpleTest2() {
        assertEquals("abcd", Solution.removeAdjacentDuplicates("abcd"));
    }

    @org.junit.jupiter.api.Test
    void simpleTest3() {
        assertEquals("i", Solution.removeAdjacentDuplicates("iii"));
    }

    @org.junit.jupiter.api.Test
    void simpleTest4() {
        assertEquals("", Solution.removeAdjacentDuplicates("iibb"));
    }

    @org.junit.jupiter.api.Test
    void simpleTest5() {
        assertEquals("", Solution.removeAdjacentDuplicates("iibbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"));
    }

    @org.junit.jupiter.api.Test
    void simpleTest6() {
        assertEquals("i", Solution.removeAdjacentDuplicates("i"));
    }
}