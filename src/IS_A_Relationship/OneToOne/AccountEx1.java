package IS_A_Relationship.OneToOne;

public class AccountEx1 {
    private String accNo;
    private String accName;
    private String accType;
    public AccountEx1(String accNo, String accName, String accType) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
    }
    public String getAccNo() {
        return accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
    public String getAccName() {
        return accName;
    }
    public void setAccName(String accName) {
        this.accName = accName;
    }
    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
}
