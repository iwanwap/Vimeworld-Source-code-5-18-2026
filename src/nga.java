/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Vua
 *  bpa
 *  jGa
 */
import java.util.concurrent.Callable;

public final class nga
implements Callable<String> {
    public final /* synthetic */ int A;
    public final /* synthetic */ jGa I;

    /*
     * WARNING - void declaration
     */
    public nga(jGa jGa2, int n2) {
        void a2;
        int b2 = n2;
        nga nga2 = this;
        nga2.I = a2;
        nga2.A = b2;
    }

    public String J() throws Exception {
        nga nga2 = this;
        Object a2 = new StringBuilder().insert(2 & 5, bpa.Ia).append(nga2.A).append(KPa.e).toString();
        if (nga2.A == vqa.F) {
            a2 = new StringBuilder().insert(2 & 5, Vua.D).append((String)a2).append(hpa.b).toString();
        }
        return a2;
    }
}

