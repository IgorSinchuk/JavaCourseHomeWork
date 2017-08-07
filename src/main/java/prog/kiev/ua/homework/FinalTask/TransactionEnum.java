package prog.kiev.ua.homework.FinalTask;

/**
 * Created by igor on 8/7/17.
 */
public enum TransactionEnum {
    BOOK_PASSENGER("BookPassenger"),
    CHANGE_PRICE("CHangePrice"),
    CANCEL_PASSENGER("CAncelPassenger");


    public final String transactionType;

    TransactionEnum(final String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }
}
