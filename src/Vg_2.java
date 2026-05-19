/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.util.List;

public final class Vg_2 {
    public kL J;
    public kL A;
    public kL I;

    /*
     * WARNING - void declaration
     */
    public Vg_2(float f2, float f3, float f4) {
        void b2;
        void c2;
        float d2 = f4;
        Vg_2 a2 = this;
        Vg_2 vg_2 = a2;
        a2.I = new kL((float)c2);
        vg_2.J = new kL((float)b2);
        a2.A = new kL(d2);
    }

    public Vg_2(List<Float> list) {
        List<Float> b2 = list;
        Vg_2 a2 = this;
        if (b2.size() == vRa.d) {
            Vg_2 vg_2 = a2;
            vg_2.I = new kL(((Float)b2.get(uSa.E)).floatValue());
            a2.J = new kL(((Float)b2.get(uSa.E)).floatValue());
            a2.A = new kL(((Float)b2.get(uSa.E)).floatValue());
            return;
        }
        if (b2.size() == yRa.d) {
            a2.I = new kL(((Float)b2.get(uSa.E)).floatValue());
            a2.J = new kL(((Float)b2.get(vRa.d)).floatValue());
            a2.A = new kL(((Float)b2.get(uqa.g)).floatValue());
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(3 & 4, Iqa.q).append(b2).toString());
    }

    public Vg_2(float f2) {
        float b2 = f2;
        Vg_2 a2 = this;
        float f3 = b2;
        a2(f3, f3, f3);
    }

    public long J() {
        Vg_2 a2;
        return a2.I.i + a2.J.i + a2.A.i;
    }
}

