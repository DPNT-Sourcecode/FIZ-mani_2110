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
        assertThat(fizzBuzz.fizzBuzz(1), equalTo("1"));
        assertThat(fizzBuzz.fizzBuzz(10), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(100), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(1000), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(1005), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(101), equalTo("101"));
        assertThat(fizzBuzz.fizzBuzz(105), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(11), equalTo("deluxe")); // 11
        assertThat(fizzBuzz.fizzBuzz(111), equalTo("fizz deluxe")); // fizz
        assertThat(fizzBuzz.fizzBuzz(1111), equalTo("deluxe"));
        assertThat(fizzBuzz.fizzBuzz(13), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(1400), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(151), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(157), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(163), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(193), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(2), equalTo("2"));
        assertThat(fizzBuzz.fizzBuzz(22), equalTo("deluxe"));
        assertThat(fizzBuzz.fizzBuzz(2265), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(27), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(3), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(30), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(31), equalTo("fizz")); // 31
        assertThat(fizzBuzz.fizzBuzz(3636), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(369), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(43), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(45), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(465), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(5), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(500), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(51), equalTo("fizz buzz")); //fizz
        assertThat(fizzBuzz.fizzBuzz(52), equalTo("buzz")); // 52
        assertThat(fizzBuzz.fizzBuzz(546), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(563), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(577), equalTo("buzz"));
        assertThat(fizzBuzz.fizzBuzz(593), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(600), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(653), equalTo("fizz buzz"));
        assertThat(fizzBuzz.fizzBuzz(811), equalTo("811"));
        assertThat(fizzBuzz.fizzBuzz(9), equalTo("fizz"));
        assertThat(fizzBuzz.fizzBuzz(99), equalTo("fizz deluxe")); // fizz
        assertThat(fizzBuzz.fizzBuzz(997), equalTo("997"));
    }
}
