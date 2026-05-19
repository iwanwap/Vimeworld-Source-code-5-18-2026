/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ARa
 *  Dpa
 *  Dqa
 *  M
 *  QQa
 *  Tpa
 *  XPa
 *  Xra
 *  YPa
 *  aPa
 *  ePa
 *  hTa
 *  mqa
 *  nra
 *  tQa
 *  uA
 *  vRa
 *  xPa
 *  yPa
 *  zra
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.stream.Collectors;
import java.util.zip.GZIPOutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import paulscode.sound.SoundSystem;
import ru.vimeworld.configuration.impl.VoiceChatConfiguration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Dpa_2 {
    private QQa g;
    private final QOa L;
    private boolean E;
    private boolean m;
    private final nra C;
    private boolean i;
    private final ScheduledExecutorService M;
    private static final Logger k = LogManager.getLogger();
    private int j;
    public boolean J;
    private int A;
    private final M I;

    public boolean e() {
        Dpa_2 a2;
        return a2.i;
    }

    private static String f(String a2) {
        return new StringBuilder().insert(5 >> 3, hTa.Fa).append(a2).toString();
    }

    public boolean d() {
        Dpa_2 a2;
        if (a2.g != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public QQa J() {
        Dpa_2 a2;
        return a2.g;
    }

    public boolean C() {
        Dpa_2 a2;
        return a2.E;
    }

    public void d() {
        Dpa_2 a2;
        Dpa_2 dpa_2 = a2;
        dpa_2.C.J();
        dpa_2.C.J(vRa.d != 0, uSa.E != 0, Duration.ofSeconds(Bra.I));
    }

    public static /* synthetic */ void f(Dpa a2) {
        super.l();
    }

    public static /* synthetic */ String f(byte[] a2) {
        return Base64.getEncoder().encodeToString(a2);
    }

    public static /* synthetic */ nra J(Dpa a2) {
        return a2.C;
    }

    public void C() {
        Dpa_2 a2;
        Dpa_2 dpa_2 = a2;
        dpa_2.J();
        dpa_2.L.f();
        dpa_2.M.shutdown();
    }

    private void l() {
        Dpa_2 a2;
        Dpa_2 dpa_2 = a2;
        dpa_2.J();
        dpa_2.L.f();
    }

    public static /* synthetic */ void J(Dpa dpa2, boolean bl) {
        boolean b2 = bl;
        Dpa a2 = dpa2;
        a2.i = b2;
        if (a2.i) {
            a2.L.J(Nta.R, Mqa.y);
            return;
        }
        a2.L.J(Nta.R);
    }

    public static /* synthetic */ void J(Dpa a2) {
        a2.A += vRa.d;
    }

    public static /* synthetic */ M J(Dpa a2) {
        return a2.I;
    }

    public void f() {
        Dpa_2 a2;
        if (a2.L != null) {
            a2.L.J().forEach(ePa.J((Dpa)a2));
        }
    }

    /*
     * WARNING - void declaration
     */
    public Dpa_2(M m2, SoundSystem soundSystem, String string, String string2, int n2, byte[] byArray, byte[] byArray2) throws IOException {
        byte[] f2;
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        Dpa_2 g;
        Object h = m2;
        Dpa_2 dpa_2 = g = this;
        g.M = Executors.newSingleThreadScheduledExecutor();
        g.A = uSa.E;
        g.j = uSa.E;
        g.m = uSa.E;
        g.E = uSa.E;
        dpa_2.i = uSa.E;
        dpa_2.J = uSa.E;
        dpa_2.I = h;
        Dpa_2 dpa_22 = g;
        g.C = nra.J((uA)new XPa((Dpa)g, null), (String)e2, (String)d2, (int)c2, (byte[])b2, (byte[])a2);
        dpa_22.L = new QOa((SoundSystem)f2, g.M);
        g.L.J();
        h = WF.J();
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = h.stream().map(ARa.J()).collect(Collectors.toList());
        objectArray[vRa.d] = h.stream().map(xPa.J()).collect(Collectors.toList());
        k.warn(Qra.t, objectArray);
        if (!h.isEmpty()) {
            f2 = OT.i.B.selectedMicrophone;
            if (OT.i.B.selectedMicrophone != null && h.stream().anyMatch(Xra.J((byte[])f2))) {
                g.J(f2);
                return;
            }
            OT.i.B.selectedMicrophone = (byte[])h.get(uSa.E);
            g.J((byte[])h.get(uSa.E));
        }
    }

    public tQa J() {
        Dpa_2 a2;
        if (a2.g != null) {
            return a2.g.J();
        }
        return null;
    }

    public nra J() {
        Dpa_2 a2;
        return a2.C;
    }

    public static /* synthetic */ boolean J(byte[] byArray, byte[] byArray2) {
        byte[] b2 = byArray2;
        byte[] a2 = byArray;
        return Arrays.equals(b2, a2);
    }

    public static boolean l() {
        int n2 = OT.i.B.voiceChatKeyBind;
        if (n2 < 0) {
            return Mouse.isButtonDown(n2 + ySa.T);
        }
        return Keyboard.isKeyDown(n2);
    }

    public static /* synthetic */ QOa J(Dpa a2) {
        return a2.L;
    }

    public void J() {
        Dpa_2 a2;
        if (a2.g != null) {
            a2.g.f();
            a2.g = null;
        }
    }

    public void f(boolean bl) {
        boolean b2 = bl;
        Dpa_2 a2 = this;
        a2.M.execute(Dqa.J((Dpa)a2, (boolean)b2));
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Dpa dpa2, String string, zra zra2) {
        void b2;
        Dpa c2 = zra2;
        Dpa a2 = dpa2;
        a2.L.J((String)b2, OT.i.B.J(c2.k));
    }

    public static /* synthetic */ String J(byte[] a2) {
        return new String(a2, StandardCharsets.UTF_8);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        Dpa_2 a2 = this;
        if (a2.g != null && a2.g.J(b2) && b2) {
            a2.M.execute(mqa.J((Dpa)a2));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void J(byte[] var1_1) {
        b = var1_1;
        a = this;
        a.J();
        v0 = a;
        v0.g = new QQa(new tQa((byte[])b, OT.i.B.micVoiceChatVolume), a.M);
        if (!OT.i.B.enableNoiseSupression) ** GOTO lbl16
        b = yPa.J();
        if (b == null) {
            OT.i.B.enableNoiseSupression = uSa.E;
            VoiceChatConfiguration.J();
            v1 = a;
        } else {
            a.g.J((yPa)b);
lbl16:
            // 2 sources

            v1 = a;
        }
        v1.A += vRa.d;
        a.g.J(YPa.J((Dpa)a));
    }

    public static /* synthetic */ String J(String a2) {
        return Dpa_2.f(a2);
    }

    public static /* synthetic */ boolean f(Dpa dpa2, boolean bl) {
        boolean b2 = bl;
        Dpa a2 = dpa2;
        a2.m = b2;
        return a2.m;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, float f2) {
        void b2;
        float c2 = f2;
        Dpa_2 a2 = this;
        return a2.L.J(Dpa_2.f((String)b2), c2);
    }

    public static /* synthetic */ boolean J(Dpa a2) {
        return a2.m;
    }

    public boolean f() {
        Dpa_2 a2;
        if (a2.d() && a2.g.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        Dpa_2 a2;
        return a2.m;
    }

    public static /* synthetic */ boolean J(Dpa dpa2, boolean bl) {
        boolean b2 = bl;
        Dpa a2 = dpa2;
        a2.E = b2;
        return a2.E;
    }

    public static /* synthetic */ Logger J() {
        return k;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(Dpa dpa2, byte[] byArray, byte[] byArray2) {
        boolean bl;
        void a2;
        Dpa dpa3 = dpa2;
        if (dpa3.i) {
            Dpa dpa4 = dpa3;
            dpa3.L.J(Nta.R, (byte[])a2, Nta.R, dpa4.A, dpa4.j);
        }
        int bl2 = uSa.E;
        if (dpa3.m && !dpa3.E && OT.i.B.microEnabled && (!OT.i.B.voiceChatKeyBindToggle || Dpa_2.l())) {
            bl = vRa.d;
            Dpa dpa5 = dpa3;
            int n2 = dpa3.j;
            dpa3.j = n2 + vRa.d;
            dpa5.C.J(dpa5.A, (long)n2, (byte[])a2);
        }
        if (WF.J) {
            Object c222;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                void b2;
                c222 = new GZIPOutputStream(byteArrayOutputStream);
                void v3 = b2;
                c222.write((byte[])v3, uSa.E, ((void)v3).length);
                Dpa dpa6 = c222;
                dpa6.finish();
                dpa6.close();
            }
            catch (IOException c222) {
                k.warn(aPa.R, (Throwable)c222);
                return;
            }
            c222 = byteArrayOutputStream.toByteArray();
            k.warn(new StringBuilder().insert(5 >> 3, rQa.B).append(bl).append(Tpa.E).append(dpa3.A).append(Era.Aa).append(dpa3.j).append(uua.Ha).append(System.currentTimeMillis()).append(Tpa.E).append(Base64.getEncoder().encodeToString((byte[])c222)).append(Tpa.E).append(Base64.getEncoder().encodeToString((byte[])a2)).toString());
        }
    }
}

