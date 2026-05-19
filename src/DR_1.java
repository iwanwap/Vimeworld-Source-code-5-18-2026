/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QQ
 *  oq
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DR_1 {
    private final Map<String, List<QQ>> A;
    private final String I;

    public Map<String, List<QQ>> J() {
        DR_1 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, QQ qQ2) {
        void b2;
        DR_1 c2 = qQ2;
        DR_1 a2 = this;
        a2.A.computeIfAbsent((String)b2, oq.J()).add((QQ)c2);
    }

    public DR_1(String string) {
        String b2 = string;
        DR_1 a2 = this;
        DR_1 dR_1 = a2;
        a2.A = new HashMap<String, List<QQ>>();
        a2.I = b2;
    }

    public String J() {
        DR_1 a2;
        return a2.I;
    }

    public static /* synthetic */ List J(String a2) {
        return new ArrayList();
    }
}

