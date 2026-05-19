/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  JPa
 *  bk
 *  vj
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public final class Dl
extends bk {
    public Ak J;
    public Ak A;
    public Ak I;

    public void J(vj vj2, double d2, double d3, double d4) {
        Dl e2 = vj2;
        Dl d5 = this;
        Dl dl2 = e2;
        ((vj)dl2).N.set((float)d5.A.J(), (float)d5.J.J(), (float)d5.I.J());
        if (((vj)dl2).N.length() <= JPa.N) {
            ((vj)e2).N.set(JPa.N, JPa.N, JPa.N);
            return;
        }
        ((vj)e2).N.normalize();
    }

    public JsonElement J() {
        Object a2;
        Dl dl2 = this;
        Object object = a2 = new JsonArray();
        Dl dl3 = dl2;
        ((JsonArray)a2).add(dl3.A.J());
        ((JsonArray)object).add(dl3.J.J());
        ((JsonArray)object).add(dl2.I.J());
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public Dl(Ak ak, Ak ak2, Ak ak3) {
        void b2;
        void c2;
        Dl a2;
        Dl d2 = ak3;
        Dl dl2 = a2 = this;
        a2.A = c2;
        dl2.J = b2;
        dl2.I = d2;
    }
}

