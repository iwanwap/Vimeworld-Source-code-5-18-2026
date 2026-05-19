/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gl
 *  Mda
 *  Yca
 *  Yfa
 *  kta
 *  ry
 *  vRa
 *  xy
 */
import com.google.common.base.Predicates;
import net.minecraft.block.BlockDispenser;

public final class Lfa_2
extends Yca {
    public Lfa_2() {
        Lfa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    public Mda f(dc dc2, Mda mda2) {
        void a2;
        void b2;
        Lfa_2 lfa_2 = this;
        void v0 = b2;
        XF xF2 = b2.J().offset(BlockDispenser.J(v0.J()));
        int c22 = xF2.getX();
        int n2 = xF2.getY();
        int n3 = xF2.getZ();
        Object c22 = new xy((double)c22, (double)n2, (double)n3, (double)(c22 + vRa.d), (double)(n2 + vRa.d), (double)(n3 + vRa.d));
        c22 = v0.J().J(Gl.class, (xy)c22, Predicates.and(Kaa.A, new ry((Mda)a2)));
        if (c22.size() > 0) {
            n2 = (c22 = (Gl)c22.get(uSa.E)) instanceof Sx ? vRa.d : uSa.E;
            void v2 = a2;
            n3 = Yfa.J((Mda)v2);
            Mda mda3 = v2.J();
            Object object = c22;
            mda3.E = vRa.d;
            object.f(n3 - n2, mda3);
            if (object instanceof Yfa) {
                ((Yfa)c22).J(n3, kta.v);
            }
            void v4 = a2;
            v4.E -= vRa.d;
            return v4;
        }
        return super.f((dc)b2, (Mda)a2);
    }
}

