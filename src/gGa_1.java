/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vL
 */
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public final class gGa_1
implements Comparator<vL> {
    public final /* synthetic */ XF I;

    public gGa_1(XF object) {
        Object a2 = object;
        object = this;
        ((gGa_1)object).I = a2;
    }

    /*
     * WARNING - void declaration
     */
    public int J(vL vL2, vL vL3) {
        void b2;
        gGa_1 c2 = vL3;
        gGa_1 a2 = this;
        return ComparisonChain.start().compare(b2.J(a2.I), c2.J(a2.I)).result();
    }
}

