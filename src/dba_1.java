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
public final class dba_1
extends Nca {
    private short I;

    public dba_1(short s) {
        short b2 = s;
        dba_1 a2 = this;
        a2.I = b2;
    }

    public float J() {
        dba_1 a2;
        return a2.I;
    }

    public long J() {
        dba_1 a2;
        return a2.I;
    }

    public byte J() {
        return (byte)uqa.g;
    }

    public NCa J() {
        dba_1 a2;
        return new dba_1(a2.I);
    }

    public boolean equals(Object object) {
        dba_1 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            if (a2.I == b2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public short J() {
        dba_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        dba_1 d2 = uca2;
        dba_1 a2 = this;
        d2.J(Vra.B);
        a2.I = c2.readShort();
    }

    public int J() {
        dba_1 a2;
        return a2.I;
    }

    public byte f() {
        dba_1 a2;
        return (byte)(a2.I & osa.Ja);
    }

    public dba_1() {
        dba_1 a2;
    }

    public double J() {
        dba_1 a2;
        return a2.I;
    }

    public int hashCode() {
        dba_1 a2;
        return super.hashCode() ^ a2.I;
    }

    public String toString() {
        dba_1 a2;
        return new StringBuilder().insert(3 & 4, Mqa.y).append(a2.I).append(wsa.Q).toString();
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        dba_1 a2 = this;
        b2.writeShort(a2.I);
    }
}

