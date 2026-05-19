/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rd
 *  U
 *  VJa
 *  vRa
 *  xb
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import optifine.Config;

public final class VJa_2
extends Rd {
    private boolean k;
    private final int j;
    private final int[] J;
    private final int A;
    private static final String I = "CL_00001048";

    /*
     * WARNING - void declaration
     */
    public VJa_2(int n2, int n3) {
        void b2;
        VJa_2 a2;
        int c2 = n3;
        VJa_2 vJa_2 = a2 = this;
        a2.k = uSa.E;
        a2.j = b2;
        vJa_2.A = c2;
        vJa_2.J = new int[b2 * c2 * yRa.d];
        if (Config.h()) {
            xb.J((int)a2.J(), (int)b2, (int)c2, (VJa)a2);
            a2.k = vRa.d;
            return;
        }
        gLa.J(a2.J(), (int)b2, c2);
    }

    public int[] J() {
        VJa_2 a2;
        return a2.J;
    }

    public void J(U object) throws IOException {
        VJa_2 b2 = object;
        object = this;
    }

    public VJa_2(BufferedImage bufferedImage) {
        BufferedImage b2 = bufferedImage;
        VJa_2 a2 = this;
        Object object = b2;
        a2(b2.getWidth(), ((BufferedImage)object).getHeight());
        ((BufferedImage)object).getRGB(uSa.E, uSa.E, b2.getWidth(), b2.getHeight(), a2.J, uSa.E, b2.getWidth());
        a2.f();
    }

    public void f() {
        VJa_2 a2;
        if (Config.h()) {
            if (!a2.k) {
                xb.J((int)a2.J(), (int)a2.j, (int)a2.A, (VJa)a2);
                a2.k = vRa.d;
            }
            VJa_2 vJa_2 = a2;
            xb.J((int)a2.J(), (int[])vJa_2.J, (int)vJa_2.j, (int)a2.A, (VJa)a2);
            return;
        }
        VJa_2 vJa_2 = a2;
        gLa.J(a2.J(), vJa_2.J, vJa_2.j, a2.A);
    }
}

