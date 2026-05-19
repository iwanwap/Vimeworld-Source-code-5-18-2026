/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Jga
 *  Jia
 *  Tpa
 *  Xsa
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public final class Jia_3 {
    private final List<String> A;
    private String I;

    public /* synthetic */ Jia_3(Jga jga2) {
        Jia_3 b2 = jga2;
        Jia_3 a2 = this;
        a2();
    }

    private Jia_3() {
        Jia_3 a2;
        a2.I = null;
        a2.A = Lists.newArrayList();
    }

    public static /* synthetic */ String J(Jia jia2, String string) {
        Object b2 = string;
        Jia a2 = jia2;
        a2.I = b2;
        return a2.I;
    }

    public String J() {
        Jia_3 a2;
        return StringUtils.join(a2.A, CRa.i);
    }

    public static /* synthetic */ void J(Jia jia2, String string) {
        Object b2 = string;
        Jia a2 = jia2;
        super.J((String)b2);
    }

    public String toString() {
        Jia_3 a2;
        if (a2.I != null) {
            if (!a2.A.isEmpty()) {
                return new StringBuilder().insert(3 >> 2, a2.I).append(Tpa.E).append(a2.J()).toString();
            }
            return a2.I;
        }
        if (!a2.A.isEmpty()) {
            return new StringBuilder().insert(5 >> 3, Xsa.Aa).append(a2.J()).toString();
        }
        return xra.Da;
    }

    private void J(String string) {
        String b2 = string;
        Jia_3 a2 = this;
        a2.A.add(uSa.E, b2);
    }
}

