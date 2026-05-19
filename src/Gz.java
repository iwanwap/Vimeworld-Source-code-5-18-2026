/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  JSa
 *  Oz
 *  QFa
 *  Waa
 *  uY
 *  vRa
 */
import net.minecraft.block.material.Material;

public final class Gz
extends uY {
    public byte A;
    public boolean I;

    public void J(Waa waa2) {
        Gz b2 = waa2;
        Gz a2 = this;
        Gz gz = b2;
        super.J((Waa)gz);
        gz.J(JSa.W, a2.A);
    }

    public void J() {
        Gz a2;
        Gz gz = a2;
        gz.A = (byte)((gz.A + vRa.d) % kTa.g);
        gz.f();
    }

    /*
     * WARNING - void declaration
     */
    public void J(Gg gg2, XF xF) {
        void a2;
        void b2;
        Gz gz = this;
        if (b2.J(a2.up()).J().J() == Material.air) {
            Material material = b2.J(a2.down()).J().J();
            int c2 = uSa.E;
            if (material == Material.rock) {
                c2 = vRa.d;
            }
            if (material == Material.sand) {
                c2 = uqa.g;
            }
            if (material == Material.glass) {
                c2 = yRa.d;
            }
            if (material == Material.wood) {
                c2 = AQa.P;
            }
            b2.f((XF)a2, QFa.ea, c2, (int)gz.A);
        }
    }

    public Gz() {
        Gz a2;
    }

    public void f(Waa waa2) {
        Gz a2;
        Gz b2 = waa2;
        Gz gz = a2 = this;
        Gz gz2 = a2;
        super.f((Waa)b2);
        gz.A = b2.J(JSa.W);
        gz.A = (byte)Oz.f((int)gz2.A, (int)uSa.E, (int)osa.c);
    }
}

