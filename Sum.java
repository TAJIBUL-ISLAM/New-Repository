 class Sum1{
    private int a ;
    private int b;
    private int Sum;

    Sum1 (){

        this.a=19;
        this.b=20;
        this.Sum =a+b;

    }
    void display(){

        System.out.println("Sum ="+Sum);
    }
}

public class Sum
{
    public static void main(String [] args)
{
   Sum1 ob = new Sum1();
   ob.display();

}
}
