/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AY
 *  Bc
 *  CY
 *  EC
 *  ERa
 *  FMa
 *  Kd
 *  Kna
 *  Kpa
 *  Oz
 *  Pqa
 *  Qoa
 *  Woa
 *  XTa
 *  Xoa
 *  Ypa
 *  ZOa
 *  cI
 *  if
 *  ld
 *  lqa
 *  pua
 *  qf
 *  uRa
 *  vRa
 */
import com.google.common.collect.Lists;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Xoa_3
extends EC {
    private String g;
    public Woa L;
    private String E;
    private boolean m;
    private static final Logger C;
    private boolean i;
    private boolean M;
    private int k;
    public static final Qoa j;
    private int J;
    private List<String> A;
    public static final iNa I;

    public void J(int n2) {
        Xoa_3 a2;
        int b2 = n2;
        Xoa_3 xoa_3 = a2 = this;
        b2 = xoa_3.k + b2;
        int n3 = ((Kpa)xoa_3.g).Ya.J().J().size();
        if ((b2 = Oz.f((int)b2, (int)uSa.E, (int)n3)) != a2.k) {
            if (b2 == n3) {
                a2.k = n3;
                a2.L.f(a2.E);
                return;
            }
            if (a2.k == n3) {
                a2.E = a2.L.f();
            }
            Xoa_3 xoa_32 = a2;
            xoa_32.L.f((String)((Kpa)xoa_32.g).Ya.J().J().get(b2));
            a2.k = b2;
        }
    }

    public void M() {
        Xoa_3 a2;
        Keyboard.enableRepeatEvents(uSa.E != 0);
        ((Kpa)a2.g).Ya.J().J();
        I.f(uSa.E != 0);
        WF.G();
        a2.m = vRa.d;
    }

    public void A() {
        Xoa_3 a2;
        Keyboard.enableRepeatEvents(vRa.d != 0);
        Xoa_3 xoa_3 = a2;
        xoa_3.k = ((Kpa)xoa_3.g).Ya.J().J().size();
        Xoa_3 xoa_32 = a2;
        xoa_32.L = new Woa(uSa.E, (Kna)a2.L, ITa.A, (int)(a2.I - ERa.C), (int)(a2.A - osa.c - AQa.P), lqa.s);
        xoa_3.L.M(ySa.T);
        xoa_3.L.J(uSa.E != 0);
        xoa_3.L.l(vRa.d != 0);
        xoa_3.L.f(a2.g);
        xoa_3.L.C(uSa.E != 0);
        j.J((Xoa)a2);
        if (xoa_3.m) {
            WF.d();
        }
        a2.m = uSa.E;
    }

    public void d() throws IOException {
        Xoa_3 xoa_3 = this;
        super.d();
        if (I.f() && I.J() || j.C() && j.f()) {
            return;
        }
        int a2 = Mouse.getEventDWheel();
        if (a2 != 0) {
            if (a2 > vRa.d) {
                a2 = vRa.d;
            }
            if (a2 < pua.o) {
                a2 = pua.o;
            }
            if (!Xoa_3.l()) {
                a2 *= XTa.W;
            }
            ((Kpa)xoa_3.g).Ya.J().J(a2);
        }
    }

    public void J() {
        String string;
        Object object;
        Xoa_3 xoa_3;
        Xoa_3 xoa_32;
        block6: {
            block5: {
                block4: {
                    xoa_32 = this;
                    if (!xoa_32.i) break block4;
                    Xoa_3 xoa_33 = xoa_32;
                    Xoa_3 xoa_34 = xoa_32;
                    xoa_33.L.i(xoa_33.L.J(pua.o, xoa_32.L.f(), uSa.E != 0) - xoa_34.L.f());
                    if (xoa_34.J < xoa_32.A.size()) break block5;
                    xoa_3 = xoa_32;
                    xoa_32.J = uSa.E;
                    break block6;
                }
                Xoa_3 xoa_35 = xoa_32;
                Xoa_3 xoa_36 = xoa_32;
                int a2 = xoa_35.L.J(pua.o, xoa_36.L.f(), uSa.E != 0);
                xoa_36.A.clear();
                xoa_35.J = uSa.E;
                object = xoa_35.L.f().substring(a2).toLowerCase();
                string = xoa_35.L.f().substring(uSa.E, xoa_32.L.f());
                xoa_35.J(string, (String)object);
                if (xoa_35.A.isEmpty()) {
                    return;
                }
                xoa_32.i = vRa.d;
                xoa_32.L.i(a2 - xoa_32.L.f());
            }
            xoa_3 = xoa_32;
        }
        if (xoa_3.A.size() > vRa.d) {
            StringBuilder a2 = new StringBuilder();
            Object object2 = object = xoa_32.A.iterator();
            while (object2.hasNext()) {
                string = (String)object.next();
                if (a2.length() > 0) {
                    a2.append(TOa.n);
                }
                a2.append(string);
                object2 = object;
            }
            ((Kpa)xoa_32.g).Ya.J().J((ld)new CY(a2.toString()), vRa.d);
        }
        Xoa_3 xoa_37 = xoa_32;
        int n2 = xoa_32.J;
        xoa_32.J = n2 + vRa.d;
        xoa_37.L.J(xoa_37.A.get(n2));
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4) throws IOException {
        void b2;
        void c2;
        int d2 = n4;
        Xoa_3 a2 = this;
        if (I.f() && I.J()) {
            I.J((int)c2, (int)b2, d2, vRa.d != 0);
            return;
        }
        if (j.f() && j.C()) {
            j.J((int)c2, (int)b2, d2, vRa.d != 0);
            return;
        }
        if (WF.J((int)c2, (int)b2, d2, vRa.d != 0)) {
            return;
        }
        if (d2 == 0) {
            Xoa_3 xoa_3 = a2;
            if (xoa_3.J(((Kpa)xoa_3.g).Ya.J().J(Mouse.getX(), Mouse.getY()))) {
                return;
            }
        }
        a2.L.J((int)c2, (int)b2, d2);
    }

    public Xoa_3(String string) {
        Xoa_3 a2;
        Object b2 = string;
        Xoa_3 xoa_3 = a2 = this;
        a2.E = Mqa.y;
        a2.k = pua.o;
        a2.A = Lists.newArrayList();
        xoa_3.m = vRa.d;
        xoa_3.g = Mqa.y;
        xoa_3.g = b2;
    }

    static {
        I = new iNa();
        j = new Qoa(Kpa.J().Ya.J());
        C = LogManager.getLogger();
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, float f2) {
        void b2;
        void c2;
        float d22 = f2;
        Xoa_3 a2 = this;
        if.J((double)uRa.I, (double)((double)(a2.I - yRa.d - yOa.B)), (double)((double)(a2.A - uua.p)), (double)DPa.Aa, (Color)Bc.Ea.transparent(Ora.D), (Color)Bc.Ea.transparent(ATa.r), (Kd)Kd.XS);
        Xoa_3 xoa_3 = a2;
        cI.J((Runnable)FMa.J((Xoa)xoa_3));
        I.J((int)c2, (int)b2);
        xoa_3.L.J();
        cI.J();
        ld d22 = ((Kpa)xoa_3.g).Ya.J().J(Mouse.getX(), Mouse.getY());
        if (!(WF.J().f() || qf.J().f() || d22 == null || d22.J().J() == null || j.f() && j.C() || WF.J().f())) {
            a2.J(d22, (int)c2, (int)b2);
        }
        j.J((int)c2, (int)b2);
    }

    /*
     * WARNING - void declaration
     */
    public void f(int n2, int n3, int n4) {
        void b2;
        void c2;
        int d2 = n4;
        Xoa_3 a2 = this;
        if (I.f() && I.J()) {
            I.J((int)c2, (int)b2, d2, uSa.E != 0);
            return;
        }
        if (j.f() && j.C()) {
            j.J((int)c2, (int)b2, d2, uSa.E != 0);
            return;
        }
        if (WF.J((int)c2, (int)b2, d2, uSa.E != 0)) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, String string2) {
        void b2;
        Object c2 = string2;
        Xoa_3 a2 = this;
        if (b2.length() >= vRa.d) {
            c2 = null;
            if (((Kpa)a2.g).Oa != null && ((Kpa)a2.g).Oa.A == AY.BLOCK) {
                c2 = ((Kpa)a2.g).Oa.J();
            }
            ((Kpa)a2.g).c.F.J((KC)new YAa((String)b2, (XF)((Object)c2)));
            a2.M = vRa.d;
        }
    }

    public static /* synthetic */ void J(Xoa a2) {
        if.J((double)uRa.I, (double)((double)(a2.I - yRa.d - yOa.B)), (double)((double)(a2.A - uua.p)), (double)DPa.Aa, (Color)Bc.Ba, (Kd)Kd.XS, uSa.E != 0);
    }

    /*
     * WARNING - void declaration
     */
    public void J(String[] stringArray) {
        Xoa_3 xoa_3 = this;
        if (xoa_3.M) {
            int n2;
            void a2;
            xoa_3.i = uSa.E;
            xoa_3.A.clear();
            String string = a2;
            int b22 = ((void)string).length;
            int n3 = n2 = uSa.E;
            while (n3 < b22) {
                void var5_7 = string[n2];
                if (var5_7.length() > 0) {
                    xoa_3.A.add((String)var5_7);
                }
                n3 = ++n2;
            }
            string = xoa_3.L.f().substring(xoa_3.L.J(pua.o, xoa_3.L.f(), uSa.E != 0));
            String b22 = StringUtils.getCommonPrefix((String[])a2);
            if (b22.length() > 0 && !string.equalsIgnoreCase(b22)) {
                Xoa_3 xoa_32 = xoa_3;
                Xoa_3 xoa_33 = xoa_3;
                xoa_32.L.i(xoa_32.L.J(pua.o, xoa_3.L.f(), uSa.E != 0) - xoa_33.L.f());
                xoa_33.L.J(b22);
                return;
            }
            if (xoa_3.A.size() > 0) {
                xoa_3.i = vRa.d;
                xoa_3.J();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(char c2, int n2) throws IOException {
        int n3;
        void b22;
        int c3 = n2;
        Xoa_3 a2 = this;
        a2.M = uSa.E;
        if (WF.J((char)b22, c3)) {
            return;
        }
        if (c3 == Ypa.A) {
            n3 = c3;
            a2.J();
        } else {
            a2.i = uSa.E;
            n3 = c3;
        }
        if (n3 == vRa.d) {
            a2.g.J((EC)null);
            return;
        }
        if (c3 != EPa.O && c3 != yRa.r) {
            if (c3 == ZOa.x) {
                a2.J(pua.o);
                return;
            }
            if (c3 == Pqa.i) {
                a2.J(vRa.d);
                return;
            }
            if (c3 == Tqa.K) {
                ((Kpa)a2.g).Ya.J().J(((Kpa)a2.g).Ya.J().f() - vRa.d);
                return;
            }
            if (c3 == ZOa.d) {
                ((Kpa)a2.g).Ya.J().J(-((Kpa)a2.g).Ya.J().f() + vRa.d);
                return;
            }
            a2.L.J((char)b22, c3);
            return;
        }
        String b22 = a2.L.f().trim();
        if (b22.length() > 0) {
            a2.d(b22);
        }
        a2.g.J((EC)null);
    }

    public boolean J() {
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, boolean bl) {
        void a2;
        Object c2 = string;
        Xoa_3 b2 = this;
        if (a2 != false) {
            b2.L.f((String)c2);
            return;
        }
        b2.L.J((String)c2);
    }

    public Xoa_3() {
        Xoa_3 a2;
        a2.E = Mqa.y;
        a2.k = pua.o;
        a2.A = Lists.newArrayList();
        a2.m = vRa.d;
        a2.g = Mqa.y;
    }

    public void l() {
        Xoa_3 a2;
        a2.L.C();
    }
}

