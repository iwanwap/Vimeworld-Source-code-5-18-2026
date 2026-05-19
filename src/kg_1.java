/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  FTa
 *  ISa
 *  JPa
 *  Qqa
 *  aQa
 *  pua
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import net.minecraft.util.ResourceLocation;
import optifine.Config;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class kg_1 {
    /*
     * WARNING - void declaration
     */
    public static void J(Properties properties, float[] fArray) {
        Properties properties2 = properties;
        for (Object b22 : properties2.keySet()) {
            float f2;
            void a2;
            int n2;
            String string;
            if (!((String)b22).startsWith(string = FTa.la) || (n2 = Config.J(((String)b22).substring(string.length()), pua.o)) < 0 || n2 >= ((void)a2).length) continue;
            float b22 = Config.J(properties2.getProperty((String)b22), vqa.T);
            if (!(f2 >= JPa.N)) continue;
            a2[n2] = b22;
        }
    }

    public static Properties J(ResourceLocation resourceLocation) {
        InputStream inputStream;
        Properties properties;
        String string;
        block5: {
            ResourceLocation resourceLocation2 = resourceLocation;
            string = resourceLocation2.J();
            properties = new Properties();
            Object a2 = KPa.C;
            if (!string.endsWith((String)a2)) {
                return properties;
            }
            String string2 = string;
            string = new StringBuilder().insert(3 >> 2, string2.substring(uSa.E, string2.length() - ((String)a2).length())).append(Jpa.R).toString();
            a2 = new ResourceLocation(resourceLocation2.f(), string);
            inputStream = Config.J(Config.J(), (ResourceLocation)a2);
            if (inputStream != null) break block5;
            return properties;
        }
        try {
            Config.e(new StringBuilder().insert(3 >> 2, ISa.ja).append(string).toString());
            properties.load(inputStream);
            return properties;
        }
        catch (FileNotFoundException a2) {
            return properties;
        }
        catch (IOException a2) {
            a2.printStackTrace();
            return properties;
        }
    }

    public kg_1() {
        kg_1 a2;
    }

    public static ResourceLocation J(ResourceLocation resourceLocation) {
        ResourceLocation resourceLocation2 = resourceLocation;
        if (!Config.Aa()) {
            return resourceLocation2;
        }
        if (resourceLocation2 == null) {
            return resourceLocation2;
        }
        Object a2 = resourceLocation2.J();
        String string = Qqa.N;
        String string2 = ITa.T;
        if (!((String)a2).startsWith(string)) {
            return resourceLocation2;
        }
        a2 = ((String)a2).substring(string.length());
        a2 = new StringBuilder().insert(2 & 5, string2).append((String)a2).toString();
        a2 = new ResourceLocation(resourceLocation2.f(), (String)a2);
        if (Config.J(Config.J(), (ResourceLocation)a2)) {
            return a2;
        }
        return resourceLocation2;
    }

    /*
     * WARNING - void declaration
     */
    public static float J(Properties properties, String string, float f2) {
        void a2;
        void b2;
        Properties properties2 = properties;
        String c2 = properties2.getProperty((String)b2);
        if (c2 == null) {
            return (float)a2;
        }
        float f3 = Config.J(c2, CRa.V);
        if (f3 == CRa.V) {
            Config.J(new StringBuilder().insert(2 & 5, aQa.E).append((String)b2).append(Xpa.E).append(c2).toString());
            return (float)a2;
        }
        return f3;
    }
}

