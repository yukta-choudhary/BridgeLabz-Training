package com.functionalinterfaces.cloneprototypes;


public class PrototypeModel implements Cloneable {

    private String modelName;
    private int version;

    public PrototypeModel(String modelName, int version) {
        this.modelName = modelName;
        this.version = version;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + modelName + ", Version: " + version;
    }
}
