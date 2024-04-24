import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionHistory {
    private Long id;
    private LocalDateTime dateTrading;
    private String description;
    private String beneficiaryName;
    private int money;

    public TransactionHistory(String description, String beneficiaryName, int money) {

        this.id = IdGenerate.getNewID();
        this.dateTrading = LocalDateTime.now();
        this.description = description;
        this.beneficiaryName = beneficiaryName;
        this.money = money;
    }
    public String getDescription() {
        return description;
    }
    public String getBeneficiaryName() {
        return beneficiaryName;
    }
    public int getMoney() {
        return money;
    }
    public LocalDateTime getDateTrading() {
        return dateTrading;
    }
    public Long getId() {
        return id;
    }
    public void setBeneficiaryName() {
        this.beneficiaryName = beneficiaryName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String toString() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  id +" - "+ dateTrading.format(myFormat) +" - "+ description + " - "+ Controller.formatMoney(money)+" _ "+beneficiaryName;
    }
}
