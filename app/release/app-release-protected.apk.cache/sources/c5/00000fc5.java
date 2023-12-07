package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.setStartIconContentDescription;

/* loaded from: classes.dex */
public class setStateDescription {
    private static volatile setStateDescription MenuHostHelper$$ExternalSyntheticLambda1;
    static final setStateDescription setY;
    final Map<setY, setStartIconContentDescription.setY<?, ?>> MenuHostHelper$$ExternalSyntheticLambda0;

    private static Class<?> setY() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    static {
        setY();
        setY = new setStateDescription((byte) 0);
    }

    public static setStateDescription MenuHostHelper$$ExternalSyntheticLambda1() {
        setStateDescription setstatedescription;
        setStateDescription setstatedescription2 = MenuHostHelper$$ExternalSyntheticLambda1;
        if (setstatedescription2 == null) {
            synchronized (setStateDescription.class) {
                setstatedescription = MenuHostHelper$$ExternalSyntheticLambda1;
                if (setstatedescription == null) {
                    setstatedescription = setHintTextColor.setX();
                    MenuHostHelper$$ExternalSyntheticLambda1 = setstatedescription;
                }
            }
            return setstatedescription;
        }
        return setstatedescription2;
    }

    setStateDescription() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    }

    private setStateDescription(byte b) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Collections.emptyMap();
    }

    /* loaded from: classes.dex */
    static final class setY {
        private final Object MenuHostHelper$$ExternalSyntheticLambda0;
        private final int setIconTintList;
        private static byte[] setY = {4, -20, -33, -123, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
        public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 86;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 105
                int r8 = r8 * 3
                int r8 = 16 - r8
                byte[] r0 = o.setStateDescription.setY.setY
                int r7 = r7 + 4
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L33
            L16:
                r3 = 0
            L17:
                byte r4 = (byte) r6
                int r7 = r7 + 1
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L33:
                int r7 = r7 - r6
                int r6 = r7 + 2
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setStateDescription.setY.a(int, int, int, java.lang.Object[]):void");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(Object obj, int i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
            this.setIconTintList = i;
        }

        public final int hashCode() {
            try {
                Object[] objArr = {this.MenuHostHelper$$ExternalSyntheticLambda0};
                Object[] objArr2 = new Object[1];
                a(setY[5], (byte) (setY[8] + 1), (byte) (setY[5] - 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b = (byte) (-setY[5]);
                Object[] objArr3 = new Object[1];
                a((byte) (setY[5] - 1), b, (byte) (b + 1), objArr3);
                return (((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue() * 65535) + this.setIconTintList;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof setY) {
                setY sety = (setY) obj;
                return this.MenuHostHelper$$ExternalSyntheticLambda0 == sety.MenuHostHelper$$ExternalSyntheticLambda0 && this.setIconTintList == sety.setIconTintList;
            }
            return false;
        }
    }
}