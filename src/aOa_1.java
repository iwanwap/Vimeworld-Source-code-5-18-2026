/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NPa
 *  Uta
 *  Ysa
 *  aSa
 *  vQa
 *  vRa
 *  wPa
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class aOa_1
extends Thread {
    private final String M;
    private boolean k;
    private static final Logger j;
    private static final AtomicInteger J;
    private final String A;
    private final DatagramSocket I;

    @Override
    public void interrupt() {
        aOa_1 a2;
        super.interrupt();
        a2.k = uSa.E;
    }

    @Override
    public void run() {
        aOa_1 aOa_12;
        aOa_1 aOa_13 = aOa_12 = this;
        aOa_1 aOa_14 = aOa_13;
        byte[] byArray = aOa_1.J(aOa_12.A, aOa_13.M).getBytes();
        while (!aOa_14.isInterrupted() && aOa_12.k) {
            try {
                InetAddress a2 = InetAddress.getByName(NPa.x);
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, a2, Ysa.O);
                aOa_12.I.send(datagramPacket);
            }
            catch (IOException a2) {
                j.warn(new StringBuilder().insert(5 >> 3, Uta.T).append(a2.getMessage()).toString());
                return;
            }
            try {
                aOa_1.sleep(Hra.m);
                aOa_14 = aOa_12;
            }
            catch (InterruptedException a2) {
                aOa_14 = aOa_12;
            }
        }
    }

    public static String f(String string) {
        String string2 = string;
        int a2 = string2.indexOf(aSa.Ja);
        if (a2 < 0) {
            return null;
        }
        if (string2.indexOf(aSa.Ja, a2 + aSa.Ja.length()) >= 0) {
            return null;
        }
        if ((a2 = string2.indexOf(vQa.I, a2 + aSa.Ja.length())) < 0) {
            return null;
        }
        int n2 = string2.indexOf(fta.T, a2 + vQa.I.length());
        if (n2 < a2) {
            return null;
        }
        return string2.substring(a2 + vQa.I.length(), n2);
    }

    static {
        J = new AtomicInteger(uSa.E);
        j = LogManager.getLogger();
    }

    public static String J(String string) {
        String string2 = string;
        int a2 = string2.indexOf(yta.W);
        if (a2 < 0) {
            return UOa.c;
        }
        int n2 = string2.indexOf(aSa.Ja, a2 + yta.W.length());
        if (n2 < a2) {
            return UOa.c;
        }
        return string2.substring(a2 + yta.W.length(), n2);
    }

    /*
     * WARNING - void declaration
     */
    public aOa_1(String string, String string2) throws IOException {
        void b2;
        aOa_1 a2;
        String c2 = string2;
        aOa_1 aOa_12 = a2 = this;
        super(wPa.E + J.incrementAndGet());
        a2.k = vRa.d;
        a2.A = b2;
        aOa_12.M = c2;
        a2.setDaemon(vRa.d != 0);
        aOa_12.I = new DatagramSocket();
    }

    public static String J(String string, String string2) {
        String b2 = string2;
        String a2 = string;
        return new StringBuilder().insert(3 >> 2, yta.W).append(a2).append(nqa.K).append(b2).append(fta.T).toString();
    }
}

