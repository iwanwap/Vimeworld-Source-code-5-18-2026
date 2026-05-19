/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  Oqa
 *  ad
 *  kC
 *  lE
 *  pqa
 */
import java.awt.Color;

public final class Bd
extends jb {
    private final kC A;
    private float I;

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(int n2, int n3) {
        void b2;
        Bd a2;
        int c2 = n3;
        Bd bd2 = a2 = this;
        bd2.A.J((Color)Bc.E.transparent(WF.J() * a2.I));
        super.J((int)b2, c2);
    }

    public Bd(String string) {
        Bd a2;
        Object b2 = string;
        Bd bd2 = a2 = this;
        super(Oqa.ROW, uSa.E, AQa.P);
        bd2.I = pqa.r;
        bd2.A(uSa.E);
        bd2.C(uSa.E);
        Bd bd3 = a2;
        bd2.A = new kC(null, hpa.Z, (String)b2, (Color)Bc.E);
        bd2.f((ad)bd2.A);
        a2.A.J(lE.THIN);
    }

    public Bd J(float f2) {
        float b2 = f2;
        Bd a2 = this;
        a2.I = b2;
        return a2;
    }
}

