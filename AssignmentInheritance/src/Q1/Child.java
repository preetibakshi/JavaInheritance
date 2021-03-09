package Q1;

public class Child extends Base {
    public Child(String Name,Double Price,String Processor,String Ram,String Harddisk) {
        super(Name,Price,Processor,Ram,Harddisk);
    }




    public static void main(String[] args) {
        Child c1 = new Child("Lenovo", 1000.00, "i3", "50GB", "200GB");
        c1.Details();
        Child c2 = new Child("Dell", 1200.00, "i5", "50GB", "200GB");
        c2.Details();
        Child c3 = new Child("", 1100.00, "i9", "50GB", "200GB");
        c3.Details();
    }
}