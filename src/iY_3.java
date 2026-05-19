/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  TQa
 *  VQa
 *  hZ
 *  hra
 */
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iY_3 {
    private static final Map<File, hZ> I = Maps.newHashMap();

    /*
     * WARNING - void declaration
     */
    public static synchronized hZ J(File file, int n2, int n3) {
        void b22;
        int c22 = n3;
        File a2 = file;
        File file2 = new File(a2, Fua.d);
        File b22 = new File(file2, TQa.Y + (int)(b22 >> tTa.h) + VQa.ja + (c22 >> tTa.h) + cPa.H);
        hZ c22 = I.get(b22);
        if (c22 != null) {
            return c22;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (I.size() >= hra.Ja) {
            iY_3.J();
        }
        c22 = new hZ(b22);
        I.put(b22, c22);
        return c22;
    }

    public static synchronized void J() {
        for (hZ hZ2 : I.values()) {
            try {
                if (hZ2 == null) continue;
                hZ2.J();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        I.clear();
    }

    /*
     * WARNING - void declaration
     */
    public static DataInputStream J(File file, int n2, int n3) {
        void b2;
        int c2 = n3;
        File a2 = file;
        return iY_3.J(a2, (int)b2, c2).J(b2 & tua.U, c2 & tua.U);
    }

    /*
     * WARNING - void declaration
     */
    public static DataOutputStream J(File file, int n2, int n3) {
        void b2;
        int c2 = n3;
        File a2 = file;
        return iY_3.J(a2, (int)b2, c2).J(b2 & tua.U, c2 & tua.U);
    }

    public iY_3() {
        iY_3 a2;
    }
}

