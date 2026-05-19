/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Wv
 *  vRa
 */
public class tw_3 {
    public final int pieceWeight;
    public int instancesLimit;
    public Class<? extends Wv> pieceClass;
    public int instancesSpawned;

    /*
     * WARNING - void declaration
     */
    public tw_3(Class<? extends Wv> clazz, int n2, int n3) {
        void b2;
        void c2;
        tw_3 a2;
        int d2 = n3;
        tw_3 tw_32 = a2 = this;
        a2.pieceClass = c2;
        tw_32.pieceWeight = b2;
        tw_32.instancesLimit = d2;
    }

    public boolean J() {
        block3: {
            block2: {
                tw_3 a2;
                if (a2.instancesLimit == 0) break block2;
                tw_3 tw_32 = a2;
                if (tw_32.instancesSpawned >= tw_32.instancesLimit) break block3;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J(int n2) {
        block3: {
            block2: {
                int b2 = n2;
                tw_3 a2 = this;
                if (a2.instancesLimit == 0) break block2;
                tw_3 tw_32 = a2;
                if (tw_32.instancesSpawned >= tw_32.instancesLimit) break block3;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

