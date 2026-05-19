/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 *  vU
 */
import java.util.concurrent.Callable;

public final class QU
implements Callable<String> {
    public final /* synthetic */ vU I;

    public String J() throws Exception {
        QU a2;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = vU.f((vU)a2.I);
        objectArray[vRa.d] = vU.J((vU)a2.I);
        return String.format(Nta.D, objectArray);
    }

    public QU(vU vU2) {
        QU b2 = vU2;
        QU a2 = this;
        a2.I = b2;
    }
}

