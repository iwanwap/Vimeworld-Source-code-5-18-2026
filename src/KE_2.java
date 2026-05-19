/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ag
 *  vRa
 *  wd
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KE_2 {
    private final String A;
    private final List<ag> I;

    public int J() {
        Object a2;
        KE_2 kE_2 = this;
        int n2 = uSa.E;
        Object object = a2 = kE_2.I.iterator();
        while (object.hasNext()) {
            ag ag2 = (ag)a2.next();
            int n3 = ag2.J().size();
            if (n3 <= 0) {
                object = a2;
                continue;
            }
            n2 = Math.max(n2, (int)((qE)ag2.J().get(n3 - vRa.d)).f());
            object = a2;
        }
        return n2;
    }

    public KE_2(String string) {
        String b2 = string;
        KE_2 a2 = this;
        KE_2 kE_2 = a2;
        a2.I = new ArrayList<ag>();
        a2.A = b2;
    }

    public List<ag> J() {
        KE_2 a2;
        return a2.I;
    }

    /*
     * WARNING - void declaration
     */
    public void J(wd wd2, float f2) {
        Object c2;
        KE_2 kE_2 = this;
        Object object = c2 = kE_2.I.iterator();
        while (object.hasNext()) {
            void a2;
            void b2;
            ((ag)c2.next()).J((wd)b2, (float)a2);
            object = c2;
        }
    }

    public String J() {
        KE_2 a2;
        return a2.A;
    }

    /*
     * WARNING - void declaration
     */
    public void J(wd wd2, float f2, float f3) {
        Object d2;
        KE_2 kE_2 = this;
        Object object = d2 = kE_2.I.iterator();
        while (object.hasNext()) {
            void a2;
            void b2;
            void c2;
            ((ag)d2.next()).J((wd)c2, (float)b2, (float)a2);
            object = d2;
        }
    }
}

