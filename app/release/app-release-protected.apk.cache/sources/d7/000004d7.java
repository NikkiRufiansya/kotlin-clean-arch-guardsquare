package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import o.setCompoundDrawablePadding;

/* loaded from: classes.dex */
public final class getCallingUidOrThrow {
    private static final Class<? extends Object>[] setX;
    private final Map<String, Object> MenuHostHelper$$ExternalSyntheticLambda0 = new LinkedHashMap();
    private final Map<String, setCompoundDrawablePadding.setX> setNavigationOnClickListener = new LinkedHashMap();
    private final Map<String, Object<?>> setY = new LinkedHashMap();
    private final Map<String, tC<Object>> MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashMap();
    final setCompoundDrawablePadding.setX setIconTintList = new setCompoundDrawablePadding.setX() { // from class: o.setItemBackgroundRes
        @Override // o.setCompoundDrawablePadding.setX
        public final Bundle MenuHostHelper$$ExternalSyntheticLambda1() {
            return getCallingUidOrThrow.setIconTintList(getCallingUidOrThrow.this);
        }
    };

    static {
        new getCallingUidOrThrow$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        setX = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ android.os.Bundle setIconTintList(o.getCallingUidOrThrow r10) {
        /*
            java.lang.String r0 = ""
            o.pN.setY(r10, r0)
            java.util.Map<java.lang.String, o.setCompoundDrawablePadding$setX> r1 = r10.setNavigationOnClickListener
            java.util.Map r1 = o.C0362ow.setX(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L96
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r2.getValue()
            o.setCompoundDrawablePadding$setX r2 = (o.setCompoundDrawablePadding.setX) r2
            android.os.Bundle r2 = r2.MenuHostHelper$$ExternalSyntheticLambda1()
            o.pN.setY(r5, r0)
            if (r2 != 0) goto L38
        L36:
            r3 = 1
            goto L4d
        L38:
            java.lang.Class<? extends java.lang.Object>[] r6 = o.getCallingUidOrThrow.setX
            int r7 = r6.length
            r8 = 0
        L3c:
            if (r8 >= r7) goto L4d
            r9 = r6[r8]
            o.pN.setX(r9)
            boolean r9 = r9.isInstance(r2)
            if (r9 == 0) goto L4a
            goto L36
        L4a:
            int r8 = r8 + 1
            goto L3c
        L4d:
            if (r3 == 0) goto L76
            java.util.Map<java.lang.String, java.lang.Object<?>> r3 = r10.setY
            java.lang.Object r3 = r3.get(r5)
            boolean r4 = r3 instanceof o.setCompatElevationResource
            if (r4 == 0) goto L5c
            o.setCompatElevationResource r3 = (o.setCompatElevationResource) r3
            goto L5d
        L5c:
            r3 = 0
        L5d:
            if (r3 == 0) goto L63
            r3.setIconTintList(r2)
            goto L68
        L63:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r10.MenuHostHelper$$ExternalSyntheticLambda0
            r3.put(r5, r2)
        L68:
            java.util.Map<java.lang.String, o.tC<java.lang.Object>> r3 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.Object r3 = r3.get(r5)
            o.tC r3 = (o.tC) r3
            if (r3 == 0) goto L13
            r3.MenuHostHelper$$ExternalSyntheticLambda1(r2)
            goto L13
        L76:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Can't put value with type "
            r10.<init>(r0)
            o.pN.setX(r2)
            java.lang.Class r0 = r2.getClass()
            r10.append(r0)
            java.lang.String r0 = " into saved state"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L96:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.MenuHostHelper$$ExternalSyntheticLambda0
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.size()
            r2.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        Lb2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lcb
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            r1.add(r5)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r10.MenuHostHelper$$ExternalSyntheticLambda0
            java.lang.Object r5 = r6.get(r5)
            r2.add(r5)
            goto Lb2
        Lcb:
            r10 = 2
            o.nT[] r10 = new o.nT[r10]
            o.nT r0 = new o.nT
            java.lang.String r5 = "keys"
            r0.<init>(r5, r1)
            r10[r3] = r0
            o.nT r0 = new o.nT
            java.lang.String r1 = "values"
            r0.<init>(r1, r2)
            r10[r4] = r0
            android.os.Bundle r10 = o.dump.MenuHostHelper$$ExternalSyntheticLambda1(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCallingUidOrThrow.setIconTintList(o.getCallingUidOrThrow):android.os.Bundle");
    }
}