package com.unimicron.pattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author Leo
 * @version 1.0
 * @date 2020-11-16 10:27:04
 * @remarks TODO
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 因為該類的屬性都是String，因此這裡我們使用默認的clone()即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
