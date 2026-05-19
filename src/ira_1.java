/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NTa
 *  Qqa
 *  hra
 *  kpa
 *  vRa
 */
import io.github.jaredmdobson.concentus.OpusApplication;
import io.github.jaredmdobson.concentus.OpusEncoder;
import io.github.jaredmdobson.concentus.OpusFramesize;
import java.util.Arrays;

public final class ira_1 {
    private final OpusEncoder I;

    public ira_1() {
        ira_1 ira_12 = this;
        try {
            ira_1 ira_13 = ira_12;
            ira_13.I = new OpusEncoder(kpa.Ka, vRa.d, OpusApplication.OPUS_APPLICATION_VOIP);
            ira_13.I.setComplexity(NTa.C);
            ira_13.I.setUseVBR(vRa.d != 0);
            ira_13.I.setBitrate(Qqa.B);
            ira_13.I.setExpertFrameDuration(OpusFramesize.OPUS_FRAMESIZE_40_MS);
            return;
        }
        catch (Throwable a2) {
            throw new RuntimeException(a2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public byte[] J(byte[] byArray) {
        ira_1 ira_12 = this;
        try {
            void a22;
            Object b2;
            Object object = b2 = (Object)new byte[hra.Ja];
            int a22 = ira_12.I.encode((byte[])a22, uSa.E, nqa.N, (byte[])object, uSa.E, ((Object)object).length);
            return Arrays.copyOf((byte[])b2, a22);
        }
        catch (Throwable b2) {
            throw new RuntimeException(b2);
        }
    }
}

