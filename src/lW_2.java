/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tw
 *  wx
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public final class lW_2
extends wx {
    public List<uU> field_75026_c;
    public tw strongholdPieceWeight;
    public dV strongholdPortalRoom;

    /*
     * WARNING - void declaration
     */
    public lW_2(int n2, Random random, int n3, int n4) {
        void e2;
        void b2;
        void c2;
        int n5 = n4;
        lW_2 a2 = this;
        super(uSa.E, (Random)c2, (int)b2, (int)e2);
        a2.field_75026_c = Lists.newArrayList();
    }

    public XF J() {
        lW_2 a2;
        if (a2.strongholdPortalRoom != null) {
            return a2.strongholdPortalRoom.J();
        }
        return super.J();
    }

    public lW_2() {
        lW_2 a2;
        a2.field_75026_c = Lists.newArrayList();
    }
}

