/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LE
 *  LQa
 *  Yra
 *  cg
 *  dF
 *  gA
 *  pua
 *  uQa
 *  vRa
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import optifine.Config;
import shadersmod.client.IShaderPack;

public final class AC {
    private static gA[][] I = null;

    /*
     * WARNING - void declaration
     */
    public static int J(int n2, int n3) {
        int n4 = n2;
        if (I == null) {
            return n4;
        }
        if (n4 >= 0 && n4 < I.length) {
            int b2;
            gA[] gAArray = I[n4];
            if (gAArray == null) {
                return n4;
            }
            int n5 = b2 = uSa.E;
            while (n5 < gAArray.length) {
                void a2;
                gA gA2 = gAArray[b2];
                if (gA2.J(n4, (int)a2)) {
                    return gA2.J();
                }
                n5 = ++b2;
            }
            return n4;
        }
        return n4;
    }

    public static void J() {
        I = null;
    }

    public AC() {
        AC a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void J(IShaderPack iShaderPack) {
        IShaderPack iShaderPack2 = iShaderPack;
        AC.J();
        String string = uQa.q;
        try {
            dF dF2;
            InputStream inputStream = iShaderPack2.J(string);
            if (inputStream == null) {
                return;
            }
            dF dF3 = dF2 = new dF();
            dF3.load(inputStream);
            inputStream.close();
            Config.f(new StringBuilder().insert(5 >> 3, Yra.Ga).append(string).toString());
            ArrayList<List<gA>> arrayList = new ArrayList<List<gA>>();
            LE lE2 = new LE(nOa.I);
            for (Object a2 : dF3.keySet()) {
                String string2 = dF2.getProperty((String)a2);
                String string3 = BQa.Aa;
                if (!((String)a2).startsWith(string3)) {
                    Config.J(new StringBuilder().insert(3 >> 2, POa.fa).append((String)a2).toString());
                    continue;
                }
                int n2 = Config.J(cg.l((String)a2, (String)string3), pua.o);
                if (n2 < 0) {
                    Config.J(new StringBuilder().insert(3 & 4, POa.fa).append((String)a2).toString());
                    continue;
                }
                ze[] zeArray = lE2.f(string2);
                if (zeArray != null && zeArray.length >= vRa.d) {
                    gA gA2 = new gA(n2, zeArray);
                    AC.J(arrayList, gA2);
                    continue;
                }
                Config.J(new StringBuilder().insert(2 & 5, LQa.I).append((String)a2).append(vTa.S).append(string2).toString());
            }
            if (arrayList.size() <= 0) {
                return;
            }
            I = AC.J(arrayList);
            return;
        }
        catch (IOException iOException) {
            Config.J(new StringBuilder().insert(2 & 5, Fsa.r).append(string).toString());
            return;
        }
    }

    private static gA[][] J(List<List<gA>> list) {
        int a2;
        List<List<gA>> list2 = list;
        gA[][] gAArrayArray = new gA[list2.size()][];
        int n2 = a2 = uSa.E;
        while (n2 < gAArrayArray.length) {
            List<gA> list3 = list2.get(a2);
            if (list3 != null) {
                List<gA> list4 = list3;
                gAArrayArray[a2] = list4.toArray(new gA[list4.size()]);
            }
            n2 = ++a2;
        }
        return gAArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    private static void J(List<List<gA>> list, gA gA2) {
        int n2;
        void a2;
        List<List<gA>> list2 = list;
        int[] nArray = a2.J();
        int n3 = n2 = uSa.E;
        while (n3 < nArray.length) {
            int b2;
            int n4 = nArray[n2];
            while (n4 >= list2.size()) {
                n4 = b2;
                list2.add(null);
            }
            List<gA> list3 = list2.get(b2);
            if (list3 == null) {
                list3 = new ArrayList<gA>();
                list2.set(b2, list3);
            }
            list3.add((gA)a2);
            n3 = ++n2;
        }
    }
}

