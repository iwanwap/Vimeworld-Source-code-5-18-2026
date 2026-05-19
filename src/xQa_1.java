/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bPa
 *  cpa
 *  lA
 *  xQa
 */
import com.google.protobuf.GeneratedMessageLite;

public final class xQa_1
extends GeneratedMessageLite.Builder<cpa, xQa>
implements lA {
    public boolean getMicroExists() {
        xQa_1 a2;
        return ((cpa)a2.instance).getMicroExists();
    }

    public xQa setMicroDisabled(boolean bl) {
        xQa_1 a2;
        boolean b2 = bl;
        xQa_1 xQa_12 = a2 = this;
        xQa_12.copyOnWrite();
        cpa.f((cpa)((cpa)xQa_12.instance), (boolean)b2);
        return a2;
    }

    private xQa_1() {
        super(cpa.J());
        xQa_1 a2;
    }

    public boolean getMicroDisabled() {
        xQa_1 a2;
        return ((cpa)a2.instance).getMicroDisabled();
    }

    public xQa clearMicroDisabled() {
        xQa_1 a2;
        xQa_1 xQa_12 = a2;
        xQa_12.copyOnWrite();
        cpa.f((cpa)((cpa)xQa_12.instance));
        return a2;
    }

    public /* synthetic */ xQa_1(bPa bPa2) {
        xQa_1 b2 = bPa2;
        xQa_1 a2 = this;
        a2();
    }

    public xQa clearMicroExists() {
        xQa_1 a2;
        xQa_1 xQa_12 = a2;
        xQa_12.copyOnWrite();
        cpa.J((cpa)((cpa)xQa_12.instance));
        return a2;
    }

    public xQa setMicroExists(boolean bl) {
        xQa_1 a2;
        boolean b2 = bl;
        xQa_1 xQa_12 = a2 = this;
        xQa_12.copyOnWrite();
        cpa.J((cpa)((cpa)xQa_12.instance), (boolean)b2);
        return a2;
    }
}

