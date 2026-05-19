/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  JQa
 *  vRa
 *  yPa
 */
import de.maxhenkel.rnnoise4j.Denoiser;
import de.maxhenkel.rnnoise4j.NativeInitializer;
import de.maxhenkel.rnnoise4j.UnknownPlatformException;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class yPa_2
implements Closeable {
    private static final Logger A;
    private final Denoiser I;

    @Override
    public void close() {
        yPa_2 a2;
        a2.I.close();
    }

    static {
        int n2;
        A = LogManager.getLogger();
        System.loadLibrary(JQa.X);
        int n3 = uSa.E;
        Field[] fieldArray = NativeInitializer.class.getDeclaredFields();
        int n4 = fieldArray.length;
        int n5 = n2 = uSa.E;
        while (n5 < n4) {
            Field field = fieldArray[n2];
            if (field.getType() == Boolean.TYPE) {
                n3 = vRa.d;
                Field field2 = field;
                field2.setAccessible(vRa.d != 0);
                field2.set(null, vRa.d != 0);
            }
            n5 = ++n2;
        }
        try {
            if (n3 == 0) {
                throw new IllegalStateException(opa.J);
            }
        }
        catch (Throwable throwable) {
            A.warn(UTa.G, throwable);
        }
    }

    public static yPa J() {
        try {
            return new yPa_2(new Denoiser());
        }
        catch (UnknownPlatformException | IOException exception) {
            A.warn(Gta.P, (Throwable)exception);
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void J(ByteBuffer byteBuffer) {
        void a2;
        yPa_2 yPa_22 = this;
        void v0 = a2;
        Object b2 = new short[v0.remaining() / uqa.g];
        v0.asShortBuffer().get((short[])b2);
        a2.position(uSa.E);
        a2.asShortBuffer().put(yPa_22.I.denoise((short[])b2));
    }

    private yPa_2(Denoiser denoiser) {
        AutoCloseable b2 = denoiser;
        yPa_2 a2 = this;
        a2.I = b2;
    }
}

