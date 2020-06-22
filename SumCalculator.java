public class SumCalculator {

    double  firstNumber, secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){

        return firstNumber+secondNumber;

    }
    public double getSubtractionResult(){
       return firstNumber - secondNumber;

    }
    public  double getMultiplicationResult(){
        return  firstNumber*secondNumber;

    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;

        } else {

            System.out.println(firstNumber / secondNumber);
        }
        return firstNumber/ secondNumber;
    }

    public static void main(String[] args) {
        SumCalculator s = new SumCalculator();
        s.setFirstNumber(2.0);
        s.setSecondNumber(3.0);
       s.getDivisionResult();
    }

}
