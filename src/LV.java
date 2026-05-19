/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AV
 *  BRa
 *  BW
 *  Cta
 *  Cv
 *  Fpa
 *  Fv
 *  Fx
 *  Ix
 *  KTa
 *  NTa
 *  NU
 *  OW
 *  Wv
 *  XTa
 *  Xv
 *  ex
 *  hU
 *  lW
 *  pPa
 *  tw
 *  vRa
 *  vpa
 *  wra
 *  wx
 *  xU
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class LV {
    private static final tw[] pieceWeightArray;
    private static final hU strongholdStones;
    private static List<tw> structurePieceList;
    public static int totalWeight;
    private static Class<? extends Wv> strongComponentType;

    public static void f() {
        int n2;
        structurePieceList = Lists.newArrayList();
        tw[] twArray = pieceWeightArray;
        int n3 = pieceWeightArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            tw tw2 = twArray[n2];
            twArray[n2].instancesSpawned = uSa.E;
            structurePieceList.add(tw2);
            n4 = ++n2;
        }
        strongComponentType = null;
    }

    /*
     * WARNING - void declaration
     */
    private static Wv J(lW lW2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g;
        lW lW3 = lW2;
        if (!LV.J()) {
            return null;
        }
        if (strongComponentType != null) {
            Wv wv = LV.J(strongComponentType, (List<uU>)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            strongComponentType = null;
            if (wv != null) {
                return wv;
            }
        }
        int n6 = uSa.E;
        block0: while (n6 < tTa.h) {
            ++n6;
            int n7 = f2.nextInt(totalWeight);
            for (tw h : structurePieceList) {
                if ((n7 -= h.pieceWeight) >= 0) continue;
                if (!h.J((int)a2) || h == lW3.strongholdPieceWeight) continue block0;
                Wv wv = LV.J(h.pieceClass, (List<uU>)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
                if (wv == null) continue;
                tw tw2 = h;
                tw2.instancesSpawned += vRa.d;
                lW3.strongholdPieceWeight = tw2;
                if (!tw2.J()) {
                    structurePieceList.remove(h);
                }
                return wv;
            }
        }
        Xv xv = Cv.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2);
        if (xv != null && xv.minY > vRa.d) {
            return new Cv((int)a2, (Random)f2, xv, (DZ)b2);
        }
        return null;
    }

    static {
        tw[] twArray = new tw[pPa.f];
        twArray[uSa.E] = new tw(xU.class, wra.P, uSa.E);
        twArray[vRa.d] = new tw(ex.class, tTa.h, tTa.h);
        twArray[uqa.g] = new tw(Ix.class, kTa.j, uSa.E);
        twArray[yRa.d] = new tw(Fv.class, kTa.j, uSa.E);
        twArray[AQa.P] = new tw(OW.class, NTa.C, uua.p);
        twArray[tTa.h] = new tw(Fx.class, tTa.h, tTa.h);
        twArray[uua.p] = new tw(wx.class, tTa.h, tTa.h);
        twArray[XTa.W] = new tw(Yv.class, tTa.h, AQa.P);
        twArray[Yqa.i] = new tw(BW.class, tTa.h, AQa.P);
        twArray[WOa.fa] = new NU(AV.class, NTa.C, uqa.g);
        twArray[NTa.C] = new OV(dV.class, kTa.j, vRa.d);
        pieceWeightArray = twArray;
        strongholdStones = new hU(null);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ uU f(lW lW2, List list, Random random, int n2, int n3, int n4, DZ dZ, int n5) {
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g;
        int n6 = n5;
        lW a2 = lW2;
        return LV.J(a2, (List<uU>)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)h);
    }

    private static boolean J() {
        Iterator<tw> iterator;
        int n2 = uSa.E;
        totalWeight = uSa.E;
        Iterator<tw> iterator2 = iterator = structurePieceList.iterator();
        while (iterator2.hasNext()) {
            tw tw2 = iterator.next();
            if (tw2.instancesLimit > 0) {
                tw tw3 = tw2;
                if (tw3.instancesSpawned < tw3.instancesLimit) {
                    n2 = vRa.d;
                }
            }
            totalWeight += tw2.pieceWeight;
            iterator2 = iterator;
        }
        return n2 != 0;
    }

    public static /* synthetic */ hU J() {
        return strongholdStones;
    }

    public static /* synthetic */ Class J(Class a2) {
        strongComponentType = a2;
        return strongComponentType;
    }

    public static void J() {
        uv.f(BW.class, Fpa.Aa);
        uv.f(Cv.class, XTa.X);
        uv.f(Yv.class, KTa.w);
        uv.f(Ix.class, oQa.O);
        uv.f(AV.class, Cta.V);
        uv.f(dV.class, ROa.Aa);
        uv.f(ex.class, Npa.j);
        uv.f(Fv.class, KTa.e);
        uv.f(OW.class, oua.m);
        uv.f(wx.class, uua.I);
        uv.f(lW.class, xqa.a);
        uv.f(xU.class, TOa.ca);
        uv.f(Fx.class, Bta.Ha);
    }

    /*
     * WARNING - void declaration
     */
    private static uU J(lW lW2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ, int n5) {
        void c2;
        void e2;
        void a2;
        Object h = random;
        lW f2 = lW2;
        if (a2 > vpa.o) {
            return null;
        }
        if (Math.abs((int)(e2 - f2.J().minX)) <= BRa.E && Math.abs((int)(c2 - f2.J().minZ)) <= BRa.E) {
            void b2;
            void d2;
            void g;
            if ((h = LV.J(f2, (List<uU>)g, (Random)h, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)(a2 + vRa.d))) != null) {
                g.add(h);
                f2.field_75026_c.add(h);
            }
            return h;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static Wv J(Class<? extends Wv> clazz, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g;
        Class<? extends Wv> clazz2 = clazz;
        Object h = null;
        if (clazz2 == xU.class) {
            h = xU.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == ex.class) {
            h = ex.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == Ix.class) {
            h = Ix.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == Fv.class) {
            h = Fv.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == OW.class) {
            h = OW.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == Fx.class) {
            h = Fx.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == wx.class) {
            h = wx.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == Yv.class) {
            h = Yv.J((List<uU>)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == BW.class) {
            h = BW.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == AV.class) {
            h = AV.J((List)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return h;
        }
        if (clazz2 == dV.class) {
            h = dV.J((List<uU>)g, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
        }
        return h;
    }

    public LV() {
        LV a2;
    }
}

