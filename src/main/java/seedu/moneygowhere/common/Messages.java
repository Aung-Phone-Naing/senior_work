package seedu.moneygowhere.common;

import seedu.moneygowhere.parser.ConsoleParserConfigurations;

/**
 * Defines the messages used by program.
 */
public class Messages {
    public static final String CONSOLE_MESSAGE_GREETING = ""
            + "Your MoneyGoWhere? Let me help you find it.";
    public static final String CONSOLE_MESSAGE_GOODBYE = ""
            + "Bye. Hope to see you again soon!";
    public static final String CONSOLE_ERROR_COMMAND_NOT_FOUND = ""
            + "The command entered is invalid.";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_EXPENSE_SUCCESS = ""
            + "The expense was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Add-Expense -n NAME -a AMOUNT [-d "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-t DESCRIPTION] [-c CATEGORY]";
    public static final String CONSOLE_ERROR_COMMAND_VIEW_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: View-Expense [-e EXPENSE_NUMBER]";
    public static final String CONSOLE_MESSAGE_COMMAND_DELETE_EXPENSE_SUCCESS = ""
            + "The expense was deleted successfully.";
    public static final String CONSOLE_ERROR_COMMAND_DELETE_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Delete-Expense [-e EXPENSE_NUMBER]";
    public static final String CONSOLE_MESSAGE_COMMAND_EDIT_EXPENSE_SUCCESS = ""
            + "The expense was edited successfully.";
    public static final String CONSOLE_ERROR_COMMAND_EDIT_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Edit-Expense -e EXPENSE_NUMBER [-n NAME] [-a AMOUNT] [-d "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-t DESCRIPTION] [-c CATEGORY]";
    public static final String EXPENSE_MANAGER_ERROR_EXPENSE_NOT_FOUND = ""
            + "The expense is not found.";
    public static final String CONSOLE_MESSAGE_COMMAND_SORTED_EXPENSE_SUCCESS = ""
            + "Your expenses have been sorted successfully.";
    public static final String CONSOLE_ERROR_COMMAND_SORT_EXPENSE_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Sort-Expense -t TYPE -o ORDER";
    public static final String LOCAL_STORAGE_ERROR_NO_LOAD_FILE = ""
            + "There is no load file found...\n"
            + "Please ensure the file is named correctly and is in the right directory if you have a load file.";
    public static final String LOCAL_STORAGE_ERROR_IN_LOAD_FILE = ""
            + "There is an error in load file found...\n"
            + "Please ensure the file is the correct load file without modifications to it.\n"
            + "Error is found in line: ";
    public static final String LOCAL_STORAGE_LOAD_SUCCESS = ""
            + "File loaded successfully :)";
    public static final String LOCAL_STORAGE_ERROR_SAVE_DATA = ""
            + "There is an error in saving file...\n"
            + "File does not exist or Path is wrong :(";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_TARGET_SUCCESS = ""
            + "The target was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_TARGET_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Add-Target -n NAME -a AMOUNT [-d "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-t DESCRIPTION] [-c CURRENT AMOUNT]";
    public static final String TARGET_MANAGER_ERROR_TARGET_NOT_FOUND = ""
            + "The target is not found.";
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_INCOME_SUCCESS = "The income was added successfully.";
    public static final String INCOME_MANAGER_ERROR_INCOME_NOT_FOUND = ""
            + "The income is not found.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_INCOME_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Add-Income -n NAME -a AMOUNT [-d "
            + Configurations.CONSOLE_INTERFACE_DATE_TIME_INPUT_FORMAT
            + "] [-t DESCRIPTION]";

    /**
     * Defines messages for console command Add-RecurringPayment.
     */
    public static final String CONSOLE_MESSAGE_COMMAND_ADD_RECURRING_PAYMENT_SUCCESS = ""
            + "The recurring payment was added successfully.";
    public static final String CONSOLE_ERROR_COMMAND_ADD_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: Add-RecurringPayment"
            + " -" + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_NAME + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_NAME_LONG.toUpperCase()
            + " -" + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_INTERVAL + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_INTERVAL_LONG.toUpperCase()
            + " -" + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_AMOUNT + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_AMOUNT_LONG.toUpperCase()
            + " [-" + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_DESCRIPTION + " "
            + ConsoleParserConfigurations.COMMAND_ADD_RECURRING_PAYMENT_ARG_DESCRIPTION_LONG.toUpperCase()
            + "]";

    /**
     * Defines messages for console command View-RecurringPayment.
     */
    public static final String CONSOLE_ERROR_COMMAND_VIEW_RECURRING_PAYMENT_INVALID = ""
            + "The arguments entered are invalid. "
            + "SYNTAX: View-RecurringPayment"
            + " -" + ConsoleParserConfigurations.COMMAND_VIEW_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX + " "
            + ConsoleParserConfigurations.COMMAND_VIEW_RECURRING_PAYMENT_ARG_RECURRING_PAYMENT_INDEX_LONG.toUpperCase();
}
