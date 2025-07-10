package model;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private String id;
    private TransactionType type;
    private BigDecimal amount;
    private String description;
    private String category;

    public Transaction(LocalDate date, String id, TransactionType type, BigDecimal amount){
        this.date = date;
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }

    public String getID(){
        return id;
    }
    public TransactionType getType(){
        return type;
    }
    public BigDecimal getAmount(){
        return amount;
    }

}

