/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Ha
 *  Yo
 *  cm
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;

public final class Yo_2
extends GeneratedMessageLite.Builder<cm, Yo>
implements Ha {
    private Yo_2() {
        super(cm.f());
        Yo_2 a2;
    }

    public Yo setOffsetZ(float f2) {
        Yo_2 a2;
        float b2 = f2;
        Yo_2 yo_2 = a2 = this;
        yo_2.copyOnWrite();
        cm.J((cm)((cm)yo_2.instance), (float)b2);
        return a2;
    }

    public Yo clearOffsetZ() {
        Yo_2 a2;
        Yo_2 yo_2 = a2;
        yo_2.copyOnWrite();
        cm.e((cm)((cm)yo_2.instance));
        return a2;
    }

    public boolean hasOffsetX() {
        Yo_2 a2;
        return ((cm)a2.instance).hasOffsetX();
    }

    public Yo clearOffsetX() {
        Yo_2 a2;
        Yo_2 yo_2 = a2;
        yo_2.copyOnWrite();
        cm.f((cm)((cm)yo_2.instance));
        return a2;
    }

    public boolean hasOffsetZ() {
        Yo_2 a2;
        return ((cm)a2.instance).hasOffsetZ();
    }

    public Yo clearOptions() {
        Yo_2 a2;
        Yo_2 yo_2 = a2;
        yo_2.copyOnWrite();
        cm.l((cm)((cm)yo_2.instance));
        return a2;
    }

    public Yo clearId() {
        Yo_2 a2;
        Yo_2 yo_2 = a2;
        yo_2.copyOnWrite();
        cm.C((cm)((cm)yo_2.instance));
        return a2;
    }

    public float getScale() {
        Yo_2 a2;
        return ((cm)a2.instance).getScale();
    }

    public /* synthetic */ Yo_2(AN aN2) {
        Yo_2 b2 = aN2;
        Yo_2 a2 = this;
        a2();
    }

    public float getOffsetY() {
        Yo_2 a2;
        return ((cm)a2.instance).getOffsetY();
    }

    public float getOffsetX() {
        Yo_2 a2;
        return ((cm)a2.instance).getOffsetX();
    }

    public Yo setOffsetX(float f2) {
        Yo_2 a2;
        float b2 = f2;
        Yo_2 yo_2 = a2 = this;
        yo_2.copyOnWrite();
        cm.C((cm)((cm)yo_2.instance), (float)b2);
        return a2;
    }

    public ByteString getOptions() {
        Yo_2 a2;
        return ((cm)a2.instance).getOptions();
    }

    public int getId() {
        Yo_2 a2;
        return ((cm)a2.instance).getId();
    }

    public Yo setOptions(ByteString byteString) {
        Yo_2 a2;
        ByteString b2 = byteString;
        Yo_2 yo_2 = a2 = this;
        yo_2.copyOnWrite();
        cm.J((cm)((cm)yo_2.instance), (ByteString)b2);
        return a2;
    }

    public boolean hasOffsetY() {
        Yo_2 a2;
        return ((cm)a2.instance).hasOffsetY();
    }

    public Yo setScale(float f2) {
        Yo_2 a2;
        float b2 = f2;
        Yo_2 yo_2 = a2 = this;
        yo_2.copyOnWrite();
        cm.l((cm)((cm)yo_2.instance), (float)b2);
        return a2;
    }

    public boolean hasScale() {
        Yo_2 a2;
        return ((cm)a2.instance).hasScale();
    }

    public Yo clearScale() {
        Yo_2 a2;
        Yo_2 yo_2 = a2;
        yo_2.copyOnWrite();
        cm.J((cm)((cm)yo_2.instance));
        return a2;
    }

    public Yo setId(int n2) {
        Yo_2 a2;
        int b2 = n2;
        Yo_2 yo_2 = a2 = this;
        yo_2.copyOnWrite();
        cm.J((cm)((cm)yo_2.instance), (int)b2);
        return a2;
    }

    public Yo clearOffsetY() {
        Yo_2 a2;
        Yo_2 yo_2 = a2;
        yo_2.copyOnWrite();
        cm.d((cm)((cm)yo_2.instance));
        return a2;
    }

    public boolean hasOptions() {
        Yo_2 a2;
        return ((cm)a2.instance).hasOptions();
    }

    public Yo setOffsetY(float f2) {
        Yo_2 a2;
        float b2 = f2;
        Yo_2 yo_2 = a2 = this;
        yo_2.copyOnWrite();
        cm.f((cm)((cm)yo_2.instance), (float)b2);
        return a2;
    }

    public float getOffsetZ() {
        Yo_2 a2;
        return ((cm)a2.instance).getOffsetZ();
    }
}

