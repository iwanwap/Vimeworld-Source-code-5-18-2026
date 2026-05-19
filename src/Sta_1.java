/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cra
 *  Lra
 *  Spa
 *  XTa
 *  hra
 *  vRa
 *  vpa
 */
import java.util.Arrays;
import net.minecraft.client.main.Main;

public final class Sta_1 {
    public static void main(String[] a2) {
        String[] stringArray = new String[Yqa.i];
        stringArray[uSa.E] = Fua.K;
        stringArray[vRa.d] = hra.D;
        stringArray[uqa.g] = vua.q;
        stringArray[yRa.d] = vpa.r;
        stringArray[AQa.P] = Cra.x;
        stringArray[tTa.h] = Lra.c;
        stringArray[uua.p] = hQa.L;
        stringArray[XTa.W] = Spa.T;
        Main.main(Sta_1.J(stringArray, a2));
    }

    /*
     * WARNING - void declaration
     */
    public static <T> T[] J(T[] TArray, T[] TArray2) {
        void a2;
        T[] TArray3 = TArray;
        T[] b2 = Arrays.copyOf(TArray3, TArray3.length + ((void)a2).length);
        System.arraycopy(a2, uSa.E, b2, TArray3.length, ((void)a2).length);
        return b2;
    }

    public Sta_1() {
        Sta_1 a2;
    }
}

