/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  DBa
 *  Faa
 *  Pd
 *  asa
 *  pv
 *  ru.vimeworld.brainstorm.NativeClassLoaderUtils
 *  vRa
 *  yQa
 */
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import ru.vimeworld.brainstorm.NativeClassLoaderUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class VCa
implements KC<Pd> {
    private boolean k;
    public int[] j;
    public int[] J;
    private boolean A;
    private zaa[] I;

    public int l(int n2) {
        int b2 = n2;
        VCa a2 = this;
        return a2.I[b2].I;
    }

    public int f(int n2) {
        int b2 = n2;
        VCa a2 = this;
        return a2.J[b2];
    }

    /*
     * WARNING - void declaration
     */
    public VCa(List<Faa> list) {
        int b2;
        void a2;
        VCa vCa;
        VCa vCa2 = vCa = this;
        VCa vCa3 = vCa;
        vCa3.A = uSa.E;
        int n2 = a2.size();
        vCa2.j = new int[n2];
        vCa3.J = new int[n2];
        vCa2.I = new zaa[n2];
        vCa.k = !((Faa)a2.get((int)uSa.E)).J().F.f() ? vRa.d : uSa.E;
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            Faa faa2 = (Faa)a2.get(b2);
            zaa zaa2 = DBa.J((Faa)faa2, vRa.d != 0, (boolean)vCa.k, (int)yQa.j);
            VCa vCa4 = vCa;
            vCa4.j[b2] = faa2.I;
            vCa4.J[b2] = faa2.G;
            vCa4.I[b2++] = zaa2;
            n3 = b2;
        }
    }

    public byte[] J(int n2) {
        int b2 = n2;
        VCa a2 = this;
        return a2.I[b2].A;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Pd pd2) {
        void a2;
        VCa vCa = this;
        if (!vCa.A && DBa.f() && pv.J()) {
            byte[] byArray;
            vCa.A = vRa.d;
            Object b2 = new int[vCa.j.length + vCa.J.length];
            System.arraycopy(vCa.j, uSa.E, b2, uSa.E, vCa.j.length);
            System.arraycopy(vCa.J, uSa.E, b2, vCa.j.length, vCa.J.length);
            byte[] byArray2 = DBa.J((int[])b2);
            try {
                Object[] objectArray = new Object[uqa.g];
                objectArray[uSa.E] = nua.h;
                objectArray[vRa.d] = byArray2;
                byArray = byArray2 = (byte[])NativeClassLoaderUtils.call((Object)objectArray);
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                LogManager.getLogger(Xpa.D).error(asa.Ga, (Throwable)unsatisfiedLinkError);
                byArray = byArray2;
            }
            int[] nArray = DBa.J((byte[])byArray);
            b2 = nArray;
            System.arraycopy(nArray, uSa.E, vCa.j, uSa.E, vCa.j.length);
            System.arraycopy(b2, vCa.j.length, vCa.J, uSa.E, vCa.J.length);
        }
        a2.J(vCa);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void f(Lca lca) throws IOException {
        int b2;
        void a2;
        VCa vCa = this;
        void v0 = a2;
        v0.writeBoolean(vCa.k);
        v0.writeVarIntToBuffer(vCa.I.length);
        int n2 = b2 = uSa.E;
        while (n2 < vCa.j.length) {
            a2.writeInt(vCa.j[b2]);
            a2.writeInt(vCa.J[b2]);
            a2.writeShort((short)(vCa.I[++b2].I & yQa.j));
            n2 = b2;
        }
        int n3 = b2 = uSa.E;
        while (n3 < vCa.j.length) {
            a2.writeBytes(vCa.I[b2++].A);
            n3 = b2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Lca lca) throws IOException {
        int b2;
        void a2;
        VCa vCa;
        VCa vCa2 = vCa = this;
        VCa vCa3 = vCa;
        vCa3.k = a2.readBoolean();
        int n2 = a2.readVarIntFromBuffer();
        vCa2.j = new int[n2];
        vCa3.J = new int[n2];
        vCa2.I = new zaa[n2];
        int n3 = b2 = uSa.E;
        while (n3 < n2) {
            VCa vCa4 = vCa;
            vCa4.j[b2] = a2.readInt();
            vCa4.J[b2] = a2.readInt();
            vCa4.I[b2] = new zaa();
            vCa4.I[b2].I = a2.readShort() & yQa.j;
            int n4 = --1;
            vCa4.I[b2].A = new byte[DBa.J((int)Integer.bitCount(vCa.I[++b2].I), (boolean)vCa.k, vRa.d != 0)];
            n3 = b2;
        }
        int n5 = b2 = uSa.E;
        while (n5 < n2) {
            a2.readBytes(vCa.I[b2++].A);
            n5 = b2;
        }
    }

    public VCa() {
        VCa a2;
        a2.A = uSa.E;
    }

    public int J() {
        VCa a2;
        return a2.j.length;
    }

    public int J(int n2) {
        int b2 = n2;
        VCa a2 = this;
        return a2.j[b2];
    }
}

