package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.setTransitionVisibility;

/* loaded from: classes.dex */
public final class setTransitionVisibility extends setOrientation {
    public final setDividerHeight<String, Bundle> MenuHostHelper$$ExternalSyntheticLambda0;
    private static byte[] setY = {27, 47, 26, 29, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 140;
    public static final Parcelable.Creator<setTransitionVisibility> CREATOR = new Parcelable.ClassLoaderCreator<setTransitionVisibility>() { // from class: com.google.android.material.stateful.ExtendableSavedState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setTransitionVisibility(parcel, null, (byte) 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ setTransitionVisibility createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new setTransitionVisibility(parcel, classLoader, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setTransitionVisibility[i];
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 15
            int r7 = 18 - r7
            int r8 = 106 - r8
            int r6 = r6 * 4
            int r6 = 16 - r6
            byte[] r0 = o.setTransitionVisibility.setY
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = 0
            r8 = r7
            r7 = r6
            goto L30
        L18:
            r3 = 0
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTransitionVisibility.a(int, int, short, java.lang.Object[]):void");
    }

    public /* synthetic */ setTransitionVisibility(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public setTransitionVisibility(Parcelable parcelable) {
        super(parcelable);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setDividerHeight<>();
    }

    private setTransitionVisibility(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setDividerHeight<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.put(strArr[i], bundleArr[i]);
        }
    }

    @Override // o.setOrientation, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 << 1;
            strArr[i2] = (String) this.MenuHostHelper$$ExternalSyntheticLambda0.setX[i3];
            bundleArr[i2] = (Bundle) this.MenuHostHelper$$ExternalSyntheticLambda0.setX[i3 + 1];
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        try {
            Object[] objArr = {this};
            byte b = (byte) (setY[5] + 1);
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b3 = (byte) (-setY[5]);
            Object[] objArr3 = new Object[1];
            a((byte) (setY[5] + 1), b3, b3, objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            sb.append(" states=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append("}");
            return sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}