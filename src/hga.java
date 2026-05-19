/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EQa
 *  FTa
 *  JSa
 *  MZ
 *  Mda
 *  RIa
 *  TQa
 *  XTa
 *  cRa
 *  kqa
 *  tX
 *  vL
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ObjectUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hga {
    private final vL M;
    private ReadWriteLock k;
    private static final Map<Class<?>, Integer> j = Maps.newHashMap();
    private final Map<Integer, TIa> J;
    private boolean A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    public static void J(List<TIa> list, Lca lca) throws IOException {
        void a2;
        List<TIa> list2 = list;
        if (list2 != null) {
            Object b2;
            Object object = b2 = list2.iterator();
            while (object.hasNext()) {
                TIa tIa = (TIa)b2.next();
                object = b2;
                hga.J((Lca)a2, tIa);
            }
        }
        a2.writeByte(cRa.h);
    }

    public List<TIa> f() {
        Iterator<TIa> iterator;
        hga hga2 = this;
        Object a2 = null;
        hga hga3 = hga2;
        hga3.k.readLock().lock();
        Iterator<TIa> iterator2 = iterator = hga3.J.values().iterator();
        while (iterator2.hasNext()) {
            TIa tIa = iterator.next();
            if (a2 == null) {
                a2 = Lists.newArrayList();
            }
            a2.add(tIa);
            iterator2 = iterator;
        }
        hga2.k.readLock().unlock();
        return a2;
    }

    public void J() {
        a.A = uSa.E;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c22 = n3;
        hga a2 = this;
        TIa c22 = new TIa(c22, (int)b2, null);
        hga hga2 = a2;
        hga2.k.writeLock().lock();
        hga2.J.put((int)b2, c22);
        a2.k.writeLock().unlock();
        a2.I = uSa.E;
    }

    static {
        j.put(Byte.class, uSa.E);
        j.put(Short.class, vRa.d);
        j.put(Integer.class, uqa.g);
        j.put(Float.class, yRa.d);
        j.put(String.class, AQa.P);
        j.put(Mda.class, tTa.h);
        j.put(XF.class, uua.p);
        j.put(tX.class, XTa.W);
    }

    public static List<TIa> J(Lca lca) throws IOException {
        byte by2;
        Lca lca2 = lca;
        Object a2 = null;
        byte by3 = by2 = lca2.readByte();
        while (by3 != cRa.h) {
            Object object;
            if (a2 == null) {
                a2 = Lists.newArrayList();
            }
            int n2 = (by2 & EQa.B) >> tTa.h;
            int n3 = by2 & tua.U;
            TIa tIa = null;
            switch (n2) {
                case 0: {
                    tIa = new TIa(n2, n3, lca2.readByte());
                    object = a2;
                    break;
                }
                case 1: {
                    tIa = new TIa(n2, n3, lca2.readShort());
                    object = a2;
                    break;
                }
                case 2: {
                    tIa = new TIa(n2, n3, lca2.readInt());
                    object = a2;
                    break;
                }
                case 3: {
                    tIa = new TIa(n2, n3, Float.valueOf(lca2.readFloat()));
                    object = a2;
                    break;
                }
                case 4: {
                    tIa = new TIa(n2, n3, lca2.readStringFromBuffer(BQa.h));
                    object = a2;
                    break;
                }
                case 5: {
                    tIa = new TIa(n2, n3, lca2.readItemStackFromBuffer());
                    object = a2;
                    break;
                }
                case 6: {
                    Lca lca3 = lca2;
                    while (false) {
                    }
                    int n4 = lca3.readInt();
                    int n5 = lca3.readInt();
                    int n6 = lca3.readInt();
                    tIa = new TIa(n2, n3, (Object)new XF(n4, n5, n6));
                    object = a2;
                    break;
                }
                case 7: {
                    Lca lca4 = lca2;
                    float f2 = lca4.readFloat();
                    float f3 = lca4.readFloat();
                    float f4 = lca4.readFloat();
                    tIa = new TIa(n2, n3, new tX(f2, f3, f4));
                }
                default: {
                    object = a2;
                }
            }
            object.add(tIa);
            by2 = lca2.readByte();
            by3 = by2;
        }
        return a2;
    }

    public Mda J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return (Mda)a2.J(b2).J();
    }

    public <T> void f(int n2, T t2) {
        TIa a2;
        int c2 = n2;
        hga b2 = this;
        Integer n3 = j.get(a2.getClass());
        if (n3 == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, hpa.r).append(a2.getClass()).toString());
        }
        if (c2 > tua.U) {
            throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, FTa.n).append(c2).append(Zra.i).append(tua.U).append(hpa.b).toString());
        }
        if (b2.J.containsKey(c2)) {
            throw new IllegalArgumentException(new StringBuilder().insert(2 & 5, kqa.r).append(c2).append(dqa.O).toString());
        }
        a2 = new TIa(n3, c2, a2);
        hga hga2 = b2;
        hga2.k.writeLock().lock();
        hga2.J.put(c2, a2);
        b2.k.writeLock().unlock();
        b2.I = uSa.E;
    }

    public short J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return (Short)a2.J(b2).J();
    }

    public List<TIa> J() {
        hga hga2 = this;
        Object a2 = null;
        if (hga2.A) {
            hga hga3 = hga2;
            hga3.k.readLock().lock();
            for (TIa tIa : hga3.J.values()) {
                if (!tIa.J()) continue;
                tIa.J(uSa.E != 0);
                if (a2 == null) {
                    a2 = Lists.newArrayList();
                }
                a2.add(tIa);
            }
            hga2.k.readLock().unlock();
        }
        hga2.A = uSa.E;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    private TIa J(int n2) {
        TIa tIa;
        void a2;
        hga hga2 = this;
        hga2.k.readLock().lock();
        try {
            tIa = hga2.J.get((int)a2);
        }
        catch (Throwable b22) {
            RIa b22 = RIa.J((Throwable)b22, (String)JSa.Ga);
            b22.J(TQa.Ga).J(vua.d, (Object)((int)a2));
            throw new MZ(b22);
        }
        hga2.k.readLock().unlock();
        return tIa;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void J(Lca lca, TIa tIa) throws IOException {
        Object b2 = tIa;
        Lca a2 = lca;
        Object object = b2;
        a2.writeByte((((TIa)b2).f() << tTa.h | ((TIa)object).J() & tua.U) & osa.Ja);
        switch (((TIa)object).f()) {
            case 0: {
                a2.writeByte(((Byte)((TIa)b2).J()).byteValue());
                return;
            }
            case 1: {
                a2.writeShort(((Short)((TIa)b2).J()).shortValue());
                return;
            }
            case 2: {
                a2.writeInt((Integer)((TIa)b2).J());
                return;
            }
            case 3: {
                a2.writeFloat(((Float)((TIa)b2).J()).floatValue());
                return;
            }
            case 4: {
                a2.writeString((String)((TIa)b2).J());
                return;
            }
            case 5: {
                Mda mda2 = (Mda)((TIa)b2).J();
                a2.writeItemStackToBuffer(mda2);
                return;
            }
            case 6: {
                XF xF = (XF)((Object)((TIa)b2).J());
                a2.writeInt(xF.getX());
                a2.writeInt(xF.getY());
                a2.writeInt(xF.getZ());
                return;
            }
            case 7: {
                b2 = (tX)((TIa)b2).J();
                a2.writeFloat(b2.l());
                a2.writeFloat(b2.J());
                a2.writeFloat(b2.f());
                return;
            }
        }
    }

    public boolean f() {
        hga a2;
        return a2.I;
    }

    public byte J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return (Byte)a2.J(b2).J();
    }

    public void J(int n2) {
        int b2 = n2;
        hga a2 = this;
        TIa.J(a2.J(b2), vRa.d != 0);
        a2.A = vRa.d;
    }

    public String J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return (String)a2.J(b2).J();
    }

    public int J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return (Integer)a2.J(b2).J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Lca lca) throws IOException {
        void a2;
        Object b2;
        hga hga2;
        hga hga3 = hga2 = this;
        hga3.k.readLock().lock();
        Object object = b2 = hga3.J.values().iterator();
        while (object.hasNext()) {
            TIa tIa = (TIa)b2.next();
            object = b2;
            hga.J((Lca)a2, tIa);
        }
        hga2.k.readLock().unlock();
        a2.writeByte(cRa.h);
    }

    public boolean J() {
        hga a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public <T> void J(int n2, T t2) {
        void a2;
        void b2;
        Object object = this;
        TIa c2 = ((hga)object).J((int)b2);
        if (ObjectUtils.notEqual(a2, c2.J())) {
            c2.J(a2);
            ((hga)object).M.d((int)b2);
            c2.J(vRa.d != 0);
            ((hga)object).A = vRa.d;
        }
    }

    public hga(vL vL2) {
        hga a2;
        hga b2 = vL2;
        hga hga2 = a2 = this;
        a2.I = vRa.d;
        hga2.J = Maps.newHashMap();
        hga hga3 = a2;
        hga2.k = new ReentrantReadWriteLock();
        hga2.M = b2;
    }

    public tX J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return (tX)a2.J(b2).J();
    }

    public void J(List<TIa> list) {
        Iterator a2;
        hga hga2 = this;
        hga2.k.writeLock().lock();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            TIa b2 = (TIa)a2.next();
            TIa tIa = hga2.J.get(b2.J());
            if (tIa == null) continue;
            tIa.J(b2.J());
            hga2.M.d(b2.J());
        }
        hga2.k.writeLock().unlock();
        hga2.A = vRa.d;
    }

    public float J(int n2) {
        int b2 = n2;
        hga a2 = this;
        return ((Float)a2.J(b2).J()).floatValue();
    }
}

