/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Hda
 *  oA
 *  vRa
 */
import java.util.Random;

public final class AEa_1
implements oA {
    public int I;

    public AEa_1() {
        AEa_1 a2;
    }

    public void J(Random random) {
        Random b22 = random;
        AEa_1 a2 = this;
        int b22 = b22.nextInt(tTa.h);
        if (b22 <= vRa.d) {
            a2.I = Hda.o.O;
            return;
        }
        if (b22 <= uqa.g) {
            a2.I = Hda.l.O;
            return;
        }
        if (b22 <= yRa.d) {
            a2.I = Hda.t.O;
            return;
        }
        if (b22 <= AQa.P) {
            a2.I = Hda.k.O;
        }
    }
}

