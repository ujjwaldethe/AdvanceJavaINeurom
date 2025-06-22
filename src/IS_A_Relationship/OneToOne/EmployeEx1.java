package IS_A_Relationship.OneToOne;

public class EmployeEx1 {
    private String eid;
    private String ename;
    private String eaddr;

    //Has-A-Relationship
    AccountEx1 account;

    public EmployeEx1(String eid, String ename, String eaddr , AccountEx1 account) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.eaddr = eaddr;
        this.account = account;
    }
    public void getEmployeDetails()
    {
        System.out.println("Employe Details Are :: ");
        System.out.println("EMPID :: "+eid);
        System.out.println("EMPNAME :: "+ename);
        System.out.println("EMPAddress :: "+eaddr);
        System.out.println("EMPAccNo :: "+account.getAccNo());
        System.out.println("EMPAccNo :: "+account.getAccNo());
        System.out.println("EMPAccName :: "+account.getAccName());
        System.out.println("EMPAccType :: "+account.getAccType());
    }
}
