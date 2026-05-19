/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ELa
 *  JPa
 *  Kla
 *  Rja
 *  SRa
 *  Yra
 *  hJa
 *  kPa
 *  lqa
 *  mKa
 *  pqa
 *  vRa
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.util.vector.Vector3f;

public final class oka_3 {
    public static final List<String> I;

    /*
     * WARNING - void declaration
     */
    private void J(mKa mKa2, List<ELa> list, int[] nArray, int n2, int n3, int n4, int n5, boolean bl) {
        void a2;
        void b2;
        void c2;
        void d2;
        void h2;
        void e2;
        Object f2 = this;
        Object i2 = nArray;
        int n6 = i2 = ((oka_3)f2).J((int[])i2, (int)(e2 + h2.func_178372_b()), (int)(d2 + h2.func_178371_c()), (int)c2, (int)b2) && a2 != false ? vRa.d : uSa.E;
        if (i2 != 0) {
            void g2;
            ((oka_3)f2).J((List<ELa>)g2, (mKa)h2, (int)e2, (int)d2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private List<ELa> J(KLa kLa2) {
        int n2;
        void a2;
        oka_3 oka_32 = this;
        void v0 = a2;
        int n3 = v0.J();
        int n4 = v0.f();
        ArrayList<ELa> arrayList = Lists.newArrayList();
        int n5 = n2 = uSa.E;
        while (n5 < a2.e()) {
            int[] nArray = a2.J(n2)[uSa.E];
            int n6 = uSa.E;
            while (n6 < n4) {
                int n7;
                int n8 = uSa.E;
                while (n8 < n3) {
                    int b2;
                    int n9 = !oka_32.J(nArray, b2, n7, n3, n4) ? vRa.d : uSa.E;
                    oka_3 oka_33 = oka_32;
                    oka_33.J(mKa.UP, arrayList, nArray, b2, n7, n3, n4, n9 != 0);
                    oka_33.J(mKa.DOWN, arrayList, nArray, b2, n7, n3, n4, n9 != 0);
                    oka_33.J(mKa.LEFT, arrayList, nArray, b2, n7, n3, n4, n9 != 0);
                    oka_33.J(mKa.RIGHT, arrayList, nArray, b2++, n7, n3, n4, n9 != 0);
                    n8 = b2;
                }
                n6 = ++n7;
            }
            n5 = ++n2;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private boolean J(int[] nArray, int n2, int n3, int n4, int n5) {
        void a2;
        void b2;
        void d2;
        int f2 = n3;
        oka_3 c2 = this;
        if (d2 >= 0 && f2 >= 0 && d2 < b2 && f2 < a2) {
            void e2;
            if ((e2[f2 * b2 + d2] >> osa.c & osa.Ja) == 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private List<GJa> J(KLa kLa2, String string, int n2) {
        Iterator<ELa> c2;
        oka_3 oka_32 = this;
        void v0 = c2;
        float f2 = v0.J();
        float f3 = v0.f();
        ArrayList<GJa> arrayList = Lists.newArrayList();
        c2 = oka_32.J((KLa)((Object)c2)).iterator();
        while (c2.hasNext()) {
            void b2;
            void a2;
            ELa d322 = c2.next();
            float f4 = JPa.N;
            float f5 = JPa.N;
            float f6 = JPa.N;
            float f7 = JPa.N;
            float f8 = JPa.N;
            float f9 = JPa.N;
            float f10 = JPa.N;
            float f11 = JPa.N;
            float f12 = JPa.N;
            float f13 = JPa.N;
            ELa eLa2 = d322;
            float d322 = eLa2.l();
            float f14 = eLa2.f();
            float f15 = eLa2.J();
            mKa mKa2 = eLa2.J();
            switch (Kla.I[mKa2.ordinal()]) {
                case 1: {
                    f8 = d322;
                    f4 = d322;
                    f6 = f9 = f14 + pqa.r;
                    f10 = f15;
                    f5 = f15;
                    f11 = f15;
                    f7 = f15;
                    f12 = Yra.i / f2;
                    f13 = Yra.i / (f3 - pqa.r);
                    break;
                }
                case 2: {
                    f11 = f15;
                    f10 = f15;
                    f8 = d322;
                    f4 = d322;
                    f6 = f9 = f14 + pqa.r;
                    f5 = f15 + pqa.r;
                    f7 = f15 + pqa.r;
                    f12 = Yra.i / f2;
                    f13 = Yra.i / (f3 - pqa.r);
                    break;
                }
                case 3: {
                    f8 = f15;
                    f4 = f15;
                    f9 = f15;
                    f6 = f15;
                    f11 = d322;
                    f5 = d322;
                    f7 = f10 = f14 + pqa.r;
                    f12 = Yra.i / (f2 - pqa.r);
                    f13 = Yra.i / f3;
                    break;
                }
                case 4: {
                    f9 = f15;
                    f8 = f15;
                    f4 = f15 + pqa.r;
                    f6 = f15 + pqa.r;
                    f11 = d322;
                    f5 = d322;
                    f7 = f10 = f14 + pqa.r;
                    f12 = Yra.i / (f2 - pqa.r);
                    f13 = Yra.i / f3;
                    break;
                }
            }
            d322 = Yra.i / f2;
            f14 = Yra.i / f3;
            f4 *= d322;
            f6 *= d322;
            f5 *= f14;
            f7 *= f14;
            f5 = Yra.i - f5;
            f7 = Yra.i - f7;
            f8 *= f12;
            f9 *= f12;
            f10 *= f13;
            f11 *= f13;
            HashMap<DZ, Rja> d322 = Maps.newHashMap();
            float[] fArray = new float[AQa.P];
            fArray[uSa.E] = f8;
            fArray[vRa.d] = f10;
            fArray[uqa.g] = f9;
            fArray[yRa.d] = f11;
            d322.put(mKa2.getFacing(), new Rja((DZ)null, (int)a2, (String)b2, new hJa(fArray, uSa.E)));
            switch (Kla.I[mKa2.ordinal()]) {
                case 1: {
                    arrayList.add(new GJa(new Vector3f(f4, f5, kPa.y), new Vector3f(f6, f5, sSa.m), d322, null, vRa.d != 0));
                    break;
                }
                case 2: {
                    arrayList.add(new GJa(new Vector3f(f4, f7, kPa.y), new Vector3f(f6, f7, sSa.m), d322, null, vRa.d != 0));
                    break;
                }
                case 3: {
                    arrayList.add(new GJa(new Vector3f(f4, f5, kPa.y), new Vector3f(f4, f7, sSa.m), d322, null, vRa.d != 0));
                    break;
                }
                case 4: {
                    arrayList.add(new GJa(new Vector3f(f6, f5, kPa.y), new Vector3f(f6, f7, sSa.m), d322, null, vRa.d != 0));
                    break;
                }
            }
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public fKa J(WKa wKa2, fKa fKa2) {
        ArrayList<GJa> arrayList;
        void a2;
        ArrayList<GJa> arrayList2;
        HashMap<String, String> hashMap;
        block3: {
            int n2;
            oka_3 oka_32 = this;
            hashMap = Maps.newHashMap();
            arrayList2 = Lists.newArrayList();
            int n3 = n2 = uSa.E;
            while (n3 < I.size()) {
                void b2;
                String string = I.get(n2);
                if (!a2.J(string)) {
                    arrayList = arrayList2;
                    break block3;
                }
                Object c2 = a2.J(string);
                hashMap.put(string, (String)c2);
                c2 = b2.J(new ResourceLocation((String)c2).toString());
                arrayList2.addAll(oka_32.J(n2++, string, (KLa)c2));
                n3 = n2;
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put(SRa.l, a2.J(SRa.l) ? a2.J(SRa.l) : (String)hashMap.get(Tqa.S));
        return new fKa(arrayList2, hashMap, uSa.E != 0, uSa.E != 0, a2.J());
    }

    public oka_3() {
        oka_3 a2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(List<ELa> list, mKa mKa2, int n2, int n3) {
        void e22;
        void v1;
        void b2;
        void a2;
        void c2;
        void d2;
        oka_3 oka_32;
        block2: {
            oka_3 oka_33 = this;
            oka_32 = null;
            for (oka_3 e22 : d2) {
                void var8_10;
                if (e22.J() != c2) continue;
                void v0 = var8_10 = mKa.access$000((mKa)c2) ? a2 : b2;
                if (e22.J() != var8_10) continue;
                oka_32 = e22;
                v1 = c2;
                break block2;
            }
            v1 = c2;
        }
        void var6_9 = mKa.access$000((mKa)v1) ? a2 : b2;
        void v2 = e22 = mKa.access$000((mKa)c2) ? b2 : a2;
        if (oka_32 == null) {
            d2.add(new ELa((mKa)c2, (int)e22, (int)var6_9));
            return;
        }
        oka_32.J((int)e22);
    }

    static {
        String[] stringArray = new String[tTa.h];
        stringArray[uSa.E] = Tqa.S;
        stringArray[vRa.d] = PRa.I;
        stringArray[uqa.g] = tSa.T;
        stringArray[yRa.d] = xua.u;
        stringArray[AQa.P] = lqa.F;
        I = Lists.newArrayList(stringArray);
    }

    /*
     * WARNING - void declaration
     */
    private List<GJa> J(int n2, String string, KLa kLa2) {
        void a2;
        void b2;
        void c2;
        oka_3 oka_32 = this;
        HashMap<DZ, Rja> hashMap = Maps.newHashMap();
        float[] fArray = new float[AQa.P];
        fArray[uSa.E] = JPa.N;
        fArray[vRa.d] = JPa.N;
        fArray[uqa.g] = Yra.i;
        fArray[yRa.d] = Yra.i;
        hashMap.put(DZ.SOUTH, new Rja((DZ)null, (int)c2, (String)b2, new hJa(fArray, uSa.E)));
        float[] fArray2 = new float[AQa.P];
        fArray2[uSa.E] = Yra.i;
        fArray2[vRa.d] = JPa.N;
        fArray2[uqa.g] = JPa.N;
        fArray2[yRa.d] = Yra.i;
        hashMap.put(DZ.NORTH, new Rja((DZ)null, (int)c2, (String)b2, new hJa(fArray2, uSa.E)));
        ArrayList d2 = Lists.newArrayList();
        d2.add(new GJa(new Vector3f(JPa.N, JPa.N, kPa.y), new Vector3f(Yra.i, Yra.i, sSa.m), hashMap, null, vRa.d != 0));
        d2.addAll(oka_32.J((KLa)a2, (String)b2, (int)c2));
        return d2;
    }
}

