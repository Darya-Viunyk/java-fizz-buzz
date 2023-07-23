import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzRuleCheckerTest {
    @Test
    public void testCheckNumber_Fizz() {

        FizzBuzzRuleChecker fizzBuzzRuleChecker = new FizzBuzzRuleChecker();


        String result1 = fizzBuzzRuleChecker.checkNumber(3);
        String result2 = fizzBuzzRuleChecker.checkNumber(6);
        String result3 = fizzBuzzRuleChecker.checkNumber(9);


        assertEquals("Fizz", result1);
        assertEquals("Fizz", result2);
        assertEquals("Fizz", result3);
    }

    @Test
    public void testCheckNumber_Buzz() {

        FizzBuzzRuleChecker fizzBuzzRuleChecker = new FizzBuzzRuleChecker();


        String result1 = fizzBuzzRuleChecker.checkNumber(5);
        String result2 = fizzBuzzRuleChecker.checkNumber(10);
        String result3 = fizzBuzzRuleChecker.checkNumber(20);


        assertEquals("Buzz", result1);
        assertEquals("Buzz", result2);
        assertEquals("Buzz", result3);
    }

    @Test
    public void testCheckNumber_FizzBuzz() {

        FizzBuzzRuleChecker fizzBuzzRuleChecker = new FizzBuzzRuleChecker();


        String result1 = fizzBuzzRuleChecker.checkNumber(15);
        String result2 = fizzBuzzRuleChecker.checkNumber(30);


        assertEquals("FizzBuzz", result1);
        assertEquals("FizzBuzz", result2);
    }

    @Test
    public void testCheckNumber_Other() {

        FizzBuzzRuleChecker fizzBuzzRuleChecker = new FizzBuzzRuleChecker();


        String result1 = fizzBuzzRuleChecker.checkNumber(1);
        String result2 = fizzBuzzRuleChecker.checkNumber(2);
        String result3 = fizzBuzzRuleChecker.checkNumber(4);

        assertEquals("1", result1);
        assertEquals("2", result2);
        assertEquals("4", result3);
    }
}
/*В этом тесте мы создаем объект FizzBuzzRuleChecker, затем вызываем его метод checkNumber() с различными входными числами. После этого мы проверяем, что метод правильно возвращает ожидаемый результат для каждого числа с использованием метода assertEquals() из класса Assert.*/