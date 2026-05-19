/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ey
 *  Gg
 *  Mda
 *  NTa
 *  Tpa
 *  URa
 *  Waa
 *  Xsa
 *  eAa
 *  gea
 *  qta
 *  vL
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public final class VFa_1
extends eAa {
    /*
     * WARNING - void declaration
     */
    public void J(Mda mda2, Sx sx2, List<String> list, boolean bl) {
        VFa_1 e2 = mda2;
        VFa_1 d2 = this;
        if (e2.M() && (e2 = e2.J().J(URa.O)) != null) {
            void b2;
            if (e2.J(Xsa.U, zOa.v)) {
                b2.add(Ey.f((String)Iqa.Ga) + Tpa.E + e2.J(Xsa.U));
            }
            if ((e2 = e2.J(qta.v, NTa.C)) != null && e2.J() > 0) {
                int c2;
                int n2 = c2 = uSa.E;
                while (n2 < e2.J()) {
                    ArrayList<String> arrayList;
                    Waa a2 = e2.J(c2);
                    ArrayList<String> arrayList2 = arrayList = Lists.newArrayList();
                    uFa.J(a2, arrayList2);
                    if (arrayList2.size() > 0) {
                        int n3 = vRa.d;
                        while (n3 < arrayList.size()) {
                            ArrayList<String> arrayList3 = arrayList;
                            arrayList3.set(++a2, new StringBuilder().insert(3 & 4, Hta.V).append((String)arrayList3.get(a2)).toString());
                            n3 = a2;
                        }
                        b2.addAll(arrayList);
                    }
                    n2 = ++c2;
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(Mda mda2, Sx sx2, Gg gg2, XF xF2, DZ dZ2, float f2, float f3, float f4) {
        void f5;
        VFa_1 vFa_1 = object;
        Object object = xF2;
        VFa_1 e2 = vFa_1;
        if (!f5.e) {
            void g2;
            void h2;
            void a2;
            void b2;
            void c2;
            Object i2;
            i2 = new gea((Gg)f5, (double)((float)i2.getX() + c2), (double)((float)i2.getY() + b2), (double)((float)i2.getZ() + a2), (Mda)h2);
            f5.f((vL)i2);
            if (!g2.h.f()) {
                h2.E -= vRa.d;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public VFa_1() {
        VFa_1 a2;
    }
}

