

public class App {

    public static void main(String[] args) {
      User user = new User();
      user.setNameFromInput();
//      user.setCounter(10);
      user.setCounterFromInput();

        RuleChecker ruleChecker = new FizzBuzzRuleChecker();
        FizzBuzzGame game = new FizzBuzzGame(ruleChecker);
         game.playGame(user);
    }

}
