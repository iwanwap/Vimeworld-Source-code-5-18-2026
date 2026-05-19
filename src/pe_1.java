/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cg
 *  Qqa
 *  SRa
 *  Uqa
 *  Uta
 *  XTa
 *  Yka
 *  Zta
 *  hra
 *  oD
 *  oqa
 *  uQa
 *  vRa
 */
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

public final class pe_1 {
    private static oD[] I = new oD[uSa.E];

    public static oD J(KLa kLa2) {
        KLa kLa3 = kLa2;
        if (!(kLa3 instanceof KLa)) {
            return null;
        }
        int a2 = kLa3.C();
        if (a2 >= 0 && a2 < I.length) {
            return I[a2];
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void J() {
        I = new oD[uSa.E];
        if (Config.ma()) {
            String string = fta.Ha;
            try {
                int n2;
                ResourceLocation resourceLocation = new ResourceLocation(string);
                if (!Config.f(resourceLocation)) {
                    Config.f(new StringBuilder().insert(3 >> 2, Jqa.b).append(string).append(Ira.e).toString());
                    return;
                }
                ResourceLocation resourceLocation2 = resourceLocation;
                boolean bl = Config.J(resourceLocation2);
                String[] stringArray = Config.J(resourceLocation2);
                ArrayList<String> arrayList = new ArrayList<String>(hra.Ja);
                InputStream inputStream = stringArray;
                stringArray = Config.J(inputStream);
                inputStream.close();
                stringArray = Config.J((String)stringArray, qQa.l);
                if (bl) {
                    Config.f(new StringBuilder().insert(3 >> 2, ITa.ja).append(string).append(SRa.b).toString());
                    Config.f(Qqa.d);
                } else {
                    Config.f(new StringBuilder().insert(3 ^ 3, Uta.o).append(string).append(SRa.b).toString());
                }
                WKa wKa2 = Cg.J();
                int n3 = n2 = uSa.E;
                while (true) {
                    if (n3 >= stringArray.length) {
                        ArrayList<String> arrayList2 = arrayList;
                        I = arrayList2.toArray(new oD[arrayList2.size()]);
                        return;
                    }
                    String string2 = stringArray[n2].trim();
                    if (!string2.startsWith(uQa.Y)) {
                        String[] stringArray2 = Config.J(string2, vTa.S);
                        if (stringArray2.length != uqa.g) {
                            Config.J(new StringBuilder().insert(3 & 4, Uqa.z).append(string).append(Zta.Ja).append(string2).toString());
                        } else {
                            String string3 = stringArray2[uSa.E].trim();
                            String string4 = stringArray2[vRa.d].trim();
                            KLa kLa2 = wKa2.l(yOa.N + string3);
                            if (kLa2 == null) {
                                Config.J(new StringBuilder().insert(3 & 4, KPa.M).append(string).append(Zta.Ja).append(string2).toString());
                            } else {
                                int n4 = kLa2.C();
                                if (n4 < 0) {
                                    Config.J(new StringBuilder().insert(3 ^ 3, Uqa.z).append(string).append(Zta.Ja).append(string2).toString());
                                } else {
                                    if (bl && !Config.J(new ResourceLocation(new StringBuilder().insert(3 & 4, Ira.ca).append(string3).append(KPa.C).toString()))) {
                                        return;
                                    }
                                    string2 = new oD(string4);
                                    if (string2.J()) {
                                        ArrayList<String> arrayList3 = arrayList;
                                        while (arrayList3.size() <= n4) {
                                            ArrayList<String> arrayList4 = arrayList;
                                            arrayList3 = arrayList4;
                                            arrayList4.add(null);
                                        }
                                        arrayList.set(n4, string2);
                                        Config.f(new StringBuilder().insert(3 ^ 3, oqa.h).append(string3).append(XTa.d).append(string4).toString());
                                    }
                                }
                            }
                        }
                    }
                    n3 = ++n2;
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                Config.J(new StringBuilder().insert(5 >> 3, Jqa.b).append(string).append(Ira.e).toString());
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Yka J(XF xF2, Yka yka) {
        void a2;
        XF xF3 = xF2;
        Object b2 = a2.J();
        if (b2 == null) {
            return a2;
        }
        if ((b2 = pe_1.J((KLa)b2)) == null) {
            return a2;
        }
        int n2 = rD.J(a2.J());
        n2 = Config.J(xF3, n2);
        int n3 = uSa.E;
        int n4 = uSa.E;
        if (((oD)b2).J > vRa.d) {
            n3 = n2 & yRa.d;
        }
        if (((oD)b2).J == uqa.g) {
            n3 = n3 / uqa.g * uqa.g;
        }
        if (((oD)b2).I) {
            n4 = (n2 & AQa.P) != 0 ? vRa.d : uSa.E;
        }
        return b2.J((Yka)a2, n3, n4 != 0);
    }

    public pe_1() {
        pe_1 a2;
    }
}

