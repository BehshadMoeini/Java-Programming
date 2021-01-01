public class Main {
    public static void main(String[] args) {
        User user1 = new User("qwe","Qwe","QwE123","1","zxczxczxc","0912001","mnb");
        UserBuilder user2 = new UserBuilder().setUsername("wer").setName("Wer").setPassword("WeR234").setAge("2").setAddress("xcvxcvxcv").setPhone("0912002").setEducation("nbv");

        System.out.println("Username: " + user1.getUsername());
        System.out.println("Name: " + user1.getName());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Age: " + user1.getAge());
        System.out.println("Address: " + user1.getAddress());
        System.out.println("Phone: " + user1.getPhone());
        System.out.println("Education: " + user1.getEducation() + "\n");

        System.out.println("Username: " + user2.getUsername());
        System.out.println("Name: " + user2.getName());
        System.out.println("Password: " + user2.getPassword());
        System.out.println("Age: " + user2.getAge());
        System.out.println("Address: " + user2.getAddress());
        System.out.println("Phone: " + user2.getPhone());
        System.out.println("Education: " + user2.getEducation() + "\n");
    }
}