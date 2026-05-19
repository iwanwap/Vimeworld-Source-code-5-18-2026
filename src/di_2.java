/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bj
 *  JPa
 *  Kpa
 *  NH
 *  NQa
 *  PH
 *  Pqa
 *  QSa
 *  Qg
 *  Qta
 *  Sk
 *  UG
 *  UI
 *  di
 *  fpa
 *  hG
 *  jRa
 *  pQa
 *  pg
 *  pn
 *  pua
 *  qH
 *  qh
 *  rh
 *  tH
 *  uG
 *  uKa
 *  uQa
 *  uRa
 *  vRa
 *  wPa
 *  zg
 */
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class di_2 {
    private final th g;
    private boolean L;
    public static final int E = Kpa.l();
    private final Map<Integer, Fi> m;
    public static final Object C = new Object();
    private final List<Fi> i;
    private static final Map<String, CompletableFuture<Font>> M = new HashMap<String, CompletableFuture<Font>>();
    private int k;
    private final Sk j;
    private final Map<uG, UG> J;
    private final P A;
    private static final Map<cG, zg> I = new HashMap<cG, zg>();

    public di_2(Sk sk2) {
        di_2 a2;
        di_2 b2 = sk2;
        di_2 di_22 = a2 = this;
        di_2 di_23 = a2;
        a2.g = new th();
        di_23.A = new Eh();
        a2.J = new HashMap<uG, UG>();
        a2.m = new HashMap<Integer, Fi>();
        a2.i = new ArrayList<Fi>();
        di_22.k = Math.min(E, QSa.ba);
        di_22.L = uSa.E;
        di_22.j = b2;
    }

    /*
     * WARNING - void declaration
     */
    public UG J(String string, UI uI2, Supplier<BufferedImage> supplier) {
        void b2;
        void c2;
        di_2 di_22 = this;
        di_2 d2 = di_22.J.get(new uG((String)c2, (UI)b2));
        if (d2 == null) {
            void a2;
            d2 = new pg((di)di_22, (BufferedImage)a2.get(), uSa.E != 0, (UI)b2, vRa.d != 0);
            ((UG)d2).I = rh.READY;
            di_22.J.put(new uG((String)c2, (UI)b2), (UG)d2);
        }
        return d2;
    }

    public static /* synthetic */ boolean J(zg a2) {
        if (a2.J == 0 && OT.e - a2.I > kra.ja) {
            a2.A.J();
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ zg J(cG a2) {
        return new zg((P)new NH(a2));
    }

    public void J(int n2) {
        int b2 = n2;
        di_2 a2 = this;
        a2.k = b2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(di di2, String string, CompletableFuture completableFuture) {
        void a2;
        di di3 = di2;
        try {
            void b2;
            di c2 = di3.j.J((String)b2);
            if (c2 == null) {
                throw new IllegalArgumentException(new StringBuilder().insert(3 ^ 3, Qta.u).append((String)b2).append(zua.I).toString());
            }
            c2.f().thenAccept(Bj.J((CompletableFuture)a2));
            return;
        }
        catch (Exception c2) {
            a2.completeExceptionally(c2);
            return;
        }
    }

    public void l() {
        Iterator<Fi> iterator;
        di_2 di_22 = this;
        Iterator<Fi> iterator2 = iterator = di_22.m.values().iterator();
        while (iterator2.hasNext()) {
            Object a2;
            Object object = a2 = iterator.next();
            gLa.J(new StringBuilder().insert(5 >> 3, tSa.e).append(((Fi)a2).J).append(Pqa.q).append(((Fi)a2).M).append(rRa.X).append(((Fi)a2).j).toString(), ((Fi)a2).J, uSa.E, ((Fi)object).M, ((Fi)object).j);
            iterator2 = iterator;
        }
    }

    /*
     * WARNING - void declaration
     */
    public UG J(qh qh2, m m2) {
        UG uG2;
        di_2 c2 = qh2;
        di_2 b2 = this;
        di_2 di_22 = c2;
        uG uG3 = new uG(((qh)di_22).I, ((qh)di_22).M);
        UG uG4 = uG2 = ((qh)c2).A ? b2.J.get(uG3) : null;
        if (uG2 == null) {
            di_2 di_23;
            if (((qh)c2).I.startsWith(pQa.ca) || ((qh)c2).I.startsWith(NQa.X) || ((qh)c2).I.startsWith(pua.v) || ((qh)c2).I.startsWith(FRa.W) || ((qh)c2).I.startsWith(uQa.Y)) {
                void a2;
                uG2 = new vi();
                Sk.J((Runnable)new si((di)b2, (qh)c2, (vi)uG2, (m)a2));
                di_23 = c2;
            } else if (((qh)c2).I.startsWith(uRa.v)) {
                uG2 = new qH(((qh)c2).I.substring(tTa.h));
                di_23 = c2;
            } else if (((qh)c2).I.startsWith(sqa.r) || ((qh)c2).I.startsWith(JPa.J)) {
                uG2 = new PH(((qh)c2).I.substring(tTa.h), ((qh)c2).I.startsWith(JPa.J));
                di_23 = c2;
            } else if (((qh)c2).I.startsWith(tSa.z)) {
                uG2 = new Qg(((qh)c2).I.substring(tTa.h));
                di_23 = c2;
            } else {
                throw new IllegalArgumentException(new StringBuilder().insert(3 >> 2, wPa.s).append(((qh)c2).I).append(cPa.U).toString());
            }
            if (((qh)di_23).A) {
                b2.J.put(uG3, uG2);
            }
        }
        return uG2;
    }

    public void f(Fi fi2) {
        Fi b2 = fi2;
        di_2 a2 = this;
        if (a2.L) {
            return;
        }
        if (b2.J == pua.o) {
            long l2 = OT.A ? System.nanoTime() : nqa.i;
            b2.J = gLa.J();
            a2.m.put(b2.J, b2);
            Object object = b2;
            Object object2 = b2;
            gLa.J(((Fi)object).J, ((Fi)object).I, ((Fi)object2).M, ((Fi)object2).j);
            if (OT.A) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = b2.M;
                objectArray[vRa.d] = b2.j;
                objectArray[uqa.g] = Float.valueOf((float)Math.round((double)(System.nanoTime() - l2) / Eqa.w) / QTa.G);
                OT.J(Bta.I, objectArray);
            }
        }
    }

    public void J(Fi fi2) {
        Fi b2 = fi2;
        di_2 a2 = this;
        if (b2.J == pua.o) {
            return;
        }
        a2.m.remove(b2.J);
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = b2.J;
        objectArray[vRa.d] = b2.M;
        objectArray[uqa.g] = b2.j;
        OT.J(BPa.Q, objectArray);
        gLa.J(b2.J);
        b2.J = pua.o;
    }

    public th J() {
        di_2 a2;
        return a2.g;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        di_2 di_22 = this;
        if (Kpa.J().N.f() % Jpa.z == 0) {
            Object a2 = C;
            synchronized (a2) {
                I.values().removeIf(ei.J());
                return;
            }
        }
    }

    public static /* synthetic */ void J(CompletableFuture completableFuture, InputStream inputStream) {
        InputStream b22 = inputStream;
        CompletableFuture a2 = completableFuture;
        try {
            a2.complete(Font.createFont(uSa.E, b22));
            return;
        }
        catch (Exception b22) {
            a2.completeExceptionally(b22);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Ii ii2, cG cG2, Font font, Throwable throwable) {
        Object d2 = throwable;
        Ii a2 = ii2;
        if (d2 != null) {
            OT.b.warn(fpa.C, (Throwable)d2);
            return;
        }
        d2 = C;
        synchronized (d2) {
            Object object;
            void b2;
            block7: {
                if (!a2.I) break block7;
                return;
            }
            c2.j = b2;
            try {
                zg c2;
                c2 = I.computeIfAbsent((cG)c2, ZI.J());
                c2.J += vRa.d;
                c2.I = OT.e;
                Ii ii3 = a2;
                ii3.A = c2.A;
                ii3.j = c2;
                ii3.k = vRa.d;
                object = d2;
            }
            catch (Throwable c2) {
                OT.b.warn(fpa.C, c2);
                object = d2;
            }
            return;
        }
    }

    public Ii J(pn pn2) {
        di_2 di_22;
        di_2 b2 = pn2;
        di_2 a2 = this;
        Ii ii2 = new Ii(a2.A);
        if (b2 == null) {
            return ii2;
        }
        cG cG2 = new cG();
        if (b2.hasPath()) {
            di_2 di_23 = b2;
            di_22 = di_23;
            cG2.J = di_23.getPath();
        } else if (b2.hasResource()) {
            di_2 di_24 = b2;
            di_22 = di_24;
            cG2.J = a2.j.J(di_24.getResource());
        } else {
            return ii2;
        }
        if (di_22.hasSize()) {
            cG2.I = b2.getSize();
        }
        if (b2.hasBlur()) {
            cG2.A = b2.getBlur();
        }
        if (b2.hasAntiAlias()) {
            cG2.k = b2.getAntiAlias();
        }
        if (b2.hasFractionalMetrics()) {
            cG2.M = b2.getFractionalMetrics();
        }
        Ii ii3 = ii2;
        ii3.k = uSa.E;
        ii3.J = uSa.E;
        a2.J(cG2.J).whenComplete(tH.J((Ii)ii2, (cG)cG2));
        if (ii2.k) {
            ii2.J = vRa.d;
        }
        return ii2;
    }

    /*
     * WARNING - void declaration
     */
    private CompletableFuture<Font> J(String string) {
        void a2;
        di_2 di_22 = this;
        CompletableFuture<Font> b2 = M.get(a2);
        if (b2 != null) {
            return b2;
        }
        b2 = new CompletableFuture<Font>();
        M.put((String)a2, b2);
        CompletableFuture<Font> completableFuture = b2;
        Sk.J((Runnable)Rh.J((di)di_22, (String)a2, completableFuture));
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(hG hG2, int[] nArray, boolean bl) {
        void a2;
        void b2;
        di_2 d2 = hG2;
        di_2 c2 = this;
        if (c2.L) {
            return;
        }
        c2.f(((hG)d2).M);
        di_2 di_22 = d2;
        uKa.C((int)((hG)di_22).M.J);
        Object object = new int[((hG)di_22).M.I + vRa.d][];
        object[uSa.E] = b2;
        int[][] nArray2 = gLa.J(((hG)d2).M.I, ((hG)d2).k, object);
        object = nArray2;
        di_2 di_23 = d2;
        di_2 di_24 = d2;
        gLa.J(nArray2, ((hG)di_23).k, ((hG)di_23).J, ((hG)di_24).I, ((hG)di_24).j, uSa.E != 0, (boolean)a2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void J() {
        di_2 di_22;
        di_2 di_23 = di_22 = this;
        di_23.L = vRa.d;
        di_23.g.l();
        for (Fi a2 : di_23.m.values()) {
            if (a2.J == pua.o) continue;
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = a2.J;
            objectArray[vRa.d] = a2.M;
            objectArray[uqa.g] = a2.j;
            OT.J(BPa.Q, objectArray);
            gLa.J(a2.J);
        }
        di_22.m.clear();
        Object object = C;
        synchronized (object) {
            Iterator<zg> a2;
            Iterator<zg> iterator = a2 = I.values().iterator();
            while (iterator.hasNext()) {
                a2.next().A.J();
                iterator = a2;
            }
            I.clear();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public synchronized hG J(int n2, int n3) {
        Object c2;
        void a2;
        void b2;
        di_2 di_22 = this;
        if (di_22.L) {
            return new hG(null, uSa.E, uSa.E, (int)b2, (int)a2);
        }
        Iterator<Fi> iterator = di_22.i.iterator();
        while (iterator.hasNext()) {
            c2 = iterator.next();
            hG hG2 = ((Fi)c2).J((int)b2, (int)a2);
            if (hG2 != null) {
                ((Fi)c2).A = uSa.E;
                return hG2;
            }
            int n4 = ((Fi)c2).A;
            ((Fi)c2).A = n4 + vRa.d;
            if (n4 <= jRa.X) continue;
            ((Fi)c2).k = null;
            iterator.remove();
        }
        di_2 di_23 = di_22;
        Object object = c2 = new Fi(di_23.k, di_23.k, vRa.d != 0, uSa.E);
        di_22.i.add((Fi)object);
        return ((Fi)object).J((int)b2, (int)a2);
    }

    public int J() {
        di_2 a2;
        return a2.k;
    }
}

