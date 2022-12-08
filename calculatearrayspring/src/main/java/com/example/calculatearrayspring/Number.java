package com.example.calculatearrayspring;


public class Number {
    private int size;
    private double start;
    private double finish;
    private Long type;
    private Long precision;
    private Long operation;
    private Long typeArray;
    private Long typeVarFloat;
    private Long typeVarInt;

    public Long getTypeArray() {
        return typeArray;
    }

    public void setTypeArray(Long typeArray) {
        this.typeArray = typeArray;
    }

    public Long getTypeVarFloat() {
        return typeVarFloat;
    }

    public void setTypeVarFloat(Long typeVarFloat) {
        this.typeVarFloat = typeVarFloat;
    }

    public Long getTypeVarInt() {
        return typeVarInt;
    }

    public void setTypeVarInt(Long typeVarInt) {
        this.typeVarInt = typeVarInt;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getFinish() {
        return finish;
    }

    public void setFinish(double finish) {
        this.finish = finish;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getPrecision() {
        return precision;
    }

    public void setPrecision(Long precision) {
        this.precision = precision;
    }

    public Long getOperation() {
        return operation;
    }

    public void setOperation(Long operation) {
        this.operation = operation;
    }
}
