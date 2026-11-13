public class car {
    String color="red";
    void speed(){
        System.out.println("500km/hr");
    }
}
class Main{
    public static void main(String[] args) {
        car bmw=new car();
        System.out.println(bmw.color);
        bmw.speed();
    }
}
    

