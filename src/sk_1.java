/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Uk
 *  WK
 *  aSa
 *  vK
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public final class sk_1
extends Ak {
    public Map<String, WK> A;
    public List<Ak> I;

    public double J() {
        sk_1 sk_12 = this;
        double d2 = aSa.V;
        for (Ak ak : sk_12.I) {
            d2 = ak.J();
            if (!(ak instanceof vK) || !((vK)ak).I) continue;
            return d2;
        }
        return d2;
    }

    public String toString() {
        sk_1 sk_12 = this;
        StringJoiner stringJoiner = new StringJoiner(SPa.t);
        Iterator<Ak> a2 = sk_12.I.iterator();
        Object object = a2;
        while (object.hasNext()) {
            Ak ak = (Ak)a2.next();
            object = a2;
            stringJoiner.add(ak.toString());
        }
        return stringJoiner.toString();
    }

    public sk_1(Uk uk2) {
        sk_1 b2 = uk2;
        sk_1 a2 = this;
        super((Uk)b2);
        sk_1 sk_12 = a2;
        a2.I = new ArrayList<Ak>();
        sk_12.A = new HashMap<String, WK>();
    }
}

