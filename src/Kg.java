/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bpa
 *  NOa
 *  TQa
 *  nQa
 *  vRa
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import optifine.Config;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Kg {
    private static final Splitter A = Splitter.on((char)tua.w).limit(uqa.g);
    private static final Pattern I = Pattern.compile(Bpa.d);

    /*
     * WARNING - void declaration
     */
    public static String J(String string, String string2) {
        void a2;
        String string3 = string;
        String b2 = oha.J(string3, new Object[uSa.E]);
        if (b2 != null && !b2.equals(string3)) {
            return b2;
        }
        return a2;
    }

    public static String J(String a2) {
        return oha.J(a2, new Object[uSa.E]);
    }

    /*
     * WARNING - void declaration
     */
    private static void J(IResourcePack iResourcePack, String[] stringArray, Map map) {
        IResourcePack iResourcePack2 = iResourcePack;
        try {
            void b2;
            for (int i2 = uSa.E; i2 < ((void)b2).length; ++i2) {
                void a2;
                Object c2 = b2[i2];
                if (!iResourcePack2.J((ResourceLocation)(c2 = new ResourceLocation((String)c2))) || (c2 = iResourcePack2.J((ResourceLocation)c2)) == null) continue;
                Kg.J((InputStream)c2, (Map)a2);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static String d() {
        return oha.J(Bra.K, new Object[uSa.E]);
    }

    public Kg() {
        Kg a2;
    }

    public static void J() {
        int n2;
        Map map = oha.J();
        String[] stringArray = new ArrayList();
        IResourcePack[] iResourcePackArray = fta.t;
        String string = NOa.h;
        String string2 = ppa.fa;
        String[] stringArray2 = stringArray;
        stringArray.add((String)iResourcePackArray + string + string2);
        if (!Config.J().pb.equals(string)) {
            stringArray.add(new StringBuilder().insert(5 >> 3, (String)iResourcePackArray).append(Config.J().pb).append(string2).toString());
        }
        stringArray = stringArray.toArray(new String[stringArray.size()]);
        Kg.J(Config.J(), stringArray, map);
        iResourcePackArray = Config.J();
        int n3 = n2 = uSa.E;
        while (n3 < iResourcePackArray.length) {
            IResourcePack iResourcePack = iResourcePackArray[n2];
            Kg.J(iResourcePack, stringArray, map);
            n3 = ++n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static void J(InputStream inputStream, Map map) throws IOException {
        InputStream inputStream2 = inputStream;
        for (String b2 : IOUtils.readLines(inputStream2, Charsets.UTF_8)) {
            void a2;
            if (b2.isEmpty() || b2.charAt(uSa.E) == TQa.ca || (b2 = Iterables.toArray(A.split(b2), String.class)) == null || b2.length != uqa.g) continue;
            String string = b2[uSa.E];
            b2 = I.matcher(b2[vRa.d]).replaceAll(nQa.G);
            a2.put(string, b2);
        }
    }

    public static String C() {
        return oha.J(SPa.A, new Object[uSa.E]);
    }

    public static String l() {
        return oha.J(ppa.H, new Object[uSa.E]);
    }

    public static String f() {
        return oha.J(tSa.Ha, new Object[uSa.E]);
    }

    public static String J() {
        return oha.J(LRa.X, new Object[uSa.E]);
    }
}

