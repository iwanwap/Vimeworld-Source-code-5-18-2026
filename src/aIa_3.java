/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Epa
 *  Maa
 *  WSa
 *  mra
 *  oqa
 *  vRa
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class aIa_3 {
    private static final Logger A = LogManager.getLogger();
    private final Map<String, File> I;

    public Map<String, File> J() {
        aIa_3 a2;
        return a2.I;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public aIa_3(File file, String string) {
        BufferedReader a2;
        aIa_3 aIa_32 = this;
        aIa_32.I = Maps.newHashMap();
        if (a2 != null) {
            File b2;
            File file2 = new File(b2, oqa.y);
            b2 = new File(b2, mra.w + (String)((Object)a2) + Epa.k);
            a2 = null;
            try {
                a2 = Files.newReader(b2, Charsets.UTF_8);
                JsonObject jsonObject = Maa.J((JsonObject)new JsonParser().parse(a2).getAsJsonObject(), (String)oqa.y, (JsonObject)null);
                if (jsonObject != null) {
                    for (Map.Entry c4222 : jsonObject.entrySet()) {
                        JsonObject jsonObject2 = (JsonObject)c4222.getValue();
                        String[] c4222 = ((String)c4222.getKey()).split(WSa.f, uqa.g);
                        String string2 = c4222.length == vRa.d ? c4222[uSa.E] : new StringBuilder().insert(3 >> 2, c4222[uSa.E]).append(Era.Aa).append(c4222[vRa.d]).toString();
                        String c4222 = Maa.J((JsonObject)jsonObject2, (String)BQa.Ma);
                        File c4222 = new File(file2, new StringBuilder().insert(3 >> 2, c4222.substring(uSa.E, uqa.g)).append(WSa.f).append(c4222).toString());
                        aIa_32.I.put(string2, c4222);
                    }
                }
                return;
            }
            catch (JsonParseException jsonParseException) {
                A.error(new StringBuilder().insert(3 ^ 3, XOa.l).append(b2).toString());
                return;
            }
            catch (FileNotFoundException fileNotFoundException) {
                A.error(new StringBuilder().insert(3 & 4, yRa.B).append(b2).toString());
                return;
            }
            finally {
                IOUtils.closeQuietly(a2);
            }
        }
    }
}

