package task3;

import java.util.Date;
import java.util.Calendar;

public class ContractForEmployees implements Document {
    private Date date;
    private int num;
    private Date dateOfEnd;
    private String name;

    Calendar c = Calendar.getInstance();


    public ContractForEmployees() {
    }

    public ContractForEmployees(int num, String name, Date d) {
        this.date = new Date();
        this.num = num;
        this.dateOfEnd = d;
        this.name = name;

    }

    @Override
    public String toString() {
        return "ContractForEmployees{" +
                "date=" + date +
                ", num=" + num +
                ", dateOfEnd=" + dateOfEnd +
                ", name='" + name + '\'' +
                '}';
    }
}
