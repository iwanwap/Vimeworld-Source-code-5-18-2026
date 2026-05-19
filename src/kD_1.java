/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bc
 *  JPa
 *  Sf
 *  pua
 *  vB
 */
import java.awt.Color;

public final class kD_1
extends vB {
    private final Xe I;

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3) {
        void b2;
        int c2 = n3;
        kD_1 a2 = this;
        a2.f((int)b2, c2);
        Sf.J((char)kra.S).J((int)a2.I, (int)a2.J, (int)a2.k, (int)a2.j, a2.A ? Bc.Da.getRGB() : pua.o);
    }

    /*
     * WARNING - void declaration
     */
    public void J(int n2, int n3, int n4, boolean bl) {
        void b2;
        void e2;
        boolean bl2 = bl;
        kD_1 a2 = this;
        if (e2 != false && b2 == false) {
            a2.I.J(uSa.E != 0);
        }
    }

    public kD_1(Xe xe) {
        Object b2 = xe;
        kD_1 a2 = this;
        super(uSa.E, uSa.E, kTa.j, kTa.j, (Color)Bc.Pa.transparent(JPa.N), null);
        a2.I = b2;
    }
}

