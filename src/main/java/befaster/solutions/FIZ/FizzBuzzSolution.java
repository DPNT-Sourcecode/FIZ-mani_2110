package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (multipleOf3and5(number)) {
            return "fizz buzz";
        }

        if (multipleOf3(number)) {
            return "fizz";
        }

        if (multipleOf5(number)) {
            return "buzz";
        }

        return number.toString();
    }

    private boolean multipleOf5(Integer number) {
        return number % 5 == 0;
    }

    private boolean multipleOf3(Integer number) {
        return number % 3 == 0;
    }

    private boolean multipleOf3and5(Integer number) {
        return multipleOf3(number) && multipleOf5(number);
    }

}
