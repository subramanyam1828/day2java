public class animal {
    String name;
    double weight;
    animal(String name,double weight){
        this.name=name;
        this.weight=weight;
    }
    void display(){
        System.out.println("animal:"+name+"weight:"+weight+"kg");

    }
}
class Main{
    public static void main(String[] args){
        animal dog=new animal("dog",25.5);
        animal elephant=new animal("elephant",5000);
        dog.display();
        elephant.display();


    }
}
    
    
    

