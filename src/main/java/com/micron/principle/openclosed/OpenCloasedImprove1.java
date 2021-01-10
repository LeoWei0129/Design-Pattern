package com.micron.principle.openclosed;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-04 16:40:24
 * @remarks TODO
 */
public class OpenCloasedImprove1 {
    public static void main(String[] args) {
        GraphicEditor2 graphicEditor2 = new GraphicEditor2();
        graphicEditor2.drawShape(new Circle2());
        graphicEditor2.drawShape(new Rectangle2());
        graphicEditor2.drawShape(new Square2());
    }
}

// 使用方
// 這是一個用於繪圖的類
class GraphicEditor2 {
    // 接收Shape對象，調用draw()即可
    public void drawShape(Shape2 shape) {
        shape.draw();
    }
}

// 提供方
// Shape類，基類
abstract class Shape2 {
    int m_type;
    public abstract void draw(); // 抽象方法
}

class Circle2 extends Shape2 {
    public Circle2() {
        this.m_type = 1;
    }

    public void draw() {
        System.out.println("圓形");
    }
}

class Rectangle2 extends Shape2 {
    public Rectangle2() {
        this.m_type = 2;
    }

    public void draw() {
        System.out.println("長方形");
    }
}

// 新增一個類
class Square2 extends Shape2 {
    public Square2() {
        this.m_type = 3;
    }

    public void draw() {
        System.out.println("正方形");
    }
}
