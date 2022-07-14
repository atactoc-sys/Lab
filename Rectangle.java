package com.emploiee;

public class Rectangle {

    private int length;
    private int breadth;

    Rectangle(){
        this.length=78;
        this.breadth =59;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void area(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("reectangle area  =  "+this.length*this.breadth);
    }
}
class TestRectangle{
    public static void main(String args[]){
        Rectangle obj = new Rectangle();
        obj.setLength(123);
        obj.setBreadth(236);
        System.out.println(obj.getLength());
        System.out.println(obj.getBreadth());
        obj.area(68,54);

    }
}
