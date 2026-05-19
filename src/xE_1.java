/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bf
 *  Bg
 *  Df
 *  ERa
 *  ISa
 *  JPa
 *  KE
 *  LQa
 *  Lqa
 *  NE
 *  XSa
 *  Xd
 *  ag
 *  cQa
 *  fpa
 *  kqa
 *  pqa
 *  pua
 *  rf
 *  uQa
 *  ue
 *  vRa
 *  wd
 *  ye
 */
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix4f;
import javax.vecmath.Vector2d;
import javax.vecmath.Vector3f;
import org.apache.commons.lang3.ArrayUtils;

public final class xE_1 {
    public static final /* synthetic */ boolean I;

    public static rf J(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        Object object = xE_1.J(inputStream2);
        ArrayList<NE> arrayList = new ArrayList<NE>();
        ArrayList<Vector2d> arrayList2 = new ArrayList<Vector2d>();
        ArrayList<Vector3f> arrayList3 = new ArrayList<Vector3f>();
        ArrayList<aE> arrayList4 = new ArrayList<aE>();
        HashMap<String, ue> hashMap = new HashMap<String, ue>();
        HashMap<String, Xd> hashMap2 = new HashMap<String, Xd>();
        aE aE2 = null;
        ue ue2 = null;
        KE kE2 = null;
        ag ag2 = null;
        Xd xd2 = null;
        wd wd2 = null;
        NE nE = null;
        int n2 = uSa.E;
        object = object.iterator();
        block0: while (true) {
            Object object2 = object;
            while (object2.hasNext()) {
                Object a2 = (String)object.next();
                if (a2.startsWith(uQa.Y)) {
                    object2 = object;
                    continue;
                }
                String string = (a2 = a2.split(zOa.Q))[uSa.E];
                if (string.equals(ISa.b)) {
                    aE2 = new aE(a2[vRa.d]);
                    arrayList4.add(aE2);
                    xd2 = null;
                    nE = null;
                    continue block0;
                }
                if (string.equals(Asa.f)) {
                    if (!I && aE2 == null) {
                        throw new AssertionError();
                    }
                    aE2.J(a2[vRa.d]);
                    continue block0;
                }
                if (string.equals(kqa.Ka)) {
                    if (nE != null) {
                        nE.J();
                    }
                    nE = new NE(Float.parseFloat(a2[vRa.d]), Float.parseFloat(a2[uqa.g]), Float.parseFloat(a2[yRa.d]));
                    arrayList.add(nE);
                    continue block0;
                }
                if (string.equals(FRa.z)) {
                    if (!I && nE == null) {
                        throw new AssertionError();
                    }
                    float f2 = Float.parseFloat(a2[uqa.g]);
                    if (f2 == JPa.N) continue block0;
                    nE.J().add(new lf(a2[vRa.d], f2));
                    continue block0;
                }
                if (string.equals(Lqa.fa)) {
                    arrayList2.add(new Vector2d(Double.parseDouble(a2[vRa.d]), Double.parseDouble(a2[uqa.g])));
                    continue block0;
                }
                if (string.equals(LQa.z)) {
                    arrayList3.add(new Vector3f(Float.parseFloat(a2[vRa.d]), Float.parseFloat(a2[uqa.g]), Float.parseFloat(a2[yRa.d])));
                    continue block0;
                }
                if (string.equals(BPa.Z)) {
                    if (!I && aE2 == null) {
                        throw new AssertionError();
                    }
                    aE2.J().add(new Df(a2[vRa.d], a2[uqa.g], a2[yRa.d]));
                    continue block0;
                }
                if (string.equals(UOa.ga)) {
                    n2 = uSa.E;
                    wd2 = null;
                    xd2 = new Xd(a2[vRa.d]);
                    hashMap2.put(xd2.f(), xd2);
                    continue block0;
                }
                if (string.equals(KPa.p)) {
                    if (!I && xd2 == null) {
                        throw new AssertionError();
                    }
                    xd2.J(a2[vRa.d]);
                    continue block0;
                }
                if (string.equals(STa.X)) {
                    if (!I && xd2 == null) {
                        throw new AssertionError();
                    }
                    Vector3f vector3f = new Vector3f(Float.parseFloat(a2[yRa.d]), Float.parseFloat(a2[AQa.P]), Float.parseFloat(a2[tTa.h]));
                    Matrix4f matrix4f = new Matrix4f();
                    float[] fArray = new float[ERa.C];
                    int n3 = uua.p;
                    while (n3 < cQa.o) {
                        int n4;
                        int n5 = n4 - uua.p;
                        float f3 = Float.parseFloat(a2[n4]);
                        fArray[n5] = f3;
                        n3 = ++n4;
                    }
                    matrix4f.set(fArray);
                    wd2 = new wd(n2++, a2[vRa.d], a2[uqa.g], vector3f, matrix4f);
                    xd2.J(wd2);
                    continue block0;
                }
                if (string.equals(XSa.Ha) && ((String[])a2).length >= uqa.g) {
                    if (!I && xd2 == null) {
                        throw new AssertionError();
                    }
                    wd wd3 = (wd)xd2.J().get(a2[vRa.d]);
                    if (wd2 == null) {
                        System.out.println(new StringBuilder().insert(3 & 4, gQa.y).append(a2[vRa.d]).append(yOa.x).toString());
                        object2 = object;
                        continue;
                    }
                    int n6 = ((String[])a2).length >= yRa.d ? Integer.parseInt(a2[uqa.g]) : vRa.d;
                    int n7 = ((String[])a2).length >= AQa.P && a2[yRa.d].equals(oQa.l) ? vRa.d : uSa.E;
                    wd2.J(new Bf(wd3, n6, n7 != 0));
                    continue block0;
                }
                if (string.equals(fpa.J)) {
                    ue2 = new ue(a2[vRa.d]);
                    hashMap.put(a2[vRa.d], ue2);
                    continue block0;
                }
                if (string.equals(yRa.fa)) {
                    if (!I && ue2 == null) {
                        throw new AssertionError();
                    }
                    kE2 = new KE(a2[vRa.d]);
                    ue2.J().put(a2[vRa.d], kE2);
                    continue block0;
                }
                if (string.equals(Ira.T)) {
                    if (!I && kE2 == null) {
                        throw new AssertionError();
                    }
                    ag2 = new ag(a2[vRa.d], Integer.parseInt(a2[uqa.g]));
                    kE2.J().add(ag2);
                    continue block0;
                }
                if (!string.equals(POa.h)) continue block0;
                if (!I && ag2 == null) {
                    throw new AssertionError();
                }
                ag2.J().add(qE.J(a2));
                continue block0;
            }
            break;
        }
        if (nE != null) {
            nE.J();
        }
        return new rf(arrayList, arrayList2, arrayList3, arrayList4, hashMap, hashMap2);
    }

