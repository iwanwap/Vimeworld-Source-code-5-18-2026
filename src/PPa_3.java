/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Bqa
 *  Opa
 *  PPa
 *  jA
 */
import com.google.protobuf.GeneratedMessageLite;

public final class PPa_3
extends GeneratedMessageLite.Builder<Opa, PPa>
implements jA {
    private PPa_3() {
        super(Opa.f());
        PPa_3 a2;
    }

    public PPa setTime(long a2) {
        PPa_3 b2;
        PPa_3 pPa_3 = b2;
        pPa_3.copyOnWrite();
        Opa.J((Opa)((Opa)pPa_3.instance), (long)a2);
        return b2;
    }

    public /* synthetic */ PPa_3(Bqa bqa2) {
        PPa_3 b2 = bqa2;
        PPa_3 a2 = this;
        a2();
    }

    public long getTime() {
        PPa_3 a2;
        return ((Opa)a2.instance).getTime();
    }

    public PPa clearTime() {
        PPa_3 a2;
        PPa_3 pPa_3 = a2;
        pPa_3.copyOnWrite();
        Opa.J((Opa)((Opa)pPa_3.instance));
        return a2;
    }
}

