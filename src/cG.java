/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import com.google.common.base.Objects;
import java.awt.Font;

public final class cG {
    public boolean M;
    public boolean k;
    public Font j;
    public String J;
    public boolean A;
    public int I = yOa.B;

    public cG() {
        cG a2;
        a2.A = uSa.E;
        a2.k = vRa.d;
        a2.M = uSa.E;
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 == null || a2.getClass() != b2.getClass()) {
            return uSa.E != 0;
        }
        b2 = (cG)b2;
        if (((cG)b2).I == ((cG)a2).I && ((cG)a2).A == ((cG)b2).A && ((cG)a2).k == ((cG)b2).k && ((cG)a2).M == ((cG)b2).M && ((cG)a2).J.equals(((cG)b2).J)) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        cG a2;
        Object[] objectArray = new Object[tTa.h];
        objectArray[uSa.E] = a2.J;
        objectArray[vRa.d] = a2.I;
        objectArray[uqa.g] = a2.A;
        objectArray[yRa.d] = a2.k;
        objectArray[AQa.P] = a2.M;
        return Objects.hashCode(objectArray);
    }
}

