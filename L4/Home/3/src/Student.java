import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student <NAME,NUMBER,FATHER> {
    private NAME name;
    private NUMBER number;
    private FATHER father;

    public NAME getName() {
        return name;
    }
    public void setName(NAME name) {
        this.name = name;
    }
    public NUMBER getNumber() {
        return number;
    }
    public void setNumber(NUMBER number) {
        this.number = number;
    }
    public FATHER getFather() {
        return father;
    }
    public void setFather(FATHER father) {
        this.father = father;
    }

    public void setScores() {
        List<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i=1 ; i<6 ; i++) {
            System.out.print("Enter " + i + "th score: ");
            list.add(scanner.nextDouble());
        }
        System.out.println(name + "\t" + number + "\t" + father);
        for (Double d : list)
            System.out.println(d);
    }
}
