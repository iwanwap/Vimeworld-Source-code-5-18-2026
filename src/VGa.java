/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Eha
 *  FIa
 *  KIa
 *  Qta
 *  U
 *  nka
 *  vRa
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public final class VGa {
    private final String j;
    private int J;
    private int A;
    private final KIa I;

    public static byte[] J(BufferedInputStream bufferedInputStream) throws IOException {
        try (BufferedInputStream bufferedInputStream2 = bufferedInputStream;){
            Object a2 = IOUtils.toByteArray(bufferedInputStream2);
            return a2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static VGa J(U u2, KIa kIa, String string) throws IOException {
        void a2;
        void b2;
        U u3 = u2;
        VGa vGa = (VGa)b2.getLoadedShaders().get(a2);
        if (vGa == null) {
            ResourceLocation resourceLocation = new ResourceLocation(new StringBuilder().insert(2 & 5, Qta.Y).append((String)a2).append(b2.getShaderExtension()).toString());
            byte[] byArray = VGa.J(new BufferedInputStream(u3.J(resourceLocation).J()));
            Object c22 = byArray;
            Object object = BufferUtils.createByteBuffer(byArray.length);
            ((ByteBuffer)object).put((byte[])c22);
            ((ByteBuffer)object).position(uSa.E);
            int c22 = nka.f((int)b2.getShaderMode());
            nka.J((int)c22, (ByteBuffer)object);
            nka.l((int)c22);
            if (nka.f((int)c22, (int)nka.o) == 0) {
                object = StringUtils.trim(nka.J((int)c22, (int)CRa.Y));
                Eha eha2 = new Eha(new StringBuilder().insert(5 >> 3, Zra.c).append(b2.getShaderName()).append(cPa.ia).append((String)object).toString());
                eha2.func_151381_b(resourceLocation.J());
                throw eha2;
            }
            vGa = new VGa((KIa)b2, c22, (String)a2);
            b2.getLoadedShaders().put(a2, vGa);
        }
        return vGa;
    }

    public void f(FIa fIa2) {
        VGa a2;
        VGa b2 = fIa2;
        VGa vGa = a2 = this;
        vGa.A -= vRa.d;
        if (vGa.A <= 0) {
            VGa vGa2 = a2;
            nka.C((int)vGa2.J);
            vGa2.I.getLoadedShaders().remove(a2.j);
        }
    }

    public void J(FIa fIa2) {
        VGa b2 = fIa2;
        VGa a2 = this;
        a2.A += vRa.d;
        nka.d((int)b2.J(), (int)a2.J);
    }

    public String J() {
        VGa a2;
        return a2.j;
    }

    /*
     * WARNING - void declaration
     */
    private VGa(KIa kIa, int n2, String string) {
        void b2;
        void c2;
        VGa a2;
        String d2 = string;
        VGa vGa = a2 = this;
        a2.A = uSa.E;
        a2.I = c2;
        vGa.J = b2;
        vGa.j = d2;
    }
}

