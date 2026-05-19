/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NCa
 *  Nca
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
public final class Nba_1
extends Nca {
    private int I;

    public Nba_1(int n2) {
        int b2 = n2;
        Nba_1 a2 = this;
        a2.I = b2;
    }

    public byte J() {
        return (byte)yRa.d;
    }

    public NCa J() {
        Nba_1 a2;
        return new Nba_1(a2.I);
    }

    public boolean equals(Object object) {
        Nba_1 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            if (a2.I == b2.I) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public long J() {
        Nba_1 a2;
        return a2.I;
    }

    public String toString() {
        Nba_1 a2;
        return new StringBuilder().insert(3 & 4, Mqa.y).append(a2.I).toString();
    }

    public float J() {
        Nba_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        Nba_1 d2 = uca2;
        Nba_1 a2 = this;
        d2.J(yra.A);
        a2.I = c2.readInt();
    }

    public byte f() {
        Nba_1 a2;
        return (byte)(a2.I & osa.Ja);
    }

    public Nba_1() {
        Nba_1 a2;
    }

    public short J() {
        Nba_1 a2;
        return (short)(a2.I & yQa.j);
    }

    public double J() {
        Nba_1 a2;
        return a2.I;
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        Nba_1 a2 = this;
        b2.writeInt(a2.I);
    }

    public int hashCode() {
        Nba_1 a2;
        return super.hashCode() ^ a2.I;
    }

    public int J() {
        Nba_1 a2;
        return a2.I;
    }
}

