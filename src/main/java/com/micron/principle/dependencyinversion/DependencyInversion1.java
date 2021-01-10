package com.micron.principle.dependencyinversion;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-03 15:44:41
 * @remarks TODO
 */
public class DependencyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "電子郵件的訊息: hello world!";
    }
}

// 完成Person接收消息功能
// 方式1分析
// 1. 簡單，比較容易想到
// 2. 如果我們獲取的對象是FB、簡訊等等，則要新增類，同時Person也要新增相應的方法
// 3. 解決思路:
//    a. 引入一個抽象的接口IReceiver，表示接收者，這樣Person類與接口IReceiver發生依賴
//    b. 因為Email、FB、簡訊屬於接收的範圍，他們只要各自實現IReceiver就ok，Person類再通過接口IReceiver去依類各個類，這樣我們就符
//       合依賴倒轉原則
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
