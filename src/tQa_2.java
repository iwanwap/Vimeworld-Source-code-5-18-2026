/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  Bpa
 *  NPa
 *  Rx
 *  Sqa
 *  Uqa
 *  VQa
 *  Ypa
 *  ZPa
 *  Zua
 *  cQa
 *  kpa
 *  kta
 *  pqa
 *  vRa
 *  yra
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.MemoryUtil;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALC11;
import org.lwjgl.openal.ALCdevice;
import org.lwjgl.openal.Util;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class tQa_2 {
    private volatile boolean i;
    private volatile boolean M;
    private final byte[] k;
    private volatile ALCdevice j;
    private volatile boolean J;
    private static final Logger A = LogManager.getLogger();
    private float I;

    public void J(float f2) {
        float b2 = f2;
        tQa_2 a2 = this;
        a2.I = b2;
    }

    public ByteBuffer f(int n2) {
        int b2 = n2;
        tQa_2 a2 = this;
        if (!a2.f() || b2 > a2.f()) {
            return null;
        }
        ByteBuffer byteBuffer = a2.J(b2);
        ZPa.J((ByteBuffer)byteBuffer, (float)a2.I);
        return byteBuffer;
    }

    public int f() {
        tQa_2 a2;
        if (!a2.f() || !a2.J) {
            return uSa.E;
        }
        return a2.J();
    }

    public void C() {
        tQa_2 a2;
        if (!a2.f() || a2.J) {
            return;
        }
        tQa_2 tQa_22 = a2;
        ALC11.alcCaptureStart(tQa_22.j);
        ZPa.J((ALCdevice)tQa_22.j, (String)Ira.u);
        tQa_22.J = vRa.d;
    }

    public void l() {
        tQa_2 a2;
        if (a2.f()) {
            throw new IllegalStateException(csa.h);
        }
        tQa_2 tQa_22 = a2;
        tQa_22.j = tQa_2.J(tQa_22.k, kpa.Ka, Uqa.R, sqa.d);
        if (tQa_22.j == null || !a2.j.isValid()) {
            throw new IllegalStateException(new StringBuilder().insert(2 & 5, Ira.P).append(a2.j).toString());
        }
        a2.M = uSa.E;
        a2.i = ALC10.alcIsExtensionPresent(a2.j, yra.Ga);
    }

    public void f() {
        tQa_2 a2;
        if (!a2.f() || !a2.J) {
            return;
        }
        tQa_2 tQa_22 = a2;
        ALC11.alcCaptureStop(tQa_22.j);
        ZPa.J((ALCdevice)tQa_22.j, (String)ZSa.H);
        tQa_22.J = uSa.E;
        tQa_22.J(tQa_22.J());
    }

    /*
     * WARNING - void declaration
     */
    private ByteBuffer J(int n2) {
        void a2;
        tQa_2 tQa_22 = this;
        ByteBuffer b2 = ByteBuffer.allocateDirect((int)(a2 * uqa.g)).order(ByteOrder.LITTLE_ENDIAN);
        tQa_2 tQa_23 = tQa_22;
        Object object = b2;
        ALC11.alcCaptureSamples(tQa_23.j, (ByteBuffer)object, (int)a2);
        ZPa.J((ALCdevice)tQa_23.j, (String)cTa.Ha);
        return object;
    }

    public void J() {
        Object object = this;
        if (((tQa_2)object).f()) {
            tQa_2 tQa_22 = object;
            tQa_22.f();
            ALCdevice a2 = tQa_22.j;
            tQa_22.j = null;
            ALC11.alcCaptureCloseDevice(a2);
            return;
        }
        if (((tQa_2)object).M) {
            ((tQa_2)object).j = null;
        }
    }

    public boolean f() {
        tQa_2 tQa_22 = this;
        if (tQa_22.j != null && tQa_22.i && !tQa_22.M) {
            Object a2;
            Object object = a2 = BufferUtils.createIntBuffer(vRa.d);
            ALC10.alcGetInteger(tQa_22.j, VQa.d, (IntBuffer)object);
            if (((IntBuffer)object).get(uSa.E) == 0) {
                tQa_22.M = vRa.d;
            }
        }
        if (tQa_22.j != null && !tQa_22.M) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public float J() {
        tQa_2 a2;
        return a2.I;
    }

    public boolean J() {
        tQa_2 a2;
        return a2.J;
    }

    public static List<byte[]> J() {
        int n2;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = nqa.i;
        objectArray[vRa.d] = Ypa.F;
        ByteBuffer byteBuffer = (ByteBuffer)Rx.J(ALC10.class, (String)NPa.ja, (Object[])objectArray);
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        try {
            Util.checkALCError(null);
        }
        catch (Exception exception) {
            A.warn(cQa.j, (Throwable)exception);
            return arrayList;
        }
        if (byteBuffer == null) {
            return arrayList;
        }
        int n3 = byteBuffer.remaining();
        int n4 = uSa.E;
        int n5 = n2 = uSa.E;
        while (n5 < n3) {
            if (byteBuffer.get(n2) == 0 && n4 != n2) {
                byte[] byArray = new byte[n2 - n4];
                ByteBuffer byteBuffer2 = byteBuffer;
                int n6 = byteBuffer2.position();
                byteBuffer2.position(n4);
                byteBuffer2.get(byArray, uSa.E, byArray.length);
                byteBuffer.position(n6);
                arrayList.add(byArray);
                n4 = n2 + vRa.d;
            }
            n5 = ++n2;
        }
        return arrayList;
    }

    public tQa_2(byte[] byArray) {
        Object b2 = byArray;
        tQa_2 a2 = this;
        a2((byte[])b2, pqa.r);
    }

    private int J() {
        tQa_2 tQa_22 = this;
        IntBuffer a2 = BufferUtils.createIntBuffer(vRa.d);
        tQa_2 tQa_23 = tQa_22;
        ALC10.alcGetInteger(tQa_23.j, Sqa.Y, a2);
        ZPa.J((ALCdevice)tQa_23.j, (String)iSa.N);
        return a2.get(uSa.E);
    }

    public static String J(byte[] byArray) {
        byte[] byArray2 = byArray;
        String string = new String(byArray2, StandardCharsets.UTF_8);
        Object a2 = string;
        if (string.contains(BRa.Ga)) {
            try {
                a2 = new String(byArray2, Charset.forName(KPa.f));
                return a2;
            }
            catch (Exception exception) {
                return new String(byArray2, Charset.defaultCharset());
            }
        }
        return a2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static ALCdevice J(byte[] byArray, int n2, int n3, int n4) {
        void b2;
        void c22;
        int d22 = n4;
        byte[] a2 = byArray;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(a2.length + vRa.d);
        byteBuffer.put(a2).put((byte)uSa.E).position(uSa.E);
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = MemoryUtil.getAddressSafe(byteBuffer);
        objectArray[vRa.d] = (int)c22;
        objectArray[uqa.g] = (int)b2;
        objectArray[yRa.d] = d22;
        long l2 = (Long)Rx.J(ALC11.class, (String)Nta.W, (Object[])objectArray);
        if (l2 == nqa.i) {
            Object[] objectArray2 = new Object[AQa.P];
            objectArray2[uSa.E] = nqa.i;
            objectArray2[vRa.d] = (int)c22;
            objectArray2[uqa.g] = (int)b2;
            objectArray2[yRa.d] = d22;
            l2 = (Long)Rx.J(ALC11.class, (String)Nta.W, (Object[])objectArray2);
            A.warn(new StringBuilder().insert(3 ^ 3, Zua.l).append(l2 == nqa.i ? kta.H : Bpa.o).toString());
            if (l2 == nqa.i) {
                return null;
            }
        }
        Object[] objectArray3 = new Object[vRa.d];
        objectArray3[uSa.E] = l2;
        ALCdevice c22 = (ALCdevice)Rx.J(ALCdevice.class, (Object[])objectArray3);
        HashMap d22 = b2 = (HashMap)Rx.J(ALC10.class, (String)qQa.r);
        synchronized (b2) {
            b2.put(l2, c22);
            // ** MonitorExit[d] (shouldn't be in output)
            return c22;
        }
    }

    /*
     * WARNING - void declaration
     */
    public tQa_2(byte[] byArray, float f2) {
        void b2;
        tQa_2 a2;
        float c2 = f2;
        tQa_2 tQa_22 = a2 = this;
        tQa_2 tQa_23 = a2;
        tQa_23.j = null;
        a2.i = uSa.E;
        tQa_23.M = vRa.d;
        tQa_23.J = uSa.E;
        tQa_22.k = b2;
        tQa_22.I = c2;
    }
}

