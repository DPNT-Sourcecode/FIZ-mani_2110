package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if (multipleOf3and5(number)) {
            return isDeluxe(number, "fizz buzz");
        }

        if (multipleOf3(number)) {
            return isDeluxe(number, "fizz");
        }

        if (multipleOf5(number)) {
            return isDeluxe(number, "buzz");
        }

        return isDeluxe(number, number.toString());
    }

    private String isDeluxe(Integer number, String result) {
        if (number > 10) {
            String numberAsString = number.toString();
            char[] charArray = numberAsString.toCharArray();
            for (int index = 1; index < charArray.length; index++) {
                char prevDigit = charArray[index - 1];
                char thisDigit = charArray[index];

                if (prevDigit != thisDigit) {
                    return result;
                }
            }

            if (result.equals(numberAsString)) {
                if (isOdd(number)) {
                    return "fake deluxe";
                } else {
                    return "deluxe";
                }
            }

            if (isOdd(number)) {
                return result + " fake deluxe";
            } else {
                return result + " deluxe";
            }
        }
        return result;
    }

    private boolean isOdd(Integer number) {
        return (number % 2) != 0;
    }

    private boolean multipleOf5(Integer number) {
        return number % 5 == 0 || number.toString().contains("5");
    }

    private boolean multipleOf3(Integer number) {
        return (number % 3 == 0) || number.toString().contains("3");
    }

    private boolean multipleOf3and5(Integer number) {
        return multipleOf3(number) && multipleOf5(number);
    }

}
