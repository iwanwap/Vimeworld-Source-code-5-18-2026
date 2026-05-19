/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Mda
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class SBa_1
implements UB {
    /*
     * WARNING - void declaration
     */
    @Override
    public Mda[] J(xFa xFa2) {
        int b2;
        void a2;
        SBa_1 sBa_1 = this;
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
    public Mda J() {
        return null;
    }

    public SBa_1() {
        SBa_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Mda J(xFa xFa2) {
        Mda mda2;
        Mda mda3;
        void a22;
        int b22;
        SBa_1 sBa_1 = this;
        ArrayList<Mda> arrayList = Lists.newArrayList();
        int n2 = b22 = uSa.E;
        while (n2 < a22.f()) {
            mda3 = a22.J(b22);
            if (mda3 != null) {
                ArrayList<Mda> arrayList2 = arrayList;
                arrayList2.add(mda3);
                if (arrayList2.size() > vRa.d) {
                    mda2 = (Mda)arrayList.get(uSa.E);
                    if (mda3.J() != mda2.J() || mda2.E != vRa.d || mda3.E != vRa.d || !mda2.J().C()) {
                        return null;
                    }
                }
            }
            n2 = ++b22;
        }
        if (arrayList.size() == uqa.g) {
            Mda b22 = (Mda)arrayList.get(uSa.E);
            mda3 = (Mda)arrayList.get(vRa.d);
            if (b22.J() == mda3.J() && b22.E == vRa.d && mda3.E == vRa.d && b22.J().C()) {
                mda2 = b22.J();
                int a22 = mda2.l() - b22.f();
                int n3 = mda2.l() - mda3.f();
                Mda mda4 = mda2;
                a22 = a22 + n3 + mda4.l() * tTa.h / ySa.T;
                a22 = mda4.l() - a22;
                if (a22 < 0) {
                    a22 = uSa.E;
                }
                return new Mda(b22.J(), vRa.d, a22);
            }
        }
        return null;
    }

    @Override
    public int J() {
        return AQa.P;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(xFa xFa2, Gg gg2) {
        void b2;
        int n2;
        SBa_1 sBa_1 = this;
        ArrayList<SBa_1> a2 = Lists.newArrayList();
        int n3 = n2 = uSa.E;
        while (n3 < b2.f()) {
            SBa_1 c2 = b2.J(n2);
            if (c2 != null) {
                ArrayList<SBa_1> arrayList = a2;
                arrayList.add(c2);
                if (arrayList.size() > vRa.d) {
                    Mda mda2 = (Mda)a2.get(uSa.E);
                    if (c2.J() != mda2.J() || mda2.E != vRa.d || ((Mda)c2).E != vRa.d || !mda2.J().C()) {
                        return uSa.E != 0;
                    }
                }
            }
            n3 = ++n2;
        }
        if (a2.size() == uqa.g) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

