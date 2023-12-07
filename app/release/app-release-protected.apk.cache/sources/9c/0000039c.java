package o;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: o.cx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090cx {
    private static final byte MenuHostHelper$$ExternalSyntheticLambda1 = Byte.parseByte("01110000", 2);
    private static final byte MenuHostHelper$$ExternalSyntheticLambda0 = Byte.parseByte("00001111", 2);

    public static String MenuHostHelper$$ExternalSyntheticLambda0() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & MenuHostHelper$$ExternalSyntheticLambda0) | MenuHostHelper$$ExternalSyntheticLambda1);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}