package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (multipleOf3and5(number)) {
            return isDeluxe(number, "fizz buzz");
        }

        if (multipleOf5(number) || contains5(number)) {
            return isDeluxe(number, "buzz");
        }

        if (multipleOf3(number) || contains3(number)) {
            return isDeluxe(number, "fizz");
        }

        return isDeluxe(number, number.toString());
    }

    private String isDeluxe(Integer number, String result) {
        if (multipleOf5(number) && contains5(number) &&
                multipleOf3(number) && contains3(number)) {
//        if (result.equals("fizz buzz")) {
            if (isOdd(number)) {
                return "fizz buzz fake deluxe";
            }
            return "fizz buzz deluxe";
        }

        if (multipleOf5(number) && contains5(number)) {
            if (isOdd(number)) {
                return "buzz fake deluxe";
            }
            return "buzz deluxe";
        }

        if (multipleOf3(number) && contains3(number)) {
            if (isOdd(number)) {
                return "fizz fake deluxe";
            }
            return "fizz deluxe";
        }

        return result;
    }

    private boolean isOdd(Integer number) {
        return (number % 2) != 0;
    }

    private boolean multipleOf5(Integer number) {
        return number % 5 == 0;
    }

    private boolean multipleOf3(Integer number) {
        return (number % 3 == 0);
    }

    private boolean multipleOf3and5(Integer number) {
        return (multipleOf3(number) || contains3(number))
                && (multipleOf5(number) || contains5(number));
    }

    private boolean contains3(Integer number) {
        return number.toString().contains("3");
    }

    private boolean contains5(Integer number) {
        return number.toString().contains("5");
    }
}
