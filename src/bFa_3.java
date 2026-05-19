/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ABa
 *  BAa
 *  Baa
 *  Bb
 *  CZ
 *  Cta
 *  DBa
 *  Dc
 *  Dha
 *  EBa
 *  ERa
 *  Ega
 *  Epa
 *  FBa
 *  FX
 *  Faa
 *  GBa
 *  Gg
 *  HA
 *  JPa
 *  Jca
 *  Jy
 *  Kb
 *  LCa
 *  LDa
 *  MZ
 *  Mda
 *  NOa
 *  NTa
 *  OCa
 *  Oz
 *  PIa
 *  QCa
 *  QY
 *  Qea
 *  RIa
 *  Rea
 *  SCa
 *  SOa
 *  TQa
 *  Tf
 *  Tz
 *  UAa
 *  UBa
 *  UX
 *  VQa
 *  Vua
 *  WSa
 *  Waa
 *  XCa
 *  XEa
 *  aX
 *  aaa
 *  asa
 *  bFa
 *  cZ
 *  dpa
 *  fAa
 *  gZ
 *  hra
 *  iCa
 *  ica
 *  jca
 *  jea
 *  jpa
 *  kFa
 *  kba
 *  kea
 *  ld
 *  pAa
 *  pqa
 *  pua
 *  qta
 *  tba
 *  uBa
 *  uY
 *  ufa
 *  vL
 *  vRa
 *  vaa
 *  wra
 *  xA
 *  xBa
 *  yEa
 *  yQa
 *  zC
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCustomWall;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bFa_3
extends Sx
implements Bb {
    private final UX N;
    private float T;
    public final QY s;
    public int w;
    private boolean W;
    private vL q;
    private float x;
    public double K;
    private int c;
    private String B;
    private boolean d;
    private kFa b;
    public final OCa l;
    private static final Logger e = LogManager.getLogger();
    private int G;
    private final List<Integer> D;
    private long f;
    public boolean F;
    public boolean L;
    public double E;
    public final List<Baa> M;
    private int k;
    private int A;
    public XBa I;

    @Override
    public void k(int n2) {
        int b2 = n2;
        bFa_3 a2 = this;
        super.k(b2);
        a2.c = pua.o;
    }

    public void Fa() {
        bFa_3 a2;
        bFa_3 bFa_32 = a2;
        bFa_32.G.J((Sx)a2);
        a2.G = (int)bFa_32.x;
    }

    private boolean S() {
        bFa_3 a2;
        return a2.l.g();
    }

    @Override
    public void A(vL vL2) {
        bFa_3 b2 = vL2;
        bFa_3 a2 = this;
        if (a2.s.J() == Daa.SPECTATOR) {
            a2.D((vL)b2);
            return;
        }
        super.A((vL)b2);
    }

    public Tf J() {
        bFa_3 a2;
        return (Tf)a2.j;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(boolean bl2, boolean bl3, boolean bl4) {
        void b2;
        void c2;
        boolean d2 = bl4;
        bFa_3 a2 = this;
        if (a2.p()) {
            bFa_3 bFa_32 = a2;
            bFa_3 bFa_33 = a2;
            a2.J().J().J((vL)bFa_33, (KC)new EBa((vL)bFa_33, uqa.g));
        }
        bFa_3 bFa_34 = a2;
        super.J((boolean)c2, (boolean)b2, d2);
        if (bFa_34.I != null) {
            bFa_3 bFa_35 = a2;
            bFa_3 bFa_36 = a2;
            bFa_35.I.J(bFa_35.la, a2.Z, a2.A, bFa_36.X, (float)bFa_36.d);
        }
    }

    public String l() {
        bFa_3 bFa_32 = this;
        Object a2 = bFa_32.I.i.J().toString();
        Object object = a2 = ((String)a2).substring(((String)a2).indexOf(WSa.f) + vRa.d);
        a2 = ((String)object).substring(uSa.E, ((String)object).indexOf(Era.Aa));
        return a2;
    }

    @Override
    public void S() {
        bFa_3 a2;
        if (a2.I != null) {
            bFa_3 bFa_32 = a2;
            bFa_32.I.J((KC)new fAa(a2.h));
            bFa_32.R();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, boolean bl2, boolean bl3) {
        float e2 = f3;
        bFa_3 c2 = this;
        if (c2.ja != null) {
            void a2;
            void b2;
            void d2;
            if (d2 >= vqa.T && d2 <= pqa.r) {
                c2.l((float)d2);
            }
            if (e2 >= vqa.T && e2 <= pqa.r) {
                c2.M(e2);
            }
            c2.ja = b2;
            c2.i((boolean)a2);
        }
    }

    public void J(Ega ega2) {
        bFa_3 b2 = ega2;
        bFa_3 a2 = this;
        bFa_3 bFa_32 = b2;
        a2.J((Ega)bFa_32, bFa_32.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(Ega ega2, int n2, Mda mda2) {
        void c2;
        int d2 = n2;
        bFa_3 b2 = this;
        if (!(c2.J(d2) instanceof LDa) && !b2.F) {
            void a2;
            b2.I.J((KC)new tba(c2.k, d2, (Mda)a2));
        }
    }

    public void ba() {
        a.f = OCa.J();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v() {
        bFa_3 a2;
        bFa_3 bFa_32 = this;
        try {
            block15: {
                block14: {
                    bFa_3 bFa_33;
                    int n2;
                    int n3;
                    super.d();
                    int n4 = n3 = uSa.E;
                    while (n4 < bFa_32.K.f()) {
                        KC kC2;
                        a2 = bFa_32.K.J(n3);
                        if (a2 != null && a2.J().e() && (kC2 = ((SCa)a2.J()).J((Mda)a2, bFa_32.j, (Sx)bFa_32)) != null) {
                            bFa_32.I.J(kC2);
                        }
                        n4 = ++n3;
                    }
                    if (bFa_32.f() != bFa_32.x) break block14;
                    bFa_3 bFa_34 = bFa_32;
                    if (bFa_34.k != bFa_34.e.J()) break block14;
                    if (bFa_32.e.J() == JPa.N) {
                        n2 = vRa.d;
                        bFa_33 = bFa_32;
                    } else {
                        n2 = uSa.E;
                        bFa_33 = bFa_32;
                    }
                    if (n2 == bFa_33.W) break block15;
                }
                bFa_3 bFa_35 = bFa_32;
                bFa_35.I.J((KC)new iCa(bFa_32.f(), bFa_32.e.J(), bFa_32.e.J()));
                bFa_35.x = bFa_35.f();
                bFa_35.k = bFa_35.e.J();
                bFa_35.W = bFa_35.e.J() == JPa.N ? vRa.d : uSa.E;
                int n5 = bFa_35.W ? 1 : 0;
            }
            if (bFa_32.f() + bFa_32.A() != bFa_32.T) {
                Iterator iterator;
                bFa_3 bFa_36 = bFa_32;
                bFa_32.T = bFa_32.f() + bFa_36.A();
                Iterator iterator2 = iterator = bFa_36.J().J(lb.m).iterator();
                while (iterator2.hasNext()) {
                    a2 = (ica)iterator.next();
                    Sx[] sxArray = new Sx[vRa.d];
                    sxArray[uSa.E] = bFa_32;
                    bFa_32.J().J(bFa_32.J(), (ica)a2).J(Arrays.asList(sxArray));
                    iterator2 = iterator;
                }
            }
            bFa_3 bFa_37 = bFa_32;
            if (bFa_37.Aa != bFa_37.c) {
                bFa_3 bFa_38 = bFa_32;
                bFa_38.c = bFa_38.Aa;
                bFa_3 bFa_39 = bFa_32;
                bFa_38.I.J((KC)new vaa((float)bFa_39.A, bFa_39.Aa, bFa_32.j));
            }
            if (bFa_32.g % kTa.j * tTa.h != 0) return;
            if (bFa_32.J().f(mY.I)) return;
            bFa_32.V();
            return;
        }
        catch (Throwable throwable) {
            a2 = RIa.J((Throwable)throwable, (String)jpa.Q);
            Dha dha = a2.J(Fua.Aa);
            bFa_32.J(dha);
            throw new MZ((RIa)a2);
        }
    }

    public void J(ld ld2) {
        bFa_3 b2 = ld2;
        bFa_3 a2 = this;
        a2.I.J((KC)new XCa((ld)b2));
    }

    public void f(int n2) {
        bFa_3 bFa_32;
        int b2 = n2;
        bFa_3 a2 = this;
        if (a2.Ha == vRa.d && b2 == vRa.d) {
            bFa_3 bFa_33 = a2;
            bFa_33.J((aX)mY.L);
            bFa_33.j.C((vL)a2);
            a2.L = vRa.d;
            bFa_33.I.J((KC)new FBa(AQa.P, JPa.N));
            return;
        }
        if (a2.Ha == 0 && b2 == vRa.d) {
            bFa_3 bFa_34 = a2;
            bFa_34.J((aX)mY.k);
            XF xF2 = bFa_34.l.J(b2).f();
            if (xF2 != null) {
                a2.I.J(xF2.getX(), xF2.getY(), xF2.getZ(), JPa.N, JPa.N);
            }
            b2 = vRa.d;
            bFa_32 = a2;
        } else {
            bFa_3 bFa_35 = a2;
            bFa_32 = bFa_35;
            bFa_35.J((aX)mY.f);
        }
        bFa_32.l.J().J((bFa)a2, b2);
        bFa_3 bFa_36 = a2;
        bFa_36.c = pua.o;
        bFa_36.x = vqa.T;
        bFa_36.k = pua.o;
    }

    @Override
    public void J(HA hA2) {
        bFa_3 bFa_32;
        zC zC2;
        bFa_3 a2;
        bFa_3 b2 = hA2;
        bFa_3 bFa_33 = a2 = this;
        if (bFa_33.G != bFa_33.x) {
            a2.r();
        }
        if (b2 instanceof zC && (zC2 = (zC)b2).l() && !a2.J(zC2.J()) && !a2.t()) {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = b2.J();
            a2.I.J((KC)new XCa((ld)new CZ(VQa.b, objectArray), (byte)uqa.g));
            a2.I.J((KC)new ABa(SOa.z, a2.la, a2.Z, (double)a2.A, pqa.r, pqa.r));
            return;
        }
        a2.X();
        if (b2 instanceof xA) {
            a2.I.J((KC)new Jca(a2.G, ((xA)b2).f(), b2.J(), b2.f()));
            a2.G = (int)((xA)b2).J((kea)a2.K, (Sx)a2);
            bFa_32 = a2;
        } else {
            bFa_3 bFa_34 = a2;
            bFa_32 = bFa_34;
            bFa_34.I.J((KC)new Jca(a2.G, qta.x, b2.J(), b2.f()));
            bFa_3 bFa_35 = a2;
            a2.G = (int)new Qea((HA)a2.K, (HA)b2, (Sx)a2);
        }
        bFa_32.G.k = a2.G;
        a2.G.f((Bb)a2);
    }

    public void F(vL vL2) {
        bFa_3 b2 = vL2;
        bFa_3 a2 = this;
        if (b2 instanceof Sx) {
            int[] nArray = new int[vRa.d];
            nArray[uSa.E] = b2.M();
            a2.I.J((KC)new QCa(nArray));
            return;
        }
        a2.D.add(b2.M());
    }

    public ld f() {
        return null;
    }

    private void J(uY uY2) {
        Object b2 = uY2;
        bFa_3 a2 = this;
        if (b2 != null && (b2 = b2.J()) != null) {
            a2.I.J((KC)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(aX aX2, int n2) {
        Object c2 = aX2;
        bFa_3 b2 = this;
        if (c2 != null) {
            void a2;
            bFa_3 bFa_32 = b2;
            b2.N.J((Sx)bFa_32, (aX)c2, (int)a2);
            c2 = bFa_32.J().J(c2.J()).iterator();
            Object object = c2;
            while (object.hasNext()) {
                ica ica2 = (ica)c2.next();
                object = c2;
                b2.J().J(b2.J(), ica2).f((int)a2);
            }
            if (b2.N.J()) {
                b2.N.f((bFa)b2);
            }
        }
    }

    @Override
    public void r() {
        bFa_3 a2;
        bFa_3 bFa_32 = a2;
        bFa_32.I.J(new nCa(a2.G.k));
        bFa_32.Fa();
    }

    public void m() {
        bFa_3 a2;
        bFa_3 bFa_32 = a2;
        super.m();
        bFa_32.I.J((KC)new UBa(a2.J(), uBa.ENTER_COMBAT));
    }

    public void C(double c2, double b2, double a2) {
        bFa_3 d2;
        bFa_3 bFa_32 = d2;
        d2.I.J(c2, b2, a2, bFa_32.X, (float)bFa_32.d);
    }

    @Override
    public boolean t() {
        bFa_3 a2;
        if (a2.s.J() == Daa.SPECTATOR) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void o() {
        bFa_3 a2;
        bFa_3 bFa_32 = a2;
        super.o();
        bFa_32.I.J((KC)new UBa(a2.J(), uBa.END_COMBAT));
    }

    @Override
    public boolean J(Sx sx2) {
        Sx b2 = sx2;
        bFa_3 a2 = this;
        if (!a2.S()) {
            return uSa.E != 0;
        }
        return super.J(b2);
    }

    @Override
    public void t() {
        bFa_3 a2;
        bFa_3 bFa_32 = a2;
        bFa_32.I.J(new tAa((vL)a2, (byte)WOa.fa));
        super.t();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Mda mda2, int n2) {
        void a2;
        bFa_3 c2 = mda2;
        bFa_3 b2 = this;
        bFa_3 bFa_32 = c2;
        super.f((Mda)bFa_32, (int)a2);
        if (bFa_32 != null && c2.J() != null && c2.J().J((Mda)c2) == YFa.EAT) {
            bFa_3 bFa_33 = b2;
            bFa_3 bFa_34 = b2;
            b2.J().J().J((vL)bFa_34, (KC)new EBa((vL)bFa_34, yRa.d));
        }
    }

    public void O() {
        bFa_3 a2;
        a2.G.f((Bb)a2);
    }

    @Override
    public void J(Mda mda2) {
        bFa_3 b2 = mda2;
        bFa_3 a2 = this;
        if (b2.J() == Gea.sb) {
            a2.I.J(new Cda(yRa.m, new Lca(Unpooled.buffer())));
        }
    }

    public void T() {
        a.x = pua.Da;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Ega ega2, List<Mda> list) {
        void b2;
        bFa_3 a2;
        Object c2 = list;
        bFa_3 bFa_32 = a2 = this;
        bFa_32.I.J(new zBa(b2.k, (List<Mda>)c2));
        bFa_32.I.J((KC)new tba(pua.o, pua.o, a2.K.J()));
    }

    public boolean J(bFa bFa2) {
        bFa_3 b2 = bFa2;
        bFa_3 a2 = this;
        if (b2.t()) {
            if (a2.f() == a2) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        if (a2.t()) {
            return uSa.E != 0;
        }
        return super.J((bFa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void l(vL vL2) {
        void a2;
        bFa_3 bFa_32;
        bFa_3 bFa_33 = bFa_32 = this;
        bFa_3 b2 = bFa_33.ja;
        super.l((vL)a2);
        if (a2 != b2) {
            bFa_3 bFa_34 = bFa_32;
            bFa_3 bFa_35 = bFa_32;
            bFa_34.I.J(new Bca(uSa.E, (vL)bFa_35, bFa_35.ja));
            bFa_3 bFa_36 = bFa_32;
            bFa_34.I.J(bFa_32.la, bFa_32.Z, bFa_32.A, bFa_36.X, (float)bFa_36.d);
        }
    }

    public void J(UAa uAa2) {
        bFa_3 b2 = uAa2;
        bFa_3 a2 = this;
        bFa_3 bFa_32 = b2;
        a2.B = bFa_32.J();
        a2.b = bFa_32.J();
        a2.d = b2.J();
        a2.J().J(NTa.C, Byte.valueOf((byte)b2.J()));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, String string) {
        Object c2 = string;
        bFa_3 a2 = this;
        if (Epa.h.equals(c2) && !a2.l.a()) {
            return vRa.d != 0;
        }
        if (!(DPa.Da.equals(c2) || TQa.S.equals(c2) || wra.Da.equals(c2) || Ira.M.equals(c2))) {
            if (a2.l.J().f(a2.J())) {
                void b2;
                c2 = (cZ)a2.l.J().J().J((Object)a2.J());
                if (c2 != null) {
                    if (c2.J() >= b2) {
                        return vRa.d != 0;
                    }
                    return uSa.E != 0;
                }
                if (a2.l.f() >= b2) {
                    return vRa.d != 0;
                }
                return uSa.E != 0;
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    public UX J() {
        bFa_3 a2;
        return a2.N;
    }

    @Override
    public void J(gZ gZ2) {
        Object object;
        bFa_3 bFa_32;
        bFa_3 a2;
        Object b2;
        block7: {
            block4: {
                block5: {
                    block6: {
                        b2 = gZ2;
                        a2 = this;
                        if (!a2.j.J().f(Vua.C)) break block4;
                        b2 = a2.J();
                        if (b2 == null || b2.f() == xBa.ALWAYS) break block5;
                        if (b2.f() != xBa.HIDE_FOR_OTHER_TEAMS) break block6;
                        bFa_3 bFa_33 = a2;
                        bFa_32 = bFa_33;
                        a2.l.J().f(bFa_33, bFa_33.J().J());
                        break block7;
                    }
                    if (b2.f() != xBa.HIDE_FOR_OWN_TEAM) break block4;
                    bFa_3 bFa_34 = a2;
                    bFa_32 = bFa_34;
                    a2.l.J().J(bFa_34, bFa_34.J().J());
                    break block7;
                }
                a2.l.J().J(a2.J().J());
            }
            bFa_32 = a2;
        }
        if (!bFa_32.j.J().f(STa.b)) {
            a2.K.J();
        }
        b2 = a2.j.J().J(lb.M).iterator();
        Object object2 = b2;
        while (object2.hasNext()) {
            object = (ica)b2.next();
            object2 = b2;
            a2.J().J(a2.J(), object).J();
        }
        b2 = a2.l();
        if (b2 != null) {
            object = (oia)PIa.k.get(PIa.J((vL)b2));
            if (object != null) {
                a2.J(object.k);
            }
            bFa_3 bFa_35 = a2;
            b2.J((vL)bFa_35, bFa_35.Q);
        }
        bFa_3 bFa_36 = a2;
        bFa_36.J(Tz.K);
        bFa_36.f(Tz.Y);
        bFa_36.J().l();
    }

    @Override
    public void G(vL vL2) {
        bFa_3 a2;
        bFa_3 b2 = vL2;
        a2.J().J().J((vL)(a2 = this), (KC)new EBa((vL)b2, AQa.P));
    }

    public kFa J() {
        bFa_3 a2;
        return a2.b;
    }

    @Override
    public void J(xA xA2) {
        bFa_3 a2;
        bFa_3 b2 = xA2;
        bFa_3 bFa_32 = a2 = this;
        a2.X();
        bFa_32.I.J((KC)new Jca(a2.G, b2.f(), b2.J()));
        bFa_32.G = (int)b2.J((kea)bFa_32.K, a2);
        bFa_3 bFa_33 = a2;
        bFa_32.G.k = bFa_33.G;
        bFa_33.G.f((Bb)a2);
    }

    public void R() {
        bFa_3 bFa_32;
        bFa_3 a2;
        if (a2.t()) {
            bFa_3 bFa_33 = a2;
            bFa_32 = bFa_33;
            bFa_33.E();
            bFa_33.J(vRa.d != 0);
        } else {
            bFa_3 bFa_34 = a2;
            bFa_32 = bFa_34;
            super.R();
        }
        bFa_32.J().J().f((bFa)a2);
    }

    @Override
    public void d() {
        vL vL2;
        Object object;
        Object object2;
        bFa_3 bFa_32;
        bFa_3 bFa_33 = bFa_32 = this;
        bFa_33.s.f();
        bFa_33.A -= vRa.d;
        if (bFa_33.Fa > 0) {
            bFa_32.Fa -= vRa.d;
        }
        bFa_3 bFa_34 = bFa_32;
        bFa_34.G.J();
        if (!bFa_34.j.e && !bFa_32.G.J((Sx)bFa_32)) {
            bFa_3 bFa_35 = bFa_32;
            bFa_35.r();
            bFa_35.G = (int)bFa_35.x;
        }
        bFa_3 bFa_36 = bFa_32;
        while (!bFa_36.D.isEmpty()) {
            bFa_3 bFa_37 = bFa_32;
            int n2 = Math.min(bFa_37.D.size(), vqa.F);
            object2 = new int[n2];
            object = bFa_37.D.iterator();
            int a2 = uSa.E;
            Object object3 = object;
            while (object3.hasNext() && a2 < n2) {
                object2[a2++] = (Integer)object.next();
                Object object4 = object;
                object3 = object4;
                object4.remove();
            }
            bFa_3 bFa_38 = bFa_32;
            bFa_36 = bFa_38;
            bFa_38.I.J((KC)new QCa((int[])object2));
        }
        if (!bFa_32.M.isEmpty()) {
            uY uY2;
            Object a2;
            ArrayList<Faa> arrayList = Lists.newArrayList();
            object2 = bFa_32.M.iterator();
            object = Lists.newArrayList();
            while (object2.hasNext() && arrayList.size() < NTa.C) {
                a2 = (Baa)object2.next();
                if (a2 != null) {
                    if (!bFa_32.j.F(new XF(((Baa)a2).j << AQa.P, uSa.E, ((Baa)a2).A << AQa.P))) continue;
                    Object object5 = a2;
                    uY2 = bFa_32.j.J(((Baa)object5).j, ((Baa)object5).A);
                    if (!uY2.l()) continue;
                    arrayList.add((Faa)uY2);
                    object.addAll(((Tf)bFa_32.j).J(((Baa)a2).j * ERa.C, uSa.E, ((Baa)a2).A * ERa.C, ((Baa)a2).j * ERa.C + ERa.C, hra.Ja, ((Baa)a2).A * ERa.C + ERa.C));
                    object2.remove();
                    continue;
                }
                object2.remove();
            }
            if (!arrayList.isEmpty()) {
                Object object6;
                if (arrayList.size() == vRa.d) {
                    bFa_32.I.J((KC)new DBa((Faa)arrayList.get(uSa.E), vRa.d != 0, yQa.j));
                    object6 = object;
                } else {
                    bFa_32.I.J(new VCa(arrayList));
                    object6 = object;
                }
                a2 = object6.iterator();
                Object object7 = a2;
                while (object7.hasNext()) {
                    uY2 = (uY)a2.next();
                    object7 = a2;
                    bFa_32.J(uY2);
                }
                a2 = arrayList.iterator();
                Object object8 = a2;
                while (object8.hasNext()) {
                    uY2 = (Faa)a2.next();
                    object8 = a2;
                    bFa_32.J().J().J((bFa)bFa_32, (Faa)uY2);
                }
            }
        }
        if ((vL2 = bFa_32.f()) != bFa_32) {
            bFa_3 bFa_39 = bFa_32;
            if (!vL2.K()) {
                bFa_39.D((vL)bFa_32);
                return;
            }
            vL vL3 = vL2;
            bFa_39.l(vL2.la, vL2.Z, vL2.A, vL3.X, vL3.d);
            bFa_3 bFa_310 = bFa_32;
            bFa_32.l.J().J((bFa)bFa_310);
            if (bFa_310.q()) {
                bFa_3 bFa_311 = bFa_32;
                bFa_311.D((vL)bFa_311);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        void b2;
        Object c2 = string2;
        bFa_3 a2 = this;
        a2.I.J(new OBa((String)b2, (String)c2));
    }

    private void X() {
        bFa_3 a2;
        a2.G = a2.G % ySa.T + vRa.d;
    }

    public void V() {
        bFa_3 bFa_32;
        bFa_3 bFa_33 = bFa_32 = this;
        Object object = bFa_33.j.J((XF)new XF((int)Oz.f((double)bFa_32.la), (int)uSa.E, (int)Oz.f((double)bFa_32.A))).Ma;
        Object a2 = (FX)bFa_33.J().J((aX)mY.I);
        if (a2 == null) {
            a2 = (FX)bFa_32.J().J((aX)mY.I, (Kb)new FX());
        }
        a2.add(object);
        if (bFa_32.J().J(mY.I) && a2.size() >= Jy.ba.size()) {
            Object object2;
            block5: {
                object = Sets.newHashSet(Jy.ba);
                a2 = a2.iterator();
                while (a2.hasNext()) {
                    String string = (String)a2.next();
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        if (!((Jy)iterator.next()).Ma.equals(string)) continue;
                        iterator.remove();
                    }
                    if (!object.isEmpty()) continue;
                    object2 = object;
                    break block5;
                }
                object2 = object;
            }
            if (object2.isEmpty()) {
                bFa_32.J((aX)mY.I);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(gZ gZ2, float f2) {
        void a2;
        int c22;
        void b2;
        bFa_3 bFa_32 = this;
        if (bFa_32.J((gZ)b2)) {
            return uSa.E != 0;
        }
        int n2 = c22 = bFa_32.l.a() && bFa_32.S() && xra.E.equals(b2.d) ? vRa.d : uSa.E;
        if (c22 == 0 && bFa_32.A > 0 && b2 != gZ.c) {
            return uSa.E != 0;
        }
        if (b2 instanceof GX) {
            vL c22 = b2.f();
            if (c22 instanceof Sx && !bFa_32.J((Sx)c22)) {
                return uSa.E != 0;
            }
            if (c22 instanceof jea) {
                c22 = (jea)c22;
                if (c22.f instanceof Sx && !bFa_32.J((Sx)c22.f)) {
                    return uSa.E != 0;
                }
            }
        }
        return super.J((gZ)b2, (float)a2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Sx sx2, boolean bl2) {
        void a2;
        bFa_3 b2;
        Sx c2 = sx2;
        bFa_3 bFa_32 = b2 = this;
        super.J(c2, (boolean)a2);
        bFa_32.c = pua.o;
        bFa_32.x = vqa.T;
        bFa_32.k = pua.o;
        bFa_32.D.addAll(c2.D);
    }

    @Override
    public void f(Waa waa2) {
        bFa_3 b2 = waa2;
        bFa_3 a2 = this;
        bFa_3 bFa_32 = b2;
        super.f((Waa)bFa_32);
        bFa_32.J(Cta.Ga, a2.s.J().getID());
    }

    public void J(double d2, boolean bl2, Block block, XF xF2) {
        bFa_3 bFa_32 = object;
        Object object = xF2;
        bFa_3 a2 = bFa_32;
    }

    @Override
    public void f(ld ld2) {
        bFa_3 b2 = ld2;
        bFa_3 a2 = this;
        a2.I.J((KC)new XCa((ld)b2));
    }

    /*
     * WARNING - void declaration
     */
    public void D(vL vL2) {
        void a2;
        bFa_3 bFa_32 = this;
        bFa_3 b2 = bFa_32.f();
        Object object = bFa_32.q = a2 == null ? bFa_32 : a2;
        if (b2 != bFa_32.q) {
            bFa_3 bFa_33 = bFa_32;
            bFa_33.I.J((KC)new pAa(bFa_32.q));
            bFa_3 bFa_34 = bFa_32;
            bFa_34.C(bFa_33.q.la, bFa_34.q.Z, bFa_32.q.A);
        }
    }

    public void N() {
        bFa_3 a2;
        if (a2.Aa != null) {
            a2.Aa.l((vL)a2);
        }
        if (a2.R) {
            a2.J(vRa.d != 0, uSa.E != 0, uSa.E != 0);
        }
    }

    @Override
    public void J(Daa daa2) {
        bFa_3 bFa_32;
        bFa_3 a2;
        Daa b2 = daa2;
        bFa_3 bFa_33 = a2 = this;
        Daa daa3 = b2;
        bFa_33.s.f(daa3);
        bFa_33.I.J((KC)new FBa(yRa.d, (float)b2.getID()));
        if (daa3 == Daa.SPECTATOR) {
            a2.l((vL)null);
            bFa_32 = a2;
        } else {
            bFa_3 bFa_34 = a2;
            bFa_32 = bFa_34;
            bFa_34.D((vL)bFa_34);
        }
        bFa_32.S();
        a2.Y();
    }

    @Override
    public void D(int n2) {
        int b2 = n2;
        bFa_3 a2 = this;
        super.D(b2);
        a2.c = pua.o;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Ega ega2, HA hA2) {
        void a2;
        int c2;
        bFa_3 bFa_32 = this;
        int n2 = c2 = uSa.E;
        while (n2 < a2.J()) {
            void b2;
            int n3 = c2++;
            bFa_32.I.J((KC)new GBa(b2.k, n3, a2.J(n3)));
            n2 = c2;
        }
    }

    @Override
    public ufa J(XF xF2) {
        bFa_3 a2 = this;
        Object b2 = xF2;
        ufa ufa2 = super.J((XF)((Object)b2));
        if (ufa2 == ufa.OK) {
            b2 = new LCa((Sx)a2, (XF)((Object)b2));
            bFa_3 bFa_32 = a2;
            bFa_3 bFa_33 = a2;
            bFa_32.J().J().f((vL)bFa_33, (KC)b2);
            bFa_3 bFa_34 = a2;
            bFa_32.I.J(a2.la, a2.Z, a2.A, bFa_34.X, (float)bFa_34.d);
            bFa_33.I.J((KC)b2);
        }
        return ufa2;
    }

    @Override
    public void k(vL vL2) {
        bFa_3 a2;
        bFa_3 b2 = vL2;
        a2.J().J().J((vL)(a2 = this), (KC)new EBa((vL)b2, tTa.h));
    }

    @Override
    public void f(aX aX2) {
        Object b2 = aX2;
        bFa_3 a2 = this;
        if (b2 != null) {
            bFa_3 bFa_32 = a2;
            a2.N.f((Sx)bFa_32, (aX)b2, uSa.E);
            b2 = bFa_32.J().J(b2.J()).iterator();
            Object object = b2;
            while (object.hasNext()) {
                ica ica2 = (ica)b2.next();
                object = b2;
                a2.J().J(a2.J(), ica2).J(uSa.E);
            }
            if (a2.N.J()) {
                a2.N.f((bFa)a2);
            }
        }
    }

    public void l(kba kba2) {
        bFa_3 a2;
        bFa_3 b2 = kba2;
        bFa_3 bFa_32 = a2 = this;
        super.l((kba)b2);
        bFa_32.I.J(new cCa(a2.M(), (kba)b2));
    }

    public long J() {
        bFa_3 a2;
        return a2.f;
    }

    @Override
    public void J(Waa waa2) {
        bFa_3 b2 = waa2;
        bFa_3 a2 = this;
        bFa_3 bFa_32 = b2;
        super.J((Waa)bFa_32);
        if (bFa_32.J(Cta.Ga, zOa.v)) {
            if (OCa.J().c()) {
                a2.s.f(OCa.J().J());
                return;
            }
            a2.s.f(Daa.getByID(b2.J(Cta.Ga)));
        }
    }

    public void W() {
        bFa_3 a2;
        if (!a2.F) {
            a2.I.J((KC)new tba(pua.o, pua.o, a2.K.J()));
        }
    }

    public void f(kba kba2) {
        bFa_3 a2;
        bFa_3 b2 = kba2;
        bFa_3 bFa_32 = a2 = this;
        super.f((kba)b2);
        bFa_32.I.J((KC)new jca(a2.M(), (kba)b2));
    }

    /*
     * WARNING - void declaration
     */
    public void f(vL vL2, int n2) {
        void b2;
        bFa_3 a2;
        int c2 = n2;
        bFa_3 bFa_32 = a2 = this;
        super.f((vL)b2, c2);
        bFa_32.G.J();
    }

    public vL f() {
        bFa_3 a2;
        if (a2.q == null) {
            return a2;
        }
        return a2.q;
    }

    @Override
    public void J(aaa aaa2) {
        bFa_3 a2;
        bFa_3 b2 = aaa2;
        bFa_3 bFa_32 = a2 = this;
        b2.J(bFa_32);
        bFa_32.I.J((KC)new BAa(b2.J()));
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, boolean bl2) {
        void a2;
        void b2;
        Block block;
        int n2;
        int n3;
        bFa_3 bFa_32;
        bFa_3 bFa_33 = bFa_32 = this;
        int c22 = Oz.f((double)bFa_33.la);
        XF c22 = new XF(c22, n3 = Oz.f((double)(bFa_33.Z - Bua.Ia)), n2 = Oz.f((double)bFa_33.A));
        Block block2 = bFa_33.j.J(c22).J();
        if (block2.J() == Material.air && ((block = bFa_32.j.J(c22.down()).J()) instanceof BlockFence || BlockCustomWall.WALL_BLOCKS.contains(block) || block instanceof BlockFenceGate)) {
            c22 = c22.down();
            block2 = bFa_32.j.J(c22).J();
        }
        super.J((double)b2, (boolean)a2, block2, c22);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Ega ega2, int n2, int n3) {
        void b2;
        void c2;
        int d2 = n3;
        bFa_3 a2 = this;
        a2.I.J((KC)new GBa(c2.k, (int)b2, d2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Rea rea2, HA hA2) {
        void b2;
        bFa_3 a2;
        bFa_3 c2 = hA2;
        bFa_3 bFa_32 = a2 = this;
        if (bFa_32.G != bFa_32.x) {
            a2.r();
        }
        bFa_3 bFa_33 = a2;
        bFa_33.X();
        bFa_33.I.J((KC)new Jca(a2.G, fqa.S, c2.J(), c2.f(), b2.M()));
        bFa_3 bFa_34 = a2;
        bFa_33.G.k = a2.G = (int)new XEa((HA)a2.K, (HA)c2, (Rea)b2, (Sx)a2);
        bFa_33.G.f((Bb)a2);
    }

    public XF J() {
        bFa_3 a2;
        return new XF(a2.la, a2.Z + kTa.B, (double)a2.A);
    }

    /*
     * WARNING - void declaration
     */
    public bFa_3(OCa oCa2, Tf tf2, GameProfile gameProfile, QY qY2) {
        void d2;
        bFa_3 e22;
        XF b2;
        void c2;
        bFa_3 bFa_32 = bFa_33;
        bFa_3 bFa_33 = qY2;
        bFa_3 a2 = bFa_32;
        void v1 = c2;
        bFa_3 bFa_34 = a2;
        super((Gg)c2, (GameProfile)((Object)b2));
        a2.B = NOa.h;
        a2.M = Lists.newLinkedList();
        a2.D = Lists.newLinkedList();
        a2.T = CRa.V;
        a2.x = pua.Da;
        a2.k = asa.C;
        a2.W = vRa.d;
        a2.c = asa.C;
        a2.A = Psa.M;
        a2.d = vRa.d;
        a2.f = System.currentTimeMillis();
        bFa_34.q = null;
        ((QY)e22).J = a2;
        bFa_34.s = e22;
        b2 = v1.J();
        if (!v1.F.f() && c2.J().J() != Daa.ADVENTURE) {
            int e22 = Math.max(tTa.h, d2.A() - uua.p);
            int n2 = Oz.f((double)c2.J().J(b2.getX(), b2.getZ()));
            if (n2 < e22) {
                e22 = n2;
            }
            if (n2 <= vRa.d) {
                e22 = vRa.d;
            }
            b2 = c2.f(b2.add(a2.R.nextInt(e22 * uqa.g) - e22, uSa.E, a2.R.nextInt(e22 * uqa.g) - e22));
        }
        bFa_3 bFa_35 = a2;
        bFa_35.l = d2;
        bFa_35.N = d2.J().J(a2);
        bFa_35.Ka = JPa.N;
        a2.J(b2, JPa.N, JPa.N);
        void v4 = c2;
        while (true) {
            bFa_3 bFa_36 = a2;
            if (v4.J((vL)bFa_36, bFa_36.J()).isEmpty() || !(a2.Z < pqa.o)) break;
            v4 = c2;
            bFa_3 bFa_37 = a2;
            bFa_37.l(a2.la, bFa_37.Z + oua.i, a2.A);
        }
    }

    @Override
    public void J(Dc dc2) {
        bFa_3 a2;
        bFa_3 b2 = dc2;
        bFa_3 bFa_32 = a2 = this;
        bFa_32.X();
        bFa_3 bFa_33 = a2;
        bFa_32.G = (int)new yEa((kea)a2.K, (Dc)b2, a2.j);
        bFa_33.G.k = a2.G;
        bFa_32.G.f((Bb)a2);
        Object object = ((yEa)bFa_32.G).J();
        bFa_3 bFa_34 = b2;
        b2 = bFa_34.J();
        bFa_3 bFa_35 = a2;
        bFa_35.I.J((KC)new Jca(a2.G, zua.M, (ld)b2, object.f()));
        b2 = bFa_34.J(bFa_35);
        if (b2 != null) {
            object = new Lca(Unpooled.buffer());
            object.writeInt(a2.G);
            b2.writeToBuf((Lca)object);
            a2.I.J(new Cda(dpa.l, (Lca)object));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(kba kba2, boolean bl2) {
        void a2;
        bFa_3 b2;
        bFa_3 c2 = kba2;
        bFa_3 bFa_32 = b2 = this;
        super.J((kba)c2, (boolean)a2);
        bFa_32.I.J(new cCa(b2.M(), (kba)c2));
    }
}

