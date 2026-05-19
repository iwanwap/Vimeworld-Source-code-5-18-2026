/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  NCa
 *  RQa
 *  SRa
 *  uca
 *  vPa
 *  vRa
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tca_1
extends NCa {
    private String I;

    public String toString() {
        tca_1 a2;
        return new StringBuilder().insert(3 >> 2, SRa.b).append(a2.I.replace(SRa.b, RQa.O)).append(SRa.b).toString();
    }

    public boolean equals(Object object) {
        tca_1 a2 = this;
        Object b2 = object;
        if (!super.equals(b2)) {
            return uSa.E != 0;
        }
        if (a2.I == null && b2.I == null || a2.I != null && a2.I.equals(b2.I)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        tca_1 a2;
        return super.hashCode() ^ a2.I.hashCode();
    }

    public tca_1() {
        tca_1 a2;
        a2.I = Mqa.y;
    }

    public NCa J() {
        tca_1 a2;
        return new tca_1(a2.I);
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        tca_1 a2 = this;
        b2.writeUTF(a2.I);
    }

    public byte J() {
        return (byte)Yqa.i;
    }

    public tca_1(String string) {
        Object b2 = string;
        tca_1 a2 = this;
        a2.I = b2;
        if (a2.I == null) {
            throw new IllegalArgumentException(vPa.Q);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        tca_1 d2 = uca2;
        tca_1 a2 = this;
        tca_1 tca_12 = d2;
        tca_12.J(yRa.v);
        a2.I = c2.readUTF();
        tca_12.J(ERa.C * a2.I.length());
    }

    public boolean J() {
        tca_1 a2;
        return a2.I.isEmpty();
    }

    public String J() {
        tca_1 a2;
        return a2.I;
    }
}

