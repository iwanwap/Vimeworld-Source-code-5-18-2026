/*
 * Decompiled with CFR 0.152.
 */
package javax.vecmath;

import java.io.Serializable;

public abstract class Tuple3b
implements Serializable {
    public byte x;
    public byte y;
    public byte z;

    public Tuple3b(byte b1, byte b2, byte b3) {
        this.x = b1;
        this.y = b2;
        this.z = b3;
    }

    public Tuple3b(byte[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
    }

    public Tuple3b(Tuple3b t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
    }

    public Tuple3b() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public final void set(Tuple3b t1) {
        this.x = t1.x;
        this.y = t1.y;
        this.z = t1.z;
    }

    public final void set(byte[] t2) {
        this.x = t2[0];
        this.y = t2[1];
        this.z = t2[2];
    }

    public final void get(byte[] t2) {
        t2[0] = this.x;
        t2[1] = this.y;
        t2[2] = this.z;
    }

    public final void get(Tuple3b t2) {
        t2.x = this.x;
        t2.y = this.y;
        t2.z = this.z;
    }

    public int hashCode() {
        return this.x | this.y << 8 | this.z << 16;
    }

    public boolean equals(Tuple3b t1) {
        return t1 != null && this.x == t1.x && this.y == t1.y && this.z == t1.z;
    }

    public boolean equals(Object o1) {
        return o1 != null && o1 instanceof Tuple3b && this.equals((Tuple3b)o1);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
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
}

