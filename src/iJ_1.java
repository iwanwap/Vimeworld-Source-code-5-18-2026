/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  ERa
 *  JSa
 *  KL
 *  NQa
 *  QJ
 *  Ql
 *  Uk
 *  XTa
 *  bua
 *  iJ
 *  pqa
 *  uQa
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
import java.util.Map;

public abstract class iJ_1 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static KL J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        Object b2;
        JsonElement jsonElement2 = jsonElement;
        Ak ak = Uk.A;
        Ak ak2 = Uk.A;
        Ak ak3 = Uk.A;
        Ak ak4 = Uk.A;
        if (jsonElement2.isJsonPrimitive()) {
            int n2;
            Object object;
            b2 = jsonElement2.getAsString();
            if (!((String)b2).startsWith(uQa.Y)) return new KL(ak, ak2, ak3, ak4);
            if (((String)b2).length() != XTa.W) {
                if (((String)b2).length() != WOa.fa) return new KL(ak, ak2, ak3, ak4);
            }
            int n3 = ((String)b2).length() == WOa.fa ? vRa.d : uSa.E;
            try {
                object = b2;
                n2 = n3 != 0 ? yRa.d : vRa.d;
            }
            catch (Exception exception) {
                return new KL(ak, ak2, ak3, ak4);
            }
            {
                int n4 = Integer.parseInt(((String)object).substring(n2), ERa.C);
                float f2 = (float)(n4 >> ERa.C & osa.Ja) / NQa.Y;
                float f3 = (float)(n4 >> Yqa.i & osa.Ja) / NQa.Y;
                float f4 = (float)(n4 & osa.Ja) / NQa.Y;
                float f5 = n3 != 0 ? (float)Integer.parseInt(((String)b2).substring(vRa.d, yRa.d), ERa.C) / NQa.Y : pqa.r;
                ak = new vK((Uk)a2, (t)new wk((double)f2));
                ak2 = new vK((Uk)a2, (t)new wk((double)f3));
                ak3 = new vK((Uk)a2, (t)new wk((double)f4));
                ak4 = new vK((Uk)a2, (t)new wk((double)f5));
                return new KL(ak, ak2, ak3, ak4);
            }
        }
        if (!jsonElement2.isJsonArray()) return new KL(ak, ak2, ak3, ak4);
        b2 = jsonElement2.getAsJsonArray();
        if (((JsonArray)b2).size() != yRa.d) {
            if (((JsonArray)b2).size() != AQa.P) return new KL(ak, ak2, ak3, ak4);
        }
        void v2 = a2;
        ak = v2.f(((JsonArray)b2).get(uSa.E));
        ak2 = v2.f(((JsonArray)b2).get(vRa.d));
        ak3 = v2.f(((JsonArray)b2).get(uqa.g));
        if (((JsonArray)b2).size() != AQa.P) return new KL(ak, ak2, ak3, ak4);
        ak4 = a2.f(((JsonArray)b2).get(yRa.d));
        return new KL(ak, ak2, ak3, ak4);
    }

    /*
     * WARNING - void declaration
     */
    public static iJ J(JsonObject jsonObject, Uk uk2) throws Ql {
        Iterator iterator;
        boolean bl;
        ArrayList<QJ> arrayList;
        KL kL2;
        void a2;
        Object b222;
        JsonObject jsonObject2 = jsonObject;
        JsonElement jsonElement = jsonObject2.get(JSa.Y);
        Ak ak = Uk.J;
        ArrayList<QJ> arrayList2 = new ArrayList<QJ>();
        int bl2 = vRa.d;
        if (jsonElement.isJsonObject()) {
            Object object = b222 = jsonElement.getAsJsonObject().entrySet().iterator();
            while (object.hasNext()) {
                Map.Entry n2 = (Map.Entry)b222.next();
                kL2 = iJ_1.J((JsonElement)n2.getValue(), (Uk)a2);
                arrayList2.add(new QJ(Float.parseFloat((String)n2.getKey()), kL2));
                object = b222;
            }
            ArrayList<QJ> arrayList3 = arrayList2;
            arrayList = arrayList3;
            arrayList3.sort(YK.J());
            bl = uSa.E;
        } else {
            if (jsonElement.isJsonArray()) {
                b222 = jsonElement.getAsJsonArray();
                int iterator2 = uSa.E;
                KL kL3 = kL2 = ((JsonArray)b222).iterator();
                while (kL3.hasNext()) {
                    jsonElement = kL2.next();
                    kL3 = kL2;
                    float f2 = (float)iterator2 / (float)(((JsonArray)b222).size() - vRa.d);
                    ++iterator2;
                    arrayList2.add(new QJ(f2, iJ_1.J(jsonElement, (Uk)a2)));
                }
            }
            arrayList = arrayList2;
        }
        float b222 = ((QJ)arrayList.get((int)(arrayList2.size() - vRa.d))).I;
        Iterator iterator3 = iterator = arrayList2.iterator();
        while (iterator3.hasNext()) {
            kL2 = (QJ)iterator.next();
            iterator3 = iterator;
            kL2.I /= b222;
        }
        if (jsonObject2.has(bua.Ka)) {
            ak = a2.f(jsonObject2.get(bua.Ka));
        }
        return new uk(arrayList2, b222, ak, bl);
    }

    public static /* synthetic */ int J(QJ qJ, QJ qJ2) {
        QJ b2 = qJ2;
        QJ a2 = qJ;
        return Float.compare(a2.I, b2.I);
    }

    public abstract void J(vj var1);

    public abstract JsonElement J();

    public iJ_1() {
        iJ_1 a2;
    }
}

