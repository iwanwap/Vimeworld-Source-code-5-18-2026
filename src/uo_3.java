/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Vm
 *  iC
 *  uo
 */
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

public final class uo_3
extends GeneratedMessageLite.Builder<En, uo>
implements iC {
    public uo mergeGui(ko ko2) {
        uo_3 a2;
        MessageLiteOrBuilder b2 = ko2;
        uo_3 uo_32 = a2 = this;
        uo_32.copyOnWrite();
        En.J((En)uo_32.instance, (ko)b2);
        return a2;
    }

    public boolean hasGui() {
        uo_3 a2;
        return ((En)a2.instance).hasGui();
    }

    public uo setGui(Vm vm2) {
        uo_3 a2;
        uo_3 b2 = vm2;
        uo_3 uo_32 = a2 = this;
        uo_32.copyOnWrite();
        En.f((En)uo_32.instance, (ko)b2.build());
        return a2;
    }

    public uo clearGui() {
        uo_3 a2;
        uo_3 uo_32 = a2;
        uo_32.copyOnWrite();
        En.J((En)uo_32.instance);
        return a2;
    }

    public ko getGui() {
        uo_3 a2;
        return ((En)a2.instance).getGui();
    }

    private uo_3() {
        super(En.J());
        uo_3 a2;
    }

    public /* synthetic */ uo_3(AN aN2) {
        uo_3 b2 = aN2;
        uo_3 a2 = this;
        a2();
    }

    public uo setGui(ko ko2) {
        uo_3 a2;
        MessageLiteOrBuilder b2 = ko2;
        uo_3 uo_32 = a2 = this;
        uo_32.copyOnWrite();
        En.f((En)uo_32.instance, (ko)b2);
        return a2;
    }
}

