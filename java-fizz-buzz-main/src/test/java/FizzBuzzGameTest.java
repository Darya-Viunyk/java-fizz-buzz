import org.junit.jupiter.api.Test;


class FizzBuzzGameTest {

    private static class TestRuleChecker implements RuleChecker {
        @Override
        public String checkNumber(int number) {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else {
                return Integer.toString(number);
            }
        }
    }

    @Test
    public void testPlayGame() {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new TestRuleChecker());
        User user = new User();

        fizzBuzzGame.playGame(user);


    }
}
/* В этом тесте мы создаем свою собственную реализацию интерфейса RuleChecker под названием
        TestRuleChecker, которая имитирует правила для чисел в игре FizzBuzz.
        Затем мы создаем объект FizzBuzzGame и передаем в него нашу реализацию TestRuleChecker
        для тестирования. После этого мы вызываем метод playGame() и выводим результаты на консоль.*/