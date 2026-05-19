/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  RIa
 *  YSa
 *  aqa
 */
import java.util.concurrent.Callable;

public final class oga_3
implements Callable {
    public final /* synthetic */ RIa A;
    private static final String I = "CL_00001302";

    public String J() {
        Runtime runtime = Runtime.getRuntime();
        long l2 = runtime.maxMemory();
        long l3 = runtime.totalMemory();
        long l4 = runtime.freeMemory();
        long l5 = l2 / yRa.H / yRa.H;
        long l6 = l3 / yRa.H / yRa.H;
        long l7 = l4 / yRa.H / yRa.H;
        return l4 + YSa.o + l7 + aqa.R + l3 + YSa.o + l6 + WPa.D + l2 + YSa.o + l5 + ZSa.N;
    }

    public oga_3(RIa rIa2) {
        oga_3 b2 = rIa2;
        oga_3 a2 = this;
        a2.A = b2;
    }
}

