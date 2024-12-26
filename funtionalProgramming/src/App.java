 import interfaces.FunctionR2R;
public class App {
    public static void main(String[] args)  {
       
        FunctionR2R sqr=x->x*x;
        System.out.println(sqr.valueAt(4));
    }
}
