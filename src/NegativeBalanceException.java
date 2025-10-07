import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class NegativeBalanceException extends Exception {
    private double negativeBalance; // Amount the withdrawal exceeds the current balance

    public NegativeBalanceException() {
        super("Error: Negative balance.");
    }

    public NegativeBalanceException(double negativeBalance) {
        // Create message and send it to the parent Exception class
        super("Amount exceeds balance by " + negativeBalance);
        this.negativeBalance = negativeBalance;
    }
        // Write the same message to logfile.txt
        try (PrintWriter out = new PrintWriter(new FileWriter("logfile.txt", true))) {
            out.println(getMessage());
        } catch (IOException e) {
            // Ignore file errors for this simple assignment
        }
}   
    }
}

