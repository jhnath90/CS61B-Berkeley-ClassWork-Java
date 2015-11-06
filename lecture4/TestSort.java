/* Annoyances at the moment:
 1. Output is too verbose.
 2. Have to manually comment out tests we don't really care about.
 3. Have to manually invoke tests.
 */

 /* To fix these:
  1. Annotate each test with @org.junit.Test
  2. Make our methods non-sstatic.
  3. jh61b.junit.textui.runClasses
  */

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {

    // Test the Sort.sort method.
    @Test
	public void testSort() {
		String[] input = {"a", "huge", "tiny", "scorpion"};
		Sort.sort(input);
		String[] expected = {"a", "huge", "sscorpion", "tiny"};

		// Test to see if input is the same thing as expected.
		// If not, print something useful to the programmer.
		assertArrayEquals(expected, input);
	}

	// Test the indexOfSmallest method.
	@Test
	public void testIndexOfSmallest() {
	  String[] input = {"a", "huge", "tiny", "scorpion"};
	  int actual = Sort.indexOfSmallest(input, 0);
	  int expected = 0;

	  assertEquals(expected, actual);

      actual = Sort.indexOfSmallest(input, 2);
      expected = 3;

      assertEquals(expected, actual);
	}

	@Test
	public void testSwap() {
	  String[] input = {"a", "huge", "tiny", "scorpion"};
	  Sort.sort(input);
	  String[] expected = {"tiny", "huge", "a", "scorpion"};
	}

	public static void main(String[] args) {
	  jh61b.junit.textui.runClasses(TestSort.class);

	}
}



/* Terrible testing stuff that I don't need

if(input.length != expected.length) {
			System.out.println("Lengths did not match.");
			System.out.println("input length: " + input.length);
			System.out.println("expected length: " + expected.length);
		}

		int i = 0;
		while (i < input.length) {
			if (input[i] != ...)
		}
*/