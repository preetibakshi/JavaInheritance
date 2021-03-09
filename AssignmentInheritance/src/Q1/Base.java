package Q1;

public class Base {
    private final String Name;
    private final Double Price;
    private final String Processor;
    private final String Ram;
    private final String Harddisk;


    public Base(String Name,Double Price,String Processor,String Ram,String Harddisk) {
        this.Name = Name;
        this.Price=Price;
        this.Processor =Processor;
        this.Ram =Ram;
        this.Harddisk = Harddisk;
    }
    public void Details()
    {
        System.out.println("name"+Name);
        System.out.println("price"+Price);
        System.out.println("processor"+Processor);
        System.out.println("ram"+Ram);
        System.out.println("harddisk"+Harddisk);
    }
}
