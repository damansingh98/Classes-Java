public class Wall {
    private double width, height;


    public double getArea() {
        return width * height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            setWidth(0);

        } else {

            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            setHeight(0);

        } else {
            this.height = height;
        }
    }

    public Wall() {


    }

    public  Wall(double width, double height) {
        if (width < 0) {
            width = 0;
            System.out.println("Width = " + width);
        } if (height < 0) {
            height = 0;
            System.out.println("Height = " + height);

        }
            this.width = width;
            this.height = height;

    }


    public static void main(String[] args) {
        Wall w = new Wall(-2.0, -1.0);
        w.setHeight(0);
        w.setWidth(-1);
        w.getArea();
    }
}