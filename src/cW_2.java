/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  SW
 *  Waa
 *  ZV
 *  vv
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public final class cW_2
extends ZV {
    public vv theNetherBridgePieceWeight;
    public List<vv> primaryWeights;
    public List<uU> field_74967_d;
    public List<vv> secondaryWeights;

    public void f(Waa waa2) {
        cW_2 b2 = waa2;
        cW_2 a2 = this;
        super.f((Waa)b2);
    }

    public void J(Waa waa2) {
        cW_2 b2 = waa2;
        cW_2 a2 = this;
        super.J((Waa)b2);
    }

    public cW_2(Random random, int n2, int n3) {
        vv vv2;
        int b2;
        vv[] c2;
        int d2 = n3;
        cW_2 a2 = this;
        super((Random)c2, b2, d2);
        a2.field_74967_d = Lists.newArrayList();
        a2.primaryWeights = Lists.newArrayList();
        c2 = SW.f();
        b2 = c2.length;
        int n4 = d2 = uSa.E;
        while (n4 < b2) {
            vv2 = c2[d2];
            vv2.field_78827_c = uSa.E;
            a2.primaryWeights.add(vv2);
            n4 = ++d2;
        }
        a2.secondaryWeights = Lists.newArrayList();
        c2 = SW.J();
        b2 = c2.length;
        int n5 = d2 = uSa.E;
        while (n5 < b2) {
            vv2 = c2[d2];
            vv2.field_78827_c = uSa.E;
            a2.secondaryWeights.add(vv2);
            n5 = ++d2;
        }
    }

    public cW_2() {
        cW_2 a2;
        a2.field_74967_d = Lists.newArrayList();
    }
}

