public class Operand {
    double _result;
    public Operand(){
        _result = 0;
    }
    public Operand(double r){
        _result = r;
    }
    public void setResult(double r){
        _result = r;
    }
    public void print(){
        System.out.println(_result);
    }
    public static void main(String[] args){
        Operand operand1 = new Operand();
        Operand operand2 = new Operand(10.0);
        operand1.print();
        operand2.print();
        operand1.setResult(5.0);
        operand2.setResult(20.0);
        operand1.print();
        operand2.print();
    }
}