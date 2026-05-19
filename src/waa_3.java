/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  NCa
 *  NTa
 *  Qsa
 *  TAa
 *  URa
 *  Waa
 *  aSa
 *  bpa
 *  cQa
 *  gCa
 *  kPa
 *  pPa
 *  rAa
 *  uca
 *  vRa
 */
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class waa_3
extends NCa {
    private List<NCa> J = Lists.newArrayList();
    private static final Logger A = LogManager.getLogger();
    private byte I = (byte)uSa.E;

    public Waa J(int n2) {
        int b22 = n2;
        waa_3 a2 = this;
        if (b22 >= 0 && b22 < a2.J.size()) {
            NCa b22 = a2.J.get(b22);
            if (b22.J() == NTa.C) {
                return (Waa)b22;
            }
            return new Waa();
        }
        return new Waa();
    }

    public int f() {
        waa_3 a2;
        return a2.I;
    }

    public int J() {
        waa_3 a2;
        return a2.J.size();
    }

    public double J(int n2) {
        int b22 = n2;
        waa_3 a2 = this;
        if (b22 >= 0 && b22 < a2.J.size()) {
            NCa b22 = a2.J.get(b22);
            if (b22.J() == uua.p) {
                return ((TAa)b22).J();
            }
            return aSa.V;
        }
        return aSa.V;
    }

    public NCa J() {
        waa_3 waa_32 = this;
        waa_3 waa_33 = new waa_3();
        waa_3 waa_34 = waa_32;
        new waa_3().I = waa_34.I;
        Iterator<NCa> a2 = waa_34.J.iterator();
        Object object = a2;
        while (object.hasNext()) {
            NCa nCa2 = ((NCa)a2.next()).J();
            object = a2;
            waa_33.J.add(nCa2);
        }
        return waa_33;
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        int n3;
        void c2;
        void b2;
        void a2;
        waa_3 waa_32 = this;
        a2.J(wsa.R);
        if (b2 > cQa.z) {
            throw new RuntimeException(kPa.F);
        }
        void v0 = c2;
        waa_32.I = v0.readByte();
        int d2 = v0.readInt();
        if (waa_32.I == 0 && d2 > 0) {
            throw new RuntimeException(Gta.h);
        }
        a2.J(URa.E * (long)d2);
        waa_32.J = Lists.newArrayListWithCapacity(d2);
        int n4 = n3 = uSa.E;
        while (n4 < d2) {
            waa_3 waa_33 = waa_32;
            NCa nCa2 = NCa.J((byte)waa_33.I);
            nCa2.J((DataInput)c2, (int)(b2 + vRa.d), (uca)a2);
            waa_33.J.add(nCa2);
            n4 = ++n3;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, NCa nCa2) {
        void b2;
        waa_3 c2 = nCa2;
        waa_3 a2 = this;
        if (c2.J() == 0) {
            A.warn(bpa.Y);
            return;
        }
        if (b2 >= 0 && b2 < a2.J.size()) {
            waa_3 waa_32;
            if (a2.I == 0) {
                waa_32 = a2;
                a2.I = c2.J();
            } else {
                if (a2.I != c2.J()) {
                    A.warn(Hta.l);
                    return;
                }
                waa_32 = a2;
            }
            waa_32.J.set((int)b2, c2);
            return;
        }
        A.warn(Qsa.A);
    }

    public waa_3() {
        waa_3 a2;
    }

    public byte J() {
        return (byte)WOa.fa;
    }

    public String J(int n2) {
        int b22 = n2;
        waa_3 a2 = this;
        if (b22 >= 0 && b22 < a2.J.size()) {
            NCa b22 = a2.J.get(b22);
            if (b22.J() == Yqa.i) {
                return b22.J();
            }
            return b22.toString();
        }
        return Mqa.y;
    }

    public boolean equals(Object object) {
        waa_3 a2 = this;
        Object b2 = object;
        if (super.equals(b2) && a2.I == b2.I) {
            return a2.J.equals(b2.J);
        }
        return uSa.E != 0;
    }

    public float J(int n2) {
        int b22 = n2;
        waa_3 a2 = this;
        if (b22 >= 0 && b22 < a2.J.size()) {
            NCa b22 = a2.J.get(b22);
            if (b22.J() == tTa.h) {
                return ((rAa)b22).J();
            }
            return JPa.N;
        }
        return JPa.N;
    }

    public NCa f(int n2) {
        int b2 = n2;
        waa_3 a2 = this;
        if (b2 >= 0 && b2 < a2.J.size()) {
            return a2.J.get(b2);
        }
        return new gCa();
    }

    public void J(NCa nCa2) {
        waa_3 waa_32;
        waa_3 b2 = nCa2;
        waa_3 a2 = this;
        if (b2.J() == 0) {
            A.warn(bpa.Y);
            return;
        }
        if (a2.I == 0) {
            waa_32 = a2;
            a2.I = b2.J();
        } else {
            if (a2.I != b2.J()) {
                A.warn(Hta.l);
                return;
            }
            waa_32 = a2;
        }
        waa_32.J.add(b2);
    }

    public void J(DataOutput dataOutput) throws IOException {
        int n2;
        DataOutput dataOutput2;
        DataOutput b2 = dataOutput;
        waa_3 a2 = this;
        if (!a2.J.isEmpty()) {
            a2.I = a2.J.get(uSa.E).J();
            dataOutput2 = b2;
        } else {
            a2.I = (byte)uSa.E;
            dataOutput2 = b2;
        }
        dataOutput2.writeByte(a2.I);
        b2.writeInt(a2.J.size());
        int n3 = n2 = uSa.E;
        while (n3 < a2.J.size()) {
            NCa nCa2 = a2.J.get(n2);
            nCa2.J(b2);
            n3 = ++n2;
        }
    }

    public boolean J() {
        waa_3 a2;
        return a2.J.isEmpty();
    }

    public NCa J(int n2) {
        int b2 = n2;
        waa_3 a2 = this;
        return a2.J.remove(b2);
    }

    public int[] J(int n2) {
        int b22 = n2;
        waa_3 a2 = this;
        if (b22 >= 0 && b22 < a2.J.size()) {
            NCa b22 = a2.J.get(b22);
            if (b22.J() == pPa.f) {
                return ((OAa)b22).J();
            }
            return new int[uSa.E];
        }
        return new int[uSa.E];
    }

    public String toString() {
        int a2;
        waa_3 waa_32 = this;
        StringBuilder stringBuilder = new StringBuilder(dqa.X);
        int n2 = a2 = uSa.E;
        while (n2 < waa_32.J.size()) {
            if (a2 != 0) {
                stringBuilder.append((char)Yqa.D);
            }
            stringBuilder.append(a2).append((char)lQa.R).append(waa_32.J.get(a2++));
            n2 = a2;
        }
        return stringBuilder.append((char)fPa.t).toString();
    }

    public int hashCode() {
        waa_3 a2;
        return super.hashCode() ^ a2.J.hashCode();
    }
}

