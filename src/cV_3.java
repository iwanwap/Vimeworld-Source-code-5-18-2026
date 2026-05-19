/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aqa
 *  vRa
 *  vU
 */
import java.util.concurrent.Callable;

public final class cV_3
implements Callable<String> {
    public final /* synthetic */ vU I;

    public String J() throws Exception {
        cV_3 a2;
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = vU.J((vU)a2.I).getName();
        objectArray[vRa.d] = vU.J((vU)a2.I).getID();
        objectArray[uqa.g] = vU.l((vU)a2.I);
        objectArray[yRa.d] = vU.C((vU)a2.I);
        return String.format(aqa.P, objectArray);
    }

    public cV_3(vU vU2) {
        cV_3 b2 = vU2;
        cV_3 a2 = this;
        a2.I = b2;
    }
}

