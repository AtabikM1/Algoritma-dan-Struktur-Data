package Practice;

public class empployee {
    String name;
    String id;
    String departement;
    empployee(String nama, String id, String departement){
        name = nama;
        this.id = id;
        this.departement = departement;
    }
    public String getName() {
        return name;
    }
    public String getDepartement() {
        return departement;
    }
    public String getId() {
        return id;
    }
}
