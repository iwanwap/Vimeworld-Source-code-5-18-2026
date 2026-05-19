/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DV
 *  QFa
 *  ww
 */
import java.util.Random;

public final class av_1
extends ww {
    public /* synthetic */ av_1(DV dV2) {
        av_1 b2 = dV2;
        av_1 a2 = this;
        a2();
    }

    public void J(Random random, int n2, int n3, int n4, boolean bl) {
        Random f2 = random;
        av_1 e2 = this;
        if (f2.nextFloat() < Xpa.R) {
            e2.blockstate = QFa.yB.J();
            return;
        }
        e2.blockstate = QFa.h.J();
    }

    private av_1() {
        av_1 a2;
    }
}

