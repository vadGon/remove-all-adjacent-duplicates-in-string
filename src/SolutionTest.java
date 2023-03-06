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
    void deleteSequenceWithTwoCharactersWhenInputThreeSameCharacters() {
        assertEquals("i", Solution.removeAdjacentDuplicates("iii", 2));
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
    void simpleCaseFromTaskExampleWithTwoCharacters() {
        assertEquals("ps", Solution.removeAdjacentDuplicates("pbbcggttciiippooaais", 2));
    }

    @org.junit.jupiter.api.Test
    void simpleCaseFromTaskExampleWithThreeCharacters() {
        assertEquals("aa", Solution.removeAdjacentDuplicates("deeedbbcccbdaa", 3));
    }
}