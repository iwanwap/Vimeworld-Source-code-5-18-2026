/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  BRa
 *  NPa
 *  vRa
 *  vU
 *  zsa
 */
import java.util.concurrent.Callable;

public final class ox_1
implements Callable<String> {
    public final /* synthetic */ vU I;

    public ox_1(vU vU2) {
        ox_1 b2 = vU2;
        ox_1 a2 = this;
        a2.I = b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String J() throws Exception {
        ox_1 ox_12 = this;
        Object a2 = zsa.M;
        try {
            switch (vU.C((vU)ox_12.I)) {
                case 19132: {
                    a2 = NPa.Ka;
                    break;
                }
                case 19133: {
                    a2 = sqa.j;
                }
            }
        }
        catch (Throwable throwable) {}
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = vU.C((vU)ox_12.I);
        objectArray[vRa.d] = a2;
        return String.format(BRa.w, objectArray);
    }
}

