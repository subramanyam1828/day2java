public class laptop {
    String brand;
    int ramsize;
    double price;
    laptop(String brand,int ramsize,double price){
        this.brand=brand;
        this.ramsize=ramsize;
        this.price=price;
}
void bootup(){
    System.out.println("laptop is starting..");
}
void display(){
    System.out.println("brand:"+brand);
    System.out.println("ramsize:"+ramsize+"gb");
    System.out.println("price:$"+price);
}
}
class Main{
    public static void main(String[] args) {
        laptop mylaptop=new laptop("dell",16,65000);
        mylaptop.display();
        mylaptop.bootup();

    }
}
    

