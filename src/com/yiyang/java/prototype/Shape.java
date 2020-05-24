package com.yiyang.java.prototype;

/**
 * @author Liufei
 * @date 2020/4/10 2:47 下午
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
