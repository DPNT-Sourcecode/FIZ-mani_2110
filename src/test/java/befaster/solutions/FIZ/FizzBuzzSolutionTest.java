package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzz;

    @Before
    public void setUp() {

        fizzBuzz = new FizzBuzzSolution();
    }

    @Test
    public void compute_hello() {
        assertThat(fizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(1), equalTo("1"));
        assertThat(fizzBuzz.fizzBuzz(2), equalTo("2"));
        assertThat(fizzBuzz.fizzBuzz(11), equalTo("11"));
        assertThat(fizzBuzz.fizzBuzz(31), equalTo("31"));
        assertThat(fizzBuzz.fizzBuzz(52), equalTo("52"));
        assertThat(fizzBuzz.fizzBuzz(811), equalTo("811"));
        assertThat(fizzBuzz.fizzBuzz(997), equalTo("997"));
        assertThat(fizzBuzz.fizzBuzz(3), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(9), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(51), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(111), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(369), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(3636), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(5), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(10), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(100), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(500), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(1400), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(30), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(101), equalTo("101"));
        assertThat(fizzBuzz.fizzBuzz(105), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(1005), equalTo("fizz buzz"));
    }
}
