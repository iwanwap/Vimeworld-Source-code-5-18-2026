/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  qoa
 *  rna
 *  sb
 *  wNa
 */
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xNa_3
implements sb<qoa> {
    private final rna M;
    private final Random k;
    private double j;
    private final List<sb<qoa>> J;
    private final ResourceLocation A;
    private double I;

    public int J() {
        Iterator<sb<qoa>> iterator;
        xNa_3 xNa_32 = this;
        int a2 = uSa.E;
        Iterator<sb<qoa>> iterator2 = iterator = xNa_32.J.iterator();
        while (iterator2.hasNext()) {
            sb<qoa> sb2 = iterator.next();
            a2 += sb2.J();
            iterator2 = iterator;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public xNa_3(ResourceLocation resourceLocation, double d2, double d3, rna rna2) {
        xNa_3 e2;
        void c2;
        void b2;
        void d4;
        xNa_3 a2;
        xNa_3 xNa_32 = xNa_33;
        xNa_3 xNa_33 = rna2;
        xNa_3 xNa_34 = a2 = xNa_32;
        xNa_3 xNa_35 = a2;
        a2.J = Lists.newArrayList();
        xNa_3 xNa_36 = a2;
        xNa_36.k = new Random();
        xNa_35.A = d4;
        xNa_35.I = b2;
        xNa_34.j = c2;
        xNa_34.M = e2;
    }

    public qoa J() {
        xNa_3 xNa_32;
        xNa_3 xNa_33 = xNa_32 = this;
        int a2 = xNa_33.J();
        if (!xNa_33.J.isEmpty() && a2 != 0) {
            xNa_3 xNa_34 = xNa_32;
            a2 = xNa_34.k.nextInt(a2);
            for (sb<qoa> sb2 : xNa_34.J) {
                if ((a2 -= sb2.J()) >= 0) continue;
                qoa qoa2 = (qoa)sb2.J();
                qoa2.f(qoa2.f() * xNa_32.j);
                qoa2.J(qoa2.J() * xNa_32.I);
                return qoa2;
            }
            return wNa.j;
        }
        return wNa.j;
    }

    public ResourceLocation J() {
        xNa_3 a2;
        return a2.A;
    }

    public rna J() {
        xNa_3 a2;
        return a2.M;
    }

    public void J(sb<qoa> sb2) {
        sb<qoa> b2 = sb2;
        sb<qoa> a2 = this;
        a2.J.add(b2);
    }
}

