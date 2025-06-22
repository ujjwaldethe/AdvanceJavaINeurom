package IS_A_Relationship.OneToMany;

public class Department {
    private String did;
    private String dname;
    private Employe[] emps;

    public Department(String did, String dname, Employe[] emps) {
        super();
        this.did = did;
        this.dname = dname;
        this.emps = emps;
    }
    public void getEmps() {
        System.out.println("Department Details Are :: ");
        System.out.println("Department Id : "+did);
        System.out.println("Department Name : "+dname);
        System.out.println("Employe Details Are :: ");
        for(Employe emp : emps)
        {
            System.out.println("EMPID :: "+emp.getSid());
            System.out.println("EMPNAME :: "+emp.getSname());
            System.out.println("EMPAddress :: "+emp.getSaddr());
        }
    }
}
