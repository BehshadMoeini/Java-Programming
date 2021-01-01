import java.util.Scanner;

public class User {
    private String name , lastName;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public void setUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        setName(scanner.nextLine());
        System.out.print("Enter Last Name: ");
        setLastName(scanner.nextLine());
        System.out.print("Enter Age: ");
        setAge(scanner.nextInt());
    }
    public static void search(User[] user) throws UserException {
        if (user[0].name.equals(user[1].name) && user[0].lastName.equals(user[1].lastName) && user[0].age==user[1].age)
            throw new UserException("Repeated User");
        else
            System.out.println("No Repeated User");
    }
}