package task3;

import java.util.Date;

public class ContractForGoods implements Document {

    private int idDoc;
    private int count;
    private String type;
    private Date date;


    public ContractForGoods() {
    }

    public ContractForGoods(int idDoc, int count, String type) {
        this.idDoc = idDoc;
        this.count = count;
        this.type = type;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "ContractForGoods{" +
                "idDoc=" + idDoc +
                ", count=" + count +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
