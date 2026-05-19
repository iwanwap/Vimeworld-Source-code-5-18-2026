/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DBa
 *  ERa
 *  Faa
 *  Kpa
 *  Pd
 *  XX
 *  asa
 *  hra
 *  pv
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  vRa
 *  yQa
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class DBa_3
implements KC<Pd> {
    public int k;
    private boolean j;
    public int J;
    private zaa A;
    private boolean I;

    public int l() {
        DBa_3 a2;
        return a2.A.I;
    }

    @Override
    public void f(Lca lca) throws IOException {
        Lca b2 = lca;
        DBa_3 a2 = this;
        b2.writeInt(a2.k);
        b2.writeInt(a2.J);
        b2.writeBoolean(a2.I);
        b2.writeShort((short)(a2.A.I & yQa.j));
        b2.writeByteArray(a2.A.A);
    }

    public static int J(int n2, boolean bl, boolean bl2) {
        int b2;
        int c2 = bl2 ? 1 : 0;
        int a2 = n2;
        int n3 = a2 * uqa.g * ERa.C * ERa.C * ERa.C;
        int n4 = a2 * ERa.C * ERa.C * ERa.C / uqa.g;
        b2 = b2 != 0 ? a2 * ERa.C * ERa.C * ERa.C / uqa.g : uSa.E;
        c2 = c2 != 0 ? hra.Ja : uSa.E;
        return n3 + n4 + b2 + c2;
    }

    public byte[] J() {
        DBa_3 a2;
        return a2.A.A;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Pd pd2) {
        void a2;
        DBa_3 dBa_3 = this;
        if (!dBa_3.j && DBa_3.f() && pv.J()) {
            Object object;
            dBa_3.j = vRa.d;
            int[] nArray = new int[uqa.g];
            nArray[uSa.E] = dBa_3.k;
            nArray[vRa.d] = dBa_3.J;
            Object b2 = DBa_3.J(nArray);
            try {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = nua.h;
                objectArray[vRa.d] = b2;
                object = b2 = (Object)((byte[])NativeClassLoaderUtils.call((Object)objectArray));
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                LogManager.getLogger(Xpa.D).error(asa.Ga, (Throwable)unsatisfiedLinkError);
                object = b2;
            }
            int[] nArray2 = DBa_3.J((byte[])object);
            DBa_3 dBa_32 = dBa_3;
            dBa_32.k = nArray2[uSa.E];
            dBa_32.J = nArray2[vRa.d];
        }
        a2.J((DBa)dBa_3);
    }

    public DBa_3() {
        DBa_3 a2;
    }

    public static int[] J(byte[] byArray) {
        int n2;
        byte[] byArray2 = byArray;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray2);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        Object[] a2 = new int[byArray2.length / AQa.P];
        int n3 = n2 = uSa.E;
        while (n3 < a2.length) {
            a2[n2++] = byteBuffer.getInt();
            n3 = n2;
        }
        return a2;
    }

    public int f() {
        DBa_3 a2;
        return a2.J;
    }

    public static byte[] J(int ... nArray) {
        int a2;
        int[] nArray2 = nArray;
        ByteBuffer byteBuffer = ByteBuffer.allocate(nArray2.length * AQa.P);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int[] nArray3 = nArray2;
        int n2 = nArray3.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            byteBuffer.putInt(nArray3[a2++]);
            n3 = a2;
        }
        return byteBuffer.array();
    }

    @Override
    public void J(Lca lca) throws IOException {
        DBa_3 a2;
        Lca b2 = lca;
        DBa_3 dBa_3 = a2 = this;
        DBa_3 dBa_32 = a2;
        Object object = b2;
        a2.k = ((Lca)object).readInt();
        dBa_32.J = ((Lca)object).readInt();
        dBa_32.I = b2.readBoolean();
        DBa_3 dBa_33 = a2;
        dBa_3.A = new zaa();
        dBa_33.A.I = b2.readShort();
        dBa_3.A.A = b2.readByteArray();
    }

    public int J() {
        DBa_3 a2;
        return a2.k;
    }

    public static boolean f() {
        Kpa kpa2 = Kpa.J();
        if (kpa2.J()) {
            return vRa.d != 0;
        }
        if (kpa2.c == null) {
            return uSa.E != 0;
        }
        uba uba2 = kpa2.c.F.J();
        if (uba2.J() && uba2.l()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public DBa_3(Faa faa2, boolean bl, int n2) {
        void v3;
        void a2;
        boolean bl2;
        void b2;
        DBa_3 c2;
        DBa_3 d2 = faa2;
        DBa_3 dBa_32 = c2 = this;
        dBa_32 = c2;
        dBa_32.k = ((Faa)d2).I;
        dBa_32.J = ((Faa)d2).G;
        dBa_3.I = b2;
        if (!d2.J().F.f()) {
            bl2 = vRa.d;
            v3 = a2;
        } else {
            bl2 = uSa.E;
            v3 = a2;
        }
        dBa_3.A = DBa_3.J((Faa)d2, (boolean)b2, bl2, (int)v3);
    }

    /*
     * WARNING - void declaration
     */
    private static int J(byte[] byArray, byte[] byArray2, int n2) {
        void b2;
        int c2 = n2;
        byte[] a2 = byArray;
        System.arraycopy(a2, uSa.E, b2, c2, a2.length);
        return c2 + a2.length;
    }

    public boolean J() {
        DBa_3 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public static zaa J(Faa faa2, boolean bl, boolean bl2, int n2) {
        void b2;
        void c2;
        Object object;
        int d2;
        Faa faa3 = faa2;
        Object[] objectArray = faa3.J();
        zaa zaa2 = new zaa();
        ArrayList<XX> arrayList = Lists.newArrayList();
        int n3 = d2 = uSa.E;
        while (n3 < objectArray.length) {
            void a2;
            object = objectArray[d2];
            if (!(object == null || c2 != false && object.J() || (a2 & vRa.d << d2) == 0)) {
                zaa2.I |= vRa.d << d2;
                arrayList.add((XX)object);
            }
            n3 = ++d2;
        }
        zaa2.A = new byte[DBa_3.J(Integer.bitCount(zaa2.I), (boolean)b2, (boolean)c2)];
        d2 = uSa.E;
        for (XX a2 : arrayList) {
            char[] cArray = a2.J();
            objectArray = cArray;
            int n4 = cArray.length;
            int n5 = uSa.E;
            while (n5 < n4) {
                int n6;
                XX xX2 = objectArray[n6];
                zaa2.A[d2++] = (byte)(xX2 & osa.Ja);
                zaa2.A[d2++] = (byte)(xX2 >> Yqa.i & osa.Ja);
                n5 = ++n6;
            }
        }
        object = arrayList.iterator();
        Iterator iterator = object;
        while (iterator.hasNext()) {
            XX a2 = (XX)object.next();
            iterator = object;
            d2 = DBa_3.J(a2.f().J(), zaa2.A, d2);
        }
        if (b2 != false) {
            object = arrayList.iterator();
            Iterator iterator2 = object;
            while (iterator2.hasNext()) {
                XX a2 = (XX)object.next();
                iterator2 = object;
                d2 = DBa_3.J(a2.J().J(), zaa2.A, d2);
            }
        }
        if (c2 != false) {
            DBa_3.J(faa3.J(), zaa2.A, d2);
        }
        return zaa2;
    }
}

