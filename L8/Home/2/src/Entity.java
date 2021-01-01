public class Entity {
    private int id;
    private String name, username, password, email;
    public int getId() {
        return id;
    }
    public Entity setId(int id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Entity setName(String name) {
        this.name = name;
        return this;
    }
    public String getUsername() {
        return username;
    }
    public Entity setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getPassword() {
        return password;
    }
    public Entity setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getEmail() {
        return email;
    }
    public Entity setEmail(String email) {
        this.email = email;
        return this;
    }
}