 class SimpleInterest1 {
    private  int  Amount ;
    private  double Rate ;

    private int time ;

    private double SimpleInterest;

    SimpleInterest1(){
        this.Amount=100000;
        this.Rate=5.5;
        this.time=12;
        this.SimpleInterest=(Amount*Rate*time)/100;


    }
    void display(){

        System.out.println("Simple Interest ="+SimpleInterest);
    }
    
}
public class SimpleInterest{
    public static void main(String [] args)
{
   SimpleInterest1 ob = new SimpleInterest1();
   ob.display();

}
}
