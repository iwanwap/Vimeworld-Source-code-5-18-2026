/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  Gg
 *  NTa
 *  aJa
 *  oe
 *  pua
 *  vRa
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class jg_3 {
    private static oe[][] I = null;

    /*
     * WARNING - void declaration
     */
    public static void J(Gg gg2, aJa aJa2, float f2, float f3) {
        Gg d2 = aJa2;
        Gg c2 = gg2;
        if (I != null && Config.J().kc >= Yqa.i && (d2 = c2.F.J()) >= 0 && d2 < I.length && (d2 = I[d2]) != null) {
            void a2;
            int n2;
            int n3 = (int)(c2.f() % dua.Aa);
            int n4 = n2 = uSa.E;
            while (n4 < d2.length) {
                oe oe2 = d2[n2];
                if (oe2.J(c2, n3)) {
                    void b2;
                    oe2.J(n3, (float)b2, (float)a2);
                }
                n4 = ++n2;
            }
            Vd.J((float)a2);
        }
    }

    public static void f() {
        I = null;
    }

    public static void J() {
        jg_3.f();
        if (Config.Ga()) {
            I = jg_3.J();
        }
    }

    public static boolean J(Gg gg2) {
        Gg gg3 = gg2;
        if (I == null) {
            return uSa.E != 0;
        }
        if (Config.J().kc < Yqa.i) {
            return uSa.E != 0;
        }
        int a22 = gg3.F.J();
        if (a22 >= 0 && a22 < I.length) {
            oe[] a22 = I[a22];
            if (a22 == null) {
                return uSa.E != 0;
            }
            if (a22.length > 0) {
                return vRa.d != 0;
            }
            return uSa.E != 0;
        }
        return uSa.E != 0;
    }

    public jg_3() {
        jg_3 a2;
    }

    private static oe[][] J() {
        int n2;
        Object object;
        int n3;
        oe[][] oeArray = new oe[NTa.C][uSa.E];
        String string = Vra.m;
        int n4 = pua.o;
        int n5 = n3 = uSa.E;
        while (n5 < oeArray.length) {
            ArrayList<Properties> arrayList;
            ArrayList<Properties> arrayList2;
            block11: {
                object = new StringBuilder().insert(3 ^ 3, string).append(n3).append(KQa.g).toString();
                arrayList2 = new ArrayList<Properties>();
                int n6 = vRa.d;
                while (n6 < PRa.U) {
                    int n7;
                    block12: {
                        Object object2;
                        Properties properties;
                        InputStream inputStream;
                        block13: {
                            Object object3;
                            block10: {
                                object3 = new StringBuilder().insert(2 & 5, (String)object).append(n7).append(Jpa.R).toString();
                                ResourceLocation resourceLocation = new ResourceLocation((String)object3);
                                inputStream = Config.J(resourceLocation);
                                if (inputStream != null) break block10;
                                arrayList = arrayList2;
                                break block11;
                            }
                            properties = new Properties();
                            InputStream inputStream2 = inputStream;
                            properties.load(inputStream2);
                            inputStream2.close();
                            Config.f(new StringBuilder().insert(3 & 4, Jsa.P).append((String)object3).toString());
                            object2 = new StringBuilder().insert(2 & 5, (String)object).append(n7).append(KPa.C).toString();
                            properties = new oe(properties, (String)object2);
                            if (!properties.J((String)object3)) break block12;
                            object3 = new ResourceLocation(((oe)properties).M);
                            object2 = Cg.J((ResourceLocation)object3);
                            if (object2 != null) break block13;
                            Config.e(new StringBuilder().insert(3 ^ 3, vTa.a).append(object3).toString());
                        }
                        try {
                            ((oe)properties).m = object2.J();
                            arrayList2.add(properties);
                            inputStream.close();
                        }
                        catch (FileNotFoundException fileNotFoundException) {
                            arrayList = arrayList2;
                            break block11;
                        }
                        catch (IOException iOException) {
                            iOException.printStackTrace();
                        }
                    }
                    n6 = ++n7;
                }
                arrayList = arrayList2;
            }
            if (arrayList.size() > 0) {
                ArrayList<Properties> arrayList3 = arrayList2;
                oe[] oeArray2 = arrayList3.toArray(new oe[arrayList3.size()]);
                oeArray[n3] = oeArray2;
            }
            n5 = ++n3;
        }
        if (n4 < 0) {
            return null;
        }
        n3 = n4 + vRa.d;
        object = new oe[n3][uSa.E];
        int n8 = n2 = uSa.E;
        while (n8 < ((oe[][])object).length) {
            int n9 = n2++;
            object[n9] = oeArray[n9];
            n8 = n2;
        }
        return object;
    }
}

