package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.CustomVersionedParcelable;
import o.setOnGroupCollapseListener;
import o.setPointerIcon;

/* loaded from: classes.dex */
public class CustomVersionedParcelable extends setOutlineAmbientShadowColor {
    private static final setTitleOptional<Throwable> setY = new setTitleOptional<Throwable>() { // from class: o.CustomVersionedParcelable.3
        @Override // o.setTitleOptional
        public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
            Throwable th2 = th;
            if (setOnPageChangeListener.setIconTintList(th2)) {
                setDrawingCacheEnabled.setIconTintList("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    };
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private String MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPointerIcon ViewPager$SavedState$1;
    private boolean setAnimationFromJson;
    private final setTitleOptional<setBoxStrokeErrorColor> setCenterIfNoTextEnabled;
    private boolean setChipCornerRadius;
    private Set<setUseMaterialThemeColors> setIconSize;
    private int setIconTintList;
    private int setLayoutAnimation;
    private setExpandedTitleGravity setMaxEms;
    private setImportantForContentCapture<setBoxStrokeErrorColor> setNavigationOnClickListener;
    private setBoxStrokeErrorColor setOnLongClickListener;
    private boolean setOnNavigationItemSelectedListener;
    private boolean setTextAlignment;
    private setTitleOptional<Throwable> setUiOptions;
    private boolean setUnboundedRipple;
    private int setX;
    private final setTitleOptional<Throwable> setZ;

    public CustomVersionedParcelable(Context context) {
        super(context);
        this.setCenterIfNoTextEnabled = new setTitleOptional<setBoxStrokeErrorColor>() { // from class: o.CustomVersionedParcelable.1
            @Override // o.setTitleOptional
            public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeErrorColor setboxstrokeerrorcolor) {
                CustomVersionedParcelable.this.setComposition(setboxstrokeerrorcolor);
            }
        };
        this.setZ = new setTitleOptional<Throwable>() { // from class: o.CustomVersionedParcelable.4
            @Override // o.setTitleOptional
            public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
                Throwable th2 = th;
                if (CustomVersionedParcelable.this.setLayoutAnimation != 0) {
                    CustomVersionedParcelable customVersionedParcelable = CustomVersionedParcelable.this;
                    customVersionedParcelable.setImageResource(customVersionedParcelable.setLayoutAnimation);
                }
                (CustomVersionedParcelable.this.setUiOptions == null ? CustomVersionedParcelable.setY : CustomVersionedParcelable.this.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda0(th2);
            }
        };
        this.setLayoutAnimation = 0;
        this.ViewPager$SavedState$1 = new setPointerIcon();
        this.setTextAlignment = false;
        this.setAnimationFromJson = false;
        this.setOnNavigationItemSelectedListener = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setUnboundedRipple = true;
        this.setMaxEms = setExpandedTitleGravity.AUTOMATIC;
        this.setIconSize = new HashSet();
        this.setX = 0;
        setIconTintList(null);
    }

    public CustomVersionedParcelable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setCenterIfNoTextEnabled = new setTitleOptional<setBoxStrokeErrorColor>() { // from class: o.CustomVersionedParcelable.1
            @Override // o.setTitleOptional
            public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeErrorColor setboxstrokeerrorcolor) {
                CustomVersionedParcelable.this.setComposition(setboxstrokeerrorcolor);
            }
        };
        this.setZ = new setTitleOptional<Throwable>() { // from class: o.CustomVersionedParcelable.4
            @Override // o.setTitleOptional
            public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
                Throwable th2 = th;
                if (CustomVersionedParcelable.this.setLayoutAnimation != 0) {
                    CustomVersionedParcelable customVersionedParcelable = CustomVersionedParcelable.this;
                    customVersionedParcelable.setImageResource(customVersionedParcelable.setLayoutAnimation);
                }
                (CustomVersionedParcelable.this.setUiOptions == null ? CustomVersionedParcelable.setY : CustomVersionedParcelable.this.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda0(th2);
            }
        };
        this.setLayoutAnimation = 0;
        this.ViewPager$SavedState$1 = new setPointerIcon();
        this.setTextAlignment = false;
        this.setAnimationFromJson = false;
        this.setOnNavigationItemSelectedListener = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setUnboundedRipple = true;
        this.setMaxEms = setExpandedTitleGravity.AUTOMATIC;
        this.setIconSize = new HashSet();
        this.setX = 0;
        setIconTintList(attributeSet);
    }

