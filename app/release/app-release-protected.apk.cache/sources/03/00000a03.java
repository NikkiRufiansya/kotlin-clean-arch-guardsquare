package o;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.restoreCallingWorkSource;

/* loaded from: classes.dex */
public final class setChildIndicator extends setLiftOnScroll {
    static boolean setX = false;
    private final setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
    private final setTouchDelegate setIconTintList;
    private static byte[] setY = {112, 117, 112, -122, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 38;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 16
            int r8 = r8 + 105
            byte[] r0 = o.setChildIndicator.setY
            int r9 = r9 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r7
            goto L34
        L16:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L34:
            int r7 = r7 - r8
            int r7 = r7 + 2
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setChildIndicator.a(byte, short, short, java.lang.Object[]):void");
    }

    /* loaded from: classes.dex */
    public static class setY<D> extends setCompatElevationResource<D> implements restoreCallingWorkSource.setIconTintList<D> {
        private static byte[] setCenterIfNoTextEnabled = {20, -68, -64, 70, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
        public static final int setUnboundedRipple = 19;
        final Bundle setIconTintList;
        setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda1<D> setLayoutAnimation;
        final restoreCallingWorkSource<D> setNavigationOnClickListener;
        private restoreCallingWorkSource<D> setOnLongClickListener;
        setTouchDelegate setUiOptions;
        final int setY;

        private static void a(byte b, short s, short s2, Object[] objArr) {
            int i = b + 4;
            byte[] bArr = setCenterIfNoTextEnabled;
            int i2 = 16 - (s * 3);
            int i3 = s2 + 105;
            byte[] bArr2 = new byte[i2];
            int i4 = -1;
            int i5 = i2 - 1;
            if (bArr == null) {
                i3 = (i5 - i) + 2;
                i = i;
                i5 = i5;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i4 = -1;
            }
            while (true) {
                int i6 = i4 + 1;
                bArr2[i6] = (byte) i3;
                int i7 = i + 1;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = (i3 - bArr[i7]) + 2;
                i = i7;
                i5 = i5;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i4 = i6;
            }
        }

        @Override // androidx.lifecycle.LiveData
        public final void setY() {
            boolean z = setChildIndicator.setX;
            restoreCallingWorkSource<D> restorecallingworksource = this.setNavigationOnClickListener;
            restorecallingworksource.setUiOptions = true;
            restorecallingworksource.setOnLongClickListener = false;
            restorecallingworksource.setY = false;
        }

        @Override // androidx.lifecycle.LiveData
        public final void setIconTintList() {
            boolean z = setChildIndicator.setX;
            this.setNavigationOnClickListener.setUiOptions = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void setIconTintList(setOverlayMode<? super D> setoverlaymode) {
            super.setIconTintList((setOverlayMode) setoverlaymode);
            this.setUiOptions = null;
            this.setLayoutAnimation = null;
        }

        @Override // o.setCompatElevationResource, androidx.lifecycle.LiveData
        public final void setIconTintList(D d) {
            super.setIconTintList((setY<D>) d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            try {
                Object[] objArr = {this};
                Object[] objArr2 = new Object[1];
                a((byte) (setUnboundedRipple - 5), (byte) (setCenterIfNoTextEnabled[5] - 1), setCenterIfNoTextEnabled[5], objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b = (byte) (-setCenterIfNoTextEnabled[5]);
                byte b2 = (byte) (b + 1);
                Object[] objArr3 = new Object[1];
                a(b, b2, b2, objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append(" #");
                sb.append(this.setY);
                sb.append(" : ");
                setCustomInsertionActionModeCallback.setY(this.setNavigationOnClickListener, sb);
                sb.append("}}");
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

    public setChildIndicator(setTouchDelegate settouchdelegate, setTabRippleColorResource settabripplecolorresource) {
        this.setIconTintList = settouchdelegate;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(settabripplecolorresource);
    }

    @Override // o.setLiftOnScroll
    public final void setY() {
        setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0 setchildindicator_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int y = setchildindicator_menuhosthelper__externalsyntheticlambda0.setX.setY();
        for (int i = 0; i < y; i++) {
            setY y2 = setchildindicator_menuhosthelper__externalsyntheticlambda0.setX.setY(i);
            setTouchDelegate settouchdelegate = y2.setUiOptions;
            setOverlayMode setoverlaymode = y2.setLayoutAnimation;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        try {
            Object[] objArr = {this};
            Object[] objArr2 = new Object[1];
            a((byte) (setY[5] - 1), setY[5], (byte) (setY[8] + 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = (byte) (setY[5] - 1);
            Object[] objArr3 = new Object[1];
            a(b, b, (byte) (-setY[5]), objArr3);
            sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
            sb.append(" in ");
            setCustomInsertionActionModeCallback.setY(this.setIconTintList, sb);
            sb.append("}}");
            return sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // o.setLiftOnScroll
    @Deprecated
    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        setChildIndicator$MenuHostHelper$$ExternalSyntheticLambda0 setchildindicator_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setchildindicator_menuhosthelper__externalsyntheticlambda0.setX.setY() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            for (int i = 0; i < setchildindicator_menuhosthelper__externalsyntheticlambda0.setX.setY(); i++) {
                setY y = setchildindicator_menuhosthelper__externalsyntheticlambda0.setX.setY(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(setchildindicator_menuhosthelper__externalsyntheticlambda0.setX.setIconTintList(i));
                printWriter.print(": ");
                printWriter.println(y.toString());
                printWriter.print(obj);
                printWriter.print("mId=");
                printWriter.print(y.setY);
                printWriter.print(" mArgs=");
                printWriter.println(y.setIconTintList);
                printWriter.print(obj);
                printWriter.print("mLoader=");
                printWriter.println(y.setNavigationOnClickListener);
                restoreCallingWorkSource<D> restorecallingworksource = y.setNavigationOnClickListener;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("  ");
                String obj2 = sb2.toString();
                printWriter.print(obj2);
                printWriter.print("mId=");
                printWriter.print(restorecallingworksource.MenuHostHelper$$ExternalSyntheticLambda1);
                printWriter.print(" mListener=");
                printWriter.println(restorecallingworksource.setIconTintList);
                if (restorecallingworksource.setUiOptions) {
                    printWriter.print(obj2);
                    printWriter.print("mStarted=");
                    printWriter.print(restorecallingworksource.setUiOptions);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(restorecallingworksource.setX);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(restorecallingworksource.MenuHostHelper$$ExternalSyntheticLambda0);
                } else {
                    boolean z = restorecallingworksource.setX;
                    boolean z2 = restorecallingworksource.MenuHostHelper$$ExternalSyntheticLambda0;
                }
                if (restorecallingworksource.setY) {
                    printWriter.print(obj2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(restorecallingworksource.setY);
                    printWriter.print(" mReset=");
                    printWriter.println(restorecallingworksource.setOnLongClickListener);
                } else {
                    boolean z3 = restorecallingworksource.setOnLongClickListener;
                }
                setOverlayMode setoverlaymode = y.setLayoutAnimation;
                printWriter.print(obj);
                printWriter.print("mData=");
                Object obj3 = y.setNavigationOnClickListener;
                D MenuHostHelper$$ExternalSyntheticLambda12 = y.MenuHostHelper$$ExternalSyntheticLambda1();
                StringBuilder sb3 = new StringBuilder(64);
                setCustomInsertionActionModeCallback.setY(MenuHostHelper$$ExternalSyntheticLambda12, sb3);
                sb3.append("}");
                printWriter.println(sb3.toString());
                printWriter.print(obj);
                printWriter.print("mStarted=");
                printWriter.println(y.MenuHostHelper$$ExternalSyntheticLambda0());
            }
        }
    }
}