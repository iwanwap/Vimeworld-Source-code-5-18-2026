/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nka
 *  pua
 */
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;

public final class bJa_1 {
    private int J;
    private final hKa A;
    private int I;

    public void l() {
        bJa_1 a2;
        if (a2.I >= 0) {
            nka.i((int)a2.I);
            a2.I = pua.o;
        }
    }

    public void J(ByteBuffer byteBuffer) {
        bJa_1 a2;
        ByteBuffer b2 = byteBuffer;
        bJa_1 bJa_12 = a2 = this;
        bJa_12.f();
        nka.J((int)nka.U, (ByteBuffer)b2, (int)Pua.F);
        bJa_12.J();
        bJa_12.J = b2.limit() / a2.A.C();
    }

    public void f() {
        bJa_1 a2;
        nka.f((int)nka.U, (int)a2.I);
    }

    public bJa_1(hKa hKa2) {
        hKa b2 = hKa2;
        bJa_1 a2 = this;
        a2.A = b2;
        a2.I = nka.C();
    }

    public void J() {
        nka.f((int)nka.U, (int)uSa.E);
    }

    public void J(int n2) {
        int b2 = n2;
        bJa_1 a2 = this;
        GL11.glDrawArrays(b2, uSa.E, a2.J);
    }
}

