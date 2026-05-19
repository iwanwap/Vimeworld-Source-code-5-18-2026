/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  CQa
 *  Gqa
 *  HPa
 *  OOa
 *  VQa
 *  WB
 *  Wra
 *  aqa
 *  fRa
 *  sPa
 *  vRa
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CQa_2
implements WB {
    private final byte[] k;
    private final Gqa j;
    private static final Logger J = LogManager.getLogger();
    private final byte[] A;
    private Consumer<Throwable> I;

    public void J(Gra gra2) {
        Gra b2 = gra2;
        CQa_2 a2 = this;
        Object[] objectArray = new Object[vRa.d];
        objectArray[uSa.E] = b2.getDataCase().name();
        J.warn(KPa.ja, objectArray);
        CQa_2 cQa_2 = a2;
        cQa_2.j.J(Wra.J((byte[])cQa_2.A, (byte[])b2.toByteArray()));
    }

    public void J() {
        CQa_2 a2;
        a2.j.J();
    }

    public void f(Consumer<Throwable> consumer) {
        Consumer<Throwable> b2 = consumer;
        CQa_2 a2 = this;
        a2.I = b2;
    }

    /*
     * WARNING - void declaration
     */
    public void J(boolean bl, boolean bl2) {
        void b22;
        boolean c22 = bl2;
        CQa_2 a2 = this;
        J.warn(aqa.G);
        byte[] b22 = Wra.J((byte[])a2.A, (byte[])((OOa)OOa.J().setProtocolVersion(vRa.d).setMicroExists((boolean)b22).setMicroDisabled(c22).build()).toByteArray());
        byte[] c22 = new byte[a2.k.length + b22.length];
        System.arraycopy(a2.k, uSa.E, c22, uSa.E, a2.k.length);
        System.arraycopy(b22, uSa.E, c22, a2.k.length, b22.length);
        a2.j.J(c22);
    }

    public static /* synthetic */ void J(Throwable a2) {
        J.warn(Bua.C, a2);
    }

    /*
     * WARNING - void declaration
     */
    public CQa_2(Gqa gqa2, byte[] byArray, byte[] byArray2) {
        void b2;
        void c2;
        CQa_2 a2;
        Object d2 = byArray2;
        CQa_2 cQa_2 = a2 = this;
        a2.I = HPa.J();
        a2.j = c2;
        cQa_2.A = b2;
        cQa_2.k = (byte[])d2;
    }

    private Consumer<ByteBuffer> J(Consumer<fRa> consumer) {
        Consumer<fRa> b2 = consumer;
        CQa_2 a2 = this;
        return sPa.J((CQa)a2, (Consumer)b2);
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ void J(CQa cQa2, Consumer consumer, ByteBuffer byteBuffer) {
        Object c22;
        Object a2;
        CQa cQa3 = cQa2;
        void v0 = a2;
        Object object = c22 = (Object)new byte[v0.remaining()];
        System.arraycopy(v0.array(), a2.arrayOffset(), object, uSa.E, ((CQa)object).length);
        a2 = Wra.f((byte[])cQa3.A, (byte[])c22);
        if (a2 == null) {
            return;
        }
        try {
            a2 = fRa.J((byte[])a2);
        }
        catch (InvalidProtocolBufferException c22) {
            cQa3.I.accept(c22);
            return;
        }
        try {
            void b2;
            b2.accept(a2);
            return;
        }
        catch (Throwable c22) {
            cQa3.I.accept(c22);
            return;
        }
    }

    public void J(Consumer<fRa> consumer) {
        Consumer<fRa> b2 = consumer;
        CQa_2 a2 = this;
        J.warn(VQa.V);
        a2.j.J(a2.J(b2));
    }
}

