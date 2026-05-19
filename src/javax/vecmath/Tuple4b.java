/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;

public abstract class Tuple4b
implements Serializable {
    public byte x;
    public byte y;
    public byte z;
    public byte w;

    public Tuple4b(byte b1, byte b2, byte b3, byte b4) {
        this.x = b1;
        this.y = b2;
        this.z = b3;
        this.w = b4;
    }

    public Tuple4b(byte[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
        this.w = t2[3];
    }

    public Tuple4b(Tuple4b t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
        this.w = t1.w;
    }

    public Tuple4b() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    }

    public final void set(Tuple4b t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
        this.w = t1.w;
    }

    public final void set(byte[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
        this.w = t2[3];
    }

    public final void get(byte[] t2) {
        t2[0] = this.x;
        t2[1] = this.y;
        t2[2] = this.z;
        t2[3] = this.w;
    }

    public final void get(Tuple4b t2) {
        t2.x = this.x;
        t2.y = this.y;
        t2.z = this.z;
        t2.w = this.w;
    }

    public int hashCode() {
        return this.x | this.y << 8 | this.z << 16 | this.w << 24;
    }

    public boolean equals(Tuple4b t1) {
        return t1 != null && this.x == t1.x && this.y == t1.y && this.z == t1.z && this.w == t1.w;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ", " + this.w + ")";
    }

    public byte getX() {
        return this.x;
    }

    public void setX(byte x2) {
        this.x = x2;
    }

    public byte getY() {
        return this.y;
    }

    public void setY(byte y2) {
        this.y = y2;
    }

    public byte getZ() {
        return this.z;
    }

    public void setZ(byte z2) {
        this.z = z2;
    }

    public byte getW() {
        return this.w;
    }

    public void setW(byte w2) {
        this.w = w2;
    }
}

