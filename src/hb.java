/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JPa
 *  ZA
 *  vRa
 */
import org.lwjgl.opengl.ARBShaderObjects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class hb
extends ZA {
    private float[] I;

    /*
     * WARNING - void declaration
     */
    public void J(float f2, float f3, float f4, float f5) {
        void e2;
        void b2;
        void c2;
        void d2;
        float f6 = f5;
        hb a2 = this;
        if (a2.J() >= 0 && (a2.I[uSa.E] != d2 || a2.I[vRa.d] != c2 || a2.I[uqa.g] != b2 || a2.I[yRa.d] != e2)) {
            hb hb2 = a2;
            ARBShaderObjects.glUniform4fARB(hb2.J(), (float)d2, (float)c2, (float)b2, (float)e2);
            pA.d(hb2.J());
            hb hb3 = a2;
            hb3.I[uSa.E] = d2;
            hb3.I[vRa.d] = c2;
            hb3.I[uqa.g] = b2;
            hb3.I[yRa.d] = e2;
        }
    }

    public void J() {
        hb a2;
        hb hb2 = a2;
        hb2.I[uSa.E] = JPa.N;
        hb2.I[vRa.d] = JPa.N;
        hb2.I[uqa.g] = JPa.N;
        hb2.I[yRa.d] = JPa.N;
    }

    public float[] J() {
        hb a2;
        return a2.I;
    }

    public hb(String string) {
        Object b2 = string;
        hb a2 = this;
        super((String)b2);
        a2.I = new float[AQa.P];
    }
}

