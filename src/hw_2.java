/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Aw
 *  CW
 *  Dha
 *  FTa
 *  JU
 *  Jy
 *  Lv
 *  MQa
 *  MZ
 *  NOa
 *  Naa
 *  Ow
 *  Qw
 *  RIa
 *  SQa
 *  SRa
 *  Sv
 *  UV
 *  Vv
 *  WSa
 *  WU
 *  XU
 *  YY
 *  Yra
 *  asa
 *  bv
 *  cra
 *  dQa
 *  ew
 *  gv
 *  gx
 *  hv
 *  hw
 *  isa
 *  kqa
 *  lV
 *  mv
 *  psa
 *  rW
 *  vRa
 */
import java.util.concurrent.Callable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hw_2 {
    private long j;
    public long J;
    public hw A;
    private long I;

    public static boolean J(int a2) {
        if (a2 == Jy.Ba.Ka || a2 == Jy.L.Ka || a2 == Jy.N.Ka) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static hw[] J(long l2, Fy fy2, String string) {
        long c2;
        hw a2;
        int n2;
        Object object = fy2;
        rW b22 = new rW(dQa.Ga);
        b22 = new gx(dQa.c, (hw)b22);
        b22 = new UV(dQa.Ga, (hw)b22);
        b22 = new lV(Vra.fa, (hw)b22);
        b22 = new UV(kra.G, (hw)b22);
        b22 = new UV(cra.f, (hw)b22);
        b22 = new UV(kqa.T, (hw)b22);
        b22 = new WU(kra.G, (hw)b22);
        b22 = new gv(kra.G, (hw)b22);
        b22 = new UV(Bra.I, (hw)b22);
        b22 = new Qw(kra.G, (hw)b22, ew.COOL_WARM);
        b22 = new Qw(kra.G, (hw)b22, ew.HEAT_ICE);
        b22 = new Qw(Bra.I, (hw)b22, ew.SPECIAL);
        b22 = new lV(SRa.Z, (hw)b22);
        b22 = new lV(isa.B, (hw)b22);
        b22 = new UV(SQa.n, (hw)b22);
        b22 = new bv(Yra.t, (hw)b22);
        b22 = new hv(SQa.n, (hw)b22);
        b22 = lV.J((long)asa.fa, (hw)b22, (int)uSa.E);
        int n3 = n2 = AQa.P;
        if (object == Fy.m && a2.length() > 0) {
            Naa naa2 = YY.J((String)a2).J();
            n2 = naa2.biomeSize;
            n3 = naa2.riverSize;
        }
        if (object == Fy.F) {
            n2 = uua.p;
        }
        hw hw2 = lV.J((long)asa.fa, (hw)b22, (int)uSa.E);
        hw2 = new sW(WSa.Ia, hw2);
        object = new JU(FTa.N, (hw)b22, object, (String)a2);
        object = lV.J((long)asa.fa, (hw)object, (int)uqa.g);
        object = new MU(asa.fa, (hw)object);
        a2 = lV.J((long)asa.fa, (hw)hw2, (int)uqa.g);
        object = new Lv(asa.fa, (hw)object, a2);
        a2 = lV.J((long)asa.fa, (hw)hw2, (int)uqa.g);
        a2 = lV.J((long)asa.fa, (hw)a2, (int)n3);
        a2 = new XU(dQa.Ga, a2);
        a2 = new mv(asa.fa, a2);
        object = new Vv(KSa.k, (hw)object);
        int n4 = b22 = uSa.E;
        while (n4 < n2) {
            object = new lV((long)(PRa.U + b22), (hw)object);
            if (b22 == 0) {
                object = new UV(Bra.I, (hw)object);
            }
            if (b22 == vRa.d || n2 == vRa.d) {
                object = new Aw(asa.fa, (hw)object);
            }
            n4 = ++b22;
        }
        mv b22 = new mv(asa.fa, (hw)object);
        object = new Sv(WSa.Ia, (hw)b22, a2);
        a2 = new Ow(MQa.r, (hw)object);
        long l3 = c2;
        object.J(l3);
        a2.J(l3);
        hw_2[] hw_2Array = new hw_2[yRa.d];
        hw_2Array[uSa.E] = object;
        hw_2Array[vRa.d] = a2;
        hw_2Array[uqa.g] = object;
        return hw_2Array;
    }

    public abstract int[] J(int var1, int var2, int var3, int var4);

    /*
     * WARNING - void declaration
     */
    public int J(int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void c2;
        int e2 = n2;
        hw_2 d2 = this;
        if (c2 == b2 && b2 == a2) {
            return (int)c2;
        }
        if (e2 == c2 && e2 == b2) {
            return e2;
        }
        if (e2 == c2 && e2 == a2) {
            return e2;
        }
        if (e2 == b2 && e2 == a2) {
            return e2;
        }
        if (e2 == c2 && b2 != a2) {
            return e2;
        }
        if (e2 == b2 && c2 != a2) {
            return e2;
        }
        if (e2 == a2 && c2 != b2) {
            return e2;
        }
        if (c2 == b2 && e2 != a2) {
            return (int)c2;
        }
        if (c2 == a2 && e2 != b2) {
            return (int)c2;
        }
        if (b2 == a2 && e2 != c2) {
            return (int)b2;
        }
        int[] nArray = new int[AQa.P];
        nArray[uSa.E] = e2;
        nArray[vRa.d] = c2;
        nArray[uqa.g] = b2;
        nArray[yRa.d] = a2;
        return d2.J(nArray);
    }

    public void J(long b2, long a2) {
        hw_2 c2;
        hw_2 hw_22 = c2;
        hw_22.I = hw_22.j;
        hw_22.I *= c2.I * psa.Y + vqa.f;
        hw_22.I += b2;
        hw_22.I *= c2.I * psa.Y + vqa.f;
        hw_22.I += a2;
        hw_22.I *= c2.I * psa.Y + vqa.f;
        hw_22.I += b2;
        hw_22.I *= c2.I * psa.Y + vqa.f;
        hw_22.I += a2;
    }

    public hw_2(long a2) {
        hw_2 b2;
        hw_2 hw_22 = b2;
        b2.J = a2;
        hw_22.J *= b2.J * psa.Y + vqa.f;
        hw_22.J += a2;
        hw_22.J *= b2.J * psa.Y + vqa.f;
        hw_22.J += a2;
        hw_22.J *= b2.J * psa.Y + vqa.f;
        hw_22.J += a2;
    }

    public static boolean J(int n2, int n3) {
        int a2 = n2;
        int b2 = n3;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (a2 != Jy.w.Ka && a2 != Jy.S.Ka) {
            block6: {
                Jy jy2 = Jy.l((int)a2);
                Jy jy3 = Jy.l((int)b2);
                try {
                    if (jy2 == null || jy3 == null) break block6;
                    return jy2.J(jy3);
                }
                catch (Throwable throwable) {
                    RIa rIa2 = RIa.J((Throwable)throwable, (String)Mqa.p);
                    Dha dha = rIa2.J(tua.u);
                    dha.J(WOa.N, (Object)a2);
                    dha.J(mPa.e, (Object)b2);
                    dha.J(ROa.l, (Callable)new uW(jy2));
                    dha.J(NOa.C, (Callable)new CW(jy3));
                    throw new MZ(rIa2);
                }
            }
            return uSa.E != 0;
        }
        if (b2 == Jy.w.Ka || b2 == Jy.S.Ka) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int J(int n2) {
        void a2;
        hw_2 hw_22 = this;
        int b2 = (int)((hw_22.I >> osa.c) % (long)a2);
        if (b2 < 0) {
            b2 += a2;
        }
        hw_2 hw_23 = hw_22;
        hw_23.I *= hw_22.I * psa.Y + vqa.f;
        hw_23.I += hw_22.j;
        return b2;
    }

    public int J(int ... nArray) {
        Object b2 = nArray;
        hw_2 a2 = this;
        Object object = b2;
        return (int)object[a2.J(((Object)object).length)];
    }

    public void J(long a2) {
        hw_2 b2;
        b2.j = a2;
        if (b2.A != null) {
            b2.A.J(a2);
        }
        hw_2 hw_22 = b2;
        hw_22.j *= b2.j * psa.Y + vqa.f;
        hw_22.j += b2.J;
        hw_22.j *= b2.j * psa.Y + vqa.f;
        hw_22.j += b2.J;
        hw_22.j *= b2.j * psa.Y + vqa.f;
        hw_22.j += b2.J;
    }
}

