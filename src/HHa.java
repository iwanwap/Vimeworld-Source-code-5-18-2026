/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  PIa
 *  nQa
 *  vL
 */
import java.util.concurrent.Callable;

public final class HHa
implements Callable<String> {
    public final /* synthetic */ vL I;

    public HHa(vL vL2) {
        HHa b2 = vL2;
        HHa a2 = this;
        a2.I = b2;
    }

    public String J() throws Exception {
        HHa a2;
        return new StringBuilder().insert(3 >> 2, PIa.J((vL)a2.I)).append(nQa.T).append(a2.I.getClass().getCanonicalName()).append(hpa.b).toString();
    }
}

