/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hZ
 *  wra
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class RZ_3
extends ByteArrayOutputStream {
    private int J;
    private int A;
    public final /* synthetic */ hZ I;

    @Override
    public void close() throws IOException {
        RZ_3 a2;
        RZ_3 rZ_3 = a2;
        RZ_3 rZ_32 = a2;
        rZ_3.I.J(rZ_3.A, rZ_32.J, rZ_32.buf, a2.count);
    }

    /*
     * WARNING - void declaration
     */
    public RZ_3(hZ hZ2, int n2, int n3) {
        void b2;
        void c2;
        RZ_3 a2;
        int d2 = n3;
        RZ_3 rZ_3 = a2 = this;
        a2.I = c2;
        super(wra.B);
        rZ_3.A = b2;
        rZ_3.J = d2;
    }
}

