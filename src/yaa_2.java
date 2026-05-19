/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jba
 *  pua
 *  vRa
 */
import java.util.Comparator;

public final class yaa_2
implements Comparator<jba> {
    /*
     * WARNING - void declaration
     */
    public int J(jba jba2, jba jba3) {
        void b2;
        yaa_2 c2 = jba3;
        yaa_2 a2 = this;
        if (b2.J() > c2.J()) {
            return vRa.d;
        }
        if (b2.J() < c2.J()) {
            return pua.o;
        }
        return c2.J().compareToIgnoreCase(b2.J());
    }

    public yaa_2() {
        yaa_2 a2;
    }
}

