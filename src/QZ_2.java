/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Ay
 *  FY
 *  Haa
 *  ISa
 *  JPa
 *  JSa
 *  Jy
 *  LW
 *  MQa
 *  NCa
 *  Pqa
 *  QZ
 *  Ry
 *  SRa
 *  Waa
 *  XB
 *  aRa
 *  gc
 *  hZ
 *  iY
 *  lPa
 *  oy
 *  pPa
 *  tCa
 *  uZ
 *  ura
 *  vRa
 *  vU
 */
import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.File;
import java.io.FilenameFilter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class QZ_2
extends oy {
    private static final Logger I = LogManager.getLogger();

    /*
     * WARNING - void declaration
     */
    public XB J(String string, boolean bl2) {
        void b2;
        boolean c2 = bl2;
        QZ_2 a2 = this;
        return new uZ((File)((Object)a2.I), (String)b2, c2);
    }

    public String J() {
        return sqa.j;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void J(File file, File file2, Ay ay2, int n2, int n3, gc gc2) {
        QZ_2 qZ_2 = this;
        try {
            int n4;
            hZ f2;
            hZ e2;
            String string = e2.getName();
            e2 = new hZ((File)e2);
            String string2 = string;
            f2 = new hZ(new File((File)f2, string2.substring(uSa.E, string2.length() - BQa.Ka.length()) + cPa.H));
            int n5 = n4 = uSa.E;
            while (true) {
                void b2;
                void c2;
                int n6;
                int g2;
                if (n5 < fPa.i) {
                    n6 = g2 = uSa.E;
                } else {
                    e2.J();
                    f2.J();
                    return;
                }
                while (n6 < fPa.i) {
                    if (e2.f(n4, g2) && !f2.f(n4, g2)) {
                        DataInputStream dataInputStream = e2.J(n4, g2);
                        if (dataInputStream == null) {
                            I.warn(Pqa.X);
                        } else {
                            void d2;
                            Waa waa2;
                            DataInputStream dataInputStream2 = dataInputStream;
                            Object object = tCa.J((DataInputStream)dataInputStream2);
                            dataInputStream2.close();
                            object = Haa.J((Waa)object.J(xua.s));
                            Waa waa3 = new Waa();
                            Waa waa4 = waa2 = new Waa();
                            waa3.J(xua.s, (NCa)waa4);
                            Haa.J((FY)object, (Waa)waa4, (Ay)d2);
                            object = f2.J(n4, g2);
                            tCa.J((Waa)waa3, (DataOutput)object);
                            ((FilterOutputStream)object).close();
                        }
                    }
                    n6 = ++g2;
                }
                g2 = (int)Math.round(fqa.W * (double)(c2 * ura.V) / (double)(b2 * ura.V));
                int n7 = (int)Math.round(fqa.W * (double)((n4 + vRa.d) * fPa.i + c2 * ura.V) / (double)(b2 * ura.V));
                if (n7 > g2) {
                    void a2;
                    a2.J(n7);
                }
                n5 = ++n4;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    public boolean l(String string) {
        Object b2 = string;
        QZ_2 a2 = this;
        if ((b2 = a2.J((String)b2)) != null && b2.d() == pPa.S) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public void J() {
        iY.J();
    }

    public boolean f(String string) {
        Object b2 = string;
        QZ_2 a2 = this;
        if ((b2 = a2.J((String)b2)) != null && b2.d() != a2.J()) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    private void J(String string) {
        Object b2 = string;
        QZ_2 a2 = this;
        if (!((File)(b2 = new File((File)((Object)a2.I), (String)b2))).exists()) {
            I.warn(JSa.d);
            return;
        }
        File file = new File((File)b2, ISa.w);
        if (!file.exists()) {
            I.warn(JSa.d);
            return;
        }
        if (!file.renameTo((File)(b2 = new File((File)b2, Hra.Ka)))) {
            I.warn(JSa.d);
        }
    }

    public int J() {
        return lPa.B;
    }

    /*
     * WARNING - void declaration
     */
    private void J(File file, Collection<File> collection) {
        Object c2 = file;
        QZ_2 b2 = this;
        if ((c2 = ((File)(c2 = new File((File)c2, Fua.d))).listFiles((FilenameFilter)new Ry((QZ)b2))) != null) {
            void a2;
            Collections.addAll(a2, c2);
        }
    }

    public List<LW> J() throws aRa {
        QZ_2 qZ_2 = this;
        if (qZ_2.I != null && ((File)((Object)qZ_2.I)).exists() && ((File)((Object)qZ_2.I)).isDirectory()) {
            int n2;
            ArrayList<LW> arrayList = Lists.newArrayList();
            File[] fileArray = ((File)((Object)qZ_2.I)).listFiles();
            int n3 = fileArray.length;
            int n4 = n2 = uSa.E;
            while (n4 < n3) {
                QZ_2 a2;
                Object object = fileArray[n2];
                if (((File)object).isDirectory() && (a2 = qZ_2.J((String)(object = ((File)object).getName()))) != null && (a2.d() == pPa.S || a2.d() == lPa.B)) {
                    int n5 = a2.d() != qZ_2.J() ? vRa.d : uSa.E;
                    Object object2 = a2.f();
                    if (StringUtils.isEmpty((CharSequence)object2)) {
                        object2 = object;
                    }
                    long l2 = nqa.i;
                    arrayList.add(new LW((String)object, (String)object2, a2.e(), l2, a2.J(), n5 != 0, a2.d(), a2.M()));
                }
                n4 = ++n2;
            }
            return arrayList;
        }
        throw new aRa(PQa.G);
    }

    /*
     * WARNING - void declaration
     */
    public boolean J(String string, gc gc2) {
        QZ_2 qZ_2;
        void b2;
        void a2;
        QZ_2 qZ_22 = this;
        a2.J(uSa.E);
        ArrayList<File> arrayList = Lists.newArrayList();
        ArrayList<File> arrayList2 = Lists.newArrayList();
        ArrayList<File> arrayList3 = Lists.newArrayList();
        File file = new File((File)((Object)qZ_22.I), (String)b2);
        File file2 = new File(file, SRa.g);
        File file3 = new File(file, fPa.X);
        I.info(xqa.K);
        qZ_22.J(file, arrayList);
        if (file2.exists()) {
            qZ_22.J(file2, arrayList2);
        }
        if (file3.exists()) {
            qZ_22.J(file3, arrayList3);
        }
        int n2 = arrayList.size() + arrayList2.size() + arrayList3.size();
        I.info(new StringBuilder().insert(3 >> 2, Qpa.g).append(n2).toString());
        QZ_2 c2 = qZ_22.J((String)b2);
        Qy qy2 = null;
        if (c2.J() == Fy.k) {
            qy2 = new Qy(Jy.Z, MQa.L);
            qZ_2 = qZ_22;
        } else {
            qy2 = new Ay(c2.C(), c2.J(), c2.J());
            qZ_2 = qZ_22;
        }
        qZ_2.J(new File(file, Fua.d), arrayList, (Ay)qy2, uSa.E, n2, (gc)a2);
        QZ_2 qZ_23 = c2;
        QZ_2 qZ_24 = qZ_22;
        qZ_24.J(new File(file2, Fua.d), arrayList2, (Ay)new Qy(Jy.B, JPa.N), arrayList.size(), n2, (gc)a2);
        qZ_24.J(new File(file3, Fua.d), arrayList3, (Ay)new Qy(Jy.ia, JPa.N), arrayList.size() + arrayList2.size(), n2, (gc)a2);
        qZ_23.A(lPa.B);
        if (qZ_23.J() == Fy.E) {
            c2.J(Fy.M);
        }
        QZ_2 qZ_25 = qZ_22;
        void v4 = b2;
        qZ_25.J((String)v4);
        qZ_25.J((String)v4, uSa.E != 0).J((vU)c2);
        return vRa.d != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void J(File file, Iterable<File> iterable, Ay ay2, int n2, int n3, gc gc2) {
        Object g2 = iterable;
        QZ_2 e2 = this;
        g2 = g2.iterator();
        Object object = g2;
        while (object.hasNext()) {
            void a2;
            void b2;
            void c2;
            void d2;
            void f2;
            File file2 = (File)g2.next();
            object = g2;
            e2.J((File)f2, file2, (Ay)d2, (int)(++c2), (int)b2, (gc)a2);
            a2.J((int)Math.round(fqa.W * (double)c2 / (double)b2));
        }
    }

    public QZ_2(File file) {
        Object b2 = file;
        QZ_2 a2 = this;
        super((File)b2);
    }
}

