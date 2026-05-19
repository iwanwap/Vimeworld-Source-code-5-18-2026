/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AZ
 *  Ay
 *  Baa
 *  Cra
 *  Dha
 *  ERa
 *  EY
 *  Eca
 *  FBa
 *  Faa
 *  Gg
 *  Gl
 *  JPa
 *  MZ
 *  NTa
 *  OCa
 *  Oy
 *  PTa
 *  QFa
 *  RIa
 *  RQa
 *  Tf
 *  UZ
 *  Uqa
 *  Usa
 *  Vx
 *  WSa
 *  Wca
 *  XB
 *  XTa
 *  XX
 *  Xba
 *  Xv
 *  YEa
 *  Ypa
 *  bFa
 *  bpa
 *  bqa
 *  cEa
 *  dQa
 *  dZ
 *  dda
 *  eAa
 *  fEa
 *  fpa
 *  gc
 *  gda
 *  hd
 *  hda
 *  hra
 *  jGa
 *  jRa
 *  jZ
 *  kY
 *  lqa
 *  mZ
 *  oZ
 *  oaa
 *  pqa
 *  qV
 *  rC
 *  uQa
 *  uRa
 *  uY
 *  ura
 *  vL
 *  vRa
 *  vU
 *  vba
 *  wOa
 *  wra
 *  xy
 *  yc
 *  ysa
 *  yz
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEventData;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Tf_1
extends Gg
implements c {
    private int l;
    private final jGa e;
    private final Qz G;
    private boolean D;
    public oaa f;
    private final OCa F;
    private final TreeSet<Oy> g;
    private final Set<Oy> L;
    public final lZ E;
    private final Map<UUID, vL> m;
    private jZ[] C;
    public boolean i;
    private static final List<baa> M;
    private static final Logger k;
    private List<Oy> j;
    private int J;
    private final EY A;
    private final kY I;

    /*
     * WARNING - void declaration
     */
    public boolean J(VIa vIa, AZ aZ2, XF xF2) {
        void a2;
        Object d2 = vIa;
        Object c2 = this;
        d2 = c2.f().J((VIa)((Object)d2), (XF)a2);
        if (d2 != null && !d2.isEmpty()) {
            void b2;
            return d2.contains(b2);
        }
        return uSa.E != 0;
    }

    private boolean A() {
        Tf_1 a2;
        return a2.F.F();
    }

    public Gg J() {
        Tf_1 tf_1;
        Tf_1 tf_12;
        tf_12.i = new qV(tf_12.M);
        Object a2 = yz.J((Ty)(tf_12 = this).F);
        yz yz2 = (yz)tf_12.i.J(yz.class, (String)a2);
        if (yz2 == null) {
            Tf_1 tf_13 = tf_12;
            tf_13.L = new yz((Gg)tf_13);
            Tf_1 tf_14 = tf_12;
            tf_1 = tf_14;
            tf_13.i.J((String)a2, tf_14.L);
        } else {
            Tf_1 tf_15 = tf_12;
            tf_1 = tf_15;
            tf_15.L = yz2;
            tf_15.L.J(tf_12);
        }
        tf_1.x = new Wca(tf_12.F);
        a2 = (vba)tf_12.i.J(vba.class, fpa.ha);
        if (a2 == null) {
            a2 = new vba();
            tf_12.i.J(fpa.ha, (Vx)a2);
        }
        a2.J(tf_12.x);
        ((Wca)tf_12.x).J((vba)a2);
        Tf_1 tf_16 = tf_12;
        Tf_1 tf_17 = tf_12;
        tf_16.J().J(tf_17.K.C(), tf_12.K.e());
        tf_16.J().f(tf_12.K.d());
        tf_17.J().l(tf_12.K.f());
        tf_16.J().f(tf_12.K.J());
        tf_16.J().l(tf_12.K.M());
        if (tf_16.K.d() > nqa.i) {
            Tf_1 tf_18 = tf_12;
            tf_12.J().J(tf_18.K.l(), tf_12.K.J(), tf_12.K.d());
            return tf_18;
        }
        Tf_1 tf_19 = tf_12;
        tf_19.J().J(tf_12.K.l());
        return tf_19;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, byte by2) {
        void a2;
        Tf_1 c2 = vL2;
        Tf_1 b2 = this;
        Tf_1 tf_1 = c2;
        Tf_1 tf_12 = c2;
        b2.J().J((vL)tf_12, (KC)new tAa((vL)tf_12, (byte)a2));
    }

    public void f() {
        Tf_1 tf_1;
        Tf_1 tf_12 = tf_1 = this;
        boolean a2 = tf_12.l();
        super.f();
        if (tf_12.A != tf_1.G) {
            tf_1.F.J().J((KC)new FBa(XTa.W, (float)tf_1.G), tf_1.F.J());
        }
        Tf_1 tf_13 = tf_1;
        if (tf_13.a != tf_13.s) {
            tf_1.F.J().J((KC)new FBa(Yqa.i, tf_1.s), tf_1.F.J());
        }
        if (a2 != tf_1.l()) {
            Tf_1 tf_14;
            if (a2) {
                Tf_1 tf_15 = tf_1;
                tf_14 = tf_15;
                tf_15.F.J().J((KC)new FBa(uqa.g, JPa.N));
            } else {
                Tf_1 tf_16 = tf_1;
                tf_14 = tf_16;
                tf_16.F.J().J((KC)new FBa(vRa.d, JPa.N));
            }
            tf_14.F.J().J((KC)new FBa(XTa.W, (float)tf_1.G));
            tf_1.F.J().J((KC)new FBa(Yqa.i, tf_1.s));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(XF xF2, Block block, int n2, int n3) {
        void a2;
        void b2;
        BlockEventData d2;
        Object e2 = block;
        Tf_1 c2 = this;
        d2 = new BlockEventData((XF)((Object)d2), (Block)e2, (int)b2, (int)a2);
        Tf_1 tf_1 = c2;
        e2 = tf_1.C[tf_1.J].iterator();
        while (e2.hasNext()) {
            if (!((BlockEventData)e2.next()).equals(d2)) continue;
            return;
        }
        Tf_1 tf_12 = c2;
        tf_12.C[tf_12.J].add((Object)d2);
    }

    public boolean i() {
        Tf_1 tf_1 = this;
        if (tf_1.D && tf_1.e == false) {
            for (Sx sx2 : tf_1.w) {
                if (!sx2.t() && sx2.N()) continue;
                return uSa.E != 0;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(XF xF2, Block block) {
        void a2;
        Object c2 = xF2;
        Tf_1 b2 = this;
        c2 = new Oy((XF)((Object)c2), (Block)a2);
        return b2.j.contains(c2);
    }

    private boolean M() {
        Tf_1 a2;
        return a2.F.m();
    }

    public void L() {
        Tf_1 tf_1 = this;
        tf_1.D = uSa.E;
        for (Sx sx2 : tf_1.w) {
            if (!sx2.p()) continue;
            sx2.J(uSa.E != 0, uSa.E != 0, vRa.d != 0);
        }
        tf_1.j();
    }

    public XF C(XF xF2) {
        Tf_1 a2;
        Object b2 = xF2;
        Tf_1 tf_1 = a2 = this;
        Object object = b2 = tf_1.J((XF)((Object)b2));
        Object object2 = b2;
        Object object3 = new xy((XF)((Object)object2), new XF(object2.getX(), a2.C(), b2.getZ())).f(uRa.I, uRa.I, uRa.I);
        if (!(object3 = tf_1.J(Gl.class, (xy)object3, new OY((Tf)a2))).isEmpty()) {
            Object object4 = object3;
            return ((Gl)object4.get(a2.v.nextInt(object4.size()))).J();
        }
        return b2;
    }

    static {
        k = LogManager.getLogger();
        baa[] baaArray = new baa[NTa.C];
        baaArray[uSa.E] = new baa(Gea.t, uSa.E, vRa.d, yRa.d, NTa.C);
        baaArray[vRa.d] = new baa(eAa.J((Block)QFa.L), uSa.E, vRa.d, yRa.d, NTa.C);
        baaArray[uqa.g] = new baa(eAa.J((Block)QFa.UA), uSa.E, vRa.d, yRa.d, NTa.C);
        baaArray[yRa.d] = new baa(Gea.Wc, uSa.E, vRa.d, vRa.d, yRa.d);
        baaArray[AQa.P] = new baa(Gea.qb, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[tTa.h] = new baa(Gea.P, uSa.E, vRa.d, vRa.d, yRa.d);
        baaArray[uua.p] = new baa(Gea.kB, uSa.E, vRa.d, vRa.d, tTa.h);
        baaArray[XTa.W] = new baa(Gea.Mb, uSa.E, uqa.g, yRa.d, tTa.h);
        baaArray[Yqa.i] = new baa(Gea.Ra, uSa.E, uqa.g, yRa.d, yRa.d);
        baaArray[WOa.fa] = new baa(eAa.J((Block)QFa.hf), uSa.E, vRa.d, yRa.d, NTa.C);
        M = Lists.newArrayList(baaArray);
    }

    /*
     * WARNING - void declaration
     */
    public AZ J(VIa vIa, XF xF2) {
        void a2;
        Object c2 = vIa;
        Object b2 = this;
        c2 = b2.f().J((VIa)((Object)c2), (XF)a2);
        if (c2 != null && !c2.isEmpty()) {
            return (AZ)dZ.J((Random)b2.v, (Collection)c2);
        }
        return null;
    }

    public jGa J() {
        Tf_1 a2;
        return a2.e;
    }

    public void b() {
        Tf_1 a2;
        a2.M.f();
    }

    public void a() {
        int n2;
        Tf_1 tf_1 = this;
        WV wV2 = new WV(M, NTa.C);
        int n3 = n2 = uSa.E;
        while (n3 < NTa.C) {
            Tf_1 tf_12 = tf_1;
            Tf_1 tf_13 = tf_1;
            int a22 = tf_12.K.C() + tf_13.v.nextInt(uua.p) - tf_1.v.nextInt(uua.p);
            int n4 = tf_12.K.f() + tf_1.v.nextInt(uua.p) - tf_1.v.nextInt(uua.p);
            Tf_1 tf_14 = tf_1;
            Object a22 = tf_13.f(new XF(a22, uSa.E, n4)).up();
            Tf_1 tf_15 = tf_1;
            if (wV2.J(tf_15, tf_15.v, (XF)((Object)a22))) {
                return;
            }
            n3 = ++n2;
        }
    }

    public kY J() {
        Tf_1 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(vL vL2, boolean bl) {
        void a2;
        Tf_1 c2 = vL2;
        Tf_1 b2 = this;
        if (!b2.M() && (c2 instanceof fEa || c2 instanceof YEa)) {
            c2.k();
        }
        if (!b2.A() && c2 instanceof rC) {
            c2.k();
        }
        super.J((vL)c2, (boolean)a2);
    }

    public EY J() {
        Tf_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, gc gc2) throws oZ {
        Tf_1 c2 = gc2;
        Tf_1 a2 = this;
        if (a2.p.f()) {
            void b22;
            if (c2 != null) {
                c2.l(LPa.Da);
            }
            a2.I();
            if (c2 != null) {
                c2.f(DPa.G);
            }
            a2.p.J((boolean)b22, (gc)c2);
            Iterator b22 = Lists.newArrayList(a2.f.J()).iterator();
            while (b22.hasNext()) {
                c2 = (Faa)b22.next();
                if (c2 == null) continue;
                Tf_1 tf_1 = c2;
                if (a2.A.J(((Faa)tf_1).I, ((Faa)tf_1).G)) continue;
                Tf_1 tf_12 = c2;
                a2.f.J(((Faa)tf_12).I, ((Faa)tf_12).G);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Sx sx2, XF xF2) {
        void b2;
        Tf_1 a2 = this;
        Object c2 = xF2;
        if (!a2.F.J((Gg)a2, (XF)((Object)c2), (Sx)b2) && a2.J().J((XF)((Object)c2))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void H() {
        a.l = uSa.E;
    }

    public void l() {
        Tf_1 tf_1;
        Tf_1 tf_12 = tf_1 = this;
        super.l();
        if (tf_12.K.J() == Fy.A) {
            Iterator iterator;
            Iterator iterator2 = iterator = tf_1.b.iterator();
            while (iterator2.hasNext()) {
                Baa baa2 = (Baa)iterator.next();
                iterator2 = iterator;
                Baa baa3 = baa2;
                tf_1.J(baa3.j, baa3.A).l(uSa.E != 0);
            }
        } else {
            Iterator iterator;
            int n2 = uSa.E;
            int n3 = uSa.E;
            Iterator iterator3 = iterator = tf_1.b.iterator();
            while (iterator3.hasNext()) {
                Object object;
                int n4;
                Tf_1 a2 = (Baa)iterator.next();
                int n5 = ((Baa)a2).j * ERa.C;
                int n6 = ((Baa)a2).A * ERa.C;
                Tf_1 tf_13 = tf_1;
                Tf_1 tf_14 = tf_1;
                tf_14.H.J(rua.Q);
                a2 = tf_14.J(((Baa)a2).j, ((Baa)a2).A);
                tf_13.J(n5, n6, (Faa)a2);
                tf_13.H.f(WSa.Q);
                a2.l(uSa.E != 0);
                tf_13.H.f(Upa.G);
                if (tf_13.v.nextInt(tua.P) == 0 && tf_1.l() && tf_1.d()) {
                    Tf_1 tf_15 = tf_1;
                    tf_15.u = tf_15.u * yRa.d + jRa.ja;
                    n4 = tf_15.u >> uqa.g;
                    Tf_1 tf_16 = tf_1;
                    object = tf_15.C(new XF(n5 + (n4 & Ypa.A), uSa.E, n6 + (n4 >> Yqa.i & Ypa.A)));
                    if (tf_15.i((XF)((Object)object))) {
                        Tf_1 tf_17 = tf_1;
                        tf_17.J((vL)new cEa((Gg)tf_17, (double)object.getX(), (double)object.getY(), (double)object.getZ()));
                    }
                }
                Tf_1 tf_18 = tf_1;
                tf_18.H.f(rRa.Ha);
                if (tf_18.v.nextInt(ERa.C) == 0) {
                    Tf_1 tf_19 = tf_1;
                    tf_19.u = tf_19.u * yRa.d + jRa.ja;
                    n4 = tf_19.u >> uqa.g;
                    object = tf_19.J(new XF(n5 + (n4 & Ypa.A), uSa.E, n6 + (n4 >> Yqa.i & Ypa.A)));
                    XF xF2 = object.down();
                    if (tf_19.M(xF2)) {
                        tf_1.J(xF2, QFa.Ta.J());
                    }
                    if (tf_1.l() && tf_1.C((XF)((Object)object), vRa.d != 0)) {
                        tf_1.J((XF)((Object)object), QFa.gC.J());
                    }
                    if (tf_1.l() && tf_1.J(xF2).J()) {
                        tf_1.J(xF2).J().J((Gg)tf_1, xF2);
                    }
                }
                Tf_1 tf_110 = tf_1;
                tf_110.H.f(rpa.v);
                n4 = tf_110.J().J(cPa.e);
                if (n4 > 0) {
                    object = a2.J();
                    int n7 = ((XX[])object).length;
                    int n8 = uSa.E;
                    while (n8 < n7) {
                        XX xX2 = object[a2];
                        if (xX2 != null && xX2.f()) {
                            int n9 = uSa.E;
                            while (n9 < n4) {
                                int n10;
                                Tf_1 tf_111 = tf_1;
                                tf_111.u = tf_111.u * yRa.d + jRa.ja;
                                int n11 = tf_111.u >> uqa.g;
                                int n12 = n11 & Ypa.A;
                                int n13 = n11 >> Yqa.i & Ypa.A;
                                ++n3;
                                IBlockState iBlockState = xX2.J(n12, n11 = n11 >> ERa.C & Ypa.A, n13);
                                Block block = iBlockState.J();
                                if (block.M()) {
                                    ++n2;
                                    Tf_1 tf_112 = tf_1;
                                    block.J((Gg)tf_112, new XF(n12 + n5, n11 + xX2.J(), n13 + n6), iBlockState, tf_112.v);
                                }
                                n9 = ++n10;
                            }
                        }
                        n8 = ++a2;
                    }
                }
                tf_1.H.f();
                iterator3 = iterator;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(UZ uZ, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... nArray) {
        Object k2;
        void b2;
        void c2;
        void d9;
        void e2;
        void f2;
        void g2;
        void h2;
        void i2;
        void j2;
        Tf_1 tf_1 = object;
        Object object = nArray;
        Tf_1 a2 = tf_1;
        a2.J((UZ)j2, uSa.E != 0, (double)i2, (double)h2, (double)g2, (int)f2, (double)e2, (double)d9, (double)c2, (double)b2, (int[])k2);
    }

    private boolean J(BlockEventData blockEventData) {
        Object a2 = this;
        BlockEventData b2 = blockEventData;
        IBlockState iBlockState = a2.J(b2.J());
        if (iBlockState.J() == b2.J()) {
            return iBlockState.J().J((Gg)a2, b2.J(), iBlockState, b2.J(), b2.f());
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block, int n2, int n3) {
        int b2;
        void c2;
        void d2;
        Tf_1 tf_1 = this;
        Tf_1 e2 = new Oy((XF)d2, (Block)c2);
        int n4 = uSa.E;
        if (tf_1.g != false && c2.J() != Material.air) {
            if (c2.k()) {
                IBlockState iBlockState;
                int n5 = n4 = Yqa.i;
                if (tf_1.J(((Oy)e2).position.add(-n4, -n4, -n4), ((Oy)e2).position.add(n5, n5, n5)) && (iBlockState = tf_1.J(((Oy)e2).position)).J().J() != Material.air && iBlockState.J() == e2.getBlock()) {
                    Tf_1 tf_12 = tf_1;
                    iBlockState.J().f(tf_12, ((Oy)e2).position, iBlockState, tf_12.v);
                }
                return;
            }
            b2 = vRa.d;
        }
        int n6 = n4;
        if (tf_1.J(d2.add(-n4, -n4, -n4), d2.add(n6, n6, n6))) {
            if (c2.J() != Material.air) {
                void a2;
                e2.setScheduledTime((long)b2 + tf_1.K.l());
                e2.setPriority((int)a2);
            }
            if (!tf_1.L.contains(e2)) {
                tf_1.L.add((Oy)e2);
                tf_1.g.add((Oy)e2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public List<Oy> J(Faa faa2, boolean bl) {
        void a2;
        Tf_1 c22 = faa2;
        Tf_1 b2 = this;
        Baa baa2 = c22.J();
        int c22 = (baa2.j << AQa.P) - uqa.g;
        int n2 = c22 + ERa.C + uqa.g;
        int n3 = (baa2.A << AQa.P) - uqa.g;
        int n4 = n3 + ERa.C + uqa.g;
        return b2.J(new Xv(c22, uSa.E, n3, n2, hra.Ja, n4), (boolean)a2);
    }

    public boolean J(boolean bl) {
        Tf_1 tf_1;
        int a22;
        Tf_1 b2;
        Tf_1 tf_12;
        block10: {
            int n2;
            tf_12 = this;
            if (tf_12.K.J() == Fy.A) {
                return uSa.E != 0;
            }
            int n3 = tf_12.g.size();
            if (n3 != tf_12.L.size()) {
                throw new IllegalStateException(Cra.J);
            }
            if (n3 > PRa.U) {
                n3 = PRa.U;
            }
            tf_12.H.J(PQa.L);
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                b2 = tf_12.g.first();
                if (a22 == 0 && ((Oy)b2).scheduledTime > tf_12.K.l()) {
                    tf_1 = tf_12;
                    break block10;
                }
                tf_12.g.remove(b2);
                tf_12.L.remove(b2);
                tf_12.j.add((Oy)b2);
                n4 = ++n2;
            }
            tf_1 = tf_12;
        }
        tf_1.H.f();
        Tf_1 tf_13 = tf_12;
        tf_13.H.J(Qra.I);
        Iterator<Oy> iterator = tf_13.j.iterator();
        while (iterator.hasNext()) {
            b2 = iterator.next();
            iterator.remove();
            int n5 = a22 = uSa.E;
            if (tf_12.J(((Oy)b2).position.add(-a22, -a22, -a22), ((Oy)b2).position.add(n5, n5, n5))) {
                IBlockState a22 = tf_12.J(((Oy)b2).position);
                if (a22.J().J() == Material.air || !Block.J(a22.J(), b2.getBlock())) continue;
                try {
                    Tf_1 tf_14 = tf_12;
                    a22.J().f(tf_14, ((Oy)b2).position, a22, tf_14.v);
                    continue;
                }
                catch (Throwable throwable) {
                    RIa rIa2 = RIa.J((Throwable)throwable, (String)XTa.b);
                    Dha.J((Dha)rIa2.J(opa.Ha), (XF)((Oy)b2).position, (IBlockState)a22);
                    throw new MZ(rIa2);
                }
            }
            tf_12.J(((Oy)b2).position, b2.getBlock(), uSa.E);
        }
        Tf_1 tf_15 = tf_12;
        tf_15.H.f();
        tf_15.j.clear();
        if (!tf_15.g.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void f(mZ mZ2) {
        void a2;
        Tf_1 tf_1;
        int n2;
        int n3;
        int n4;
        Tf_1 tf_12;
        block6: {
            tf_12 = this;
            if (!tf_12.F.l()) {
                tf_12.K.J(XF.ORIGIN.up(tf_12.F.f()));
                return;
            }
            if (tf_12.K.J() == Fy.A) {
                tf_12.K.J(XF.ORIGIN.up());
                return;
            }
            Tf_1 tf_13 = tf_12;
            tf_13.j = (List<Oy>)vRa.d;
            Ay ay2 = tf_13.F.J();
            Object b22 = ay2.J();
            Random random = new Random(tf_12.J());
            b22 = ay2.J(uSa.E, uSa.E, hra.Ja, (List)b22, random);
            n4 = uSa.E;
            n3 = tf_13.F.f();
            n2 = uSa.E;
            if (b22 != null) {
                Object object = b22;
                n4 = object.getX();
                n2 = object.getZ();
            } else {
                k.warn(BPa.u);
            }
            int b22 = uSa.E;
            while (!tf_12.F.f(n4, n2)) {
                n4 += random.nextInt(ysa.s) - random.nextInt(ysa.s);
                n2 += random.nextInt(ysa.s) - random.nextInt(ysa.s);
                if (++b22 != PRa.U) continue;
                tf_1 = tf_12;
                break block6;
            }
            tf_1 = tf_12;
        }
        tf_1.K.J(new XF(n4, n3, n2));
        tf_12.j = (List<Oy>)uSa.E;
        if (a2.J()) {
            tf_12.a();
        }
    }

    @Override
    public boolean J() {
        Tf_1 a2;
        return a2.F.J();
    }

    private void g() {
        Tf_1 tf_1;
        Tf_1 tf_12 = tf_1 = this;
        while (!tf_12.C[tf_1.J].isEmpty()) {
            Tf_1 tf_13 = tf_1;
            int n2 = tf_13.J;
            tf_13.J ^= vRa.d;
            for (Object a2 : tf_13.C[n2]) {
                if (!tf_1.J((BlockEventData)a2)) continue;
                tf_1.F.J().J(((BlockEventData)a2).J().getX(), ((BlockEventData)a2).J().getY(), ((BlockEventData)a2).J().getZ(), ypa.X, tf_1.F.J(), (KC)new Eca(((BlockEventData)a2).J(), ((BlockEventData)a2).J(), ((BlockEventData)a2).J(), ((BlockEventData)a2).f()));
            }
            Tf_1 tf_14 = tf_1;
            tf_12 = tf_14;
            tf_14.C[n2].clear();
        }
    }

    public void M() {
        Tf_1 a2;
        if (a2.w.isEmpty()) {
            int n2 = a2.l;
            a2.l = n2 + vRa.d;
            if (n2 >= PRa.ga) {
                return;
            }
        } else {
            a2.H();
        }
        super.M();
    }

    /*
     * WARNING - void declaration
     */
    public Tf_1(OCa oCa2, XB xB2, vU vU2, int n2, gda gda2) {
        void a2;
        void b2;
        void c2;
        void d2;
        Tf_1 f2 = oCa2;
        Tf_1 e2 = this;
        super((XB)d2, (vU)c2, Ty.J((int)b2), (gda)a2, uSa.E != 0);
        e2.L = Sets.newHashSet();
        Tf_1 tf_1 = e2;
        tf_1.g = new TreeSet();
        e2.m = Maps.newHashMap();
        e2.G = new Qz();
        e2.E = new lZ(e2);
        jZ[] jZArray = new jZ[uqa.g];
        jZArray[uSa.E] = new jZ(null);
        jZArray[vRa.d] = new jZ(null);
        e2.C = jZArray;
        Tf_1 tf_12 = e2;
        Tf_1 tf_13 = e2;
        tf_13.j = Lists.newArrayList();
        tf_13.F = f2;
        tf_12.e = new jGa((Tf)e2);
        e2.A = new EY((Tf)e2);
        tf_12.F.J(e2);
        tf_12.p = tf_12.J();
        tf_12.I = new kY((Tf)e2);
        tf_12.J();
        tf_12.A();
        tf_12.J().J(f2.e());
    }

    public void I() throws oZ {
        Tf_1 a2;
        Tf_1 tf_1 = a2;
        tf_1.d();
        Tf_1 tf_12 = a2;
        tf_1.K.J(tf_12.J().A());
        tf_12.K.l(a2.J().D());
        tf_1.K.e(a2.J().C());
        tf_1.K.f(a2.J().f());
        tf_1.K.C(a2.J().M());
        tf_1.K.C(a2.J().J());
        tf_1.K.i(a2.J().f());
        tf_1.K.d(a2.J().G());
        tf_1.K.l(a2.J().J());
        Tf_1 tf_13 = a2;
        tf_1.M.J(tf_13.K, tf_13.F.J().J());
        tf_1.i.f();
    }

    private void j() {
        Tf_1 a2;
        Tf_1 tf_1 = a2;
        tf_1.K.M(uSa.E);
        tf_1.K.d(uSa.E != 0);
        tf_1.K.d(uSa.E);
        tf_1.K.C(uSa.E != 0);
    }

    private void F() {
        Tf_1 a2;
        Tf_1 tf_1 = a2;
        tf_1.K.M(uSa.E != 0);
        tf_1.K.e(vRa.d != 0);
        tf_1.K.d(uSa.E != 0);
        tf_1.K.C(uSa.E != 0);
        tf_1.K.f(RQa.a);
        tf_1.K.J(bqa.S);
        tf_1.K.J(Daa.SPECTATOR);
        tf_1.K.J(uSa.E != 0);
        tf_1.K.J(sZ.PEACEFUL);
        tf_1.K.f(vRa.d != 0);
        tf_1.J().J(PTa.Ka, MRa.E);
    }

    /*
     * Unable to fully structure code
     */
    public List<Oy> J(Xv var1_1, boolean var2_2) {
        var5_3 = this;
        var3_4 = null;
        v0 = var4_5 = uSa.E;
        while (v0 < uqa.g) {
            block4: {
                if (var4_5 != 0) break block4;
                v1 = var5_3.g.iterator();
                ** GOTO lbl12
            }
            c = var5_3.j.iterator();
            while (true) {
                v1 = c;
lbl12:
                // 2 sources

                if (!v1.hasNext()) break;
                var6_6 = c.next();
                var7_7 = var6_6.position;
                if (var7_7.getX() < b.minX || var7_7.getX() >= b.maxX || var7_7.getZ() < b.minZ || var7_7.getZ() >= b.maxZ) continue;
                if (a != false) {
                    var5_3.L.remove(var6_6);
                    c.remove();
                }
                if (var3_4 == null) {
                    var3_4 = Lists.newArrayList();
                }
                var3_4.add(var6_6);
            }
            v0 = ++var4_5;
        }
        return var3_4;
    }

    public void k() {
        Tf_1 a2;
        if (a2.p.f()) {
            a2.p.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public NZ J(vL vL2, double d2, double d3, double d4, float f2, boolean bl, boolean bl2) {
        void a22;
        void b2;
        void c2;
        void d5;
        void e2;
        void f3;
        Object h2 = vL2;
        Tf_1 g2 = this;
        Object object = h2 = new NZ(g2, (vL)h2, (double)f3, (double)e2, (double)d5, (float)c2, (boolean)b2, (boolean)a22);
        ((NZ)object).J();
        ((NZ)object).J(uSa.E != 0);
        if (a22 == false) {
            ((NZ)h2).f();
        }
        for (Sx a22 : g2.w) {
            Sx sx2;
            if (!(sx2.f((double)f3, (double)e2, (double)d5) < Psa.t)) continue;
            ((bFa)a22).I.J((KC)new Xba((double)f3, (double)e2, (double)d5, (float)c2, ((NZ)h2).J(), ((NZ)h2).J().get((Object)a22)));
        }
        return h2;
    }

    public int e() {
        Tf_1 a2;
        return a2.F.J().J();
    }

    public void C() {
        Tf_1 tf_1 = this;
        tf_1.D = uSa.E;
        if (!tf_1.w.isEmpty()) {
            int n2 = uSa.E;
            int n3 = uSa.E;
            for (Sx sx2 : tf_1.w) {
                if (sx2.t()) {
                    ++n2;
                    continue;
                }
                if (!sx2.p()) continue;
                ++n3;
            }
            tf_1.D = n3 > 0 && n3 >= tf_1.w.size() - n2 ? vRa.d : uSa.E;
        }
    }

    public void J(mZ mZ2) {
        Tf_1 b222 = mZ2;
        Tf_1 a2 = this;
        if (!a2.K.e()) {
            try {
                Tf_1 tf_1 = a2;
                tf_1.f((mZ)b222);
                if (tf_1.K.J() == Fy.A) {
                    a2.F();
                }
                super.J((mZ)b222);
            }
            catch (Throwable b222) {
                RIa b222 = RIa.J((Throwable)b222, (String)Usa.p);
                try {
                    a2.J(b222);
                }
                catch (Throwable throwable) {}
                throw new MZ(b222);
            }
            a2.K.l(vRa.d != 0);
        }
    }

    @Override
    public ListenableFuture<Object> J(Runnable runnable) {
        Runnable b2 = runnable;
        Tf_1 a2 = this;
        return a2.F.J(b2);
    }

    public XF f() {
        Tf_1 a2;
        return a2.F.J();
    }

    public hd J() {
        Tf_1 tf_1;
        Tf_1 tf_12 = tf_1 = this;
        Tf_1 a2 = tf_1.M.J((Ty)tf_12.F);
        Tf_1 tf_13 = tf_1;
        Tf_1 tf_14 = tf_1;
        tf_1.f = new oaa((Tf)tf_14, (yc)a2, tf_14.F.J());
        return tf_12.f;
    }

    public OCa J() {
        Tf_1 a2;
        return a2.F;
    }

    public vL J(UUID uUID) {
        UUID b2 = uUID;
        Tf_1 a2 = this;
        return a2.m.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(UZ uZ, boolean bl, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... nArray) {
        bFa a2;
        int l2;
        void b2;
        void c2;
        void d9;
        double e2;
        void g2;
        void h2;
        void i2;
        void j2;
        dda k2;
        int n3 = n2;
        Tf_1 f2 = this;
        k2 = new dda((UZ)k2, (boolean)j2, (float)i2, (float)h2, (float)g2, (float)e2, (float)d9, (float)c2, (float)b2, l2, (int[])a2);
        int n4 = l2 = uSa.E;
        while (n4 < f2.w.size()) {
            a2 = (bFa)f2.w.get(l2);
            e2 = a2.J().distanceSq((double)i2, (double)h2, (double)g2);
            if (e2 <= ZSa.o || j2 != false && e2 <= ura.n) {
                a2.I.J((KC)k2);
            }
            n4 = ++l2;
        }
    }

    public void i() {
        Tf_1 tf_1;
        int a2;
        int n2;
        Tf_1 tf_12;
        block2: {
            tf_12 = this;
            if (tf_12.K.e() <= 0) {
                tf_12.K.l(tf_12.M() + vRa.d);
            }
            Tf_1 tf_13 = tf_12;
            n2 = tf_13.K.C();
            a2 = tf_13.K.f();
            int n3 = uSa.E;
            while (tf_12.J(new XF(n2, uSa.E, a2)).J() == Material.air) {
                n2 += tf_12.v.nextInt(Yqa.i) - tf_12.v.nextInt(Yqa.i);
                a2 += tf_12.v.nextInt(Yqa.i) - tf_12.v.nextInt(Yqa.i);
                if (++n3 != Uqa.G) continue;
                tf_1 = tf_12;
                break block2;
            }
            tf_1 = tf_12;
        }
        tf_1.K.e(n2);
        tf_12.K.J(a2);
    }

    public void e() {
        Tf_1 a2;
        Tf_1 tf_1 = a2;
        super.e();
        if (tf_1.J().d() && a2.J() != sZ.HARD) {
            a2.J().J(sZ.HARD);
        }
        Tf_1 tf_12 = a2;
        tf_12.F.J().J();
        if (tf_12.i()) {
            if (a2.J().f(PTa.Ka)) {
                long l2;
                Tf_1 tf_13 = a2;
                long l3 = l2 = tf_13.K.f() + dua.Aa;
                tf_13.K.J(l3 - l3 % dua.Aa);
            }
            a2.L();
        }
        Tf_1 tf_14 = a2;
        tf_14.H.J(wOa.P);
        if (tf_14.J().f(uQa.Ga) && a2.K.J() != Fy.A) {
            Tf_1 tf_15 = a2;
            Tf_1 tf_16 = a2;
            tf_15.G.J((Tf)tf_16, (boolean)tf_15.m, a2.R, (tf_16.K.l() % wra.t == nqa.i ? vRa.d : uSa.E) != 0);
        }
        Tf_1 tf_17 = a2;
        tf_17.H.f(XOa.K);
        tf_17.p.J();
        int n2 = a2.J(pqa.r);
        if (n2 != a2.J()) {
            a2.f(n2);
        }
        Tf_1 tf_18 = a2;
        tf_18.K.f(tf_18.K.l() + dQa.Ga);
        if (tf_18.J().f(PTa.Ka)) {
            Tf_1 tf_19 = a2;
            tf_19.K.J(tf_19.K.f() + dQa.Ga);
        }
        Tf_1 tf_110 = a2;
        tf_110.H.f(pta.L);
        tf_110.J(uSa.E != 0);
        Tf_1 tf_111 = a2;
        tf_111.H.f(rpa.v);
        tf_111.l();
        tf_111.H.f(fqa.ga);
        tf_111.A.J();
        tf_111.H.f(bpa.p);
        tf_111.L.l();
        tf_111.E.J();
        tf_111.H.f(lqa.z);
        tf_111.I.J(a2.l());
        tf_111.H.f();
        tf_111.g();
    }

    public void J(vL vL2) {
        vL[] a2;
        vL[] b2 = vL2;
        vL[] vLArray = a2 = this;
        super.J((vL)b2);
        a2.f.J(b2.M(), b2);
        vLArray.m.put(b2.J(), (vL)b2);
        b2 = b2.J();
        if (b2 != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < b2.length) {
                a2.f.J(b2[n2].M(), b2[n2++]);
                n3 = n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void l(XF xF2, Block block, int n2, int n3) {
        void a2;
        void c2;
        Object e2 = xF2;
        Tf_1 d2 = this;
        e2 = new Oy((XF)((Object)e2), (Block)c2);
        e2.setPriority((int)a2);
        if (c2.J() != Material.air) {
            void b2;
            e2.setScheduledTime((long)b2 + d2.K.l());
        }
        if (!d2.L.contains(e2)) {
            d2.L.add((Oy)e2);
            d2.g.add((Oy)e2);
        }
    }

    public void d(vL vL2) {
        vL[] b2 = vL2;
        vL[] a2 = this;
        super.d((vL)b2);
        a2.f.f(b2.M());
        a2.m.remove(b2.J());
        b2 = b2.J();
        if (b2 != null) {
            int n2;
            int n3 = n2 = uSa.E;
            while (n3 < b2.length) {
                a2.f.f(b2[n2++].M());
                n3 = n2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(XF xF2, Block block, int n2) {
        void b2;
        void c2;
        int d2 = n2;
        Tf_1 a2 = this;
        a2.J((XF)c2, (Block)b2, d2, uSa.E);
    }

    public boolean J(vL vL2) {
        Tf_1 a2 = this;
        Tf_1 b2 = vL2;
        if (super.J((vL)b2)) {
            a2.F.J().J(((vL)b2).la, ((vL)b2).Z, ((vL)b2).A, PRa.Y, a2.F.J(), (KC)new hda((vL)b2));
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public List<uY> J(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        Tf_1 tf_1 = this;
        ArrayList<uY> arrayList = Lists.newArrayList();
        int n9 = n8 = uSa.E;
        while (n9 < tf_1.D.size()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void e2;
            void f2;
            uY uY2 = (uY)tf_1.D.get(n8);
            Object g2 = uY2.J();
            if (g2.getX() >= f2 && g2.getY() >= e2 && g2.getZ() >= d2 && g2.getX() < c2 && g2.getY() < b2 && g2.getZ() < a2) {
                arrayList.add(uY2);
            }
            n9 = ++n8;
        }
        return arrayList;
    }
}

