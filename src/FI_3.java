/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FI
 *  Ji
 *  QM
 *  qG
 */
public class FI_3 {
    public static FI J(QM a2) {
        switch (qG.J[a2.getKind().ordinal()]) {
            case 1: {
                return new Ji(a2.getEntity());
            }
        }
        throw new IllegalArgumentException(zOa.V);
    }

    public FI_3() {
        FI_3 a2;
    }
}

