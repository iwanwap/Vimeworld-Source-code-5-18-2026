/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  Eha
 *  Epa
 *  FIa
 *  Gua
 *  KIa
 *  Maa
 *  Pqa
 *  Qta
 *  SQa
 *  U
 *  XTa
 *  Ysa
 *  ZOa
 *  Zpa
 *  aQa
 *  aSa
 *  aha
 *  fGa
 *  fTa
 *  gHa
 *  jpa
 *  nka
 *  pIa
 *  pha
 *  pua
 *  uKa
 *  vRa
 *  wPa
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class FIa_2 {
    private final List<Integer> a;
    private final List<pha> b;
    private final fGa l;
    private static final Logger e = LogManager.getLogger();
    private final Map<String, pha> G;
    private static int D;
    private final List<Integer> f;
    private static boolean F;
    private final Map<String, Object> g;
    private final List<Integer> L;
    private static final aha E;
    private final VGa m;
    private final String C;
    private static FIa i;
    private boolean M;
    private final VGa k;
    private final List<String> j;
    private final boolean J;
    private final List<String> A;
    private final int I;

    /*
     * WARNING - void declaration
     */
    public void J(String string, Object object) {
        void a2;
        String c2 = string;
        FIa_2 b2 = this;
        if (b2.g.containsKey(c2)) {
            b2.g.remove(c2);
        }
        b2.g.put(c2, a2);
        b2.l();
    }

    private void d() {
        FIa_2 fIa_2 = this;
        int n2 = uSa.E;
        int n3 = uSa.E;
        int n4 = n2;
        while (n4 < fIa_2.j.size()) {
            String a2 = fIa_2.j.get(n2);
            int n5 = nka.J((int)fIa_2.I, (CharSequence)a2);
            if (n5 == pua.o) {
                e.warn(new StringBuilder().insert(3 ^ 3, fTa.B).append(fIa_2.C).append(zOa.g).append(a2).append(dsa.Fa).toString());
                fIa_2.g.remove(a2);
                fIa_2.j.remove(n3--);
            } else {
                fIa_2.a.add(n5);
            }
            n4 = ++n2;
            ++n3;
        }
        for (pha a2 : fIa_2.b) {
            String string = a2.J();
            n2 = nka.J((int)fIa_2.I, (CharSequence)string);
            if (n2 == pua.o) {
                e.warn(new StringBuilder().insert(3 >> 2, PQa.d).append(string).append(dsa.Fa).toString());
                continue;
            }
            fIa_2.L.add(n2);
            a2.J(n2);
            fIa_2.G.put(string, a2);
        }
    }

    public void C() {
        FIa_2 a2;
        pIa.J().f((FIa)a2);
    }

    public void l() {
        a.M = vRa.d;
    }

    private void f(JsonElement jsonElement) throws Eha {
        Object b2 = jsonElement;
        FIa_2 a2 = this;
        JsonObject jsonObject = Maa.J((JsonElement)b2, (String)SQa.la);
        b2 = Maa.J((JsonObject)jsonObject, (String)dua.T);
        if (!Maa.l((JsonObject)jsonObject, (String)Ysa.f)) {
            a2.g.put((String)b2, null);
            a2.j.add((String)b2);
            return;
        }
        a2.j.add((String)b2);
    }

    public VGa f() {
        FIa_2 a2;
        return a2.m;
    }

    public pha f(String string) {
        String b2 = string;
        FIa_2 a2 = this;
        if (a2.G.containsKey(b2)) {
            return a2.G.get(b2);
        }
        return E;
    }

    /*
     * WARNING - void declaration
     */
    public FIa_2(U u2, String string) throws Eha, IOException {
        Object object;
        InputStream a2;
        FIa_2 fIa_2 = this;
        fIa_2.g = Maps.newHashMap();
        fIa_2.j = Lists.newArrayList();
        fIa_2.a = Lists.newArrayList();
        fIa_2.b = Lists.newArrayList();
        fIa_2.L = Lists.newArrayList();
        fIa_2.G = Maps.newHashMap();
        Object object2 = new JsonParser();
        ResourceLocation resourceLocation = new ResourceLocation(new StringBuilder().insert(3 ^ 3, Qta.Y).append((String)((Object)a2)).append(Epa.k).toString());
        fIa_2.C = a2;
        a2 = null;
        try {
            JsonArray jsonArray;
            JsonArray jsonArray2;
            Iterator<JsonElement> c222;
            void b2;
            a2 = b2.J(resourceLocation).J();
            object2 = ((JsonParser)object2).parse(IOUtils.toString(a2, Charsets.UTF_8)).getAsJsonObject();
            object = Maa.J((JsonObject)object2, (String)ZOa.X);
            String string2 = Maa.J((JsonObject)object2, (String)aSa.J);
            JsonArray jsonArray3 = Maa.J((JsonObject)object2, (String)hQa.n, (JsonArray)null);
            if (jsonArray3 != null) {
                Iterator<JsonElement> iterator;
                int n2 = uSa.E;
                Iterator<JsonElement> iterator2 = iterator = jsonArray3.iterator();
                while (iterator2.hasNext()) {
                    c222 = iterator.next();
                    try {
                        fIa_2.f((JsonElement)((Object)c222));
                    }
                    catch (Exception exception) {
                        Eha eha2;
                        Eha eha3 = eha2 = Eha.func_151379_a((Exception)exception);
                        eha3.func_151380_a(UTa.i + n2 + XOa.D);
                        throw eha3;
                    }
                    ++n2;
                    iterator2 = iterator;
                }
            }
            if ((jsonArray2 = Maa.J((JsonObject)object2, (String)sra.n, (JsonArray)null)) != null) {
                int n3 = uSa.E;
                JsonArray jsonArray4 = jsonArray2;
                fIa_2.f = Lists.newArrayListWithCapacity(jsonArray2.size());
                fIa_2.A = Lists.newArrayListWithCapacity(jsonArray4.size());
                Iterator<JsonElement> iterator = c222 = jsonArray4.iterator();
                while (iterator.hasNext()) {
                    JsonElement object32 = c222.next();
                    try {
                        fIa_2.A.add(Maa.J((JsonElement)object32, (String)aSa.n));
                    }
                    catch (Exception exception) {
                        jsonArray3 = Eha.func_151379_a((Exception)exception);
                        jsonArray3.func_151380_a(new StringBuilder().insert(3 >> 2, Eqa.r).append(n3).append(XOa.D).toString());
                        throw jsonArray3;
                    }
                    ++n3;
                    iterator = c222;
                }
            } else {
                fIa_2.f = null;
                fIa_2.A = null;
            }
            if ((jsonArray = Maa.J((JsonObject)object2, (String)Fua.a, (JsonArray)null)) != null) {
                Iterator<JsonElement> iterator;
                int c222 = uSa.E;
                Iterator<JsonElement> iterator3 = iterator = jsonArray.iterator();
                while (iterator3.hasNext()) {
                    JsonElement jsonElement = iterator.next();
                    try {
                        fIa_2.J(jsonElement);
                    }
                    catch (Exception exception) {
                        Eha eha4 = Eha.func_151379_a((Exception)exception);
                        eha4.func_151380_a(new StringBuilder().insert(5 >> 3, Gua.ca).append(c222).append(XOa.D).toString());
                        throw eha4;
                    }
                    ++c222;
                    iterator3 = iterator;
                }
            }
            fIa_2.l = fGa.J((JsonObject)Maa.J((JsonObject)object2, (String)csa.G, (JsonObject)null));
            FIa_2 fIa_22 = fIa_2;
            fIa_2.J = Maa.J((JsonObject)object2, (String)aQa.Y, vRa.d != 0);
            fIa_22.m = VGa.J((U)b2, KIa.VERTEX, (String)object);
            fIa_22.k = VGa.J((U)b2, KIa.FRAGMENT, string2);
            fIa_2.I = pIa.J().J();
            FIa_2 fIa_23 = fIa_2;
            pIa.J().J((FIa)fIa_23);
            fIa_23.d();
            if (fIa_2.A != null) {
                for (String string3 : fIa_2.A) {
                    FIa_2 fIa_24 = fIa_2;
                    int n2 = nka.f((int)fIa_24.I, (CharSequence)string3);
                    fIa_24.f.add(n2);
                }
            }
        }
        catch (Exception exception) {
            object = Eha.func_151379_a((Exception)exception);
            object.func_151381_b(resourceLocation.J());
            throw object;
        }
        finally {
            IOUtils.closeQuietly(a2);
        }
        fIa_2.l();
    }

    public void f() {
        Object object;
        int a2;
        FIa_2 fIa_2;
        FIa_2 fIa_22 = fIa_2 = this;
        fIa_22.M = uSa.E;
        i = fIa_22;
        fIa_22.l.J();
        if (fIa_22.I != D) {
            FIa_2 fIa_23 = fIa_2;
            nka.f((int)fIa_23.I);
            D = fIa_23.I;
        }
        if (fIa_2.J) {
            uKa.h();
        } else {
            uKa.m();
        }
        int n2 = a2 = uSa.E;
        while (n2 < fIa_2.a.size()) {
            FIa_2 fIa_24 = fIa_2;
            if (fIa_24.g.get(fIa_24.j.get(a2)) != null) {
                int n3;
                uKa.i((int)(nka.v + a2));
                uKa.H();
                FIa_2 fIa_25 = fIa_2;
                object = fIa_25.g.get(fIa_25.j.get(a2));
                int n4 = pua.o;
                if (object instanceof gHa) {
                    n3 = n4 = ((gHa)object).i;
                } else {
                    Object object2 = object;
                    if (object instanceof H) {
                        n3 = n4 = ((H)object2).J();
                    } else {
                        if (object2 instanceof Integer) {
                            n4 = (Integer)object;
                        }
                        n3 = n4;
                    }
                }
                if (n3 != pua.o) {
                    uKa.C((int)n4);
                    FIa_2 fIa_26 = fIa_2;
                    nka.C((int)nka.J((int)fIa_26.I, (CharSequence)fIa_26.j.get(a2)), (int)a2);
                }
            }
            n2 = ++a2;
        }
        Iterator<pha> iterator = a2 = fIa_2.b.iterator();
        while (iterator.hasNext()) {
            object = a2.next();
            iterator = a2;
            object.f();
        }
    }

    private void J(JsonElement jsonElement) throws Eha {
        FIa_2 fIa_2;
        JsonElement jsonElement2;
        Iterator<JsonElement> iterator;
        String a2;
        FIa_2 fIa_22 = this;
        JsonObject jsonObject = Maa.J((JsonElement)((Object)a2), (String)opa.Q);
        a2 = Maa.J((JsonObject)jsonObject, (String)dua.T);
        int n2 = pha.J((String)Maa.J((JsonObject)jsonObject, (String)Zpa.x));
        int n3 = Maa.J((JsonObject)jsonObject, (String)jpa.ja);
        Object b2 = new float[Math.max(n3, ERa.C)];
        JsonArray jsonArray = Maa.J((JsonObject)jsonObject, (String)Pqa.F);
        if (jsonArray.size() != n3 && jsonArray.size() > vRa.d) {
            throw new Eha(new StringBuilder().insert(3 ^ 3, PRa.Fa).append(n3).append(Nra.Q).append(jsonArray.size()).append(hpa.b).toString());
        }
        int n4 = uSa.E;
        Iterator<JsonElement> iterator2 = iterator = jsonArray.iterator();
        while (iterator2.hasNext()) {
            jsonElement2 = iterator.next();
            try {
                b2[n4] = Maa.J((JsonElement)jsonElement2, (String)wPa.O);
            }
            catch (Exception exception) {
                Eha eha2;
                Eha eha3 = eha2 = Eha.func_151379_a((Exception)exception);
                eha3.func_151380_a(yOa.t + n4 + XOa.D);
                throw eha3;
            }
            ++n4;
            iterator2 = iterator;
        }
        if (n3 > vRa.d && jsonArray.size() == vRa.d) {
            int n5 = n4;
            while (n5 < n3) {
                Object object = b2;
                object[++n4] = object[uSa.E];
                n5 = n4;
            }
        }
        int n6 = n3 > vRa.d && n3 <= AQa.P && n2 < Yqa.i ? n3 - vRa.d : uSa.E;
        jsonElement2 = new pha(a2, n2 + n6, n3, (FIa)fIa_22);
        if (n2 <= yRa.d) {
            fIa_2 = fIa_22;
            jsonElement2.J((int)b2[uSa.E], (int)b2[vRa.d], (int)b2[uqa.g], (int)b2[yRa.d]);
        } else if (n2 <= XTa.W) {
            fIa_2 = fIa_22;
            jsonElement2.J((float)b2[uSa.E], (float)b2[vRa.d], (float)b2[uqa.g], (float)b2[yRa.d]);
        } else {
            jsonElement2.J((float[])b2);
            fIa_2 = fIa_22;
        }
        fIa_2.b.add((pha)jsonElement2);
    }

    public void J() {
        int a2;
        FIa_2 fIa_2 = this;
        nka.f((int)uSa.E);
        D = pua.o;
        i = null;
        F = vRa.d;
        int n2 = a2 = uSa.E;
        while (n2 < fIa_2.a.size()) {
            FIa_2 fIa_22 = fIa_2;
            if (fIa_22.g.get(fIa_22.j.get(a2)) != null) {
                uKa.i((int)(nka.v + a2));
                uKa.C((int)uSa.E);
            }
            n2 = ++a2;
        }
    }

    public pha J(String string) {
        String b2 = string;
        FIa_2 a2 = this;
        if (a2.G.containsKey(b2)) {
            return a2.G.get(b2);
        }
        return null;
    }

    public int J() {
        FIa_2 a2;
        return a2.I;
    }

    static {
        E = new aha();
        i = null;
        D = pua.o;
        F = vRa.d;
    }

    public VGa J() {
        FIa_2 a2;
        return a2.k;
    }
}

