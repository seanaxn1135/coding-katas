import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class FizzBuzzTest {
    public final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzz_shouldReturnListOf1To100() {
        List<String> fizzBuzzList= FizzBuzz.fizzBuzz();
        assertEquals(100, fizzBuzzList.size());
    }

    @Test
    public void fizzBuzz_shouldBeFizzForMultiplesOfThree() {
        List<String> fizzBuzzList = FizzBuzz.fizzBuzz();
        for (int i = 0; i < fizzBuzzList.size(); i ++) {
            int number = i + 1;
            String actualOutput = fizzBuzzList.get(i);

            if (number % 3 == 0 && number % 5 != 0) {
                assertEquals("Fizz", actualOutput);
            }
        }
    }

    @Test
    public void fizzBuzz_shouldBeBuzzForMultiplesOfFive() {
        List<String> fizzBuzzList = FizzBuzz.fizzBuzz();
        for (int i = 0; i < fizzBuzzList.size(); i ++) {
            int number = i + 1;
            String actualOutput = fizzBuzzList.get(i);

            if (number % 5 == 0 && number % 3 != 0) {
                assertEquals("Buzz", actualOutput);
            }
        }
    }

    @Test
    public void fizzBuzz_shouldBeFizzBuzzForMultiplesOfThreeAndFive() {
        List<String> fizzBuzzList = FizzBuzz.fizzBuzz();
        for (int i = 0; i < fizzBuzzList.size(); i ++) {
            int number = i + 1;
            String actualOutput = fizzBuzzList.get(i);

            if (number % 5 == 0 && number % 3 == 0) {
                assertEquals("FizzBuzz", actualOutput);
            }
        }
    }

}