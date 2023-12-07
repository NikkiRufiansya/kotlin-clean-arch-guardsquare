package o;

import o.setJustificationMode;

/* loaded from: classes.dex */
public final class setOnDismissListener implements setScaleY<setJustificationMode> {
    public static final setOnDismissListener MenuHostHelper$$ExternalSyntheticLambda0 = new setOnDismissListener();
    private static final setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0 setX = setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private setOnDismissListener() {
    }

    @Override // o.setScaleY
    public final /* synthetic */ setJustificationMode setX(setMeasureAllChildren setmeasureallchildren, float f) {
        setJustificationMode.setX setx = setJustificationMode.setX.CENTER;
        setmeasureallchildren.setX();
        setJustificationMode.setX setx2 = setx;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (setmeasureallchildren.setUnboundedRipple()) {
            switch (setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda1(setX)) {
                case 0:
                    str = setmeasureallchildren.setCenterIfNoTextEnabled();
                    break;
                case 1:
                    str2 = setmeasureallchildren.setCenterIfNoTextEnabled();
                    break;
                case 2:
                    f2 = (float) setmeasureallchildren.setNavigationOnClickListener();
                    break;
                case 3:
                    int layoutAnimation = setmeasureallchildren.setLayoutAnimation();
                    if (layoutAnimation > setJustificationMode.setX.CENTER.ordinal() || layoutAnimation < 0) {
                        setx2 = setJustificationMode.setX.CENTER;
                        break;
                    } else {
                        setx2 = setJustificationMode.setX.values()[layoutAnimation];
                        break;
                    }
                case 4:
                    i = setmeasureallchildren.setLayoutAnimation();
                    break;
                case 5:
                    f3 = (float) setmeasureallchildren.setNavigationOnClickListener();
                    break;
                case 6:
                    f4 = (float) setmeasureallchildren.setNavigationOnClickListener();
                    break;
                case 7:
                    i2 = AppDatabase_Impl.setX(setmeasureallchildren);
                    break;
                case 8:
                    i3 = AppDatabase_Impl.setX(setmeasureallchildren);
                    break;
                case 9:
                    f5 = (float) setmeasureallchildren.setNavigationOnClickListener();
                    break;
                case 10:
                    z = setmeasureallchildren.setUiOptions();
                    break;
                default:
                    setmeasureallchildren.ViewPager$SavedState$1();
                    setmeasureallchildren.setChipCornerRadius();
                    break;
            }
        }
        setmeasureallchildren.setIconTintList();
        return new setJustificationMode(str, str2, f2, setx2, i, f3, f4, i2, i3, f5, z);
    }
}