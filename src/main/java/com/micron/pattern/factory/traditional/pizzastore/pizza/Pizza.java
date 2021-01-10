package com.micron.pattern.factory.traditional.pizzastore.pizza;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-10 11:01:21
 * @remarks TODO
 */
public abstract class Pizza {
    protected String name; // 披薩名稱

    // 準備原材料，因為每種披薩的材料都不一樣，所以做成抽象方法
    public abstract void prepare();

    // bake()、cut()、box()，因為每種披薩的這些方法差不多，所以直接將其實現
    public void bake(){
        System.out.println(name + " baking...");
    }

    public void cut(){
        System.out.println(name + " cutting...");
    }

    public void box(){
        System.out.println(name + " boxing...");
    }

    public void setName(String name){
        this.name = name;
    }
}
