/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  EN
 *  Wo
 *  gn
 */
import com.google.protobuf.GeneratedMessageLite;

public final class EN_2
extends GeneratedMessageLite.Builder<gn, EN>
implements Ld {
    @Override
    public int getRotationValue() {
        EN_2 a2;
        return ((gn)a2.instance).getRotationValue();
    }

    @Override
    public int getId() {
        EN_2 a2;
        return ((gn)a2.instance).getId();
    }

    public /* synthetic */ EN_2(AN aN2) {
        EN_2 b2 = aN2;
        EN_2 a2 = this;
        a2();
    }

    public EN clearAlignment() {
        EN_2 a2;
        EN_2 eN_2 = a2;
        eN_2.copyOnWrite();
        gn.C((gn)((gn)eN_2.instance));
        return a2;
    }

    public EN clearRotation() {
        EN_2 a2;
        EN_2 eN_2 = a2;
        eN_2.copyOnWrite();
        gn.f((gn)((gn)eN_2.instance));
        return a2;
    }

    @Override
    public boolean hasRotation() {
        EN_2 a2;
        return ((gn)a2.instance).hasRotation();
    }

    @Override
    public boolean getPersistent() {
        EN_2 a2;
        return ((gn)a2.instance).getPersistent();
    }

    public EN setAlignment(yM yM2) {
        EN_2 a2;
        yM b2 = yM2;
        EN_2 eN_2 = a2 = this;
        eN_2.copyOnWrite();
        gn.J((gn)((gn)eN_2.instance), (yM)b2);
        return a2;
    }

    public EN setRotation(Wo wo2) {
        EN_2 a2;
        EN_2 b2 = wo2;
        EN_2 eN_2 = a2 = this;
        eN_2.copyOnWrite();
        gn.J((gn)((gn)eN_2.instance), (Wo)b2);
        return a2;
    }

    public EN setRotationValue(int n2) {
        EN_2 a2;
        int b2 = n2;
        EN_2 eN_2 = a2 = this;
        eN_2.copyOnWrite();
        gn.l((gn)((gn)eN_2.instance), (int)b2);
        return a2;
    }

    @Override
    public Wo getRotation() {
        EN_2 a2;
        return ((gn)a2.instance).getRotation();
    }

    @Override
    public int getAlignmentValue() {
        EN_2 a2;
        return ((gn)a2.instance).getAlignmentValue();
    }

    private EN_2() {
        super(gn.f());
        EN_2 a2;
    }

    public EN clearPersistent() {
        EN_2 a2;
        EN_2 eN_2 = a2;
        eN_2.copyOnWrite();
        gn.J((gn)((gn)eN_2.instance));
        return a2;
    }

    public EN setAlignmentValue(int n2) {
        EN_2 a2;
        int b2 = n2;
        EN_2 eN_2 = a2 = this;
        eN_2.copyOnWrite();
        gn.f((gn)((gn)eN_2.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasPersistent() {
        EN_2 a2;
        return ((gn)a2.instance).hasPersistent();
    }

    public EN setId(int n2) {
        EN_2 a2;
        int b2 = n2;
        EN_2 eN_2 = a2 = this;
        eN_2.copyOnWrite();
        gn.J((gn)((gn)eN_2.instance), (int)b2);
        return a2;
    }

    @Override
    public boolean hasAlignment() {
        EN_2 a2;
        return ((gn)a2.instance).hasAlignment();
    }

    public EN setPersistent(boolean bl) {
        EN_2 a2;
        boolean b2 = bl;
        EN_2 eN_2 = a2 = this;
        eN_2.copyOnWrite();
        gn.J((gn)((gn)eN_2.instance), (boolean)b2);
        return a2;
    }

    @Override
    public yM getAlignment() {
        EN_2 a2;
        return ((gn)a2.instance).getAlignment();
    }

    public EN clearId() {
        EN_2 a2;
        EN_2 eN_2 = a2;
        eN_2.copyOnWrite();
        gn.l((gn)((gn)eN_2.instance));
        return a2;
    }
}

