/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aKa
 */
import com.google.common.primitives.Floats;
import java.util.Comparator;

public final class oja_2
implements Comparator {
    public final aKa A;
    public final float[] I;

    /*
     * WARNING - void declaration
     */
    public int compare(Object object, Object object2) {
        void b2;
        Object c2 = object2;
        oja_2 a2 = this;
        return a2.J((Integer)b2, (Integer)c2);
    }

    /*
     * WARNING - void declaration
     */
    public oja_2(aKa aKa2, float[] fArray) {
        void b2;
        oja_2 a2;
        Object c2 = fArray;
        oja_2 oja_22 = a2 = this;
        oja_22.A = b2;
        oja_22.I = (float[])c2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(Integer n2, Integer n3) {
        void b2;
        Integer c2 = n3;
        oja_2 a2 = this;
        return Floats.compare(a2.I[c2], a2.I[b2.intValue()]);
    }
}

