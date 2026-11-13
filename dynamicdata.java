public class dynamicdata {
    String color;
    void speed(int num){
        System.out.println("speed.."+num);
    }
}
class Main{
    public static void main(String[] args) {
        dynamicdata bmw=new dynamicdata();
       dynamicdata rr=new dynamicdata();
       bmw.color="red";
       rr.color="blue";
       System.out.println(bmw.color);
       System.out.println(rr.color);
       bmw.speed(200);
       rr.speed(300);
    }
}
    

