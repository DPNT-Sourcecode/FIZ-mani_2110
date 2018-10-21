package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (multipleOf3and5(number)) {
            return isDeluxe(number, "fizz buzz");
        }

        if (multipleOf3(number) || contains(number,"3")) {
            return isDeluxe(number, "fizz");
        }

        if (multipleOf5(number)|| contains(number,"5")) {
            return isDeluxe(number, "buzz");
        }

        return isDeluxe(number, number.toString());
    }

    private String isDeluxe(Integer number, String result) {
        String numberAsString = number.toString();

        // not fizz or buzz or fizz buzz
        if (result.equals(numberAsString)) {
            if (isOdd(number)) {
                return "fake deluxe";
            } else {
                return result;
            }
        }

        if (multipleOf5(number) && contains(number,"5")) {
            if (isOdd(number)) {
                return "buzz fake deluxe";
            }
            return "buzz deluxe";
        }

        if (multipleOf3(number) && contains(number,"3")) {
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

    private boolean contains(Integer number, String digit) {
        return number.toString().contains(digit);
    }

    private boolean multipleOf3and5(Integer number) {
        return (multipleOf3(number) || contains(number, "3"))
                && (multipleOf5(number)|| contains(number, "5"));
    }

}
