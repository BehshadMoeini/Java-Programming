public class User {
    private String username, name, password, age, phone;
    private static User user;
    public synchronized static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }
    private User() {}
    public void setUser(String username, String name, String password, String age, String phone) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.phone = phone;
        System.out.println("username: " + username);
        System.out.println("name: " + name);
        System.out.println("password: " + password);
        System.out.println("age: " + age);
        System.out.println("phone: " + phone);
    }
}