/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  EC
 *  FTa
 *  Ip
 *  Kh
 *  MQa
 *  NTa
 *  Oz
 *  Rp
 *  TPa
 *  XM
 *  YSa
 *  Zr
 *  cQa
 *  cRa
 *  cX
 *  fO
 *  k
 *  pua
 *  tp
 *  uKa
 *  vRa
 *  vq
 *  wI
 *  wPa
 */
import java.awt.Point;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vq_2
extends Ip
implements yB {
    private boolean a;
    private boolean b;
    private static final int e = 4;
    private int D;
    private Integer F;
    private String g;
    private int L;
    private long E;
    private int m;
    private int C;
    private wI i;
    private int M;
    private Pattern k;
    private ScheduledFuture<?> j;
    private String J;
    private wI A;
    private boolean I;

    /*
     * WARNING - void declaration
     */
    private int M(int n2, int n3) {
        void b2;
        int c2;
        vq_2 vq_22 = this;
        int n4 = uSa.E;
        int n5 = c2 = uSa.E;
        while (n5 <= b2 && c2 < ((int)vq_22.e).length) {
            if (c2 == b2) {
                void a2;
                return Math.min(n4 + a2, vq_22.J.length());
            }
            char c3 = vq_22.J.charAt(n4 += vq_22.e[c2].length());
            if (c3 == fPa.i || c3 == NTa.C) {
                ++n4;
            }
            n5 = ++c2;
        }
        return uSa.E;
    }

    public void f(String string) {
        vq_2 vq_22;
        int n2;
        String a2;
        vq_2 vq_23 = this;
        Object b2 = Mqa.y;
        vq_2 vq_24 = vq_23;
        a2 = vq_24.J(a2);
        vq_2 vq_25 = vq_23;
        int n3 = Math.min(vq_24.L, vq_25.D);
        int n4 = Math.max(vq_25.L, vq_23.D);
        vq_2 vq_26 = vq_23;
        int n5 = Math.max(uSa.E, vq_26.M - vq_26.J.length() - (n3 - n4));
        if (n5 == 0) {
            return;
        }
        if (vq_23.J.length() > 0) {
            b2 = new StringBuilder().insert(3 & 4, (String)b2).append(vq_23.J.substring(uSa.E, n3)).toString();
        }
        if (n5 < a2.length()) {
            b2 = new StringBuilder().insert(3 >> 2, (String)b2).append(a2.substring(uSa.E, n5)).toString();
            n2 = n5;
            vq_22 = vq_23;
        } else {
            b2 = new StringBuilder().insert(5 >> 3, (String)b2).append(a2).toString();
            vq_22 = vq_23;
            n2 = a2.length();
        }
        if (vq_22.J.length() > 0 && n4 < vq_23.J.length()) {
            b2 = new StringBuilder().insert(3 >> 2, (String)b2).append(vq_23.J.substring(n4)).toString();
        }
        if (vq_23.k == null || vq_23.k.matcher((CharSequence)b2).matches()) {
            vq_23.J = b2;
            vq_23.G();
            vq_23.C(n3 - vq_23.D + n2);
        }
    }

    public void i() {
        vq_2 a2;
        vq_2 vq_22 = a2;
        super.i();
        if (vq_22.a) {
            a2.a = uSa.E;
            Keyboard.enableRepeatEvents(uSa.E != 0);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static int J(String string, int n2, int n3, boolean bl) {
        int n4;
        int c2;
        int d2 = n3;
        String b2 = string;
        int n5 = c2 < 0 ? vRa.d : uSa.E;
        c2 = Math.abs(c2);
        int n6 = n4 = uSa.E;
        while (n6 < c2) {
            void a2;
            if (n5 == 0) {
                String string2 = b2;
                int n7 = string2.length();
                if ((d2 = string2.indexOf(fPa.i, d2)) == pua.o) {
                    d2 = n7;
                } else {
                    void v2 = a2;
                    while (v2 != false && d2 < n7 && b2.charAt(d2) == fPa.i) {
                        v2 = a2;
                        ++d2;
                    }
                }
            } else {
                void v3 = a2;
                while (v3 != false && d2 > 0 && b2.charAt(d2 - vRa.d) == fPa.i) {
                    v3 = a2;
                    --d2;
                }
                int n8 = d2;
                while (n8 > 0 && b2.charAt(d2 - vRa.d) != fPa.i) {
                    n8 = --d2;
                }
            }
            n6 = ++n4;
        }
        return d2;
    }

    public void e(int n2) {
        int b2 = n2;
        vq_2 a2 = this;
        a2.D = Oz.f((int)b2, (int)uSa.E, (int)a2.J.length());
    }

    /*
     * WARNING - void declaration
     */
    private int e(int n2) {
        int b2;
        vq_2 vq_22 = this;
        int n3 = b2 = uSa.E;
        while (n3 < ((int)vq_22.D).length) {
            void a2;
            int n4;
            int n5 = n4 = vq_22.l != pua.o ? vq_22.l : vq_22.D[b2].y;
            if (a2 < n4) {
                return b2;
            }
            a2 -= n4;
            n3 = ++b2;
        }
        return ((int)vq_22.D).length - vRa.d;
    }

    public void J(fO fO2) {
        vq_2 b2 = fO2;
        vq_2 a2 = this;
        vq_2 vq_22 = b2;
        super.J((fO)vq_22);
        if (vq_22.hasEText() && b2.getEText().getTextCount() > 0) {
            vq_2 vq_23 = a2;
            vq_23.J = String.join((CharSequence)SPa.O, b2.getEText().getTextList());
            vq_23.f(vq_23.L);
            vq_23.G();
        }
    }

    private void G() {
        vq_2 vq_22;
        ScheduledFuture<?> a2;
        vq_2 vq_23 = this;
        if (vq_23.I) {
            int n2;
            a2 = new StringBuilder(vq_23.J.length());
            int n3 = n2 = uSa.E;
            while (n3 < vq_23.J.length()) {
                ((StringBuilder)((Object)a2)).append((char)cQa.i);
                n3 = ++n2;
            }
            String[] stringArray = new String[vRa.d];
            stringArray[uSa.E] = ((StringBuilder)((Object)a2)).toString();
            vq_23.e = (int)stringArray;
            vq_22 = vq_23;
        } else {
            vq_2 vq_24 = vq_23;
            vq_22 = vq_24;
            vq_24.e = (int)vq_24.J.split(SPa.O, tTa.N);
        }
        vq_22.D();
        if (vq_23.A != null) {
            a2 = vq_23.j;
            if (a2 != null) {
                a2.cancel(uSa.E != 0);
            }
            wI wI2 = (wI)vq_23.A.clone();
            wI2.put((Object)wPa.O, (Object)vq_23.J);
            vq_23.j = OT.d.schedule(Zr.J((vq)vq_23, (wI)wI2), FTa.N, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void J(vq vq2, wI wI2) {
        vq b2 = wI2;
        vq a2 = vq2;
        OT.J((wI)b2);
        a2.j = null;
    }

    private int e(int n2, int n3) {
        int n4;
        int a2;
        int b2;
        vq_2 vq_22 = this;
        if (!vq_22.d.J) {
            return b2;
        }
        Point c22 = vq_22.J(b2);
        if ((a2 = Oz.f((int)(c22.y + a2), (int)uSa.E, (int)(((int)vq_22.e).length - vRa.d))) == c22.y) {
            return b2;
        }
        vq_2 vq_23 = vq_22;
        b2 = vq_23.d.f(vq_23.e[c22.y].substring(uSa.E, c22.x)) + vq_22.d(c22.y);
        int c22 = vRa.d;
        int n5 = n4 = uSa.E;
        while (n5 < a2) {
            int n6 = vq_22.l != ypa.L ? vq_22.l : vq_22.D[n4].y;
            c22 += n6;
            n5 = ++n4;
        }
        return vq_22.d(b2, c22);
    }

    private void d(int n2) {
        int b2 = n2;
        vq_2 a2 = this;
        if (a2.J.length() != 0) {
            vq_2 vq_22 = a2;
            if (vq_22.D != vq_22.L) {
                a2.f(Mqa.y);
                return;
            }
            vq_2 vq_23 = a2;
            a2.l(vq_23.C(b2, vq_23.L) - a2.L);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, long l2) {
        void a2;
        void c2;
        vq_2 b2;
        int d2 = n3;
        vq_2 vq_22 = b2 = this;
        void v1 = c2;
        super.J((int)v1, d2, (long)a2);
        vq_22.C = v1;
        vq_22.m = d2;
    }

    public void C(int n2) {
        vq_2 a2;
        int b2 = n2;
        vq_2 vq_22 = a2 = this;
        vq_22.f(vq_22.D + b2);
    }

    public void M() {
        vq_2 a2;
        super.M();
        if (!Keyboard.areRepeatEventsEnabled()) {
            a2.a = vRa.d;
            Keyboard.enableRepeatEvents(vRa.d != 0);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private int d(int n2) {
        vq_2 vq_22 = this;
        int b2 = uSa.E;
        switch (Rp.I[vq_22.b.ordinal()]) {
            case 1: {
                void a2;
                return (vq_22.f() - vq_22.D[a2].x) / uqa.g;
            }
            case 2: {
                void a2;
                return vq_22.f() - vq_22.D[a2].x;
            }
        }
        return b2;
    }

    /*
     * WARNING - void declaration
     */
    private Point J(int n2) {
        int b2;
        vq_2 vq_22 = this;
        int n3 = uSa.E;
        int n4 = b2 = uSa.E;
        while (n4 < ((int)vq_22.e).length) {
            void a2;
            if (a2 <= vq_22.e[b2].length()) {
                return new Point((int)a2, b2);
            }
            a2 -= vq_22.e[b2].length();
            char c2 = vq_22.J.charAt(n3 += vq_22.e[b2].length());
            if (c2 == fPa.i || c2 == NTa.C) {
                ++n3;
                --a2;
            }
            n4 = ++b2;
        }
        return new Point(uSa.E, uSa.E);
    }

    public void A() {
        vq_2 vq_22;
        vq_2 vq_23 = vq_22 = this;
        float f2 = (float)vq_23.F;
        float a2 = (float)vq_23.k;
        super.A();
        if ((f2 != (float)vq_22.F || a2 != (float)vq_22.k) && vq_22.s instanceof tp) {
            ((tp)vq_22.s).A();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(int n2, int n3, int n4) {
        void b2;
        void c2;
        vq_2 a2 = this;
        int d2 = n4;
        if (!super.J((int)c2, (int)b2, d2)) {
            return uSa.E != 0;
        }
        vq_2 vq_22 = a2;
        vq_22.E = OT.e;
        vq_2 vq_23 = a2;
        vq_22.f(vq_23.d(vq_22.C, vq_23.m));
        return vRa.d != 0;
    }

    private String J(String string) {
        int n2;
        char[] a2;
        vq_2 vq_22 = this;
        StringBuilder stringBuilder = new StringBuilder();
        a2 = a2.toCharArray();
        int n3 = a2.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            char b2 = a2[n2];
            if (vq_22.b && b2 == NTa.C || b2 >= fPa.i && b2 != cRa.h && b2 != TPa.Aa) {
                stringBuilder.append(b2);
            }
            n4 = ++n2;
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    private int d(int n2, int n3) {
        void b2;
        vq_2 a2;
        int c2 = n3;
        vq_2 vq_22 = a2 = this;
        c2 = vq_22.e(c2);
        int n4 = vq_22.d(c2);
        int n5 = vq_22.d.J((String)a2.e[c2], (int)(b2 - n4), uSa.E != 0).length();
        if (vq_22.e[c2].length() > n5) {
            vq_2 vq_23 = a2;
            int n6 = a2.d.f(vq_23.e[c2].substring(uSa.E, n5)) + n4;
            n4 = vq_23.d.f(a2.e[c2].substring(uSa.E, n5 + vRa.d)) + n4;
            if (Math.abs((int)(b2 - n6)) > Math.abs((int)(b2 - n4))) {
                ++n5;
            }
        }
        return a2.M(c2, n5);
    }

    /*
     * WARNING - void declaration
     */
    private void l(int n2) {
        vq_2 vq_22 = this;
        if (vq_22.J.length() != 0) {
            void a2;
            vq_2 vq_23 = vq_22;
            if (vq_23.D != vq_23.L) {
                vq_22.f(Mqa.y);
                return;
            }
            int n3 = a2 < 0 ? vRa.d : uSa.E;
            vq_2 vq_24 = vq_22;
            int n4 = n3 != 0 ? vq_24.L + a2 : vq_24.L;
            vq_2 vq_25 = vq_22;
            int n5 = n3 != 0 ? vq_25.L : vq_25.L + a2;
            Object b2 = Mqa.y;
            if (n4 >= 0) {
                b2 = vq_22.J.substring(uSa.E, n4);
            }
            if (n5 < vq_22.J.length()) {
                b2 = new StringBuilder().insert(2 & 5, (String)b2).append(vq_22.J.substring(n5)).toString();
            }
            if (vq_22.k == null || vq_22.k.matcher((CharSequence)b2).matches()) {
                vq_22.J = b2;
                vq_22.G();
                if (n3 != 0) {
                    vq_22.C((int)a2);
                }
            }
        }
    }

    public void f(int n2) {
        vq_2 a2;
        int b2 = n2;
        vq_2 vq_22 = a2 = this;
        a2.L = Oz.f((int)b2, (int)uSa.E, (int)a2.J.length());
        vq_22.e(vq_22.L);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(char c2, int n2) {
        int c32 = n2;
        vq_2 a2 = this;
        a2.E = OT.e;
        if (EC.l((int)c32)) {
            vq_2 vq_22 = a2;
            vq_22.f(uSa.E);
            vq_22.e(vq_22.J.length());
            return vRa.d != 0;
        }
        if (EC.C((int)c32)) {
            EC.C((String)a2.f());
            return vRa.d != 0;
        }
        if (EC.J((int)c32)) {
            vq_2 vq_23 = a2;
            EC.C((String)vq_23.f());
            vq_23.f(Mqa.y);
            return vRa.d != 0;
        }
        if (EC.f((int)c32)) {
            a2.f(EC.J());
            return vRa.d != 0;
        }
        switch (c32) {
            case 200: {
                vq_2 vq_24 = a2;
                if (EC.l()) {
                    vq_2 vq_25 = a2;
                    vq_24.e(vq_25.e(vq_25.D, pua.o));
                    break;
                }
                vq_2 vq_26 = a2;
                vq_24.f(vq_26.e(vq_26.L, pua.o));
                break;
            }
            case 208: {
                vq_2 vq_27 = a2;
                if (EC.l()) {
                    vq_2 vq_28 = a2;
                    vq_27.e(vq_28.e(vq_28.D, vRa.d));
                    break;
                }
                vq_2 vq_29 = a2;
                vq_27.f(vq_29.e(vq_29.L, vRa.d));
                break;
            }
            case 203: {
                if (EC.l()) {
                    vq_2 vq_210 = a2;
                    if (EC.C()) {
                        vq_2 vq_211 = a2;
                        vq_210.e(vq_211.C(pua.o, vq_211.D));
                        break;
                    }
                    vq_210.e(a2.D - vRa.d);
                    break;
                }
                vq_2 vq_212 = a2;
                if (EC.C()) {
                    vq_2 vq_213 = a2;
                    vq_212.f(vq_213.C(pua.o, vq_213.L));
                    break;
                }
                vq_212.C(pua.o);
                break;
            }
            case 205: {
                if (EC.l()) {
                    vq_2 vq_214 = a2;
                    if (EC.C()) {
                        vq_2 vq_215 = a2;
                        vq_214.e(vq_215.C(vRa.d, vq_215.D));
                        break;
                    }
                    vq_214.e(a2.D + vRa.d);
                    break;
                }
                vq_2 vq_216 = a2;
                if (EC.C()) {
                    vq_2 vq_217 = a2;
                    vq_216.f(vq_217.C(vRa.d, vq_217.L));
                    break;
                }
                vq_216.C(vRa.d);
                break;
            }
            case 199: {
                vq_2 vq_218 = a2;
                if (EC.l()) {
                    vq_218.e(uSa.E);
                    break;
                }
                vq_218.f(uSa.E);
                break;
            }
            case 207: {
                vq_2 vq_219 = a2;
                if (EC.l()) {
                    vq_219.e(a2.J.length());
                    break;
                }
                vq_219.f(a2.J.length());
                break;
            }
            case 14: {
                boolean bl = EC.C();
                while (false) {
                }
                vq_2 vq_220 = a2;
                if (bl) {
                    vq_220.d(pua.o);
                    break;
                }
                vq_220.l(pua.o);
                break;
            }
            case 211: {
                vq_2 vq_221 = a2;
                if (EC.C()) {
                    vq_221.d(vRa.d);
                    break;
                }
                vq_221.l(vRa.d);
                break;
            }
            case 28: 
            case 156: {
                if (!(a2.i == null || a2.b && EC.l())) {
                    wI c32 = (wI)a2.i.clone();
                    c32.put((Object)wPa.O, (Object)a2.J);
                    OT.J(c32);
                    break;
                }
                if (!a2.b) break;
                a2.f(SPa.O);
                break;
            }
            default: {
                void b2;
                if (cX.J((char)b2)) {
                    a2.f(String.valueOf((char)b2));
                    break;
                }
                return uSa.E != 0;
            }
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    public vq_2(k k2, XM xM2) {
        void a2;
        vq_2 b2;
        Object c2 = k2;
        vq_2 vq_22 = b2 = this;
        vq_2 vq_23 = b2;
        vq_2 vq_24 = b2;
        vq_2 vq_25 = b2;
        super((k)c2, (XM)a2);
        b2.M = ySa.T;
        b2.A = null;
        vq_25.i = null;
        vq_25.k = null;
        vq_24.g = null;
        vq_23.F = null;
        vq_24.I = uSa.E;
        vq_23.b = uSa.E;
        vq_23.J = Mqa.y;
        vq_23.L = uSa.E;
        vq_23.D = uSa.E;
        vq_22.E = nqa.i;
        vq_22.j = null;
        vq_22.j = (ScheduledFuture<?>)vRa.d;
        if (a2.hasHoverable()) {
            b2.j = (ScheduledFuture<?>)a2.getHoverable();
        }
        if (((SJ)(c2 = a2.getETextInput())).hasMaxLength()) {
            b2.M = ((SJ)c2).getMaxLength();
        }
        if (((SJ)c2).hasChangeCallback()) {
            vq_2 vq_26 = b2;
            vq_26.A = new wI(((SJ)c2).getChangeCallback().toByteArray());
        }
        if (((SJ)c2).hasEnterCallback()) {
            b2.i = new wI(((SJ)c2).getEnterCallback().toByteArray());
        }
        if (((SJ)c2).hasAllowRegexp()) {
            b2.k = Pattern.compile(((SJ)c2).getAllowRegexp());
        }
        if (((SJ)c2).hasPlaceholder()) {
            b2.g = ((SJ)c2).getPlaceholder();
        }
        if (((SJ)c2).hasPlaceholderColor()) {
            b2.F = ((SJ)c2).getPlaceholderColor();
        }
        if (((SJ)c2).hasPassword()) {
            b2.I = ((SJ)c2).getPassword();
        }
        if (((SJ)c2).hasMultiline()) {
            b2.b = ((SJ)c2).getMultiline();
        }
        b2.l = vRa.d;
        if (((int)b2.e).length == 0) {
            String[] stringArray = new String[vRa.d];
            stringArray[uSa.E] = Mqa.y;
            b2.e = (int)stringArray;
        }
        vq_2 vq_27 = b2;
        b2.J = String.join((CharSequence)SPa.O, (CharSequence[])vq_27.e);
        b2.f(vq_27.J.length());
    }

    /*
     * WARNING - void declaration
     */
    public void J(long l2) {
        void a2;
        vq_2 vq_22;
        vq_2 vq_23 = vq_22 = this;
        super.J((long)a2);
        if (vq_23.l()) {
            int n2;
            vq_2 vq_24;
            vq_2 vq_25;
            vq_2 vq_26 = vq_22;
            int b2 = vq_26.d.f(vq_26.g);
            int n3 = uSa.E;
            switch (Rp.I[vq_22.b.ordinal()]) {
                case 1: {
                    vq_2 vq_27 = vq_22;
                    while (false) {
                    }
                    vq_25 = vq_27;
                    n3 = (vq_27.f() - b2) / uqa.g;
                    break;
                }
                case 2: {
                    n3 = vq_22.f() - b2;
                }
                default: {
                    vq_25 = vq_22;
                }
            }
            if (vq_25.F != null) {
                vq_2 vq_28 = vq_22;
                vq_24 = vq_28;
                n2 = vq_28.F;
            } else {
                vq_2 vq_29 = vq_22;
                vq_24 = vq_29;
                n2 = vq_2.l((int)vq_29.x.J, (int)((int)((float)vq_2.J((int)vq_22.x.J) * MQa.L)));
            }
            vq_2 vq_210 = vq_22;
            vq_24.d.J(vq_210.g, vq_210.a + n3, uSa.E, n2, vq_22.m != 0);
        }
        if (vq_22.f()) {
            vq_2 vq_211 = vq_22;
            Point b2 = vq_211.J(vq_211.L);
            if (vq_211.D != vq_22.L) {
                int n4;
                Point point;
                Object object;
                vq_2 vq_212 = vq_22;
                Point point2 = vq_212.J(vq_212.D);
                if (vq_212.L > vq_22.D) {
                    object = point2;
                    point = b2;
                } else {
                    object = b2;
                    point = point2;
                }
                uKa.A();
                uKa.f((int)WOa.i);
                int n5 = n4 = ((Point)object).y;
                while (n5 <= point.y) {
                    int n6;
                    int n7;
                    int n8;
                    vq_2 vq_213 = vq_22;
                    int n9 = vq_22.d(n4) + vq_213.a;
                    int n10 = vq_213.C(n4);
                    if (n4 == ((Point)object).y) {
                        vq_2 vq_214 = vq_22;
                        n8 = vq_214.d.f(vq_214.e[n4].substring(uSa.E, ((Point)object).x));
                    } else {
                        n8 = n7 = uSa.E;
                    }
                    if (n4 == point.y) {
                        vq_2 vq_215 = vq_22;
                        n6 = vq_215.d.f(vq_215.e[n4].substring(uSa.E, point.x));
                    } else {
                        n6 = vq_22.D[n4].x;
                    }
                    int n11 = n6;
                    Kh.J((double)(n9 + n7), (double)n10, (double)(n11 - n7), (double)vq_22.D[++n4].y, (int)FRa.m);
                    n5 = n4;
                }
                uKa.F();
            }
            if ((a2 - vq_22.E) % KPa.E < rQa.l) {
                vq_2 vq_216 = vq_22;
                int n12 = vq_216.d.f(vq_216.e[b2.y].substring(uSa.E, b2.x)) + vq_22.d(b2.y) + vq_22.a;
                Kh.J((double)n12, (double)vq_22.C(b2.y), (double)oua.i, (double)vq_22.D[b2.y].y, (int)vq_22.x.J);
            }
        }
    }

    @Override
    public Object J() {
        vq_2 a2;
        return a2.J;
    }

    /*
     * WARNING - void declaration
     */
    private int C(int n2) {
        void a2;
        vq_2 vq_22 = this;
        int b2 = uSa.E;
        if (vq_22.l != pua.o) {
            int n3;
            int n4 = n3 = uSa.E;
            while (n4 < a2) {
                b2 += vq_22.l;
                n4 = ++n3;
            }
            if (a2 < ((int)vq_22.D).length) {
                vq_2 vq_23 = vq_22;
                return b2 += (vq_23.l - vq_23.D[a2].y) / uqa.g;
            }
        } else {
            int n5;
            int n6 = n5 = uSa.E;
            while (n6 < a2) {
                void v3 = vq_22.D[n5];
                b2 += v3.y;
                n6 = ++n5;
            }
        }
        return b2;
    }

    public String f() {
        vq_2 vq_22;
        vq_2 vq_23 = vq_22 = this;
        vq_2 vq_24 = vq_22;
        int n2 = Math.min(vq_23.L, vq_24.D);
        int a2 = Math.max(vq_23.L, vq_22.D);
        return vq_24.J.substring(n2, a2);
    }

    /*
     * WARNING - void declaration
     */
    private int C(int n2, int n3) {
        void b2;
        int c2 = n3;
        vq_2 a2 = this;
        return vq_2.J(a2.J, (int)b2, c2, vRa.d != 0);
    }

    private boolean l() {
        vq_2 a2;
        if (a2.g != null && a2.J.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float e() {
        vq_2 a2;
        if (a2.l() && a2.d.J) {
            vq_2 vq_22 = a2;
            return vq_22.d.f(vq_22.g) + a2.a * uqa.g;
        }
        return Math.max(super.e(), YSa.G);
    }
}

