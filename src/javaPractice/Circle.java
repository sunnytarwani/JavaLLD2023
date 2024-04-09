package javaPractice;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area(){
        double area1 =  Math.PI*getRadius()*getRadius();
        System.out.println("the area of the circle is " + area1);
    }

    public void volume(){
        double volume_1 = 2*Math.PI*getRadius();
        System.out.println("the volume of the circle is " + volume_1);
    }
}

class Cylinder extends Circle{
    public int height;

    public void area(){
        double area_cy = (2 * Math.PI * getRadius() * getRadius()) * this.height;
        System.out.println("The area of the cylinder is "+area_cy);
    }
}

class Main{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(6);
        Cylinder cy = new Cylinder();
        cy.height = 2;
        c.area();

        System.out.println(c.getRadius());
    }
}