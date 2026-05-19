/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public final class bH_1
implements b {
    private final Random I;

    @Override
    public float J() {
        bH_1 a2;
        return a2.I.nextFloat();
    }

    public static b J(Random a2) {
        return new bH_1(a2);
    }

    private bH_1(Random random) {
        Random b2 = random;
        bH_1 a2 = this;
        a2.I = b2;
    }
}

