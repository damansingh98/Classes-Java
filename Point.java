public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
       double dist = Math.sqrt(((0-this.x) * (0-this.x)) + ((0-this.y) *(0-this.y)));
        System.out.println(dist);
        return dist;
    }
    public double distance(int x, int y){
        double dis = Math.sqrt(((this.x - x)*(this.x-x))*(this.y-y)*(this.y-y));
        System.out.println(dis);
        return dis;

    }
    public double distance(Point another){
       return  distance(another.getX(), another.getY());

    }

    public static void main(String[] args) {
      Point p = new Point(6,5);
      //Point g = new Point(1,-1);
      p.distance(2,2);
    }





}
