/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  LF
 *  Lg
 *  Lqa
 *  Tpa
 */
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Iterator;

public final class Ce_1
extends Thread {
    private Lg J;
    private static Charset A = Charset.forName(sqa.E);
    private static final String I = "\r\n";

    public Ce_1(Lg lg2) {
        Ce_1 a2;
        Ce_1 b2 = lg2;
        Ce_1 ce_1 = a2 = this;
        super(gua.Y);
        ce_1.J = null;
        ce_1.J = b2;
    }

    /*
     * WARNING - void declaration
     */
    private void J(OutputStream outputStream, String string) throws IOException {
        void b2;
        Object c2 = string;
        Ce_1 a2 = this;
        c2 = ((String)c2).getBytes(A);
        b2.write((byte[])c2);
    }

    /*
     * WARNING - void declaration
     */
    private void J(LF lF, OutputStream outputStream) throws IOException {
        Iterator iterator;
        void a2;
        Ce_1 c2 = lF;
        Ce_1 b2 = this;
        b2.J((OutputStream)a2, c2.J() + Tpa.E + c2.C() + Tpa.E + c2.f() + Lqa.Da);
        Iterator iterator2 = iterator = c2.J().keySet().iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            String string2 = (String)c2.J().get(string);
            iterator2 = iterator;
            b2.J((OutputStream)a2, new StringBuilder().insert(3 ^ 3, string).append(Xpa.E).append(string2).append(Lqa.Da).toString());
        }
        b2.J((OutputStream)a2, Lqa.Da);
    }

    @Override
    public void run() {
        Ce_1 ce_1 = this;
        BF bF = null;
        try {
            ce_1.J();
            while (!Thread.interrupted()) {
                Ce_1 ce_12 = ce_1;
                bF = ce_12.J.J();
                Ce_1 a2 = bF.J();
                OutputStream outputStream = ce_12.J.J();
                ce_12.J((LF)a2, outputStream);
                ce_12.J.J(bF);
            }
        }
        catch (InterruptedException a2) {
            return;
        }
        catch (Exception a2) {
            ce_1.J.J(bF, a2);
        }
    }

    private void J() throws IOException {
        Ce_1 ce_1;
        Ce_1 ce_12 = ce_1 = this;
        String string = ce_12.J.J();
        int n2 = ce_12.J.J();
        Object a2 = ce_12.J.J();
        ((Socket)(a2 = new Socket((Proxy)a2))).connect(new InetSocketAddress(string, n2), Jra.U);
        ce_12.J.J((Socket)a2);
    }
}

