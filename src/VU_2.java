/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aPa
 *  vRa
 *  vU
 */
import java.util.concurrent.Callable;

public final class VU_2
implements Callable<String> {
    public final /* synthetic */ vU I;

    public String J() throws Exception {
        VU_2 a2;
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = vU.J((vU)a2.I).f();
        objectArray[vRa.d] = vU.J((vU)a2.I).J();
        objectArray[uqa.g] = vU.J((vU)a2.I).J();
        objectArray[yRa.d] = vU.f((vU)a2.I);
        return String.format(aPa.g, objectArray);
    }

    public VU_2(vU vU2) {
        VU_2 b2 = vU2;
        VU_2 a2 = this;
        a2.I = b2;
    }
}

