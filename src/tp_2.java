/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dr
 *  Fr
 *  JPa
 *  JSa
 *  Kh
 *  Kpa
 *  Oz
 *  Qsa
 *  Ri
 *  Sqa
 *  UG
 *  Vp
 *  XM
 *  XTa
 *  YSa
 *  aSa
 *  bqa
 *  cI
 *  cQ
 *  cRa
 *  fO
 *  fq
 *  hR
 *  hm
 *  k
 *  kta
 *  pqa
 *  pua
 *  qh
 *  sG
 *  tp
 *  uKa
 *  uRa
 *  ui
 *  up
 *  vQa
 *  vRa
 *  vpa
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class tp_2
extends nP
implements k {
    private static final Logger q = LogManager.getLogger(tp_2.class);
    private float x;
    private final Kpa v;
    public Tq o;
    private static final float h = 1.5f;
    private boolean K;
    private Bp c;
    private PG B;
    private static final int d = 2;
    private static final int a = 3;
    private boolean b;
    private float e;
    private final Map<String, Bp> G;
    public int D;
    public final kL f;
    private UG F;
    private float g;
    public boolean L;
    private boolean E;
    private boolean m;
    private boolean C;
    private int i;
    private int M;
    private boolean k;
    public int J;
    private final List<Bp> A;
    private float I;

    public void J(List<XM> list) {
        Iterator b2 = list;
        tp_2 a2 = this;
        b2 = b2.iterator();
        while (b2.hasNext()) {
            XM xM2 = (XM)b2.next();
            try {
                a2.l(Bp.J(xM2, a2));
            }
            catch (Exception exception) {
                OT.b.log(Level.WARN, new StringBuilder().insert(5 >> 3, Era.F).append(xM2).toString(), (Throwable)exception);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(int n2) {
        void a2;
        tp_2 tp_22 = this;
        if (tp_22.J(hR.J((int)a2))) {
            return vRa.d != 0;
        }
        if (tp_22.o != Tq.NONE) {
            float b2 = tp_22.M();
            if (b2 == JPa.N) {
                return uSa.E != 0;
            }
            float f2 = (float)Mouse.getEventDWheel() / YSa.G * tp_22.g;
            b2 = Oz.J((float)(tp_22.f.J() - f2), (float)JPa.N, (float)b2);
            if (b2 != tp_22.f.J()) {
                tp_22.f.J(b2, Jpa.Ha, sG.A);
            }
            return vRa.d != 0;
        }
        return super.J((int)a2);
    }

    @Override
    public boolean J(long a2) {
        tp_2 b2;
        if (b2.K) {
            tp_2 tp_22 = b2;
            tp_22.x = vqa.T;
            tp_22.e = vqa.T;
        }
        return super.J(a2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void J(long var1_4) {
        var3_5 = this;
        if (var3_5.F != null && var3_5.F.J()) {
            return;
        }
        v0 = var3_5;
        var5_6 = v0.f();
        var4_7 = v0.J();
        switch (fq.I[var3_5.o.ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                if (var3_5.d() > var5_6) {
                    v1 = var5_6;
                    b = v1 * v1 / var3_5.e;
                    var6_8 = (var5_6 - b) * var3_5.f.f() / (var3_5.e - var5_6);
                    if (var3_5.A == false && var3_5.j) {
                        var7_10 = Mouse.isButtonDown(uSa.E);
                        if (var3_5.b && !var7_10) {
                            var3_5.b = uSa.E;
                        }
                        if (var3_5.b) {
                            var8_13 = ((float)var3_5.i - var3_5.I) * (var3_5.e - var5_6) / (var5_6 - b);
                            if ((var8_13 = Math.max(JPa.N, Math.min(var8_13, var3_5.e - var5_6))) != var3_5.f.J()) {
                                var3_5.f.J(var8_13, vpa.o, sG.A, (long)a);
                            }
                            var6_8 = (var5_6 - b) * var3_5.f.f() / (var3_5.e - var5_6);
                        }
                        if (!var3_5.b && var7_10 && (float)var3_5.M >= var4_7 + kta.v && (float)var3_5.M < var4_7 + kta.v + vQa.q && (float)var3_5.i >= var6_8 && (float)var3_5.i < var6_8 + b) {
                            var3_5.b = vRa.d;
                            var3_5.I = (float)var3_5.i - var6_8;
                        }
                    }
                    v2 = var3_5;
                    Kh.J((double)(var4_7 + kta.v), (double)aSa.V, (double)uRa.I, (double)var5_6, (int)v2.l(v2.D), (double)Bta.c);
                    v3 = var3_5;
                    Kh.J((double)(var4_7 + kta.v), (double)var6_8, (double)uRa.I, (double)b, (int)v3.l(v3.J), (double)Bta.c);
                    v4 = var3_5;
                    break;
                }
                ** GOTO lbl54
            }
            case 2: {
                if (var3_5.e() > var4_7) {
                    v5 = var4_7;
                    b = v5 * v5 / var3_5.x;
                    var6_8 = (var4_7 - b) * var3_5.f.f() / (var3_5.x - var4_7);
                    if (var3_5.A == false && var3_5.j) {
                        var7_10 = Mouse.isButtonDown(uSa.E);
                        if (var3_5.b && !var7_10) {
                            var3_5.b = uSa.E;
                        }
                        if (var3_5.b) {
                            var8_13 = ((float)var3_5.M - var3_5.I) * (var3_5.x - var4_7) / (var4_7 - b);
                            if ((var8_13 = Math.max(JPa.N, Math.min(var8_13, var3_5.x - var4_7))) != var3_5.f.J()) {
                                var3_5.f.J(var8_13, vpa.o, sG.A, (long)a);
                            }
                            var6_8 = (var4_7 - b) * var3_5.f.f() / (var3_5.x - var4_7);
                        }
                        if (!var3_5.b && var7_10 && (float)var3_5.M >= var6_8 && (float)var3_5.M < var6_8 + b && (float)var3_5.i >= var5_6 + kta.v && (float)var3_5.i < var5_6 + kta.v + vQa.q) {
                            var3_5.b = vRa.d;
                            var3_5.I = (float)var3_5.M - var6_8;
                        }
                    }
                    v6 = var3_5;
                    Kh.J((double)aSa.V, (double)(var5_6 + kta.v), (double)var4_7, (double)uRa.I, (int)v6.l(v6.D), (double)Bta.c);
                    v7 = var3_5;
                    Kh.J((double)var6_8, (double)(var5_6 + kta.v), (double)b, (double)uRa.I, (int)v7.l(v7.J), (double)Bta.c);
                }
            }
lbl54:
            // 5 sources

            default: {
                v4 = var3_5;
            }
        }
        if (v4.o != Tq.NONE && var3_5.f.f() > var3_5.M()) {
            var3_5.f.J(var3_5.M());
        }
        b = var3_5.f.f();
        switch (fq.I[var3_5.o.ordinal()]) {
            case 1: {
                while (false) {
                }
                if (b != JPa.N) {
                    uKa.J((float)JPa.N, (float)(-b), (float)JPa.N);
                    v8 = var3_5;
                    break;
                }
                ** GOTO lbl71
            }
            case 2: {
                if (b != JPa.N) {
                    uKa.J((float)(-b), (float)JPa.N, (float)JPa.N);
                }
            }
lbl71:
            // 5 sources

            default: {
                v8 = var3_5;
            }
        }
        v8.D();
        var6_9 = uSa.E;
        if (var3_5.L) ** GOTO lbl88
        v9 = var3_5;
        if (var3_5.c != null) {
            cI.J((Runnable)Dr.J((tp)v9, (long)a));
            v10 = var3_5;
        } else {
            if (v9.F != null && var3_5.F.f()) {
                v11 = var3_5;
                v12 = v11.F.J(v11.B);
            } else {
                v12 = null;
            }
            var7_11 = v12;
            cI.J((Runnable)up.J((tp)var3_5, (float)b, var7_11, (float)var4_7, (float)var5_6));
lbl88:
            // 2 sources

            v10 = var3_5;
        }
        var7_12 = v10.A.iterator();
        block16: while (true) {
            v13 = var7_12;
            block17: while (v13.hasNext()) {
                var8_14 = var7_12.next();
                if (var8_14.i <= a) {
                    v13 = var7_12;
                    var3_5.G.remove(var8_14.I, var8_14);
                    var3_5.A.remove(var8_14);
                    var8_14.J();
                    var6_9 = vRa.d;
                    continue;
                }
                if (!var8_14.J(var3_5.v)) {
                    v13 = var7_12;
                    continue;
                }
                if (!var3_5.L) {
                    var9_15 = var8_14.J((long)a);
                    switch (fq.I[var3_5.o.ordinal()]) {
                        case 1: {
                            while (false) {
                            }
                            if (var9_15.A > b + var5_6) continue block16;
                            if (!(var9_15.A + var8_14.l() < b)) break;
                            v13 = var7_12;
                            continue block17;
                        }
                        case 2: {
                            if (!(var9_15.I > b + var4_7)) ** break;
                            continue block16;
                            if (!(var9_15.I + var8_14.C() < b)) break;
                            v13 = var7_12;
                            continue block17;
                        }
                    }
                }
                uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
                try {
                    var8_14.f((long)a);
                    v14 = var6_9;
                }
                catch (Exception var9_16) {
                    OT.b.error(new StringBuilder().insert(3 & 4, Sqa.C).append(var8_14).append(hpa.b).toString(), (Throwable)var9_16);
                    v14 = var6_9;
                }
                var6_9 = v14 | (var8_14.o != nqa.i ? vRa.d : uSa.E);
                v13 = var7_12;
            }
            break;
        }
        if (!var3_5.L) {
            cI.J();
        }
        if (var6_9 != 0 || var3_5.K) {
            v15 = var3_5;
            v15.K = var6_9;
            v15.x = vqa.T;
            v15.e = vqa.T;
        }
    }

    @Override
    public float d() {
        tp_2 tp_22 = this;
        if (tp_22.e < JPa.N) {
            Iterator<Bp> iterator;
            if (tp_22.k) {
                return JPa.N;
            }
            tp_22.k = vRa.d;
            float f2 = JPa.N;
            Iterator<Bp> iterator2 = iterator = tp_22.A.iterator();
            while (iterator2.hasNext()) {
                float f3;
                float f4;
                Bp a2 = iterator.next();
                if (a2.v != null) {
                    f4 = a2.J().A + a2.l();
                    f3 = f2;
                } else {
                    f4 = a2.b.f() + a2.l();
                    f3 = f2;
                }
                f2 = Math.max(f3, f4);
                iterator2 = iterator;
            }
            tp_2 tp_23 = tp_22;
            tp_23.e = f2;
            tp_23.C = vRa.d;
            tp_23.k = uSa.E;
        }
        return tp_22.e;
    }

    public void l(Bp bp2) {
        Bp b2 = bp2;
        tp_2 a2 = this;
        if (((Bp)b2).i > a2.i) {
            ((Bp)b2).i = a2.i;
        }
        a2.A.add(b2);
        Bp bp3 = b2;
        a2.f(bp3);
        tp_2.J(bp3);
    }

    @Override
    public void J(fO fO2) {
        hm hm2;
        tp_2 b222 = fO2;
        tp_2 a2 = this;
        if (b222.hasHoverable() && !b222.getHoverable() && a2.j) {
            for (Bp object : a2.A) {
                if (!object.j) continue;
                object.J(rta.n, rta.n, OT.e);
            }
        }
        super.J((fO)b222);
        if (!b222.hasEContainer()) {
            return;
        }
        hm hm3 = b222.getEContainer();
        block8: for (tp_2 b222 : hm3.getActionsList()) {
            switch (fq.A[b222.getKind().ordinal()]) {
                case 1: {
                    Iterator<Bp> exception;
                    try {
                        while (false) {
                        }
                        exception = Bp.J(b222.getAdd(), a2);
                        if (a2.A != false) {
                            ((Bp)((Object)exception)).d();
                        }
                        a2.l((Bp)((Object)exception));
                    }
                    catch (Exception exception2) {
                        OT.b.error(new StringBuilder().insert(3 ^ 3, tSa.N).append((String)a2.I).append(XTa.Z).toString(), (Throwable)exception2);
                    }
                    continue block8;
                }
                case 2: {
                    tp_2 tp_22 = a2;
                    if (b222.hasRemove()) {
                        tp_22.J(b222.getRemove());
                        continue block8;
                    }
                    tp_22.J(bh.J(b222.getRemoveUuid().toByteArray()));
                    continue block8;
                }
                case 3: {
                    Iterator<Bp> exception = tp_2.J(a2, b222.getEdit());
                    Iterator<Bp> iterator = exception = exception.iterator();
                    while (iterator.hasNext()) {
                        Bp bp2 = exception.next();
                        iterator = exception;
                        a2.J(bp2, b222.getEdit());
                    }
                    continue block8;
                }
            }
        }
        if (hm3.hasScrollOffset()) {
            hm hm4 = hm3;
            hm2 = hm4;
            a2.f.J(Oz.J((float)hm4.getScrollOffset(), (float)JPa.N, (float)a2.M()));
        } else {
            if (hm3.hasScrollOffsetAnim()) {
                a2.f.J(Oz.J((float)hm3.getScrollOffsetAnim(), (float)JPa.N, (float)a2.M()), a2.L.C, a2.L.A);
            }
            hm2 = hm3;
        }
        if (hm2.getActionsCount() > 0) {
            a2.A();
        }
    }

    public tp_2(k k2, XM xM2) {
        String string;
        String a2;
        tp_2 b2;
        Object c2 = k2;
        tp_2 tp_22 = b2 = this;
        tp_2 tp_23 = b2;
        super((k)c2, (XM)a2, pua.o);
        b2.v = Kpa.J();
        tp_2 tp_24 = b2;
        tp_24.A = new CopyOnWriteArrayList<Bp>();
        b2.G = new HashMap<String, Bp>();
        b2.L = vRa.d;
        b2.o = Tq.NONE;
        b2.J = bqa.L;
        b2.D = Qsa.P;
        b2.g = pqa.r;
        tp_23.F = null;
        tp_22.B = null;
        tp_23.x = vqa.T;
        tp_22.e = vqa.T;
        tp_22.m = uSa.E;
        tp_22.k = uSa.E;
        tp_22.C = vRa.d;
        tp_22.K = uSa.E;
        tp_22.f = new kL(JPa.N);
        tp_22.M = uSa.E;
        tp_22.i = uSa.E;
        tp_22.b = uSa.E;
        tp_22.I = JPa.N;
        c2 = a2.getEContainer();
        if (((rm)c2).hasOverflow()) {
            b2.L = ((rm)c2).getOverflow();
        }
        if (((rm)c2).hasScrollbar()) {
            b2.o = Tq.fromProto(((rm)c2).getScrollbar());
        }
        if (((rm)c2).hasScrollbarColor()) {
            b2.J = ((rm)c2).getScrollbarColor();
        }
        if (((rm)c2).hasScrollbarBackground()) {
            b2.D = ((rm)c2).getScrollbarBackground();
        }
        if (((rm)c2).hasScrollSpeedMultiplier()) {
            b2.g = ((rm)c2).getScrollSpeedMultiplier();
        }
        if (((rm)c2).hasFixIterateHover()) {
            b2.E = ((rm)c2).getFixIterateHover();
        }
        a2 = null;
        if (((rm)c2).hasMaskElement()) {
            string = a2;
            b2.J(((rm)c2).getMaskElement());
        } else if (((rm)c2).hasMaskImagePath()) {
            string = a2 = ((rm)c2).getMaskImagePath();
        } else {
            if (((rm)c2).hasMaskImageResource()) {
                a2 = OT.i.C.J(((rm)c2).getMaskImageResource());
            }
            string = a2;
        }
        if (string != null) {
            b2.F = OT.i.g.J(new qh(a2), Vp.J((tp)b2));
            b2.B = new PG(OT.e);
        }
        tp_2 tp_25 = b2;
        tp_25.J(((rm)c2).getElementsList());
        if (tp_25.L) {
            b2.o = Tq.NONE;
            return;
        }
        if (b2.o != Tq.NONE) {
            b2.j = vRa.d;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public boolean J(int n2, int n3, int n4) {
        void a2;
        tp_2 tp_22;
        void d2;
        void b2;
        void var4_7;
        void c2;
        tp_2 tp_23 = this;
        int n5 = (int)tp_23.f.f();
        switch (fq.I[tp_23.o.ordinal()]) {
            case 1: {
                var4_7 = c2;
                d2 = b2 + n5;
                tp_22 = tp_23;
                break;
            }
            case 2: {
                var4_7 = c2 + n5;
                d2 = b2;
                tp_22 = tp_23;
                break;
            }
            default: {
                var4_7 = c2;
                d2 = b2;
                tp_22 = tp_23;
            }
        }
        if (tp_22.J(ZP.J((int)var4_7, (int)d2, (int)a2))) {
            return vRa.d != 0;
        }
        return super.J((int)c2, (int)b2, (int)a2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ boolean J(int n2, int n3, int n4, Bp bp2) {
        void b2;
        void c2;
        Bp d2 = bp2;
        int a2 = n2;
        return d2.J(a2, (int)c2, (int)b2);
    }

    /*
     * WARNING - void declaration
     */
    public tp_2(k k2, String string, float f2, float f3) {
        void e2;
        void b2;
        void c2;
        void d2;
        tp_2 a2;
        float f4 = f3;
        tp_2 tp_22 = a2 = this;
        tp_2 tp_23 = a2;
        super((k)d2, (String)c2, (float)b2, (float)e2);
        a2.v = Kpa.J();
        tp_2 tp_24 = a2;
        tp_24.A = new CopyOnWriteArrayList<Bp>();
        a2.G = new HashMap<String, Bp>();
        a2.L = vRa.d;
        a2.o = Tq.NONE;
        a2.J = bqa.L;
        a2.D = Qsa.P;
        a2.g = pqa.r;
        tp_23.F = null;
        tp_22.B = null;
        tp_23.x = vqa.T;
        tp_22.e = vqa.T;
        tp_22.m = uSa.E;
        tp_22.k = uSa.E;
        tp_22.C = vRa.d;
        tp_22.K = uSa.E;
        tp_22.f = new kL(JPa.N);
        tp_22.M = uSa.E;
        tp_22.i = uSa.E;
        tp_22.b = uSa.E;
        tp_22.I = JPa.N;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float M() {
        tp_2 tp_22 = this;
        float a2 = JPa.N;
        switch (fq.I[tp_22.o.ordinal()]) {
            case 1: {
                return Math.max(JPa.N, tp_22.d() - tp_22.f());
            }
            case 2: {
                return Math.max(JPa.N, tp_22.e() - tp_22.J());
            }
        }
        return a2;
    }

    @Override
    public float e() {
        tp_2 tp_22 = this;
        if (tp_22.x < JPa.N) {
            Iterator<Bp> iterator;
            if (tp_22.m) {
                return JPa.N;
            }
            tp_22.m = vRa.d;
            float f2 = JPa.N;
            Iterator<Bp> iterator2 = iterator = tp_22.A.iterator();
            while (iterator2.hasNext()) {
                float f3;
                float f4;
                Bp a2 = iterator.next();
                if (a2.v != null) {
                    f4 = a2.J().I + a2.C();
                    f3 = f2;
                } else {
                    f4 = a2.d.f() + a2.C();
                    f3 = f2;
                }
                f2 = Math.max(f3, f4);
                iterator2 = iterator;
            }
            tp_2 tp_23 = tp_22;
            tp_23.x = f2;
            tp_23.C = vRa.d;
            tp_23.m = uSa.E;
        }
        return tp_22.x;
    }

    @Override
    public void d() {
        Object a2;
        tp_2 tp_22;
        tp_2 tp_23 = tp_22 = this;
        super.d();
        Object object = a2 = tp_23.A.iterator();
        while (object.hasNext()) {
            ((Bp)a2.next()).d();
            object = a2;
        }
    }

    private void f(Bp bp2) {
        Bp b2 = bp2;
        tp_2 a2 = this;
        if ((b2 = a2.G.put((String)b2.I, b2)) != null) {
            b2.l();
        }
    }

    public static /* synthetic */ void J(tp b2, long a22) {
        tp tp2 = b2;
        if (!tp2.c.J(tp2.v)) {
            return;
        }
        uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
        try {
            b2.c.f(a22);
            return;
        }
        catch (Exception a22) {
            OT.b.error(new StringBuilder().insert(3 >> 2, Sqa.C).append(b2.c).append(hpa.b).toString(), (Throwable)a22);
            return;
        }
    }

    public void J(UUID uUID) {
        UUID b2 = uUID;
        tp_2 a2 = this;
        a2.A.stream().filter(jP.J(b2)).forEach(cQ.J());
    }

    private void D() {
        tp_2 tp_22 = this;
        if (tp_22.C) {
            Object a2;
            tp_22.C = uSa.E;
            if (tp_22.c != null) {
                tp_22.c.e();
            }
            Object object = a2 = tp_22.A.iterator();
            while (object.hasNext()) {
                ((Bp)a2.next()).e();
                object = a2;
            }
        }
    }

    @Override
    public boolean J() {
        tp_2 a2;
        if (a2.e != false || a2.E && a2.I != null && a2.I.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static /* synthetic */ String J(tp a2) {
        return new StringBuilder().insert(3 >> 2, Jra.J).append(a2.J()).toString();
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(Predicate<Bp> predicate) {
        boolean b222;
        void a2;
        tp_2 tp_22;
        tp_2 tp_23 = tp_22 = this;
        ListIterator<Bp> listIterator = tp_22.A.listIterator(tp_23.A.size());
        int b222 = uSa.E;
        if (tp_23.c != null && tp_22.c.W && tp_22.c.e) {
            boolean b222 = a2.test(tp_22.c);
        }
        block0: while (true) {
            ListIterator<Bp> listIterator2 = listIterator;
            while (listIterator2.hasPrevious() && !b222) {
                Bp bp2 = listIterator.previous();
                if (!bp2.W) continue block0;
                if (!bp2.J()) {
                    listIterator2 = listIterator;
                    continue;
                }
                b222 = a2.test(bp2);
                listIterator2 = listIterator;
            }
            break;
        }
        return b222;
    }

    public void J(String string) {
        String a2;
        tp_2 tp_22 = this;
        if (a2.endsWith(JSa.a)) {
            void v0 = a2;
            a2 = v0.substring(uSa.E, v0.length() - vRa.d);
            for (Bp bp2 : tp_22.A) {
                if (!bp2.I.startsWith(a2)) continue;
                bp2.l();
            }
        } else {
            for (Bp bp3 : tp_22.A) {
                if (!bp3.I.equals(a2)) continue;
                bp3.l();
            }
        }
    }

    @Override
    public void f() {
        Object a2;
        tp_2 tp_22;
        tp_2 tp_23 = tp_22 = this;
        super.f();
        tp_23.A();
        if (tp_23.c != null) {
            tp_22.c.f();
        }
        Object object = a2 = tp_22.A.iterator();
        while (object.hasNext()) {
            ((Bp)a2.next()).f();
            object = a2;
        }
    }

    public void A() {
        tp_2 a2;
        tp_2 tp_22 = a2;
        tp_22.x = vqa.T;
        tp_22.e = vqa.T;
        tp_22.K = vRa.d;
    }

    private static void J(Bp bp2) {
        Bp bp3 = bp2;
        if (bp3.w == Fr.I) {
            bp3.w = Fr.A;
        }
        if (bp3 instanceof tp_2) {
            Object a2;
            Object object = a2 = ((tp_2)bp3).A.iterator();
            while (object.hasNext()) {
                tp_2.J((Bp)a2.next());
                object = a2;
            }
        }
    }

    public static List<Bp> J(k k2, fO fO2) {
        Object b2 = fO2;
        k a2 = k2;
        if (b2.hasId()) {
            Bp bp2 = tp_2.J(a2, b2.getId(), b2.getPathList());
            if (bp2 == null) {
                return Collections.emptyList();
            }
            return Collections.singletonList(bp2);
        }
        if (b2.hasUuid()) {
            UUID uUID = bh.J(b2.getUuid().toByteArray());
            Object object = b2 = new ArrayList();
            a2.J(uUID, (List)object);
            return object;
        }
        return Collections.emptyList();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void J(int n2, int n3, long l2) {
        Bp bp2;
        Iterator<Bp> d2;
        tp_2 tp_22;
        void a2;
        void b2;
        void c2;
        tp_2 tp_23;
        tp_2 tp_24 = tp_23 = this;
        void v1 = c2;
        super.J((int)v1, (int)b2, (long)a2);
        tp_24.M = v1;
        tp_24.i = b2;
        switch (fq.I[tp_23.o.ordinal()]) {
            case 1: {
                b2 += (int)tp_23.f.f();
                tp_22 = tp_23;
                break;
            }
            case 2: {
                c2 += (int)tp_23.f.f();
            }
            default: {
                tp_22 = tp_23;
            }
        }
        tp_22.D();
        if (tp_23.c != null) {
            tp_2 tp_25 = tp_23;
            tp_25.J(tp_25.c, (int)c2, (int)b2, (long)a2);
        }
        Iterator<Bp> iterator = d2 = tp_23.A.iterator();
        while (iterator.hasNext()) {
            bp2 = (Bp)d2.next();
            iterator = d2;
            tp_23.J(bp2, (int)c2, (int)b2, (long)a2);
        }
        if (tp_23.c != null && tp_23.c.j) {
            tp_23.c.e();
        }
        d2 = tp_23.A.iterator();
        while (d2.hasNext()) {
            bp2 = d2.next();
            if (!bp2.j) continue;
            bp2.e();
        }
        return;
    }

    /*
     * WARNING - void declaration
     */
    public static Bp J(k k2, String string, List<String> list) {
        void b2;
        Iterator a2;
        k k3 = k2;
        a2 = a2.iterator();
        while (a2.hasNext()) {
            Object c2 = (String)a2.next();
            if ((c2 = k3.J((String)c2)) instanceof tp_2) {
                k3 = (tp_2)c2;
                OT.i.k.J((Bp)c2);
                continue;
            }
            return null;
        }
        return k3.J((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(Bp bp2, int n2, int n3, long l2) {
        void a2;
        Bp bp3;
        Bp e2 = bp2;
        tp_2 d2 = this;
        if (!e2.j) {
            return;
        }
        if (!d2.L && d2.e == false) {
            Bp bp4 = e2;
            bp3 = bp4;
            bp4.J(rta.n, rta.n, (long)a2);
        } else {
            void b2;
            void c2;
            Bp bp5 = e2;
            bp3 = bp5;
            Ri ri2 = bp5.J((long)a2);
            Bp bp6 = e2;
            bp6.J((int)(((float)c2 - ri2.I) / e2.k.f()), (int)(((float)b2 - ri2.A) / bp6.J.f()), (long)a2);
        }
        if (bp3.e && e2.f != null && d2.A == false && e2.W) {
            OT.i.F.C(e2);
        }
    }

    public void J(XM xM2) {
        tp_2 b22 = xM2;
        tp_2 a2 = this;
        try {
            a2.c = Bp.J((XM)b22, a2);
            if (a2.c.i > a2.i) {
                a2.c.i = a2.i;
            }
            tp_2 tp_22 = a2;
            tp_22.f(tp_22.c);
            tp_2.J(tp_22.c);
            return;
        }
        catch (Exception b22) {
            OT.b.log(Level.WARN, SPa.ja, (Throwable)b22);
            return;
        }
    }

    public Bp J(String string) {
        String b2 = string;
        tp_2 a2 = this;
        return a2.G.get(b2);
    }

    @Override
    public void J() {
        Object a2;
        tp_2 tp_22;
        tp_2 tp_23 = tp_22 = this;
        super.J();
        if (tp_23.c != null) {
            tp_22.c.J();
        }
        Object object = a2 = tp_22.A.iterator();
        while (object.hasNext()) {
            ((Bp)a2.next()).J();
            object = a2;
        }
    }

    public static /* synthetic */ boolean J(int n2, Bp bp2) {
        Bp b2 = bp2;
        int a2 = n2;
        return b2.J(a2);
    }

    public List<Bp> J() {
        tp_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(tp tp2, float f2, ui ui2, float f3, float f4) {
        void a2;
        void b2;
        void c2;
        float e2 = f2;
        tp d2 = tp2;
        float f5 = d2.o == Tq.HORIZONTAL ? e2 : JPa.N;
        float f6 = d2.o == Tq.VERTICAL ? e2 : JPa.N;
        e2 = d2.I.f() * d2.k.f();
        if (c2 != null) {
            uKa.H();
            uKa.C((int)c2.I);
            uKa.f((float)pqa.r, (float)pqa.r, (float)pqa.r, (float)pqa.r);
            void v0 = c2;
            void v1 = c2;
            Kh.J((float)f5, (float)f6, (float)b2, (float)a2, (float)v0.A, (float)v0.j, (float)v1.k, (float)v1.J, (float)e2);
            uKa.z();
            return;
        }
        Kh.J((double)f5, (double)f6, (double)((double)b2), (double)((double)a2), (int)cRa.r, (double)e2);
    }

    @Override
    public void l() {
        tp_2 tp_22;
        tp_2 tp_23 = tp_22 = this;
        super.l();
        long l2 = nqa.i;
        for (Bp bp2 : tp_23.A) {
            bp2.l();
            if (bp2.i <= l2) continue;
            l2 = bp2.i;
        }
        if (l2 > tp_22.i) {
            tp_22.i = (int)l2;
        }
    }

    public static /* synthetic */ boolean J(UUID uUID, Bp bp2) {
        Bp b2 = bp2;
        UUID a2 = uUID;
        return a2.equals(b2.J());
    }

    /*
     * WARNING - void declaration
     */
    public void J(Bp bp2, fO fO2) {
        void b2;
        tp_2 c2 = fO2;
        tp_2 a2 = this;
        void v0 = b2;
        v0.J((fO)c2);
        tp_2.J((Bp)v0);
    }
}

