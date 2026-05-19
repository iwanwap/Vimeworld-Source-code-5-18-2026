/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  foa
 *  vRa
 */
import com.google.common.base.Predicate;
import java.net.IDN;

public final class doa_3
implements Predicate<String> {
    public final /* synthetic */ foa I;

    public doa_3(foa foa2) {
        doa_3 b2 = foa2;
        doa_3 a2 = this;
        a2.I = b2;
    }

    public boolean J(String string) {
        String[] b2 = string;
        doa_3 a2 = this;
        if (b2.length() == 0) {
            return vRa.d != 0;
        }
        if ((b2 = b2.split(Era.Aa)).length == 0) {
            return vRa.d != 0;
        }
        try {
            IDN.toASCII(b2[uSa.E]);
            return vRa.d != 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return uSa.E != 0;
        }
    }
}

