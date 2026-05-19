/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Gg
 *  Oz
 *  QFa
 *  Ql
 *  Uk
 *  nj
 *  tJ
 *  vj
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Tuple3d;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;

public abstract class dL_3
extends tJ {
    private zz pos;
    public List<Block> blocks;

    /*
     * WARNING - void declaration
     */
    public Block J(nj nj2, vj vj2) {
        void a2;
        Object c2 = nj2;
        dL_3 b2 = this;
        Gg gg2 = c2.J();
        if (gg2 == null) {
            return QFa.HF;
        }
        c2 = a2.J((nj)c2);
        dL_3 dL_32 = b2;
        dL_32.pos.func_181079_c(Oz.f((double)((Tuple3d)c2).getX()), Oz.f((double)((Tuple3d)c2).getY()), Oz.f((double)((Tuple3d)c2).getZ()));
        return gg2.J((XF)dL_32.pos).J();
    }

    /*
     * WARNING - void declaration
     */
    public tJ J(JsonElement jsonElement, Uk uk2) throws Ql {
        void a2;
        void b2;
        dL_3 dL_32 = this;
        if (b2.isJsonArray()) {
            for (Object c2 : b2.getAsJsonArray()) {
                new ResourceLocation(((JsonElement)c2).getAsString());
                c2 = null;
                if (null == null) continue;
                dL_32.blocks.add((Block)c2);
            }
        }
        return super.J((JsonElement)b2, (Uk)a2);
    }

    public JsonElement J() {
        dL_3 dL_32 = this;
        JsonArray jsonArray = new JsonArray();
        Iterator<Block> a2 = dL_32.blocks.iterator();
        while (a2.hasNext()) {
            Block cfr_ignored_0 = (Block)a2.next();
            ResourceLocation resourceLocation = null;
            if (null == null) continue;
            jsonArray.add(new JsonPrimitive(resourceLocation.toString()));
        }
        return jsonArray;
    }

    public dL_3() {
        dL_3 a2;
        dL_3 dL_32 = a2;
        a2.blocks = new ArrayList<Block>();
        dL_32.pos = new zz();
    }
}

