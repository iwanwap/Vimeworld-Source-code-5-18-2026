/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CR
 *  Cta
 *  Dpa
 *  EC
 *  Epa
 *  Ez
 *  FPa
 *  Gl
 *  Ip
 *  JPa
 *  Kl
 *  Kpa
 *  LQa
 *  NA
 *  OS
 *  Ol
 *  Oo
 *  PTa
 *  Qsa
 *  Rba
 *  Sk
 *  Ssa
 *  Tg
 *  Tpa
 *  U
 *  Up
 *  Uqa
 *  Vr
 *  XSa
 *  YC
 *  Yg
 *  ZM
 *  Zpa
 *  asa
 *  cJ
 *  di
 *  gu
 *  hO
 *  hra
 *  iMa
 *  j
 *  jc
 *  kS
 *  ln
 *  mTa
 *  mm
 *  mp
 *  nj
 *  pj
 *  pqa
 *  pua
 *  um
 *  uw
 *  vL
 *  vO
 *  vP
 *  vQa
 *  vRa
 *  wI
 *  wi
 *  zU
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.protobuf.ByteString;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;
import javax.vecmath.Vector4f;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class OT
implements j {
    public wi H;
    private int c;
    public VoiceChatConfiguration B;
    public static final ScheduledExecutorService d;
    private int a;
    public static final Logger b;
    public Dpa l;
    public static long e;
    public cJ G;
    public rw D;
    public Ni f;
    public eq F;
    public di g;
    public Ol L;
    private static Vector4f E;
    public Map<UUID, nj> m;
    public Sk C;
    public static final OT i;
    public Vr M;
    public vP k;
    public static final String j = "texteria/cache";
    public OS J;
    public static final boolean A;
    private Kpa I;

    public static String f(String string) {
        String string2 = string;
        Object a2 = OT.i.F.J(zpa.n);
        if (a2 instanceof Ip && ((Ip)a2).e.length > 0) {
            a2 = Ez.J((String)((Ip)a2).e[uSa.E]);
            if (((String)a2).contains(Tpa.E)) {
                return ((String)a2).split(Tpa.E, uqa.g)[uSa.E];
            }
            return a2;
        }
        return string2;
    }

    public boolean f() {
        OT oT = this;
        if (oT.I.Ta == null) {
            return uSa.E != 0;
        }
        int n2 = Mouse.getEventDWheel();
        boolean bl = Mouse.getEventButtonState();
        if (oT.I.ta == null && oT.M.f()) {
            return vRa.d != 0;
        }
        if (n2 == 0 && !bl) {
            return uSa.E != 0;
        }
        n2 = Integer.compare(n2, uSa.E);
        int a2 = uSa.E;
        int n3 = uSa.E;
        if (bl) {
            n3 = Mouse.getEventButton();
        }
        if (oT.I.ta == null) {
            int n4;
            Tg[] tgArray = oT.H.i.J();
            int n5 = n4 = tgArray.length - vRa.d;
            while (n5 >= 0) {
                Tg tg = tgArray[n4];
                if (tg.J) {
                    if (bl) {
                        a2 = tg.f(n3);
                    }
                    if (n2 != 0) {
                        int n6 = a2 = a2 != 0 || tg.J(n2) ? vRa.d : uSa.E;
                    }
                    if (a2 != 0) break;
                }
                n5 = --n4;
            }
        } else {
            int n7;
            if (bl) {
                oT.F.J();
            }
            if (oT.k.J(bl, n2)) {
                return vRa.d != 0;
            }
            CR[] cRArray = CR.REVERSED_RENDER_ORDER;
            int n8 = CR.REVERSED_RENDER_ORDER.length;
            int n9 = n7 = uSa.E;
            while (n9 < n8) {
                Object object = cRArray[n7];
                if (oT.F.J((CR)object)) {
                    List<Bp> list = oT.F.M.get(object);
                    object = list.listIterator(list.size());
                    while (object.hasPrevious() && a2 == 0) {
                        Bp bp = (Bp)object.previous();
                        if (!bp.W || !bp.e) continue;
                        if (bl) {
                            a2 = bp.J(uSa.E, uSa.E, n3) ? 1 : 0;
                        }
                        if (n2 == 0) continue;
                        a2 = a2 != 0 || bp.J(n2) ? vRa.d : uSa.E;
                    }
                }
                n9 = ++n7;
            }
        }
        return a2 != 0;
    }

    public static void J(Oo oo2) {
        Oo oo3 = oo2;
        iMa iMa2 = Kpa.J().J();
        if (iMa2 == null) {
            return;
        }
        Object a2 = Unpooled.wrappedBuffer(oo3.toByteString().asReadOnlyByteBuffer());
        iMa2.J((KC)new Rba(Upa.ja, new Lca((ByteBuf)a2)));
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(boolean bl) {
        void a2;
        OT oT = this;
        if (Keyboard.getEventKeyState()) {
            int n2;
            int b2 = Keyboard.getEventKey() == 0 ? Keyboard.getEventCharacter() + hra.Ja : Keyboard.getEventKey();
            int n3 = n2 = Kpa.ca ? ITa.A : Epa.ja;
            if (b2 == kTa.j && (Keyboard.isKeyDown(n2) || Keyboard.isKeyDown(kTa.T))) {
                oT.k.f();
                return vRa.d != 0;
            }
            if (A && b2 == Qsa.Ha && Keyboard.isKeyDown(n2)) {
                oT.g.l();
            }
            if (zU.E && b2 == LQa.c && Keyboard.isKeyDown(n2)) {
                zU.M.J();
            }
        }
        if (a2 != false) {
            if (oT.I.Ta != null && oT.I.ta != null && oT.F.J() != null) {
                if (Keyboard.getEventKeyState()) {
                    int b2 = Keyboard.getEventKey();
                    if (b2 == vRa.d) {
                        oT.F.J();
                        return vRa.d != 0;
                    }
                    oT.F.J().J(Keyboard.getEventCharacter(), b2);
                }
                return vRa.d != 0;
            }
        } else {
            return oT.M.J();
        }
        return uSa.E != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(mm mm2) {
        OT b2 = mm2;
        OT a2 = this;
        switch (gu.A[b2.getAnimationCase().ordinal()]) {
            case 1: {
                vO.J((int)b2.getScreenShakeAnimation().getFov(), (int)b2.getScreenShakeAnimation().getShake(), (int)b2.getScreenShakeAnimation().getColor());
                return;
            }
            case 2: {
                String string;
                String string2;
                b2 = b2.getCameraPath();
                if (b2.hasPath()) {
                    string = string2 = b2.getPath();
                } else {
                    if (!b2.hasResource()) {
                        throw new IllegalArgumentException(Cta.A);
                    }
                    string = string2 = a2.C.J(b2.getResource());
                }
                OT oT = a2;
                if (string.startsWith(XSa.e)) {
                    oT.J(string2, b2.getDuration());
                    return;
                }
                Kl kl2 = oT.C.J(string2);
                if (kl2 == null) {
                    b.warn(new StringBuilder().insert(3 >> 2, ATa.B).append(string2).toString());
                    return;
                }
                kl2.f().thenAccept(kS.J((OT)a2, (ZM)b2));
                return;
            }
        }
    }

    public static String J(String string) {
        String string2 = string;
        Object a2 = OT.i.F.J(zpa.n);
        if (a2 instanceof Ip) {
            if (a2 instanceof Up) {
                ((Up)a2).G();
            }
            if (((String)(a2 = Ez.J((String)((Ip)a2).e[uSa.E]))).contains(Tpa.E)) {
                return ((String)a2).split(Tpa.E, uqa.g)[vRa.d];
            }
            return string2;
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(hO hO2) {
        void a2;
        OT oT = this;
        switch (gu.I[a2.getActionCase().ordinal()]) {
            case 1: {
                OT oT2;
                String string;
                while (false) {
                }
                OT b2 = a2.getPlayParticles();
                UUID uUID = bh.J(b2.getUuid().toByteArray());
                if (b2.hasPath()) {
                    string = b2.getPath();
                    oT2 = oT;
                } else if (b2.hasResource()) {
                    OT oT3 = oT;
                    oT2 = oT3;
                    string = oT3.C.J(b2.getResource());
                } else {
                    throw new IllegalArgumentException(osa.J);
                }
                Kl kl2 = oT2.C.J(string);
                if (kl2 == null) {
                    b.warn(new StringBuilder().insert(5 >> 3, qsa.K).append(string).toString());
                    return;
                }
                kl2.f().thenAccept(VR.J(oT, (ln)b2, uUID));
                return;
            }
            case 2: {
                oT.m.remove(bh.J(a2.getStopParticles().getUuid().toByteArray()));
            }
        }
    }

    public void J(Kpa kpa2) {
        OT b2 = kpa2;
        OT a2 = this;
        a2.I = b2;
        File file = new File(Kpa.J().p, zua.fa);
        OT oT = a2;
        a2.D = new rw(new File(file, FPa.P), new File(file, asa.j));
        mp.J((Kpa)b2);
        oT.C = new Sk();
        a2.d();
        a2.G = new cJ();
        a2.F = new eq((Kpa)b2);
        a2.H = new wi((Kpa)b2);
        a2.f = new Ni((Kpa)b2);
        a2.M = new Vr();
        a2.L = new Ol((Kpa)b2);
        a2.J = new OS(a2);
        a2.k = new vP(a2);
        a2.B = ConfigurationService.J(VoiceChatConfiguration.class);
        if (b2.J() instanceof NA) {
            ((NA)b2.J()).J((j)a2);
        }
        String[] stringArray = new String[uqa.g];
        stringArray[uSa.E] = Upa.Da;
        stringArray[vRa.d] = Upa.ja;
        Kpa.Z.addAll(Arrays.asList(stringArray));
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(OT oT, ZM zM, InputStream inputStream) {
        Object c22 = inputStream;
        OT a2 = oT;
        try {
            void b2;
            c22 = IOUtils.toString((InputStream)c22);
            Kpa.J().J(Gs.J(a2, (String)c22, (ZM)b2));
            return;
        }
        catch (IOException c22) {
            b.warn(Zpa.A, (Throwable)c22);
            return;
        }
    }

    private void d() {
        OT a2;
        if (a2.g != null) {
            a2.g.J();
        }
        a2.g = new di(a2.C);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(OT oT, String string, ZM zM) {
        void b2;
        OT c2 = zM;
        OT a2 = oT;
        a2.J((String)b2, c2.getDuration());
    }

    public void J(U u2) {
        OT a2;
        OT b2 = u2;
        OT oT = a2 = this;
        oT.F.l();
        oT.H.J();
        oT.L.J();
        oT.G.l();
    }

    /*
     * WARNING - void declaration
     */
    public void J(float f2) {
        OT oT = this;
        Iterator<nj> iterator = oT.m.values().iterator();
        block0: while (true) {
            Iterator<nj> iterator2 = iterator;
            while (iterator2.hasNext()) {
                void a2;
                OT b2 = iterator.next();
                Gl gl2 = b2.J();
                if (gl2 == null) {
                    iterator2 = iterator;
                    continue;
                }
                if (jc.A != null) {
                    PC pC = jc.J((Matrix4f)jc.A, (Matrix4f)jc.J((Matrix4f)new Matrix4f()), (YC)YC.COLUMN);
                    Vector4f vector4f = OT.J(pC.I, gl2, JPa.N, JPa.N, JPa.N, (float)a2);
                    OT oT2 = oT;
                    if (oT2.a != oT2.c) {
                        OT oT3 = b2;
                        ((nj)b2).t.set(((nj)oT3).S);
                        ((nj)oT3).m.set(((nj)b2).a);
                    }
                    oT.a = oT.c;
                    OT oT4 = b2;
                    OT oT5 = b2;
                    ((nj)oT5).a.x = vector4f.x;
                    ((nj)oT5).a.y = vector4f.y;
                    ((nj)oT5).a.z = vector4f.z;
                    ((nj)oT5).r.set(new Vector3f(pqa.r, pqa.r, pqa.r));
                    ((nj)oT5).S.set(pC.J());
                    ((nj)oT5).w[uSa.E] = pC.J.m00;
                    ((nj)oT5).w[vRa.d] = pC.J.m11;
                    ((nj)oT4).w[uqa.g] = pC.J.m22;
                    oT4.f((float)a2);
                    ((nj)oT4).Z = vRa.d;
                    continue block0;
                }
                OT oT6 = b2;
                OT oT7 = b2;
                ((nj)oT7).a.x = pj.J((double)gl2.c, (double)gl2.la, (double)((double)a2));
                ((nj)oT7).a.y = pj.J((double)gl2.ba, (double)gl2.Z, (double)((double)a2));
                ((nj)oT6).a.z = pj.J((double)gl2.r, (double)gl2.A, (double)((double)a2));
                ((nj)oT6).S.setIdentity();
                oT6.f((float)a2);
                ((nj)b2).Z = vRa.d;
                continue block0;
            }
            break;
        }
    }

    /*
     * Exception decompiling
     */
    public static /* synthetic */ void J(OT var0, ln var1_2, UUID var2_5, InputStream var3_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 0[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void C() {
        OT a2;
        a2.D.l();
    }

    public void l() {
        Object a2;
        OT oT;
        OT oT2 = oT = this;
        oT2.H.l();
        oT2.f.f();
        oT2.g.f();
        oT2.G.f();
        oT2.c += vRa.d;
        Object object = a2 = oT2.m.values().iterator();
        while (object.hasNext()) {
            nj nj2 = (nj)a2.next();
            object = a2;
            nj2.E = uSa.E;
            nj2.f();
        }
    }

    public static boolean J() {
        Bp bp;
        String string = OT.f(Mqa.y);
        if (string.equals(KPa.h)) {
            return vRa.d != 0;
        }
        if (string.equals(xTa.G) && (bp = OT.i.F.J(Uqa.Ha)) instanceof Ip && ((Ip)bp).e.length > 0) {
            return ((Ip)bp).e[uSa.E].equals(wsa.s);
        }
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string, long l2) {
        Object c22 = string;
        OT b2 = this;
        try {
            void a2;
            c22 = new JsonParser().parse((String)c22).getAsJsonObject();
            mTa.J((JsonObject)c22);
            if (a2 > nqa.i) {
                mTa.I = a2;
            }
            mTa.d();
            return;
        }
        catch (Exception c22) {
            b.warn(Vra.y, (Throwable)c22);
            return;
        }
    }

    public static /* synthetic */ String J(int n2) {
        vL vL2;
        int n3 = n2;
        String a2 = pua.b;
        int n4 = uSa.E;
        if (Kpa.J().Ta != null && (vL2 = Kpa.J().Ta.J(n3)) != null) {
            n4 = vRa.d;
            a2 = new StringBuilder().insert(3 & 4, a2).append(PTa.o).append((int)vL2.la).append(TOa.n).append((int)vL2.Z).append(TOa.n).append((int)vL2.A).toString();
        }
        if (n4 == 0) {
            a2 = new StringBuilder().insert(3 & 4, a2).append(Ira.ba).append(n3).toString();
        }
        return a2;
    }

    public void f() {
        OT a2;
        if (a2.I != null) {
            a2.L.f();
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Vector4f J(Matrix4f matrix4f, Gl gl2, float f2, float f3, float f4, float f5) {
        void a2;
        void b2;
        void c2;
        void d2;
        Vector4f vector4f;
        Matrix4f f6 = gl2;
        Matrix4f e2 = matrix4f;
        Vector4f vector4f2 = vector4f = OT.J();
        vector4f.set((float)d2, (float)c2, (float)b2, pqa.r);
        e2.transform(vector4f2);
        Vector4f vector4f3 = vector4f;
        vector4f2.add(new Vector4f((float)pj.J((double)((Gl)f6).c, (double)((Gl)f6).la, (double)((double)a2)), (float)pj.J((double)((Gl)f6).ba, (double)((Gl)f6).Z, (double)((double)a2)), (float)pj.J((double)((Gl)f6).r, (double)((Gl)f6).A, (double)((double)a2)), JPa.N));
        return vector4f2;
    }

    public void J() {
        OT a2;
        uw.J();
        OT oT = a2;
        oT.f();
        if (oT.I != null) {
            OT oT2 = a2;
            oT2.C.f();
            oT2.d();
            oT2.G.J();
            oT2.F.C();
            oT2.H.f();
            oT2.f.J();
            oT2.M.J();
            Yg.J();
            gP.J();
            oT2.k.l();
            oT2.m.clear();
        }
    }

    private OT() {
        OT a2;
        OT oT = a2;
        a2.m = new HashMap<UUID, nj>();
        oT.c = uSa.E;
        a2.a = uSa.E;
    }

    public static void J(String string, Object ... objectArray) {
        Object[] b2 = objectArray;
        String a2 = string;
        if (A) {
            b.info(new StringBuilder().insert(3 ^ 3, vQa.Aa).append(a2).toString(), b2);
        }
    }

    public static void J(wI a2) {
        OT.J((Oo)Oo.J().setCallback(ByteString.copyFrom(a2.toByteArray())).build());
    }

    public void J(um um2) {
        OT b2 = um2;
        OT a2 = this;
        EC.C((String)b2.getText());
    }

    public static Vector4f J() {
        if (E == null) {
            E = new Vector4f();
        }
        return E;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(OT oT, JJ jJ2, int n2, UUID uUID) {
        void a2;
        void b2;
        void c2;
        OT d2;
        OT oT2 = oT;
        OT oT3 = d2 = new nj();
        ((nj)d2).h = vRa.d;
        oT3.J((JJ)c2);
        oT3.J((int)b2);
        oT2.m.put((UUID)a2, (nj)d2);
    }

    static {
        A = Boolean.getBoolean(Ssa.F);
        i = new OT();
        b = LogManager.getLogger(Upa.Da);
        d = Executors.newSingleThreadScheduledExecutor();
        e = System.currentTimeMillis();
    }
}

