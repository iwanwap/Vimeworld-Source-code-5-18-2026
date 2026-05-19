/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  vRa
 */
import java.io.File;
import java.io.FileFilter;

public final class Vga_1
implements FileFilter {
    @Override
    public boolean accept(File file) {
        int n2;
        File b2 = file;
        Vga_1 a2 = this;
        int n3 = b2.isFile() && b2.getName().endsWith(QTa.C) ? vRa.d : uSa.E;
        int n4 = n2 = b2.isDirectory() && new File(b2, tpa.C).isFile() ? vRa.d : uSa.E;
        if (n3 != 0 || n2 != 0) {
            return vRa.d != 0;
        }
        return uSa.E != 0;
    }

    public Vga_1() {
        Vga_1 a2;
    }
}

