package com.micron.pattern.prototype.deepclone;

import java.io.*;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 10:40:36
 * @remarks TODO
 */
public class DeepPrototype implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
        super();
    }

    // 深拷貝 - 實現方式1
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        // 這裡完成對基本數據類型和String的複製
        deep = super.clone();

        // 對引用類型的屬性進行clone()，須單獨處理(只要調用clone()，就會多創造一份空間給這新的對象)
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepPrototype;
    }

    // 深拷貝 - 實現方式2(推薦)
    // 推薦原因: 方式1要針對每一種引用類屬屬性逐一clone，方式2是直接針對當前對象this對其整個一次clone，會更方便
    public Object serializableClone() {
        // 創建流對象
        ByteArrayOutputStream bos = null; // 字節流
        ObjectOutputStream oos = null; // 對象流
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        // 以對象流的方式寫出去，再以對象流的方式讀進來
        // 因為是對this(對象整體)進象序列化，所以this的類型屬性也會跟著進行序列化
        try {
            // 序列化(寫出)
            // 將字節數組輸出流換成對象輸出流
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 將當前這個對象以對象流的方式輸出(e.g. 序列化(vt.))
            oos.writeObject(this);

            // 反序列化(讀入)
            // 將寫出去的對象再讀進來，相當於做了一次的clone
            bis = new ByteArrayInputStream(bos.toByteArray());
            // 對象輸入流，讀到原先序列化出去的this對象
            ois = new ObjectInputStream(bis);
            DeepPrototype deepPrototype = (DeepPrototype) ois.readObject();

            return deepPrototype;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
