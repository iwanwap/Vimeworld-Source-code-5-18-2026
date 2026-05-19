/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  QZ
 */
import java.io.File;
import java.io.FilenameFilter;

public final class Ry_2
implements FilenameFilter {
    public final /* synthetic */ QZ I;

    @Override
    public boolean accept(File file, String string) {
        String c2 = string;
        Ry_2 a2 = this;
        return c2.endsWith(BQa.Ka);
    }

    public Ry_2(QZ qZ) {
        Ry_2 b2 = qZ;
        Ry_2 a2 = this;
        a2.I = b2;
    }
}

