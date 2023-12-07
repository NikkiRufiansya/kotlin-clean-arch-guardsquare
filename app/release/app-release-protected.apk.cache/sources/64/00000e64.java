package o;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import o.setBaselineAlignBottom;
import o.setEdgeEffectColor;

/* loaded from: classes.dex */
public final class setOverscrollHeader {
    public final setTextCursorDrawable MenuHostHelper$$ExternalSyntheticLambda0;
    public final setDropDownBackgroundResource setIconTintList;
    private final setCornerRadiusResource setY;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    int setX = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOverscrollHeader(setCornerRadiusResource setcornerradiusresource, setTextCursorDrawable settextcursordrawable, setDropDownBackgroundResource setdropdownbackgroundresource) {
        this.setY = setcornerradiusresource;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = settextcursordrawable;
        this.setIconTintList = setdropdownbackgroundresource;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOverscrollHeader(setCornerRadiusResource setcornerradiusresource, setTextCursorDrawable settextcursordrawable, ClassLoader classLoader, setForegroundTintMode setforegroundtintmode, setCollapsedTitleGravity setcollapsedtitlegravity) {
        boolean isLoggable;
        this.setY = setcornerradiusresource;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = settextcursordrawable;
        setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1 = setforegroundtintmode.MenuHostHelper$$ExternalSyntheticLambda1(classLoader, setcollapsedtitlegravity.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1;
        if (setcollapsedtitlegravity.setY != null) {
            setcollapsedtitlegravity.setY.setClassLoader(classLoader);
        }
        MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1(setcollapsedtitlegravity.setY);
        MenuHostHelper$$ExternalSyntheticLambda1.setShrinkMotionSpec = setcollapsedtitlegravity.setCenterIfNoTextEnabled;
        MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius = setcollapsedtitlegravity.setUiOptions;
        MenuHostHelper$$ExternalSyntheticLambda1.SearchView$SavedState$1 = true;
        MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = setcollapsedtitlegravity.setIconTintList;
        MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation = setcollapsedtitlegravity.MenuHostHelper$$ExternalSyntheticLambda0;
        MenuHostHelper$$ExternalSyntheticLambda1.setObjectValues = setcollapsedtitlegravity.setIconSize;
        MenuHostHelper$$ExternalSyntheticLambda1.setHasDecor = setcollapsedtitlegravity.setLayoutAnimation;
        MenuHostHelper$$ExternalSyntheticLambda1.ExtendableSavedState$1 = setcollapsedtitlegravity.setNavigationOnClickListener;
        MenuHostHelper$$ExternalSyntheticLambda1.setIconSize = setcollapsedtitlegravity.setX;
        MenuHostHelper$$ExternalSyntheticLambda1.setTextScaleX = setcollapsedtitlegravity.setUnboundedRipple;
        MenuHostHelper$$ExternalSyntheticLambda1.setGuidelinePercent = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.values()[setcollapsedtitlegravity.setOnLongClickListener];
        if (setcollapsedtitlegravity.setTextAlignment != null) {
            MenuHostHelper$$ExternalSyntheticLambda1.FragmentStateAdapter$2 = setcollapsedtitlegravity.setTextAlignment;
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1.FragmentStateAdapter$2 = new Bundle();
        }
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("Instantiated fragment ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOverscrollHeader(setCornerRadiusResource setcornerradiusresource, setTextCursorDrawable settextcursordrawable, setDropDownBackgroundResource setdropdownbackgroundresource, setCollapsedTitleGravity setcollapsedtitlegravity) {
        this.setY = setcornerradiusresource;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = settextcursordrawable;
        this.setIconTintList = setdropdownbackgroundresource;
        setdropdownbackgroundresource.setFilterTouchesWhenObscured = null;
        setdropdownbackgroundresource.setConstraintSet = null;
        setdropdownbackgroundresource.setY = 0;
        setdropdownbackgroundresource.setAnimationFromJson = false;
        setdropdownbackgroundresource.setX = false;
        setdropdownbackgroundresource.setChipIconEnabled = setdropdownbackgroundresource.setViewTranslationCallback != null ? setdropdownbackgroundresource.setViewTranslationCallback.setShrinkMotionSpec : null;
        setdropdownbackgroundresource.setViewTranslationCallback = null;
        if (setcollapsedtitlegravity.setTextAlignment != null) {
            setdropdownbackgroundresource.FragmentStateAdapter$2 = setcollapsedtitlegravity.setTextAlignment;
        } else {
            setdropdownbackgroundresource.FragmentStateAdapter$2 = new Bundle();
        }
    }

    final int MenuHostHelper$$ExternalSyntheticLambda0() {
        setEdgeEffectColor.setY.setIconTintList seticontintlist;
        boolean isLoggable;
        EmojiCompatInitializer emojiCompatInitializer;
        if (this.setIconTintList.ViewPager$SavedState$1 == null) {
            return this.setIconTintList.setAdapter;
        }
        int i = this.setX;
        int i2 = AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconTintList.setGuidelinePercent.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 == 4) {
                i = Math.min(i, 0);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (this.setIconTintList.setChipCornerRadius) {
            if (this.setIconTintList.setAnimationFromJson) {
                i = Math.max(this.setX, 2);
                if (this.setIconTintList.setImageTintMode != null && this.setIconTintList.setImageTintMode.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.setX < 4 ? Math.min(i, this.setIconTintList.setAdapter) : Math.min(i, 1);
            }
        }
        if (!this.setIconTintList.setX) {
            i = Math.min(i, 1);
        }
        boolean z = ParcelImpl.setX;
        if (this.setIconTintList.setUnboundedRipple != null) {
            ViewGroup viewGroup = this.setIconTintList.setUnboundedRipple;
            ParcelImpl FragmentStateAdapter$5 = this.setIconTintList.FragmentStateAdapter$5();
            EmojiCompatInitializer emojiCompatInitializer2 = FragmentStateAdapter$5.setLayoutDirection;
            setDropDownBackgroundResource setdropdownbackgroundresource = FragmentStateAdapter$5.setGuidelinePercent;
            if (setdropdownbackgroundresource != null) {
                ParcelImpl parcelImpl = setdropdownbackgroundresource.ViewPager$SavedState$1;
                while (true) {
                    EmojiCompatInitializer emojiCompatInitializer3 = parcelImpl.setLayoutDirection;
                    setDropDownBackgroundResource setdropdownbackgroundresource2 = parcelImpl.setGuidelinePercent;
                    if (setdropdownbackgroundresource2 == null) {
                        break;
                    }
                    parcelImpl = setdropdownbackgroundresource2.ViewPager$SavedState$1;
                }
                emojiCompatInitializer = parcelImpl.setLayoutAnimation;
            } else {
                emojiCompatInitializer = FragmentStateAdapter$5.setLayoutAnimation;
            }
            seticontintlist = setEdgeEffectColor.setY(viewGroup, emojiCompatInitializer).MenuHostHelper$$ExternalSyntheticLambda0(this);
        } else {
            seticontintlist = null;
        }
        if (seticontintlist == setEdgeEffectColor.setY.setIconTintList.ADDING) {
            i = Math.min(i, 6);
        } else if (seticontintlist == setEdgeEffectColor.setY.setIconTintList.REMOVING) {
            i = Math.max(i, 3);
        } else if (this.setIconTintList.ExtendableSavedState$1) {
            if (this.setIconTintList.setFilterRedundantCalls()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (this.setIconTintList.setOnLongClickListener && this.setIconTintList.setAdapter < 5) {
            i = Math.min(i, 4);
        }
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("computeExpectedState() of ");
            sb.append(i);
            sb.append(" for ");
            sb.append(this.setIconTintList);
            Log.v("FragmentManager", sb.toString());
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setOverscrollHeader$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setNavigationOnClickListener() {
        EmojiCompatInitializer emojiCompatInitializer;
        EmojiCompatInitializer emojiCompatInitializer2;
        boolean isLoggable;
        EmojiCompatInitializer emojiCompatInitializer3;
        boolean isLoggable2;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            isLoggable2 = Log.isLoggable("FragmentManager", 2);
            if (isLoggable2) {
                StringBuilder sb = new StringBuilder("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(this.setIconTintList);
                Log.v("FragmentManager", sb.toString());
                return;
            }
            return;
        }
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            while (true) {
                int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda0 != this.setIconTintList.setAdapter) {
                    if (MenuHostHelper$$ExternalSyntheticLambda0 > this.setIconTintList.setAdapter) {
                        switch (this.setIconTintList.setAdapter + 1) {
                            case 0:
                                setY();
                                continue;
                            case 1:
                                MenuHostHelper$$ExternalSyntheticLambda1();
                                continue;
                            case 2:
                                setLayoutAnimation();
                                setX();
                                continue;
                            case 3:
                                setIconTintList();
                                continue;
                            case 4:
                                if (this.setIconTintList.setImageTintMode != null && this.setIconTintList.setUnboundedRipple != null) {
                                    ViewGroup viewGroup = this.setIconTintList.setUnboundedRipple;
                                    ParcelImpl FragmentStateAdapter$5 = this.setIconTintList.FragmentStateAdapter$5();
                                    EmojiCompatInitializer emojiCompatInitializer4 = FragmentStateAdapter$5.setLayoutDirection;
                                    setDropDownBackgroundResource setdropdownbackgroundresource = FragmentStateAdapter$5.setGuidelinePercent;
                                    if (setdropdownbackgroundresource != null) {
                                        ParcelImpl parcelImpl = setdropdownbackgroundresource.ViewPager$SavedState$1;
                                        while (true) {
                                            EmojiCompatInitializer emojiCompatInitializer5 = parcelImpl.setLayoutDirection;
                                            setDropDownBackgroundResource setdropdownbackgroundresource2 = parcelImpl.setGuidelinePercent;
                                            if (setdropdownbackgroundresource2 != null) {
                                                parcelImpl = setdropdownbackgroundresource2.ViewPager$SavedState$1;
                                            } else {
                                                emojiCompatInitializer2 = parcelImpl.setLayoutAnimation;
                                            }
                                        }
                                    } else {
                                        emojiCompatInitializer2 = FragmentStateAdapter$5.setLayoutAnimation;
                                    }
                                    setEdgeEffectColor.setY(viewGroup, emojiCompatInitializer2).setX(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.setImageTintMode.getVisibility()), this);
                                }
                                this.setIconTintList.setAdapter = 4;
                                continue;
                            case 5:
                                setTextAlignment();
                                continue;
                            case 6:
                                this.setIconTintList.setAdapter = 6;
                                continue;
                            case 7:
                                setChipCornerRadius();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (this.setIconTintList.setAdapter - 1) {
                            case -1:
                                setUnboundedRipple();
                                continue;
                            case 0:
                                setOnLongClickListener();
                                continue;
                            case 1:
                                setUiOptions();
                                this.setIconTintList.setAdapter = 1;
                                continue;
                            case 2:
                                this.setIconTintList.setAnimationFromJson = false;
                                this.setIconTintList.setAdapter = 2;
                                continue;
                            case 3:
                                isLoggable = Log.isLoggable("FragmentManager", 3);
                                if (isLoggable) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("movefrom ACTIVITY_CREATED: ");
                                    sb2.append(this.setIconTintList);
                                    Log.d("FragmentManager", sb2.toString());
                                }
                                if (this.setIconTintList.setImageTintMode != null && this.setIconTintList.setFilterTouchesWhenObscured == null) {
                                    ViewPager$SavedState$1();
                                }
                                if (this.setIconTintList.setImageTintMode != null && this.setIconTintList.setUnboundedRipple != null) {
                                    ViewGroup viewGroup2 = this.setIconTintList.setUnboundedRipple;
                                    ParcelImpl FragmentStateAdapter$52 = this.setIconTintList.FragmentStateAdapter$5();
                                    EmojiCompatInitializer emojiCompatInitializer6 = FragmentStateAdapter$52.setLayoutDirection;
                                    setDropDownBackgroundResource setdropdownbackgroundresource3 = FragmentStateAdapter$52.setGuidelinePercent;
                                    if (setdropdownbackgroundresource3 != null) {
                                        ParcelImpl parcelImpl2 = setdropdownbackgroundresource3.ViewPager$SavedState$1;
                                        while (true) {
                                            EmojiCompatInitializer emojiCompatInitializer7 = parcelImpl2.setLayoutDirection;
                                            setDropDownBackgroundResource setdropdownbackgroundresource4 = parcelImpl2.setGuidelinePercent;
                                            if (setdropdownbackgroundresource4 != null) {
                                                parcelImpl2 = setdropdownbackgroundresource4.ViewPager$SavedState$1;
                                            } else {
                                                emojiCompatInitializer3 = parcelImpl2.setLayoutAnimation;
                                            }
                                        }
                                    } else {
                                        emojiCompatInitializer3 = FragmentStateAdapter$52.setLayoutAnimation;
                                    }
                                    setEdgeEffectColor.setY(viewGroup2, emojiCompatInitializer3).setY(this);
                                }
                                this.setIconTintList.setAdapter = 3;
                                continue;
                            case 4:
                                setTextScaleX();
                                continue;
                            case 5:
                                this.setIconTintList.setAdapter = 5;
                                continue;
                            case 6:
                                setCenterIfNoTextEnabled();
                                continue;
                            default:
                                continue;
                        }
                    }
                } else {
                    boolean z = ParcelImpl.setX;
                    if (this.setIconTintList.setMaxEms) {
                        if (this.setIconTintList.setImageTintMode != null && this.setIconTintList.setUnboundedRipple != null) {
                            ViewGroup viewGroup3 = this.setIconTintList.setUnboundedRipple;
                            ParcelImpl FragmentStateAdapter$53 = this.setIconTintList.FragmentStateAdapter$5();
                            EmojiCompatInitializer emojiCompatInitializer8 = FragmentStateAdapter$53.setLayoutDirection;
                            setDropDownBackgroundResource setdropdownbackgroundresource5 = FragmentStateAdapter$53.setGuidelinePercent;
                            if (setdropdownbackgroundresource5 != null) {
                                ParcelImpl parcelImpl3 = setdropdownbackgroundresource5.ViewPager$SavedState$1;
                                while (true) {
                                    EmojiCompatInitializer emojiCompatInitializer9 = parcelImpl3.setLayoutDirection;
                                    setDropDownBackgroundResource setdropdownbackgroundresource6 = parcelImpl3.setGuidelinePercent;
                                    if (setdropdownbackgroundresource6 != null) {
                                        parcelImpl3 = setdropdownbackgroundresource6.ViewPager$SavedState$1;
                                    } else {
                                        emojiCompatInitializer = parcelImpl3.setLayoutAnimation;
                                    }
                                }
                            } else {
                                emojiCompatInitializer = FragmentStateAdapter$53.setLayoutAnimation;
                            }
                            setEdgeEffectColor y = setEdgeEffectColor.setY(viewGroup3, emojiCompatInitializer);
                            if (this.setIconTintList.setTextScaleX) {
                                y.setIconTintList(this);
                            } else {
                                y.MenuHostHelper$$ExternalSyntheticLambda1(this);
                            }
                        }
                        if (this.setIconTintList.ViewPager$SavedState$1 != null) {
                            ParcelImpl parcelImpl4 = this.setIconTintList.ViewPager$SavedState$1;
                            setDropDownBackgroundResource setdropdownbackgroundresource7 = this.setIconTintList;
                            if (setdropdownbackgroundresource7.setX && ParcelImpl.setIconTintList(setdropdownbackgroundresource7)) {
                                parcelImpl4.setOnNavigationItemSelectedListener = true;
                            }
                        }
                        this.setIconTintList.setMaxEms = false;
                        setDropDownBackgroundResource setdropdownbackgroundresource8 = this.setIconTintList;
                        setdropdownbackgroundresource8.setY(setdropdownbackgroundresource8.setTextScaleX);
                    }
                    return;
                }
            }
        } finally {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setLayoutAnimation() {
        boolean isLoggable;
        if (this.setIconTintList.setChipCornerRadius && this.setIconTintList.setAnimationFromJson && !this.setIconTintList.setChipIconTintResource) {
            isLoggable = Log.isLoggable("FragmentManager", 3);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("moveto CREATE_VIEW: ");
                sb.append(this.setIconTintList);
                Log.d("FragmentManager", sb.toString());
            }
            setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconTintList;
            setdropdownbackgroundresource.setX(setdropdownbackgroundresource.setNavigationOnClickListener(setdropdownbackgroundresource.FragmentStateAdapter$2), (ViewGroup) null, this.setIconTintList.FragmentStateAdapter$2);
            if (this.setIconTintList.setImageTintMode != null) {
                this.setIconTintList.setImageTintMode.setSaveFromParentEnabled(false);
                this.setIconTintList.setImageTintMode.setTag(R.id.res_0x7f0a00d6, this.setIconTintList);
                if (this.setIconTintList.setTextScaleX) {
                    this.setIconTintList.setImageTintMode.setVisibility(8);
                }
                this.setIconTintList.TextInputLayout$SavedState$1();
                setCornerRadiusResource setcornerradiusresource = this.setY;
                setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
                setcornerradiusresource.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource2, setdropdownbackgroundresource2.setImageTintMode, this.setIconTintList.FragmentStateAdapter$2, false);
                this.setIconTintList.setAdapter = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(ClassLoader classLoader) {
        if (this.setIconTintList.FragmentStateAdapter$2 == null) {
            return;
        }
        this.setIconTintList.FragmentStateAdapter$2.setClassLoader(classLoader);
        setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconTintList;
        setdropdownbackgroundresource.setFilterTouchesWhenObscured = setdropdownbackgroundresource.FragmentStateAdapter$2.getSparseParcelableArray("android:view_state");
        setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
        setdropdownbackgroundresource2.setConstraintSet = setdropdownbackgroundresource2.FragmentStateAdapter$2.getBundle("android:view_registry_state");
        setDropDownBackgroundResource setdropdownbackgroundresource3 = this.setIconTintList;
        setdropdownbackgroundresource3.setChipIconEnabled = setdropdownbackgroundresource3.FragmentStateAdapter$2.getString("android:target_state");
        if (this.setIconTintList.setChipIconEnabled != null) {
            setDropDownBackgroundResource setdropdownbackgroundresource4 = this.setIconTintList;
            setdropdownbackgroundresource4.setSuffixText = setdropdownbackgroundresource4.FragmentStateAdapter$2.getInt("android:target_req_state", 0);
        }
        if (this.setIconTintList.FragmentStateAdapter$5 != null) {
            setDropDownBackgroundResource setdropdownbackgroundresource5 = this.setIconTintList;
            setdropdownbackgroundresource5.RecyclerView$SavedState$1 = setdropdownbackgroundresource5.FragmentStateAdapter$5.booleanValue();
            this.setIconTintList.FragmentStateAdapter$5 = null;
        } else {
            setDropDownBackgroundResource setdropdownbackgroundresource6 = this.setIconTintList;
            setdropdownbackgroundresource6.RecyclerView$SavedState$1 = setdropdownbackgroundresource6.FragmentStateAdapter$2.getBoolean("android:user_visible_hint", true);
        }
        if (this.setIconTintList.RecyclerView$SavedState$1) {
            return;
        }
        this.setIconTintList.setOnLongClickListener = true;
    }

    final void setY() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("moveto ATTACHED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        setOverscrollHeader setoverscrollheader = null;
        if (this.setIconTintList.setViewTranslationCallback != null) {
            setTextCursorDrawable settextcursordrawable = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setOverscrollHeader setoverscrollheader2 = settextcursordrawable.setX.get(this.setIconTintList.setViewTranslationCallback.setShrinkMotionSpec);
            if (setoverscrollheader2 == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(this.setIconTintList);
                sb2.append(" declared target fragment ");
                sb2.append(this.setIconTintList.setViewTranslationCallback);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
            setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconTintList;
            setdropdownbackgroundresource.setChipIconEnabled = setdropdownbackgroundresource.setViewTranslationCallback.setShrinkMotionSpec;
            this.setIconTintList.setViewTranslationCallback = null;
            setoverscrollheader = setoverscrollheader2;
        } else if (this.setIconTintList.setChipIconEnabled != null) {
            setTextCursorDrawable settextcursordrawable2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setoverscrollheader = settextcursordrawable2.setX.get(this.setIconTintList.setChipIconEnabled);
            if (setoverscrollheader == null) {
                StringBuilder sb3 = new StringBuilder("Fragment ");
                sb3.append(this.setIconTintList);
                sb3.append(" declared target fragment ");
                sb3.append(this.setIconTintList.setChipIconEnabled);
                sb3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb3.toString());
            }
        }
        if (setoverscrollheader != null) {
            boolean z = ParcelImpl.setX;
            setoverscrollheader.setNavigationOnClickListener();
        }
        setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
        setdropdownbackgroundresource2.setOnNavigationItemSelectedListener = setdropdownbackgroundresource2.ViewPager$SavedState$1.setCenterIfNoTextEnabled;
        setDropDownBackgroundResource setdropdownbackgroundresource3 = this.setIconTintList;
        setdropdownbackgroundresource3.setMinAndMaxProgress = setdropdownbackgroundresource3.ViewPager$SavedState$1.setGuidelinePercent;
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, false);
        this.setIconTintList.FabTransformationBehavior();
        this.setY.setIconTintList(this.setIconTintList, false);
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("moveto CREATED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        if (!this.setIconTintList.setZ) {
            setCornerRadiusResource setcornerradiusresource = this.setY;
            setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconTintList;
            setcornerradiusresource.MenuHostHelper$$ExternalSyntheticLambda1(setdropdownbackgroundresource, setdropdownbackgroundresource.FragmentStateAdapter$2, false);
            setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
            setdropdownbackgroundresource2.setUiOptions(setdropdownbackgroundresource2.FragmentStateAdapter$2);
            setCornerRadiusResource setcornerradiusresource2 = this.setY;
            setDropDownBackgroundResource setdropdownbackgroundresource3 = this.setIconTintList;
            setcornerradiusresource2.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource3, setdropdownbackgroundresource3.FragmentStateAdapter$2, false);
            return;
        }
        setDropDownBackgroundResource setdropdownbackgroundresource4 = this.setIconTintList;
        setdropdownbackgroundresource4.setCenterIfNoTextEnabled(setdropdownbackgroundresource4.FragmentStateAdapter$2);
        this.setIconTintList.setAdapter = 1;
    }

    final void setX() {
        boolean isLoggable;
        ViewGroup viewGroup;
        String str;
        boolean isLoggable2;
        if (this.setIconTintList.setChipCornerRadius) {
            return;
        }
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("moveto CREATE_VIEW: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconTintList;
        LayoutInflater navigationOnClickListener = setdropdownbackgroundresource.setNavigationOnClickListener(setdropdownbackgroundresource.FragmentStateAdapter$2);
        if (this.setIconTintList.setUnboundedRipple != null) {
            viewGroup = this.setIconTintList.setUnboundedRipple;
        } else if (this.setIconTintList.setLayoutAnimation == 0) {
            viewGroup = null;
        } else if (this.setIconTintList.setLayoutAnimation == -1) {
            StringBuilder sb2 = new StringBuilder("Cannot create fragment ");
            sb2.append(this.setIconTintList);
            sb2.append(" for a container view with no id");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            viewGroup = (ViewGroup) this.setIconTintList.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setIconTintList.setLayoutAnimation);
            if (viewGroup == null && !this.setIconTintList.SearchView$SavedState$1) {
                try {
                    str = this.setIconTintList.setSuffixText().getResourceName(this.setIconTintList.setLayoutAnimation);
                } catch (Resources.NotFoundException unused) {
                    str = "unknown";
                }
                StringBuilder sb3 = new StringBuilder("No view found for id 0x");
                sb3.append(Integer.toHexString(this.setIconTintList.setLayoutAnimation));
                sb3.append(" (");
                sb3.append(str);
                sb3.append(") for fragment ");
                sb3.append(this.setIconTintList);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        this.setIconTintList.setUnboundedRipple = viewGroup;
        setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
        setdropdownbackgroundresource2.setX(navigationOnClickListener, viewGroup, setdropdownbackgroundresource2.FragmentStateAdapter$2);
        if (this.setIconTintList.setImageTintMode != null) {
            this.setIconTintList.setImageTintMode.setSaveFromParentEnabled(false);
            this.setIconTintList.setImageTintMode.setTag(R.id.res_0x7f0a00d6, this.setIconTintList);
            if (viewGroup != null) {
                this.setIconTintList.setUnboundedRipple.addView(this.setIconTintList.setImageTintMode, this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this.setIconTintList));
            }
            if (this.setIconTintList.setTextScaleX) {
                this.setIconTintList.setImageTintMode.setVisibility(8);
            }
            if (!setBaselineAlignBottom.setChipIconTintResource(this.setIconTintList.setImageTintMode)) {
                final View view = this.setIconTintList.setImageTintMode;
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.setOverscrollHeader.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(view);
                    }
                });
            } else {
                setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.setImageTintMode);
            }
            this.setIconTintList.TextInputLayout$SavedState$1();
            setCornerRadiusResource setcornerradiusresource = this.setY;
            setDropDownBackgroundResource setdropdownbackgroundresource3 = this.setIconTintList;
            setcornerradiusresource.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource3, setdropdownbackgroundresource3.setImageTintMode, this.setIconTintList.FragmentStateAdapter$2, false);
            int visibility = this.setIconTintList.setImageTintMode.getVisibility();
            float alpha = this.setIconTintList.setImageTintMode.getAlpha();
            boolean z = ParcelImpl.setX;
            this.setIconTintList.setY(alpha);
            if (this.setIconTintList.setUnboundedRipple != null && visibility == 0) {
                View findFocus = this.setIconTintList.setImageTintMode.findFocus();
                if (findFocus != null) {
                    this.setIconTintList.setIconTintList(findFocus);
                    isLoggable2 = Log.isLoggable("FragmentManager", 2);
                    if (isLoggable2) {
                        StringBuilder sb4 = new StringBuilder("requestFocus: Saved focused view ");
                        sb4.append(findFocus);
                        sb4.append(" for Fragment ");
                        sb4.append(this.setIconTintList);
                        Log.v("FragmentManager", sb4.toString());
                    }
                }
                this.setIconTintList.setImageTintMode.setAlpha(0.0f);
            }
        }
        this.setIconTintList.setAdapter = 2;
    }

    final void setIconTintList() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("moveto ACTIVITY_CREATED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        setDropDownBackgroundResource setdropdownbackgroundresource = this.setIconTintList;
        setdropdownbackgroundresource.setUnboundedRipple(setdropdownbackgroundresource.FragmentStateAdapter$2);
        setCornerRadiusResource setcornerradiusresource = this.setY;
        setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
        setcornerradiusresource.setX(setdropdownbackgroundresource2, setdropdownbackgroundresource2.FragmentStateAdapter$2, false);
    }

    final void setTextAlignment() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("moveto STARTED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        this.setIconTintList.RemoteActionCompatParcelizer();
        this.setY.setUiOptions(this.setIconTintList, false);
    }

    final void setChipCornerRadius() {
        boolean isLoggable;
        boolean isLoggable2;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("moveto RESUMED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        View hasDecor = this.setIconTintList.setHasDecor();
        if (hasDecor != null && setIconTintList(hasDecor)) {
            boolean requestFocus = hasDecor.requestFocus();
            isLoggable2 = Log.isLoggable("FragmentManager", 2);
            if (isLoggable2) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(hasDecor);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.setIconTintList);
                sb2.append(" resulting in focused view ");
                sb2.append(this.setIconTintList.setImageTintMode.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.setIconTintList.setIconTintList((View) null);
        this.setIconTintList.setChipIconEnabledResource();
        this.setY.setOnLongClickListener(this.setIconTintList, false);
        this.setIconTintList.FragmentStateAdapter$2 = null;
        this.setIconTintList.setFilterTouchesWhenObscured = null;
        this.setIconTintList.setConstraintSet = null;
    }

    private boolean setIconTintList(View view) {
        if (view == this.setIconTintList.setImageTintMode) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.setIconTintList.setImageTintMode) {
                return true;
            }
        }
        return false;
    }

    final void setCenterIfNoTextEnabled() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("movefrom RESUMED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        this.setIconTintList.setSubmitButtonEnabled();
        this.setY.setX(this.setIconTintList, false);
    }

    final void setTextScaleX() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("movefrom STARTED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        this.setIconTintList.setBackgroundTintMode();
        this.setY.setNavigationOnClickListener(this.setIconTintList, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setCollapsedTitleGravity setIconSize() {
        setCollapsedTitleGravity setcollapsedtitlegravity = new setCollapsedTitleGravity(this.setIconTintList);
        if (this.setIconTintList.setAdapter < 0 || setcollapsedtitlegravity.setTextAlignment != null) {
            setcollapsedtitlegravity.setTextAlignment = this.setIconTintList.FragmentStateAdapter$2;
        } else {
            Bundle bundle = new Bundle();
            this.setIconTintList.setTextAlignment(bundle);
            this.setY.setY(this.setIconTintList, bundle, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.setIconTintList.setImageTintMode != null) {
                ViewPager$SavedState$1();
            }
            if (this.setIconTintList.setFilterTouchesWhenObscured != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.setIconTintList.setFilterTouchesWhenObscured);
            }
            if (this.setIconTintList.setConstraintSet != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.setIconTintList.setConstraintSet);
            }
            if (!this.setIconTintList.RecyclerView$SavedState$1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.setIconTintList.RecyclerView$SavedState$1);
            }
            setcollapsedtitlegravity.setTextAlignment = bundle;
            if (this.setIconTintList.setChipIconEnabled != null) {
                if (setcollapsedtitlegravity.setTextAlignment == null) {
                    setcollapsedtitlegravity.setTextAlignment = new Bundle();
                }
                setcollapsedtitlegravity.setTextAlignment.putString("android:target_state", this.setIconTintList.setChipIconEnabled);
                if (this.setIconTintList.setSuffixText != 0) {
                    setcollapsedtitlegravity.setTextAlignment.putInt("android:target_req_state", this.setIconTintList.setSuffixText);
                }
            }
        }
        return setcollapsedtitlegravity;
    }

