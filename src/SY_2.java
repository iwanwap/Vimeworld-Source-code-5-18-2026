/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aqa
 *  uY
 */
import java.util.concurrent.Callable;

public final class SY_2
implements Callable<String> {
    public final /* synthetic */ uY I;

    public SY_2(uY uY2) {
        SY_2 b2 = uY2;
        SY_2 a2 = this;
        a2.I = b2;
    }

    public String J() throws Exception {
        SY_2 a2;
        return (String)uY.J().get(a2.I.getClass()) + aqa.h + a2.I.getClass().getCanonicalName();
    }
}

