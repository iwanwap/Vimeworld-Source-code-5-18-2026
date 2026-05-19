/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  NPa
 *  Qsa
 *  Ysa
 *  bSa
 *  ura
 *  vRa
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class gNa
extends Thread {
    private final goa J;
    private final InetAddress A;
    private final MulticastSocket I;

    public gNa(goa goa2) throws IOException {
        gNa a2;
        goa b2 = goa2;
        gNa gNa2 = a2 = this;
        gNa gNa3 = a2;
        gNa gNa4 = a2;
        super(bSa.G + kna.J().incrementAndGet());
        gNa2.J = b2;
        gNa3.setDaemon(vRa.d != 0);
        gNa2.I = new MulticastSocket(Ysa.O);
        gNa2.A = InetAddress.getByName(NPa.x);
        gNa2.I.setSoTimeout(Jra.U);
        gNa2.I.joinGroup(a2.A);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void run() {
        var2_2 = this;
        var1_3 = new byte[ura.V];
        v0 = var2_2;
        while (!v0.isInterrupted()) {
            a = new DatagramPacket(var1_3, var1_3.length);
            try {
                var2_2.I.receive(a);
            }
            catch (SocketTimeoutException var3_5) {
                v0 = var2_2;
                continue;
            }
            catch (IOException var3_6) {
                kna.J().error(Qsa.Ja, (Throwable)var3_6);
                v1 = var2_2;
                ** GOTO lbl26
            }
            var3_4 = new String(a.getData(), a.getOffset(), a.getLength());
            kna.J().debug(a.getAddress() + Xpa.E + var3_4);
            v2 = var2_2;
            v0 = v2;
            v2.J.J(var3_4, a.getAddress());
        }
        try {
            v1 = var2_2;
lbl26:
            // 2 sources

            v1.I.leaveGroup(var2_2.A);
            v3 = var2_2;
        }
        catch (IOException a) {
            v3 = var2_2;
        }
        v3.I.close();
    }
}

