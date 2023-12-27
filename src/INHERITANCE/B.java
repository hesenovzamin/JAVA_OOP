package INHERITANCE;

public class B extends A{
    public B (){
        System.out.println("I am default ctor B");
    }
    public B (int x,int y){
        System.out.println("I am para ctor B");
    }

    @Override
    protected void print() {
        System.out.println("HELLO B!");
    }
}
