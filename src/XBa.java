/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ata
 *  Bpa
 *  CAa
 *  CY
 *  CZ
 *  Cta
 *  Ega
 *  FCa
 *  FPa
 *  Gba
 *  Gda
 *  Gg
 *  HA
 *  JAa
 *  JCa
 *  JPa
 *  JQa
 *  KBa
 *  LAa
 *  LBa
 *  Lba
 *  Lda
 *  Lra
 *  MZ
 *  Mda
 *  NCa
 *  NOa
 *  NQa
 *  NTa
 *  OCa
 *  Qba
 *  Qsa
 *  Qta
 *  RBa
 *  RGa
 *  RIa
 *  Rba
 *  Rea
 *  SOa
 *  Tf
 *  UAa
 *  Vca
 *  Vua
 *  WBa
 *  WSa
 *  WTa
 *  Waa
 *  XCa
 *  Yra
 *  ZOa
 *  aA
 *  aSa
 *  aX
 *  aaa
 *  ay
 *  bFa
 *  bba
 *  cBa
 *  cX
 *  caa
 *  cra
 *  dCa
 *  dca
 *  fA
 *  gAa
 *  gBa
 *  hca
 *  ida
 *  jFa
 *  jea
 *  jpa
 *  kFa
 *  kPa
 *  kea
 *  kta
 *  lba
 *  ld
 *  mAa
 *  mBa
 *  nQa
 *  nca
 *  pY
 *  pqa
 *  pua
 *  qBa
 *  qta
 *  rd
 *  sca
 *  tBa
 *  tba
 *  tca
 *  uOa
 *  uQa
 *  uRa
 *  uY
 *  vL
 *  vRa
 *  wba
 *  wca
 *  xy
 *  yAa
 *  yEa
 *  yra
 *  ysa
 *  zEa
 */
