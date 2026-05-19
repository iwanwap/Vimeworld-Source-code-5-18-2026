/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Hu
 *  Kd
 *  Ke
 *  Oqa
 *  if
 *  uKa
 *  vR
 *  vRa
 */
import java.awt.Color;

public final class Hu_3
extends eF {
    private final Ke A;
    private final vR I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void c2;
        void d2;
        void e2;
        boolean bl2 = bl;
        Hu_3 a2 = this;
        if (e2 == false) {
            return;
        }
        super.J((int)d2, (int)c2, (int)b2, vRa.d != 0);
    }

    public vR J() {
        Hu_3 a2;
        return a2.I;
    }

    public Hu_3(Ke ke) {
        Hu_3 b2 = ke;
        Hu_3 a2 = this;
        super(Oqa.ROW, vRa.d, uSa.E != 0);
        Hu_3 hu_3 = a2;
        a2.I = new vR((Ke)b2, (Hu)a2);
        a2.A = b2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        Hu_3 a2 = this;
        ((mx)a2.A).J().J();
        Hu_3 hu_3 = a2;
        if.J((double)hu_3.I, (double)mx.J().J().l(), (double)CRa.N, (double)ITa.a, (Color)Bc.sb, (Color)Bc.Da, (Kd)Kd.S_X2);
        super.J((int)b2, c2);
        uKa.K();
        hu_3.I.J((int)b2, c2);
        uKa.c();
    }
}

