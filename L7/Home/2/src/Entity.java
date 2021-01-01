public class Entity {
    private int melliID, cYear;
    private String name, cName, cPrice;
    public int getMelliID() {
        return melliID;
    }
    public Entity setMelliID(int melliID) {
        this.melliID = melliID;
        return this;
    }
    public int getcYear() {
        return cYear;
    }
    public Entity setcYear(int cYear) {
        this.cYear = cYear;
        return this;
    }
    public String getName() {
        return name;
    }
    public Entity setName(String name) {
        this.name = name;
        return this;
    }
    public String getcName() {
        return cName;
    }
    public Entity setcName(String cName) {
        this.cName = cName;
        return this;
    }
    public String getcPrice() {
        return cPrice;
    }
    public Entity setcPrice(String cPrice) {
        this.cPrice = cPrice;
        return this;
    }
}