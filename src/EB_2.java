/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ZA
 *  pua
 */
import org.lwjgl.opengl.ARBShaderObjects;

public final class EB_2
extends ZA {
    private int I;

    public EB_2(String string) {
        Object b2 = string;
        EB_2 a2 = this;
        super((String)b2);
        a2.I = pua.o;
    }

    public void f(int n2) {
        int b2 = n2;
        EB_2 a2 = this;
        if (a2.J() >= 0 && a2.I != b2) {
            EB_2 eB_2 = a2;
            ARBShaderObjects.glUniform1iARB(eB_2.J(), b2);
            pA.d(eB_2.J());
            a2.I = b2;
        }
    }

    public void J() {
        a.I = pua.o;
    }

    public int l() {
        EB_2 a2;
        return a2.I;
    }
}

