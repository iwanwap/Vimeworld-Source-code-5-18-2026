/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Tpa
 *  vRa
 */
import java.util.concurrent.Callable;

public final class lIa
implements Callable<String> {
    public final /* synthetic */ int I;

    public String J() throws Exception {
        lIa lIa2 = this;
        if (lIa2.I < 0) {
            return new StringBuilder().insert(2 & 5, wta.u).append(lIa2.I).append(hpa.b).toString();
        }
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = Integer.toBinaryString(lIa2.I);
        String a2 = String.format(ZSa.E, objectArray).replace(Tpa.E, GPa.J);
        Object[] objectArray2 = new Object[uqa.g];
        objectArray2[uSa.E] = lIa2.I;
        objectArray2[vRa.d] = a2;
        return String.format(BQa.Da, objectArray2);
    }

    public lIa(int n2) {
        int a2 = n2;
        lIa lIa2 = this;
        lIa2.I = a2;
    }
}

