public class FizzBuzzRuleChecker implements RuleChecker {
    @Override
    public String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            // print Fizz
            return "Fizz";
        } else if (number % 3 != 0 && number % 5 == 0) {
            // print Buzz
            return "Buzz";
        } else if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else {
         return String.valueOf(number);
        }


    }
}
