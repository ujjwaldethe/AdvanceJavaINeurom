package IS_A_Relationship.OneToMany;

public class OneToManyDriver {
    public static void main(String[] args) {
        Employe e1 = new Employe("1","CSN","Ujjwal");
        Employe e2 = new Employe("2","CN","Ujjwal");
        Employe e3 = new Employe("3","SN","Ujjwal");
        Employe e4 = new Employe("4","CS","Ujjwal");
        Employe[] emps = new Employe[4];
        emps[0]=e1;
        emps[1]=e2;
        emps[2]=e3;
        emps[3]=e4;
        Department BCCI = new Department("1","BCCI",emps);
        BCCI.getEmps();
    }
}
