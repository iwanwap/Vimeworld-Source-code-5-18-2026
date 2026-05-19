/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Lz
 *  caa
 *  vL
 */
import io.netty.buffer.ByteBuf;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class cz
extends caa {
    public final /* synthetic */ kz I;

    public void J(String string) {
        cz a2;
        Object b2 = string;
        cz cz2 = a2 = this;
        super.J((String)b2);
        cz2.I.f();
    }

    public void J(ByteBuf byteBuf) {
        ByteBuf b2 = byteBuf;
        cz a2 = this;
        b2.writeInt(a2.I.pos.getX());
        b2.writeInt(a2.I.pos.getY());
        b2.writeInt(a2.I.pos.getZ());
    }

    public cz(kz kz2) {
        Object b2 = kz2;
        cz a2 = this;
        a2.I = b2;
    }

    public Lz J() {
        cz a2;
        return new Lz((double)a2.I.pos.getX() + kTa.B, (double)a2.I.pos.getY() + kTa.B, (double)a2.I.pos.getZ() + kTa.B);
    }

    public int J() {
        return uSa.E;
    }

    public XF J() {
        cz a2;
        return a2.I.pos;
    }

    public vL J() {
        return null;
    }

    public void J() {
        cz a2;
        a2.I.f().C(a2.I.pos);
    }

    public Gg J() {
        cz a2;
        return a2.I.f();
    }
}

