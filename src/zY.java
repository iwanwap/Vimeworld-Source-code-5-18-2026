/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class zY
extends PrintStream {
    private final String A;
    private static final Logger I = LogManager.getLogger();

    @Override
    public void println(String string) {
        String b2 = string;
        zY a2 = this;
        a2.J(b2);
    }

    @Override
    public void println(Object object) {
        Object b2 = object;
        zY a2 = this;
        a2.J(String.valueOf(b2));
    }

    /*
     * WARNING - void declaration
     */
    private void J(String string) {
        void a2;
        StackTraceElement[] stackTraceElementArray = this;
        Object b2 = Thread.currentThread().getStackTrace();
        b2 = b2[Math.min(yRa.d, ((StackTraceElement[])b2).length)];
        Object[] objectArray = new Object[AQa.P];
        objectArray[uSa.E] = stackTraceElementArray.A;
        objectArray[vRa.d] = ((StackTraceElement)b2).getFileName();
        objectArray[uqa.g] = ((StackTraceElement)b2).getLineNumber();
        objectArray[yRa.d] = a2;
        I.info(yRa.ca, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public zY(String string, OutputStream outputStream) {
        void b2;
        OutputStream c2 = outputStream;
        zY a2 = this;
        super(c2);
        a2.A = b2;
    }
}

