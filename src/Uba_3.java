/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JTa
 *  NCa
 *  Nca
 *  Spa
 *  uca
 *  vRa
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Uba_3
extends Nca {
    private byte I;

    public long J() {
        Uba_3 a2;
        return a2.I;
    }

    public Uba_3() {
        Uba_3 a2;
    }

    public NCa J() {
        Uba_3 a2;
        return new Uba_3(a2.I);
    }

    public int hashCode() {
        Uba_3 a2;
        return super.hashCode() ^ a2.I;
    }

    public double J() {
        Uba_3 a2;
        return a2.I;
    }

    public byte f() {
        Uba_3 a2;
        return a2.I;
    }

    public short J() {
        Uba_3 a2;
        return a2.I;
    }

    public String toString() {
        Uba_3 a2;
        return new StringBuilder().insert(3 ^ 3, Mqa.y).append(a2.I).append(JTa.Z).toString();
    }

    public float J() {
        Uba_3 a2;
        return a2.I;
    }

    public int J() {
        Uba_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        Uba_3 d2 = uca2;
        Uba_3 a2 = this;
        d2.J(Spa.q);
        a2.I = c2.readByte();
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        Uba_3 a2 = this;
        b2.writeByte(a2.I);
    }

    public byte J() {
        return (byte)vRa.d;
    }

    public Uba_3(byte by2) {
        byte b2 = by2;
        Uba_3 a2 = this;
        a2.I = b2;
    }

    public boolean equals(Object object) {
        Uba_3 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            if (a2.I == b2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }
}

