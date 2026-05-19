/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import org.lwjgl.opengl.GL11;

public final class sja {
    private boolean A;
    private final int I;

    public void f() {
        sja a2;
        a2.J(uSa.E != 0);
    }

    public void J(boolean bl) {
        boolean b2 = bl;
        sja a2 = this;
        if (b2 != a2.A) {
            a2.A = b2;
            if (a2.A) {
                GL11.glEnable(a2.I);
                return;
            }
            GL11.glDisable(a2.I);
        }
    }

    public void J() {
        sja a2;
        a2.J(vRa.d != 0);
    }

    public static /* synthetic */ boolean J(sja a2) {
        return a2.A;
    }

    public sja(int n2) {
        int b2 = n2;
        sja a2 = this;
        a2.A = uSa.E;
        a2.I = b2;
    }
}

