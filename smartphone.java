public class smartphone {
    String model;
    String os;
    int storagecapacity;
    smartphone(String model,String os,int storagecapacity){
        this.model=model;
        this.os=os;
        this.storagecapacity=storagecapacity;
    }
    void takephoto(){
        System.out.println("click!photo captured.");
    }
    void browseinternet(){
        System.out.println("loding websites...");
    }
    void display(){
        System.out.println("model:"+model);
        System.out.println("os:"+os);
        System.out.println("storage:"+storagecapacity+"gb");
    }
}
class Main{
    public static void main(String[] args) {
        smartphone phone=new smartphone("realme","ios",256);
        phone.display();
        phone.takephoto();
        phone.browseinternet();
    }
}
   

