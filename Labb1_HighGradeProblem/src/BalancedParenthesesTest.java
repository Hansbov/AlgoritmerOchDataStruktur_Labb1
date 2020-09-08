import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {
    BalancedParentheses parentheses;
    String balancedPar1;
    String balancedPar2;
    String unbalancedPar1;
    String unbalancedPar2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        parentheses = new BalancedParentheses();
        balancedPar1 = "((({{[([])]}})))";
        balancedPar2 = "(){[]}([{}])";
        unbalancedPar1= "(({)}[]";
        unbalancedPar2 = "()()(({[]})))";
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        parentheses = null;
        balancedPar2 = null;
        balancedPar1 = null;
        unbalancedPar1 = null;
        unbalancedPar2 = null;
    }

    @org.junit.jupiter.api.Test
    void isBalanced() {
        assertTrue(parentheses.isBalanced(balancedPar1));
        assertTrue(parentheses.isBalanced(balancedPar2));
        assertFalse(parentheses.isBalanced(unbalancedPar1));
        assertFalse(parentheses.isBalanced(unbalancedPar2));

    }
}