package saturdaytest_june6;

class Test3{
    public void display(int
x, double y){
            System.out.println(x+y);
    } 
    public double display(double p, double q){
            return (p+q);
    }
    public static void main(String args[]){
            Test3 test = new Test3();
            test.display(4, 5.0);
            System.out.println(test.display(4.5, 5.0));
    }
}
