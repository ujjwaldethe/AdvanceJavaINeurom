package IS_A_Relationship.OneToMany;

//Dependent Object
public class Employe {
    private String sid;
    private String sname;
    private String saddr;
    public Employe(String sid, String saddr, String sname) {
        this.sid = sid;
        this.saddr = saddr;
        this.sname = sname;
    }
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }
}
