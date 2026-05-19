/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  fsa
 */
import java.util.concurrent.Callable;

public final class wqa_2
implements Callable<String> {
    public final /* synthetic */ Kpa I;

    public String J() throws Exception {
        wqa_2 wqa_22 = this;
        StringBuilder a2 = new StringBuilder();
        for (String string : wqa_22.I.z.Ab) {
            if (a2.length() > 0) {
                a2.append(TOa.n);
            }
            a2.append(string);
            if (!wqa_22.I.z.sb.contains(string)) continue;
            a2.append(fsa.g);
        }
        return a2.toString();
    }

    public wqa_2(Kpa kpa2) {
        wqa_2 b2 = kpa2;
        wqa_2 a2 = this;
        a2.I = b2;
    }
}

