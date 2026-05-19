/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ak
 *  Uk
 *  vRa
 *  wk
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class vK_2
extends Ak {
    public t A;
    public boolean I;

    public Ak J() {
        vK_2 a2;
        a2.I = vRa.d;
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public vK_2(Uk uk2, t t2) {
        void b2;
        Object c2 = t2;
        vK_2 a2 = this;
        super((Uk)b2);
        a2.A = c2;
    }

    public JsonElement J() {
        vK_2 a2;
        if (a2.A instanceof wk) {
            return new JsonPrimitive(a2.A.J().J());
        }
        return super.J();
    }

    public String toString() {
        vK_2 a2;
        return (a2.I ? rSa.N : Mqa.y) + a2.A.toString();
    }

    public double J() {
        vK_2 a2;
        return a2.A.J().J();
    }
}

