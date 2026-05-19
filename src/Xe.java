/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BD
 *  BS
 *  Bc
 *  Ke
 *  QSa
 *  UE
 *  YD
 *  YSa
 *  Ypa
 *  aSa
 *  bpa
 *  pqa
 *  pua
 *  sB
 *  uKa
 *  vRa
 *  zTa
 */
import java.io.IOException;
import net.xtrafrancyz.mods.minidot.items.MiniDotItem;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.MDConfiguration;
import ru.vimeworld.minidot.emotes.MiniDotEmote;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Xe
extends Ke {
    private final vC C;
    private boolean i;
    private final vC M;
    private static final MDConfiguration k = ConfigurationService.J(MDConfiguration.class);
    private float j;
    private final vC J;
    private static final Xe A = new Xe();
    private final UE I;

    public int f() {
        Xe a2;
        return (int)((float)a2.I / a2.j);
    }

    public void A() {
        Xe xe;
        Xe xe2 = xe = this;
        super.A();
        if (xe2.A <= PRa.ga || xe.I <= zTa.Ka) {
            xe.j = bpa.i;
            return;
        }
        if (xe.A <= nqa.N || xe.I <= lTa.o) {
            xe.j = pqa.r;
            return;
        }
        float a2 = QSa.h;
        Xe xe3 = xe;
        float f2 = (float)xe3.A * a2 / QTa.G;
        a2 = (float)xe3.I * a2 / QTa.G;
        a2 = f2 / a2 - BPa.R;
        xe3.j = f2 - a2 / YSa.G;
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void a2;
        int c2;
        int d2 = n3;
        Xe b2 = this;
        c2 = (int)((float)c2 / b2.j);
        d2 = (int)((float)d2 / b2.j);
        b2.I.J(c2, d2, (int)a2, vRa.d != 0);
    }

    public vC l() {
        Xe a2;
        return a2.M;
    }

    public vC f() {
        Xe a2;
        return a2.C;
    }

    public void J(boolean n2) {
        int b2 = n2;
        Xe a2 = this;
        if (a2.i == b2) {
            return;
        }
        a2.i = b2;
        a2.M.J(b2 != 0 ? oQa.fa : aSa.V, VPa.W, sB.x);
        if (b2 == 0) {
            int n3 = b2 = vRa.d;
            while (n3 <= uua.p) {
                a2.I.J(b2++).f(null);
                n3 = b2;
            }
            a2.I.J(pua.o);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void a2;
        int c2;
        int d2 = n3;
        Xe b2 = this;
        c2 = (int)((float)c2 / b2.j);
        d2 = (int)((float)d2 / b2.j);
        b2.I.J(c2, d2, (int)a2, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void J(char c2, int n2) throws IOException {
        void b2;
        int c3 = n2;
        Xe a2 = this;
        int n3 = c3;
        super.J((char)b2, n3);
        switch (n3) {
            case 2: {
                a2.I.J(vRa.d).J(uSa.E, uSa.E, uSa.E, vRa.d != 0);
                return;
            }
            case 3: {
                a2.I.J(uqa.g).J(uSa.E, uSa.E, uSa.E, vRa.d != 0);
                return;
            }
            case 4: {
                a2.I.J(yRa.d).J(uSa.E, uSa.E, uSa.E, vRa.d != 0);
                return;
            }
            case 5: {
                a2.I.J(AQa.P).J(uSa.E, uSa.E, uSa.E, vRa.d != 0);
                return;
            }
            case 6: {
                a2.I.J(tTa.h).J(uSa.E, uSa.E, uSa.E, vRa.d != 0);
                return;
            }
            case 7: {
                a2.I.J(uua.p).J(uSa.E, uSa.E, uSa.E, vRa.d != 0);
                return;
            }
        }
    }

    public void J(int n2, int n3, float f2) {
        int c2;
        int d2 = n3;
        Xe b2 = this;
        c2 = (int)((float)c2 / b2.j * (float)b2.A.l());
        d2 = (int)((float)d2 / b2.j * (float)b2.A.l());
        b2.C.J();
        b2.J.J();
        b2.M.J();
        Xe xe = b2;
        Xe.J((int)uSa.E, (int)uSa.E, (int)xe.A, (int)xe.I, (int)Bc.Ea.transparent(b2.M.J()).getRGB());
        uKa.e();
        uKa.J((double)(oua.i / (double)b2.A.l()), (double)(oua.i / (double)b2.A.l()), (double)oua.i);
        Xe xe2 = b2;
        uKa.J((double)xe2.j, (double)b2.j, (double)oua.i);
        vb.J(YD.J((Xe)xe2, (int)c2, (int)d2));
        uKa.D();
    }

    public boolean d() {
        Xe a2;
        return a2.i;
    }

    public int J() {
        Xe a2;
        return (int)((float)a2.A / a2.j);
    }

    public Xe() {
        Xe a2;
        Xe xe = a2;
        Xe xe2 = a2;
        xe.C = new vC();
        xe2.J = new vC();
        xe.M = new vC();
        xe.i = uSa.E;
        a2.I = new UE(a2);
        xe.I.add(a2.I);
    }

    public static Xe J() {
        return A;
    }

    public void D() {
        int n2;
        Xe xe = this;
        int n3 = n2 = vRa.d;
        while (n3 <= uua.p) {
            Xe a2 = xe.I.J(n2);
            if (a2.J() != null) {
                Xe xe2 = a2;
                xe2.J(xe2.J());
                xe2.f(null);
            }
            if (a2.f() != null) {
                k.J().put(n2, a2.f().id);
            }
            n3 = ++n2;
        }
    }

    public vC J() {
        Xe a2;
        return a2.J;
    }

    public void M() {
        Xe xe;
        Xe xe2 = xe = this;
        super.M();
        xe2.J(uSa.E != 0);
        xe2.M.e(aSa.V);
        xe.M.J(aSa.V);
        xe.M.C(aSa.V);
        xe.M.J();
        xe.C.e(aSa.V);
        xe.C.J(aSa.V);
        xe.C.C(aSa.V);
        xe.C.J();
        xe.J.e(aSa.V);
        xe.J.J(aSa.V);
        xe.J.C(aSa.V);
        xe.J.J();
        int a2 = vRa.d;
        int n2 = a2;
        while (n2 <= uua.p) {
            xe.I.J(a2++).f(null);
            n2 = a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Xe xe, int n2, int n3) {
        void b2;
        int c2 = n3;
        Xe a2 = xe;
        a2.I.J((int)b2, c2);
    }

    public UE J() {
        Xe a2;
        return a2.I;
    }

    public void J() {
        int a2;
        Xe xe;
        Xe xe2 = xe = this;
        xe2.I.J();
        xe2.C.f(oua.i, BQa.ia, sB.q);
        xe2.J.f(oua.i, Ypa.d, sB.q);
        int n2 = a2 = vRa.d;
        while (n2 <= uua.p) {
            BD bD = xe.I.J(a2);
            MiniDotItem miniDotItem = (MiniDotItem)BS.ITEMS.get(k.J().get(a2));
            if (!(miniDotItem instanceof MiniDotEmote)) {
                bD.J(null);
            } else {
                bD.J((MiniDotEmote)miniDotItem);
            }
            n2 = ++a2;
        }
    }
}

