package o;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.MaterialCheckBox$SavedState$1;
import o.setImageResource;

/* loaded from: classes.dex */
public final class setSelectedTabIndicatorHeight {
    public final List<MaterialCheckBox$SavedState$1.setX> MenuHostHelper$$ExternalSyntheticLambda0 = null;
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    public final MaterialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 ViewPager$SavedState$1;
    public final boolean setAnimationFromJson;
    public final String setCenterIfNoTextEnabled;
    public final Intent setChipCornerRadius;
    public final boolean setIconSize;
    public final Context setIconTintList;
    public final String setLayoutAnimation;
    public final setImageResource.setX setMaxEms;
    public final Callable<InputStream> setNavigationOnClickListener;
    public final MaterialCheckBox$SavedState$1.setIconTintList setOnLongClickListener;
    public final Executor setOnNavigationItemSelectedListener;
    public final Executor setTextAlignment;
    public final List<Object> setTextScaleX;
    public final MaterialCheckBox$SavedState$1.setY setUiOptions;
    public final File setUnboundedRipple;
    public final boolean setX;
    public final List<setCheckedState> setY;
    private final Set<Integer> setZ;

    public setSelectedTabIndicatorHeight(Context context, String str, setImageResource.setX setx, MaterialCheckBox$SavedState$1.setIconTintList seticontintlist, List<MaterialCheckBox$SavedState$1.setX> list, boolean z, MaterialCheckBox$SavedState$1.setY sety, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, MaterialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0, List<Object> list2, List<setCheckedState> list3) {
        this.setMaxEms = setx;
        this.setIconTintList = context;
        this.setCenterIfNoTextEnabled = str;
        this.setOnLongClickListener = seticontintlist;
        this.setX = z;
        this.setUiOptions = sety;
        this.setTextAlignment = executor;
        this.setOnNavigationItemSelectedListener = executor2;
        this.setChipCornerRadius = intent;
        this.setIconSize = intent != null;
        this.setAnimationFromJson = z2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z3;
        this.setZ = set;
        this.setLayoutAnimation = str2;
        this.setUnboundedRipple = file;
        this.setNavigationOnClickListener = callable;
        this.ViewPager$SavedState$1 = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0;
        this.setTextScaleX = list2 == null ? Collections.emptyList() : list2;
        this.setY = list3 == null ? Collections.emptyList() : list3;
    }

    public final boolean setX(int i, int i2) {
        Set<Integer> set;
        return !((i > i2) && this.MenuHostHelper$$ExternalSyntheticLambda1) && this.setAnimationFromJson && ((set = this.setZ) == null || !set.contains(Integer.valueOf(i)));
    }
}