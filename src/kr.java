/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.util.function.Supplier;

public final class kr
implements Supplier {
    private final int k;
    private final int j;
    private final int J;
    private final int A;
    private final BufferedImage I;

    /*
     * WARNING - void declaration
     */
    private kr(int n2, int n3, BufferedImage bufferedImage, int n4, int n5) {
        void f2;
        void b2;
        void c2;
        void d2;
        void e2;
        kr a2;
        int n6 = n5;
        kr kr2 = a2 = this;
        kr kr3 = a2;
        a2.k = e2;
        kr3.J = d2;
        kr3.I = c2;
        kr2.j = b2;
        kr2.A = f2;
    }

    /*
     * WARNING - void declaration
     */
    public static Supplier J(int n2, int n3, BufferedImage bufferedImage, int n4, int n5) {
        int e2;
        void b2;
        void c2;
        void d2;
        int n6 = n2;
        n2 = n5;
        int a2 = n6;
        return new kr(a2, (int)d2, (BufferedImage)c2, (int)b2, e2);
    }

    public Object get() {
        kr a2;
        kr kr2 = a2;
        kr kr3 = a2;
        return yO.J(kr2.k, kr2.J, kr3.I, kr3.j, a2.A);
    }
}

