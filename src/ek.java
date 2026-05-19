/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  AN
 *  Bl
 *  Kj
 *  XL
 *  ZK
 *  lk
 *  z
 */
import com.google.protobuf.GeneratedMessageLite;

public final class ek
extends GeneratedMessageLite.Builder<ZK, ek>
implements z {
    public ek mergeBlock(Kj kj) {
        ek a2;
        ek b2 = kj;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.f((ZK)((ZK)ek2.instance), (Kj)b2);
        return a2;
    }

    public ek setKey(int n2) {
        ek a2;
        int b2 = n2;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.l((ZK)((ZK)ek2.instance), (int)b2);
        return a2;
    }

    public boolean hasKey() {
        ek a2;
        return ((ZK)a2.instance).hasKey();
    }

    public int getKey() {
        ek a2;
        return ((ZK)a2.instance).getKey();
    }

    public ek setEntityType(FK fK2) {
        ek a2;
        FK b2 = fK2;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance), (FK)b2);
        return a2;
    }

    public /* synthetic */ ek(AN aN2) {
        ek b2 = aN2;
        ek a2 = this;
        a2();
    }

    public ek setShow(boolean bl) {
        ek a2;
        boolean b2 = bl;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance), (boolean)b2);
        return a2;
    }

    public ek clearType() {
        ek a2;
        ek ek2 = a2;
        ek2.copyOnWrite();
        ZK.d((ZK)((ZK)ek2.instance));
        return a2;
    }

    public ek setBlock(Kj kj) {
        ek a2;
        ek b2 = kj;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance), (Kj)b2);
        return a2;
    }

    public ek clearShow() {
        ek a2;
        ek ek2 = a2;
        ek2.copyOnWrite();
        ZK.f((ZK)((ZK)ek2.instance));
        return a2;
    }

    public ek setTypeValue(int n2) {
        ek a2;
        int b2 = n2;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.f((ZK)((ZK)ek2.instance), (int)b2);
        return a2;
    }

    public FK getEntityType() {
        ek a2;
        return ((ZK)a2.instance).getEntityType();
    }

    public Kj getBlock() {
        ek a2;
        return ((ZK)a2.instance).getBlock();
    }

    public ek clearBlock() {
        ek a2;
        ek ek2 = a2;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance));
        return a2;
    }

    public ek setBlock(XL xL) {
        ek a2;
        ek b2 = xL;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance), (Kj)((Kj)b2.build()));
        return a2;
    }

    private ek() {
        super(ZK.f());
        ek a2;
    }

    public boolean hasBlock() {
        ek a2;
        return ((ZK)a2.instance).hasBlock();
    }

    public ek clearKey() {
        ek a2;
        ek ek2 = a2;
        ek2.copyOnWrite();
        ZK.l((ZK)((ZK)ek2.instance));
        return a2;
    }

    public ek clearData() {
        ek a2;
        ek ek2 = a2;
        ek2.copyOnWrite();
        ZK.e((ZK)((ZK)ek2.instance));
        return a2;
    }

    public int getEntityTypeValue() {
        ek a2;
        return ((ZK)a2.instance).getEntityTypeValue();
    }

    public Bl getType() {
        ek a2;
        return ((ZK)a2.instance).getType();
    }

    public ek setEntityTypeValue(int n2) {
        ek a2;
        int b2 = n2;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance), (int)b2);
        return a2;
    }

    public ek setType(Bl bl) {
        ek a2;
        ek b2 = bl;
        ek ek2 = a2 = this;
        ek2.copyOnWrite();
        ZK.J((ZK)((ZK)ek2.instance), (Bl)b2);
        return a2;
    }

    public ek clearEntityType() {
        ek a2;
        ek ek2 = a2;
        ek2.copyOnWrite();
        ZK.C((ZK)((ZK)ek2.instance));
        return a2;
    }

    public int getTypeValue() {
        ek a2;
        return ((ZK)a2.instance).getTypeValue();
    }

    public boolean getShow() {
        ek a2;
        return ((ZK)a2.instance).getShow();
    }

    public lk getDataCase() {
        ek a2;
        return ((ZK)a2.instance).getDataCase();
    }

    public boolean hasEntityType() {
        ek a2;
        return ((ZK)a2.instance).hasEntityType();
    }
}

