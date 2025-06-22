package IS_A_Relationship.OneToOne;

public class EmployeAccountDriver {
    public static void main(String[] args) {
        AccountEx1 accountEx1 = new AccountEx1("1002","BOB","Savings");
        //Constructor Injection
        EmployeEx1 e = new EmployeEx1("1","Ujjwal","Pune",accountEx1);
        e.getEmployeDetails();
    }
}
