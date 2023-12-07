package o;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class setSimpleItems {
    final List<setChildIndicatorBoundsRelative<Float>> MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;
    final int ViewPager$SavedState$1;
    final int setAnimationFromJson;
    final int setCenterIfNoTextEnabled;
    final int setChipCornerRadius;
    final String setIconSize;
    public final long setIconTintList;
    final setY setLayoutAnimation;
    final setup setLayoutDirection;
    final setCounterMaxLength setMaxEms;
    final float setMinAndMaxProgress;
    final long setNavigationOnClickListener;
    public final setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener;
    final float setOnNavigationItemSelectedListener;
    final List<getRootAlpha> setTextAlignment;
    final setOnReceiveContentListener setTextScaleX;
    final List<setScrollIndicators> setUiOptions;
    final int setUnboundedRipple;
    final boolean setX;
    final setBoxStrokeErrorColor setY;
    final setLines setZ;

    /* loaded from: classes.dex */
    public enum setY {
        NONE,
        ADD,
        INVERT,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public setSimpleItems(List<getRootAlpha> list, setBoxStrokeErrorColor setboxstrokeerrorcolor, String str, long j, setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0 setsimpleitems_menuhosthelper__externalsyntheticlambda0, long j2, String str2, List<setScrollIndicators> list2, setup setupVar, int i, int i2, int i3, float f, float f2, int i4, int i5, setCounterMaxLength setcountermaxlength, setLines setlines, List<setChildIndicatorBoundsRelative<Float>> list3, setY sety, setOnReceiveContentListener setonreceivecontentlistener, boolean z) {
        this.setTextAlignment = list;
        this.setY = setboxstrokeerrorcolor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setIconTintList = j;
        this.setOnLongClickListener = setsimpleitems_menuhosthelper__externalsyntheticlambda0;
        this.setNavigationOnClickListener = j2;
        this.setIconSize = str2;
        this.setUiOptions = list2;
        this.setLayoutDirection = setupVar;
        this.setAnimationFromJson = i;
        this.setChipCornerRadius = i2;
        this.setCenterIfNoTextEnabled = i3;
        this.setMinAndMaxProgress = f;
        this.setOnNavigationItemSelectedListener = f2;
        this.ViewPager$SavedState$1 = i4;
        this.setUnboundedRipple = i5;
        this.setMaxEms = setcountermaxlength;
        this.setZ = setlines;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = list3;
        this.setLayoutAnimation = sety;
        this.setTextScaleX = setonreceivecontentlistener;
        this.setX = z;
    }

    public final String toString() {
        return setX("");
    }

    public final String setX(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("\n");
        setSimpleItems MenuHostHelper$$ExternalSyntheticLambda0 = this.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener, null);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            sb.append("\t\tParents: ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1);
            setSimpleItems MenuHostHelper$$ExternalSyntheticLambda02 = this.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener, null);
            while (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                sb.append("->");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1);
                MenuHostHelper$$ExternalSyntheticLambda02 = this.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda02.setNavigationOnClickListener, null);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.setUiOptions.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.setUiOptions.size());
            sb.append("\n");
        }
        if (this.setAnimationFromJson != 0 && this.setChipCornerRadius != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.setAnimationFromJson), Integer.valueOf(this.setChipCornerRadius), Integer.valueOf(this.setCenterIfNoTextEnabled)));
        }
        if (!this.setTextAlignment.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (getRootAlpha getrootalpha : this.setTextAlignment) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(getrootalpha);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}