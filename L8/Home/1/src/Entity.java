public class Entity {
    private int id, age;
    private String name, melli, city, spec;
    public int getId() {
        return id;
    }
    public Entity setId(int id) {
        this.id = id;
        return this;
    }
    public int getAge() {
        return age;
    }
    public Entity setAge(int age) {
        this.age = age;
        return this;
    }
    public String getName() {
        return name;
    }
    public Entity setName(String name) {
        this.name = name;
        return this;
    }
    public String getMelli() {
        return melli;
    }
    public Entity setMelli(String melli) {
        this.melli = melli;
        return this;
    }
    public String getCity() {
        return city;
    }
    public Entity setCity(String city) {
        this.city = city;
        return this;
    }
    public String getSpec() {
        return spec;
    }
    public Entity setSpec(String spec) {
        this.spec = spec;
        return this;
    }
}