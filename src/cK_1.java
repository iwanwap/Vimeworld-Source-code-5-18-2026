/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  EL
 *  NQa
 *  Oz
 *  Ql
 *  Uk
 *  WK
 *  Zpa
 *  aSa
 *  pj
 *  vRa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cK_1 {
    public Ak[] k;
    public WK j;
    public Ak J;
    public EL A = EL.LINEAR;
    public Ak I;

    /*
     * WARNING - void declaration
     */
    public void J(JsonObject jsonObject, Uk uk2) throws Ql {
        void a2;
        Object c2 = jsonObject;
        cK_1 b2 = this;
        if (((JsonObject)c2).has(Zpa.x)) {
            b2.A = EL.fromString((String)((JsonObject)c2).get(Zpa.x).getAsString());
        }
        if (((JsonObject)c2).has(NQa.i)) {
            b2.J = a2.f(((JsonObject)c2).get(NQa.i));
        }
        if (((JsonObject)c2).has(xTa.w)) {
            b2.I = a2.f(((JsonObject)c2).get(xTa.w));
        }
        if (((JsonObject)c2).has(Zpa.u)) {
            c2 = ((JsonObject)c2).getAsJsonArray(Zpa.u);
            Ak[] akArray = new Ak[((JsonArray)c2).size()];
            int n2 = uSa.E;
            int n3 = akArray.length;
            int n4 = n2;
            while (n4 < n3) {
                int n5 = n2++;
                akArray[n5] = a2.f(((JsonArray)c2).get(n5));
                n4 = n2;
            }
            b2.k = akArray;
        }
    }

    private Ak J(int n2) {
        int b2 = n2;
        cK_1 a2 = this;
        if (b2 < 0) {
            return a2.k[uSa.E];
        }
        if (b2 >= a2.k.length) {
            cK_1 cK_12 = a2;
            return cK_12.k[cK_12.k.length - vRa.d];
        }
        return a2.k[b2];
    }

    public JsonElement J() {
        int a2;
        cK_1 cK_12 = this;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject2 = jsonObject;
        jsonObject2.addProperty(Zpa.x, cK_12.A.id);
        jsonObject2.add(Zpa.u, jsonArray);
        jsonObject2.add(NQa.i, cK_12.J.J());
        cK_1 cK_13 = cK_12;
        jsonObject2.add(xTa.w, cK_13.I.J());
        Ak[] akArray = cK_13.k;
        int n2 = cK_13.k.length;
        int n3 = a2 = uSa.E;
        while (n3 < n2) {
            Ak ak = akArray[a2];
            jsonArray.add(ak.J());
            n3 = ++a2;
        }
        return jsonObject;
    }

    private double J(double d2) {
        double a2;
        cK_1 cK_12 = this;
        int n2 = cK_12.k.length;
        if (n2 == 0) {
            return aSa.V;
        }
        if (n2 == vRa.d) {
            return cK_12.k[uSa.E].J();
        }
        if (a2 < aSa.V) {
            a2 = -(oua.i + a2);
        }
        a2 = Oz.J((double)a2, (double)aSa.V, (double)oua.i);
        if (cK_12.A == EL.HERMITE) {
            if (n2 <= yRa.d) {
                return cK_12.k[n2 - uqa.g].J();
            }
            int b2 = (int)(a2 *= (double)(n2 - yRa.d)) + vRa.d;
            cK_1 cK_13 = cK_12;
            Ak ak = cK_13.J(b2 - vRa.d);
            Ak ak2 = cK_13.J(b2);
            Ak ak3 = cK_13.J(b2 + vRa.d);
            Ak ak4 = cK_13.J(b2 + uqa.g);
            return pj.d((double)ak.J(), (double)ak2.J(), (double)ak3.J(), (double)ak4.J(), (double)(a2 % oua.i));
        }
        int b2 = (int)(a2 *= (double)(n2 - vRa.d));
        cK_1 cK_14 = cK_12;
        Ak ak = cK_14.J(b2);
        Ak ak5 = cK_14.J(b2 + vRa.d);
        return pj.J((double)ak.J(), (double)ak5.J(), (double)(a2 % oua.i));
    }

    public double J() {
        cK_1 a2;
        cK_1 cK_12 = a2;
        return cK_12.J(a2.J.J() / cK_12.I.J());
    }

    public cK_1() {
        cK_1 a2;
        Ak[] akArray = new Ak[yRa.d];
        akArray[uSa.E] = Uk.J;
        akArray[vRa.d] = Uk.A;
        akArray[uqa.g] = Uk.J;
        a2.k = akArray;
    }
}

