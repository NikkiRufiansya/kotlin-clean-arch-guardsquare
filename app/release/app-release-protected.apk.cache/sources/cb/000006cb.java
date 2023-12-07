package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.MaterialCheckBox$SavedState$1;
import o.setImageResource;

/* renamed from: o.lo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275lo {
    @nH
    public final com.rmldemo.guardsquare.data.local.AppDatabase MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        Executor executor;
        setImageResource.setX setx;
        pN.setY(context, "");
        if ("nuntium_database".trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        MaterialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1 materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1 = new MaterialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1(context, com.rmldemo.guardsquare.data.local.AppDatabase.class, "nuntium_database");
        materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setMinAndMaxProgress = false;
        materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setY = true;
        materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        if (materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        if (materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        Executor executor2 = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection;
        if (executor2 == null && materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource == null) {
            Executor x = setMenuCallbacks.setX();
            materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource = x;
            materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection = x;
        } else if (executor2 != null && materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource == null) {
            materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource = executor2;
        } else if (executor2 == null && (executor = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource) != null) {
            materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection = executor;
        }
        Set<Integer> set = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setIconSize;
        setImageResource.setX setx2 = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAlignment;
        setImageResource.setX setsmoothscrollbarenabled = new setSmoothScrollbarEnabled();
        long j = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
        if (j <= 0) {
            setx = setsmoothscrollbarenabled;
        } else if (materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextScaleX == null) {
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        } else {
            setx = new setPathData(setsmoothscrollbarenabled, new setPasswordVisibilityToggleTintList(j, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setX, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource));
        }
        String str = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions;
        File file = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation;
        Callable<InputStream> callable = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener;
        MaterialCheckBox$SavedState$1.setUiOptions setuioptions = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setMaxEms;
        Context context2 = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        String str2 = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextScaleX;
        MaterialCheckBox$SavedState$1.setIconTintList seticontintlist = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
        ArrayList<MaterialCheckBox$SavedState$1.setX> arrayList = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple;
        boolean z = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        MaterialCheckBox$SavedState$1.setY sety = materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius;
        if (sety == MaterialCheckBox$SavedState$1.setY.AUTOMATIC) {
            ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
            if (activityManager != null && !MaterialCheckBox$SavedState$1.setY.setX(activityManager)) {
                sety = MaterialCheckBox$SavedState$1.setY.WRITE_AHEAD_LOGGING;
            } else {
                sety = MaterialCheckBox$SavedState$1.setY.TRUNCATE;
            }
        }
        setSelectedTabIndicatorHeight setselectedtabindicatorheight = new setSelectedTabIndicatorHeight(context2, str2, setx, seticontintlist, null, z, sety, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setOnNavigationItemSelectedListener, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setMinAndMaxProgress, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setY, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setZ, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setAnimationFromJson, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent, materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
        MaterialCheckBox$SavedState$1 materialCheckBox$SavedState$1 = (MaterialCheckBox$SavedState$1) setCompoundDrawableTintBlendMode.MenuHostHelper$$ExternalSyntheticLambda0(materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled, "_Impl");
        materialCheckBox$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(setselectedtabindicatorheight);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) materialCheckBox$SavedState$1, "");
        return (com.rmldemo.guardsquare.data.local.AppDatabase) materialCheckBox$SavedState$1;
    }

    @nH
    public final kO setX(com.rmldemo.guardsquare.data.local.AppDatabase appDatabase) {
        pN.setY(appDatabase, "");
        return appDatabase.setTextAlignment();
    }

    @nH
    public final SharedPreferences setX(Context context) {
        pN.setY(context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("shared", 0);
        pN.setX(sharedPreferences);
        return sharedPreferences;
    }
}