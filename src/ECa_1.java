/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NCa
 *  Nca
 *  uca
 *  vRa
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ECa_1
extends Nca {
    private long I;

    public ECa_1() {
        ECa_1 a2;
    }

    public float J() {
        ECa_1 a2;
        return a2.I;
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        ECa_1 a2 = this;
        b2.writeLong(a2.I);
    }

    public int hashCode() {
        ECa_1 a2;
        return super.hashCode() ^ (int)(a2.I ^ a2.I >>> fPa.i);
    }

    public short J() {
        ECa_1 a2;
        return (short)(a2.I & yOa.o);
    }

    public byte f() {
        ECa_1 a2;
        return (byte)(a2.I & nua.u);
    }

    public boolean equals(Object object) {
        ECa_1 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            if (a2.I == b2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public String toString() {
        ECa_1 a2;
        return new StringBuilder().insert(3 & 4, Mqa.y).append(a2.I).append(GPa.V).toString();
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        ECa_1 d2 = uca2;
        ECa_1 a2 = this;
        d2.J(vua.U);
        a2.I = c2.readLong();
    }

    public ECa_1(long a2) {
        ECa_1 b2;
        b2.I = a2;
    }

    public byte J() {
        return (byte)AQa.P;
    }

    public long J() {
        ECa_1 a2;
        return a2.I;
    }

    public int J() {
        ECa_1 a2;
        return (int)(a2.I & fqa.Da);
    }

    public NCa J() {
        ECa_1 a2;
        return new ECa_1(a2.I);
    }

    public double J() {
        ECa_1 a2;
        return a2.I;
    }
}

