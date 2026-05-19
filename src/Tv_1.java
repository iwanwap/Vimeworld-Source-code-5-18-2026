/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  PV
 *  Tv
 *  URa
 *  ib
 *  vRa
 *  vw
 */
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Tv_1 {
    private int[] k;
    private final List<WeakReference<ib>> j;
    private final PV J;
    private final PV A;
    private Supplier<List<ib>> I;

    private void J() {
        int a2;
        Tv_1 tv_1 = this;
        List<ib> list = tv_1.I.get();
        if (list.size() != tv_1.j.size()) {
            throw new IllegalStateException(URa.H);
        }
        int n2 = a2 = uSa.E;
        while (n2 < list.size()) {
            ib ib2;
            ib ib3 = list.get(a2);
            if (ib3 != (ib2 = (ib)tv_1.j.get(a2).get())) {
                throw new IllegalStateException(hQa.B);
            }
            n2 = ++a2;
        }
    }

    private Tv_1() {
        Tv_1 a2;
        Tv_1 tv_1 = a2;
        a2.j = new ArrayList<WeakReference<ib>>();
        tv_1.A = new PV(nqa.i, vRa.d);
        a2.J = new PV(nqa.i, vRa.d);
    }

    public static /* synthetic */ long J(Tv a2) {
        return super.J();
    }

    public static /* synthetic */ void J(Tv a2) {
        super.J();
    }

    public static /* synthetic */ byte[] J(Tv a2) {
        return super.J();
    }

    public static /* synthetic */ Supplier J(Tv tv2, Supplier supplier) {
        Object b2 = supplier;
        Tv a2 = tv2;
        a2.I = b2;
        return a2.I;
    }

    public /* synthetic */ Tv_1(vw vw2) {
        Tv_1 b2 = vw2;
        Tv_1 a2 = this;
        a2();
    }

    private long J() {
        Object a2;
        Tv_1 tv_1 = this;
        long l2 = nqa.i;
        Object object = a2 = tv_1.j.iterator();
        while (object.hasNext()) {
            ib ib2 = (ib)((WeakReference)a2.next()).get();
            if (ib2 == null) {
                throw new IllegalStateException(Jpa.b);
            }
            l2 = dsa.ja * l2 + (long)ib2.hashCode();
            object = a2;
        }
        return l2;
    }

    public static /* synthetic */ List J(Tv a2) {
        return a2.j;
    }

    public static /* synthetic */ int[] J(Tv tv2, int[] nArray) {
        Object b2 = nArray;
        Tv a2 = tv2;
        Object object = b2;
        a2.k = (int[])object;
        return object;
    }

    public static /* synthetic */ int[] J(Tv a2) {
        return a2.k;
    }

    private byte[] J() {
        int a2;
        Tv_1 tv_1 = this;
        Hasher hasher = Hashing.murmur3_128().newHasher();
        int n2 = a2 = uSa.E;
        while (n2 < tv_1.j.size()) {
            Tv_1 tv_12 = tv_1;
            ib ib2 = (ib)tv_12.j.get(tv_12.k[a2]).get();
            if (ib2 == null) {
                throw new IllegalStateException(Jpa.b);
            }
            hasher.putLong(ib2.J());
            n2 = ++a2;
        }
        return hasher.hash().asBytes();
    }

    public static /* synthetic */ PV f(Tv a2) {
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void f(byte[] byArray, PV pV2, PV pV3) {
        void b2;
        Object c2 = pV3;
        byte[] a2 = byArray;
        Tv_1.J(a2, (PV)b2, (PV)c2);
    }

    public static /* synthetic */ PV J(Tv a2) {
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(byte[] byArray, PV pV2, PV pV3) {
        void b2;
        void a2;
        Object c2;
        byte[] byArray2 = byArray;
        Object object = c2 = (Object)ByteBuffer.wrap(byArray2);
        a2.f(((ByteBuffer)object).getLong());
        b2.f(((ByteBuffer)object).getLong());
    }
}

