/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Be
 *  Cra
 *  Jja
 *  Kpa
 *  MQa
 *  kta
 *  vRa
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import ru.vimeworld.configuration.ConfigurationService;
import ru.vimeworld.configuration.impl.EmojisConfiguration;
import ru.vimeworld.minidot.atlas.emoji.Emoji;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Sf_2 {
    private static String i;
    public static char M;
    public static boolean k;
    private static final Map<String, String> j;
    private static final Gson J;
    private static final Map<ResourceLocation, DF> A;
    private static final Map<Character, He> I;

    public Sf_2() {
        Sf_2 a2;
    }

    public static Map<String, String> f() {
        return j;
    }

    public static String J(String string) {
        int n2;
        String string2 = string;
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string2.toCharArray();
        int n3 = cArray.length;
        int n4 = n2 = uSa.E;
        while (n4 < n3) {
            char a2 = cArray[n2];
            if (Sf_2.J(a2)) {
                if (Sf_2.J().contains(a2 + Mqa.y)) {
                    stringBuilder.append(a2);
                }
            } else {
                stringBuilder.append(a2);
            }
            n4 = ++n2;
        }
        return stringBuilder.toString();
    }

    public static He J(char a2) {
        return I.get(Character.valueOf(a2));
    }

    static {
        I = new LinkedHashMap<Character, He>();
        A = new LinkedHashMap<ResourceLocation, DF>();
        J = new GsonBuilder().setPrettyPrinting().create();
        k = Objects.equals(System.getProperty(tTa.j), MQa.R);
        M = (char)LPa.l;
        j = new HashMap<String, String>();
        i = Mqa.y;
    }

    public static void J() {
        EmojisConfiguration emojisConfiguration = ConfigurationService.J(EmojisConfiguration.class);
        for (String object : emojisConfiguration.J()) {
            try {
                Sf_2.J(object);
            }
            catch (Exception exception) {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = object;
                objectArray[vRa.d] = exception;
                LogManager.getLogger(SPa.k).log(Level.ERROR, kta.W, objectArray);
            }
        }
        Iterator<Object> iterator = emojisConfiguration.J().entrySet().iterator();
        Iterator<Object> iterator2 = iterator;
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            String string = j.get(entry.getKey());
            if (string == null) {
                string = Mqa.y;
            }
            Set set = ((List)entry.getValue()).stream().map(Be.J()).collect(Collectors.toSet());
            j.put((String)entry.getKey(), new StringBuilder().insert(2 & 5, string).append(String.join((CharSequence)Mqa.y, set)).toString());
            iterator2 = iterator;
        }
    }

    public static boolean J(He a2) {
        if (I.containsKey(Character.valueOf(M))) {
            return uSa.E != 0;
        }
        I.put(Character.valueOf(M), a2);
        M = (char)(M + vRa.d);
        return vRa.d != 0;
    }

    public static /* synthetic */ String J(Emoji a2) {
        return String.valueOf(a2.J());
    }

    public static DF J(ResourceLocation a2) {
        return A.get(a2);
    }

    public static String J() {
        if (i.isEmpty()) {
            Iterator<String> iterator;
            StringBuilder stringBuilder = new StringBuilder();
            Iterator<String> iterator2 = iterator = j.values().iterator();
            while (iterator2.hasNext()) {
                String string = iterator.next();
                iterator2 = iterator;
                stringBuilder.append(string);
            }
            i = stringBuilder.toString();
        }
        return i;
    }

    public static boolean J(ResourceLocation a2) {
        if (A.remove(a2) != null) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Gson J() {
        return J;
    }

    public static void J(String string) {
        String string2 = string;
        ResourceLocation resourceLocation = new ResourceLocation(Cra.V, new StringBuilder().insert(3 >> 2, eta.Aa).append(string2).append(KPa.C).toString());
        if (A.containsKey(resourceLocation)) {
            return;
        }
        DF a2 = new DF(resourceLocation);
        Kpa.J().J().J(a2.J(), (H)new Jja(a2.J()));
        A.put(resourceLocation, a2);
    }

    public static boolean J(char c2) {
        char c3 = c2;
        Character.UnicodeBlock a2 = Character.UnicodeBlock.of(c3);
        if (a2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || a2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || a2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || a2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C || a2 == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D || a2 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || a2 == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public static Map<Character, He> J() {
        return I;
    }

    public static Collection<DF> J() {
        return A.values();
    }
}

