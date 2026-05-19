/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ABa
 *  ANa
 *  BAa
 *  CDa
 *  CZ
 *  Cha
 *  Cia
 *  Cna
 *  Cz
 *  DBa
 *  Dc
 *  Dfa
 *  EBa
 *  EC
 *  Eba
 *  Eca
 *  Ega
 *  Eoa
 *  Epa
 *  Ez
 *  FBa
 *  FEa
 *  Faa
 *  Fba
 *  Fpa
 *  GBa
 *  GDa
 *  GFa
 *  GY
 *  Gg
 *  Gl
 *  HA
 *  HCa
 *  HOa
 *  Iba
 *  JAa
 *  JBa
 *  JMa
 *  JPa
 *  Jca
 *  Jda
 *  KTa
 *  Kda
 *  Kpa
 *  LAa
 *  LCa
 *  LQa
 *  MQa
 *  Mba
 *  Mda
 *  Moa
 *  NPa
 *  NQa
 *  NTa
 *  Nia
 *  OS
 *  Oea
 *  Oz
 *  PIa
 *  PTa
 *  Pd
 *  QAa
 *  QCa
 *  QNa
 *  QS
 *  Qsa
 *  RAa
 *  RC
 *  RPa
 *  RQa
 *  Rba
 *  Rda
 *  Rea
 *  SAa
 *  SF
 *  SQa
 *  SX
 *  Sda
 *  Ssa
 *  Sz
 *  TLa
 *  Toa
 *  UBa
 *  UNa
 *  URa
 *  UZ
 *  Vna
 *  WCa
 *  WEa
 *  WFa
 *  WQa
 *  Wda
 *  XCa
 *  XTa
 *  Xaa
 *  Xba
 *  Xoa
 *  Yba
 *  Yea
 *  Yfa
 *  Ypa
 *  ZAa
 *  ZMa
 *  ZRa
 *  Zta
 *  aPa
 *  aSa
 *  aX
 *  aaa
 *  aba
 *  ada
 *  afa
 *  aga
 *  aqa
 *  bCa
 *  bba
 *  cBa
 *  cEa
 *  cLa
 *  cca
 *  dCa
 *  dKa
 *  dQa
 *  dW
 *  dda
 *  dpa
 *  eAa
 *  fAa
 *  fda
 *  fy
 *  gAa
 *  gY
 *  gea
 *  gqa
 *  hCa
 *  hba
 *  hda
 *  hqa
 *  hra
 *  iCa
 *  iMa
 *  ica
 *  isa
 *  jFa
 *  jQa
 *  jRa
 *  jca
 *  jea
 *  kDa
 *  kMa
 *  kba
 *  kea
 *  kta
 *  lAa
 *  lba
 *  ld
 *  lqa
 *  mBa
 *  mZ
 *  mca
 *  mda
 *  oAa
 *  oba
 *  pAa
 *  pPa
 *  pY
 *  pba
 *  poa
 *  pqa
 *  psa
 *  pua
 *  pv
 *  qca
 *  qf
 *  qta
 *  sFa
 *  ska
 *  tDa
 *  tZ
 *  tba
 *  tna
 *  uCa
 *  uQa
 *  uY
 *  uma
 *  uoa
 *  vL
 *  vQa
 *  vRa
 *  vaa
 *  vca
 *  vpa
 *  wOa
 *  wb
 *  wba
 *  wra
 *  xA
 *  xBa
 *  xDa
 *  xba
 *  yAa
 *  yDa
 *  yQa
 *  yba
 *  yra
 *  ysa
 *  zEa
 *  zU
 */
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.Futures;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.block.Block;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iMa_1
implements Pd {
    private final GameProfile g;
    public int L;
    private final uba E;
    private boolean m;
    private Eoa C;
    private final EC i;
    public int M;
    private static final Logger k = LogManager.getLogger();
    private Kpa j;
    private final Random J;
    private final Map<UUID, Vna> A;
    private boolean I;

    public static /* synthetic */ uba J(iMa a2) {
        return a2.E;
    }

    public void J(dCa dCa2) {
        iMa_1 b2 = dCa2;
        iMa_1 a2 = this;
        a2.J((KC)new cBa(b2.J()));
    }

    public void J(Xba xba2) {
        iMa_1 a2;
        iMa_1 b2 = xba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        new NZ((Gg)a2.j.Ta, null, b2.f(), b2.l(), b2.J(), b2.l(), b2.J()).J(vRa.d != 0);
        iMa_1 iMa_13 = a2;
        iMa_1 iMa_14 = a2;
        iMa_13.j.c.f(iMa_14.j.c.i + (double)b2.J());
        iMa_13.j.c.J(a2.j.c.Ea + (double)b2.f());
        iMa_14.j.c.l(a2.j.c.f + (double)b2.C());
    }

    /*
     * WARNING - void declaration
     */
    public void J(ada ada2) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = iMa_12.C.J();
        if (v0.J().length() == 0) {
            b2.J(a2.J(), (ica)null);
            return;
        }
        iMa_1 iMa_14 = b2;
        b2 = iMa_14.J(a2.J());
        iMa_14.J(a2.J(), (ica)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(Bca bca2) {
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        void v1 = a2;
        iMa_1 iMa_14 = iMa_12;
        Vaa.J(v1, iMa_14, (c)iMa_14.j);
        vL vL2 = iMa_13.C.J(a2.J());
        iMa_1 b2 = iMa_13.C.J(a2.f());
        if (v1.l() == 0) {
            vL vL3;
            int n2 = uSa.E;
            if (a2.J() == iMa_12.j.c.M()) {
                vL2 = iMa_12.j.c;
                if (b2 instanceof Wda) {
                    ((Wda)b2).A(uSa.E != 0);
                }
                n2 = vL2.ja == null && b2 != null ? vRa.d : uSa.E;
                vL3 = vL2;
            } else {
                if (b2 instanceof Wda) {
                    ((Wda)b2).A(vRa.d != 0);
                }
                vL3 = vL2;
            }
            if (vL3 == null) {
                return;
            }
            vL2.l((vL)b2);
            if (n2 != 0) {
                iMa_1 iMa_15 = iMa_12;
                Cia cia2 = iMa_15.j.z;
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Cia.J((int)cia2.ia.getKeyCode());
                iMa_15.j.Ya.J(oha.J(isa.V, objectArray), uSa.E != 0);
                return;
            }
        } else if (a2.l() == vRa.d && vL2 instanceof Yfa) {
            vL vL4 = vL2;
            if (b2 != null) {
                ((Yfa)vL4).J((vL)b2, uSa.E != 0);
                return;
            }
            ((Yfa)vL4).J(uSa.E != 0, uSa.E != 0);
        }
    }

    public void J(Dca dca2) {
        String string;
        xBa xBa2;
        Dca dca3;
        mca mca2;
        Dca b2 = dca2;
        iMa_1 a2 = this;
        Object object = b2;
        iMa_1 iMa_12 = a2;
        Vaa.J(object, iMa_12, (c)iMa_12.j);
        qca qca2 = a2.C.J();
        if (((Dca)object).f() == 0) {
            mca2 = qca2.f(b2.f());
            dca3 = b2;
        } else {
            mca2 = qca2.J(b2.f());
            dca3 = b2;
        }
        if (dca3.f() == 0 || b2.f() == uqa.g) {
            mca mca3 = mca2;
            Object object2 = b2;
            mca mca4 = mca2;
            Dca dca4 = b2;
            mca2.f(dca4.C());
            mca4.l(dca4.l());
            mca4.J(b2.d());
            mca3.J(pY.func_175744_a((int)((Dca)object2).l()));
            mca3.J(((Dca)object2).J());
            xBa2 = xBa.func_178824_a((String)b2.J());
            if (xBa2 != null) {
                mca2.J(xBa2);
            }
        }
        if (b2.f() == 0 || b2.f() == yRa.d) {
            xBa xBa3 = xBa2 = b2.J().iterator();
            while (xBa3.hasNext()) {
                string = xBa2.next();
                xBa3 = xBa2;
                qca2.J(string, b2.f());
            }
        }
        if (b2.f() == AQa.P) {
            xBa xBa4 = xBa2 = b2.J().iterator();
            while (xBa4.hasNext()) {
                string = xBa2.next();
                xBa4 = xBa2;
                qca2.J(string, mca2);
            }
        }
        if (b2.f() == vRa.d) {
            qca2.l(mca2);
        }
    }

    public void J(mBa mBa2) {
        iMa_1 b2 = mBa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        if (iMa_12.J() != a2.j.c.Ha) {
            iMa_1 iMa_14 = a2;
            iMa_14.I = uSa.E;
            qca qca2 = iMa_14.C.J();
            iMa_1 iMa_15 = a2;
            a2.C = new Eoa((iMa)a2, new mZ(nqa.i, b2.J(), uSa.E != 0, a2.j.Ta.J().d(), b2.J()), b2.J(), b2.J(), a2.j.U);
            iMa_14.C.J(qca2);
            iMa_14.j.J(a2.C);
            iMa_14.j.c.Ha = b2.J();
            iMa_14.j.J((EC)new tna((iMa)a2));
        }
        iMa_1 iMa_16 = a2;
        iMa_16.j.J(b2.J());
        iMa_16.j.L.J(b2.J());
    }

    public void J(nba nba2) {
        iMa_1 a2;
        nba b2 = nba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)a2.j);
        iMa_12.j.c.J(b2.J(), vRa.d != 0);
        iMa_12.j.Ta.J().J(b2.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(tAa tAa2) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = v0.J((Gg)iMa_12.C);
        if (b2 != null) {
            if (a2.J() == wOa.h) {
                iMa_12.j.J().J((X)new gqa((GDa)b2));
                return;
            }
            b2.J(a2.J());
        }
    }

    public void J(cca cca2) {
        iMa_1 a2;
        iMa_1 b2 = cca2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        if (!Kpa.Z.isEmpty()) {
            ByteBuf byteBuf = Unpooled.buffer().writeBytes(String.join((CharSequence)Jra.f, Kpa.Z).getBytes(StandardCharsets.UTF_8));
            a2.E.J((KC)new Rba(dQa.fa, new Lca(byteBuf)));
        }
        iMa_1 iMa_13 = a2;
        iMa_1 iMa_14 = a2;
        iMa_1 iMa_15 = a2;
        iMa_15.j.R.k();
        iMa_15.j.L = new SF(a2.j, (iMa)a2);
        iMa_1 iMa_16 = a2;
        a2.C = new Eoa((iMa)a2, new mZ(nqa.i, b2.J(), uSa.E != 0, b2.J(), b2.J()), b2.J(), b2.J(), a2.j.U);
        iMa_15.j.z.Ma = b2.J();
        iMa_15.j.J(a2.C);
        iMa_15.j.c.Ha = b2.J();
        iMa_15.j.J((EC)new tna((iMa)a2));
        iMa_14.j.c.l(b2.l());
        iMa_13.L = b2.f();
        iMa_14.j.c.D(b2.f());
        iMa_13.j.L.J(b2.J());
        QS.J();
        iMa_13.j.z.e();
        iMa_13.E.J((KC)new Rba(xSa.Ja, new Lca(Unpooled.buffer()).writeString(jQa.J())));
        zU.M.f();
        if (iMa_13.E.C()) {
            a2.E.J(uSa.E != 0);
            if (OS.I != null) {
                a2.j.c.f(new StringBuilder().insert(3 & 4, Epa.a).append(OS.I).toString());
                OS.I = null;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(BAa bAa2) {
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = iMa_13.C.J(a2.J());
        if (!(b2 instanceof aaa)) {
            iMa_1 iMa_14 = b2 = new aaa();
            iMa_14.J((Gg)iMa_12.C);
            iMa_14.J(a2.J());
        }
        iMa_12.j.c.J((aaa)b2);
    }

    public Collection<Vna> J() {
        iMa_1 a2;
        return a2.A.values();
    }

    public void J(lAa lAa2) {
        iMa_1 b2 = lAa2;
        iMa_1 a2 = this;
        a2.j.Ya.J().J(b2.J().l().length() == 0 ? null : b2.J());
        a2.j.Ya.J().f(b2.f().l().length() == 0 ? null : b2.f());
    }

    public void J(FBa fBa2) {
        ANa a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        a2 = iMa_12.j.c;
        int b2 = v0.J();
        float f2 = v0.J();
        int n2 = Oz.J((float)(f2 + MQa.L));
        if (b2 >= 0 && b2 < FBa.A.length && FBa.A[b2] != null) {
            a2.f((ld)new CZ(FBa.A[b2], new Object[uSa.E]));
        }
        if (b2 == vRa.d) {
            iMa_1 iMa_14 = iMa_12;
            iMa_14.C.J().d(vRa.d != 0);
            iMa_14.C.J(JPa.N);
            return;
        }
        if (b2 == uqa.g) {
            iMa_1 iMa_15 = iMa_12;
            iMa_15.C.J().d(uSa.E != 0);
            iMa_15.C.J(pqa.r);
            return;
        }
        if (b2 == yRa.d) {
            iMa_12.j.L.J(Daa.getByID(n2));
            QS.J();
            return;
        }
        if (b2 == AQa.P) {
            iMa_12.j.J((EC)new uoa());
            return;
        }
        if (b2 == tTa.h) {
            Cia cia2 = iMa_12.j.z;
            if (f2 == JPa.N) {
                iMa_12.j.J((EC)new xna());
                return;
            }
            if (f2 == cPa.ha) {
                Object[] objectArray = new Object[AQa.P];
                objectArray[uSa.E] = Cia.J((int)cia2.jb.getKeyCode());
                objectArray[vRa.d] = Cia.J((int)cia2.L.getKeyCode());
                objectArray[uqa.g] = Cia.J((int)cia2.JA.getKeyCode());
                objectArray[yRa.d] = Cia.J((int)cia2.gd.getKeyCode());
                iMa_12.j.Ya.J().J((ld)new CZ(Nta.w, objectArray));
                return;
            }
            if (f2 == uQa.G) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Cia.J((int)cia2.ta.getKeyCode());
                iMa_12.j.Ya.J().J((ld)new CZ(nqa.fa, objectArray));
                return;
            }
            if (f2 == vRa.m) {
                Object[] objectArray = new Object[vRa.d];
                objectArray[uSa.E] = Cia.J((int)cia2.xc.getKeyCode());
                iMa_12.j.Ya.J().J((ld)new CZ(Qra.u, objectArray));
                return;
            }
        } else {
            if (b2 == uua.p) {
                iMa_12.C.J(a2.la, (double)(a2.Z + (double)a2.l()), (double)a2.A, aqa.t, fqa.w, KTa.r, uSa.E != 0);
                return;
            }
            if (b2 == XTa.W) {
                iMa_12.C.J(f2);
                return;
            }
            if (b2 == Yqa.i) {
                iMa_12.C.f(f2);
                return;
            }
            if (b2 == NTa.C) {
                iMa_1 iMa_16 = iMa_12;
                iMa_16.C.J(UZ.MOB_APPEARANCE, a2.la, (double)a2.Z, (double)a2.A, aSa.V, aSa.V, aSa.V, new int[uSa.E]);
                iMa_16.C.J(a2.la, (double)a2.Z, (double)a2.A, PTa.fa, pqa.r, pqa.r, uSa.E != 0);
            }
        }
    }

    public void J(DBa dBa2) {
        iMa_1 b2 = dBa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        if (iMa_12.J()) {
            if (b2.l() == 0) {
                a2.C.J(b2.J(), b2.f(), uSa.E != 0);
                return;
            }
            a2.C.J(b2.J(), b2.f(), vRa.d != 0);
        }
        iMa_1 iMa_14 = a2;
        iMa_14.C.f(b2.J() << AQa.P, uSa.E, b2.f() << AQa.P, (b2.J() << AQa.P) + Ypa.A, hra.Ja, (b2.f() << AQa.P) + Ypa.A);
        Faa faa2 = iMa_14.C.J(b2.J(), b2.f());
        faa2.J(b2.J(), b2.l(), b2.J());
        iMa_14.C.J(b2.J() << AQa.P, uSa.E, b2.f() << AQa.P, (b2.J() << AQa.P) + Ypa.A, hra.Ja, (b2.f() << AQa.P) + Ypa.A);
        if (!b2.J() || !(a2.C.F instanceof SX)) {
            faa2.i();
        }
    }

    public void J(eba eba2) {
        int b2;
        SAa[] a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        a2 = v0.J();
        int n2 = a2.length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            SAa sAa2 = a2[b2];
            iMa_12.C.f(sAa2.J(), sAa2.J());
            n3 = ++b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(RAa rAa2) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = v0.J((Gg)iMa_12.C);
        if (b2 != null) {
            b2.J((float)(a2.J() * aPa.Y) / Fpa.q);
        }
    }

    public void J(vca vca2) {
        Iterator a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_13.j);
        vL vL2 = iMa_13.C.J(a2.J());
        if (vL2 != null) {
            if (!(vL2 instanceof Gl)) {
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, MRa.r).append(vL2).append(hpa.b).toString());
            }
            vL2 = ((Gl)vL2).J();
            for (Object b2 : a2.J()) {
                bA bA2 = vL2.J(b2.J());
                if (bA2 == null) {
                    bA2 = vL2.J((RC)new Sda((RC)null, b2.J(), aSa.V, mSa.M, Bra.o));
                }
                bA bA3 = bA2;
                bA3.J(b2.J());
                bA3.J();
                Object object = b2 = b2.J().iterator();
                while (object.hasNext()) {
                    CEa cEa2 = (CEa)b2.next();
                    object = b2;
                    bA2.J(cEa2);
                }
            }
        }
    }

    public void J() {
        a.C = null;
    }

    public void J(uCa uCa2) {
        Hna hna2;
        List a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        double d2 = (double)v0.l() / hqa.ha;
        double d3 = (double)v0.C() / hqa.ha;
        double d4 = (double)v0.d() / hqa.ha;
        float f2 = (float)(v0.J() * aPa.Y) / Fpa.q;
        float f3 = (float)(v0.f() * aPa.Y) / Fpa.q;
        Hna b2 = new Hna((Gg)iMa_12.j.Ta, iMa_12.J(a2.J()).J());
        new Hna((Gg)iMa_12.j.Ta, iMa_12.J(a2.J()).J()).fa = a2.l();
        new Hna((Gg)iMa_12.j.Ta, iMa_12.J(a2.J()).J()).c = new Hna((Gg)iMa_12.j.Ta, iMa_12.J(a2.J()).J()).V = (double)new Hna((Gg)iMa_12.j.Ta, iMa_12.J(a2.J()).J()).fa;
        b2.l = a2.C();
        b2.ba = b2.Ga = (double)b2.l;
        Hna hna3 = b2;
        int n2 = a2.d();
        hna3.I = n2;
        hna3.r = hna3.Ca = (double)n2;
        int n3 = a2.f();
        if (n3 == 0) {
            Hna hna4 = b2;
            hna2 = hna4;
            b2.K.j[hna4.K.J] = null;
        } else {
            Hna hna5 = b2;
            hna2 = hna5;
            hna5.K.j[b2.K.J] = new Mda(eAa.l((int)n3), vRa.d, uSa.E);
        }
        hna2.l(d2, d3, d4, f2, f3);
        void v7 = a2;
        iMa_12.C.J(v7.J(), (vL)b2);
        a2 = v7.J();
        if (a2 != null) {
            b2.J().J(a2);
        }
        b2.S();
    }

    public void J(XCa xCa2) {
        iMa_1 b2 = xCa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        if (iMa_12.J() == uqa.g) {
            a2.j.Ya.J(b2.J(), uSa.E != 0);
            return;
        }
        a2.j.Ya.J().J(b2.J());
    }

    public void J(Oca oca2) {
        Oca b2 = oca2;
        iMa_1 a2 = this;
        Object object = b2;
        iMa_1 iMa_12 = a2;
        Vaa.J(object, iMa_12, (c)iMa_12.j);
        ((Oca)object).J(a2.C.J());
    }

    public void J(bCa bCa2) {
        iMa_1 b2 = bCa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        if (iMa_12.J()) {
            a2.j.Ta.l(b2.f(), b2.J(), b2.J());
            return;
        }
        a2.j.Ta.f(b2.f(), b2.J(), b2.J());
    }

    public void J(hCa hCa2) {
        iMa_1 b2 = hCa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        vL vL2 = iMa_12.J((Gg)a2.C);
        if (vL2 != null) {
            vL vL3 = vL2;
            vL3.fa += b2.l();
            vL3.l += b2.d();
            vL3.I += b2.f();
            double d2 = (double)vL3.fa / hqa.ha;
            double d3 = (double)vL3.l / hqa.ha;
            double d4 = (double)vL3.I / hqa.ha;
            float f2 = b2.f() ? (float)(b2.J() * aPa.Y) / Fpa.q : vL2.X;
            float f3 = b2.f() ? (float)(b2.C() * aPa.Y) / Fpa.q : vL2.d;
            vL vL4 = vL2;
            vL4.J(d2, d3, d4, f2, f3, yRa.d, uSa.E != 0);
            vL4.d(b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(bda bda2) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        for (PCa pCa2 : v0.J()) {
            if (a2.J() == gba.REMOVE_PLAYER) {
                iMa_12.A.remove(pCa2.J().getId());
                continue;
            }
            iMa_1 b2 = iMa_12.A.get(pCa2.J().getId());
            if (a2.J() == gba.ADD_PLAYER) {
                b2 = new Vna(pCa2);
                iMa_12.A.put(b2.J().getId(), (Vna)b2);
            }
            if (b2 == null) continue;
            switch (Cna.I[a2.J().ordinal()]) {
                case 1: {
                    iMa_1 iMa_14 = b2;
                    while (false) {
                    }
                    PCa pCa3 = pCa2;
                    iMa_14.J(pCa3.J());
                    iMa_14.l(pCa3.J());
                    break;
                }
                case 2: {
                    b2.J(pCa2.J());
                    break;
                }
                case 3: {
                    b2.l(pCa2.J());
                    break;
                }
                case 4: {
                    b2.J(pCa2.J());
                }
            }
        }
    }

    public void J(EBa eBa2) {
        iMa_1 a2;
        iMa_1 b2 = eBa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        vL vL2 = iMa_12.C.J(b2.f());
        if (vL2 != null) {
            if (b2.J() == 0) {
                ((Gl)vL2).u();
                return;
            }
            if (b2.J() == vRa.d) {
                vL2.G();
                return;
            }
            if (b2.J() == uqa.g) {
                ((Sx)vL2).J(uSa.E != 0, uSa.E != 0, uSa.E != 0);
                return;
            }
            if (b2.J() == AQa.P) {
                a2.j.f.J(vL2, UZ.CRIT);
                return;
            }
            if (b2.J() == tTa.h) {
                a2.j.f.J(vL2, UZ.CRIT_MAGIC);
            }
        }
    }

    public GameProfile J() {
        iMa_1 a2;
        return a2.g;
    }

    /*
     * WARNING - void declaration
     */
    public void J(bba bba2) {
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = iMa_13.C.J(a2.C());
        if (b2 != null) {
            iMa_1 iMa_14;
            iMa_1 iMa_15 = b2;
            void v2 = a2;
            ((vL)b2).fa = v2.l();
            ((vL)b2).l = v2.J();
            ((vL)b2).I = a2.f();
            double d2 = (double)((vL)b2).fa / hqa.ha;
            double d3 = (double)((vL)iMa_15).l / hqa.ha;
            double d4 = (double)((vL)iMa_15).I / hqa.ha;
            float f2 = (float)(a2.f() * aPa.Y) / Fpa.q;
            float f3 = (float)(a2.J() * aPa.Y) / Fpa.q;
            if (Math.abs(((vL)iMa_15).la - d2) < vQa.e && Math.abs(((vL)b2).Z - d3) < Asa.W && Math.abs(((vL)b2).A - d4) < vQa.e) {
                iMa_1 iMa_16 = b2;
                iMa_14 = iMa_16;
                iMa_1 iMa_17 = b2;
                iMa_17.J(((vL)iMa_16).la, ((vL)iMa_17).Z, ((vL)b2).A, f2, f3, yRa.d, vRa.d != 0);
            } else {
                iMa_1 iMa_18 = b2;
                iMa_14 = iMa_18;
                iMa_18.J(d2, d3, d4, f2, f3, yRa.d, vRa.d != 0);
            }
            iMa_14.d(a2.J());
        }
    }

    public void J(OBa oBa2) {
        String a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        a2 = v0.f();
        String b2 = v0.J();
        if (a2.isEmpty()) {
            iMa_12.j.J().J();
            return;
        }
        if (a2.startsWith(opa.fa)) {
            Object object = a2.substring(opa.fa.length());
            File file = new File(iMa_12.j.p, ZRa.p);
            if (((File)(object = new File(file, (String)object))).isFile()) {
                iMa_1 iMa_13 = iMa_12;
                iMa_13.E.J((KC)new JAa(b2, Eba.ACCEPTED));
                Futures.addCallback(iMa_13.j.J().J((File)object), new uma((iMa)iMa_12, b2));
                return;
            }
            iMa_12.E.J((KC)new JAa(b2, Eba.FAILED_DOWNLOAD));
            return;
        }
        if (pv.J() || iMa_12.j.J() != null && iMa_12.j.J().J() == poa.ENABLED) {
            iMa_1 iMa_14 = iMa_12;
            iMa_14.E.J((KC)new JAa(b2, Eba.ACCEPTED));
            Futures.addCallback(iMa_14.j.J().J(a2, b2), new TLa((iMa)iMa_12, b2));
            return;
        }
        if (iMa_12.j.J() != null && iMa_12.j.J().J() != poa.PROMPT) {
            iMa_12.E.J((KC)new JAa(b2, Eba.DECLINED));
            return;
        }
        iMa_12.j.J((Runnable)new JMa((iMa)iMa_12, b2, a2));
    }

    public void J(hba hba2) {
        iMa_1 a2;
        iMa_1 b2 = hba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        vL vL2 = iMa_12.C.J(b2.J());
        if (vL2 != null && b2.J() != null) {
            vL2.J().J(b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(Xaa xaa2) {
        iMa_1 b2;
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        double d2 = (double)v0.J() / hqa.ha;
        double d3 = (double)v0.d() / hqa.ha;
        double d4 = (double)v0.M() / hqa.ha;
        float f2 = (float)(v0.J() * aPa.Y) / Fpa.q;
        float f3 = (float)(v0.l() * aPa.Y) / Fpa.q;
        iMa_1 iMa_14 = b2 = (Gl)PIa.J((int)v0.i(), (Gg)iMa_12.j.Ta);
        void v3 = a2;
        ((Gl)b2).fa = a2.J();
        ((Gl)b2).l = v3.d();
        ((Gl)iMa_14).I = v3.M();
        ((Gl)iMa_14).ba = ((Gl)iMa_14).t = (float)(a2.f() * aPa.Y) / Fpa.q;
        vL[] vLArray = b2.J();
        if (vLArray != null) {
            int n2;
            int n3 = a2.f() - b2.M();
            int n4 = n2 = uSa.E;
            while (n4 < vLArray.length) {
                vL vL2 = vLArray[n2];
                int n5 = vLArray[n2].M();
                vL2.l(n5 + n3);
                n4 = ++n2;
            }
        }
        iMa_1 iMa_15 = b2;
        void v8 = a2;
        iMa_1 iMa_16 = b2;
        b2.l(a2.f());
        iMa_16.l(d2, d3, d4, f2, f3);
        iMa_16.f((float)a2.l() / RPa.l);
        iMa_15.J((float)v8.C() / RPa.l);
        iMa_15.l((float)v8.e() / RPa.l);
        void v10 = a2;
        iMa_12.C.J(v10.f(), (vL)b2);
        List list = v10.J();
        if (list != null) {
            b2.J().J(list);
        }
    }

    public void J(Sca sca2) {
        iMa_1 a2;
        Sca b2 = sca2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        WFa wFa2 = new WFa((Gg)a2.C, b2.J(), b2.J(), b2.J());
        a2.C.J(b2.J(), (vL)wFa2);
    }

    public void J(dda dda2) {
        int n2;
        iMa_1 b2 = dda2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        if (iMa_12.J() == 0) {
            iMa_1 iMa_14 = b2;
            iMa_1 iMa_15 = b2;
            double d2 = iMa_14.f() * iMa_15.J();
            double d3 = iMa_14.f() * b2.l();
            double d4 = iMa_15.f() * b2.C();
            try {
                a2.C.J(b2.J(), b2.J(), b2.l(), b2.f(), b2.J(), d2, d3, d4, b2.J());
                return;
            }
            catch (Throwable throwable) {
                k.warn(new StringBuilder().insert(5 >> 3, xua.Ja).append(b2.J()).toString());
                return;
            }
        }
        int n3 = n2 = uSa.E;
        while (n3 < b2.J()) {
            iMa_1 iMa_16 = a2;
            double d5 = iMa_16.J.nextGaussian() * (double)b2.J();
            double d6 = iMa_16.J.nextGaussian() * (double)b2.l();
            double d7 = iMa_16.J.nextGaussian() * (double)b2.C();
            double d8 = iMa_16.J.nextGaussian() * (double)b2.f();
            double d9 = iMa_16.J.nextGaussian() * (double)b2.f();
            double d10 = iMa_16.J.nextGaussian() * (double)b2.f();
            try {
                a2.C.J(b2.J(), b2.J(), b2.l() + d5, b2.f() + d6, b2.J() + d7, d8, d9, d10, b2.J());
            }
            catch (Throwable throwable) {
                k.warn(new StringBuilder().insert(5 >> 3, xua.Ja).append(b2.J()).toString());
                return;
            }
            n3 = ++n2;
        }
    }

    public void J(jca jca2) {
        iMa_1 a2;
        iMa_1 b2 = jca2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        vL vL2 = iMa_12.C.J(b2.J());
        if (vL2 instanceof Gl) {
            ((Gl)vL2).i(b2.f());
        }
    }

    public void J(UBa object) {
        iMa_1 b2 = object;
        object = this;
    }

    public void J(WCa wCa2) {
        iMa_1 b2 = wCa2;
        iMa_1 a2 = this;
        if (!a2.E.d()) {
            a2.E.J(b2.J());
        }
    }

    public void J(GBa gBa2) {
        iMa_1 a2;
        iMa_1 b2 = gBa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        ANa aNa2 = iMa_12.j.c;
        if (aNa2.G != null && aNa2.G.k == b2.f()) {
            aNa2.G.J(b2.l(), b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(QCa qCa) {
        int b2;
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_13.j);
        int n2 = b2 = uSa.E;
        while (n2 < a2.J().length) {
            iMa_12.C.f(a2.J()[b2++]);
            n2 = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(yba yba2) {
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_12.j);
        iMa_1 b2 = iMa_13.C.J(a2.f());
        Gl gl2 = (Gl)iMa_13.C.J(a2.J());
        if (gl2 == null) {
            gl2 = iMa_12.j.c;
        }
        if (b2 != null) {
            iMa_1 iMa_14;
            if (b2 instanceof zEa) {
                iMa_1 iMa_15 = iMa_12;
                iMa_14 = iMa_15;
                iMa_15.C.J((vL)b2, Nta.X, psa.N, ((iMa_12.J.nextFloat() - iMa_12.J.nextFloat()) * ZSa.q + pqa.r) * kta.v);
            } else {
                iMa_1 iMa_16 = iMa_12;
                iMa_14 = iMa_16;
                iMa_16.C.J((vL)b2, FRa.ba, psa.N, ((iMa_12.J.nextFloat() - iMa_12.J.nextFloat()) * ZSa.q + pqa.r) * kta.v);
            }
            iMa_14.j.f.J((ska)new ZMa((Gg)iMa_12.C, (vL)b2, (vL)gl2, MQa.L));
            iMa_12.C.f(a2.f());
        }
    }

    public void J(HCa hCa2) {
        zEa zEa2;
        iMa_1 a2;
        iMa_1 b2 = hCa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        zEa zEa3 = zEa2 = new zEa((Gg)a2.C, (double)b2.C() / hqa.ha, (double)b2.f() / hqa.ha, (double)b2.d() / hqa.ha, b2.l());
        iMa_1 iMa_13 = b2;
        zEa2.fa = iMa_13.C();
        zEa3.l = iMa_13.f();
        zEa3.I = b2.d();
        zEa2.X = JPa.N;
        zEa2.d = JPa.N;
        zEa2.l(b2.J());
        a2.C.J(b2.J(), (vL)zEa2);
    }

    public void J(pAa pAa2) {
        iMa_1 b2 = pAa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        b2 = iMa_12.J((Gg)a2.C);
        if (b2 != null) {
            a2.j.J((vL)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ZAa zAa) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = v0.J((Gg)iMa_12.C);
        if (b2 != null) {
            b2.d(a2.J());
        }
    }

    public void J(yAa yAa2) {
        Ega ega2;
        iMa_1 b2 = yAa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        Ega ega3 = null;
        ANa aNa2 = a2.j.c;
        if (iMa_12.J() == 0) {
            ega2 = ega3 = aNa2.x;
        } else {
            if (b2.J() == aNa2.G.k) {
                ega3 = aNa2.G;
            }
            ega2 = ega3;
        }
        if (ega2 != null && !b2.J()) {
            a2.J((KC)new gAa(b2.J(), b2.J(), vRa.d != 0));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J(Cda cda2) {
        int n2;
        void a2;
        iMa_1 iMa_12;
        block43: {
            iMa_12 = this;
            void v0 = a2;
            iMa_1 iMa_13 = iMa_12;
            Vaa.J(v0, iMa_13, (c)iMa_13.j);
            String b2 = v0.J();
            int n3 = pua.o;
            switch (b2.hashCode()) {
                case -37059198: {
                    if (!b2.equals(dpa.l)) break;
                    n2 = n3 = uSa.E;
                    break block43;
                }
                case -294893183: {
                    if (!b2.equals(xSa.Ja)) break;
                    n2 = n3 = vRa.d;
                    break block43;
                }
                case -295921722: {
                    if (!b2.equals(yRa.m)) break;
                    n2 = n3 = uqa.g;
                    break block43;
                }
                case -2024868383: {
                    if (!b2.equals(zpa.W)) break;
                    n2 = n3 = yRa.d;
                    break block43;
                }
                case 2487698: {
                    if (!b2.equals(Ssa.O)) break;
                    n2 = n3 = AQa.P;
                    break block43;
                }
                case 1601523583: {
                    if (!b2.equals(URa.Y)) break;
                    n2 = n3 = tTa.h;
                    break block43;
                }
                case 1498789718: {
                    if (!b2.equals(aqa.k)) break;
                    n2 = n3 = uua.p;
                    break block43;
                }
                case 1336468058: {
                    if (!b2.equals(Hra.Ja)) break;
                    n2 = n3 = XTa.W;
                    break block43;
                }
                case 1111166046: {
                    if (!b2.equals(Upa.ja)) break;
                    n2 = n3 = Yqa.i;
                    break block43;
                }
                case -1565815470: {
                    if (!b2.equals(psa.Q)) break;
                    n2 = n3 = WOa.fa;
                    break block43;
                }
                case 420002212: {
                    if (!b2.equals(EPa.b)) break;
                    n2 = n3 = NTa.C;
                    break block43;
                }
                case 1448035176: {
                    if (!b2.equals(kTa.F)) break;
                    n2 = n3 = pPa.f;
                    break block43;
                }
                case 479126119: {
                    if (!b2.equals(NQa.M)) break;
                    n2 = n3 = lqa.s;
                    break block43;
                }
                case 759553291: {
                    if (!b2.equals(lTa.H)) break;
                    n3 = uua.s;
                }
            }
            n2 = n3;
        }
        switch (n2) {
            case 0: {
                Lca lca = a2.J();
                try {
                    int b2 = lca.readInt();
                    EC eC2 = iMa_12.j.ta;
                    if (!(eC2 instanceof UNa)) return;
                    if (b2 != iMa_12.j.c.G.k) return;
                    eC2 = ((UNa)eC2).J();
                    GY gY2 = GY.readFromBuf((Lca)lca);
                    eC2.J(gY2);
                    return;
                }
                catch (IOException b2) {
                    k.error(JPa.P, (Throwable)b2);
                    return;
                }
                finally {
                    lca.release();
                }
            }
            case 1: {
                iMa_12.j.c.l(a2.J().readStringFromBuffer(BQa.h));
                return;
            }
            case 2: {
                Mda mda2 = iMa_12.j.c.f();
                if (mda2 == null) return;
                if (mda2.J() != Gea.sb) return;
                iMa_12.j.J((EC)new HOa((Sx)iMa_12.j.c, mda2, uSa.E != 0));
                return;
            }
            case 3: {
                iMa_12.M = a2.J().readVarIntFromBuffer();
                return;
            }
            case 4: {
                iMa_12.J((KC)new Rba(oua.Ga, a2.J()));
                return;
            }
            case 5: {
                if (iMa_12.j.c.V()) return;
                iMa_12.J((KC)new Rba(Bta.Y, new Lca(Unpooled.EMPTY_BUFFER)));
                return;
            }
            case 6: {
                String string = a2.J().readStringFromBuffer(osa.Ja);
                if (!string.equals(Ypa.l)) return;
                iMa_12.j.Ta.E.J = a2.J().readBoolean();
                return;
            }
            case 7: {
                try {
                    iMa_12.j.R.J(a2.J().readItemStackFromBuffer());
                    return;
                }
                catch (IOException iOException) {
                    k.error(WQa.I, (Throwable)iOException);
                    return;
                }
            }
            case 8: {
                OT.i.J.J((Cda)a2);
                return;
            }
            case 9: {
                zU.M.J((Cda)a2);
                return;
            }
            case 10: {
                switch (a2.J().readInt()) {
                    case 1: {
                        iMa_12.j.oa = LQa.ha;
                        iMa_12.j.f();
                        return;
                    }
                    case 2: {
                        iMa_12.j.m();
                        return;
                    }
                }
                iMa_12.j.i = uSa.E;
                iMa_12.j.g = LQa.ha;
                iMa_12.j.E();
                return;
            }
            case 11: {
                iMa_12.j.J().C();
                return;
            }
            case 12: {
                WF.J((Cda)a2);
                return;
            }
            case 13: {
                qf.J().J((Cda)a2);
                return;
            }
        }
    }

    public void J(Iba iba2) {
        iMa_1 a2;
        iMa_1 b2 = iba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        qca qca2 = iMa_12.C.J();
        iMa_1 iMa_13 = b2;
        ica ica2 = qca2.J(iMa_13.J());
        if (iMa_13.J() == pba.CHANGE) {
            qca2.J(b2.f(), ica2).J(b2.J());
            return;
        }
        if (b2.J() == pba.REMOVE) {
            if (Ez.J((String)b2.J())) {
                qca2.J(b2.f(), (ica)null);
                return;
            }
            if (ica2 != null) {
                qca2.J(b2.f(), ica2);
            }
        }
    }

    public void J(Jca jca2) {
        iMa_1 a2;
        iMa_1 b2 = jca2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        ANa aNa2 = iMa_12.j.c;
        if (qta.x.equals(b2.J())) {
            aNa2.J((HA)new yDa(b2.J(), b2.J()));
            aNa2.G.k = b2.f();
            return;
        }
        if (zua.M.equals(b2.J())) {
            ANa aNa3 = aNa2;
            aNa3.J((Dc)new Cha((Sx)aNa3, b2.J()));
            aNa3.G.k = b2.f();
            return;
        }
        if (fqa.S.equals(b2.J())) {
            vL vL2 = a2.C.J(b2.l());
            if (vL2 instanceof Rea) {
                aNa2.J((Rea)vL2, (HA)new GFa(b2.J(), b2.J()));
                aNa2.G.k = b2.f();
                return;
            }
        } else {
            if (!b2.J()) {
                aNa2.J((xA)new cLa(b2.J(), b2.J()));
                aNa2.G.k = b2.f();
                return;
            }
            dKa dKa2 = new dKa(b2.J(), b2.J(), b2.J());
            aNa2.J((HA)dKa2);
            aNa2.G.k = b2.f();
        }
    }

    public void J(Fba fba2) {
        iMa_1 a2;
        iMa_1 b2 = fba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        iMa_12.j.Ta.J(b2.f(), b2.J(), b2.J());
    }

    public void J(KC kC2) {
        KC b2 = kC2;
        iMa_1 a2 = this;
        a2.E.J(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(zBa zBa2) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = iMa_12.j.c;
        if (v0.J() == 0) {
            ((Sx)((Object)b2)).x.J(a2.J());
            return;
        }
        if (a2.J() == ((Sx)((Object)b2)).G.k) {
            ((Sx)((Object)b2)).G.J(a2.J());
        }
    }

    public void J(oba oba2) {
        iMa_1 a2;
        iMa_1 b2 = oba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)a2.j);
        iMa_12.j.Ta.J().J(b2.J());
        iMa_12.j.Ta.J().f(b2.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(VCa vCa2) {
        int n2;
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_13.j);
        int n3 = n2 = uSa.E;
        while (n3 < a2.J()) {
            void v2 = a2;
            int b2 = v2.J(n2);
            int n4 = v2.f(n2);
            iMa_1 iMa_14 = iMa_12;
            iMa_12.C.J(b2, n4, vRa.d != 0);
            iMa_14.C.f(b2 << AQa.P, uSa.E, n4 << AQa.P, (b2 << AQa.P) + Ypa.A, hra.Ja, (n4 << AQa.P) + Ypa.A);
            Faa faa2 = iMa_14.C.J(b2, n4);
            faa2.J(a2.J(n2), a2.l(n2), vRa.d != 0);
            iMa_14.C.J(b2 << AQa.P, uSa.E, n4 << AQa.P, (b2 << AQa.P) + Ypa.A, hra.Ja, (n4 << AQa.P) + Ypa.A);
            if (!(iMa_14.C.F instanceof SX)) {
                faa2.i();
            }
            n3 = ++n2;
        }
    }

    public void J(AAa aAa2) {
        Object b2 = aAa2;
        iMa_1 a2 = this;
        Object object = b2;
        iMa_1 iMa_12 = a2;
        Vaa.J(object, iMa_12, (c)iMa_12.j);
        b2 = Yba.J((int)((AAa)object).J(), (Gg)a2.j.Ta);
        ((AAa)object).J((dW)b2);
        a2.j.R.J().J((dW)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(lba lba2) {
        void v5;
        void v4;
        void v3;
        Lca a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        void v1 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v1, iMa_13, (c)iMa_13.j);
        iMa_1 b2 = iMa_12.j.c;
        double d2 = v0.l();
        double d3 = v1.f();
        double d4 = v0.J();
        float f2 = v0.J();
        float f3 = v0.f();
        if (v0.J().contains((Object)WAa.X)) {
            d2 += ((Sx)((Object)b2)).la;
            v3 = a2;
        } else {
            b2.f(aSa.V);
            v3 = a2;
        }
        if (v3.J().contains((Object)WAa.Y)) {
            d3 += ((Sx)((Object)b2)).Z;
            v4 = a2;
        } else {
            b2.J(aSa.V);
            v4 = a2;
        }
        if (v4.J().contains((Object)WAa.Z)) {
            d4 += ((Sx)((Object)b2)).A;
            v5 = a2;
        } else {
            b2.l(aSa.V);
            v5 = a2;
        }
        if (v5.J().contains((Object)WAa.X_ROT)) {
            f3 += ((Sx)((Object)b2)).d;
        }
        if (a2.J().contains((Object)WAa.Y_ROT)) {
            f2 += ((Sx)((Object)b2)).X;
        }
        if (iMa_12.M != 0) {
            a2 = new Lca(Unpooled.buffer(tTa.h));
            iMa_1 iMa_14 = iMa_12;
            a2.writeVarIntToBuffer(iMa_14.M);
            iMa_14.E.J((KC)new Rba(zpa.W, a2));
            iMa_14.M = uSa.E;
        }
        b2.l(d2, d3, d4, f2, f3);
        iMa_1 iMa_15 = iMa_12;
        iMa_1 iMa_16 = b2;
        iMa_15.E.J((KC)new QAa(((Sx)((Object)b2)).la, b2.J().j, (double)((Sx)((Object)b2)).A, (float)((Sx)((Object)iMa_16)).X, (float)((Sx)((Object)iMa_16)).d, uSa.E != 0));
        if (!iMa_15.I) {
            iMa_12.j.c.c = iMa_12.j.c.la;
            iMa_12.j.c.ba = iMa_12.j.c.Z;
            iMa_12.j.c.r = iMa_12.j.c.A;
            iMa_12.I = vRa.d;
            iMa_12.j.J((EC)null);
        }
    }

    public void J(vaa vaa2) {
        iMa_1 a2;
        iMa_1 b2 = vaa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        iMa_12.j.c.J(b2.J(), b2.J(), b2.f());
    }

    public void J(nCa nCa2) {
        iMa_1 a2;
        nCa b2 = nCa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        iMa_12.j.c.V();
    }

    public void J(ICa iCa2) {
        uY uY2;
        iMa_1 a2;
        ICa b2 = iCa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        int n2 = uSa.E;
        if (iMa_12.j.Ta.F(b2.J()) && (uY2 = a2.j.Ta.J(b2.J())) instanceof aaa) {
            if ((uY2 = (aaa)uY2).J()) {
                uY uY3 = uY2;
                System.arraycopy(b2.J(), uSa.E, uY3.J, uSa.E, AQa.P);
                uY3.f();
            }
            n2 = vRa.d;
        }
        if (n2 == 0 && a2.j.c != null) {
            Object[] objectArray = new Object[yRa.d];
            objectArray[uSa.E] = b2.J().getX();
            objectArray[vRa.d] = b2.J().getY();
            objectArray[uqa.g] = b2.J().getZ();
            k.warn(vqa.g, objectArray);
        }
    }

    public void J(tba tba2) {
        QNa qNa2;
        iMa_1 b2 = tba2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        ANa aNa2 = a2.j.c;
        if (iMa_12.f() == pua.o) {
            aNa2.K.J(b2.J());
            return;
        }
        int n2 = uSa.E;
        if (a2.j.ta instanceof QNa) {
            qNa2 = (QNa)a2.j.ta;
            int n3 = n2 = qNa2.J() != yGa.L.l() ? vRa.d : uSa.E;
        }
        if (b2.f() == 0 && b2.J() >= Qsa.Ha && b2.J() < wra.e) {
            qNa2 = aNa2.x.J(b2.J()).J();
            if (b2.J() != null && (qNa2 == null || qNa2.E < b2.J().E)) {
                b2.J().i = tTa.h;
            }
            ANa aNa3 = aNa2;
            aNa3.x.J(b2.J(), b2.J());
            if (aNa3.l() != null && aNa2.l() == qNa2 && Mda.J((Mda)b2.J(), (Mda)qNa2)) {
                a2.J((KC)new Rba(Bta.Y, new Lca(Unpooled.EMPTY_BUFFER)));
                aNa2.Q();
                return;
            }
        } else if (b2.f() == aNa2.G.k && (b2.f() != 0 || n2 == 0)) {
            aNa2.G.J(b2.J(), b2.J());
        }
    }

    public void J(ld ld2) {
        iMa_1 b2 = ld2;
        iMa_1 a2 = this;
        a2.j.J((Eoa)null);
        k.info(new StringBuilder().insert(3 >> 2, SQa.Ha).append(b2.f()).toString());
        if (a2.i != null) {
            int n2;
            if (a2.E.J() != null && (n2 = kMa.J((String)a2.E.J().split(Era.Aa)[uSa.E].toLowerCase())) != pua.o) {
                iMa_1 iMa_12 = a2;
                a2.j.J((EC)new kMa(iMa_12.i, iMa_12.j, n2, (ld)b2));
                return;
            }
            a2.j.J((EC)new Toa(a2.i, vTa.j, (ld)b2));
            return;
        }
        a2.j.J((EC)new Toa((EC)new uLa((EC)new Moa()), vTa.j, (ld)b2));
    }

    public static /* synthetic */ Kpa J(iMa a2) {
        return a2.j;
    }

    public void J(mda mda2) {
        iMa_1 b2 = mda2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        if (iMa_12.J() >= 0 && b2.J() < kea.C()) {
            a2.j.c.K.J = b2.J();
        }
    }

    public void J(Mba mba2) {
        iMa_1 a2;
        iMa_1 b2 = mba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)a2.j);
        iMa_12.j.Ta.J(b2.J());
        iMa_12.j.Ta.f(b2.f());
    }

    public uba J() {
        iMa_1 a2;
        return a2.E;
    }

    public void J(cCa cCa2) {
        iMa_1 a2;
        cCa b2 = cCa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        vL vL2 = iMa_12.C.J(b2.f());
        if (vL2 instanceof Gl) {
            kba kba2 = new kba((int)b2.f(), b2.J(), (int)b2.J(), uSa.E != 0, b2.J());
            kba2.J(b2.f());
            ((Gl)vL2).J(kba2);
        }
    }

    public static /* synthetic */ Kpa J(iMa iMa2, Kpa kpa2) {
        iMa b2 = kpa2;
        iMa a2 = iMa2;
        a2.j = b2;
        return a2.j;
    }

    public void J(LAa lAa2) {
        String[] b2 = lAa2;
        String[] a2 = this;
        Vaa.J(b2, a2, (c)a2.j);
        b2 = b2.J();
        if (a2.j.ta instanceof Xoa) {
            ((Xoa)a2.j.ta).J(b2);
        }
    }

    public void J(Kda kda2) {
        iMa_1 a2;
        iMa_1 b2 = kda2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        vL vL2 = iMa_12.C.J(b2.J());
        if (vL2 != null) {
            vL2.f(b2.f(), b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public iMa_1(Kpa kpa2, EC eC2, uba uba2, GameProfile gameProfile) {
        GameProfile e2;
        void b2;
        void c2;
        void d2;
        iMa_1 a2;
        iMa_1 iMa_12 = gameProfile2;
        GameProfile gameProfile2 = gameProfile;
        iMa_1 iMa_13 = a2 = iMa_12;
        iMa_1 iMa_14 = a2;
        a2.A = Maps.newHashMap();
        a2.L = kTa.j;
        a2.m = uSa.E;
        iMa_1 iMa_15 = a2;
        a2.J = new Random();
        iMa_14.j = d2;
        iMa_14.i = c2;
        iMa_13.E = b2;
        iMa_13.g = e2;
    }

    /*
     * WARNING - void declaration
     */
    public Vna J(String string) {
        iMa_1 iMa_12 = this;
        for (Vna vna2 : iMa_12.A.values()) {
            void a2;
            if (!vna2.J().getName().equals(a2)) continue;
            return vna2;
        }
        return null;
    }

    public void J(Eca eca2) {
        iMa_1 a2;
        iMa_1 b2 = eca2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        iMa_12.j.Ta.f(b2.J(), b2.J(), b2.J(), b2.f());
    }

    public void J(LCa lCa) {
        iMa_1 b2 = lCa;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        iMa_12.J((Gg)a2.C).J(b2.J());
    }

    public void J(JBa jBa2) {
        vL[] vLArray;
        Object object;
        iMa_1 b2 = jBa2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        double d2 = (double)iMa_12.D() / hqa.ha;
        double d3 = (double)iMa_12.C() / hqa.ha;
        double d4 = (double)iMa_12.l() / hqa.ha;
        Object object2 = null;
        if (iMa_12.A() == NTa.C) {
            object = object2 = Yea.J((Gg)a2.C, (double)d2, (double)d3, (double)d4, (Rda)Rda.byNetworkID((int)b2.f()));
        } else if (b2.A() == Jsa.ha) {
            vLArray = a2.C.J(b2.f());
            if (vLArray instanceof Sx) {
                object2 = new Fga((Gg)a2.C, d2, d3, d4, (Sx)vLArray);
            }
            b2.d(uSa.E);
            object = object2;
        } else if (b2.A() == Psa.M) {
            object = object2 = new jea((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == tua.w) {
            object = object2 = new Pda((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == hqa.K) {
            object = object2 = new FEa((Gg)a2.C, new XF(Oz.f((double)d2), Oz.f((double)d3), Oz.f((double)d4)), DZ.getHorizontal(b2.f()));
            b2.d(uSa.E);
        } else if (b2.A() == uqa.b) {
            object = object2 = new Nia((Gg)a2.C, new XF(Oz.f((double)d2), Oz.f((double)d3), Oz.f((double)d4)));
            b2.d(uSa.E);
        } else if (b2.A() == fPa.ga) {
            object = object2 = new Dfa((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == Eqa.Ka) {
            object = object2 = new tDa((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == NPa.i) {
            object = object2 = new gea((Gg)a2.C, d2, d3, d4, (Mda)null);
        } else if (b2.A() == Ssa.u) {
            object = object2 = new xDa((Gg)a2.C, d2, d3, d4, (double)b2.G() / Zta.C, (double)b2.e() / Zta.C, (double)b2.d() / Zta.C);
            b2.d(uSa.E);
        } else if (b2.A() == ysa.s) {
            object = object2 = new ZDa((Gg)a2.C, d2, d3, d4, (double)b2.G() / Zta.C, (double)b2.e() / Zta.C, (double)b2.d() / Zta.C);
            b2.d(uSa.E);
        } else if (b2.A() == SPa.T) {
            object = object2 = new afa((Gg)a2.C, d2, d3, d4, (double)b2.G() / Zta.C, (double)b2.e() / Zta.C, (double)b2.d() / Zta.C);
            b2.d(uSa.E);
        } else if (b2.A() == ITa.V) {
            object = object2 = new WEa((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == Pua.Ka) {
            object = object2 = new kDa((Gg)a2.C, d2, d3, d4, b2.f());
            b2.d(uSa.E);
        } else if (b2.A() == jRa.X) {
            object = object2 = new CDa((Gg)a2.C, d2, d3, d4);
            b2.d(uSa.E);
        } else if (b2.A() == vRa.d) {
            object = object2 = new Wda((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == vpa.o) {
            object = object2 = new vFa((Gg)a2.C, d2, d3, d4, null);
        } else if (b2.A() == RQa.b) {
            object = object2 = new Oea((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == cPa.Q) {
            object = object2 = new sFa((Gg)a2.C, d2, d3, d4);
        } else if (b2.A() == uqa.g) {
            object = object2 = new jFa((Gg)a2.C, d2, d3, d4);
        } else {
            if (b2.A() == NPa.e) {
                object2 = new aga((Gg)a2.C, d2, d3, d4, Block.f(b2.f() & yQa.j));
                b2.d(uSa.E);
            }
            object = object2;
        }
        if (object != null) {
            iMa_1 iMa_14 = b2;
            Yea yea2 = object2;
            yea2.fa = b2.D();
            yea2.l = b2.C();
            object2.I = iMa_14.l();
            object2.d = (float)(iMa_14.i() * aPa.Y) / Fpa.q;
            object2.X = (float)(b2.J() * aPa.Y) / Fpa.q;
            vLArray = object2.J();
            if (vLArray != null) {
                int n2;
                int n3 = b2.M() - object2.M();
                int n4 = n2 = uSa.E;
                while (n4 < vLArray.length) {
                    vL vL2 = vLArray[n2];
                    int n5 = vLArray[n2].M();
                    vL2.l(n5 + n3);
                    n4 = ++n2;
                }
            }
            object2.l(b2.M());
            iMa_1 iMa_15 = b2;
            a2.C.J(iMa_15.M(), (vL)object2);
            if (iMa_15.f() > 0) {
                vL vL3;
                if (b2.A() == Psa.M && (vL3 = a2.C.J(b2.f())) instanceof Gl && object2 instanceof jea) {
                    ((jea)object2).f = vL3;
                }
                object2.d((double)b2.G() / Zta.C, (double)b2.e() / Zta.C, (double)b2.d() / Zta.C);
            }
        }
    }

    public void J(fAa fAa2) {
        iMa_1 a2;
        iMa_1 b2 = fAa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        ANa aNa2 = iMa_12.j.c;
        aNa2.h.f(b2.J());
        aNa2.h.l(b2.f());
        aNa2.h.M = b2.l();
        aNa2.h.J(b2.C());
        aNa2.h.J(b2.f());
        aNa2.h.f(b2.J());
    }

    public Vna J(UUID uUID) {
        UUID b2 = uUID;
        iMa_1 a2 = this;
        return a2.A.get(b2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(oAa oAa2) {
        Iterator iterator;
        void a22;
        iMa_1 iMa_12 = this;
        void v0 = a22;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        int a22 = uSa.E;
        Iterator iterator2 = iterator = v0.J().entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = iterator.next();
            iMa_1 b2 = (aX)entry.getKey();
            int n2 = (Integer)entry.getValue();
            if (b2.J() && n2 > 0) {
                if (iMa_12.m && iMa_12.j.c.J().J((aX)b2) == 0) {
                    gY gY2 = (gY)b2;
                    iMa_12.j.Za.J(gY2);
                    if (b2 == mY.q) {
                        iMa_12.j.z.Z = uSa.E;
                        iMa_12.j.z.d();
                    }
                }
                a22 = vRa.d;
            }
            iMa_12.j.c.J().f((Sx)iMa_12.j.c, (aX)b2, n2);
            iterator2 = iterator;
        }
        if (!iMa_12.m && a22 == 0 && iMa_12.j.z.Z) {
            iMa_12.j.Za.f(mY.q);
        }
        iMa_12.m = vRa.d;
        if (iMa_12.j.ta instanceof wb) {
            ((wb)iMa_12.j.ta).f();
        }
    }

    public void J(iCa iCa2) {
        iMa_1 a2;
        iMa_1 b2 = iCa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)a2.j);
        a2.j.c.G(b2.f());
        iMa_12.j.c.J().J(b2.J());
        iMa_12.j.c.J().f(b2.J());
    }

    public void J(wba wba2) {
        iMa_1 a2;
        iMa_1 b2 = wba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        iMa_12.C.f(b2.J(), b2.J());
    }

    public void J(ABa aBa2) {
        iMa_1 a2;
        iMa_1 b2 = aBa2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        iMa_12.j.Ta.J(b2.f(), b2.J(), b2.l(), b2.J(), b2.f(), b2.J(), uSa.E != 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(Gca gca) {
        iMa_1 iMa_12;
        Gca b2 = gca;
        iMa_1 a2 = this;
        Object object = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(object, iMa_13, (c)iMa_13.j);
        aba aba2 = ((Gca)object).J();
        String string = null;
        String string2 = null;
        String string3 = ((Gca)object).J() != null ? b2.J().l() : Mqa.y;
        switch (Cna.A[aba2.ordinal()]) {
            case 1: {
                string = string3;
                iMa_12 = a2;
                break;
            }
            case 2: {
                string2 = string3;
                iMa_12 = a2;
                break;
            }
            case 3: {
                iMa_1 iMa_14 = a2;
                iMa_14.j.Ya.J(Mqa.y, Mqa.y, pua.o, pua.o, pua.o);
                iMa_14.j.Ya.J();
                return;
            }
            default: {
                iMa_12 = a2;
            }
        }
        iMa_12.j.Ya.J(string, string2, b2.f(), b2.l(), b2.J());
    }

    public void J(Jda jda2) {
        iMa_1 b2 = jda2;
        iMa_1 a2 = this;
        iMa_1 iMa_12 = b2;
        iMa_1 iMa_13 = a2;
        Vaa.J(iMa_12, iMa_13, (c)iMa_13.j);
        qca qca2 = a2.C.J();
        if (iMa_12.J() == 0) {
            ica ica2;
            ica ica3 = ica2 = qca2.J(b2.J(), lb.j);
            ica3.J(b2.f());
            ica3.J(b2.J());
            return;
        }
        ica ica4 = qca2.J(b2.J());
        if (b2.J() == vRa.d) {
            qca2.f(ica4);
            return;
        }
        if (b2.J() == uqa.g) {
            ica ica5 = ica4;
            ica5.J(b2.f());
            ica5.J(b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(hda hda2) {
        void a2;
        iMa_1 iMa_12 = this;
        void v0 = a2;
        iMa_1 iMa_13 = iMa_12;
        Vaa.J(v0, iMa_13, (c)iMa_13.j);
        double d2 = (double)v0.J() / hqa.ha;
        double d3 = (double)v0.f() / hqa.ha;
        double d4 = (double)v0.d() / hqa.ha;
        iMa_1 b2 = null;
        if (v0.l() == vRa.d) {
            b2 = new cEa((Gg)iMa_12.C, d2, d3, d4);
        }
        if (b2 != null) {
            iMa_1 iMa_14 = b2;
            void v3 = a2;
            ((vL)b2).fa = v3.J();
            ((vL)iMa_14).l = v3.f();
            ((vL)iMa_14).I = a2.d();
            ((vL)b2).X = JPa.N;
            ((vL)b2).d = JPa.N;
            b2.l(a2.C());
            iMa_12.C.J((vL)b2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(mba mba2) {
        void a2;
        iMa_1 iMa_12 = this;
        String b2 = a2.J().f();
        if (b2.contains(KQa.Z) || b2.contains(vRa.z) || b2.contains(bsa.r) || b2.contains(BPa.U) || b2.contains(yra.r)) {
            iMa_12.E.J((String)null);
        }
        iMa_12.E.J(a2.J());
    }

    public void J(xba xba2) {
        iMa_1 a2;
        iMa_1 b2 = xba2;
        iMa_1 iMa_12 = a2 = this;
        Vaa.J(b2, iMa_12, (c)iMa_12.j);
        vL vL2 = iMa_12.C.J(b2.J());
        if (vL2 != null) {
            vL2.d(b2.l(), b2.f(), b2.J());
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(fda fda2) {
        void a2;
        iMa_1 iMa_12;
        iMa_1 iMa_13 = iMa_12 = this;
        Vaa.J(a2, iMa_13, (c)iMa_13.j);
        if (iMa_13.j.Ta.F(a2.J())) {
            iMa_1 b2 = iMa_12.j.Ta.J(a2.J());
            int n2 = a2.J();
            if (n2 == vRa.d && b2 instanceof Caa || n2 == uqa.g && b2 instanceof kz || n2 == yRa.d && b2 instanceof Cz || n2 == AQa.P && b2 instanceof fy || n2 == tTa.h && b2 instanceof Sz || n2 == uua.p && b2 instanceof tZ) {
                b2.f(a2.J());
            }
        }
    }
}

