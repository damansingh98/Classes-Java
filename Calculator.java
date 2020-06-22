public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        double a = (floor.getArea())*(carpet.getCost());
        return a;

    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(1.5);
        Floor floor = new Floor(5.4, 4.5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
    }
}
