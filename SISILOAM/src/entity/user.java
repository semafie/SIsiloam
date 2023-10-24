
package entity;

public class user implements Entity{
    public static String tableName = "user";
    private int id, level, token;
    private String username, password, email;
    
    public user(){
        
    }
    
    public user( String username, String password, String email, int level,int token){
        this.token = token;
        this.username = username;
        this.password = password;
        this.email = email;
        this.level = level;
    }
    public user(int id, String username, String password, String email){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.level = level;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
}
