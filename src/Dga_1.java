/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AEa
 *  DDa
 *  Dga
 *  ERa
 *  Gg
 *  Hda
 *  JPa
 *  KZ
 *  LGa
 *  MQa
 *  NPa
 *  Qga
 *  Qsa
 *  SIa
 *  Yfa
 *  Zta
 *  aQa
 *  eAa
 *  gFa
 *  iPa
 *  kba
 *  lEa
 *  nHa
 *  oA
 *  oHa
 *  pqa
 *  vL
 *  vRa
 */
import net.minecraft.block.Block;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Dga_1
extends hFa {
    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, int n2) {
        void b2;
        int c2 = n2;
        Dga_1 a2 = this;
        void v0 = b2;
        super.J((boolean)v0, c2);
        if (v0 != false && (a2.R.nextInt(yRa.d) == 0 || a2.R.nextInt(vRa.d + c2) > 0)) {
            a2.J(Gea.Kd, vRa.d);
        }
    }

    public Dga_1(Gg gg2) {
        Dga_1 a2;
        Dga_1 b2 = gg2;
        Dga_1 dga_1 = a2 = this;
        super((Gg)b2);
        dga_1.l(NPa.B, ATa.r);
        dga_1.D.J(vRa.d, (gFa)new oHa((Yfa)a2));
        dga_1.D.J(yRa.d, (gFa)new Qga((Yfa)a2, Xpa.R));
        dga_1.D.J(AQa.P, (gFa)new TFa((Dga)a2, Sx.class));
        dga_1.D.J(AQa.P, (gFa)new TFa((Dga)a2, DDa.class));
        dga_1.D.J(tTa.h, (gFa)new HDa(a2, Jra.A));
        dga_1.D.J(uua.p, (gFa)new nHa((Yfa)a2, Sx.class, Qsa.k));
        dga_1.D.J(uua.p, (gFa)new SIa((Yfa)a2));
        dga_1.L.J(vRa.d, (gFa)new IFa(a2, uSa.E != 0, new Class[uSa.E]));
        Dga_1 dga_12 = a2;
        dga_12.L.J(uqa.g, new QEa<Sx>((Dga)a2, Sx.class));
        dga_12.L.J(yRa.d, new QEa<DDa>((Dga)a2, DDa.class));
    }

    /*
     * WARNING - void declaration
     */
    public void k(boolean bl) {
        Dga_1 dga_1;
        void a2;
        Dga_1 dga_12 = this;
        byte b2 = dga_12.aa.J(ERa.C);
        if (a2 != false) {
            b2 = (byte)(b2 | vRa.d);
            dga_1 = dga_12;
        } else {
            b2 = (byte)(b2 & rQa.p);
            dga_1 = dga_12;
        }
        dga_1.aa.J(ERa.C, Byte.valueOf(b2));
    }

    public String A() {
        return aQa.M;
    }

    @Override
    public String i() {
        return iPa.b;
    }

    public boolean v() {
        Dga_1 a2;
        if ((a2.aa.J(ERa.C) & vRa.d) != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public xaa J(Gg gg2) {
        Dga_1 b2 = gg2;
        Dga_1 a2 = this;
        return new pBa(a2, (Gg)b2);
    }

    @Override
    public String f() {
        return aQa.M;
    }

    public float l() {
        return pta.d;
    }

    public void J(XF xF, Block block) {
        Block c2 = block;
        Dga_1 a2 = this;
        a2.J(Jqa.h, VPa.i, pqa.r);
    }

    @Override
    public void d() {
        Dga_1 a2;
        Dga_1 dga_1 = a2;
        super.d();
        if (!dga_1.j.e) {
            Dga_1 dga_12 = a2;
            dga_12.k(dga_12.ca);
        }
    }

    /*
     * WARNING - void declaration
     */
    public oA J(KZ kZ, oA oA2) {
        int n2;
        void b2;
        Dga_1 a2;
        Dga_1 c2 = oA2;
        Dga_1 dga_1 = a2 = this;
        c2 = super.J((KZ)b2, (oA)c2);
        if (dga_1.j.v.nextInt(ySa.T) == 0) {
            lEa lEa2;
            lEa lEa3 = lEa2 = new lEa(a2.j);
            lEa3.f(a2.la, a2.Z, a2.A, a2.X, JPa.N);
            lEa3.J((KZ)b2, (oA)null);
            a2.j.f((vL)lEa2);
            lEa2.l((vL)a2);
        }
        if (c2 == null) {
            c2 = new AEa();
            if (a2.j.J() == sZ.HARD && a2.j.v.nextFloat() < Nra.e * b2.f()) {
                ((AEa)c2).J(a2.j.v);
            }
        }
        if (c2 instanceof AEa && (n2 = ((AEa)c2).I) > 0 && Hda.A[n2] != null) {
            a2.J(new kba(n2, vqa.F));
        }
        return c2;
    }

    public boolean J(kba kba2) {
        Dga_1 b2 = kba2;
        Dga_1 a2 = this;
        if (b2.f() == Hda.c.O) {
            return uSa.E != 0;
        }
        return super.J((kba)b2);
    }

    public eAa J() {
        return Gea.gd;
    }

    public void J() {
        Dga_1 a2;
        Dga_1 dga_1 = a2;
        super.J();
        dga_1.aa.f(ERa.C, new Byte((byte)uSa.E));
    }

    public LGa J() {
        return LGa.ARTHROPOD;
    }

    @Override
    public void s() {
        Dga_1 a2;
        Dga_1 dga_1 = a2;
        super.s();
        dga_1.J(Kha.M).J(Zta.ba);
        dga_1.J(Kha.j).J(osa.b);
    }

    public void a() {
    }

    public double d() {
        Dga_1 a2;
        return a2.u * MQa.L;
    }

    public boolean l() {
        Dga_1 a2;
        return a2.v();
    }
}

