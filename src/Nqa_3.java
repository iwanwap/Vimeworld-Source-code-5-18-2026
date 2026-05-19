/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kpa
 *  vRa
 */
import io.github.jaredmdobson.concentus.OpusDecoder;

public final class Nqa_3 {
    private final OpusDecoder I;

    /*
     * WARNING - void declaration
     */
    public byte[] J(byte[] byArray) {
        Nqa_3 nqa_3 = this;
        try {
            void a2;
            Object b2 = new byte[Yua.fa];
            void v0 = a2;
            nqa_3.I.decode((byte[])v0, uSa.E, ((void)v0).length, (byte[])b2, uSa.E, nqa.N, uSa.E != 0);
            return b2;
        }
        catch (Throwable b2) {
            throw new RuntimeException(b2);
        }
    }

    public Nqa_3() {
        Nqa_3 nqa_3 = this;
        try {
            nqa_3.I = new OpusDecoder(kpa.Ka, vRa.d);
            return;
        }
        catch (Throwable a2) {
            throw new RuntimeException(a2);
        }
    }
}

