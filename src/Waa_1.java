/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dha
 *  ECa
 *  EQa
 *  ERa
 *  FTa
 *  JPa
 *  MZ
 *  NCa
 *  NTa
 *  Nba
 *  Nca
 *  Qsa
 *  RIa
 *  RQa
 *  TAa
 *  Uba
 *  Waa
 *  XSa
 *  XTa
 *  ZRa
 *  aSa
 *  bpa
 *  cQa
 *  dba
 *  kPa
 *  oBa
 *  pPa
 *  qta
 *  rAa
 *  tca
 *  uca
 *  vRa
 *  waa
 */
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Waa_1
extends NCa {
    private Map<String, NCa> I = Maps.newHashMap();

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, int n2) {
        void a2;
        Waa_1 b2 = this;
        Object c22 = string;
        byte c22 = b2.f((String)c22);
        if (c22 == a2) {
            return vRa.d != 0;
        }
        if (a2 != zOa.v) {
            if (c22 > 0) {
                // empty if block
            }
            return uSa.E != 0;
        }
        if (c22 == vRa.d || c22 == uqa.g || c22 == yRa.d || c22 == AQa.P || c22 == tTa.h || c22 == uua.p) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public short J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, zOa.v)) break block3;
                return (short)uSa.E;
            }
            catch (ClassCastException classCastException) {
                return (short)uSa.E;
            }
        }
        return ((Nca)a2.I.get(b2)).J();
    }

    /*
     * WARNING - void declaration
     */
    public static NCa J(byte by2, String string, DataInput dataInput, int n2, uca uca2) throws IOException {
        DataInput e222 = dataInput;
        byte c2 = by2;
        NCa nCa2 = NCa.J((byte)c2);
        try {
            void a2;
            void b2;
            nCa2.J(e222, (int)b2, (uca)a2);
            return nCa2;
        }
        catch (IOException e222) {
            void d2;
            RIa e222 = RIa.J((Throwable)e222, (String)tua.Ja);
            Dha dha = e222.J(bpa.R);
            dha.J(ZRa.b, (Object)d2);
            dha.J(Gta.Q, (Object)c2);
            throw new MZ(e222);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, short s2) {
        void b2;
        short c2 = s2;
        Waa_1 a2 = this;
        a2.I.put((String)b2, (NCa)new dba(c2));
    }

    public byte f(String string) {
        Object b2 = string;
        Waa_1 a2 = this;
        if ((b2 = a2.I.get(b2)) != null) {
            return b2.J();
        }
        return (byte)uSa.E;
    }

    public byte J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, zOa.v)) break block3;
                return (byte)uSa.E;
            }
            catch (ClassCastException classCastException) {
                return (byte)uSa.E;
            }
        }
        return ((Nca)a2.I.get(b2)).f();
    }

    public void J(String string) {
        Object b2 = string;
        Waa_1 a2 = this;
        a2.I.remove(b2);
    }

    private static byte J(DataInput dataInput, uca uca2) throws IOException {
        DataInput b2 = uca2;
        DataInput a2 = dataInput;
        return a2.readByte();
    }

    public boolean f(String string) {
        Waa_1 a2 = this;
        Object b2 = string;
        if (a2.J((String)b2) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, double d2) {
        void a2;
        Object c2 = string;
        Waa_1 b2 = this;
        b2.I.put((String)c2, (NCa)new TAa((double)a2));
    }

    public long J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, zOa.v)) break block3;
                return nqa.i;
            }
            catch (ClassCastException classCastException) {
                return nqa.i;
            }
        }
        return ((Nca)a2.I.get(b2)).J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataInput dataInput, int n2, uca uca2) throws IOException {
        void c2;
        byte by2;
        void b2;
        Waa_1 d2 = uca2;
        Waa_1 a2 = this;
        d2.J(FTa.Aa);
        if (b2 > cQa.z) {
            throw new RuntimeException(kPa.F);
        }
        a2.I.clear();
        while ((by2 = Waa_1.J((DataInput)c2, (uca)d2)) != 0) {
            String string = Waa_1.J((DataInput)c2, (uca)d2);
            d2.J(EQa.B + ERa.C * string.length());
            NCa nCa2 = Waa_1.J(by2, string, (DataInput)c2, (int)(b2 + vRa.d), (uca)d2);
            if (a2.I.put(string, nCa2) == null) continue;
            d2.J(yRa.v);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, boolean bl) {
        void b2;
        boolean c2 = bl;
        Waa_1 a2 = this;
        a2.J((String)b2, (byte)(c2 ? vRa.d : uSa.E));
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, byte by2) {
        void b2;
        byte c2 = by2;
        Waa_1 a2 = this;
        a2.I.put((String)b2, (NCa)new Uba(c2));
    }

    public int hashCode() {
        Waa_1 a2;
        return super.hashCode() ^ a2.I.hashCode();
    }

    public boolean J() {
        Waa_1 a2;
        return a2.I.isEmpty();
    }

    public int[] J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, pPa.f)) break block3;
                return new int[uSa.E];
            }
            catch (ClassCastException classCastException) {
                throw new MZ(a2.J((String)b2, pPa.f, classCastException));
            }
        }
        return ((OAa)a2.I.get(b2)).J();
    }

    /*
     * WARNING - void declaration
     */
    private RIa J(String string, int n2, ClassCastException classCastException) {
        void b2;
        void a2;
        Object d2 = string;
        Waa_1 c2 = this;
        RIa rIa2 = RIa.J((Throwable)a2, (String)opa.F);
        Dha dha = rIa2.J(RQa.u, vRa.d);
        dha.J(qta.n, (Callable)new oBa((Waa)c2, (String)d2));
        dha.J(Qsa.W, (Callable)new TCa((Waa)c2, (int)b2));
        dha.J(ZRa.b, d2);
        return rIa2;
    }

    public Set<String> J() {
        Waa_1 a2;
        return a2.I.keySet();
    }

    public double J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, zOa.v)) break block3;
                return aSa.V;
            }
            catch (ClassCastException classCastException) {
                return aSa.V;
            }
        }
        return ((Nca)a2.I.get(b2)).J();
    }

    public static /* synthetic */ Map J(Waa a2) {
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int n2) {
        void b2;
        int c2 = n2;
        Waa_1 a2 = this;
        a2.I.put((String)b2, (NCa)new Nba(c2));
    }

    private static String J(DataInput dataInput, uca uca2) throws IOException {
        DataInput b2 = uca2;
        DataInput a2 = dataInput;
        return a2.readUTF();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Waa waa2) {
        void a2;
        Waa_1 waa_1 = this;
        for (String b2 : a2.I.keySet()) {
            NCa nCa2 = a2.I.get(b2);
            if (nCa2.J() == NTa.C) {
                if (waa_1.J(b2, NTa.C)) {
                    waa_1.J(b2).J((Waa)((Waa_1)nCa2));
                    continue;
                }
                waa_1.J(b2, nCa2.J());
                continue;
            }
            waa_1.J(b2, nCa2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, int[] nArray) {
        void b2;
        Object c2 = nArray;
        Waa_1 a2 = this;
        a2.I.put((String)b2, new OAa((int[])c2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, NCa nCa2) {
        void b2;
        Waa_1 c2 = nCa2;
        Waa_1 a2 = this;
        a2.I.put((String)b2, c2);
    }

    public float J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, zOa.v)) break block3;
                return JPa.N;
            }
            catch (ClassCastException classCastException) {
                return JPa.N;
            }
        }
        return ((Nca)a2.I.get(b2)).J();
    }

    public NCa J() {
        Waa_1 waa_1 = this;
        Waa_1 waa_12 = new Waa_1();
        Iterator<String> a2 = waa_1.I.keySet().iterator();
        Object object = a2;
        while (object.hasNext()) {
            String string;
            String string2 = string = (String)a2.next();
            waa_12.J(string2, waa_1.I.get(string2).J());
            object = a2;
        }
        return waa_12;
    }

    public boolean equals(Object object) {
        Waa_1 a2 = this;
        Object b2 = object;
        if (super.equals(b2)) {
            return a2.I.entrySet().equals(b2.I.entrySet());
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, long l2) {
        void a2;
        Object c2 = string;
        Waa_1 b2 = this;
        b2.I.put((String)c2, (NCa)new ECa((long)a2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        void b2;
        Object c2 = string2;
        Waa_1 a2 = this;
        a2.I.put((String)b2, (NCa)new tca((String)c2));
    }

    public byte[] J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, XTa.W)) break block3;
                return new byte[uSa.E];
            }
            catch (ClassCastException classCastException) {
                throw new MZ(a2.J((String)b2, XTa.W, classCastException));
            }
        }
        return ((nAa)a2.I.get(b2)).J();
    }

    public Waa_1() {
        Waa_1 a2;
    }

    public int J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, zOa.v)) break block3;
                return uSa.E;
            }
            catch (ClassCastException classCastException) {
                return uSa.E;
            }
        }
        return ((Nca)a2.I.get(b2)).J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, byte[] byArray) {
        void b2;
        Object c2 = byArray;
        Waa_1 a2 = this;
        a2.I.put((String)b2, new nAa((byte[])c2));
    }

    public String toString() {
        Iterator<Map.Entry<String, NCa>> iterator;
        Waa_1 waa_1 = this;
        StringBuilder a2 = new StringBuilder(XSa.e);
        Iterator<Map.Entry<String, NCa>> iterator2 = iterator = waa_1.I.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, NCa> entry = iterator.next();
            if (a2.length() != vRa.d) {
                a2.append((char)Yqa.D);
            }
            a2.append(entry.getKey()).append((char)lQa.R).append(entry.getValue());
            iterator2 = iterator;
        }
        return a2.append((char)ySa.Z).toString();
    }

    /*
     * WARNING - void declaration
     */
    public waa J(String string, int n2) {
        Waa_1 c22;
        block5: {
            void a2;
            void b2;
            Waa_1 waa_1;
            block4: {
                waa_1 = this;
                try {
                    if (waa_1.f((String)b2) == WOa.fa) break block4;
                    return new waa();
                }
                catch (ClassCastException c22) {
                    throw new MZ(waa_1.J((String)b2, WOa.fa, c22));
                }
            }
            c22 = (waa)waa_1.I.get(b2);
            if (c22.J() <= 0 || c22.f() == a2) break block5;
            return new waa();
        }
        return c22;
    }

    public NCa J(String string) {
        Object b2 = string;
        Waa_1 a2 = this;
        return a2.I.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, float f2) {
        void b2;
        float c2 = f2;
        Waa_1 a2 = this;
        a2.I.put((String)b2, (NCa)new rAa(c2));
    }

    public boolean J(String string) {
        Object b2 = string;
        Waa_1 a2 = this;
        return a2.I.containsKey(b2);
    }

    public String J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, Yqa.i)) break block3;
                return Mqa.y;
            }
            catch (ClassCastException classCastException) {
                return Mqa.y;
            }
        }
        return a2.I.get(b2).J();
    }

    public byte J() {
        return (byte)NTa.C;
    }

    public Waa J(String string) {
        Waa_1 a2;
        Object b2;
        block3: {
            b2 = string;
            a2 = this;
            try {
                if (a2.J((String)b2, NTa.C)) break block3;
                return new Waa_1();
            }
            catch (ClassCastException classCastException) {
                throw new MZ(a2.J((String)b2, NTa.C, classCastException));
            }
        }
        return (Waa_1)a2.I.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(String string, NCa nCa2, DataOutput dataOutput) throws IOException {
        void b2;
        DataOutput c2 = dataOutput;
        String a2 = string;
        void v0 = b2;
        c2.writeByte(v0.J());
        if (v0.J() != 0) {
            DataOutput dataOutput2 = c2;
            dataOutput2.writeUTF(a2);
            b2.J(dataOutput2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(DataOutput dataOutput) throws IOException {
        void a2;
        Iterator<String> iterator;
        Waa_1 waa_1 = this;
        Iterator<String> iterator2 = iterator = waa_1.I.keySet().iterator();
        while (iterator2.hasNext()) {
            Object b2 = iterator.next();
            NCa nCa2 = waa_1.I.get(b2);
            iterator2 = iterator;
            Waa_1.J((String)b2, nCa2, (DataOutput)a2);
        }
        a2.writeByte(uSa.E);
    }
}