    public xE_1() {
        xE_1 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(int n2, Bg bg2, aE aE2, rf rf2, List<Integer> list, float[] fArray, double[] dArray, float[] fArray2, float[] fArray3, int[] nArray) {
        void g2;
        void i2;
        Object j2;
        List<Integer> list2 = list;
        int f2 = n2;
        j2.add(f2);
        if (i2.J() >= 0) {
            void h2;
            void e22;
            j2 = (NE)g2.J().get(i2.J());
            void v0 = e22;
            int n3 = f2;
            e22[f2 * AQa.P] = j2.J();
            e22[n3 * AQa.P + vRa.d] = j2.f();
            v0[n3 * AQa.P + uqa.g] = j2.l();
            v0[f2 * AQa.P + yRa.d] = pqa.r;
            if (h2 != null) {
                int e22 = uSa.E;
                int n4 = Math.min(j2.J().size(), AQa.P);
                int n5 = e22;
                while (n5 < n4) {
                    lf lf2 = (lf)j2.J().get(e22);
                    wd wd2 = (wd)h2.J().J().get(lf2.J());
                    b[f2 * AQa.P + e22] = wd2 == null ? JPa.N : lf2.J();
                    a[f2 * AQa.P + e22] = wd2 == null ? pua.o : wd2.J();
                    n5 = ++e22;
                }
            }
        }
        if (i2.l() >= 0) {
            void d2;
            j2 = (Vector2d)g2.C().get(i2.l());
            void v3 = d2;
            v3[f2 * uqa.g] = j2.x;
            v3[f2 * uqa.g + vRa.d] = oua.i - j2.y;
        }
        if (i2.f() >= 0) {
            void c2;
            j2 = (Vector3f)g2.f().get(i2.f());
            void v4 = c2;
            int n6 = f2;
            c2[n6 * yRa.d] = j2.x;
            v4[n6 * yRa.d + vRa.d] = j2.y;
            v4[f2 * yRa.d + uqa.g] = j2.z;
        }
    }

    static {
        I = !xE_1.class.desiredAssertionStatus() ? vRa.d : uSa.E;
    }

    public static void J(rf rf2, rf rf3) {
        rf a2;
        Object b2 = rf3;
        rf rf4 = a2 = rf2;
        int n2 = rf4.J().size();
        int n3 = rf4.f().size();
        int n4 = rf4.C().size();
        rf4.J().addAll(b2.J());
        a2.f().addAll(b2.f());
        a2.C().addAll(b2.C());
        rf rf5 = b2;
        a2.f().putAll(rf5.f());
        b2 = rf5.l().iterator();
        Object object = b2;
        while (object.hasNext()) {
            aE aE2;
            aE aE3 = aE2 = ((aE)b2.next()).J(n2, n3, n4);
            aE3.J((Xd)a2.f().get(aE3.f()));
            object = b2;
            a2.l().add(aE2);
        }
    }

    public static List<String> J(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            String string;
            Closeable a2 = new BufferedReader(new InputStreamReader(inputStream2, StandardCharsets.UTF_8));
            Closeable closeable = a2;
            while ((string = closeable.readLine()) != null) {
                closeable = a2;
                arrayList.add(string);
            }
        }
        catch (Exception a2) {
            a2.printStackTrace();
            return arrayList;
        }
        ((BufferedReader)a2).close();
        return arrayList;
    }

