/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  SN
 *  YB
 *  vm
 */
import com.google.protobuf.GeneratedMessageLite;

public final class CN
extends GeneratedMessageLite.Builder<vm, CN>
implements YB {
    public /* synthetic */ CN(AN aN2) {
        CN b2 = aN2;
        CN a2 = this;
        a2();
    }

    public CN setKeybind(SN sN2) {
        CN a2;
        CN b2 = sN2;
        CN cN = a2 = this;
        cN.copyOnWrite();
        vm.f((vm)((vm)cN.instance), (SN)b2);
        return a2;
    }

    private CN() {
        super(vm.J());
        CN a2;
    }

    public boolean hasKeybind() {
        CN a2;
        return ((vm)a2.instance).hasKeybind();
    }

    public SN getKeybind() {
        CN a2;
        return ((vm)a2.instance).getKeybind();
    }

    public CN setKeybind(zm zm2) {
        CN a2;
        GeneratedMessageLite.Builder b2 = zm2;
        CN cN = a2 = this;
        cN.copyOnWrite();
        vm.f((vm)((vm)cN.instance), (SN)((SN)b2.build()));
        return a2;
    }

    public CN mergeKeybind(SN sN2) {
        CN a2;
        CN b2 = sN2;
        CN cN = a2 = this;
        cN.copyOnWrite();
        vm.J((vm)((vm)cN.instance), (SN)b2);
        return a2;
    }

    public CN clearKeybind() {
        CN a2;
        CN cN = a2;
        cN.copyOnWrite();
        vm.J((vm)((vm)cN.instance));
        return a2;
    }
}

