/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Gg
 *  Mda
 *  NQa
 *  NTa
 *  Tfa
 *  VEa
 *  ZFa
 *  iea
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class YBa_1
implements UB {
    @Override
    public Mda J() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda J(xFa xFa2) {
        float f2;
        float f3;
        int n2;
        void a2;
        int n3;
        YBa_1 yBa_1 = this;
        Mda mda2 = null;
        int[] nArray = new int[yRa.d];
        int n4 = uSa.E;
        int n5 = uSa.E;
        VEa vEa2 = null;
        int n6 = n3 = uSa.E;
        while (n6 < a2.f()) {
            YBa_1 b2 = a2.J(n3);
            if (b2 != null) {
                if (b2.J() instanceof VEa) {
                    vEa2 = (VEa)b2.J();
                    if (vEa2.J() != Tfa.LEATHER || mda2 != null) {
                        return null;
                    }
                    mda2 = b2.J();
                    mda2.E = vRa.d;
                    if (vEa2.C((Mda)b2)) {
                        n2 = vEa2.f(mda2);
                        f3 = (float)(n2 >> ERa.C & osa.Ja) / NQa.Y;
                        f2 = (float)(n2 >> Yqa.i & osa.Ja) / NQa.Y;
                        float f4 = (float)(n2 & osa.Ja) / NQa.Y;
                        n4 = (int)((float)n4 + Math.max(f3, Math.max(f2, f4)) * NQa.Y);
                        int[] nArray2 = nArray;
                        nArray[uSa.E] = (int)((float)nArray2[uSa.E] + f3 * NQa.Y);
                        nArray2[vRa.d] = (int)((float)nArray[vRa.d] + f2 * NQa.Y);
                        ++n5;
                        nArray[uqa.g] = (int)((float)nArray[uqa.g] + f4 * NQa.Y);
                    }
                } else {
                    if (b2.J() != Gea.Q) {
                        return null;
                    }
                    float[] fArray = ZFa.J((iea)iea.byDyeDamage((int)b2.J()));
                    int n7 = (int)(fArray[uSa.E] * NQa.Y);
                    int n8 = (int)(fArray[vRa.d] * NQa.Y);
                    int n9 = (int)(fArray[uqa.g] * NQa.Y);
                    n4 += Math.max(n7, Math.max(n8, n9));
                    int[] nArray3 = nArray;
                    int[] nArray4 = nArray;
                    int n10 = uSa.E;
                    nArray3[n10] = nArray3[n10] + n7;
                    int n11 = vRa.d;
                    nArray4[n11] = nArray4[n11] + n8;
                    int n12 = uqa.g;
                    ++n5;
                    nArray3[n12] = nArray3[n12] + n9;
                }
            }
            n6 = ++n3;
        }
        if (vEa2 == null) {
            return null;
        }
        n3 = nArray[uSa.E] / n5;
        int b2 = nArray[vRa.d] / n5;
        n2 = nArray[uqa.g] / n5;
        f3 = (float)n4 / (float)n5;
        f2 = Math.max(n3, Math.max(b2, n2));
        n3 = (int)((float)n3 * f3 / f2);
        b2 = (int)((float)b2 * f3 / f2);
        n2 = (int)((float)n2 * f3 / f2);
        int n13 = (n3 << Yqa.i) + b2;
        n13 = (n13 << Yqa.i) + n2;
        Mda mda3 = mda2;
        vEa2.J(mda3, n13);
        return mda3;
    }

    public YBa_1() {
        YBa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        YBa_1 yBa_1 = this;
        Mda[] mdaArray = new Mda[a2.f()];
        int n2 = b2 = uSa.E;
        while (n2 < mdaArray.length) {
            Mda mda2 = a2.J(b2);
            if (mda2 != null && mda2.J().f()) {
                mdaArray[b2] = new Mda(mda2.J().f());
            }
            n2 = ++b2;
        }
        return mdaArray;
    }

    @Override
    public int J() {
        return NTa.C;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        YBa_1 yBa_1 = this;
        YBa_1 a2 = null;
        ArrayList<YBa_1> arrayList = Lists.newArrayList();
        int n3 = n2 = uSa.E;
        while (n3 < b2.f()) {
            YBa_1 c2 = b2.J(n2);
            if (c2 != null) {
                if (c2.J() instanceof VEa) {
                    if (((VEa)c2.J()).J() != Tfa.LEATHER || a2 != null) {
                        return uSa.E != 0;
                    }
                    a2 = c2;
                } else {
                    if (c2.J() != Gea.Q) {
                        return uSa.E != 0;
                    }
                    arrayList.add(c2);
                }
            }
            n3 = ++n2;
        }
        if (a2 != null && !arrayList.isEmpty()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

