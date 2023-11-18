package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+34}")
    private int x;

    @Value("#{12+48}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int z;

    @Value("#{T(java.lang.Math).PI}")
    private int e;

    @Value("#{ 8 - 4> 5}")
    private boolean isActive;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public int getE() {
        return e;
    }
    public void setE(int e) {
        this.e = e;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", isActive=" + isActive + "]";
    }
    
}
