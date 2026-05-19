/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Dha
 *  MZ
 *  NCa
 *  RIa
 *  Usa
 *  Waa
 *  Ypa
 *  ZRa
 *  bpa
 *  gCa
 *  uca
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class tCa_2 {
    public static void J(Waa waa2, DataOutput dataOutput) throws IOException {
        Object b2 = dataOutput;
        Waa a2 = waa2;
        tCa_2.J((NCa)a2, (DataOutput)b2);
    }

    public static Waa J(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        try (InputStream a2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream2)));){
            Waa waa2 = tCa_2.J((DataInput)((Object)a2), uca.A);
            return waa2;
        }
    }

    public static void f(Waa waa2, File file) throws IOException {
        File b2 = file;
        Waa a2 = waa2;
        File file2 = new File(new StringBuilder().insert(3 & 4, b2.getAbsolutePath()).append(yOa.h).toString());
        if (file2.exists()) {
            file2.delete();
        }
        tCa_2.J(a2, file2);
        if (b2.exists()) {
            b2.delete();
        }
        if (b2.exists()) {
            throw new IOException(new StringBuilder().insert(3 & 4, Usa.T).append(b2).toString());
        }
        file2.renameTo(b2);
    }

    public static void J(Waa waa2, OutputStream outputStream) throws IOException {
        Object b2 = outputStream;
        Waa a2 = waa2;
        b2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream((OutputStream)b2)));
        try {
            tCa_2.J(a2, (DataOutput)b2);
            return;
        }
        finally {
            ((FilterOutputStream)b2).close();
        }
    }

    public static Waa J(DataInputStream a2) throws IOException {
        return tCa_2.J(a2, uca.A);
    }

    private static void J(NCa nCa2, DataOutput dataOutput) throws IOException {
        NCa a2;
        DataOutput b2 = dataOutput;
        NCa nCa3 = a2 = nCa2;
        b2.writeByte(nCa3.J());
        if (nCa3.J() != 0) {
            Object object = b2;
            object.writeUTF(Mqa.y);
            a2.J((DataOutput)object);
        }
    }

    public static Waa J(DataInput dataInput, uca uca2) throws IOException {
        DataInput b2 = uca2;
        DataInput a2 = dataInput;
        if ((b2 = tCa_2.J(a2, uSa.E, (uca)b2)) instanceof Waa) {
            return (Waa)b2;
        }
        throw new IOException(Hta.g);
    }

    public static void J(Waa waa2, File file) throws IOException {
        Object b2 = file;
        Waa a2 = waa2;
        b2 = new DataOutputStream(new FileOutputStream((File)b2));
        try {
            tCa_2.J(a2, (DataOutput)b2);
            return;
        }
        finally {
            ((FilterOutputStream)b2).close();
        }
    }

    public tCa_2() {
        tCa_2 a2;
    }

    /*
     * WARNING - void declaration
     */
    private static NCa J(DataInput dataInput, int n2, uca uca2) throws IOException {
        int c222 = n2;
        DataInput b2 = dataInput;
        byte by2 = b2.readByte();
        if (by2 == 0) {
            return new gCa();
        }
        b2.readUTF();
        NCa nCa2 = NCa.J((byte)by2);
        try {
            void a2;
            nCa2.J(b2, c222, (uca)a2);
            return nCa2;
        }
        catch (IOException c222) {
            RIa c222 = RIa.J((Throwable)c222, (String)tua.Ja);
            Dha dha = c222.J(bpa.R);
            dha.J(ZRa.b, (Object)Ypa.Ga);
            dha.J(Gta.Q, (Object)by2);
            throw new MZ(c222);
        }
    }

    public static Waa J(File file) throws IOException {
        File file2 = file;
        if (!file2.exists()) {
            return null;
        }
        try (DataInputStream a2 = new DataInputStream(new FileInputStream(file2));){
            Waa waa2 = tCa_2.J(a2, uca.A);
            return waa2;
        }
    }
}

