/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Rx
 *  Ypa
 *  kPa
 *  vRa
 */
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Wx {
    private static SecureRandom I;

    public Wx() {
        Wx a2;
    }

    /*
     * WARNING - void declaration
     */
    public static void J(boolean bl, Runnable runnable, Runnable runnable2) {
        int n2;
        boolean bl2 = bl;
        List c2 = Collections.emptyList();
        int n3 = uSa.E;
        if (bl2) {
            void b2;
            ++n3;
            if (b2 != null) {
                b2.run();
                ++n3;
                c2.isEmpty();
                ++n3;
            }
            n2 = ++n3;
        } else {
            void a2;
            c2.size();
            ++n3;
            if (a2 != null) {
                a2.run();
                ++n3;
                c2.isEmpty();
                ++n3;
            }
            n2 = ++n3;
            c2.size();
        }
        if (n2 != uqa.g && n3 != AQa.P) {
            throw new RuntimeException(TOa.Aa);
        }
        c2.isEmpty();
    }

    public static synchronized SecureRandom J() {
        if (I == null) {
            byte[] byArray = new byte[uua.p];
            Object[] objectArray = new Object[vRa.d];
            objectArray[uSa.E] = byArray;
            Rx.J((Object)Rx.J((Class)Rx.J((String)Ypa.m), (Object[])new Object[uSa.E]), (String)kPa.D, (Object[])objectArray);
            if (Arrays.equals(byArray, new byte[byArray.length])) {
                byArray = SecureRandom.getSeed(kTa.j);
            }
            I = new SecureRandom(byArray);
        }
        return I;
    }
}

