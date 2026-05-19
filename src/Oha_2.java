/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cra
 *  vRa
 */
import java.io.File;
import java.io.FileNotFoundException;

public final class Oha_2
extends FileNotFoundException {
    /*
     * WARNING - void declaration
     */
    public Oha_2(File file, String string) {
        void b2;
        String c2 = string;
        Oha_2 a2 = this;
        Object[] objectArray = new Object[uqa.g];
        objectArray[uSa.E] = c2;
        objectArray[vRa.d] = b2;
        super(String.format(cra.y, objectArray));
    }
}

