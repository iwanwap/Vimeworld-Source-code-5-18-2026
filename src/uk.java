/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  JPa
 *  JSa
 *  KL
 *  Oz
 *  QJ
 *  Uk
 *  aSa
 *  bua
 *  iJ
 *  lL
 *  pqa
 *  vK
 *  vRa
 *  vj
 *  wk
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class uk
extends iJ {
    public List<QJ> j;
    public float J;
    public Ak A;
    public boolean I;

    public static /* synthetic */ int f(QJ qJ, QJ qJ2) {
        QJ b2 = qJ2;
        QJ a2 = qJ;
        return Float.compare(a2.I, b2.I);
    }

    /*
     * WARNING - void declaration
     */
    public void J(vj vj2) {
        int n2;
        uk b2;
        void a2;
        uk uk2 = this;
        int n3 = uk2.j.size();
        if (n3 == 0) {
            void v0 = a2;
            v0.H = v0.y = pqa.r;
            v0.a = v0.y;
            v0.R = v0.y;
            return;
        }
        if (n3 == vRa.d) {
            uk2.j.get((int)uSa.E).A.J((vj)a2);
            return;
        }
        uk uk3 = uk2;
        double d2 = uk3.A.J();
        if ((d2 = Oz.J((double)d2, (double)aSa.V, (double)oua.i)) < (double)(b2 = uk3.j.get(uSa.E)).J(uk2.J)) {
            ((QJ)b2).A.J((vj)a2);
            return;
        }
        int n4 = n2 = vRa.d;
        while (n4 < n3) {
            QJ qJ;
            QJ qJ2 = uk2.j.get(n2);
            if ((double)qJ.J(uk2.J) > d2) {
                ((QJ)b2).A.J((vj)a2);
                qJ2.A.J((vj)a2, (float)(d2 - (double)b2.J(uk2.J)) / (qJ2.J(uk2.J) - b2.J(uk2.J)));
                return;
            }
            b2 = qJ2;
            n4 = ++n2;
        }
        ((QJ)b2).A.J((vj)a2);
    }

    public uk() {
        uk a2;
        uk uk2 = a2;
        uk2.J = pqa.r;
        uk uk3 = a2;
        uk3.j = new ArrayList<QJ>();
        uk2.j.add(new QJ(JPa.N, new KL((Ak)new vK(null, (t)new wk(oua.i)), (Ak)new vK(null, (t)new wk(oua.i)), (Ak)new vK(null, (t)new wk(oua.i)), (Ak)new vK(null, (t)new wk(oua.i)))));
        a2.j.add(new QJ(pqa.r, new KL((Ak)new vK(null, (t)new wk(aSa.V)), (Ak)new vK(null, (t)new wk(aSa.V)), (Ak)new vK(null, (t)new wk(aSa.V)), (Ak)new vK(null, (t)new wk(oua.i)))));
        uk uk4 = a2;
        uk4.A = Uk.J;
        uk4.I = uSa.E;
    }

    public void J() {
        uk a2;
        a2.j.sort(lL.J());
    }

    /*
     * WARNING - void declaration
     */
    public uk(List<QJ> list, float f2, Ak ak, boolean bl) {
        void e2;
        void b2;
        void c2;
        void d2;
        uk a2;
        boolean bl2 = bl;
        uk uk2 = a2 = this;
        uk uk3 = a2;
        a2.J = pqa.r;
        uk3.j = d2;
        uk3.J = c2;
        uk2.A = b2;
        uk2.I = e2;
    }

    public JsonElement J() {
        Object object;
        Object object2;
        Object a2;
        uk uk2 = this;
        JsonObject jsonObject = new JsonObject();
        if (uk2.I) {
            Iterator<QJ> iterator;
            a2 = new JsonArray();
            Iterator<QJ> iterator2 = iterator = uk2.j.iterator();
            while (iterator2.hasNext()) {
                QJ qJ = iterator.next();
                iterator2 = iterator;
                ((JsonArray)a2).add(qJ.A.f());
            }
            object = object2 = a2;
        } else {
            Iterator<QJ> iterator;
            a2 = new JsonObject();
            Iterator<QJ> iterator3 = iterator = uk2.j.iterator();
            while (iterator3.hasNext()) {
                QJ qJ = iterator.next();
                iterator3 = iterator;
                ((JsonObject)a2).add(String.valueOf(qJ.J(uk2.J)), qJ.A.f());
            }
            object = object2 = a2;
        }
        if (!oK.J((JsonElement)object)) {
            jsonObject.add(JSa.Y, (JsonElement)object2);
        }
        if (!Ak.J((Ak)uk2.A)) {
            jsonObject.add(bua.Ka, uk2.A.J());
        }
        return jsonObject;
    }
}

