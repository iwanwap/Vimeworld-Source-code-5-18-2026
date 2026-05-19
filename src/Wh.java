/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  KI
 *  Kpa
 *  Tg
 *  mp
 */
import org.lwjgl.input.Keyboard;

public final class Wh
extends KI {
    private final int A;
    private final mIa I;

    public boolean J(Kpa kpa2, Tg tg) {
        Wh c2 = tg;
        Wh a2 = this;
        if (a2.I != null) {
            return a2.I.isKeyDown();
        }
        return Keyboard.isKeyDown(a2.A);
    }

    public Wh(int n2) {
        Wh a2;
        int b2 = n2;
        Wh wh2 = a2 = this;
        wh2.A = b2;
        wh2.I = mp.J((int)b2);
    }
}

