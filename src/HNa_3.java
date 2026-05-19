/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bsa
 *  EC
 *  Ena
 *  HNa
 *  JTa
 *  KTa
 *  Lra
 *  NPa
 *  SOa
 *  SQa
 *  Woa
 *  Wsa
 *  Xsa
 *  YY
 *  Ysa
 *  aQa
 *  aSa
 *  ac
 *  asa
 *  dpa
 *  jRa
 *  kPa
 *  pua
 *  vRa
 *  vpa
 *  wra
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class HNa_3
extends EC {
    private ZLa C;
    private String i;
    private static final List<rNa> M = Lists.newArrayList();
    private Ena k;
    public String j;
    private Woa J;
    private String A;
    private ac I;

    public void d() throws IOException {
        HNa_3 a2;
        HNa_3 hNa_3 = a2;
        super.d();
        hNa_3.k.f();
    }

    public HNa_3(ZLa zLa2) {
        EC b2 = zLa2;
        HNa_3 a2 = this;
        a2.j = zOa.o;
        a2.C = b2;
    }

    public void M() {
        Keyboard.enableRepeatEvents(uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        HNa_3 a2 = this;
        if (!a2.J.J((char)b2, c3)) {
            super.J((char)b2, c3);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        HNa_3 a2;
        float d2 = f2;
        HNa_3 hNa_3 = a2 = this;
        HNa_3 hNa_32 = a2;
        hNa_32.i();
        hNa_32.k.J((int)c2, (int)b2, d2);
        HNa_3.J((String)hNa_32.j, (int)(a2.A / uqa.g), (int)Yqa.i, (int)pua.o);
        HNa_3.f((String)hNa_32.i, (int)vpa.o, (int)Fsa.d, (int)xra.R);
        HNa_3.f((String)hNa_32.A, (int)vpa.o, (int)NPa.e, (int)xra.R);
        a2.J.J();
        super.J((int)c2, (int)b2, d2);
    }

    static {
        YY yY2 = YY.J((String)dpa.F);
        ResourceLocation resourceLocation = new ResourceLocation(Zqa.D);
        M.add(new rNa(oha.J(asa.s, new Object[uSa.E]), resourceLocation, yY2));
        yY2 = YY.J((String)ppa.K);
        resourceLocation = new ResourceLocation(NSa.K);
        M.add(new rNa(oha.J(Bua.ja, new Object[uSa.E]), resourceLocation, yY2));
        yY2 = YY.J((String)Bsa.g);
        resourceLocation = new ResourceLocation(JTa.i);
        M.add(new rNa(oha.J(KTa.R, new Object[uSa.E]), resourceLocation, yY2));
        yY2 = YY.J((String)yRa.j);
        resourceLocation = new ResourceLocation(kPa.t);
        M.add(new rNa(oha.J(sSa.G, new Object[uSa.E]), resourceLocation, yY2));
        yY2 = YY.J((String)APa.G);
        resourceLocation = new ResourceLocation(vsa.V);
        M.add(new rNa(oha.J(SQa.J, new Object[uSa.E]), resourceLocation, yY2));
        yY2 = YY.J((String)Wsa.q);
        resourceLocation = new ResourceLocation(CRa.z);
        M.add(new rNa(oha.J(zta.Ha, new Object[uSa.E]), resourceLocation, yY2));
        yY2 = YY.J((String)Xsa.q);
        resourceLocation = new ResourceLocation(NSa.J);
        M.add(new rNa(oha.J(wra.o, new Object[uSa.E]), resourceLocation, yY2));
    }

    public static /* synthetic */ List J() {
        return M;
    }

    private boolean d() {
        HNa_3 a2;
        if (a2.k.I > pua.o && a2.k.I < M.size() || a2.J.f().length() > vRa.d) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void l() {
        HNa_3 a2;
        HNa_3 hNa_3 = a2;
        hNa_3.J.C();
        super.l();
    }

    public static /* synthetic */ Woa J(HNa a2) {
        return a2.J;
    }

    public void J() {
        HNa_3 a2;
        a2.I.J = a2.d();
    }

    public static /* synthetic */ Ena J(HNa a2) {
        return a2.k;
    }

    public void A() {
        HNa_3 a2;
        a2.E.clear();
        Keyboard.enableRepeatEvents(vRa.d != 0);
        a2.j = oha.J(Ysa.e, new Object[uSa.E]);
        a2.i = oha.J(aQa.X, new Object[uSa.E]);
        a2.A = oha.J(tSa.U, new Object[uSa.E]);
        HNa_3 hNa_3 = a2;
        HNa_3 hNa_32 = a2;
        hNa_3.J = new Woa(uqa.g, a2.L, vpa.o, wra.P, (int)(a2.A - ySa.T), kTa.j);
        hNa_32.k = new Ena((HNa)a2);
        hNa_3.J.M(aSa.k);
        hNa_3.J.f(a2.C.f());
        a2.I = new ac(uSa.E, (int)(a2.A / uqa.g - jRa.v), (int)(a2.I - Lra.e), ySa.T, kTa.j, oha.J(sOa.Ia, new Object[uSa.E]));
        hNa_3.E.add(a2.I);
        a2.E.add(new ac(vRa.d, (int)(a2.A / uqa.g + yRa.d), (int)(a2.I - Lra.e), ySa.T, kTa.j, oha.J(SOa.l, new Object[uSa.E])));
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        HNa_3 a2;
        int d2 = n4;
        HNa_3 hNa_3 = a2 = this;
        hNa_3.J.J((int)c2, (int)b2, d2);
        super.J((int)c2, (int)b2, d2);
    }

    public void J(ac ac2) throws IOException {
        HNa_3 b2 = ac2;
        HNa_3 a2 = this;
        switch (((ac)b2).C) {
            case 0: {
                HNa_3 hNa_3 = a2;
                while (false) {
                }
                hNa_3.C.J(hNa_3.J.f());
                hNa_3.g.J((EC)a2.C);
                return;
            }
            case 1: {
                HNa_3 hNa_3 = a2;
                hNa_3.g.J((EC)hNa_3.C);
            }
        }
    }
}

