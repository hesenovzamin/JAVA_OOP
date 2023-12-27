package Task2;

public class BasicOperation {
    private double result;

    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public void sum (int x){
        setResult(getResult() +x);
    }
    public void sum (int x,int y){
        setResult((getResult() + x + y));
    }
    public void sum (int x ,int y,int z){
        setResult(getResult() + x + y + z);
    }
    public void sum (double x){
        setResult(getResult() + x);
    }
    public void sum (double x,int y){
        setResult(getResult() + x + y);
    }
}
