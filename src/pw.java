/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AW
 *  BRa
 *  Cw
 *  IU
 *  JQa
 *  JV
 *  Lqa
 *  NTa
 *  Oz
 *  Uw
 *  Xv
 *  Xx
 *  YW
 *  Ypa
 *  bqa
 *  fV
 *  fpa
 *  hW
 *  lU
 *  pua
 *  rU
 *  tW
 *  vRa
 *  vpa
 *  xW
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pw {
    public pw() {
        pw a2;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ uU C(Uw uw2, List list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        int n6 = n5;
        Uw a2 = uw2;
        return pw.l(a2, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)h);
    }

    /*
     * WARNING - void declaration
     */
    private static uU l(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        int c2;
        int e2;
        int a2;
        Object h = random;
        Uw f2 = uw2;
        if (a2 > vpa.o) {
            return null;
        }
        if (Math.abs((int)(e2 - f2.J().minX)) <= BRa.E && Math.abs((int)(c2 - f2.J().minZ)) <= BRa.E) {
            void b22;
            int d2;
            void g2;
            if ((h = pw.J(f2, (List<uU>)g2, (Random)h, e2, d2, c2, (DZ)b22, (int)(a2 + vRa.d))) != null) {
                Object object = h;
                Object object2 = h;
                e2 = (object.boundingBox.minX + object2.boundingBox.maxX) / uqa.g;
                d2 = (object.boundingBox.minZ + h.boundingBox.maxZ) / uqa.g;
                c2 = object2.boundingBox.maxX - h.boundingBox.minX;
                int b22 = object.boundingBox.maxZ - h.boundingBox.minZ;
                int n6 = a2 = c2 > b22 ? c2 : b22;
                if (f2.J().J(e2, d2, a2 / uqa.g + AQa.P, xW.villageSpawnBiomes)) {
                    Object object3 = h;
                    g2.add(h);
                    f2.field_74932_i.add(object3);
                    return object3;
                }
            }
            return null;
        }
        return null;
    }

    public static List<Xx> J(Random random, int n2) {
        int b22 = n2;
        Random a2 = random;
        ArrayList<Xx> arrayList = Lists.newArrayList();
        arrayList.add(new Xx(tW.class, AQa.P, Oz.J((Random)a2, (int)(uqa.g + b22), (int)(AQa.P + b22 * uqa.g))));
        arrayList.add(new Xx(lU.class, kTa.j, Oz.J((Random)a2, (int)(uSa.E + b22), (int)(vRa.d + b22))));
        arrayList.add(new Xx(AW.class, kTa.j, Oz.J((Random)a2, (int)(uSa.E + b22), (int)(uqa.g + b22))));
        arrayList.add(new Xx(jv.class, yRa.d, Oz.J((Random)a2, (int)(uqa.g + b22), (int)(tTa.h + b22 * yRa.d))));
        arrayList.add(new Xx(Cw.class, Ypa.A, Oz.J((Random)a2, (int)(uSa.E + b22), (int)(uqa.g + b22))));
        arrayList.add(new Xx(hW.class, yRa.d, Oz.J((Random)a2, (int)(vRa.d + b22), (int)(AQa.P + b22))));
        arrayList.add(new Xx(YW.class, yRa.d, Oz.J((Random)a2, (int)(uqa.g + b22), (int)(AQa.P + b22 * uqa.g))));
        arrayList.add(new Xx(cv.class, Ypa.A, Oz.J((Random)a2, (int)uSa.E, (int)(vRa.d + b22))));
        arrayList.add(new Xx(rU.class, Yqa.i, Oz.J((Random)a2, (int)(uSa.E + b22), (int)(yRa.d + b22 * uqa.g))));
        Iterator b22 = arrayList.iterator();
        block0: while (true) {
            Iterator iterator = b22;
            while (iterator.hasNext()) {
                if (((Xx)b22.next()).villagePiecesLimit != 0) continue block0;
                Iterator iterator2 = b22;
                iterator = iterator2;
                iterator2.remove();
            }
            break;
        }
        return arrayList;
    }

    private static int J(List<Xx> list) {
        Iterator<Xx> iterator;
        List<Xx> list2 = list;
        int n2 = uSa.E;
        int a2 = uSa.E;
        Iterator<Xx> iterator2 = iterator = list2.iterator();
        while (iterator2.hasNext()) {
            Xx xx = iterator.next();
            if (xx.villagePiecesLimit > 0) {
                Xx xx2 = xx;
                if (xx2.villagePiecesSpawned < xx2.villagePiecesLimit) {
                    n2 = vRa.d;
                }
            }
            a2 += xx.villagePieceWeight;
            iterator2 = iterator;
        }
        if (n2 != 0) {
            return a2;
        }
        return pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ uU f(Uw uw2, List list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void h;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        int n6 = n5;
        Uw a2 = uw2;
        return pw.J(a2, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)h);
    }

    /*
     * WARNING - void declaration
     */
    private static fV J(Uw uw2, Xx xx, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        void f2;
        void g2;
        Class h;
        Uw uw3 = uw2;
        h = ((Xx)h).villagePieceClass;
        Object i2 = null;
        if (h == tW.class) {
            i2 = tW.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == lU.class) {
            i2 = lU.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == AW.class) {
            i2 = AW.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == jv.class) {
            i2 = jv.J(uw3, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == Cw.class) {
            i2 = Cw.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == hW.class) {
            i2 = hW.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == YW.class) {
            i2 = YW.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == cv.class) {
            i2 = cv.J(uw3, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
            return i2;
        }
        if (h == rU.class) {
            i2 = rU.J((Uw)uw3, (List)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
        }
        return i2;
    }

    /*
     * WARNING - void declaration
     */
    private static fV J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        void b2;
        void c2;
        void d2;
        void e2;
        void g2;
        void a2;
        void f2;
        Uw uw3 = uw2;
        int n6 = pw.J(uw3.structureVillageWeightedPieceList);
        if (n6 <= 0) {
            return null;
        }
        int n7 = uSa.E;
        block0: while (n7 < tTa.h) {
            ++n7;
            int n8 = f2.nextInt(n6);
            for (Uw h : uw3.structureVillageWeightedPieceList) {
                if ((n8 -= h.villagePieceWeight) >= 0) continue;
                if (!h.J((int)a2) || h == uw3.structVillagePieceWeight && uw3.structureVillageWeightedPieceList.size() > vRa.d) continue block0;
                fV fV2 = pw.J(uw3, (Xx)h, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2, (int)a2);
                if (fV2 == null) continue;
                Uw uw4 = h;
                uw4.villagePiecesSpawned += vRa.d;
                uw3.structVillagePieceWeight = uw4;
                if (!uw4.J()) {
                    uw3.structureVillageWeightedPieceList.remove(h);
                }
                return fV2;
            }
        }
        Xv xv = eW.J(uw3, (List<uU>)g2, (Random)f2, (int)e2, (int)d2, (int)c2, (DZ)b2);
        if (xv != null) {
            return new eW(uw3, (int)a2, (Random)f2, xv, (DZ)b2);
        }
        return null;
    }

    public static void J() {
        uv.f(AW.class, oQa.p);
        uv.f(hW.class, bqa.Y);
        uv.f(YW.class, KSa.ca);
        uv.f(eW.class, Lqa.k);
        uv.f(Cw.class, aua.Ka);
        uv.f(tW.class, fpa.A);
        uv.f(jv.class, Psa.j);
        uv.f(lU.class, WOa.c);
        uv.f(cv.class, JQa.s);
        uv.f(Uw.class, KPa.A);
        uv.f(IU.class, UOa.v);
        uv.f(rU.class, tSa.t);
        uv.f(JV.class, xSa.o);
    }

    /*
     * WARNING - void declaration
     */
    private static uU J(Uw uw2, List<uU> list, Random random, int n2, int n3, int n4, DZ dZ2, int n5) {
        int c2;
        void e222;
        int a2;
        Object h = random;
        Uw f2 = uw2;
        if (a2 > yRa.d + f2.terrainType) {
            return null;
        }
        if (Math.abs((int)(e222 - f2.J().minX)) <= BRa.E && Math.abs((int)(c2 - f2.J().minZ)) <= BRa.E) {
            void b22;
            int d2;
            void g2;
            Xv e222 = IU.J((Uw)f2, (List)g2, (Random)h, (int)e222, (int)d2, (int)c2, (DZ)b22);
            if (e222 != null && e222.minY > NTa.C) {
                Object object = h = new IU(f2, a2, (Random)h, e222, (DZ)b22);
                int e222 = (h.boundingBox.minX + object.boundingBox.maxX) / uqa.g;
                d2 = (h.boundingBox.minZ + h.boundingBox.maxZ) / uqa.g;
                c2 = object.boundingBox.maxX - h.boundingBox.minX;
                int b22 = h.boundingBox.maxZ - h.boundingBox.minZ;
                int n6 = a2 = c2 > b22 ? c2 : b22;
                if (f2.J().J(e222, d2, a2 / uqa.g + AQa.P, xW.villageSpawnBiomes)) {
                    Object object2 = h;
                    g2.add(h);
                    f2.field_74930_j.add(object2);
                    return object2;
                }
            }
            return null;
        }
        return null;
    }
}

