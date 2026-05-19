/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Lm
 *  s
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class Lm_2
extends GeneratedMessageLite.Builder<An, Lm>
implements s {
    public List<String> getValuesList() {
        Lm_2 a2;
        return Collections.unmodifiableList(((An)a2.instance).getValuesList());
    }

    private Lm_2() {
        super(An.f());
        Lm_2 a2;
    }

    public String getValues(int n2) {
        int b2 = n2;
        Lm_2 a2 = this;
        return ((An)a2.instance).getValues(b2);
    }

    public Lm clearValues() {
        Lm_2 a2;
        Lm_2 lm_2 = a2;
        lm_2.copyOnWrite();
        An.J((An)lm_2.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public Lm setValues(int n2, String string) {
        void b2;
        Lm_2 a2;
        String c2 = string;
        Lm_2 lm_2 = a2 = this;
        lm_2.copyOnWrite();
        An.J((An)lm_2.instance, (int)b2, c2);
        return a2;
    }

    public ByteString getValuesBytes(int n2) {
        int b2 = n2;
        Lm_2 a2 = this;
        return ((An)a2.instance).getValuesBytes(b2);
    }

    public /* synthetic */ Lm_2(AN aN2) {
        Lm_2 b2 = aN2;
        Lm_2 a2 = this;
        a2();
    }

    public int getValuesCount() {
        Lm_2 a2;
        return ((An)a2.instance).getValuesCount();
    }

    public Lm addValues(String string) {
        Lm_2 a2;
        String b2 = string;
        Lm_2 lm_2 = a2 = this;
        lm_2.copyOnWrite();
        An.J((An)lm_2.instance, b2);
        return a2;
    }

    public Lm addAllValues(Iterable<String> iterable) {
        Lm_2 a2;
        Iterable<String> b2 = iterable;
        Lm_2 lm_2 = a2 = this;
        lm_2.copyOnWrite();
        An.J((An)lm_2.instance, b2);
        return a2;
    }

    public Lm addValuesBytes(ByteString byteString) {
        Lm_2 a2;
        ByteString b2 = byteString;
        Lm_2 lm_2 = a2 = this;
        lm_2.copyOnWrite();
        An.J((An)lm_2.instance, b2);
        return a2;
    }
}

