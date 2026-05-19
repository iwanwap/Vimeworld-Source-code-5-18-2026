/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  Lqa
 *  NCa
 *  OCa
 *  URa
 *  Waa
 *  XB
 *  oZ
 *  tCa
 *  vQa
 *  vU
 *  yc
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dX_1
implements XB,
Ec {
    private final File M;
    private final long k;
    private final File j;
    private final String J;
    private static final Logger A = LogManager.getLogger();
    private final File I;

    /*
     * WARNING - void declaration
     */
    @Override
    public Waa J(Sx sx2) {
        void a2;
        dX_1 dX_12 = this;
        dX_1 b2 = null;
        try {
            File file = new File(dX_12.M, new StringBuilder().insert(5 >> 3, a2.J().toString()).append(vQa.V).toString());
            if (file.exists() && file.isFile()) {
                b2 = tCa.J((InputStream)new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            A.warn(new StringBuilder().insert(2 & 5, Hra.Da).append(a2.J()).toString());
        }
        if (b2 != null) {
            a2.l((Waa)b2);
        }
        return b2;
    }

    public void J() throws oZ {
        DataInputStream a2;
        block5: {
            dX_1 dX_12 = this;
            File file = new File(dX_12.j, sOa.t);
            a2 = new DataInputStream(new FileInputStream(file));
            try {
                if (a2.readLong() == dX_12.k) break block5;
                throw new oZ(LPa.h);
            }
            catch (Throwable throwable) {
                try {
                    a2.close();
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new oZ(URa.J);
                }
            }
        }
        a2.close();
    }

    private void l() {
        dX_1 dX_12 = this;
        File file = new File(dX_12.j, sOa.t);
        DataOutputStream a2 = new DataOutputStream(new FileOutputStream(file));
        try {
            a2.writeLong(dX_12.k);
        }
        catch (Throwable throwable) {
            try {
                a2.close();
                throw throwable;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                throw new RuntimeException(URa.J);
            }
        }
        a2.close();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void J(Sx sx2) {
        void a2;
        dX_1 dX_12 = this;
        try {
            dX_1 b2 = new Waa();
            a2.C((Waa)b2);
            File file = new File(dX_12.M, new StringBuilder().insert(3 & 4, a2.J().toString()).append(tua.E).toString());
            File file2 = new File(dX_12.M, new StringBuilder().insert(3 & 4, a2.J().toString()).append(vQa.V).toString());
            tCa.J((Waa)b2, (OutputStream)new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
            return;
        }
        catch (Exception b2) {
            A.warn(new StringBuilder().insert(3 >> 2, kua.Aa).append(a2.J()).toString());
            return;
        }
    }

    public File J() {
        dX_1 a2;
        return a2.j;
    }

    public void J(vU vU2, Waa waa2) {
        Waa a2;
        Object c22 = vU2;
        dX_1 b2 = this;
        c22 = c22.J(a2);
        a2 = new Waa();
        a2.J(Lqa.o, (NCa)c22);
        try {
            c22 = new File(b2.j, nOa.V);
            File file = new File(b2.j, rta.Aa);
            File file2 = new File(b2.j, ISa.w);
            tCa.J((Waa)a2, (OutputStream)new FileOutputStream((File)c22));
            if (file.exists()) {
                file.delete();
            }
            File file3 = file2;
            file3.renameTo(file);
            if (file3.exists()) {
                file2.delete();
            }
            Object object = c22;
            ((File)object).renameTo(file2);
            if (((File)object).exists()) {
                ((File)c22).delete();
                return;
            }
        }
        catch (Exception c22) {
            c22.printStackTrace();
        }
    }

    public File J(String string) {
        String b2 = string;
        dX_1 a2 = this;
        return new File(a2.I, new StringBuilder().insert(2 & 5, b2).append(vQa.V).toString());
    }

    public void f() {
    }

    public void J(vU vU2) {
        Object b22 = vU2;
        dX_1 a2 = this;
        b22 = b22.J();
        Waa waa2 = new Waa();
        waa2.J(Lqa.o, (NCa)b22);
        try {
            b22 = new File(a2.j, nOa.V);
            File file = new File(a2.j, rta.Aa);
            File file2 = new File(a2.j, ISa.w);
            tCa.J((Waa)waa2, (OutputStream)new FileOutputStream((File)b22));
            if (file.exists()) {
                file.delete();
            }
            File file3 = file2;
            file3.renameTo(file);
            if (file3.exists()) {
                file2.delete();
            }
            Object object = b22;
            ((File)object).renameTo(file2);
            if (((File)object).exists()) {
                ((File)b22).delete();
                return;
            }
        }
        catch (Exception b22) {
            b22.printStackTrace();
        }
    }

    public vU J() {
        dX_1 a22;
        dX_1 dX_12 = this;
        File file = new File(dX_12.j, ISa.w);
        if (file.exists()) {
            try {
                a22 = tCa.J((InputStream)new FileInputStream(file));
                Waa waa2 = a22.J(Lqa.o);
                return new vU(waa2);
            }
            catch (Exception a22) {
                a22.printStackTrace();
            }
        }
        if ((file = new File(dX_12.j, rta.Aa)).exists()) {
            try {
                a22 = tCa.J((InputStream)new FileInputStream(file));
                Waa waa3 = a22.J(Lqa.o);
                return new vU(waa3);
            }
            catch (Exception a22) {
                a22.printStackTrace();
            }
        }
        return null;
    }

    public String J() {
        dX_1 a2;
        return a2.J;
    }

    public yc J(Ty ty2) {
        Ty b2 = ty2;
        dX_1 a2 = this;
        throw new RuntimeException(Iqa.l);
    }

    @Override
    public String[] J() {
        int n2;
        String[] stringArray = this;
        String[] a2 = stringArray.M.list();
        if (a2 == null) {
            a2 = new String[uSa.E];
        }
        int n3 = n2 = uSa.E;
        while (n3 < a2.length) {
            if (a2[n2].endsWith(vQa.V)) {
                a2[n2] = a2[n2].substring(uSa.E, a2[n2].length() - AQa.P);
            }
            n3 = ++n2;
        }
        return a2;
    }

    /*
     * WARNING - void declaration
     */
    public dX_1(File file, String string, boolean bl) {
        void a2;
        void c2;
        dX_1 b2;
        String d2 = string;
        dX_1 dX_12 = b2 = this;
        dX_12.k = OCa.J();
        dX_1 dX_13 = b2;
        dX_13.j = new File((File)c2, d2);
        dX_12.j.mkdirs();
        b2.M = new File(b2.j, lQa.Ma);
        b2.I = new File(b2.j, Qpa.B);
        b2.I.mkdirs();
        b2.J = d2;
        if (a2 != false) {
            b2.M.mkdirs();
        }
        b2.l();
    }

    public Ec J() {
        dX_1 a2;
        return a2;
    }
}

