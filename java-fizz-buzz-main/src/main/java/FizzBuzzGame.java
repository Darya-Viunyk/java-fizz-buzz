public class FizzBuzzGame {
    private RuleChecker ruleChecker;

    public FizzBuzzGame(RuleChecker ruleChecker) {
        this.ruleChecker = ruleChecker;
    }

    public void playGame(User user) {
        for (int n = 0; n <= user.getCounter(); n++) {
            String output = ruleChecker.checkNumber(n);
            System.out.println(output);
        }
    }
}
