
package entity;

public class id_level implements Entity{
    public static String tableName = "id_level";
    private int id;
    private String role;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    
}
