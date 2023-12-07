package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class dump {
    public static final Bundle MenuHostHelper$$ExternalSyntheticLambda1(nT<String, ? extends Object>... nTVarArr) {
        pN.setY(nTVarArr, "");
        Bundle bundle = new Bundle(nTVarArr.length);
        for (nT<String, ? extends Object> nTVar : nTVarArr) {
            String str = nTVar.MenuHostHelper$$ExternalSyntheticLambda0;
            B b = nTVar.setX;
            if (b == 0) {
                bundle.putString(str, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                pN.setX(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    if (b == 0) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    if (b == 0) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    }
                    bundle.putStringArray(str, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    if (b == 0) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    }
                    bundle.putCharSequenceArray(str, (CharSequence[]) b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) b);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    StringBuilder sb = new StringBuilder("Illegal value array type ");
                    sb.append(canonicalName);
                    sb.append(" for key \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b);
            } else if (b instanceof IBinder) {
                setListSelection.MenuHostHelper$$ExternalSyntheticLambda1(bundle, str, (IBinder) b);
            } else if (b instanceof Size) {
                setSize.setX(bundle, str, (Size) b);
            } else if (b instanceof SizeF) {
                setSize.MenuHostHelper$$ExternalSyntheticLambda0(bundle, str, (SizeF) b);
            } else {
                String canonicalName2 = b.getClass().getCanonicalName();
                StringBuilder sb2 = new StringBuilder("Illegal value type ");
                sb2.append(canonicalName2);
                sb2.append(" for key \"");
                sb2.append(str);
                sb2.append('\"');
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return bundle;
    }
}