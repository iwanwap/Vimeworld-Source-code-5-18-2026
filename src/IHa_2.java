/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Cta
 *  VJa
 *  Xia
 *  Yma
 *  isa
 *  pY
 *  vRa
 */
import com.google.gson.JsonParseException;
import java.io.IOException;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IHa_2
extends Xia {
    private final ResourceLocation J;
    private final IResourcePack A;
    private static final Logger I = LogManager.getLogger();

    public boolean J() {
        return uSa.E != 0;
    }

    public boolean C() {
        return uSa.E != 0;
    }

    public boolean l() {
        return uSa.E != 0;
    }

    public String J() {
        IHa_2 iHa_2 = this;
        try {
            IHa_2 iHa_22 = iHa_2;
            QIa a2 = (QIa)iHa_22.A.J(iHa_22.J.J().A, ROa.F);
            if (a2 != null) {
                return a2.J().l();
            }
        }
        catch (JsonParseException a2) {
            I.error(rQa.X, (Throwable)a2);
        }
        catch (IOException a2) {
            I.error(rQa.X, (Throwable)a2);
        }
        return pY.RED + Cta.N;
    }

    public boolean d() {
        return uSa.E != 0;
    }

    public int J() {
        return vRa.d;
    }

    public String f() {
        return xqa.A;
    }

    public IHa_2(Yma yma2) {
        IHa_2 iHa_2;
        IHa_2 a2;
        IHa_2 b2 = yma2;
        IHa_2 iHa_22 = a2 = this;
        super((Yma)b2);
        iHa_22.A = iHa_22.J.J().k;
        try {
            b2 = new VJa(a2.A.J());
            iHa_2 = a2;
        }
        catch (IOException iOException) {
            b2 = gLa.J;
            iHa_2 = a2;
        }
        iHa_2.J = a2.J.J().J(isa.G, (VJa)b2);
    }

    public void J() {
        IHa_2 a2;
        a2.J.J().J(a2.J);
    }

    public boolean f() {
        return uSa.E != 0;
    }
}