    final void ViewPager$SavedState$1() {
        if (this.setIconTintList.setImageTintMode == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.setIconTintList.setImageTintMode.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.setIconTintList.setFilterTouchesWhenObscured = sparseArray;
        }
        Bundle bundle = new Bundle();
        setChildDivider setchilddivider = this.setIconTintList.setSelectedChildViewEnabled.setIconTintList;
        pN.setY(bundle, "");
        setchilddivider.setX.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.setIconTintList.setConstraintSet = bundle;
    }

    final void setUiOptions() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("movefrom CREATE_VIEW: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        if (this.setIconTintList.setUnboundedRipple != null && this.setIconTintList.setImageTintMode != null) {
            this.setIconTintList.setUnboundedRipple.removeView(this.setIconTintList.setImageTintMode);
        }
        this.setIconTintList.setNavigationIconTint();
        this.setY.setUnboundedRipple(this.setIconTintList, false);
        this.setIconTintList.setUnboundedRipple = null;
        this.setIconTintList.setImageTintMode = null;
        this.setIconTintList.setSelectedChildViewEnabled = null;
        this.setIconTintList.setFloatValues.setIconTintList((setCompatElevationResource<setTouchDelegate>) null);
        this.setIconTintList.setAnimationFromJson = false;
    }

    final void setOnLongClickListener() {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("movefrom CREATED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        boolean z = true;
        boolean z2 = this.setIconTintList.ExtendableSavedState$1 && !this.setIconTintList.setFilterRedundantCalls();
        if (z2 || this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList)) {
            setInlineLabel<?> setinlinelabel = this.setIconTintList.setOnNavigationItemSelectedListener;
            if (!(setinlinelabel instanceof setPictureListener)) {
                if (setinlinelabel.setY instanceof Activity) {
                    z = true ^ ((Activity) setinlinelabel.setY).isChangingConfigurations();
                }
            } else {
                z = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
            }
            if (z2 || z) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.setY(this.setIconTintList);
            }
            this.setIconTintList.setEmptyView();
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, false);
            for (setOverscrollHeader setoverscrollheader : this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0()) {
                if (setoverscrollheader != null) {
                    setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
                    if (this.setIconTintList.setShrinkMotionSpec.equals(setdropdownbackgroundresource.setChipIconEnabled)) {
                        setdropdownbackgroundresource.setViewTranslationCallback = this.setIconTintList;
                        setdropdownbackgroundresource.setChipIconEnabled = null;
                    }
                }
            }
            if (this.setIconTintList.setChipIconEnabled != null) {
                setDropDownBackgroundResource setdropdownbackgroundresource2 = this.setIconTintList;
                setOverscrollHeader setoverscrollheader2 = this.MenuHostHelper$$ExternalSyntheticLambda0.setX.get(setdropdownbackgroundresource2.setChipIconEnabled);
                setdropdownbackgroundresource2.setViewTranslationCallback = setoverscrollheader2 != null ? setoverscrollheader2.setIconTintList : null;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this);
            return;
        }
        if (this.setIconTintList.setChipIconEnabled != null) {
            setOverscrollHeader setoverscrollheader3 = this.MenuHostHelper$$ExternalSyntheticLambda0.setX.get(this.setIconTintList.setChipIconEnabled);
            setDropDownBackgroundResource setdropdownbackgroundresource3 = setoverscrollheader3 != null ? setoverscrollheader3.setIconTintList : null;
            if (setdropdownbackgroundresource3 != null && setdropdownbackgroundresource3.setHasDecor) {
                this.setIconTintList.setViewTranslationCallback = setdropdownbackgroundresource3;
            }
        }
        this.setIconTintList.setAdapter = 0;
    }

    final void setUnboundedRipple() {
        boolean isLoggable;
        boolean isLoggable2;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("movefrom ATTACHED: ");
            sb.append(this.setIconTintList);
            Log.d("FragmentManager", sb.toString());
        }
        this.setIconTintList.setLineBreakStyle();
        boolean z = false;
        this.setY.setY(this.setIconTintList, false);
        this.setIconTintList.setAdapter = -1;
        this.setIconTintList.setOnNavigationItemSelectedListener = null;
        this.setIconTintList.setMinAndMaxProgress = null;
        this.setIconTintList.ViewPager$SavedState$1 = null;
        if (this.setIconTintList.ExtendableSavedState$1 && !this.setIconTintList.setFilterRedundantCalls()) {
            z = true;
        }
        if (z || this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList)) {
            isLoggable2 = Log.isLoggable("FragmentManager", 3);
            if (isLoggable2) {
                StringBuilder sb2 = new StringBuilder("initState called for fragment: ");
                sb2.append(this.setIconTintList);
                Log.d("FragmentManager", sb2.toString());
            }
            this.setIconTintList.setTitleMarginEnd();
        }
    }
}