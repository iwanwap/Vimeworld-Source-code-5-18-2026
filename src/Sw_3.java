/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bx
 *  vRa
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class Sw_3
extends bx {
    public final /* synthetic */ kv A;
    private long I;

    public long J() {
        Sw_3 a2;
        return a2.I;
    }

    public Sw_3(kv kv2) {
        Object b2 = kv2;
        Sw_3 a2 = this;
        a2.A = b2;
        super((rw)b2);
    }

    public void serialize(DataOutputStream dataOutputStream) throws IOException {
        Sw_3 a2;
        DataOutputStream b2 = dataOutputStream;
        Sw_3 sw_3 = a2 = this;
        DataOutputStream dataOutputStream2 = b2;
        super.serialize(dataOutputStream2);
        dataOutputStream2.writeLong(sw_3.I);
    }

    /*
     * WARNING - void declaration
     */
    public void deserialize(DataInputStream dataInputStream, int n2) throws IOException {
        void a2;
        DataInputStream c2 = dataInputStream;
        Sw_3 b2 = this;
        super.deserialize(c2, (int)a2);
        b2.I = c2.readLong();
    }

    public void J(long a2) {
        Sw_3 b2;
        Sw_3 sw_3 = b2;
        sw_3.I = a2;
        sw_3.A.I = vRa.d;
    }
}

