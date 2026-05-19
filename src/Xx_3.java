/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fV
 *  vRa
 */
public final class Xx_3 {
    public int villagePiecesLimit;
    public int villagePiecesSpawned;
    public Class<? extends fV> villagePieceClass;
    public final int villagePieceWeight;

    /*
     * WARNING - void declaration
     */
    public Xx_3(Class<? extends fV> clazz, int n2, int n3) {
        void b2;
        void c2;
        Xx_3 a2;
        int d2 = n3;
        Xx_3 xx_3 = a2 = this;
        a2.villagePieceClass = c2;
        xx_3.villagePieceWeight = b2;
        xx_3.villagePiecesLimit = d2;
    }

    public boolean J(int n2) {
        block3: {
            block2: {
                int b2 = n2;
                Xx_3 a2 = this;
                if (a2.villagePiecesLimit == 0) break block2;
                Xx_3 xx_3 = a2;
                if (xx_3.villagePiecesSpawned >= xx_3.villagePiecesLimit) break block3;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public boolean J() {
        block3: {
            block2: {
                Xx_3 a2;
                if (a2.villagePiecesLimit == 0) break block2;
                Xx_3 xx_3 = a2;
                if (xx_3.villagePiecesSpawned >= xx_3.villagePiecesLimit) break block3;
            }
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }
}

