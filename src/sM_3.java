/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  KM
 *  Wa
 *  sM
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class sM_3
extends GeneratedMessageLite.Builder<KM, sM>
implements Wa {
    public sM setMode(int n2) {
        sM_3 a2;
        int b2 = n2;
        sM_3 sM_32 = a2 = this;
        sM_32.copyOnWrite();
        KM.f((KM)((KM)sM_32.instance), (int)b2);
        return a2;
    }

    public /* synthetic */ sM_3(AN aN2) {
        sM_3 b2 = aN2;
        sM_3 a2 = this;
        a2();
    }

    public ByteString getData() {
        sM_3 a2;
        return ((KM)a2.instance).getData();
    }

    public sM setData(ByteString byteString) {
        sM_3 a2;
        ByteString b2 = byteString;
        sM_3 sM_32 = a2 = this;
        sM_32.copyOnWrite();
        KM.J((KM)((KM)sM_32.instance), (ByteString)b2);
        return a2;
    }

    private sM_3() {
        super(KM.J());
        sM_3 a2;
    }

    public sM clearData() {
        sM_3 a2;
        sM_3 sM_32 = a2;
        sM_32.copyOnWrite();
        KM.J((KM)((KM)sM_32.instance));
        return a2;
    }

    public sM clearCulling() {
        sM_3 a2;
        sM_3 sM_32 = a2;
        sM_32.copyOnWrite();
        KM.C((KM)((KM)sM_32.instance));
        return a2;
    }

    public sM addVertexFormat(int n2) {
        sM_3 a2;
        int b2 = n2;
        sM_3 sM_32 = a2 = this;
        sM_32.copyOnWrite();
        KM.J((KM)((KM)sM_32.instance), (int)b2);
        return a2;
    }

    public sM addAllVertexFormat(Iterable<? extends Integer> iterable) {
        sM_3 a2;
        Iterable<? extends Integer> b2 = iterable;
        sM_3 sM_32 = a2 = this;
        sM_32.copyOnWrite();
        KM.J((KM)((KM)sM_32.instance), (Iterable)b2);
        return a2;
    }

    public boolean getCulling() {
        sM_3 a2;
        return ((KM)a2.instance).getCulling();
    }

    public int getMode() {
        sM_3 a2;
        return ((KM)a2.instance).getMode();
    }

    public sM setCulling(boolean bl) {
        sM_3 a2;
        boolean b2 = bl;
        sM_3 sM_32 = a2 = this;
        sM_32.copyOnWrite();
        KM.J((KM)((KM)sM_32.instance), (boolean)b2);
        return a2;
    }

    public sM clearMode() {
        sM_3 a2;
        sM_3 sM_32 = a2;
        sM_32.copyOnWrite();
        KM.l((KM)((KM)sM_32.instance));
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public sM setVertexFormat(int n2, int n3) {
        void b2;
        sM_3 a2;
        int c2 = n3;
        sM_3 sM_32 = a2 = this;
        sM_32.copyOnWrite();
        KM.J((KM)((KM)sM_32.instance), (int)b2, (int)c2);
        return a2;
    }

    public boolean hasCulling() {
        sM_3 a2;
        return ((KM)a2.instance).hasCulling();
    }

    public List<Integer> getVertexFormatList() {
        sM_3 a2;
        return Collections.unmodifiableList(((KM)a2.instance).getVertexFormatList());
    }

    public int getVertexFormatCount() {
        sM_3 a2;
        return ((KM)a2.instance).getVertexFormatCount();
    }

    public int getVertexFormat(int n2) {
        int b2 = n2;
        sM_3 a2 = this;
        return ((KM)a2.instance).getVertexFormat(b2);
    }

    public sM clearVertexFormat() {
        sM_3 a2;
        sM_3 sM_32 = a2;
        sM_32.copyOnWrite();
        KM.f((KM)((KM)sM_32.instance));
        return a2;
    }
}

