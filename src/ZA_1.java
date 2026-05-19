/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  pua
 *  vRa
 */
import org.lwjgl.opengl.ARBShaderObjects;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class ZA_1 {
    private String J;
    private int A;
    private int I;

    public String J() {
        ZA_1 a2;
        return a2.J;
    }

    public ZA_1(String string) {
        ZA_1 a2;
        String b2 = string;
        ZA_1 zA_1 = a2 = this;
        zA_1.A = pua.o;
        zA_1.I = pua.o;
        zA_1.J = b2;
    }

    public void J(int n2) {
        int b2 = n2;
        ZA_1 a2 = this;
        if (a2.A != b2) {
            a2.A = b2;
            a2.I = ARBShaderObjects.glGetUniformLocationARB(b2, a2.J);
            a2.J();
        }
    }

    public abstract void J();

    public boolean J() {
        ZA_1 a2;
        if (a2.I >= 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public int f() {
        ZA_1 a2;
        return a2.A;
    }

    public int J() {
        ZA_1 a2;
        return a2.I;
    }
}

