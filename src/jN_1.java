/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  BN
 *  Dm
 *  jN
 *  xa
 */
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

public final class jN_1
extends GeneratedMessageLite.Builder<MN, jN>
implements xa {
    public jN setKeydown(boolean bl) {
        jN_1 a2;
        boolean b2 = bl;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.f((MN)jN_12.instance, b2);
        return a2;
    }

    public jN setDoubleClick(boolean bl) {
        jN_1 a2;
        boolean b2 = bl;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.C((MN)jN_12.instance, b2);
        return a2;
    }

    public BN getActions(int n2) {
        int b2 = n2;
        jN_1 a2 = this;
        return ((MN)a2.instance).getActions(b2);
    }

    public jN clearDoubleClick() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public jN setActions(int n2, Dm dm2) {
        void b2;
        jN_1 a2;
        jN_1 c2 = dm2;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, (int)b2, (BN)c2.build());
        return a2;
    }

    public List<Integer> getModifiersList() {
        jN_1 a2;
        return Collections.unmodifiableList(((MN)a2.instance).getModifiersList());
    }

    public int getActionsCount() {
        jN_1 a2;
        return ((MN)a2.instance).getActionsCount();
    }

    public jN setTimeout(int n2) {
        jN_1 a2;
        int b2 = n2;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.f((MN)jN_12.instance, b2);
        return a2;
    }

    public boolean hasKeyup() {
        jN_1 a2;
        return ((MN)a2.instance).hasKeyup();
    }

    public jN addActions(BN bN) {
        jN_1 a2;
        jN_1 b2 = bN;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, (BN)b2);
        return a2;
    }

    public boolean getKeydown() {
        jN_1 a2;
        return ((MN)a2.instance).getKeydown();
    }

    public boolean hasTimeout() {
        jN_1 a2;
        return ((MN)a2.instance).hasTimeout();
    }

    public List<BN> getActionsList() {
        jN_1 a2;
        return Collections.unmodifiableList(((MN)a2.instance).getActionsList());
    }

    public jN setCancel(boolean bl) {
        jN_1 a2;
        boolean b2 = bl;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, b2);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public jN setModifiers(int n2, int n3) {
        void b2;
        jN_1 a2;
        int c2 = n3;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, (int)b2, c2);
        return a2;
    }

    public boolean hasCancel() {
        jN_1 a2;
        return ((MN)a2.instance).hasCancel();
    }

    public boolean getDoubleClick() {
        jN_1 a2;
        return ((MN)a2.instance).getDoubleClick();
    }

    public jN clearModifiers() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.C((MN)jN_12.instance);
        return a2;
    }

    public boolean hasDoubleClick() {
        jN_1 a2;
        return ((MN)a2.instance).hasDoubleClick();
    }

    public jN addModifiers(int n2) {
        jN_1 a2;
        int b2 = n2;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, b2);
        return a2;
    }

    public jN clearCancel() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.l((MN)jN_12.instance);
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public jN setActions(int n2, BN bN) {
        void b2;
        jN_1 a2;
        jN_1 c2 = bN;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, (int)b2, (BN)c2);
        return a2;
    }

    public jN addAllModifiers(Iterable<? extends Integer> iterable) {
        jN_1 a2;
        Iterable<? extends Integer> b2 = iterable;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.f((MN)jN_12.instance, b2);
        return a2;
    }

    public jN clearTimeout() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.f((MN)jN_12.instance);
        return a2;
    }

    public jN clearActions() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.M((MN)jN_12.instance);
        return a2;
    }

    public int getTimeout() {
        jN_1 a2;
        return ((MN)a2.instance).getTimeout();
    }

    public jN setKeyup(boolean bl) {
        jN_1 a2;
        boolean b2 = bl;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.l((MN)jN_12.instance, b2);
        return a2;
    }

    public jN addActions(Dm dm2) {
        jN_1 a2;
        jN_1 b2 = dm2;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, (BN)b2.build());
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public jN addActions(int n2, BN bN) {
        void b2;
        jN_1 a2;
        jN_1 c2 = bN;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.f((MN)jN_12.instance, (int)b2, (BN)c2);
        return a2;
    }

    public jN addAllActions(Iterable<? extends BN> iterable) {
        jN_1 a2;
        Iterable<? extends BN> b2 = iterable;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.J((MN)jN_12.instance, b2);
        return a2;
    }

    private jN_1() {
        super(MN.f());
        jN_1 a2;
    }

    public /* synthetic */ jN_1(AN aN2) {
        jN_1 b2 = aN2;
        jN_1 a2 = this;
        a2();
    }

    /*
     * WARNING - void declaration
     */
    public jN addActions(int n2, Dm dm2) {
        void b2;
        jN_1 a2;
        jN_1 c2 = dm2;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.f((MN)jN_12.instance, (int)b2, (BN)c2.build());
        return a2;
    }

    public jN clearKeydown() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.e((MN)jN_12.instance);
        return a2;
    }

    public boolean getCancel() {
        jN_1 a2;
        return ((MN)a2.instance).getCancel();
    }

    public jN removeActions(int n2) {
        jN_1 a2;
        int b2 = n2;
        jN_1 jN_12 = a2 = this;
        jN_12.copyOnWrite();
        MN.l((MN)jN_12.instance, b2);
        return a2;
    }

    public int getModifiers(int n2) {
        int b2 = n2;
        jN_1 a2 = this;
        return ((MN)a2.instance).getModifiers(b2);
    }

    public boolean getKeyup() {
        jN_1 a2;
        return ((MN)a2.instance).getKeyup();
    }

    public jN clearKeyup() {
        jN_1 a2;
        jN_1 jN_12 = a2;
        jN_12.copyOnWrite();
        MN.d((MN)jN_12.instance);
        return a2;
    }

    public int getModifiersCount() {
        jN_1 a2;
        return ((MN)a2.instance).getModifiersCount();
    }

    public boolean hasKeydown() {
        jN_1 a2;
        return ((MN)a2.instance).hasKeydown();
    }
}

