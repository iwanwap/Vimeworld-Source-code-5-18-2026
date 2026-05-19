/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  US
 *  Zpa
 *  eC
 *  vRa
 *  wPa
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class US_3
implements eC<String> {
    private final String name;
    private List<String> availableOptions;
    private final String lowName;
    private String value;

    public String C() {
        US_3 a2;
        return a2.value;
    }

    /*
     * WARNING - void declaration
     */
    public US_3(String string, String string2, String string3, String[] stringArray) {
        void b2;
        String[] e2;
        void c2;
        void d2;
        String[] stringArray2 = stringArray3;
        String[] stringArray3 = stringArray;
        String[] a2 = stringArray2;
        a2.value = Mqa.y;
        String[] stringArray4 = a2;
        a2.availableOptions = new ArrayList<String>();
        a2.name = d2;
        a2.lowName = c2;
        a2.J(e2);
        a2.J((String)b2);
    }

    /*
     * WARNING - void declaration
     */
    public US_3(String string, String string2, String string3) {
        void b2;
        void c2;
        US_3 a2;
        String d2 = string3;
        US_3 uS_3 = a2 = this;
        US_3 uS_32 = a2;
        uS_32.value = Mqa.y;
        US_3 uS_33 = a2;
        uS_32.availableOptions = new ArrayList<String>();
        uS_32.name = c2;
        uS_3.value = d2;
        uS_3.lowName = b2;
    }

    public JsonElement serialize() {
        US_3 a2;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(dua.T, a2.name);
        jsonObject.addProperty(Zpa.x, AQa.r);
        jsonObject.addProperty(wPa.O, a2.value);
        return jsonObject;
    }

    public String J() {
        US_3 a2;
        return a2.lowName;
    }

    public String f() {
        US_3 a2;
        return a2.name;
    }

    public String l() {
        US_3 uS_3;
        US_3 uS_32 = uS_3 = this;
        int a2 = uS_32.availableOptions.indexOf(uS_32.value) + vRa.d;
        if (a2 >= uS_3.availableOptions.size()) {
            a2 = uSa.E;
        }
        US_3 uS_33 = uS_3;
        uS_33.J(uS_33.availableOptions.get(a2));
        return uS_3.value;
    }

    public US J(String string) {
        String b2 = string;
        US_3 a2 = this;
        if (a2.value.isEmpty()) {
            a2.value = b2;
        }
        US_3 uS_3 = a2;
        uS_3.availableOptions.add(b2);
        return uS_3;
    }

    /*
     * WARNING - void declaration
     */
    public US J(String ... stringArray) {
        int b2;
        void a2;
        US_3 uS_3 = this;
        int n2 = ((void)a2).length;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            void var4_5 = a2[b2];
            uS_3.J((String)var4_5);
            n3 = ++b2;
        }
        return uS_3;
    }

    public eC<String> clone() {
        US_3 a2;
        US_3 uS_3 = a2;
        US_3 uS_32 = new US_3(uS_3.name, uS_3.lowName, a2.value);
        uS_32.availableOptions.addAll(a2.availableOptions);
        return uS_32;
    }

    public void J(String string) {
        Object b2 = string;
        US_3 a2 = this;
        if (b2 == null) {
            b2 = Mqa.y;
        }
        if (!a2.availableOptions.contains(b2)) {
            b2 = a2.availableOptions.get(uSa.E);
        }
        a2.value = b2;
    }
}

