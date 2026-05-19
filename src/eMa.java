/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  vRa
 */
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;

public final class eMa
implements Predicate<String> {
    public final /* synthetic */ ZLa I;

    public boolean J(String string) {
        Object b2 = string;
        eMa a2 = this;
        Object object = b2;
        b2 = Floats.tryParse((String)object);
        if (((String)object).length() == 0 || b2 != null && Floats.isFinite(((Float)b2).floatValue()) && ((Float)b2).floatValue() >= JPa.N) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public eMa(ZLa zLa) {
        Object b2 = zLa;
        eMa a2 = this;
        a2.I = b2;
    }
}

