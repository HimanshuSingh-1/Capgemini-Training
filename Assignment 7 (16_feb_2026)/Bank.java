import java.time.LocalDateTime;

enum ActionType {
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    LOGIN,
    FAILED_LOGIN
}

enum Status {
    SUCCESS,
    FAILED
}

class LogEntry {

    private static long counter = 1;

    private final long logId;
    private final String accountNumber;
    private final ActionType actionType;
    private final double amount;
    private final LocalDateTime timestamp;
    private final Status status;

    public LogEntry(String accountNumber, ActionType actionType, double amount, Status status) {

        this.logId = counter++;
        this.accountNumber = accountNumber;
        this.actionType = actionType;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.status = status;
    }

    public long getLogId() {
        return logId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "logId=" + logId +
                ", accountNumber='" + accountNumber + '\'' +
                ", actionType=" + actionType +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                ", status=" + status +
                '}';
    }
}
public class Bank{
    public static void main(String[] args){
        
    }
}