/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  NCa
 *  pPa
 *  uca
 *  yra
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class OAa
extends NCa {
    private int[] I;

    public int[] J() {
        OAa a2;
        return a2.I;
    }

    public OAa() {
        OAa a2;
    }

    public String toString() {
        int n2;
        OAa oAa = this;
        Object a2 = dqa.X;
        int[] nArray = oAa.I;
        int n3 = oAa.I.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            int n5 = nArray[n2];
            a2 = new StringBuilder().insert(2 & 5, (String)a2).append(n5).append(yra.t).toString();
            n4 = ++n2;
        }
        return new StringBuilder().insert(3 & 4, (String)a2).append(XOa.D).toString();
    }

    public NCa J() {
        OAa oAa = this;
        Object a2 = new int[oAa.I.length];
        System.arraycopy(oAa.I, uSa.E, a2, uSa.E, oAa.I.length);
        return new OAa((int[])a2);
    }

    public OAa(int[] nArray) {
        Object b2 = nArray;
        OAa a2 = this;
        a2.I = (int[])b2;
    }

    public byte J() {
        return (byte)pPa.f;
    }

    public boolean equals(Object object) {
        OAa a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            return Arrays.equals(a2.I, b2.I);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        OAa d2 = uca2;
        OAa a2 = this;
        OAa oAa = d2;
        oAa.J(MQa.f);
        int b2 = c2.readInt();
        oAa.J(fPa.i * b2);
        a2.I = new int[b2];
        int n3 = d2 = uSa.E;
        while (n3 < b2) {
            a2.I[d2++] = c2.readInt();
            n3 = d2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataOutput dataOutput) throws IOException {
        int b2;
        void a2;
        OAa oAa = this;
        a2.writeInt(oAa.I.length);
        int n2 = b2 = uSa.E;
        while (n2 < oAa.I.length) {
            a2.writeInt(oAa.I[b2++]);
            n2 = b2;
        }
    }

    public int hashCode() {
        OAa a2;
        return super.hashCode() ^ Arrays.hashCode(a2.I);
    }
}

