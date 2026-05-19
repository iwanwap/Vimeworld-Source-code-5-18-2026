/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Qqa
 *  oqa
 *  tk
 *  vRa
 */
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import net.minecraft.util.ResourceLocation;

public final class Ria_3
extends InputStream {
    private final InputStream J;
    private final String A;
    private boolean I;

    public void finalize() throws Throwable {
        Ria_3 a2;
        if (!a2.I) {
            tk.J().warn(a2.A);
        }
        super.finalize();
    }

    @Override
    public void close() throws IOException {
        Ria_3 a2;
        a2.J.close();
        a2.I = vRa.d;
    }

    /*
     * WARNING - void declaration
     */
    public Ria_3(InputStream inputStream, ResourceLocation resourceLocation, String string) {
        void a2;
        void b2;
        Ria_3 c2;
        Closeable d2 = inputStream;
        Ria_3 ria_3 = c2 = this;
        ria_3.I = uSa.E;
        ria_3.J = d2;
        d2 = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream((OutputStream)d2));
        Ria_3 ria_32 = c2;
        ria_3.A = Qqa.f + b2 + oqa.A + (String)a2 + oQa.s + ((ByteArrayOutputStream)d2).toString();
    }

    @Override
    public int read() throws IOException {
        Ria_3 a2;
        return a2.J.read();
    }
}

