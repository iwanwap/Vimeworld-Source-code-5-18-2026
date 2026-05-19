/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gua
 *  JPa
 *  Rua
 *  bt
 *  ns
 *  pqa
 *  uKa
 *  vRa
 */
import com.google.gson.JsonObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class du_1 {
    public ns rotate;
    public ns scale;
    public ns translate;

    /*
     * WARNING - void declaration
     */
    private float[] values(ns ns2, float f2) {
        void b2;
        float c2 = f2;
        du_1 a2 = this;
        if (b2 == null) {
            float[] fArray = new float[yRa.d];
            fArray[uSa.E] = c2;
            fArray[vRa.d] = c2;
            fArray[uqa.g] = c2;
            return fArray;
        }
        return b2.values(c2);
    }

    public du_1() {
        du_1 a2;
    }

    public void J() {
        du_1 du_12 = this;
        if (du_12.scale != null) {
            uKa.l((float)ns.l((ns)du_12.scale).J(), (float)ns.J((ns)du_12.scale).J(), (float)ns.f((ns)du_12.scale).J());
        }
        if (du_12.rotate != null) {
            float a2 = ns.f((ns)du_12.rotate).J();
            if (a2 != JPa.N) {
                uKa.J((float)a2, (float)JPa.N, (float)JPa.N, (float)pqa.r);
            }
            if ((a2 = ns.l((ns)du_12.rotate).J()) != JPa.N) {
                uKa.J((float)a2, (float)pqa.r, (float)JPa.N, (float)JPa.N);
            }
            if ((a2 = ns.J((ns)du_12.rotate).J()) != JPa.N) {
                uKa.J((float)a2, (float)JPa.N, (float)pqa.r, (float)JPa.N);
            }
        }
        if (du_12.translate != null) {
            uKa.J((float)ns.l((ns)du_12.translate).J(), (float)ns.J((ns)du_12.translate).J(), (float)ns.f((ns)du_12.translate).J());
        }
    }

    public du_1(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        du_1 a2 = this;
        if (b2.has(Gua.x)) {
            du_1 du_12 = a2;
            du_12.translate = new ns(b2.get(Gua.x).getAsJsonArray());
        }
        if (b2.has(Rua.C)) {
            a2.scale = new ns(b2.get(Rua.C).getAsJsonArray());
        }
        if (b2.has(Zqa.n)) {
            a2.rotate = new ns(b2.get(Zqa.n).getAsJsonArray());
        }
    }

    /*
     * WARNING - void declaration
     */
    public ns J(ns ns2, int n2, float f2, float f3) {
        void b2;
        void a2;
        Object e2 = ns2;
        du_1 d2 = this;
        float[] fArray = d2.values((ns)e2, (float)a2);
        e2 = fArray;
        fArray[c] = b2;
        return new ns((float)e2[uSa.E], (float)e2[vRa.d], (float)e2[uqa.g]);
    }

    public bt J() {
        du_1 a2;
        du_1 du_12 = a2;
        du_1 du_13 = a2;
        du_1 du_14 = a2;
        return new bt(du_12.values(du_12.translate, JPa.N), du_13.values(du_13.scale, pqa.r), du_14.values(du_14.rotate, JPa.N), null);
    }
}

