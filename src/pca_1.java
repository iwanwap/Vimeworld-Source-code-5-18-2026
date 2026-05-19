/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Mda
 */
import com.google.common.base.Function;

public final class pca_1
implements Function<Mda, String> {
    public final /* synthetic */ String[] I;

    public String J(Mda mda2) {
        pca_1 b22 = mda2;
        pca_1 a2 = this;
        int b22 = b22.J();
        if (b22 < 0 || b22 >= a2.I.length) {
            b22 = uSa.E;
        }
        return a2.I[b22];
    }

    public pca_1(String[] stringArray) {
        String[] a2 = stringArray;
        stringArray = this;
        stringArray.I = a2;
    }
}

