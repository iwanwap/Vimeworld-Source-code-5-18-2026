/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  OCa
 *  bFa
 *  ica
 *  qca
 *  uRa
 *  vL
 *  vRa
 */
import com.google.common.base.Predicate;
import java.util.Map;

public final class FGa_3
implements Predicate<vL> {
    public final /* synthetic */ Map I;

    public FGa_3(Map object) {
        Object a2 = object;
        object = this;
        ((FGa_3)object).I = a2;
        object();
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(vL vL2) {
        FGa_3 fGa_3 = this;
        qca qca2 = OCa.J().J(uSa.E).J();
        for (Map.Entry entry : fGa_3.I.entrySet()) {
            void a2;
            String string;
            Object b22 = (String)entry.getKey();
            int n2 = uSa.E;
            if (((String)b22).endsWith(uRa.Z) && ((String)b22).length() > AQa.P) {
                n2 = vRa.d;
                Object object = b22;
                b22 = ((String)object).substring(uSa.E, ((String)object).length() - AQa.P);
            }
            if ((b22 = qca2.J((String)b22)) == null) {
                return uSa.E != 0;
            }
            String string2 = string = a2 instanceof bFa ? a2.J() : a2.J().toString();
            if (!qca2.J(string, (ica)b22)) {
                return uSa.E != 0;
            }
            int b22 = qca2.J(string, (ica)b22).J();
            if (b22 < (Integer)entry.getValue() && n2 != 0) {
                return uSa.E != 0;
            }
            if (b22 <= (Integer)entry.getValue() || n2 != 0) continue;
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }
}

