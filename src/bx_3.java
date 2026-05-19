/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  WSa
 *  Zua
 *  asa
 *  bx
 *  vRa
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bx_3 {
    private int k;
    private Boolean j;
    public final /* synthetic */ rw J;
    private long A;
    private String I;

    private void l() {
        Object object = this;
        Object a2 = ((bx_3)object).J();
        if (((File)a2).exists()) {
            ((File)a2).delete();
            if (((bx_3)object).I.contains(WSa.f)) {
                String[] stringArray;
                Object object2 = a2 = ((File)a2).getParentFile();
                while (!(((File)object2).equals(rw.J(((bx_3)object).J)) || (stringArray = ((File)a2).list()) != null && stringArray.length != 0)) {
                    ((File)a2).delete();
                    a2 = ((File)a2).getParentFile();
                    object2 = a2;
                }
            }
        }
    }

    public static /* synthetic */ void f(bx a2) {
        super.J();
    }

    public String J() {
        bx_3 a2;
        return a2.I;
    }

    public void serialize(DataOutputStream dataOutputStream) throws IOException {
        DataOutputStream b2 = dataOutputStream;
        bx_3 a2 = this;
        Object object = b2;
        bx_3 bx_32 = a2;
        b2.writeUTF(bx_32.I);
        ((DataOutputStream)object).writeLong(bx_32.A);
        ((DataOutputStream)object).writeInt(a2.k);
    }

    public void deserialize(DataInputStream dataInputStream, int n2) throws IOException {
        bx_3 b2;
        DataInputStream c2 = dataInputStream;
        bx_3 bx_32 = b2 = this;
        DataInputStream dataInputStream2 = c2;
        b2.I = dataInputStream2.readUTF();
        bx_32.A = dataInputStream2.readLong();
        bx_32.k = c2.readInt();
    }

    public static /* synthetic */ void J(bx a2) {
        super.l();
    }

    public static /* synthetic */ String J(bx a2) {
        return a2.I;
    }

    public bx_3(rw rw2) {
        rw b2 = rw2;
        bx_3 a2 = this;
        a2.J = b2;
    }

    public static /* synthetic */ long J(bx a2) {
        return a2.A;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public FileOutputStream J() throws IOException {
        Object object = this;
        File file = ((bx_3)object).J();
        Object a2 = file.getParentFile();
        if (!((File)a2).exists()) {
            ((File)a2).mkdirs();
        }
        a2 = ((bx_3)object).J;
        synchronized (a2) {
            ((bx_3)object).j = null;
        }
        return new FileOutputStream(file);
    }

    public static /* synthetic */ String J(bx bx2, String string) {
        Object b2 = string;
        bx a2 = bx2;
        a2.I = b2;
        return a2.I;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean J() {
        bx_3 bx_32 = this;
        if (bx_32.j != null) {
            return bx_32.j;
        }
        rw rw2 = bx_32.J;
        synchronized (rw2) {
            boolean bl2;
            block10: {
                boolean a2;
                block9: {
                    block8: {
                        bx_32.j = bx_32.J().exists();
                        a2 = bx_32.j;
                        if (!a2) break block8;
                        if (rw.J(bx_32.J).containsKey(bx_32.I)) break block9;
                        if (bx_32.k == 0) {
                            bx_32.k = gsa.Y;
                        }
                        bx_3 bx_33 = bx_32;
                        bx_33.J();
                        rw.J(bx_33.J).put(bx_32.I, bx_32);
                        bx_32.J.I = vRa.d;
                        bl2 = a2;
                        break block10;
                    }
                    if (rw.J(bx_32.J).containsKey(bx_32.I)) {
                        rw.J(bx_32.J).remove(bx_32.I);
                        bx_32.J.I = vRa.d;
                    }
                }
                bl2 = a2;
            }
            return bl2;
        }
    }

    public File J() {
        bx_3 a2;
        return new File(rw.J(a2.J), a2.I);
    }

    public rw J() {
        bx_3 a2;
        return a2.J;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void f() {
        bx_3 bx_32 = this;
        rw a2 = bx_32.J;
        synchronized (a2) {
            if (rw.J(bx_32.J).remove(bx_32.I, bx_32)) {
                bx_32.J.I = vRa.d;
            }
            bx_32.j = null;
        }
        bx_32.l();
    }

    public FileInputStream J() throws IOException {
        bx_3 a2;
        return new FileInputStream(a2.J());
    }

    public String toString() {
        bx_3 a2;
        return new StringBuilder().insert(3 & 4, Zua.V).append(a2.I).append(Iqa.f).toString();
    }

    private void J() {
        bx_3 a2;
        if (a2.k != 0) {
            a2.A = System.currentTimeMillis() + (long)a2.k * asa.fa;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public void J(int n2) {
        bx_3 bx_32 = this;
        rw b2 = bx_32.J;
        synchronized (b2) {
            void a2;
            bx_3 bx_33 = bx_32;
            bx_33.k = a2;
            bx_33.J();
            rw.J(bx_33.J).put(bx_32.I, bx_32);
            bx_32.J.I = vRa.d;
            return;
        }
    }
}

