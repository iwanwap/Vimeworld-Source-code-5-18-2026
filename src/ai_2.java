/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eI
 */
import java.util.function.Predicate;

public final class ai_2
implements Predicate {
    private final float j;
    private final float J;
    private final long A;
    private final float I;

    public boolean test(Object object) {
        ai_2 a2;
        Object b2 = object;
        ai_2 ai_22 = a2 = this;
        return eI.J((long)a2.A, (float)ai_22.J, (float)ai_22.j, (float)a2.I, (qI)((qI)b2));
    }

    /*
     * WARNING - void declaration
     */
    private ai_2(long l2, float f2, float f3, float f4) {
        void e2;
        void b2;
        void c2;
        void d2;
        ai_2 a2;
        float f5 = f4;
        ai_2 ai_22 = a2 = this;
        ai_2 ai_23 = a2;
        ai_23.A = d2;
        ai_23.J = c2;
        ai_22.j = b2;
        ai_22.I = e2;
    }

    /*
     * WARNING - void declaration
     */
    public static Predicate J(long l2, float f2, float f3, float f4) {
        void c2;
        void b2;
        long d2;
        float f5 = f2;
        f2 = f4;
        float a2 = f5;
        return new ai_2(d2, a2, (float)b2, (float)c2);
    }
}

