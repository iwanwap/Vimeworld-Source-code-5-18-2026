/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  A
 *  Kpa
 *  Oqa
 *  ad
 *  cF
 *  vRa
 */
import java.util.ArrayList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nf_3
extends jb
implements A {
    private boolean j;
    private final Yd I;

    public nf_3() {
        nf_3 a2;
        nf_3 nf_32 = a2;
        super(Oqa.ROW, uSa.E, uSa.E);
        nf_3 nf_33 = a2;
        nf_32.I = new Yd(a2);
        nf_33.j = uSa.E;
        nf_32.J();
    }

    public boolean J() {
        nf_3 a2;
        return a2.j;
    }

    public void J(boolean bl2) {
        boolean b2 = bl2;
        nf_3 a2 = this;
        if (a2.j == b2) {
            return;
        }
        a2.j = b2;
        a2.J();
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ int J(String string, String string2) {
        void a2;
        String string3 = string;
        int b2 = Boolean.compare(WF.L.containsKey(string3), WF.L.containsKey(a2));
        if (b2 != 0) {
            return b2;
        }
        return string3.compareTo((String)a2);
    }

    public void J() {
        int n2;
        Object a2;
        nf_3 nf_32 = this;
        nf_32.f().clear();
        Object object = a2 = new ArrayList<String>(WF.e);
        a2.remove(Kpa.J().J().J());
        object.sort(cF.J());
        int n3 = n2 = object.size() >= tTa.h ? vRa.d : uSa.E;
        if (!nf_32.j && a2.size() >= tTa.h) {
            a2 = a2.subList(uSa.E, AQa.P);
        }
        a2 = a2.iterator();
        Object object2 = a2;
        while (object2.hasNext()) {
            String string = (String)a2.next();
            if (string == null) {
                object2 = a2;
                continue;
            }
            nf_32.f(new RF(string));
            object2 = a2;
        }
        if (n2 != 0) {
            nf_3 nf_33 = nf_32;
            nf_33.f((ad)nf_33.I);
        }
    }
}