    public CustomVersionedParcelable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setCenterIfNoTextEnabled = new setTitleOptional<setBoxStrokeErrorColor>() { // from class: o.CustomVersionedParcelable.1
            @Override // o.setTitleOptional
            public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeErrorColor setboxstrokeerrorcolor) {
                CustomVersionedParcelable.this.setComposition(setboxstrokeerrorcolor);
            }
        };
        this.setZ = new setTitleOptional<Throwable>() { // from class: o.CustomVersionedParcelable.4
            @Override // o.setTitleOptional
            public final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
                Throwable th2 = th;
                if (CustomVersionedParcelable.this.setLayoutAnimation != 0) {
                    CustomVersionedParcelable customVersionedParcelable = CustomVersionedParcelable.this;
                    customVersionedParcelable.setImageResource(customVersionedParcelable.setLayoutAnimation);
                }
                (CustomVersionedParcelable.this.setUiOptions == null ? CustomVersionedParcelable.setY : CustomVersionedParcelable.this.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda0(th2);
            }
        };
        this.setLayoutAnimation = 0;
        this.ViewPager$SavedState$1 = new setPointerIcon();
        this.setTextAlignment = false;
        this.setAnimationFromJson = false;
        this.setOnNavigationItemSelectedListener = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setUnboundedRipple = true;
        this.setMaxEms = setExpandedTitleGravity.AUTOMATIC;
        this.setIconSize = new HashSet();
        this.setX = 0;
        setIconTintList(attributeSet);
    }

    private void setIconTintList(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
        if (!isInEditMode()) {
            this.setUnboundedRipple = obtainStyledAttributes.getBoolean(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setX, true);
            boolean hasValue = obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius);
            boolean hasValue2 = obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple);
            boolean hasValue3 = obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setAnimationFromJson);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setAnimationFromJson)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener, 0));
        }
        if (obtainStyledAttributes.getBoolean(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList, false)) {
            this.setOnNavigationItemSelectedListener = true;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
        if (obtainStyledAttributes.getBoolean(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener, false)) {
            this.ViewPager$SavedState$1.setIconTintList.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled)) {
            setRepeatMode(obtainStyledAttributes.getInt(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled, 1));
        }
        if (obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment)) {
            setRepeatCount(obtainStyledAttributes.getInt(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment, -1));
        }
        if (obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX)) {
            setSpeed(obtainStyledAttributes.getFloat(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setTextScaleX, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation));
        setProgress(obtainStyledAttributes.getFloat(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions, 0.0f));
        boolean z = obtainStyledAttributes.getBoolean(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setY, false);
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        if (setpointericon.MenuHostHelper$$ExternalSyntheticLambda0 != z) {
            setpointericon.MenuHostHelper$$ExternalSyntheticLambda0 = z;
            if (setpointericon.setY != null) {
                setpointericon.setY();
            }
        }
        if (obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1)) {
            int i = setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(new setSupportBackgroundTintList("**"), (setSupportBackgroundTintList) setItemViewCacheSize.setY, (setPrompt<setSupportBackgroundTintList>) new setPrompt(new setLineSpacing(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1)) {
            setPointerIcon setpointericon2 = this.ViewPager$SavedState$1;
            setpointericon2.setChipCornerRadius = obtainStyledAttributes.getFloat(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1, 1.0f);
            setpointericon2.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        if (obtainStyledAttributes.hasValue(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize)) {
            int i2 = obtainStyledAttributes.getInt(setTabsFromPagerAdapter$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize, setExpandedTitleGravity.AUTOMATIC.ordinal());
            if (i2 >= setExpandedTitleGravity.values().length) {
                i2 = setExpandedTitleGravity.AUTOMATIC.ordinal();
            }
            setRenderMode(setExpandedTitleGravity.values()[i2]);
        }
        if (getScaleType() != null) {
            this.ViewPager$SavedState$1.setOnNavigationItemSelectedListener = getScaleType();
        }
        obtainStyledAttributes.recycle();
        this.ViewPager$SavedState$1.setZ = Boolean.valueOf(setOnPageChangeListener.setY(getContext()) != 0.0f).booleanValue();
        MenuHostHelper$$ExternalSyntheticLambda0();
        this.setChipCornerRadius = true;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        if (drawable2 == setpointericon) {
            super.invalidateDrawable(setpointericon);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        setIconTintList seticontintlist = new setIconTintList(super.onSaveInstanceState());
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        seticontintlist.setY = this.setIconTintList;
        seticontintlist.setX = this.ViewPager$SavedState$1.setIconTintList.setIconTintList();
        dumpAsync dumpasync = this.ViewPager$SavedState$1.setIconTintList;
        boolean z = false;
        if ((dumpasync == null ? false : dumpasync.isRunning()) || (!setBaselineAlignBottom.setChipIconTintResource(this) && this.setOnNavigationItemSelectedListener)) {
            z = true;
        }
        seticontintlist.setIconTintList = z;
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = this.ViewPager$SavedState$1.setUiOptions;
        seticontintlist.setUiOptions = this.ViewPager$SavedState$1.setIconTintList.getRepeatMode();
        seticontintlist.setNavigationOnClickListener = this.ViewPager$SavedState$1.setIconTintList.getRepeatCount();
        return seticontintlist;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setIconTintList)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setIconTintList seticontintlist = (setIconTintList) parcelable;
        super.onRestoreInstanceState(seticontintlist.getSuperState());
        String str = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        int i = seticontintlist.setY;
        this.setIconTintList = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(seticontintlist.setX);
        if (seticontintlist.setIconTintList) {
            if (isShown()) {
                this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
                MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                this.setTextAlignment = true;
            }
        }
        this.ViewPager$SavedState$1.setUiOptions = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
        setRepeatMode(seticontintlist.setUiOptions);
        setRepeatCount(seticontintlist.setNavigationOnClickListener);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (this.setChipCornerRadius) {
            if (isShown()) {
                if (!this.setAnimationFromJson) {
                    if (this.setTextAlignment) {
                        if (isShown()) {
                            this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
                            MenuHostHelper$$ExternalSyntheticLambda0();
                        } else {
                            this.setTextAlignment = true;
                        }
                    }
                } else if (isShown()) {
                    this.ViewPager$SavedState$1.setX();
                    MenuHostHelper$$ExternalSyntheticLambda0();
                } else {
                    this.setTextAlignment = false;
                    this.setAnimationFromJson = true;
                }
                this.setAnimationFromJson = false;
                this.setTextAlignment = false;
                return;
            }
            dumpAsync dumpasync = this.ViewPager$SavedState$1.setIconTintList;
            if (dumpasync == null ? false : dumpasync.isRunning()) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
                this.setOnNavigationItemSelectedListener = false;
                this.setAnimationFromJson = false;
                this.setTextAlignment = false;
                setPointerIcon setpointericon = this.ViewPager$SavedState$1;
                setpointericon.setTextAlignment.clear();
                dumpAsync dumpasync2 = setpointericon.setIconTintList;
                Choreographer.getInstance().removeFrameCallback(dumpasync2);
                dumpasync2.setOnLongClickListener = false;
                MenuHostHelper$$ExternalSyntheticLambda0();
                this.setAnimationFromJson = true;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 || this.setOnNavigationItemSelectedListener) {
            if (isShown()) {
                this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1();
                MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                this.setTextAlignment = true;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            this.setOnNavigationItemSelectedListener = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void setCacheComposition(boolean z) {
        this.setUnboundedRipple = z;
    }

    public void setAnimation(int i) {
        setImportantForContentCapture<setBoxStrokeErrorColor> iconTintList;
        this.setIconTintList = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        if (!this.setUnboundedRipple) {
            iconTintList = setOnGroupCollapseListener.setIconTintList((String) null, new setOnGroupCollapseListener.AnonymousClass5(new WeakReference(r1), getContext().getApplicationContext(), i));
        } else {
            iconTintList = setOnGroupCollapseListener.setIconTintList(getContext(), i);
        }
        setX(iconTintList);
    }

    public void setAnimation(String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setIconTintList = 0;
        setX(this.setUnboundedRipple ? setOnGroupCollapseListener.setIconTintList(getContext(), str) : setOnGroupCollapseListener.setY(getContext(), str, (String) null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setX(setOnGroupCollapseListener.setY(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setImportantForContentCapture<setBoxStrokeErrorColor> iconTintList;
        if (!this.setUnboundedRipple) {
            iconTintList = setOnGroupCollapseListener.setIconTintList((String) null, new setOnGroupCollapseListener.AnonymousClass1(getContext(), str, null));
        } else {
            iconTintList = setOnGroupCollapseListener.setY(getContext(), str);
        }
        setX(iconTintList);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setImportantForContentCapture<setBoxStrokeErrorColor> iconTintList;
        iconTintList = setOnGroupCollapseListener.setIconTintList(str2, new setOnGroupCollapseListener.AnonymousClass1(getContext(), str, str2));
        setX(iconTintList);
    }

    public void setFailureListener(setTitleOptional<Throwable> settitleoptional) {
        this.setUiOptions = settitleoptional;
    }

    public void setFallbackResource(int i) {
        this.setLayoutAnimation = i;
    }

    public void setComposition(setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        this.ViewPager$SavedState$1.setCallback(this);
        this.setOnLongClickListener = setboxstrokeerrorcolor;
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        boolean z = true;
        if (setpointericon.setY == setboxstrokeerrorcolor) {
            z = false;
        } else {
            setpointericon.ViewPager$SavedState$1 = false;
            setpointericon.setIconTintList();
            setpointericon.setY = setboxstrokeerrorcolor;
            setpointericon.setY();
            dumpAsync dumpasync = setpointericon.setIconTintList;
            boolean z2 = dumpasync.MenuHostHelper$$ExternalSyntheticLambda1 == null;
            dumpasync.MenuHostHelper$$ExternalSyntheticLambda1 = setboxstrokeerrorcolor;
            if (z2) {
                dumpasync.setX((int) Math.max(dumpasync.setIconTintList, setboxstrokeerrorcolor.setChipCornerRadius), (int) Math.min(dumpasync.setY, setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1));
            } else {
                dumpasync.setX((int) setboxstrokeerrorcolor.setChipCornerRadius, (int) setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            float f = dumpasync.MenuHostHelper$$ExternalSyntheticLambda0;
            dumpasync.MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
            dumpasync.setIconTintList((int) f);
            dumpasync.setX();
            setpointericon.MenuHostHelper$$ExternalSyntheticLambda0(setpointericon.setIconTintList.getAnimatedFraction());
            setpointericon.setChipCornerRadius = setpointericon.setChipCornerRadius;
            setpointericon.MenuHostHelper$$ExternalSyntheticLambda0();
            setpointericon.MenuHostHelper$$ExternalSyntheticLambda0();
            Iterator it = new ArrayList(setpointericon.setTextAlignment).iterator();
            while (it.hasNext()) {
                ((setPointerIcon.setIconTintList) it.next()).setY();
                it.remove();
            }
            setpointericon.setTextAlignment.clear();
            setboxstrokeerrorcolor.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0 = setpointericon.setCenterIfNoTextEnabled;
            Drawable.Callback callback = setpointericon.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(setpointericon);
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda0();
        if (getDrawable() != this.ViewPager$SavedState$1 || z) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (setUseMaterialThemeColors setusematerialthemecolors : this.setIconSize) {
            }
        }
    }

    public void setMinFrame(int i) {
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    public void setMinProgress(float f) {
        this.ViewPager$SavedState$1.setIconTintList(f);
    }

    public void setMaxFrame(int i) {
        this.ViewPager$SavedState$1.setX(i);
    }

    public void setMaxProgress(float f) {
        this.ViewPager$SavedState$1.setY(f);
    }

    public void setMinFrame(String str) {
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(str);
    }

    public void setMaxFrame(String str) {
        this.ViewPager$SavedState$1.setY(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.ViewPager$SavedState$1.setIconTintList(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(str, str2, z);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.ViewPager$SavedState$1.setX(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(f, f2);
    }

    public void setSpeed(float f) {
        this.ViewPager$SavedState$1.setIconTintList.setUiOptions = f;
    }

    public void setRepeatMode(int i) {
        this.ViewPager$SavedState$1.setIconTintList.setRepeatMode(i);
    }

    public void setRepeatCount(int i) {
        this.ViewPager$SavedState$1.setIconTintList.setRepeatCount(i);
    }

    public void setImageAssetsFolder(String str) {
        this.ViewPager$SavedState$1.setUiOptions = str;
    }

    public void setImageAssetDelegate(BadgeState$State$1 badgeState$State$1) {
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        setpointericon.setLayoutAnimation = badgeState$State$1;
        setLogoDescription setlogodescription = setpointericon.setNavigationOnClickListener;
        if (setlogodescription != null) {
            setlogodescription.setIconTintList = badgeState$State$1;
        }
    }

    public void setFontAssetDelegate(setInputMethodMode setinputmethodmode) {
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        setpointericon.MenuHostHelper$$ExternalSyntheticLambda1 = setinputmethodmode;
        setBreakStrategy setbreakstrategy = setpointericon.setOnLongClickListener;
        if (setbreakstrategy != null) {
            setbreakstrategy.MenuHostHelper$$ExternalSyntheticLambda1 = setinputmethodmode;
        }
    }

    public void setTextDelegate(setCameraDistance setcameradistance) {
        this.ViewPager$SavedState$1.setMaxEms = setcameradistance;
    }

    public void setScale(float f) {
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        setpointericon.setChipCornerRadius = f;
        setpointericon.MenuHostHelper$$ExternalSyntheticLambda0();
        if (getDrawable() == this.ViewPager$SavedState$1) {
            setImageDrawable(null);
            setImageDrawable(this.ViewPager$SavedState$1);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        if (setpointericon != null) {
            setpointericon.setOnNavigationItemSelectedListener = scaleType;
        }
    }

    public void setFrame(int i) {
        this.ViewPager$SavedState$1.setIconTintList(i);
    }

    public void setProgress(float f) {
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        setPointerIcon setpointericon = this.ViewPager$SavedState$1;
        setpointericon.setCenterIfNoTextEnabled = z;
        setBoxStrokeErrorColor setboxstrokeerrorcolor = setpointericon.setY;
        if (setboxstrokeerrorcolor != null) {
            setboxstrokeerrorcolor.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        }
    }

    public void setSafeMode(boolean z) {
        this.ViewPager$SavedState$1.setIconSize = z;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        this.setX++;
        super.buildDrawingCache(z);
        if (this.setX == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(setExpandedTitleGravity.HARDWARE);
        }
        this.setX--;
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
    }

    public void setRenderMode(setExpandedTitleGravity setexpandedtitlegravity) {
        this.setMaxEms = setexpandedtitlegravity;
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.ViewPager$SavedState$1.setUnboundedRipple = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.CustomVersionedParcelable$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            int[] iArr = new int[setExpandedTitleGravity.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[setExpandedTitleGravity.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setExpandedTitleGravity.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setExpandedTitleGravity.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        /*
            r5 = this;
            int[] r0 = o.CustomVersionedParcelable.AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0
            o.setExpandedTitleGravity r1 = r5.setMaxEms
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L2f
            if (r0 == r2) goto L30
            r3 = 3
            if (r0 == r3) goto L14
            goto L30
        L14:
            o.setBoxStrokeErrorColor r0 = r5.setOnLongClickListener
            r3 = 0
            if (r0 == 0) goto L23
            boolean r0 = r0.setLayoutAnimation
            if (r0 == 0) goto L23
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 < r4) goto L2d
        L23:
            o.setBoxStrokeErrorColor r0 = r5.setOnLongClickListener
            if (r0 == 0) goto L2c
            int r0 = r0.ViewPager$SavedState$1
            r4 = 4
            if (r0 > r4) goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L30
        L2f:
            r1 = 2
        L30:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L3a
            r0 = 0
            r5.setLayerType(r1, r0)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CustomVersionedParcelable.MenuHostHelper$$ExternalSyntheticLambda0():void");
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends View.BaseSavedState {
        public static final Parcelable.Creator<setIconTintList> CREATOR = new Parcelable.Creator<setIconTintList>() { // from class: com.airbnb.lottie.LottieAnimationView$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ CustomVersionedParcelable.setIconTintList createFromParcel(Parcel parcel) {
                return new CustomVersionedParcelable.setIconTintList(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CustomVersionedParcelable.setIconTintList[] newArray(int i) {
                return new CustomVersionedParcelable.setIconTintList[i];
            }
        };
        String MenuHostHelper$$ExternalSyntheticLambda0;
        String MenuHostHelper$$ExternalSyntheticLambda1;
        boolean setIconTintList;
        int setNavigationOnClickListener;
        int setUiOptions;
        float setX;
        int setY;

        public /* synthetic */ setIconTintList(Parcel parcel, byte b) {
            this(parcel);
        }

        setIconTintList(Parcelable parcelable) {
            super(parcelable);
        }

        private setIconTintList(Parcel parcel) {
            super(parcel);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readString();
            this.setX = parcel.readFloat();
            this.setIconTintList = parcel.readInt() == 1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readString();
            this.setUiOptions = parcel.readInt();
            this.setNavigationOnClickListener = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.MenuHostHelper$$ExternalSyntheticLambda0);
            parcel.writeFloat(this.setX);
            parcel.writeInt(this.setIconTintList ? 1 : 0);
            parcel.writeString(this.MenuHostHelper$$ExternalSyntheticLambda1);
            parcel.writeInt(this.setUiOptions);
            parcel.writeInt(this.setNavigationOnClickListener);
        }
    }

    private void setX(setImportantForContentCapture<setBoxStrokeErrorColor> setimportantforcontentcapture) {
        this.setOnLongClickListener = null;
        this.ViewPager$SavedState$1.setIconTintList();
        setImportantForContentCapture<setBoxStrokeErrorColor> setimportantforcontentcapture2 = this.setNavigationOnClickListener;
        if (setimportantforcontentcapture2 != null) {
            setimportantforcontentcapture2.MenuHostHelper$$ExternalSyntheticLambda1(this.setCenterIfNoTextEnabled);
            this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(this.setZ);
        }
        this.setNavigationOnClickListener = setimportantforcontentcapture.setY(this.setCenterIfNoTextEnabled).setIconTintList(this.setZ);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        dumpAsync dumpasync = this.ViewPager$SavedState$1.setIconTintList;
        if (dumpasync == null ? false : dumpasync.isRunning()) {
            this.setOnNavigationItemSelectedListener = false;
            this.setAnimationFromJson = false;
            this.setTextAlignment = false;
            setPointerIcon setpointericon = this.ViewPager$SavedState$1;
            setpointericon.setTextAlignment.clear();
            setpointericon.setIconTintList.cancel();
            MenuHostHelper$$ExternalSyntheticLambda0();
            this.setOnNavigationItemSelectedListener = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // o.setOutlineAmbientShadowColor, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImportantForContentCapture<setBoxStrokeErrorColor> setimportantforcontentcapture = this.setNavigationOnClickListener;
        if (setimportantforcontentcapture != null) {
            setimportantforcontentcapture.MenuHostHelper$$ExternalSyntheticLambda1(this.setCenterIfNoTextEnabled);
            this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(this.setZ);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // o.setOutlineAmbientShadowColor, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImportantForContentCapture<setBoxStrokeErrorColor> setimportantforcontentcapture = this.setNavigationOnClickListener;
        if (setimportantforcontentcapture != null) {
            setimportantforcontentcapture.MenuHostHelper$$ExternalSyntheticLambda1(this.setCenterIfNoTextEnabled);
            this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(this.setZ);
        }
        super.setImageDrawable(drawable);
    }

    @Override // o.setOutlineAmbientShadowColor, android.widget.ImageView
    public void setImageResource(int i) {
        setImportantForContentCapture<setBoxStrokeErrorColor> setimportantforcontentcapture = this.setNavigationOnClickListener;
        if (setimportantforcontentcapture != null) {
            setimportantforcontentcapture.MenuHostHelper$$ExternalSyntheticLambda1(this.setCenterIfNoTextEnabled);
            this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(this.setZ);
        }
        super.setImageResource(i);
    }
}