/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gqa
 *  SOa
 *  gpa
 *  jqa
 *  tOa
 *  vRa
 *  zsa
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Gqa_2 {
    private final DatagramSocket M;
    private Consumer<Throwable> k;
    private final DatagramPacket j;
    private final AtomicBoolean J;
    private static final Logger A = LogManager.getLogger();
    public static final int I = 1400;

    /*
     * WARNING - void declaration
     */
    public Gqa_2(String string, int n2) throws IOException {
        void b2;
        int c2 = n2;
        Gqa_2 a2 = this;
        Gqa_2 gqa_2 = a2;
        a2.J = new AtomicBoolean(uSa.E != 0);
        gqa_2.k = jqa.J();
        a2.M = new DatagramSocket();
        a2.j = new DatagramPacket(new byte[uSa.E], uSa.E, InetAddress.getByName((String)b2), c2);
    }

    public Gqa_2() {
        Gqa_2 a2;
        Gqa_2 gqa_2 = a2;
        Gqa_2 gqa_22 = a2;
        a2.J = new AtomicBoolean(uSa.E != 0);
        gqa_22.k = gpa.J();
        gqa_2.M = null;
        gqa_2.j = null;
    }

    public void J(byte[] byArray) {
        Object b22 = byArray;
        Gqa_2 a2 = this;
        if (a2.J.get()) {
            A.warn(zsa.o);
            return;
        }
        if (a2.M.isClosed()) {
            A.warn(SOa.y);
            return;
        }
        try {
            Gqa_2 gqa_2 = a2;
            gqa_2.j.setData((byte[])b22);
            gqa_2.M.send(a2.j);
            return;
        }
        catch (IOException b22) {
            a2.k.accept(b22);
            return;
        }
    }

    public static /* synthetic */ void J(Throwable a2) {
        A.warn(rpa.a, a2);
    }

    public void J() {
        Gqa_2 a2;
        Gqa_2 gqa_2 = a2;
        gqa_2.J.set(vRa.d != 0);
        gqa_2.M.close();
    }

    public void f(Consumer<Throwable> consumer) {
        Consumer<Throwable> b2 = consumer;
        Gqa_2 a2 = this;
        a2.k = b2;
    }

    public void J(Consumer<ByteBuffer> consumer) {
        Consumer<ByteBuffer> b2 = consumer;
        Gqa_2 a2 = this;
        new Thread(tOa.J((Gqa)a2, (Consumer)b2)).start();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void J(Gqa gqa2, Consumer consumer) {
        Gqa gqa3 = gqa2;
        Object b2 = new byte[eua.Aa];
        b2 = new DatagramPacket((byte[])b2, eua.Aa);
        try {
            Gqa gqa4 = gqa3;
            while (true) {
                void a2;
                if (gqa4.J.get()) {
                    return;
                }
                gqa3.M.receive((DatagramPacket)b2);
                a2.accept(ByteBuffer.wrap(((DatagramPacket)b2).getData(), ((DatagramPacket)b2).getOffset(), ((DatagramPacket)b2).getLength()));
                gqa4 = gqa3;
            }
        }
        catch (IOException a2) {
            if (hpa.d.equals(a2.getMessage())) {
                return;
            }
            gqa3.k.accept(a2);
            return;
        }
    }
}

