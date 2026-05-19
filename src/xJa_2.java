/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qta
 *  bua
 *  vRa
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class xJa_2 {
    public static synchronized void J(int a2) {
        GL11.glDeleteLists(a2, vRa.d);
    }

    public static FloatBuffer J(int a2) {
        return xJa_2.J(a2 << uqa.g).asFloatBuffer();
    }

    public static synchronized void J(int n2, int n3) {
        int b2 = n3;
        int a2 = n2;
        GL11.glDeleteLists(a2, b2);
    }

    public xJa_2() {
        xJa_2 a2;
    }

    public static synchronized int J(int n2) {
        int n3 = n2;
        int n4 = GL11.glGenLists(n3);
        if (n4 == 0) {
            int a2 = GL11.glGetError();
            String string = Qta.r;
            if (a2 != 0) {
                string = GLU.gluErrorString(a2);
            }
            throw new IllegalStateException(new StringBuilder().insert(3 & 4, bua.f).append(n3).append(Gta.z).append(a2).append(xua.i).append(string).toString());
        }
        return n4;
    }

    public static IntBuffer J(int a2) {
        return xJa_2.J(a2 << uqa.g).asIntBuffer();
    }

    public static synchronized ByteBuffer J(int a2) {
        return ByteBuffer.allocateDirect(a2).order(ByteOrder.nativeOrder());
    }
}

