package com.micron.principle.openclosed;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-04 16:17:29
 * @remarks TODO
 */
public class OpenClosed1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Square());
    }
}

// 使用方
// 這是一個用於繪圖的類
class GraphicEditor {
    // 接收Shape對象，然後根據type，繪製不同的圖形
    public void drawShape(Shape shape) {
        if (shape.m_type == 1) {
            drawCircle();
        } else if (shape.m_type == 2) {
            drawRectangle();
        } else if (shape.m_type == 3) { // 新增的代碼區塊
            drawSquare();
        }
    }

    public void drawCircle() {
        System.out.println("圓形");
    }

    public void drawRectangle() {
        System.out.println("長方形");
    }

    public void drawSquare() { // 新增的代碼區塊
        System.out.println("正方形");
    }
}

// 提供方
// Shape類，基類
class Shape {
    int m_type;
}

class Circle extends Shape {
    public Circle() {
        this.m_type = 1;
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        this.m_type = 2;
    }
}

// 新增一個類
class Square extends Shape {
    public Square() {
        this.m_type = 3;
    }
}