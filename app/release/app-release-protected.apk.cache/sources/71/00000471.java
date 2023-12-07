package o;

import android.os.Bundle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class finalize {
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;
    int ViewPager$SavedState$1;
    public boolean setAnimationFromJson;
    ArrayList<setX> setCenterIfNoTextEnabled;
    int setChipCornerRadius;
    int setIconSize;
    private final ClassLoader setIconTintList;
    int setLayoutAnimation;
    int setMaxEms;
    int setNavigationOnClickListener;
    CharSequence setOnLongClickListener;
    ArrayList<String> setOnNavigationItemSelectedListener;
    public String setTextAlignment;
    ArrayList<String> setTextScaleX;
    ArrayList<Runnable> setUiOptions;
    CharSequence setUnboundedRipple;
    public boolean setX;
    private final setForegroundTintMode setY;
    int setZ;

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract int setIconTintList();

    public abstract int setX();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation;
        int setOnLongClickListener;
        int setUiOptions;
        setDropDownBackgroundResource setX;
        int setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(int i, setDropDownBackgroundResource setdropdownbackgroundresource) {
            this.setY = i;
            this.setX = setdropdownbackgroundresource;
            this.setLayoutAnimation = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.RESUMED;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.RESUMED;
        }

        setX(setDropDownBackgroundResource setdropdownbackgroundresource, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
            this.setY = 10;
            this.setX = setdropdownbackgroundresource;
            this.setLayoutAnimation = setdropdownbackgroundresource.setGuidelinePercent;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = registerin_menuhosthelper__externalsyntheticlambda1;
        }
    }

    @Deprecated
    public finalize() {
        this.setCenterIfNoTextEnabled = new ArrayList<>();
        this.setX = true;
        this.setAnimationFromJson = false;
        this.setY = null;
        this.setIconTintList = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public finalize(setForegroundTintMode setforegroundtintmode, ClassLoader classLoader) {
        this.setCenterIfNoTextEnabled = new ArrayList<>();
        this.setX = true;
        this.setAnimationFromJson = false;
        this.setY = setforegroundtintmode;
        this.setIconTintList = classLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setX setx) {
        this.setCenterIfNoTextEnabled.add(setx);
        setx.setIconTintList = this.setChipCornerRadius;
        setx.MenuHostHelper$$ExternalSyntheticLambda0 = this.ViewPager$SavedState$1;
        setx.setOnLongClickListener = this.setIconSize;
        setx.setUiOptions = this.setZ;
    }

    public void setIconTintList(int i, setDropDownBackgroundResource setdropdownbackgroundresource, String str, int i2) {
        Class<?> cls = setdropdownbackgroundresource.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            if (setdropdownbackgroundresource.setObjectValues != null && !str.equals(setdropdownbackgroundresource.setObjectValues)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(setdropdownbackgroundresource);
                sb2.append(": was ");
                sb2.append(setdropdownbackgroundresource.setObjectValues);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            setdropdownbackgroundresource.setObjectValues = str;
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(setdropdownbackgroundresource);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (setdropdownbackgroundresource.setCenterIfNoTextEnabled != 0 && setdropdownbackgroundresource.setCenterIfNoTextEnabled != i) {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(setdropdownbackgroundresource);
                sb4.append(": was ");
                sb4.append(setdropdownbackgroundresource.setCenterIfNoTextEnabled);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            } else {
                setdropdownbackgroundresource.setCenterIfNoTextEnabled = i;
                setdropdownbackgroundresource.setLayoutAnimation = i;
            }
        }
        setX(new setX(i2, setdropdownbackgroundresource));
    }

    public finalize MenuHostHelper$$ExternalSyntheticLambda1(setDropDownBackgroundResource setdropdownbackgroundresource) {
        setX(new setX(3, setdropdownbackgroundresource));
        return this;
    }

    public finalize setX(setDropDownBackgroundResource setdropdownbackgroundresource, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        setX(new setX(setdropdownbackgroundresource, registerin_menuhosthelper__externalsyntheticlambda1));
        return this;
    }

    public final finalize setX(Class<? extends setDropDownBackgroundResource> cls, Bundle bundle) {
        setForegroundTintMode setforegroundtintmode = this.setY;
        if (setforegroundtintmode == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.setIconTintList;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1 = setforegroundtintmode.MenuHostHelper$$ExternalSyntheticLambda1(classLoader, cls.getName());
        if (bundle != null) {
            MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1(bundle);
        }
        setIconTintList(R.id.res_0x7f0a00d5, MenuHostHelper$$ExternalSyntheticLambda1, null, 2);
        return this;
    }
}