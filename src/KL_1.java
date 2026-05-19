/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Uk
 *  iJ
 *  pj
 *  pqa
 *  uQa
 *  vRa
 *  vj
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import org.apache.commons.lang3.StringUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KL_1
extends iJ {
    public Ak j;
    public Ak J;
    public Ak A;
    public Ak I;

    public JsonElement J() {
        KL_1 kL_1 = this;
        JsonArray a2 = new JsonArray();
        if (Ak.l((Ak)kL_1.I) && Ak.l((Ak)kL_1.j) && Ak.l((Ak)kL_1.A) && Ak.l((Ak)kL_1.J)) {
            return a2;
        }
        JsonArray jsonArray = a2;
        KL_1 kL_12 = kL_1;
        a2.add(kL_1.I.J());
        a2.add(kL_12.j.J());
        jsonArray.add(kL_12.A.J());
        jsonArray.add(kL_1.J.J());
        return a2;
    }

    public KL_1() {
        KL_1 a2;
        a2.I = Uk.A;
        a2.j = Uk.A;
        a2.A = Uk.A;
        a2.J = Uk.A;
    }

    /*
     * WARNING - void declaration
     */
    public KL_1(Ak ak, Ak ak2, Ak ak3, Ak ak4) {
        KL_1 e2;
        void b2;
        void c2;
        void d2;
        KL_1 a2;
        KL_1 kL_1 = kL_12;
        KL_1 kL_12 = ak4;
        KL_1 kL_13 = a2 = kL_1;
        KL_1 kL_14 = a2;
        kL_14.I = d2;
        kL_14.j = c2;
        kL_13.A = b2;
        kL_13.J = e2;
    }

    public JsonElement f() {
        KL_1 kL_1;
        KL_1 kL_12 = kL_1 = this;
        int n2 = (int)(kL_12.I.J() * pqa.o) & osa.Ja;
        int n3 = (int)(kL_12.j.J() * pqa.o) & osa.Ja;
        int n4 = (int)(kL_12.A.J() * pqa.o) & osa.Ja;
        int n5 = (int)(kL_12.J.J() * pqa.o) & osa.Ja;
        Object a2 = uQa.Y;
        if (n5 < osa.Ja) {
            a2 = new StringBuilder().insert(5 >> 3, (String)a2).append(StringUtils.leftPad(Integer.toHexString(n5), uqa.g, GPa.J).toUpperCase()).toString();
        }
        a2 = new StringBuilder().insert(3 ^ 3, (String)a2).append(StringUtils.leftPad(Integer.toHexString(n2), uqa.g, GPa.J).toUpperCase()).toString();
        a2 = new StringBuilder().insert(3 & 4, (String)a2).append(StringUtils.leftPad(Integer.toHexString(n3), uqa.g, GPa.J).toUpperCase()).toString();
        a2 = new StringBuilder().insert(5 >> 3, (String)a2).append(StringUtils.leftPad(Integer.toHexString(n4), uqa.g, GPa.J).toUpperCase()).toString();
        return new JsonPrimitive((String)a2);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2, float f2) {
        void b2;
        float c2 = f2;
        KL_1 a2 = this;
        void v0 = b2;
        v0.R = pj.C((float)v0.R, (float)((float)a2.I.J()), (float)c2);
        v0.a = pj.C((float)v0.a, (float)((float)a2.j.J()), (float)c2);
        v0.H = pj.C((float)v0.H, (float)((float)a2.A.J()), (float)c2);
        v0.y = pj.C((float)v0.y, (float)((float)a2.J.J()), (float)c2);
    }

    public boolean J() {
        KL_1 a2;
        if (Ak.f((Ak)a2.I) && Ak.f((Ak)a2.j) && Ak.f((Ak)a2.A) && Ak.f((Ak)a2.J)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J(vj vj2) {
        KL_1 b2 = vj2;
        KL_1 a2 = this;
        KL_1 kL_1 = b2;
        KL_1 kL_12 = a2;
        ((vj)b2).R = (float)a2.I.J();
        ((vj)b2).a = (float)kL_12.j.J();
        ((vj)kL_1).H = (float)kL_12.A.J();
        ((vj)kL_1).y = (float)a2.J.J();
    }
}

