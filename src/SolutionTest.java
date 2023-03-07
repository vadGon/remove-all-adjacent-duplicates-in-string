import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void deleteSequenceWithTwoCharactersWhenInputIsEmpty() {
        assertEquals("", Solution.removeAdjacentDuplicates("", 2));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithThoCharactersIfInputStringHasLengthOneCharacter() {
        assertEquals("i", Solution.removeAdjacentDuplicates("i", 2));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithTwoCharactersWhenThereIsNoAdjacentDuplicatesInInput() {
        assertEquals("abcd", Solution.removeAdjacentDuplicates("abcd", 2));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithTwoCharactersAndResultShouldBeEmptyString() {
        assertEquals("", Solution.removeAdjacentDuplicates("iibb", 2));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithThreeCharactersInTheEndOfTheString() {
        assertEquals("r", Solution.removeAdjacentDuplicates("reee", 3));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithThreeCharactersInTheBeginningOfTheString() {
        assertEquals("f", Solution.removeAdjacentDuplicates("eeef", 3));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithFiveCharactersInTheMiddleOfTheString() {
        assertEquals("wwwu", Solution.removeAdjacentDuplicates("wwwqqqqqu", 5));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithTwoCharactersWhenInputCapitalCharacters() {
        assertEquals("C", Solution.removeAdjacentDuplicates("AADDC", 2));
    }

    @org.junit.jupiter.api.Test
    void deleteSequenceWithTwoCharactersWhenInputDataContainsSpaces() {
        assertEquals("A AC", Solution.removeAdjacentDuplicates("A A  C", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleCaseFromTaskExampleWithTwoCharacters() {
        assertEquals("ps", Solution.removeAdjacentDuplicates("pbbcggttciiippooaais", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleCaseFromTaskExampleWithThreeCharacters() {
        assertEquals("aa", Solution.removeAdjacentDuplicates("deeedbbcccbdaa", 3));
    }

    @org.junit.jupiter.api.Test
    void checkingExecutionTimeWithInput100ThousandsCharacters() {
        StringBuilder sb = new StringBuilder();
        String a1000chars = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        // 100k loop
        for (int i = 0; i < 100; i++) {
            sb.append(a1000chars);
        }
        String input = sb.toString();
        long start = System.currentTimeMillis();
        String res = Solution.removeAdjacentDuplicates(input, 100000);
        long end = System.currentTimeMillis();
        // Usual average time < 50 MilliSeconds
        System.out.println("DEBUG: Logic took " + (end - start) + " MilliSeconds");
        assertEquals("", res);
    }
}