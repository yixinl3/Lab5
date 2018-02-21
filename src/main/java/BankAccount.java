import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * the account number.
     */
    private int accountNumber;
    /**
     *  the account type.
     */
    private BankAccountType accountType;
    /**
     * the account balance.
     */
    private double accountBalance;
    /**
     * the name of owner.
     */
    private String ownerName;
    /**
     * the interest rate.
     */
    private double interestRate;
    /**
     *  the interest earned.
     */
    private double interestEarned;

    /**
     * the constructor.
     *@param name the name.
     *@param accountCategory account category.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}