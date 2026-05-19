/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  MQa
 *  NCa
 *  XTa
 *  cQa
 *  uca
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nAa
extends NCa {
    private byte[] I;

    public NCa J() {
        nAa nAa2 = this;
        Object a2 = new byte[nAa2.I.length];
        System.arraycopy(nAa2.I, uSa.E, a2, uSa.E, nAa2.I.length);
        return new nAa((byte[])a2);
    }

    public byte J() {
        return (byte)XTa.W;
    }

    public nAa(byte[] byArray) {
        Object b2 = byArray;
        nAa a2 = this;
        a2.I = (byte[])b2;
    }

    public void J(DataOutput dataOutput) throws IOException {
        DataOutput b2 = dataOutput;
        nAa a2 = this;
        b2.writeInt(a2.I.length);
        b2.write(a2.I);
    }

    public boolean equals(Object object) {
        nAa a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            return Arrays.equals(a2.I, b2.I);
        }
        return uSa.E != 0;
    }

    public String toString() {
        nAa a2;
        return new StringBuilder().insert(3 & 4, dqa.X).append(a2.I.length).append(cQa.t).toString();
    }

    public byte[] J() {
        nAa a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void a2;
        DataInput d22 = dataInput;
        nAa c2 = this;
        DataInput dataInput2 = d22;
        a2.J(MQa.f);
        int d22 = dataInput2.readInt();
        a2.J((long)(Yqa.i * d22));
        c2.I = new byte[d22];
        dataInput2.readFully(c2.I);
    }

    public int hashCode() {
        nAa a2;
        return super.hashCode() ^ Arrays.hashCode(a2.I);
    }

    public nAa() {
        nAa a2;
    }
}

