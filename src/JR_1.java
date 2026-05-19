/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Kpa
 *  mp
 *  sq
 */
import org.lwjgl.input.Keyboard;

public final class JR_1
extends sq {
    private final int A;
    private final mIa I;

    public boolean J(Kpa kpa2, Bp bp2) {
        Object c2 = bp2;
        JR_1 a2 = this;
        if (a2.I != null) {
            return a2.I.isKeyDown();
        }
        return Keyboard.isKeyDown(a2.A);
    }

    public JR_1(int n2) {
        JR_1 a2;
        int b2 = n2;
        JR_1 jR_1 = a2 = this;
        jR_1.A = b2;
        jR_1.I = mp.J((int)b2);
    }
}

