/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cf
 *  Cla
 *  ERa
 *  Eoa
 *  Fc
 *  Gg
 *  Hja
 *  I
 *  Kpa
 *  MD
 *  Ola
 *  Qsa
 *  TQa
 *  XTa
 *  Ypa
 *  ZJa
 *  aKa
 *  bJa
 *  cja
 *  ez
 *  gka
 *  hy
 *  mka
 *  nka
 *  pua
 *  qla
 *  tka
 *  uKa
 *  uY
 *  uka
 *  vRa
 *  xJa
 *  xy
 */
import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.state.IBlockState;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Cla_2 {
    private boolean B;
    private final bJa[] d;
    private static ez[] a = ez.values();
    private boolean b;
    private gka l;
    private XF e;
    private boolean G;
    private final ReentrantLock D;
    private XF[] f;
    private final ReentrantLock F;
    private final Set g;
    public static int L;
    private final int E;
    private Gg m;
    private EnumMap C;
    public cja i;
    private int M;
    public xy k;
    private final ZJa j;
    private ez[] J;
    private final FloatBuffer A;
    private static final String I = "CL_00002452";

    public boolean l() {
        Cla_2 a2;
        return a2.b;
    }

    public void J(cja cja2) {
        Cla_2 b2 = cja2;
        Cla_2 a2 = this;
        a2.F.lock();
        try {
            a2.i = b2;
            return;
        }
        finally {
            a2.F.unlock();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(ez ez2, float f2, float f3, float f4, aKa aKa2, cja cja2) {
        void b2;
        Cla_2 g2;
        void f5;
        Cla_2 cla_2 = cla_22;
        Cla_2 cla_22 = cja2;
        Cla_2 a2 = cla_2;
        if (f5 == ez.TRANSLUCENT && !g2.J((ez)f5)) {
            void c2;
            void d2;
            void e2;
            void v1 = b2;
            v1.f((float)e2, (float)d2, (float)c2);
            g2.J(v1.J());
        }
        b2.J();
    }

    public boolean J(int n2) {
        int b2 = n2;
        Cla_2 a2 = this;
        if (a2.M == b2) {
            return uSa.E != 0;
        }
        a2.M = b2;
        return vRa.d != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void f(float f2, float f3, float f4, gka gka2) {
        Object object;
        Object object2;
        Hja hja2;
        void a2;
        uY uY2 = this;
        cja cja2 = new cja();
        XF xF2 = uY2.e;
        XF xF3 = xF2.add(Ypa.A, Ypa.A, Ypa.A);
        a2.J().lock();
        try {
            if (a2.J() != uka.COMPILING) {
                return;
            }
            if (uY2.m == null) {
                return;
            }
            uY uY3 = uY2;
            hja2 = uY3.J(uY3.m, xF2.add(pua.o, pua.o, pua.o), xF3.add(vRa.d, vRa.d, vRa.d), vRa.d);
            a2.J(cja2);
        }
        finally {
            a2.J().unlock();
        }
        qla qla2 = new qla();
        HashSet<uY> hashSet = Sets.newHashSet();
        if (!hja2.f()) {
            int n2;
            uY e2;
            Cf cf22;
            L += vRa.d;
            object2 = new boolean[a.length];
            object = Kpa.J().J();
            for (Cf cf22 : Cf.getAllInBoxMutable((XF)xF2, (XF)xF3)) {
                IBlockState iBlockState = hja2.J((XF)cf22);
                Block block = iBlockState.J();
                if (block.g()) {
                    qla2.J((XF)cf22);
                }
                if (iBlockState.J().a()) {
                    e2 = hja2.J(new XF((MD)cf22));
                    Ola ola2 = RKa.E.J(e2);
                    if (e2 != null && ola2 != null) {
                        cja2.J(e2);
                        if (ola2.J()) {
                            hashSet.add(e2);
                        }
                    }
                }
                uY uY4 = uY2.J;
                e2 = uY4;
                uY4[uSa.E] = block.J();
                int n3 = uSa.E;
                while (n3 < ((uY)e2).length) {
                    int n4;
                    uY uY5 = e2[n4];
                    uY5 = super.J(block, (ez)uY5);
                    int n5 = uY5.ordinal();
                    if (block.J() != hy.INVISIBLE) {
                        aKa aKa2 = a2.J().J(n5);
                        uY uY6 = uY5;
                        aKa2.J((ez)uY6);
                        if (!cja2.f((ez)uY6)) {
                            cja2.J((ez)uY5);
                            super.J(aKa2, xF2);
                        }
                        Object object3 = object2;
                        int n6 = n5;
                        object3[n6] = object3[n6] | object.J(iBlockState, (XF)cf22, (I)hja2, aKa2);
                    }
                    n3 = ++n4;
                }
            }
            cf22 = a;
            int n7 = ((Cf)cf22).length;
            int n8 = n2 = uSa.E;
            while (n8 < n7) {
                e2 = cf22[n2];
                if (object2[e2.ordinal()] != false) {
                    cja2.f((ez)e2);
                }
                if (cja2.f((ez)e2)) {
                    void b2;
                    void c2;
                    void d2;
                    if (Config.h()) {
                        Fc.l((aKa)a2.J().J((ez)e2));
                    }
                    super.J((ez)e2, (float)d2, (float)c2, (float)b2, a2.J().J((ez)e2), cja2);
                }
                n8 = ++n2;
            }
        }
        cja2.J(qla2.J());
        uY2.D.lock();
        try {
            object2 = Sets.newHashSet(hashSet);
            object = Sets.newHashSet(uY2.g);
            boolean bl = ((AbstractSet)object2).removeAll(uY2.g);
            uY uY7 = uY2;
            ((AbstractSet)object).removeAll(hashSet);
            uY2.g.clear();
            uY7.g.addAll(hashSet);
            uY7.j.J((Collection)object, (Collection)object2);
            return;
        }
        finally {
            uY2.D.unlock();
        }
    }

    public boolean f() {
        Cla_2 a2;
        return a2.G;
    }

    public void d() {
        Cla_2 a2;
        uKa.J((FloatBuffer)a2.A);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Cla_2 a2 = this;
        a2.b = b2;
        if (a2.b) {
            if (a2.J()) {
                a2.G = vRa.d;
                return;
            }
        } else {
            a2.G = uSa.E;
        }
    }

    /*
     * WARNING - void declaration
     */
    public Cla_2(Gg gg2, ZJa zJa2, XF xF2, int n2) {
        void b2;
        void a2;
        void c2;
        Cla_2 d2;
        Cla_2 e2 = gg2;
        Cla_2 cla_2 = d2 = this;
        Cla_2 cla_22 = d2;
        d2.i = cja.J;
        Cla_2 cla_23 = d2;
        cla_23.D = new ReentrantLock();
        cla_22.F = new ReentrantLock();
        cla_2.l = null;
        cla_22.g = Sets.newHashSet();
        cla_2.A = xJa.J((int)ERa.C);
        cla_2.d = new bJa[ez.values().length];
        Cla_2 cla_24 = d2;
        cla_24.M = pua.o;
        cla_24.b = vRa.d;
        cla_24.f = new XF[DZ.values().length];
        d2.J = new ez[vRa.d];
        Cla_2 cla_25 = d2;
        cla_25.B = Config.A();
        cla_25.G = uSa.E;
        cla_25.m = e2;
        d2.j = c2;
        d2.E = a2;
        if (!b2.equals((Object)d2.J())) {
            d2.J((XF)b2);
        }
        if (nka.J()) {
            int n3 = e2 = uSa.E;
            while (n3 < ez.values().length) {
                d2.d[e2++] = new bJa(mka.j);
                n3 = e2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public XF f(DZ dZ2) {
        void a2;
        Cla_2 cla_2 = this;
        int n2 = a2.getIndex();
        Object b2 = cla_2.f[n2];
        if (b2 == null) {
            Cla_2 cla_22 = cla_2;
            b2 = cla_22.J().offset((DZ)a2, ERa.C);
            cla_22.f[n2] = b2;
        }
        return b2;
    }

    public gka f() {
        Cla_2 cla_2 = this;
        cla_2.D.lock();
        try {
            Cla_2 cla_22 = cla_2;
            cla_22.C();
            Cla_2 cla_23 = cla_2;
            cla_2.l = new gka((Cla)cla_2, tka.REBUILD_CHUNK);
            Cla_2 a2 = cla_22.l;
            return a2;
        }
        finally {
            cla_2.D.unlock();
        }
    }

    /*
     * WARNING - void declaration
     */
    private ez J(Block block, ez ez2) {
        Cla_2 c2 = ez2;
        Cla_2 a2 = this;
        if (a2.B) {
            if (c2 == ez.CUTOUT) {
                void b2;
                if (b2 instanceof BlockRedstoneWire) {
                    return c2;
                }
                if (b2 instanceof BlockCactus) {
                    return c2;
                }
                return ez.CUTOUT_MIPPED;
            }
        } else if (c2 == ez.CUTOUT_MIPPED) {
            return ez.CUTOUT;
        }
        return c2;
    }

    public XF J() {
        Cla_2 a2;
        return a2.e;
    }

    public cja J() {
        Cla_2 a2;
        return a2.i;
    }

    public void C() {
        Cla_2 cla_2 = this;
        cla_2.D.lock();
        try {
            if (cla_2.l != null && cla_2.l.J() != uka.DONE) {
                cla_2.l.J();
                cla_2.l = null;
            }
            return;
        }
        finally {
            cla_2.D.unlock();
        }
    }

    public void l() {
        Cla_2 a2;
        a2.C();
        a2.i = cja.J;
    }

    public XF J(DZ dZ2) {
        Object b2 = dZ2;
        Cla_2 a2 = this;
        return a2.f((DZ)((Object)b2));
    }

    public bJa J(int n2) {
        int b2 = n2;
        Cla_2 a2 = this;
        return a2.d[b2];
    }

    public void f() {
        int a2;
        Cla_2 cla_2 = this;
        cla_2.l();
        cla_2.m = null;
        int n2 = a2 = uSa.E;
        while (n2 < ez.values().length) {
            if (cla_2.d[a2] != null) {
                cla_2.d[a2].l();
            }
            n2 = ++a2;
        }
    }

    private void J() {
        Cla_2 cla_2 = this;
        uKa.e();
        uKa.y();
        float a2 = KPa.k;
        uKa.J((float)sOa.Z, (float)sOa.Z, (float)sOa.Z);
        float f2 = a2;
        uKa.l((float)f2, (float)f2, (float)f2);
        uKa.J((float)Qsa.k, (float)Qsa.k, (float)Qsa.k);
        uKa.J((int)TQa.g, (FloatBuffer)cla_2.A);
        uKa.D();
    }

    public ReentrantLock J() {
        Cla_2 a2;
        return a2.D;
    }

    /*
     * WARNING - void declaration
     */
    public Hja J(Gg gg2, XF xF2, XF xF3, int n2) {
        void e2;
        void b2;
        void c2;
        void d2;
        int n3 = n2;
        Cla_2 a2 = this;
        return new Hja((Gg)d2, (XF)c2, (XF)b2, (int)e2);
    }

    public void J(XF xF2) {
        XF b2 = xF2;
        Cla_2 a2 = this;
        a2.l();
        a2.e = b2;
        XF xF3 = b2;
        a2.k = new xy(xF3, xF3.add(ERa.C, ERa.C, ERa.C));
        a2.J();
        int n2 = b2 = uSa.E;
        while (n2 < a2.f.length) {
            a2.f[b2++] = null;
            n2 = b2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public gka J() {
        Cla_2 cla_2 = this;
        cla_2.D.lock();
        try {
            if (cla_2.l != null && cla_2.l.J() == uka.PENDING) {
                Cla_2 a2 = null;
                return a2;
            }
            if (cla_2.l != null && cla_2.l.J() != uka.DONE) {
                cla_2.l.J();
                cla_2.l = null;
            }
            Cla_2 cla_22 = cla_2;
            cla_2.l = new gka((Cla)cla_2, tka.RESORT_TRANSPARENCY);
            cla_22.l.J(cla_2.i);
            gka gka2 = cla_22.l;
            return gka2;
        }
        finally {
            cla_2.D.unlock();
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(aKa aKa2, XF xF2) {
        void b2;
        Object c2 = xF2;
        Cla_2 a2 = this;
        void v0 = b2;
        v0.J(XTa.W, mka.j);
        v0.f((double)(-c2.getX()), (double)(-c2.getY()), (double)(-c2.getZ()));
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, gka gka2) {
        Cla_2 e2;
        Cla_2 cla_2 = cla_22;
        Cla_2 cla_22 = gka2;
        Cla_2 a2 = cla_2;
        cja cja2 = e2.J();
        if (cja2.J() != null && !cja2.J(ez.TRANSLUCENT)) {
            void b2;
            void c2;
            void d2;
            e2 = e2.J().J(ez.TRANSLUCENT);
            Cla_2 cla_23 = a2;
            cla_23.J((aKa)e2, a2.e);
            e2.J(cja2.J());
            cla_23.J(ez.TRANSLUCENT, (float)d2, (float)c2, (float)b2, (aKa)e2, cja2);
        }
    }

    private boolean J() {
        Cla_2 a2;
        if (a2.m instanceof Eoa) {
            return ((Eoa)a2.m).J();
        }
        return uSa.E != 0;
    }
}

