/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  Kh
 *  Oz
 *  Ssa
 *  Th
 *  UG
 *  UI
 *  di
 *  hG
 *  pqa
 *  rr
 *  uKa
 *  ui
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pg_2
extends UG {
    private final int m;
    private final di C;
    private boolean i;
    private final int M;
    private BufferedImage k;
    private List<Th> j;
    private hG J;
    private boolean A;
    private final UI I;

    public int J() {
        pg_2 a2;
        return a2.M;
    }

    /*
     * WARNING - void declaration
     */
    public pg_2(di di2, BufferedImage bufferedImage, boolean bl, UI uI2, boolean bl2) {
        int c2;
        void b2;
        void e2;
        BufferedImage d2;
        pg_2 pg_22;
        pg_2 pg_23 = pg_22 = this;
        void v1 = d2;
        pg_2 pg_24 = pg_22;
        pg_24.C = e2;
        pg_24.M = d2.getWidth();
        pg_22.m = v1.getHeight();
        pg_23.k = v1;
        pg_23.I = b2;
        if (d2.getType() != uqa.g && d2.getWidth() <= di.E && d2.getHeight() <= di.E) {
            BufferedImage bufferedImage2 = new BufferedImage(d2.getWidth(), d2.getHeight(), uqa.g);
            bufferedImage2.getGraphics().drawImage(d2, uSa.E, uSa.E, null);
            pg_22.k = d2 = bufferedImage2;
        }
        if (b2.isRepeat()) {
            pg_22.i = vRa.d;
            pg_2 pg_25 = pg_22;
            pg_2 pg_26 = pg_22;
            pg_2 pg_27 = pg_22;
            pg_25.J = new hG(new Fi(pg_26.M, pg_26.m, uSa.E != 0, b2.getMipmapLevel()), uSa.E, uSa.E, pg_27.M, pg_27.m);
            return;
        }
        if (c2 != 0 || pg_22.M > e2.J() || pg_22.m > e2.J()) {
            int n2;
            pg_2 pg_28 = pg_22;
            pg_28.i = vRa.d;
            pg_28.j = new ArrayList<Th>();
            int n3 = n2 = uSa.E;
            while (n3 < pg_22.m) {
                c2 = uSa.E;
                int n4 = Math.min(di.E, pg_22.m - n2);
                int n5 = c2;
                while (n5 < pg_22.M) {
                    pg_2 pg_29;
                    void v10;
                    int n6;
                    void a2;
                    int n7 = Math.min(di.E, pg_22.M - c2);
                    pg_2 f2 = new Th();
                    if (a2 != false) {
                        n6 = Oz.C((int)n7);
                        v10 = a2;
                    } else {
                        n6 = n7;
                        v10 = a2;
                    }
                    new Th().A = new hG(new Fi(n6, v10 != false ? Oz.C((int)n4) : n4, uSa.E != 0, b2.getMipmapLevel()), uSa.E, uSa.E, n7, n4);
                    pg_2 pg_210 = f2;
                    ((Th)pg_210).J = c2;
                    ((Th)pg_210).I = n2;
                    if (c2 == 0 && n2 == 0 && n7 == pg_22.M && n4 == pg_22.m) {
                        pg_29 = pg_22;
                        ((Th)f2).j = d2;
                    } else {
                        ((Th)f2).j = new BufferedImage(((Th)f2).A.k, ((Th)f2).A.J, uqa.g);
                        pg_2 pg_211 = f2;
                        pg_2 pg_212 = f2;
                        pg_2 pg_213 = f2;
                        ((Th)f2).j.getGraphics().drawImage(d2, uSa.E, uSa.E, ((Th)f2).A.k, ((Th)f2).A.J, ((Th)pg_211).J, ((Th)pg_211).I, ((Th)pg_212).J + ((Th)pg_212).A.k, ((Th)pg_213).I + ((Th)pg_213).A.J, null);
                        pg_29 = pg_22;
                    }
                    pg_29.j.add((Th)f2);
                    n5 = c2 += ((Th)f2).A.k;
                }
                n3 = n2 + n4;
            }
        } else {
            pg_2 pg_214 = pg_22;
            pg_22.J = e2.J(pg_214.M, pg_214.m);
        }
    }

    public int f() {
        pg_2 a2;
        return a2.m;
    }

    public ui J(PG pG2) {
        pg_2 a2;
        Object b2 = pG2;
        pg_2 pg_22 = a2 = this;
        pg_22.f();
        if (pg_22.J != null) {
            return a2.J.J();
        }
        return a2.j.get((int)uSa.E).A.J();
    }

    public BufferedImage J() {
        pg_2 a2;
        return a2.k;
    }

    public void J(rr rr2) {
        Iterator<Th> iterator;
        pg_2 b2 = rr2;
        pg_2 a2 = this;
        a2.f();
        if (((rr)b2).M.isRepeat()) {
            uKa.C((int)a2.J.M.J);
            Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)((rr)b2).I.f());
            return;
        }
        if (a2.J != null) {
            ui ui2 = a2.J.J();
            uKa.C((int)ui2.I);
            ui ui3 = ui2;
            ui ui4 = ui2;
            Kh.J((float)JPa.N, (float)JPa.N, (float)b2.J(), (float)b2.f(), (float)ui3.A, (float)ui3.j, (float)ui4.k, (float)ui4.J, (float)((rr)b2).I.f());
            return;
        }
        uKa.l((float)(b2.J() / (float)a2.M), (float)(b2.f() / (float)a2.m), (float)pqa.r);
        Iterator<Th> iterator2 = iterator = a2.j.iterator();
        while (iterator2.hasNext()) {
            b2 = iterator.next();
            ui ui5 = ((Th)b2).A.J();
            uKa.C((int)ui5.I);
            ui ui6 = ui5;
            ui ui7 = ui5;
            Kh.J((float)((Th)b2).J, (float)((Th)b2).I, (float)((Th)b2).A.k, (float)((Th)b2).A.J, (float)ui6.A, (float)ui6.j, (float)ui7.k, (float)ui7.J);
            iterator2 = iterator;
        }
    }

    public void f() {
        pg_2 pg_22 = this;
        if (!pg_22.A) {
            pg_2 pg_23;
            long l2;
            long l3 = l2 = OT.A ? System.nanoTime() : nqa.i;
            if (pg_22.J != null) {
                pg_2 pg_24 = pg_22;
                pg_24.C.J(pg_24.J, ((DataBufferInt)pg_22.k.getRaster().getDataBuffer()).getData(), (!pg_22.I.isRepeat() ? vRa.d : uSa.E) != 0);
                pg_23 = pg_22;
            } else {
                Iterator<Th> iterator;
                Iterator<Th> iterator2 = iterator = pg_22.j.iterator();
                while (iterator2.hasNext()) {
                    pg_2 a2 = iterator.next();
                    pg_2 pg_25 = a2;
                    pg_22.C.J(((Th)pg_25).A, ((DataBufferInt)((Th)pg_25).j.getRaster().getDataBuffer()).getData(), (!pg_22.I.isRepeat() ? vRa.d : uSa.E) != 0);
                    iterator2 = iterator;
                    ((Th)a2).j = null;
                }
                pg_23 = pg_22;
            }
            pg_23.k = null;
            pg_22.A = vRa.d;
            if (OT.A) {
                Object[] objectArray = new Object[yRa.d];
                objectArray[uSa.E] = pg_22.M;
                objectArray[vRa.d] = pg_22.m;
                objectArray[uqa.g] = Float.valueOf((float)Math.round((double)(System.nanoTime() - l2) / Eqa.w) / QTa.G);
                OT.J(Ssa.ga, objectArray);
            }
        }
    }

    public void J() {
        pg_2 pg_22 = this;
        if (!pg_22.A || !pg_22.i) {
            return;
        }
        if (pg_22.J != null) {
            pg_2 pg_23 = pg_22;
            pg_23.C.J(pg_23.J.M);
            return;
        }
        Iterator<Th> a2 = pg_22.j.iterator();
        Object object = a2;
        while (object.hasNext()) {
            Th th2 = (Th)a2.next();
            object = a2;
            pg_22.C.J(th2.A.M);
        }
    }
}

