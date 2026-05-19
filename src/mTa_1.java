/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CY
 *  JPa
 *  Kpa
 *  OU
 *  Tpa
 *  WTa
 *  YTa
 *  aSa
 *  bpa
 *  ld
 *  lsa
 *  mra
 *  psa
 *  uOa
 *  uTa
 *  vRa
 *  zTa
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;

public final class mTa_1 {
    public static String g;
    public static boolean L;
    public static lsa E;
    public static Kpa m;
    public static Object C;
    public static double i;
    public static OU M;
    public static ArrayList<YTa> k;
    public static float j;
    public static OU J;
    public static String A;
    public static long I;

    public static void e() {
        ArrayList<YTa> arrayList;
        if (k.isEmpty()) {
            mTa_1.m.c.J((ld)new CY(Bua.a));
            return;
        }
        uTa uTa2 = uTa.J((String)A);
        lsa lsa2 = lsa.J((String)g);
        Object object = C;
        if (object != null && object.equals(xqa.f)) {
            object = mTa_1.m.c;
        }
        if ((arrayList = new ArrayList<YTa>(k)).size() == vRa.d) {
            ArrayList<YTa> arrayList2 = arrayList;
            arrayList2.add(arrayList2.get(uSa.E));
        }
        E = lsa2.J(arrayList, I, uTa2, object);
        mTa_1.E.I.J(arrayList);
    }

    public static void J(JsonObject jsonObject) {
        int n2;
        JsonObject jsonObject2 = jsonObject;
        k.clear();
        JsonObject jsonObject3 = jsonObject2;
        I = jsonObject3.get(bpa.V).getAsLong();
        A = jsonObject3.get(psa.u).getAsString();
        i = jsonObject3.get(xTa.fa).getAsDouble();
        JsonArray jsonArray = jsonObject3.getAsJsonArray(zTa.k);
        int n3 = n2 = uSa.E;
        while (n3 < jsonArray.size()) {
            JsonObject a2 = jsonArray.get(n2).getAsJsonObject();
            k.add(new YTa((double)a2.get(rRa.X).getAsFloat(), (double)a2.get(uOa.Ja).getAsFloat(), (double)a2.get(oua.v).getAsFloat(), (double)a2.get(ROa.n).getAsFloat(), (double)a2.get(mra.F).getAsFloat(), (double)a2.get(Psa.A).getAsFloat(), (double)a2.get(mra.h).getAsFloat()));
            n3 = ++n2;
        }
    }

    private static double J(double a2) {
        return (double)Math.round(a2 * Tpa.M) / Tpa.M;
    }

    public static void d() {
        WTa.I = System.nanoTime();
        mTa_1.e();
        k.clear();
    }

    public static void C() {
        lsa.J();
        uTa.J();
        WTa.M = mTa_1.m.z.LA;
    }

    public static void l() {
        M.J(vRa.d != 0);
        WTa.M = WTa.m = mTa_1.m.z.LA;
    }

    public static void f() {
        Iterator<YTa> iterator;
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        Iterator<YTa> iterator2 = iterator = k.iterator();
        while (iterator2.hasNext()) {
            YTa yTa = iterator.next();
            JsonObject jsonObject2 = new JsonObject();
            iterator2 = iterator;
            JsonObject jsonObject3 = jsonObject2;
            jsonObject3.addProperty(rRa.X, mTa_1.J(yTa.x));
            jsonObject3.addProperty(uOa.Ja, mTa_1.J(yTa.y));
            jsonObject3.addProperty(oua.v, mTa_1.J(yTa.z));
            jsonObject3.addProperty(ROa.n, mTa_1.J(yTa.rotationYaw));
            jsonObject3.addProperty(mra.F, mTa_1.J(yTa.rotationPitch));
            jsonObject3.addProperty(Psa.A, mTa_1.J(yTa.roll));
            jsonObject3.addProperty(mra.h, mTa_1.J(yTa.zoom));
            jsonArray.add(jsonObject3);
        }
        JsonObject jsonObject4 = jsonObject;
        jsonObject4.add(zTa.k, jsonArray);
        jsonObject4.addProperty(bpa.V, I);
        jsonObject4.addProperty(psa.u, A);
        jsonObject4.addProperty(xTa.fa, i);
        OT.b.info(new StringBuilder().insert(3 >> 2, UOa.o).append(k.size()).append(aSa.K).toString());
        OT.b.info(jsonObject.toString());
    }

    public static void J() {
        if (M.J()) {
            mTa_1.m.z.ba = uSa.E;
            mTa_1.m.z.LA = WTa.M;
            WTa.m = UOa.d;
        }
        E = null;
        k.clear();
        C = null;
        WTa.i = uSa.E;
        j = JPa.N;
        mTa_1.m.R.p = JPa.N;
        M.J(uSa.E != 0);
        J.J(uSa.E != 0);
    }

    public mTa_1() {
        mTa_1 a2;
    }

    static {
        M = new OU(uSa.E != 0, vRa.d);
        J = new OU(uSa.E != 0, vRa.d);
        m = Kpa.J();
        j = JPa.N;
        E = null;
        L = uSa.E;
        I = lTa.n;
        g = BQa.la;
        A = IPa.M;
        C = null;
        k = new ArrayList();
        i = oua.i;
    }
}

