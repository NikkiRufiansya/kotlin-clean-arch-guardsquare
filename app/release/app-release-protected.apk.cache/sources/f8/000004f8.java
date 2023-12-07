package o;

import java.io.EOFException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class getPivotX extends setMeasureAllChildren {
    private String ViewPager$SavedState$1;
    private int setCenterIfNoTextEnabled;
    private final InterfaceC0607xr setChipCornerRadius;
    private long setIconSize;
    private final C0602xo setOnLongClickListener;
    private int setTextAlignment = 0;
    private static final C0610xu setUiOptions = C0610xu.setIconTintList("'\\");
    private static final C0610xu setLayoutAnimation = C0610xu.setIconTintList("\"\\");
    private static final C0610xu setNavigationOnClickListener = C0610xu.setIconTintList("{}[]:, \n\t\r\f/\\;#=");

    static {
        C0610xu.setIconTintList("\n\r");
        C0610xu.setIconTintList("*/");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPivotX(InterfaceC0607xr interfaceC0607xr) {
        if (interfaceC0607xr == null) {
            throw new NullPointerException("source == null");
        }
        this.setChipCornerRadius = interfaceC0607xr;
        this.setOnLongClickListener = interfaceC0607xr.setNavigationOnClickListener();
        setX(6);
    }

    @Override // o.setMeasureAllChildren
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 3) {
            setX(1);
            this.MenuHostHelper$$ExternalSyntheticLambda0[this.setUnboundedRipple - 1] = 0;
            this.setTextAlignment = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(setTextAlignment());
        sb.append(" at path ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        throw new getPivotY(sb.toString());
    }

    @Override // o.setMeasureAllChildren
    public final void setY() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 4) {
            this.setUnboundedRipple--;
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = this.setUnboundedRipple - 1;
            iArr[i2] = iArr[i2] + 1;
            this.setTextAlignment = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(setTextAlignment());
        sb.append(" at path ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        throw new getPivotY(sb.toString());
    }

    @Override // o.setMeasureAllChildren
    public final void setX() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 1) {
            setX(3);
            this.setTextAlignment = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(setTextAlignment());
        sb.append(" at path ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        throw new getPivotY(sb.toString());
    }

    @Override // o.setMeasureAllChildren
    public final void setIconTintList() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 2) {
            this.setUnboundedRipple--;
            this.setY[this.setUnboundedRipple] = null;
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = this.setUnboundedRipple - 1;
            iArr[i2] = iArr[i2] + 1;
            this.setTextAlignment = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(setTextAlignment());
        sb.append(" at path ");
        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
        throw new getPivotY(sb.toString());
    }

    @Override // o.setMeasureAllChildren
    public final boolean setUnboundedRipple() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // o.setMeasureAllChildren
    public final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1 setTextAlignment() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        switch (i) {
            case 1:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_OBJECT;
            case 2:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.END_OBJECT;
            case 3:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY;
            case 4:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.END_ARRAY;
            case 5:
            case 6:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BOOLEAN;
            case 7:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.NAME;
            case 16:
            case 17:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.NUMBER;
            case 18:
                return setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ae, code lost:
        if (MenuHostHelper$$ExternalSyntheticLambda0(r4) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01d0, code lost:
        if (r1 != 2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d2, code lost:
        if (r6 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d8, code lost:
        if (r9 != Long.MIN_VALUE) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01da, code lost:
        if (r7 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01e0, code lost:
        if (r9 != 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01e2, code lost:
        if (r7 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e4, code lost:
        if (r7 != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e6, code lost:
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e7, code lost:
        r17.setIconSize = r9;
        r17.setOnLongClickListener.setOnLongClickListener(r2);
        r17.setTextAlignment = 16;
        r14 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01f4, code lost:
        if (r1 == 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f7, code lost:
        if (r1 == 4) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01fa, code lost:
        if (r1 != 7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ff, code lost:
        r17.setCenterIfNoTextEnabled = r2;
        r17.setTextAlignment = 17;
        r14 = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int setIconSize() {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPivotX.setIconSize():int");
    }

    @Override // o.setMeasureAllChildren
    public final String setOnLongClickListener() {
        String str;
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 14) {
            str = setZ();
        } else if (i == 13) {
            str = MenuHostHelper$$ExternalSyntheticLambda1(setLayoutAnimation);
        } else if (i == 12) {
            str = MenuHostHelper$$ExternalSyntheticLambda1(setUiOptions);
        } else if (i == 15) {
            str = this.ViewPager$SavedState$1;
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(setTextAlignment());
            sb.append(" at path ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb.toString());
        }
        this.setTextAlignment = 0;
        this.setY[this.setUnboundedRipple - 1] = str;
        return str;
    }

    @Override // o.setMeasureAllChildren
    public final int MenuHostHelper$$ExternalSyntheticLambda1(setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setmeasureallchildren_menuhosthelper__externalsyntheticlambda0) {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return setIconTintList(this.ViewPager$SavedState$1, setmeasureallchildren_menuhosthelper__externalsyntheticlambda0);
        }
        int MenuHostHelper$$ExternalSyntheticLambda0 = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0(setmeasureallchildren_menuhosthelper__externalsyntheticlambda0.setIconTintList);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
            this.setTextAlignment = 0;
            this.setY[this.setUnboundedRipple - 1] = setmeasureallchildren_menuhosthelper__externalsyntheticlambda0.setY[MenuHostHelper$$ExternalSyntheticLambda0];
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        String str = this.setY[this.setUnboundedRipple - 1];
        String onLongClickListener = setOnLongClickListener();
        int iconTintList = setIconTintList(onLongClickListener, setmeasureallchildren_menuhosthelper__externalsyntheticlambda0);
        if (iconTintList == -1) {
            this.setTextAlignment = 15;
            this.ViewPager$SavedState$1 = onLongClickListener;
            this.setY[this.setUnboundedRipple - 1] = str;
        }
        return iconTintList;
    }

    @Override // o.setMeasureAllChildren
    public final void ViewPager$SavedState$1() {
        boolean z = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 14) {
            setTextScaleX();
        } else if (i == 13) {
            MenuHostHelper$$ExternalSyntheticLambda0(setLayoutAnimation);
        } else if (i == 12) {
            MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions);
        } else if (i != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(setTextAlignment());
            sb.append(" at path ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb.toString());
        }
        this.setTextAlignment = 0;
        this.setY[this.setUnboundedRipple - 1] = "null";
    }

    private int setIconTintList(String str, setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setmeasureallchildren_menuhosthelper__externalsyntheticlambda0) {
        int length = setmeasureallchildren_menuhosthelper__externalsyntheticlambda0.setY.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(setmeasureallchildren_menuhosthelper__externalsyntheticlambda0.setY[i])) {
                this.setTextAlignment = 0;
                this.setY[this.setUnboundedRipple - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // o.setMeasureAllChildren
    public final String setCenterIfNoTextEnabled() {
        String y;
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 10) {
            y = setZ();
        } else if (i == 9) {
            y = MenuHostHelper$$ExternalSyntheticLambda1(setLayoutAnimation);
        } else if (i == 8) {
            y = MenuHostHelper$$ExternalSyntheticLambda1(setUiOptions);
        } else if (i == 11) {
            y = this.ViewPager$SavedState$1;
            this.ViewPager$SavedState$1 = null;
        } else if (i == 16) {
            y = Long.toString(this.setIconSize);
        } else if (i != 17) {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(setTextAlignment());
            sb.append(" at path ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb.toString());
        } else {
            y = this.setOnLongClickListener.setY(this.setCenterIfNoTextEnabled, qQ.setIconTintList);
        }
        this.setTextAlignment = 0;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = this.setUnboundedRipple - 1;
        iArr[i2] = iArr[i2] + 1;
        return y;
    }

    @Override // o.setMeasureAllChildren
    public final boolean setUiOptions() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 5) {
            this.setTextAlignment = 0;
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = this.setUnboundedRipple - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.setTextAlignment = 0;
            int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i3 = this.setUnboundedRipple - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(setTextAlignment());
            sb.append(" at path ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb.toString());
        }
    }

    @Override // o.setMeasureAllChildren
    public final double setNavigationOnClickListener() {
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 16) {
            this.setTextAlignment = 0;
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = this.setUnboundedRipple - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.setIconSize;
        }
        if (i == 17) {
            this.ViewPager$SavedState$1 = this.setOnLongClickListener.setY(this.setCenterIfNoTextEnabled, qQ.setIconTintList);
        } else if (i == 9) {
            this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda1(setLayoutAnimation);
        } else if (i == 8) {
            this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda1(setUiOptions);
        } else if (i == 10) {
            this.ViewPager$SavedState$1 = setZ();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(setTextAlignment());
            sb.append(" at path ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb.toString());
        }
        this.setTextAlignment = 11;
        try {
            double parseDouble = Double.parseDouble(this.ViewPager$SavedState$1);
            boolean z = this.setX;
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(MenuHostHelper$$ExternalSyntheticLambda1());
                throw new setScaleX(sb2.toString());
            }
            this.ViewPager$SavedState$1 = null;
            this.setTextAlignment = 0;
            int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i3 = this.setUnboundedRipple - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.ViewPager$SavedState$1);
            sb3.append(" at path ");
            sb3.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb3.toString());
        }
    }

    private String MenuHostHelper$$ExternalSyntheticLambda1(C0610xu c0610xu) {
        StringBuilder sb = null;
        while (true) {
            long MenuHostHelper$$ExternalSyntheticLambda1 = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(c0610xu);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                throw setY("Unterminated string");
            }
            if (this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1) != 92) {
                if (sb != null) {
                    sb.append(this.setOnLongClickListener.setY(MenuHostHelper$$ExternalSyntheticLambda1, qQ.setIconTintList));
                    this.setOnLongClickListener.setUnboundedRipple();
                    return sb.toString();
                }
                String y = this.setOnLongClickListener.setY(MenuHostHelper$$ExternalSyntheticLambda1, qQ.setIconTintList);
                this.setOnLongClickListener.setUnboundedRipple();
                return y;
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.setOnLongClickListener.setY(MenuHostHelper$$ExternalSyntheticLambda1, qQ.setIconTintList));
            this.setOnLongClickListener.setUnboundedRipple();
            sb.append(setAnimationFromJson());
        }
    }

    private String setZ() {
        long MenuHostHelper$$ExternalSyntheticLambda1 = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(setNavigationOnClickListener);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            C0602xo c0602xo = this.setOnLongClickListener;
            return c0602xo.setY(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, qQ.setIconTintList);
        }
        return this.setOnLongClickListener.setY(MenuHostHelper$$ExternalSyntheticLambda1, qQ.setIconTintList);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(C0610xu c0610xu) {
        while (true) {
            long MenuHostHelper$$ExternalSyntheticLambda1 = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(c0610xu);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                throw setY("Unterminated string");
            }
            if (this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1) == 92) {
                this.setOnLongClickListener.setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda1 + 1);
                setAnimationFromJson();
            } else {
                this.setOnLongClickListener.setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda1 + 1);
                return;
            }
        }
    }

    private void setTextScaleX() {
        long MenuHostHelper$$ExternalSyntheticLambda1 = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(setNavigationOnClickListener);
        C0602xo c0602xo = this.setOnLongClickListener;
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            MenuHostHelper$$ExternalSyntheticLambda1 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        c0602xo.setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // o.setMeasureAllChildren
    public final int setLayoutAnimation() {
        String MenuHostHelper$$ExternalSyntheticLambda1;
        int i = this.setTextAlignment;
        if (i == 0) {
            i = setIconSize();
        }
        if (i == 16) {
            long j = this.setIconSize;
            int i2 = (int) j;
            if (j != i2) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(this.setIconSize);
                sb.append(" at path ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
                throw new getPivotY(sb.toString());
            }
            this.setTextAlignment = 0;
            int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i3 = this.setUnboundedRipple - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 17) {
            this.ViewPager$SavedState$1 = this.setOnLongClickListener.setY(this.setCenterIfNoTextEnabled, qQ.setIconTintList);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setLayoutAnimation);
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setUiOptions);
            }
            this.ViewPager$SavedState$1 = MenuHostHelper$$ExternalSyntheticLambda1;
            try {
                int parseInt = Integer.parseInt(MenuHostHelper$$ExternalSyntheticLambda1);
                this.setTextAlignment = 0;
                int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                int i4 = this.setUnboundedRipple - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(setTextAlignment());
            sb2.append(" at path ");
            sb2.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb2.toString());
        }
        this.setTextAlignment = 11;
        try {
            double parseDouble = Double.parseDouble(this.ViewPager$SavedState$1);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                StringBuilder sb3 = new StringBuilder("Expected an int but was ");
                sb3.append(this.ViewPager$SavedState$1);
                sb3.append(" at path ");
                sb3.append(MenuHostHelper$$ExternalSyntheticLambda1());
                throw new getPivotY(sb3.toString());
            }
            this.ViewPager$SavedState$1 = null;
            this.setTextAlignment = 0;
            int[] iArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            int i6 = this.setUnboundedRipple - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.ViewPager$SavedState$1);
            sb4.append(" at path ");
            sb4.append(MenuHostHelper$$ExternalSyntheticLambda1());
            throw new getPivotY(sb4.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setTextAlignment = 0;
        this.setIconTintList[0] = 8;
        this.setUnboundedRipple = 1;
        C0602xo c0602xo = this.setOnLongClickListener;
        c0602xo.setOnLongClickListener(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
        this.setChipCornerRadius.close();
    }

    @Override // o.setMeasureAllChildren
    public final void setChipCornerRadius() {
        boolean z = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i = 0;
        do {
            int i2 = this.setTextAlignment;
            if (i2 == 0) {
                i2 = setIconSize();
            }
            if (i2 == 3) {
                setX(1);
            } else if (i2 == 1) {
                setX(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(setTextAlignment());
                        sb.append(" at path ");
                        sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
                        throw new getPivotY(sb.toString());
                    }
                    this.setUnboundedRipple--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(setTextAlignment());
                        sb2.append(" at path ");
                        sb2.append(MenuHostHelper$$ExternalSyntheticLambda1());
                        throw new getPivotY(sb2.toString());
                    }
                    this.setUnboundedRipple--;
                } else if (i2 == 14 || i2 == 10) {
                    setTextScaleX();
                } else if (i2 == 9 || i2 == 13) {
                    MenuHostHelper$$ExternalSyntheticLambda0(setLayoutAnimation);
                } else if (i2 == 8 || i2 == 12) {
                    MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions);
                } else if (i2 == 17) {
                    this.setOnLongClickListener.setOnLongClickListener(this.setCenterIfNoTextEnabled);
                } else if (i2 == 18) {
                    StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                    sb3.append(setTextAlignment());
                    sb3.append(" at path ");
                    sb3.append(MenuHostHelper$$ExternalSyntheticLambda1());
                    throw new getPivotY(sb3.toString());
                }
                this.setTextAlignment = 0;
            }
            i++;
            this.setTextAlignment = 0;
        } while (i != 0);
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = this.setUnboundedRipple - 1;
        iArr[i3] = iArr[i3] + 1;
        this.setY[this.setUnboundedRipple - 1] = "null";
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!this.setChipCornerRadius.setY(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte MenuHostHelper$$ExternalSyntheticLambda1 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(i);
            if (MenuHostHelper$$ExternalSyntheticLambda1 != 10 && MenuHostHelper$$ExternalSyntheticLambda1 != 32 && MenuHostHelper$$ExternalSyntheticLambda1 != 13 && MenuHostHelper$$ExternalSyntheticLambda1 != 9) {
                this.setOnLongClickListener.setOnLongClickListener(i2 - 1);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 47) {
                    if (this.setChipCornerRadius.setY(2L)) {
                        boolean z2 = this.setX;
                        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                    return MenuHostHelper$$ExternalSyntheticLambda1;
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 35) {
                    return MenuHostHelper$$ExternalSyntheticLambda1;
                } else {
                    boolean z3 = this.setX;
                    throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(this.setChipCornerRadius);
        sb.append(")");
        return sb.toString();
    }

    private char setAnimationFromJson() {
        int i;
        int i2;
        if (!this.setChipCornerRadius.setY(1L)) {
            throw setY("Unterminated escape sequence");
        }
        byte unboundedRipple = this.setOnLongClickListener.setUnboundedRipple();
        if (unboundedRipple == 10 || unboundedRipple == 34 || unboundedRipple == 39 || unboundedRipple == 47 || unboundedRipple == 92) {
            return (char) unboundedRipple;
        }
        if (unboundedRipple != 98) {
            if (unboundedRipple != 102) {
                if (unboundedRipple != 110) {
                    if (unboundedRipple != 114) {
                        if (unboundedRipple != 116) {
                            if (unboundedRipple == 117) {
                                if (!this.setChipCornerRadius.setY(4L)) {
                                    StringBuilder sb = new StringBuilder("Unterminated escape sequence at path ");
                                    sb.append(MenuHostHelper$$ExternalSyntheticLambda1());
                                    throw new EOFException(sb.toString());
                                }
                                char c = 0;
                                for (int i3 = 0; i3 < 4; i3++) {
                                    byte MenuHostHelper$$ExternalSyntheticLambda1 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(i3);
                                    char c2 = (char) (c << 4);
                                    if (MenuHostHelper$$ExternalSyntheticLambda1 < 48 || MenuHostHelper$$ExternalSyntheticLambda1 > 57) {
                                        if (MenuHostHelper$$ExternalSyntheticLambda1 >= 97 && MenuHostHelper$$ExternalSyntheticLambda1 <= 102) {
                                            i = MenuHostHelper$$ExternalSyntheticLambda1 - 97;
                                        } else if (MenuHostHelper$$ExternalSyntheticLambda1 < 65 || MenuHostHelper$$ExternalSyntheticLambda1 > 70) {
                                            StringBuilder sb2 = new StringBuilder("\\u");
                                            sb2.append(this.setOnLongClickListener.setY(4L, qQ.setIconTintList));
                                            throw setY(sb2.toString());
                                        } else {
                                            i = MenuHostHelper$$ExternalSyntheticLambda1 - 65;
                                        }
                                        i2 = i + 10;
                                    } else {
                                        i2 = MenuHostHelper$$ExternalSyntheticLambda1 - 48;
                                    }
                                    c = (char) (c2 + i2);
                                }
                                this.setOnLongClickListener.setOnLongClickListener(4L);
                                return c;
                            }
                            boolean z = this.setX;
                            StringBuilder sb3 = new StringBuilder("Invalid escape sequence: \\");
                            sb3.append((char) unboundedRipple);
                            throw setY(sb3.toString());
                        }
                        return '\t';
                    }
                    return '\r';
                }
                return '\n';
            }
            return '\f';
        }
        return '\b';
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        boolean z = this.setX;
        throw setY("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}