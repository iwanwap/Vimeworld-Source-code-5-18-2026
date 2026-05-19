/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dn
 */
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface Ea_1
extends MessageLiteOrBuilder {
    public dn getKind();

    public float getPos(int var1);

    public boolean hasColor();

    public int getKindValue();

    public int getIndex();

    public boolean hasIndex();

    public int getPosCount();

    public List<Float> getPosList();

    public int getColor();
}

