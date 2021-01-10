package com.micron.principle.dependencyinversion;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-03 15:59:52
 * @remarks TODO
 */
public class DependencyInversionImprove1 {
    public static void main(String[] args) {
        // 客戶端無須修改
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new Facebook2());
    }
}

interface IReceiver{
    String getInfo();
}

// 只要接口IReceiver沒有發生變化，子類(細節)發生變化不會對客戶端(應用層)有影響
class Email2 implements IReceiver{
    public String getInfo(){
        return "電子郵件的訊息: hello world!";
    }
}

class Facebook2 implements IReceiver{
    public String getInfo(){
        return "FB的訊息: hello Facebook!";
    }
}

// 完成Person接收消息功能
// 方式2分析
class Person2{
    // 這裡是對接口IReceiver產生依賴
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}