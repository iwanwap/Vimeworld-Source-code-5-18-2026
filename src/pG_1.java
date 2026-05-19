/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  g
 */
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pG_1
implements g {
    private List<BufferedImage> J;
    private final boolean A;
    private final AD I;

    public int C() {
        pG_1 a2;
        return a2.I.J();
    }

    public int J(int n2) {
        int b2 = n2;
        pG_1 a2 = this;
        return a2.I.J(b2);
    }

    public int J() {
        pG_1 a2;
        return a2.I.e();
    }

    /*
     * WARNING - void declaration
     */
    public int[] J(int n2) {
        void a2;
        pG_1 pG_12 = this;
        if (pG_12.A) {
            pG_1 pG_13 = pG_12;
            pG_1 pG_14 = pG_13;
            Object b2 = pG_13.I.J();
            while (pG_14.I.f() != a2) {
                pG_1 pG_15 = pG_12;
                pG_14 = pG_15;
                pG_15.I.J();
                b2 = pG_15.I.J();
            }
            return ((DataBufferInt)((BufferedImage)b2).getRaster().getDataBuffer()).getData();
        }
        return ((DataBufferInt)pG_12.J.get((int)a2).getRaster().getDataBuffer()).getData();
    }

    public boolean J() {
        pG_1 a2;
        return a2.A;
    }

    public int f() {
        pG_1 a2;
        return a2.I.i();
    }

    /*
     * WARNING - void declaration
     */
    public pG_1(AD aD2, boolean bl) {
        int a2;
        void b2;
        pG_1 pG_12 = this;
        pG_12.I = b2;
        pG_12.A = a2;
        if (!pG_12.A) {
            pG_1 pG_13 = pG_12;
            pG_13.J = new ArrayList<BufferedImage>();
            int n2 = a2 = uSa.E;
            while (n2 < b2.d()) {
                void v2 = b2;
                v2.J();
                Object c2 = v2.J();
                BufferedImage bufferedImage = new BufferedImage(((BufferedImage)c2).getWidth(), ((BufferedImage)c2).getHeight(), ((BufferedImage)c2).getType());
                int[] nArray = ((DataBufferInt)((BufferedImage)c2).getRaster().getDataBuffer()).getData();
                c2 = nArray;
                System.arraycopy(nArray, uSa.E, ((DataBufferInt)bufferedImage.getRaster().getDataBuffer()).getData(), uSa.E, ((Object)c2).length);
                pG_12.J.add(bufferedImage);
                n2 = ++a2;
            }
        }
    }

    public int l() {
        pG_1 a2;
        return a2.I.d();
    }
}

