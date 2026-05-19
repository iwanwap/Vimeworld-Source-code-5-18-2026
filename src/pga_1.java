/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  HY
 *  Lz
 *  RGa
 *  caa
 *  ld
 *  vL
 *  vRa
 */
import io.netty.buffer.ByteBuf;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class pga_1
extends caa {
    public final /* synthetic */ RGa I;

    public Gg J() {
        pga_1 a2;
        return a2.I.j;
    }

    public Lz J() {
        pga_1 a2;
        return new Lz(a2.I.la, a2.I.Z, a2.I.A);
    }

    public void J() {
        pga_1 a2;
        pga_1 pga_12 = a2;
        a2.I.J().J(AQa.ba, pga_12.f());
        pga_12.I.J().J(osa.c, HY.J((ld)a2.f()));
    }

    public pga_1(RGa rGa2) {
        pga_1 b2 = rGa2;
        pga_1 a2 = this;
        a2.I = b2;
    }

    public XF J() {
        pga_1 a2;
        return new XF(a2.I.la, a2.I.Z + kTa.B, a2.I.A);
    }

    public int J() {
        return vRa.d;
    }

    public vL J() {
        pga_1 a2;
        return a2.I;
    }

    public void J(ByteBuf byteBuf) {
        ByteBuf b2 = byteBuf;
        pga_1 a2 = this;
        b2.writeInt(a2.I.M());
    }
}