import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.util.concurrent.Futures;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import net.minecraft.block.material.Material;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class XBa
implements fA,
rd {
    private static final Logger l = LogManager.getLogger();
    private int e;
    private long G;
    private int D;
    private int f;
    private double F;
    private int g;
    private OX<Short> L;
    private long E;
    private double m;
    private final OCa C;
    public final uba i;
    private boolean M;
    private boolean k;
    private int j;
    private double J;
    public bFa A;
    private int I;

    public void J(YAa yAa) {
        XBa a2;
        Iterator b2 = yAa;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        ArrayList<String> arrayList = Lists.newArrayList();
        XBa xBa3 = a2;
        Iterator iterator = b2 = xBa3.C.J((u)xBa3.A, ((YAa)((Object)b2)).J(), ((YAa)((Object)b2)).J()).iterator();
        while (iterator.hasNext()) {
            String string = (String)b2.next();
            iterator = b2;
            arrayList.add(string);
        }
        ArrayList<String> arrayList2 = arrayList;
        a2.A.I.J((KC)new LAa(arrayList2.toArray(new String[arrayList2.size()])));
    }

    public void J(KBa kBa2) {
        ld[] a2;
        XBa xBa2;
        XBa xBa3 = xBa2 = this;
        void v1 = a2;
        XBa xBa4 = xBa2;
        Vaa.J(v1, xBa4, (c)xBa4.A.J());
        xBa3.A.ba();
        Tf tf = xBa3.C.J(xBa2.A.Ha);
        XF xF = v1.J();
        if (tf.F(xF)) {
            int n2;
            XBa b2 = tf.J(xF);
            if (!(b2 instanceof aaa)) {
                return;
            }
            if (!(b2 = (aaa)b2).J() || b2.J() != xBa2.A) {
                xBa2.C.d(new StringBuilder().insert(2 & 5, FRa.t).append(xBa2.A.J()).append(SOa.S).toString());
                return;
            }
            a2 = a2.J();
            int n3 = n2 = uSa.E;
            while (n3 < a2.length) {
                int n4 = n2;
                CY cY2 = new CY(pY.getTextWithoutFormattingCodes((String)a2[n2].f()));
                ((aaa)b2).J[n4] = cY2;
                n3 = ++n2;
            }
            b2.f();
            tf.C(xF);
        }
    }

    public void J(nca nca2) {
        XBa a2;
        XBa b2 = nca2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        xBa2.A.Fa();
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3, Set<WAa> set) {
        void b2;
        void c2;
        Set<WAa> g2;
        void d5;
        void e2;
        void f4;
        XBa a2;
        XBa xBa2 = set2;
        Set<WAa> set2 = set;
        XBa xBa3 = a2 = xBa2;
        XBa xBa4 = a2;
        xBa4.M = uSa.E;
        xBa4.J = f4;
        xBa3.m = e2;
        xBa3.F = d5;
        if (g2.contains((Object)WAa.X)) {
            a2.J += a2.A.la;
        }
        if (g2.contains((Object)WAa.Y)) {
            a2.m += a2.A.Z;
        }
        if (g2.contains((Object)WAa.Z)) {
            a2.F += a2.A.A;
        }
        void var10_7 = c2;
        void var11_8 = b2;
        if (g2.contains((Object)WAa.Y_ROT)) {
            var10_7 = c2 + a2.A.X;
        }
        if (g2.contains((Object)WAa.X_ROT)) {
            var11_8 = b2 + a2.A.d;
        }
        XBa xBa5 = a2;
        xBa5.A.l(xBa5.J, a2.m, a2.F, (float)var10_7, (float)var11_8);
        xBa5.A.I.J((KC)new lba((double)f4, (double)e2, (double)d5, (float)c2, (float)b2, (Set)g2));
    }

    public void J(gAa gAa2) {
        XBa a2;
        XBa b2 = gAa2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        Short s = xBa2.L.J(a2.A.G.k);
        if (s != null && b2.J() == s.shortValue() && a2.A.G.k == b2.J() && !a2.A.G.f((Sx)a2.A) && !a2.A.t()) {
            a2.A.G.J((Sx)a2.A, vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(qBa qBa2) {
        void var1_4;
        void b222 = var1_4;
        XBa a2 = this;
        void v0 = b222;
        XBa xBa2 = a2;
        Vaa.J(v0, xBa2, (c)xBa2.A.J());
        a2.A.ba();
        Qba b222 = v0.J();
        switch (dca.A[b222.ordinal()]) {
            case 1: {
                if (a2.A.L) {
                    a2.A = a2.C.J().J(a2.A, uSa.E, vRa.d != 0);
                    return;
                }
                if (a2.A.J().J().d()) {
                    if (a2.C.E() && a2.A.J().equals(a2.C.e())) {
                        XBa xBa3 = a2;
                        xBa3.A.I.f(Qta.Q);
                        xBa3.C.M();
                        return;
                    }
                    Vy b222 = new Vy(a2.A.J(), null, cra.q, null, vua.Ca);
                    XBa xBa4 = a2;
                    xBa4.C.J().J().J((ay)b222);
                    xBa4.A.I.f(Qta.Q);
                    return;
                }
                if (a2.A.f() > JPa.N) {
                    return;
                }
                a2.A = a2.C.J().J(a2.A, uSa.E, uSa.E != 0);
                return;
            }
            case 2: {
                a2.A.J().f(a2.A);
                return;
            }
            case 3: {
                a2.A.J((aX)mY.q);
                return;
            }
        }
    }

    public void J(sca sca2) {
        XBa a2;
        XBa b2 = sca2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        xBa2.A.h.f((b2.C() && a2.A.h.l() ? vRa.d : uSa.E) != 0);
    }

    public void J(WBa wBa2) {
        XBa b2 = wBa2;
        XBa a2 = this;
        XBa xBa2 = b2;
        XBa xBa3 = a2;
        Vaa.J(xBa2, xBa3, (c)xBa3.A.J());
        if (xBa2.J() >= 0 && b2.J() < kea.C()) {
            a2.A.K.J = b2.J();
            a2.A.ba();
            return;
        }
        l.warn(new StringBuilder().insert(5 >> 3, a2.A.J()).append(fqa.Ga).toString());
    }

    public void f(String string) {
        Object b2 = string;
        XBa a2 = this;
        b2 = new CY((String)b2);
        a2.i.J(new mba((ld)b2), new lBa(a2, (CY)b2), new GenericFutureListener[uSa.E]);
        XBa xBa2 = a2;
        xBa2.i.f();
        Futures.getUnchecked(xBa2.C.J((Runnable)new FCa(a2)));
    }

    public void J() {
        XBa a2;
        XBa xBa2 = a2;
        xBa2.k = uSa.E;
        xBa2.g += vRa.d;
        xBa2.C.K.J(kua.X);
        if ((long)xBa2.g - a2.G > XOa.g) {
            XBa xBa3 = a2;
            xBa3.G = xBa3.g;
            xBa3.E = xBa3.J();
            xBa3.D = (int)xBa3.E;
            XBa xBa4 = a2;
            xBa3.J((KC)new dCa(a2.D));
        }
        XBa xBa5 = a2;
        xBa5.C.K.f();
        if (xBa5.e > 0) {
            a2.e -= vRa.d;
        }
        if (a2.I > 0) {
            a2.I -= vRa.d;
        }
        if (a2.A.J() > nqa.i && a2.C.C() > 0 && OCa.J() - a2.A.J() > (long)(a2.C.C() * PRa.U * Psa.M)) {
            a2.f(pua.U);
        }
    }

    public void J(UAa uAa2) {
        XBa a2;
        XBa b2 = uAa2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        xBa2.A.J((UAa)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(CAa cAa2) {
        Object object;
        int n2;
        void a2;
        XBa xBa2 = this;
        void v0 = a2;
        XBa xBa3 = xBa2;
        void v2 = a2;
        XBa xBa4 = xBa2;
        Vaa.J(v2, xBa4, (c)xBa4.A.J());
        Tf tf = xBa3.C.J(xBa2.A.Ha);
        Mda mda2 = xBa3.A.K.f();
        int n3 = uSa.E;
        XF b2 = v2.J();
        DZ dZ2 = DZ.getFront(v0.J());
        xBa2.A.ba();
        if (v0.J() == osa.Ja) {
            if (mda2 == null) {
                return;
            }
            XBa xBa5 = xBa2;
            WTa.J((Sx)xBa5.A, (cua)cua.RIGHT_CLICK_AIR, (Gg)tf, (XF)new XF(uSa.E, uSa.E, uSa.E), null);
            xBa5.A.s.J((Sx)xBa2.A, (Gg)tf, mda2);
            n2 = n3;
        } else if (b2.getY() < xBa2.C.i() - vRa.d || dZ2 != DZ.UP && b2.getY() < xBa2.C.i()) {
            if (xBa2.M && xBa2.A.f((double)b2.getX() + kTa.B, (double)b2.getY() + kTa.B, (double)b2.getZ() + kTa.B) < ypa.X && !xBa2.C.J((Gg)tf, b2, (Sx)xBa2.A) && tf.J().J(b2)) {
                xBa2.A.s.J((Sx)xBa2.A, (Gg)tf, mda2, b2, dZ2, a2.J(), a2.l(), a2.f());
            }
            n2 = n3 = vRa.d;
        } else {
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = xBa2.C.i();
            object = new CZ(WRa.ca, objectArray);
            object.J().J(pY.RED);
            xBa2.A.I.J((KC)new XCa((ld)object));
            n3 = vRa.d;
            n2 = n3;
        }
        if (n2 != 0) {
            XBa xBa6 = xBa2;
            xBa6.A.I.J((KC)new wba((Gg)tf, b2));
            xBa6.A.I.J((KC)new wba((Gg)tf, b2.offset(dZ2)));
        }
        if ((mda2 = xBa2.A.K.f()) != null && mda2.E == 0) {
            xBa2.A.K.j[xBa2.A.K.J] = null;
            mda2 = null;
        }
        if (mda2 == null || mda2.C() == 0) {
            XBa xBa7 = xBa2;
            xBa7.A.F = vRa.d;
            XBa xBa8 = xBa2;
            xBa7.A.K.j[xBa2.A.K.J] = Mda.J((Mda)xBa8.A.K.j[xBa2.A.K.J]);
            object = xBa8.A.G.J((HA)xBa2.A.K, xBa2.A.K.J);
            xBa7.A.G.J();
            xBa7.A.F = uSa.E;
            if (!Mda.J((Mda)xBa7.A.K.f(), (Mda)a2.J())) {
                XBa xBa9 = xBa2;
                xBa9.J((KC)new tba(xBa9.A.G.k, object.I, xBa2.A.K.f()));
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public XBa(OCa oCa2, uba uba2, bFa bFa2) {
        void b2;
        void c2;
        XBa a2;
        XBa d2 = bFa2;
        XBa xBa2 = a2 = this;
        XBa xBa3 = a2;
        xBa2.L = new OX();
        xBa2.M = vRa.d;
        xBa2.C = c2;
        a2.i = b2;
        a2.i.J((aA)a2);
        a2.A = d2;
        ((bFa)d2).I = a2;
    }

    private long J() {
        return System.nanoTime() / Ata.p;
    }

    public void J(fca fca2) {
        XBa a2;
        fca b2 = fca2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)a2.A.J());
        xBa2.A.ba();
        if (xBa2.A.G.k == b2.J() && a2.A.G.f((Sx)a2.A) && !a2.A.t()) {
            a2.A.G.J((Sx)a2.A, b2.f());
            a2.A.G.J();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(double d2, double d3, double d4, float f2, float f3) {
        void f4;
        void b2;
        void c2;
        void d5;
        void e2;
        float f5 = f3;
        XBa a2 = this;
        a2.J((double)e2, (double)d5, (double)c2, (float)b2, (float)f4, Collections.emptySet());
    }

    public void J(JAa object) {
        XBa b2 = object;
        object = this;
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gba gba2) {
        void a2;
        XBa xBa2;
        XBa xBa3 = xBa2 = this;
        Vaa.J(a2, xBa3, (c)xBa3.A.J());
        if (xBa3.A.s.f()) {
            int n2;
            jFa jFa2;
            XF xF;
            uY uY2;
            Waa waa2;
            int n3 = a2.J() < 0 ? vRa.d : uSa.E;
            XBa b2 = a2.J();
            if (b2 != null && b2.M() && b2.J().J(uua.M, NTa.C) && (waa2 = b2.J().J(uua.M)).J(rRa.X) && waa2.J(uOa.Ja) && waa2.J(oua.v) && (uY2 = xBa2.A.j.J(xF = new XF(waa2.J(rRa.X), waa2.J(uOa.Ja), waa2.J(oua.v)))) != null) {
                jFa jFa3 = jFa2 = new Waa();
                uY2.J((Waa)jFa3);
                jFa2.J(rRa.X);
                jFa3.J(uOa.Ja);
                jFa3.J(oua.v);
                b2.J(uua.M, (NCa)jFa2);
            }
            int n4 = a2.J() >= vRa.d && a2.J() < Qsa.Ha + kea.C() ? vRa.d : uSa.E;
            int n5 = b2 == null || b2.J() != null ? vRa.d : uSa.E;
            int n6 = n2 = b2 == null || b2.J() >= 0 && ((Mda)b2).E <= ysa.s && ((Mda)b2).E > 0 ? vRa.d : uSa.E;
            if (n4 != 0 && n5 != 0 && n2 != 0) {
                XBa xBa4;
                XBa xBa5 = xBa2;
                if (b2 == null) {
                    xBa5.A.x.J(a2.J(), (Mda)null);
                    xBa4 = xBa2;
                } else {
                    xBa5.A.x.J(a2.J(), (Mda)b2);
                    xBa4 = xBa2;
                }
                xBa4.A.x.J((Sx)xBa2.A, vRa.d != 0);
                return;
            }
            if (n3 != 0 && n5 != 0 && n2 != 0 && xBa2.I < ZOa.x) {
                XBa xBa6 = xBa2;
                xBa6.I += kTa.j;
                jFa2 = xBa6.A.J((Mda)b2, vRa.d != 0);
                if (jFa2 != null) {
                    jFa2.o();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(RBa rBa2) {
        XBa a2;
        XBa b2 = rBa2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        xBa2.A.ba();
        switch (dca.J[b2.J().ordinal()]) {
            case 1: {
                a2.A.i(vRa.d != 0);
                return;
            }
            case 2: {
                a2.A.i(uSa.E != 0);
                return;
            }
            case 3: {
                a2.A.l(vRa.d != 0);
                return;
            }
            case 4: {
                a2.A.l(uSa.E != 0);
                return;
            }
            case 5: {
                a2.A.J(uSa.E != 0, vRa.d != 0, vRa.d != 0);
                a2.M = uSa.E;
                return;
            }
            case 6: {
                if (!(a2.A.ja instanceof Rea)) break;
                ((Rea)a2.A.ja).k(b2.J());
                return;
            }
            case 7: {
                if (!(a2.A.ja instanceof Rea)) break;
                ((Rea)a2.A.ja).f((Sx)a2.A);
                return;
            }
            default: {
                throw new IllegalArgumentException(NQa.o);
            }
        }
    }

    public void J(ld ld2) {
        XBa b2 = ld2;
        XBa a2 = this;
        l.info(new StringBuilder().insert(3 & 4, a2.A.J()).append(Bua.E).append(b2).toString());
        a2.C.G();
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = a2.A.J();
        b2 = new CZ(vqa.m, objectArray);
        XBa xBa2 = a2;
        b2.J().J(pY.YELLOW);
        a2.C.J().J((ld)b2);
        xBa2.A.N();
        xBa2.C.J().d(a2.A);
        if (xBa2.C.E() && a2.A.J().equals(a2.C.e())) {
            l.info(Yra.R);
            a2.C.C();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(KC kC2) {
        XBa b2;
        void a2;
        XBa xBa2 = this;
        if (a2 instanceof XCa) {
            XCa xCa2 = (XCa)a2;
            b2 = xBa2.A.J();
            if (b2 == kFa.HIDDEN) {
                return;
            }
            if (b2 == kFa.SYSTEM && !xCa2.J()) {
                return;
            }
        }
        try {
            xBa2.i.J((KC)a2);
            return;
        }
        catch (Throwable throwable) {
            b2 = RIa.J((Throwable)throwable, (String)Lra.Z);
            b2.J(nua.Q).J(xqa.M, (Callable)new gBa(xBa2, (KC)a2));
            throw new MZ((RIa)b2);
        }
    }

    public void J(Lda lda) {
        XBa a2;
        XBa b2 = lda;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)xBa2.A.J());
        xBa2.A.J(b2.f(), b2.J(), b2.J(), b2.f());
    }

    /*
     * WARNING - void declaration
     */
    public void J(wca wca2) {
        XBa xBa2;
        Object b2;
        void a22;
        XBa xBa3;
        XBa xBa4 = xBa3 = this;
        Vaa.J(a22, xBa4, (c)xBa4.A.J());
        if (xBa4.A.J() == kFa.HIDDEN) {
            b2 = new CZ(Vua.N, new Object[uSa.E]);
            b2.J().J(pY.RED);
            xBa3.J((KC)new XCa((ld)b2));
            return;
        }
        xBa3.A.ba();
        b2 = a22.J();
        b2 = StringUtils.normalizeSpace((String)b2);
        int n2 = a22 = uSa.E;
        while (n2 < ((String)b2).length()) {
            if (!cX.J((char)((String)b2).charAt(a22))) {
                xBa3.f(jpa.c);
                return;
            }
            n2 = ++a22;
        }
        if (((String)b2).startsWith(WSa.f)) {
            XBa xBa5 = xBa3;
            xBa2 = xBa5;
            xBa5.J((String)b2);
        } else {
            Object[] objectArray = new Object[uqa.g];
            objectArray[uSa.E] = xBa3.A.J();
            objectArray[vRa.d] = b2;
            CZ a22 = new CZ(kta.Ka, objectArray);
            XBa xBa6 = xBa3;
            xBa2 = xBa6;
            xBa6.C.J().J((ld)a22, uSa.E != 0);
        }
        xBa2.e += kTa.j;
        if (xBa3.e > ZOa.x && !xBa3.C.J().f(xBa3.A.J())) {
            xBa3.f(NSa.z);
        }
    }

    public void J(LBa lBa2) {
        XBa a2;
        XBa b2 = lBa2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)a2.A.J());
        xBa2.A.ba();
        xBa2.A.u();
    }

    public void J(cBa cBa2) {
        XBa b22 = cBa2;
        XBa a2 = this;
        if (b22.J() == a2.D) {
            int b22 = (int)(a2.J() - a2.E);
            a2.A.w = (a2.A.w * yRa.d + b22) / AQa.P;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(hca hca2) {
        void a2;
        XBa xBa2;
        XBa xBa3 = xBa2 = this;
        Vaa.J(a2, xBa3, (c)xBa3.A.J());
        if (xBa3.A.t()) {
            XBa xBa4;
            Tf tf;
            XBa b2;
            block6: {
                int n2;
                b2 = null;
                tf = xBa2.C.G;
                int n3 = ((Tf[])tf).length;
                int n4 = n2 = uSa.E;
                while (n4 < n3) {
                    Tf tf2 = tf[n2];
                    if (tf2 != null && (b2 = a2.J(tf2)) != null) {
                        xBa4 = b2;
                        break block6;
                    }
                    n4 = ++n2;
                }
                xBa4 = b2;
            }
            if (xBa4 != null) {
                XBa xBa5 = xBa2;
                xBa2.A.D((vL)xBa5.A);
                xBa5.A.l((vL)null);
                if (((vL)b2).j != xBa2.A.j) {
                    tf = xBa2.A.J();
                    Tf tf3 = (Tf)((vL)b2).j;
                    XBa xBa6 = xBa2;
                    xBa2.A.Ha = ((vL)b2).Ha;
                    XBa xBa7 = xBa2;
                    XBa xBa8 = xBa2;
                    xBa8.J((KC)new mBa(xBa8.A.Ha, tf.J(), tf.J().J(), xBa2.A.s.J()));
                    tf.e((vL)xBa6.A);
                    xBa2.A.J = uSa.E;
                    XBa xBa9 = b2;
                    xBa6.A.f(((vL)b2).la, ((vL)b2).Z, ((vL)b2).A, ((vL)xBa9).X, ((vL)xBa9).d);
                    if (xBa2.A.K()) {
                        XBa xBa10 = xBa2;
                        tf.J((vL)xBa10.A, uSa.E != 0);
                        tf3.f((vL)xBa10.A);
                        tf3.J((vL)xBa2.A, uSa.E != 0);
                    }
                    XBa xBa11 = xBa2;
                    xBa11.A.J((Gg)tf3);
                    XBa xBa12 = xBa2;
                    xBa11.C.J().J(xBa12.A, tf);
                    xBa12.A.C(((vL)b2).la, ((vL)b2).Z, ((vL)b2).A);
                    xBa11.A.s.J(tf3);
                    xBa11.C.J().f(xBa2.A, tf3);
                    xBa11.C.J().f(xBa2.A);
                    return;
                }
                xBa2.A.C(((vL)b2).la, ((vL)b2).Z, ((vL)b2).A);
            }
        }
    }

    public void J(ida ida2) {
        XBa b2 = ida2;
        XBa a2 = this;
        XBa xBa2 = b2;
        XBa xBa3 = a2;
        Vaa.J(xBa2, xBa3, (c)a2.A.J());
        if (xBa3.J((ida)xBa2)) {
            a2.f(yta.Ga);
            return;
        }
        XBa xBa4 = a2;
        Tf tf = xBa4.C.J(a2.A.Ha);
        a2.k = vRa.d;
        if (!xBa4.A.L) {
            XBa xBa5 = a2;
            double d2 = xBa5.A.la;
            double d3 = xBa5.A.Z;
            double d4 = xBa5.A.A;
            double d5 = aSa.V;
            XBa xBa6 = b2;
            double d6 = xBa6.l() - a2.J;
            double d7 = xBa6.J() - a2.m;
            double d8 = xBa6.f() - a2.F;
            if (xBa6.f()) {
                double d9 = d6;
                double d10 = d7;
                double d11 = d8;
                d5 = d9 * d9 + d10 * d10 + d11 * d11;
                if (!a2.M && d5 < VPa.W) {
                    a2.M = vRa.d;
                }
            }
            if (a2.M) {
                double d12;
                XBa xBa7 = a2;
                xBa7.j = xBa7.g;
                if (xBa7.A.ja != null) {
                    XBa xBa8 = a2;
                    float f2 = xBa8.A.X;
                    float f3 = xBa8.A.d;
                    xBa8.A.ja.M();
                    d7 = xBa8.A.la;
                    d8 = xBa8.A.Z;
                    double d13 = xBa8.A.A;
                    if (b2.J()) {
                        XBa xBa9 = b2;
                        f2 = xBa9.J();
                        f3 = xBa9.f();
                    }
                    XBa xBa10 = a2;
                    xBa10.A.d(b2.l());
                    xBa10.A.v();
                    xBa10.A.l(d7, d8, d13, f2, f3);
                    if (xBa10.A.ja != null) {
                        a2.A.ja.M();
                    }
                    XBa xBa11 = a2;
                    xBa11.C.J().J(a2.A);
                    if (xBa11.A.ja != null) {
                        if (d5 > FPa.T) {
                            XBa xBa12 = a2;
                            vL vL2 = xBa12.A.ja;
                            xBa12.A.I.J((KC)new bba(vL2));
                            xBa12.J(xBa12.A.la, a2.A.Z, a2.A.A, a2.A.X, a2.A.d);
                        }
                        a2.A.ja.t = vRa.d;
                    }
                    if (a2.M) {
                        XBa xBa13 = a2;
                        xBa13.J = xBa13.A.la;
                        xBa13.m = xBa13.A.Z;
                        xBa13.F = xBa13.A.A;
                    }
                    tf.f((vL)a2.A);
                    return;
                }
                if (a2.A.p()) {
                    XBa xBa14 = a2;
                    xBa14.A.v();
                    XBa xBa15 = a2;
                    xBa14.A.l(xBa15.J, a2.m, a2.F, a2.A.X, a2.A.d);
                    tf.f((vL)xBa15.A);
                    return;
                }
                XBa xBa16 = a2;
                d6 = xBa16.A.Z;
                xBa16.J = xBa16.A.la;
                xBa16.m = xBa16.A.Z;
                xBa16.F = xBa16.A.A;
                d7 = xBa16.A.la;
                d8 = xBa16.A.Z;
                double d14 = xBa16.A.A;
                float f4 = xBa16.A.X;
                float f5 = xBa16.A.d;
                if (b2.f() && b2.J() == WSa.e) {
                    b2.J(uSa.E != 0);
                }
                if (b2.f()) {
                    XBa xBa17 = b2;
                    d7 = xBa17.l();
                    d8 = xBa17.J();
                    d14 = xBa17.f();
                    if (Math.abs(xBa17.l()) > AQa.c || Math.abs(b2.f()) > AQa.c) {
                        a2.f(qta.u);
                        return;
                    }
                }
                if (b2.J()) {
                    XBa xBa18 = b2;
                    f4 = xBa18.J();
                    f5 = xBa18.f();
                }
                XBa xBa19 = a2;
                xBa19.A.v();
                xBa19.A.l(a2.J, a2.m, a2.F, f4, f5);
                if (!xBa19.M) {
                    return;
                }
                d5 = d7 - a2.A.la;
                double d15 = d8 - a2.A.Z;
                double d16 = d14 - a2.A.A;
                double d17 = a2.A.i * a2.A.i + a2.A.Ea * a2.A.Ea + a2.A.f * a2.A.f;
                double d18 = d5;
                double d19 = d15;
                double d20 = d16;
                double d21 = d18 * d18 + d19 * d19 + d20 * d20;
                if (!(!(d12 - d17 > fqa.W) || a2.C.E() && a2.C.e().equals(a2.A.J()))) {
                    l.warn(new StringBuilder().insert(3 >> 2, a2.A.J()).append(csa.L).append(d5).append(yra.t).append(d15).append(yra.t).append(d16).append(nQa.T).append(d5).append(TOa.n).append(d15).append(TOa.n).append(d16).append(hpa.b).toString());
                    XBa xBa20 = a2;
                    xBa20.J(a2.J, xBa20.m, a2.F, a2.A.X, a2.A.d);
                    return;
                }
                float f6 = rRa.T;
                XBa xBa21 = a2;
                boolean bl = tf.J((vL)a2.A, xBa21.A.J().J((double)f6, (double)f6, (double)f6)).isEmpty();
                if (xBa21.A.ha && !b2.l() && d15 > aSa.V) {
                    a2.A.q();
                }
                XBa xBa22 = a2;
                xBa22.A.J(d5, d15, d16);
                xBa22.A.d(b2.l());
                d5 = d7 - a2.A.la;
                d15 = d8 - a2.A.Z;
                if (d15 > KPa.I || d15 < kTa.B) {
                    d15 = aSa.V;
                }
                d16 = d14 - a2.A.A;
                double d22 = d5;
                double d23 = d15;
                double d24 = d16;
                d21 = d22 * d22 + d23 * d23 + d24 * d24;
                int n2 = uSa.E;
                if (d21 > BQa.R && !a2.A.p() && !a2.A.s.f()) {
                    n2 = vRa.d;
                    l.warn(new StringBuilder().insert(5 >> 3, a2.A.J()).append(JQa.v).toString());
                }
                XBa xBa23 = a2;
                xBa23.A.l(d7, d8, d14, f4, f5);
                xBa23.A.e(a2.A.la - d2, a2.A.Z - d3, a2.A.A - d4);
                if (!xBa23.A.Ma) {
                    XBa xBa24 = a2;
                    boolean bl2 = tf.J((vL)xBa24.A, xBa24.A.J().J((double)f6, (double)f6, (double)f6)).isEmpty();
                    if (!(!bl || n2 == 0 && bl2 || a2.A.p())) {
                        XBa xBa25 = a2;
                        xBa25.J(a2.J, xBa25.m, a2.F, f4, f5);
                        return;
                    }
                }
                XBa xBa26 = a2;
                xy xy2 = xBa26.A.J().f((double)f6, (double)f6, (double)f6).l(aSa.V, TOa.Ga, aSa.V);
                if (!(xBa26.C.A() || a2.A.h.l() || tf.f(xy2))) {
                    if (d15 >= Bpa.ia) {
                        XBa xBa27 = a2;
                        xBa27.f += vRa.d;
                        if (xBa27.f > Fua.J) {
                            l.warn(new StringBuilder().insert(3 & 4, a2.A.J()).append(kPa.q).toString());
                            a2.f(uQa.y);
                            return;
                        }
                    }
                } else {
                    a2.f = uSa.E;
                }
                XBa xBa28 = a2;
                xBa28.A.d(b2.l());
                xBa28.C.J().J(a2.A);
                xBa28.A.J(a2.A.Z - d6, b2.l());
                return;
            }
            XBa xBa29 = a2;
            if (xBa29.g - xBa29.j > kTa.j) {
                XBa xBa30 = a2;
                xBa30.J(a2.J, xBa30.m, a2.F, a2.A.X, a2.A.d);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Lba lba2) {
        void a2;
        XBa xBa2 = this;
        void v0 = a2;
        XBa xBa3 = xBa2;
        Vaa.J(v0, xBa3, (c)xBa3.A.J());
        XBa b2 = v0.J((Gg)xBa2.C.J(xBa2.A.Ha));
        xBa2.A.ba();
        if (b2 != null) {
            boolean bl = xBa2.A.l((vL)b2);
            double d2 = Qra.l;
            if (!bl) {
                d2 = KSa.F;
            }
            if (xBa2.A.J((vL)b2) < d2) {
                if (a2.J() == Vca.INTERACT) {
                    xBa2.A.d((vL)b2);
                    return;
                }
                if (a2.J() == Vca.INTERACT_AT) {
                    b2.J((Sx)xBa2.A, a2.J());
                    return;
                }
                if (a2.J() == Vca.ATTACK) {
                    if (b2 instanceof jFa || b2 instanceof zEa || b2 instanceof jea || b2 == xBa2.A) {
                        XBa xBa4 = xBa2;
                        xBa4.f(hpa.B);
                        xBa4.C.d(new StringBuilder().insert(3 & 4, FRa.t).append(xBa2.A.J()).append(zta.I).toString());
                        return;
                    }
                    xBa2.A.A((vL)b2);
                }
            }
        }
    }

    public void J(tBa tBa2) {
        XBa a2;
        XBa b2 = tBa2;
        XBa xBa2 = a2 = this;
        Vaa.J(b2, xBa2, (c)a2.A.J());
        xBa2.A.ba();
        if (xBa2.A.G.k == b2.J() && a2.A.G.f((Sx)a2.A)) {
            if (a2.A.t()) {
                int n2;
                ArrayList<Mda> arrayList = Lists.newArrayList();
                int n3 = n2 = uSa.E;
                while (n3 < a2.A.G.A.size()) {
                    Object e2 = a2.A.G.A.get(n2);
                    arrayList.add(((sEa)e2).J());
                    n3 = ++n2;
                }
                XBa xBa3 = a2;
                xBa3.A.J(xBa3.A.G, arrayList);
                return;
            }
            Mda mda2 = a2.A.G.J(b2.C(), b2.f(), b2.l(), (Sx)a2.A);
            XBa xBa4 = a2;
            if (Mda.J((Mda)b2.J(), (Mda)mda2)) {
                xBa4.A.I.J((KC)new yAa(b2.J(), b2.J(), vRa.d != 0));
                XBa xBa5 = a2;
                xBa5.A.F = vRa.d;
                xBa5.A.G.J();
                xBa5.A.W();
                xBa5.A.F = uSa.E;
                return;
            }
            xBa4.L.J(a2.A.G.k, b2.J());
            XBa xBa6 = a2;
            xBa6.A.I.J((KC)new yAa(b2.J(), b2.J(), uSa.E != 0));
            xBa6.A.G.J((Sx)a2.A, uSa.E != 0);
            ArrayList<Mda> arrayList = Lists.newArrayList();
            int n4 = b2 = uSa.E;
            while (n4 < a2.A.G.A.size()) {
                Object e3 = a2.A.G.A.get(b2);
                arrayList.add(((sEa)e3).J());
                n4 = ++b2;
            }
            XBa xBa7 = a2;
            xBa7.A.J(xBa7.A.G, arrayList);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(Rba rba2) {
        block50: {
            Object b22;
            void a2;
            XBa xBa2;
            XBa xBa3 = xBa2 = this;
            Vaa.J(a2, xBa3, (c)xBa3.A.J());
            if (Gta.i.equals(a2.J())) {
                b22 = new Lca(Unpooled.wrappedBuffer((ByteBuf)a2.J()));
                try {
                    Mda mda2 = ((Lca)b22).readItemStackFromBuffer();
                    if (mda2 != null) {
                        if (!JCa.f((Waa)mda2.J())) {
                            throw new IOException(Yra.Ha);
                        }
                        Mda mda3 = xBa2.A.K.f();
                        if (mda3 == null) {
                            return;
                        }
                        if (mda2.J() == Gea.MC && mda2.J() == mda3.J()) {
                            mda3.J(sra.A, (NCa)mda2.J().J(sra.A, Yqa.i));
                        }
                        return;
                    }
                    return;
                }
                catch (Exception exception) {
                    l.error(Ura.l, (Throwable)exception);
                    return;
                }
                finally {
                    ((Lca)b22).release();
                }
            }
            if (qsa.M.equals(a2.J())) {
                b22 = new Lca(Unpooled.wrappedBuffer((ByteBuf)a2.J()));
                try {
                    Mda mda4 = ((Lca)b22).readItemStackFromBuffer();
                    if (mda4 != null) {
                        if (!JDa.f(mda4.J())) {
                            throw new IOException(Yra.Ha);
                        }
                        Mda mda5 = xBa2.A.K.f();
                        if (mda5 == null) {
                            return;
                        }
                        if (mda4.J() == Gea.sb && mda5.J() == Gea.MC) {
                            Mda mda6 = mda5;
                            mda6.J(osa.i, (NCa)new tca(xBa2.A.J()));
                            mda6.J(xqa.U, (NCa)new tca(mda4.J().J(xqa.U)));
                            mda6.J(sra.A, (NCa)mda4.J().J(sra.A, Yqa.i));
                            mda6.J(Gea.sb);
                        }
                        return;
                    }
                    return;
                }
                catch (Exception exception) {
                    l.error(pqa.A, (Throwable)exception);
                    return;
                }
                finally {
                    ((Lca)b22).release();
                }
            }
            if (Vua.fa.equals(a2.J())) {
                try {
                    int b22 = a2.J().readInt();
                    Ega ega = xBa2.A.G;
                    if (ega instanceof yEa) {
                        ((yEa)ega).J(b22);
                        return;
                    }
                    break block50;
                }
                catch (Exception b22) {
                    l.error(Cta.h, (Throwable)b22);
                    return;
                }
            }
            if (uRa.ca.equals(a2.J())) {
                XBa xBa4 = xBa2;
                if (!xBa2.C.j()) {
                    xBa4.A.J((ld)new CZ(bsa.V, new Object[uSa.E]));
                    return;
                }
                if (xBa4.A.J(uqa.g, Mqa.y) && xBa2.A.h.f()) {
                    b22 = a2.J();
                    try {
                        String string;
                        byte by2 = ((Lca)b22).readByte();
                        caa caa2 = null;
                        if (by2 == 0) {
                            string = xBa2.A.j.J(new XF(((Lca)b22).readInt(), ((Lca)b22).readInt(), ((Lca)b22).readInt()));
                            if (string instanceof kz) {
                                caa2 = ((kz)((Object)string)).J();
                            }
                        } else if (by2 == vRa.d && (string = xBa2.A.j.J(((Lca)b22).readInt())) instanceof RGa) {
                            caa2 = ((RGa)string).J();
                        }
                        Object object = b22;
                        string = ((Lca)object).readStringFromBuffer(((Lca)object).readableBytes());
                        boolean bl = ((Lca)object).readBoolean();
                        if (caa2 != null) {
                            boolean bl2 = bl;
                            caa2.J(string);
                            caa2.J(bl2);
                            if (!bl2) {
                                caa2.f((ld)null);
                            }
                            caa2.J();
                            Object[] objectArray = new Object[vRa.d];
                            objectArray[uSa.E] = string;
                            xBa2.A.J((ld)new CZ(GPa.R, objectArray));
                        }
                        return;
                    }
                    catch (Exception exception) {
                        l.error(lQa.T, (Throwable)exception);
                        return;
                    }
                    finally {
                        ((Lca)b22).release();
                    }
                }
                xBa2.A.J((ld)new CZ(STa.F, new Object[uSa.E]));
                return;
            }
            if (csa.Aa.equals(a2.J())) {
                if (xBa2.A.G instanceof xda) {
                    try {
                        Object object = b22 = a2.J();
                        int n2 = ((Lca)object).readInt();
                        int n3 = ((Lca)object).readInt();
                        xda xda2 = (xda)xBa2.A.G;
                        sEa sEa2 = xda2.J(uSa.E);
                        if (sEa2.J()) {
                            sEa2.J(vRa.d);
                            HA hA2 = xda2.J();
                            hA2.J(vRa.d, n2);
                            hA2.J(uqa.g, n3);
                            hA2.f();
                            return;
                        }
                    }
                    catch (Exception b22) {
                        l.error(NOa.i, (Throwable)b22);
                        return;
                    }
                }
            } else if (nua.i.equals(a2.J()) && xBa2.A.G instanceof rda) {
                b22 = (rda)xBa2.A.G;
                if (a2.J() != null && a2.J().readableBytes() >= vRa.d) {
                    String string = cX.J((String)a2.J().readStringFromBuffer(BQa.h));
                    if (string.length() <= Fsa.d) {
                        ((rda)((Object)b22)).J(string);
                        return;
                    }
                } else {
                    ((rda)((Object)b22)).J(Mqa.y);
                }
            }
        }
    }

    private boolean J(ida ida2) {
        XBa b2 = ida2;
        XBa a2 = this;
        if (!(Doubles.isFinite(b2.l()) && Doubles.isFinite(b2.J()) && Doubles.isFinite(b2.f()) && Floats.isFinite(b2.f()) && Floats.isFinite(b2.J()))) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public uba J() {
        XBa a2;
        return a2.i;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(mAa mAa2) {
        void a2;
        XBa xBa2 = this;
        void v0 = a2;
        XBa xBa3 = xBa2;
        Vaa.J(v0, xBa3, (c)xBa3.A.J());
        Tf tf = xBa2.C.J(xBa2.A.Ha);
        XF b2 = v0.J();
        xBa2.A.ba();
        switch (dca.I[a2.J().ordinal()]) {
            case 1: {
                if (!xBa2.A.t()) {
                    xBa2.A.J(uSa.E != 0);
                }
                return;
            }
            case 2: {
                if (!xBa2.A.t()) {
                    xBa2.A.J(vRa.d != 0);
                }
                return;
            }
            case 3: {
                xBa2.A.w();
                return;
            }
            case 4: 
            case 5: 
            case 6: {
                Tf tf2;
                XBa xBa4 = xBa2;
                double d2 = xBa4.A.la - ((double)b2.getX() + kTa.B);
                double d3 = xBa4.A.Z - ((double)b2.getY() + kTa.B) + Bta.c;
                double d4 = xBa4.A.A - ((double)b2.getZ() + kTa.B);
                double d5 = d2;
                double d6 = d3;
                double d7 = d4;
                if (d5 * d5 + d6 * d6 + d7 * d7 > Qra.l) {
                    return;
                }
                if (b2.getY() >= xBa2.C.i()) {
                    return;
                }
                if (a2.J() == Gda.START_DESTROY_BLOCK) {
                    if (!xBa2.C.J((Gg)tf, b2, (Sx)xBa2.A) && tf.J().J(b2)) {
                        xBa2.A.s.J(b2, a2.J());
                        return;
                    }
                    xBa2.A.I.J((KC)new wba((Gg)tf, b2));
                    return;
                }
                if (a2.J() == Gda.STOP_DESTROY_BLOCK) {
                    tf2 = tf;
                    xBa2.A.s.J(b2);
                } else {
                    if (a2.J() == Gda.ABORT_DESTROY_BLOCK) {
                        xBa2.A.s.J();
                    }
                    tf2 = tf;
                }
                if (tf2.J(b2).J().J() != Material.air) {
                    xBa2.A.I.J((KC)new wba((Gg)tf, b2));
                }
                return;
            }
        }
        throw new IllegalArgumentException(Jpa.l);
    }

    private void J(String string) {
        String b2 = string;
        XBa a2 = this;
        a2.C.J().J((u)a2.A, b2);
    }
}

