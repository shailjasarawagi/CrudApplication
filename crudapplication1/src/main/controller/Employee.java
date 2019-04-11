public class Employee {

    protected int id;
    protected String name;
    protected String address;
    protected float cnumber;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name, String address, float cnumber) {
        this(name, address, cnumber);
        this.id = id;
    }

    public Employee(String name, String address, float cnumber) {
        this.name = name;
        this.address=address;
        this.cnumber = cnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getCnumber() {
        return cnumber;
    }

    public void setCnumber(float cnumber) {
        this.cnumber=cnumber;
    }
}
