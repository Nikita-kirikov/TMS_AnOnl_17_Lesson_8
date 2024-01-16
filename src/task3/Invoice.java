package task3;

import java.util.Date;

public class Invoice implements Document {
    private float sum;
    private Date date;
    private int code;

    public Invoice() {
    }

    public Invoice(float sum,int code) {
        this.sum = sum;
        this.date = new Date();
        this.code = code;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "sum=" + sum +
                ", date=" + date +
                ", code=" + code +
                '}';
    }
}
