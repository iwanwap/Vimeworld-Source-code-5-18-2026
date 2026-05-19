/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QSa
 *  aSa
 *  eC
 *  nQa
 *  oqa
 *  wPa
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class lu
implements eC<Double> {
    private double value;
    private double max;
    private double min;
    private final String name;
    private final String lowName;

    private double J(double a2) {
        lu b2;
        if (b2.min == aSa.V && b2.max == aSa.V) {
            return a2;
        }
        return Math.max(b2.min, Math.min(a2, b2.max));
    }

    public String J() {
        lu a2;
        return a2.lowName;
    }

    public eC<Double> clone() {
        lu a2;
        lu lu2 = a2;
        return new lu(lu2.name, lu2.lowName, a2.value, a2.min, a2.max);
    }

    public JsonElement serialize() {
        lu a2;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(wPa.O, a2.value);
        return jsonObject;
    }

    public lu f(double a2) {
        lu b2;
        lu lu2 = b2;
        lu2.max = a2;
        lu2.value = lu2.J(lu2.value);
        return lu2;
    }

    public String f() {
        lu a2;
        return a2.name;
    }

    public void J(Double d2) {
        Double b2 = d2;
        lu a2 = this;
        a2.value = a2.J((double)b2);
    }

    public Double J() {
        lu a2;
        return a2.value;
    }

    public double f() {
        lu a2;
        return a2.max;
    }

    public lu J(double a2) {
        lu b2;
        lu lu2 = b2;
        lu2.min = a2;
        lu2.value = lu2.J(lu2.value);
        return lu2;
    }

    public double J() {
        lu a2;
        return a2.min;
    }

    /*
     * WARNING - void declaration
     */
    public lu(String string, String string2, double d2, double d3, double d4) {
        void a2;
        void b2;
        void c2;
        void e2;
        lu d5;
        String f2 = string2;
        lu lu2 = d5 = this;
        lu lu3 = d5;
        d5.name = e2;
        lu3.lowName = f2;
        lu3.value = c2;
        lu2.min = b2;
        lu2.max = a2;
    }

    public String toString() {
        lu a2;
        return new StringBuilder().insert(2 & 5, Yqa.T).append(a2.name).append((char)CRa.L).append(QSa.k).append(a2.lowName).append((char)CRa.L).append(NSa.O).append(a2.value).append(nQa.b).append(a2.min).append(oqa.t).append(a2.max).append((char)ySa.Z).toString();
    }
}

