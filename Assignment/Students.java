public class Students {
    // field or global or instance
    private String name;
    private String year;
    private String mat;
    private String address;

//    default constructor
    public Students(){
        name = " ";
        year = " ";
        mat = " ";
        address = " ";
    }
    // constructor
    public Students(String nam1, String y, String m, String add) {
        this.name = nam1;
        this.year = y;
        this.mat = m;
        this.address = add;
    }
    // display method
    public void display(){
        System.out.println(name+"\t\t"+year+"\t\t"+mat+"\t\t"+address);
    }
    public static void main(String[] args) {
        System.out.println("Name\t "+"year of joining\t "+"mat No\t\t "+"address\n");
        System.out.println("----------------------------------------------------");
        Students bairoking = new Students("John Doe", "2017", "1234", "Bundung");
        Students bairoking1 = new Students("Sam Jobe", "2020", "2213","Banjul");
        Students bairoking2 = new Students("Jane Doe", "2019", "3212","Brikama");
        bairoking.display();
        bairoking1.display();
        bairoking2.display();
    }

}
