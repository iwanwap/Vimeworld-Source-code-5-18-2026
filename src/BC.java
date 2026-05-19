/*
 * Decompiled with CFR 0.152.
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface BC
extends MessageLiteOrBuilder {
    public ByteString getIdBytes();

    public float getCoords(int var1);

    public boolean hasImpelX();

    public boolean hasDrag();

    public float getImpelX();

    public List<Float> getCoordsList();

    public boolean getImpelYOnTop();

    public boolean hasImpelY();

    public int getImpelTypeValue();

    public int getCoordsCount();

    public boolean hasImpelXZOnSides();

    public boolean getImpelXZOnSides();

    public boolean hasAffectOnlyPlayers();

    public boolean getAffectOnlyPlayers();

    public Un getImpelType();

    public boolean hasImpelZ();

    public boolean hasImpelType();

    public boolean getDrag();

    public float getImpelY();

    public boolean hasImpelYOnTop();

    public String getId();

    public float getImpelZ();
}

