/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ERa
 *  QSa
 *  VJa
 *  Vga
 *  aJa
 *  dGa
 *  isa
 *  jpa
 *  pY
 *  vRa
 */
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.FolderResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class nIa {
    private QIa M;
    public final /* synthetic */ dGa k;
    private ResourceLocation j;
    private final File J;
    private BufferedImage A;
    private IResourcePack I;

    public IResourcePack J() {
        nIa a2;
        return a2.I;
    }

    public void J(aJa aJa2) {
        nIa b2 = aJa2;
        nIa a2 = this;
        if (a2.j == null) {
            a2.j = b2.J(isa.G, new VJa(a2.A));
        }
        b2.J(a2.j);
    }

    public boolean equals(Object object) {
        Object a2 = this;
        Object b2 = object;
        if (a2 == b2) {
            return vRa.d != 0;
        }
        if (b2 instanceof nIa) {
            return ((nIa)a2).toString().equals(b2.toString());
        }
        return uSa.E != 0;
    }

    public int hashCode() {
        nIa a2;
        return a2.toString().hashCode();
    }

    public void f() throws IOException {
        nIa nIa2;
        nIa a2;
        a2.I = a2.J.isDirectory() ? new FolderResourcePack(a2.J) : new FileResourcePack(a2.J);
        a2.M = (QIa)a2.I.J(a2.k.A, ROa.F);
        try {
            a2.A = a2.I.J();
            nIa2 = a2;
        }
        catch (IOException iOException) {
            nIa2 = a2;
        }
        if (nIa2.A == null) {
            a2.A = a2.k.k.J();
        }
        a2.J();
    }

    public String toString() {
        nIa a2;
        Object[] objectArray = new Object[yRa.d];
        objectArray[uSa.E] = a2.J.getName();
        objectArray[vRa.d] = a2.J.isDirectory() ? QSa.m : ERa.s;
        objectArray[uqa.g] = a2.J.lastModified();
        return String.format(jpa.i, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private nIa(dGa dGa2, File file) {
        void b2;
        File c2 = file;
        nIa a2 = this;
        a2.k = b2;
        a2.J = c2;
    }

    public String f() {
        nIa a2;
        if (a2.M == null) {
            return pY.RED + WRa.W;
        }
        return a2.M.J().l();
    }

    public void J() {
        nIa a2;
        if (a2.I instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)((Object)a2.I));
        }
    }

    public String J() {
        nIa a2;
        return a2.I.J();
    }

    public int J() {
        nIa a2;
        return a2.M.J();
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ nIa(dGa dGa2, File file, Vga vga) {
        void c2;
        File d2 = file;
        nIa b2 = this;
        b2((dGa)c2, d2);
    }
}