    public static Map<String, ye> J(rf rf2) {
        Iterator iterator;
        rf rf3 = rf2;
        HashMap<String, ye> hashMap = new HashMap<String, ye>();
        Iterator iterator2 = iterator = rf3.l().iterator();
        while (iterator2.hasNext()) {
            Object object2;
            aE a2 = (aE)iterator.next();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            List<Df> list = a2.J();
            int[] nArray = new int[list.size() * yRa.d * AQa.P];
            float[] fArray = new float[list.size() * yRa.d * AQa.P];
            float[] fArray2 = new float[list.size() * yRa.d * AQa.P];
            double[] dArray = new double[list.size() * yRa.d * uqa.g];
            float[] fArray3 = new float[list.size() * yRa.d * yRa.d];
            Arrays.fill(nArray, pua.o);
            Arrays.fill(fArray, vqa.T);
            int n2 = uSa.E;
            for (Object object2 : list) {
                Bg[] bgArray = object2.J();
                int n3 = bgArray.length;
                int n4 = uSa.E;
                while (n4 < n3) {
                    int n5;
                    Bg bg2 = bgArray[n5];
                    xE_1.J(n2++, bg2, a2, rf3, arrayList, fArray2, dArray, fArray3, fArray, nArray);
                    n4 = ++n5;
                }
            }
            Integer[] integerArray = arrayList.toArray(new Integer[uSa.E]);
            object2 = ArrayUtils.toPrimitive(integerArray);
            iterator2 = iterator;
            hashMap.put(a2.J(), new ye(fArray2, dArray, fArray3, fArray, nArray, (int[])object2, a2));
        }
        return hashMap;
    }
}

