public class User {
    private String username, name, password, age, address, phone, education;

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

    public User(String username, String name, String password, String age, String address, String phone, String education) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.education = education;
    }
}