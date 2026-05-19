/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  KN
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class KN_3
extends GeneratedMessageLite.Builder<LN, KN>
implements wa {
    @Override
    public int getLocalIdsCount() {
        KN_3 a2;
        return ((LN)a2.instance).getLocalIdsCount();
    }

    public /* synthetic */ KN_3(AN aN2) {
        KN_3 b2 = aN2;
        KN_3 a2 = this;
        a2();
    }

    @Override
    public List<Integer> getLocalIdsList() {
        KN_3 a2;
        return Collections.unmodifiableList(((LN)a2.instance).getLocalIdsList());
    }

    public KN setRemoteResources(ByteString byteString) {
        KN_3 a2;
        ByteString b2 = byteString;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.f((LN)kN_3.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public KN setLocalIds(int n2, int n3) {
        void b2;
        KN_3 a2;
        int c2 = n3;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.J((LN)kN_3.instance, (int)b2, c2);
        return a2;
    }

    @Override
    public ByteString getLocalResources() {
        KN_3 a2;
        return ((LN)a2.instance).getLocalResources();
    }

    @Override
    public int getLocalIds(int n2) {
        int b2 = n2;
        KN_3 a2 = this;
        return ((LN)a2.instance).getLocalIds(b2);
    }

    @Override
    public int getRemoteIds(int n2) {
        int b2 = n2;
        KN_3 a2 = this;
        return ((LN)a2.instance).getRemoteIds(b2);
    }

    public KN clearRemoteIds() {
        KN_3 a2;
        KN_3 kN_3 = a2;
        kN_3.copyOnWrite();
        LN.f((LN)kN_3.instance);
        return a2;
    }

    public KN clearLocalIds() {
        KN_3 a2;
        KN_3 kN_3 = a2;
        kN_3.copyOnWrite();
        LN.J((LN)kN_3.instance);
        return a2;
    }

    @Override
    public List<Integer> getRemoteIdsList() {
        KN_3 a2;
        return Collections.unmodifiableList(((LN)a2.instance).getRemoteIdsList());
    }

    public KN addRemoteIds(int n2) {
        KN_3 a2;
        int b2 = n2;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.f((LN)kN_3.instance, b2);
        return a2;
    }

    @Override
    public int getRemoteIdsCount() {
        KN_3 a2;
        return ((LN)a2.instance).getRemoteIdsCount();
    }

    public KN addAllRemoteIds(Iterable<? extends Integer> iterable) {
        KN_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.J((LN)kN_3.instance, b2);
        return a2;
    }

    public KN setLocalResources(ByteString byteString) {
        KN_3 a2;
        ByteString b2 = byteString;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.J((LN)kN_3.instance, b2);
        return a2;
    }

    public KN addLocalIds(int n2) {
        KN_3 a2;
        int b2 = n2;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.J((LN)kN_3.instance, b2);
        return a2;
    }

    @Override
    public ByteString getRemoteResources() {
        KN_3 a2;
        return ((LN)a2.instance).getRemoteResources();
    }

    public KN clearLocalResources() {
        KN_3 a2;
        KN_3 kN_3 = a2;
        kN_3.copyOnWrite();
        LN.C((LN)kN_3.instance);
        return a2;
    }

    private KN_3() {
        super(LN.f());
        KN_3 a2;
    }

    public KN addAllLocalIds(Iterable<? extends Integer> iterable) {
        KN_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.f((LN)kN_3.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public KN setRemoteIds(int n2, int n3) {
        void b2;
        KN_3 a2;
        int c2 = n3;
        KN_3 kN_3 = a2 = this;
        kN_3.copyOnWrite();
        LN.f((LN)kN_3.instance, (int)b2, c2);
        return a2;
    }

    public KN clearRemoteResources() {
        KN_3 a2;
        KN_3 kN_3 = a2;
        kN_3.copyOnWrite();
        LN.l((LN)kN_3.instance);
        return a2;
    }
}

