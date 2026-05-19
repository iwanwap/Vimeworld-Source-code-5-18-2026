/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  JV
 *  Jy
 *  Uw
 *  Xx
 *  vRa
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public final class Uw_2
extends JV {
    public List<uU> field_74930_j;
    public List<Xx> structureVillageWeightedPieceList;
    public List<uU> field_74932_i;
    public boolean inDesert;
    public int terrainType;
    public Xx structVillagePieceWeight;
    public Ay worldChunkMngr;

    /*
     * WARNING - void declaration
     */
    public Uw_2(Ay ay2, int n2, Random random, int n3, int n4, List<Xx> list, int n5) {
        void a2;
        void b2;
        void c2;
        void d2;
        void e2;
        Uw_2 h2 = ay2;
        Uw_2 g2 = this;
        super((Uw)((Uw_2)null), uSa.E, (Random)e2, (int)d2, (int)c2);
        Uw_2 uw_2 = g2;
        Uw_2 uw_22 = g2;
        Uw_2 uw_23 = g2;
        uw_23.field_74932_i = Lists.newArrayList();
        uw_23.field_74930_j = Lists.newArrayList();
        uw_22.worldChunkMngr = h2;
        uw_22.structureVillageWeightedPieceList = b2;
        uw_2.terrainType = a2;
        Uw_2 uw_24 = h2;
        h2 = h2.J(new XF((int)d2, uSa.E, (int)c2), Jy.f);
        uw_2.inDesert = h2 == Jy.ea || h2 == Jy.Ga ? vRa.d : uSa.E;
        Uw_2 uw_25 = g2;
        uw_25.J(uw_25.inDesert);
    }

    public Ay J() {
        Uw_2 a2;
        return a2.worldChunkMngr;
    }

    public Uw_2() {
        Uw_2 a2;
        a2.field_74932_i = Lists.newArrayList();
        a2.field_74930_j = Lists.newArrayList();
    }
}

