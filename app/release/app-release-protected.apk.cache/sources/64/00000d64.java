package o;

import java.io.Closeable;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class setMeasureAllChildren implements Closeable {
    private static final String[] setUiOptions = new String[128];
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    int setUnboundedRipple;
    boolean setX;
    int[] setIconTintList = new int[32];
    String[] setY = new String[32];
    int[] MenuHostHelper$$ExternalSyntheticLambda0 = new int[32];

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract int MenuHostHelper$$ExternalSyntheticLambda1(setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setmeasureallchildren_menuhosthelper__externalsyntheticlambda0);

    public abstract void ViewPager$SavedState$1();

    public abstract String setCenterIfNoTextEnabled();

    public abstract void setChipCornerRadius();

    public abstract void setIconTintList();

    public abstract int setLayoutAnimation();

    public abstract double setNavigationOnClickListener();

    public abstract String setOnLongClickListener();

    public abstract setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1 setTextAlignment();

    public abstract boolean setUiOptions();

    public abstract boolean setUnboundedRipple();

    public abstract void setX();

    public abstract void setY();

    static {
        for (int i = 0; i <= 31; i++) {
            setUiOptions[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = setUiOptions;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static setMeasureAllChildren setX(InterfaceC0607xr interfaceC0607xr) {
        return new getPivotX(interfaceC0607xr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i) {
        int i2 = this.setUnboundedRipple;
        int[] iArr = this.setIconTintList;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
                throw new getPivotY(sb.toString());
            }
            this.setIconTintList = Arrays.copyOf(iArr, iArr.length << 1);
            String[] strArr = this.setY;
            this.setY = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.setIconTintList;
        int i3 = this.setUnboundedRipple;
        this.setUnboundedRipple = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setScaleX setY(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        throw new setScaleX(sb.toString());
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = this.setUnboundedRipple;
        int[] iArr = this.setIconTintList;
        String[] strArr = this.setY;
        int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(o.InterfaceC0606xq r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = o.setMeasureAllChildren.setUiOptions
            r1 = 34
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r8, r4, r3)
        L2e:
            r7.setIconTintList(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r8, r4, r2)
        L3b:
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMeasureAllChildren.MenuHostHelper$$ExternalSyntheticLambda1(o.xq, java.lang.String):void");
    }
}