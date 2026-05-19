/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bpa
 *  haa
 */
import com.google.gson.JsonObject;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class raa_2
extends haa<String> {
    public raa_2(JsonObject jsonObject) {
        Object b2 = jsonObject;
        raa_2 a2 = this;
        super((Object)raa_2.J((JsonObject)b2), (JsonObject)b2);
    }

    public raa_2(String string) {
        Object b2 = string;
        raa_2 a2 = this;
        a2((String)b2, null, null, null, null);
    }

    public void J(JsonObject jsonObject) {
        JsonObject b2 = jsonObject;
        Object a2 = this;
        if (a2.J() != null) {
            b2.addProperty(bpa.Fa, (String)a2.J());
            super.J(b2);
        }
    }

    private static String J(JsonObject a2) {
        if (a2.has(bpa.Fa)) {
            return a2.get(bpa.Fa).getAsString();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public raa_2(String string, Date date, String string2, Date date2, String string3) {
        Object f2;
        void b2;
        void c2;
        void d2;
        void e2;
        raa_2 raa_22 = object;
        Object object = string3;
        raa_2 a2 = raa_22;
        super((Object)e2, (Date)d2, (String)c2, (Date)b2, (String)f2);
    }
}

