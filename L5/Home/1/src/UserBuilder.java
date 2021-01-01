public class UserBuilder {
    private String username;
    private String name;
    private String password;
    private String age;
    private String address;
    private String phone;
    private String education;

    public String getUsername() {
        return username;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEducation() {
        return education;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }
    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }
    public UserBuilder setAge(String age) {
        this.age = age;
        return this;
    }
    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public UserBuilder setEducation(String education) {
        this.education = education;
        return this;
    }

    public User createUser() {
        return new User(username, name, password, age, address, phone, education);
    }
}