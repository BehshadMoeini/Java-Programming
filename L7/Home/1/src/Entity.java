public class Entity {
    private int id, bill, dataPlan;
    private String username, password;
    public int getId() {
        return id;
    }
    public Entity setId(int id) {
        this.id = id;
        return this;
    }
    public int getBill() {
        return bill;
    }
    public Entity setBill(int bill) {
        this.bill = bill;
        return this;
    }
    public int getDataPlan() {
        return dataPlan;
    }
    public Entity setDataPlan(int dataPlan) {
        this.dataPlan = dataPlan;
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
}