/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ISa
 *  LW
 *  Lqa
 *  SQa
 *  Usa
 *  Uta
 *  WQa
 *  Waa
 *  XB
 *  aRa
 *  dX
 *  gc
 *  pb
 *  tCa
 *  ura
 *  vRa
 *  vU
 *  xOa
 *  zsa
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class oy_1
implements pb {
    private static final Logger A = LogManager.getLogger();
    public final File I;

    public boolean C(String string) {
        String b2 = string;
        oy_1 a2 = this;
        return new File(a2.I, b2).isDirectory();
    }

    public boolean l(String string) {
        String b2 = string;
        oy_1 a2 = this;
        return uSa.E != 0;
    }

    public boolean J(String string) {
        File file;
        block6: {
            String b2 = string;
            oy_1 a2 = this;
            File file2 = new File(a2.I, b2);
            if (!file2.exists()) {
                return vRa.d != 0;
            }
            A.info(new StringBuilder().insert(5 >> 3, Xpa.y).append(b2).toString());
            int n2 = b2 = vRa.d;
            while (n2 <= tTa.h) {
                A.info(new StringBuilder().insert(3 ^ 3, xOa.D).append(b2).append(Usa.E).toString());
                if (oy_1.J(file2.listFiles())) {
                    file = file2;
                    break block6;
                }
                A.warn(fqa.h);
                if (b2 < tTa.h) {
                    try {
                        Thread.sleep(zsa.R);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                n2 = ++b2;
            }
            file = file2;
        }
        return file.delete();
    }

    public boolean d(String string) {
        Object b22 = string;
        oy_1 a2 = this;
        if (((File)(b22 = new File(a2.I, (String)b22))).exists()) {
            return uSa.E != 0;
        }
        try {
            ((File)b22).mkdir();
            ((File)b22).delete();
            return vRa.d != 0;
        }
        catch (Throwable b22) {
            A.warn(SQa.G, b22);
            return uSa.E != 0;
        }
    }

    public boolean f(String string) {
        String b2 = string;
        oy_1 a2 = this;
        return uSa.E != 0;
    }

    public boolean J(String string, gc gc2) {
        oy_1 c2 = gc2;
        oy_1 a2 = this;
        return uSa.E != 0;
    }

    /*
     * WARNING - void declaration
     */
    public XB J(String string, boolean bl) {
        void b2;
        boolean c2 = bl;
        oy_1 a2 = this;
        return new dX(a2.I, (String)b2, c2);
    }

    public oy_1(File file) {
        File b2 = file;
        oy_1 a2 = this;
        if (!b2.exists()) {
            b2.mkdirs();
        }
        a2.I = b2;
    }

    public vU J(String string) {
        oy_1 b22;
        File a2;
        oy_1 oy_12 = this;
        if (!(a2 = new File(oy_12.I, (String)((Object)a2))).exists()) {
            return null;
        }
        File file = new File(a2, ISa.w);
        if (file.exists()) {
            try {
                b22 = tCa.J((InputStream)new FileInputStream(file));
                Waa waa2 = b22.J(Lqa.o);
                return new vU(waa2);
            }
            catch (Exception b22) {
                A.error(new StringBuilder().insert(3 ^ 3, Nra.S).append(file).toString(), (Throwable)b22);
            }
        }
        if ((file = new File(a2, rta.Aa)).exists()) {
            try {
                b22 = tCa.J((InputStream)new FileInputStream(file));
                Waa waa3 = b22.J(Lqa.o);
                return new vU(waa3);
            }
            catch (Exception b22) {
                A.error(new StringBuilder().insert(2 & 5, Nra.S).append(file).toString(), (Throwable)b22);
            }
        }
        return null;
    }

    public String J() {
        return Uta.O;
    }

    public static boolean J(File[] fileArray) {
        int n2;
        File[] fileArray2 = fileArray;
        int n3 = n2 = uSa.E;
        while (n3 < fileArray2.length) {
            File a2 = fileArray2[n2];
            A.debug(new StringBuilder().insert(3 & 4, WQa.B).append(a2).toString());
            if (a2.isDirectory() && !oy_1.J(a2.listFiles())) {
                A.warn(new StringBuilder().insert(3 >> 2, mPa.O).append(a2).toString());
                return uSa.E != 0;
            }
            if (!a2.delete()) {
                A.warn(new StringBuilder().insert(3 >> 2, xOa.s).append(a2).toString());
                return uSa.E != 0;
            }
            n3 = ++n2;
        }
        return vRa.d != 0;
    }

    public void J() {
    }

    public List<LW> J() throws aRa {
        int n2;
        oy_1 oy_12 = this;
        ArrayList<LW> arrayList = Lists.newArrayList();
        int n3 = n2 = uSa.E;
        while (n3 < tTa.h) {
            String string = new StringBuilder().insert(2 & 5, ura.ja).append(n2 + vRa.d).toString();
            oy_1 a2 = oy_12.J(string);
            if (a2 != null) {
                arrayList.add(new LW(string, Mqa.y, a2.e(), a2.J(), a2.J(), uSa.E != 0, a2.d(), a2.M()));
            }
            n3 = ++n2;
        }
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    public void J(String string, String string2) {
        Object c2 = string;
        oy_1 b2 = this;
        if (((File)(c2 = new File(b2.I, (String)c2))).exists() && ((File)(c2 = new File((File)c2, ISa.w))).exists()) {
            try {
                void a2;
                Waa waa2 = tCa.J((InputStream)new FileInputStream((File)c2));
                waa2.J(Lqa.o).J(UTa.B, (String)a2);
                tCa.J((Waa)waa2, (OutputStream)new FileOutputStream((File)c2));
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

