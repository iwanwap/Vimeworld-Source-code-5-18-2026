/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lMa
 *  pqa
 */
import net.minecraft.util.ResourceLocation;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class JNa_2
implements X {
    public final ResourceLocation m;
    public float C;
    public lMa i;
    public boolean M;
    public float k;
    public float j;
    public int J;
    public float A;
    public float I;

    @Override
    public float f() {
        JNa_2 a2;
        return a2.I;
    }

    @Override
    public float J() {
        JNa_2 a2;
        return a2.k;
    }

    @Override
    public lMa J() {
        JNa_2 a2;
        return a2.i;
    }

    @Override
    public ResourceLocation J() {
        JNa_2 a2;
        return a2.m;
    }

    public JNa_2(ResourceLocation resourceLocation) {
        JNa_2 a2;
        ResourceLocation b2 = resourceLocation;
        JNa_2 jNa_2 = a2 = this;
        a2.C = pqa.r;
        a2.A = pqa.r;
        a2.M = uSa.E;
        jNa_2.J = uSa.E;
        jNa_2.i = lMa.LINEAR;
        jNa_2.m = b2;
    }

    @Override
    public boolean J() {
        JNa_2 a2;
        return a2.M;
    }

    @Override
    public int J() {
        JNa_2 a2;
        return a2.J;
    }

    @Override
    public float d() {
        JNa_2 a2;
        return a2.C;
    }

    @Override
    public float C() {
        JNa_2 a2;
        return a2.j;
    }

    @Override
    public float l() {
        JNa_2 a2;
        return a2.A;
    }
}

