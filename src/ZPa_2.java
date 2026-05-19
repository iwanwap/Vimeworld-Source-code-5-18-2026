/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  JPa
 *  ZOa
 *  pqa
 *  vRa
 *  vpa
 */
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCdevice;

public final class ZPa_2 {
    public static final int J = 48000;
    public static final AudioFormat A = new AudioFormat(gua.e, ERa.C, vRa.d, vRa.d != 0, uSa.E != 0);
    public static final int I = 1920;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void J(int n2, String string) {
        void a2;
        String b2;
        int n3 = n2;
        if (n3 == 0) {
            return;
        }
        switch (n3) {
            case 40961: {
                b2 = Upa.S;
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, (String)a2).append(tpa.F).append(n3).append(Xpa.E).append(b2).toString());
            }
            case 40962: {
                b2 = ZOa.E;
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, (String)a2).append(tpa.F).append(n3).append(Xpa.E).append(b2).toString());
            }
            case 40963: {
                b2 = Hta.J;
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, (String)a2).append(tpa.F).append(n3).append(Xpa.E).append(b2).toString());
            }
            case 40964: {
                b2 = vpa.ja;
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, (String)a2).append(tpa.F).append(n3).append(Xpa.E).append(b2).toString());
            }
            case 40965: {
                b2 = Fsa.f;
                throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, (String)a2).append(tpa.F).append(n3).append(Xpa.E).append(b2).toString());
            }
        }
        b2 = wta.l;
        throw new IllegalStateException(new StringBuilder().insert(3 ^ 3, (String)a2).append(tpa.F).append(n3).append(Xpa.E).append(b2).toString());
    }

    public static void J(ByteBuffer byteBuffer, float f2) {
        int n2;
        float b2 = f2;
        ByteBuffer a2 = byteBuffer;
        if (b2 == pqa.r) {
            return;
        }
        b2 = b2 <= JPa.N ? JPa.N : (float)Math.pow(Wqa.m, b2 - pqa.r);
        int n3 = n2 = uSa.E;
        while (n3 < a2.remaining() / uqa.g) {
            ByteBuffer byteBuffer2 = a2;
            int n4 = Math.round((float)byteBuffer2.getShort(n2 * uqa.g) * b2);
            n4 = Math.max(Bra.e, Math.min(BQa.h, n4));
            int n5 = n2 * uqa.g;
            byteBuffer2.putShort(n5, (short)n4);
            n3 = ++n2;
        }
    }

    public static void J(ALCdevice aLCdevice, String string) {
        String b2 = string;
        ALCdevice a2 = aLCdevice;
        ZPa_2.J(ALC10.alcGetError(a2), b2);
    }

    public ZPa_2() {
        ZPa_2 a2;
    }
}

