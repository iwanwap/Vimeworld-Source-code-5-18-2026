/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NCa
 *  Nca
 *  Oz
 *  uca
 *  vRa
 *  yQa
 *  yra
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class rAa_1
extends Nca {
    private float I;

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        rAa_1 d2 = uca2;
        rAa_1 a2 = this;
        d2.J(yra.A);
        a2.I = c2.readFloat();
    }

    public long J() {
        rAa_1 a2;
        return (long)a2.I;
    }

    public double J() {
        rAa_1 a2;
        return a2.I;
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        rAa_1 a2 = this;
        b2.writeFloat(a2.I);
    }

    public rAa_1() {
        rAa_1 a2;
    }

    public short J() {
        rAa_1 a2;
        return (short)(Oz.J((float)a2.I) & yQa.j);
    }

    public NCa J() {
        rAa_1 a2;
        return new rAa_1(a2.I);
    }

    public boolean equals(Object object) {
        rAa_1 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            if (a2.I == b2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public byte J() {
        return (byte)tTa.h;
    }

    public byte f() {
        rAa_1 a2;
        return (byte)(Oz.J((float)a2.I) & osa.Ja);
    }

    public float J() {
        rAa_1 a2;
        return a2.I;
    }

    public rAa_1(float f2) {
        float b2 = f2;
        rAa_1 a2 = this;
        a2.I = b2;
    }

    public int hashCode() {
        rAa_1 a2;
        return super.hashCode() ^ Float.floatToIntBits(a2.I);
    }

    public int J() {
        rAa_1 a2;
        return Oz.J((float)a2.I);
    }

    public String toString() {
        rAa_1 a2;
        return new StringBuilder().insert(2 & 5, Mqa.y).append(a2.I).append(BPa.Z).toString();
    }
}

