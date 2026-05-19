/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RIa
 *  Tpa
 *  vQa
 *  vRa
 */
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class MHa_2
implements Callable {
    private static final String A = "CL_00001329";
    public final /* synthetic */ RIa I;

    public String J() {
        MHa_2 mHa_2 = this;
        Iterator a2 = ManagementFactory.getRuntimeMXBean().getInputArguments();
        int n2 = uSa.E;
        StringBuilder stringBuilder = new StringBuilder();
        a2 = a2.iterator();
        while (a2.hasNext()) {
            Object e2 = a2.next();
            if (!((String)e2).startsWith(fPa.la)) continue;
            if (n2++ > 0) {
                stringBuilder.append(Tpa.E);
            }
            stringBuilder.append(e2);
        }
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = n2;
        objectArray[vRa.d] = stringBuilder.toString();
        return String.format(vQa.n, objectArray);
    }

    public MHa_2(RIa rIa2) {
        MHa_2 b2 = rIa2;
        MHa_2 a2 = this;
        a2.I = b2;
    }
}

