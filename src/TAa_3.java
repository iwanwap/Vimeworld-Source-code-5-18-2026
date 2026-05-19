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
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class TAa_3
extends Nca {
    private double I;

    public float J() {
        TAa_3 a2;
        return (float)a2.I;
    }

    public int hashCode() {
        long l2;
        TAa_3 a2;
        TAa_3 tAa_3 = a2;
        long l3 = l2 = Double.doubleToLongBits(tAa_3.I);
        return super.hashCode() ^ (int)(l3 ^ l3 >>> fPa.i);
    }

    public byte f() {
        TAa_3 a2;
        return (byte)(Oz.f((double)a2.I) & osa.Ja);
    }

    public TAa_3(double a2) {
        TAa_3 b2;
        b2.I = a2;
    }

    public String toString() {
        TAa_3 a2;
        return new StringBuilder().insert(2 & 5, Mqa.y).append(a2.I).append(kra.k).toString();
    }

    public byte J() {
        return (byte)uua.p;
    }

    public int J() {
        TAa_3 a2;
        return Oz.f((double)a2.I);
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        TAa_3 a2 = this;
        b2.writeDouble(a2.I);
    }

    public TAa_3() {
        TAa_3 a2;
    }

    public boolean equals(Object object) {
        TAa_3 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            if (a2.I == b2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public NCa J() {
        TAa_3 a2;
        return new TAa_3(a2.I);
    }

    public long J() {
        TAa_3 a2;
        return (long)Math.floor(a2.I);
    }

    public short J() {
        TAa_3 a2;
        return (short)(Oz.f((double)a2.I) & yQa.j);
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        TAa_3 d2 = uca2;
        TAa_3 a2 = this;
        d2.J(vua.U);
        a2.I = c2.readDouble();
    }

    public double J() {
        TAa_3 a2;
        return a2.I;
    }
}

