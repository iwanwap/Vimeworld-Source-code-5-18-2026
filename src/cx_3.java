/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DQa
 *  Kpa
 *  Lx
 *  NW
 *  Ox
 *  PV
 *  QW
 *  Tv
 *  UU
 *  bpa
 *  dQa
 *  ib
 *  vRa
 *  vw
 */
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cx_3 {
    private static final ReferenceQueue<ib> m;
    private static final PV C;
    public static final PV i;
    private static Tv M;
    private static final List<Tv> k;
    private static final ReentrantLock j;
    private static final Zv J;
    private static QW A;
    private static byte[] I;

    public static Ox J(float a2) {
        cx_3.f();
        return cx_3.J(new Ox(a2));
    }

    public static QW J(int a2) {
        cx_3.f();
        return cx_3.J(new QW(a2));
    }

    private static void J(int[] nArray) {
        int a2;
        int[] nArray2 = nArray;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int n2 = a2 = nArray2.length - vRa.d;
        while (n2 > 0) {
            int n3 = ((Random)threadLocalRandom).nextInt(a2 + vRa.d);
            int n4 = nArray2[n3];
            int[] nArray3 = nArray2;
            nArray2[n3] = nArray3[a2];
            nArray3[a2--] = n4;
            n2 = a2;
        }
    }

    public static void J(byte[] byArray, Supplier<List<ib>> supplier) {
        long l2;
        Object b22 = supplier;
        byte[] a2 = byArray;
        if (I != null) {
            I = null;
        }
        Tv.J((Tv)M, (Supplier)b22);
        long l3 = Tv.J((Tv)M);
        long l4 = dQa.Ga;
        try {
            l2 = l4 = new DataInputStream(new ByteArrayInputStream(a2)).readLong();
        }
        catch (IOException b22) {
            l2 = l4;
        }
        if (l2 != l3) {
            throw new RuntimeException(rpa.x);
        }
        Tv.J((Tv)M, (int[])new int[Tv.J((Tv)M).size()]);
        int b22 = uSa.E;
        int n2 = b22;
        while (n2 < Tv.J((Tv)M).length) {
            int n3 = b22++;
            Tv.J((Tv)cx_3.M)[n3] = n3;
            n2 = b22;
        }
        cx_3.J(Tv.J((Tv)M));
        Tv.f((byte[])Tv.J((Tv)M), (PV)Tv.f((Tv)M), (PV)Tv.J((Tv)M));
        k.add(M);
        M = null;
        A = new QW(A.J() + vRa.d);
        j.unlock();
    }

    public static nv J(long a2) {
        cx_3.f();
        return cx_3.J(new nv(a2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void J(int n2) throws UU {
        int n3 = n2;
        try {
            Tv tv2;
            j.lock();
            if (A.J() != k.size()) {
                throw new RuntimeException(DQa.a);
            }
            if (k.size() > J.f()) {
                Iterator<Tv> iterator;
                J.f(k.size());
                Collections.shuffle(k);
                Hasher a2 = Hashing.murmur3_128().newHasher();
                Iterator<Tv> iterator2 = iterator = k.iterator();
                while (iterator2.hasNext()) {
                    tv2 = iterator.next();
                    iterator2 = iterator;
                    a2.putBytes(Tv.J((Tv)tv2));
                }
                Tv.f((byte[])a2.hash().asBytes(), (PV)i, (PV)C);
            } else if (k.size() < J.f()) {
                throw new RuntimeException(DQa.a);
            }
            if (m.poll() != null) {
                throw new IllegalStateException(Zqa.L);
            }
            Object a2 = ThreadLocalRandom.current();
            int n4 = uSa.E;
            if (((ThreadLocalRandom)a2).nextBoolean()) {
                ++n4;
            }
            if (((ThreadLocalRandom)a2).nextBoolean()) {
                ++n4;
            }
            if (((ThreadLocalRandom)a2).nextBoolean()) {
                ++n4;
            }
            if (n4 == 0) {
                tv2 = new PV(nqa.i, ySa.T);
                PV pV2 = new PV(nqa.i, ySa.T);
                boolean bl2 = ((ThreadLocalRandom)a2).nextBoolean();
                a2 = Hashing.murmur3_128().newHasher();
                for (Tv tv3 : k) {
                    byte[] byArray = Tv.J((Tv)tv3);
                    Tv tv4 = tv2;
                    Tv.f((byte[])byArray, (PV)tv4, (PV)pV2);
                    if (tv4.f() != Tv.f((Tv)tv3).f() || pV2.f() != Tv.J((Tv)tv3).f()) {
                        throw new RuntimeException(DQa.a);
                    }
                    a2.putBytes(byArray);
                    if (!bl2) continue;
                    Tv.J((Tv)tv3);
                }
                Tv.f((byte[])a2.hash().asBytes(), (PV)tv2, (PV)pV2);
                if (tv2.f() != i.f() || pV2.f() != C.f()) {
                    throw new RuntimeException(DQa.a);
                }
                a2 = Hashing.murmur3_128().newHasher();
                a2.putInt(vRa.d);
                HashCode hashCode = a2.hash();
                a2 = Hashing.murmur3_128().newHasher();
                a2.putInt(uSa.E);
                HashCode hashCode2 = a2.hash();
                if (hashCode.equals(hashCode2)) {
                    throw new RuntimeException(bpa.A);
                }
            }
            tv2 = new vw();
            AtomicInteger atomicInteger = new AtomicInteger(uSa.E);
            NW nW2 = new NW(atomicInteger);
            Wx.J(vRa.d != 0, (Runnable)nW2, (Runnable)tv2);
            Wx.J(uSa.E != 0, (Runnable)tv2, (Runnable)nW2);
            if (A.J() == k.size() && atomicInteger.get() == uqa.g) {
                throw new UU((long)(n3 + Kpa.J().F.f()) + i.f());
            }
            throw new RuntimeException(zta.r);
        }
        catch (Throwable throwable) {
            j.unlock();
            throw throwable;
        }
    }

    static {
        j = new ReentrantLock();
        k = new ArrayList<Tv>();
        A = new QW(uSa.E);
        J = new Zv(uSa.E, vRa.d);
        i = new PV(nqa.i, vRa.d);
        C = new PV(nqa.i, vRa.d);
        m = new ReferenceQueue();
    }

    public cx_3() {
        cx_3 a2;
    }

    private static void f() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        I = new byte[threadLocalRandom.nextInt(XOa.h)];
        threadLocalRandom.nextBytes(I);
    }

    public static Lx J(double a2) {
        cx_3.f();
        return cx_3.J(new Lx(a2));
    }

    private static <T extends ib> T J(T a2) {
        Tv.J((Tv)M).add(new WeakReference<ib>(a2, m));
        return a2;
    }

    public static void J() {
        j.lock();
        M = new Tv(null);
    }
}

