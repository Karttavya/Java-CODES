//class wala code
class Demo{
    int a,b;
    Demo(int p, int q){
        a=p;
        b=q;
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
class main
{
    public static void main(String[] args) {
        {
            Demo d1= new Demo(7,3);
            d1.show();
            Demo d2= new Demo(-5,-8);
            d2.show();
            Demo d3= new Demo(1000,2000);
            d3.show();
        }
    }
}