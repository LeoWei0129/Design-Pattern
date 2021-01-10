package com.micron.principle.dependencyinversion;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-03 16:16:23
 * @remarks TODO
 */
public class ParamPassWays {
    public static void main(String[] args) {
        // 方式1
        RealTV1 realTV1 = new RealTV1();
        OpenAndClose1 openAndClose1 = new OpenAndClose1();
        openAndClose1.open(realTV1);

        // 方式2
        RealTV2 realTV2 = new RealTV2();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(realTV2);
        openAndClose2.open();

        // 方式3
        RealTV3 realTV3 = new RealTV3();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTV3(realTV3);
        openAndClose3.open();
    }
}

//------------------------------------------------------ 實現類 ------------------------------------------------------//
class RealTV1 implements ITV1{
    public void play() {
        System.out.println("這是真實的電視1");
    }
}

class RealTV2 implements ITV2{
    public void play() {
        System.out.println("這是真實的電視2");
    }
}

class RealTV3 implements ITV3{
    public void play() {
        System.out.println("這是真實的電視3");
    }
}

//------------------------------------------------------ 方式1 -------------------------------------------------------//
// 方式1: 接口傳遞
// 開關接口
interface IOpenAndClose1{
    public void open(ITV1 tv1);
}

// 電視接口
interface ITV1{
   public void play();
}

//實現接口
class OpenAndClose1 implements IOpenAndClose1{
    public void open(ITV1 tv1) {
        tv1.play();
    }
}

//------------------------------------------------------ 方式2 -------------------------------------------------------//
// 方式2: 構造方法傳遞
interface IOpenAndClose2{
    public void open();
}

// 電視接口
interface ITV2{
    public void play();
}

//實現接口
class OpenAndClose2 implements IOpenAndClose2{
    private ITV2 itv2;

    public OpenAndClose2(ITV2 tv2){
        this.itv2 = tv2;
    }

    public void open() {
        itv2.play();
    }
}

//------------------------------------------------------ 方式3 -------------------------------------------------------//
// 方式3: setter方式傳遞
interface IOpenAndClose3{
    public void open();
    public void setTV3(ITV3 tv3);
}

// 電視接口
interface ITV3{
    public void play();
}

//實現接口
class OpenAndClose3 implements IOpenAndClose3{
    private ITV3 itv3;

    public void setTV3(ITV3 tv3) {
        this.itv3 = tv3;
    }

    public void open() {
        itv3.play();
    }
}