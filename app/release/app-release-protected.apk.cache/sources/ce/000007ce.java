package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.setLogo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class onActivityCreated implements LayoutInflater.Factory2 {
    final ParcelImpl MenuHostHelper$$ExternalSyntheticLambda0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onActivityCreated(ParcelImpl parcelImpl) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcelImpl;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        final setOverscrollHeader x;
        boolean isLoggable;
        setForegroundTintMode setforegroundtintmode;
        boolean isLoggable2;
        if (androidx.fragment.app.FragmentContainerView.class.getName().equals(str)) {
            return new androidx.fragment.app.FragmentContainerView(context, attributeSet, this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setLogo.setY.setIconTintList);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(setLogo.setY.setNavigationOnClickListener);
            }
            int resourceId = obtainStyledAttributes.getResourceId(setLogo.setY.MenuHostHelper$$ExternalSyntheticLambda0, -1);
            String string = obtainStyledAttributes.getString(setLogo.setY.setUnboundedRipple);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !setForegroundTintMode.setY(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(attributeSet.getPositionDescription());
                sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                sb.append(attributeValue);
                throw new IllegalArgumentException(sb.toString());
            }
            setDropDownBackgroundResource findFragmentById = resourceId != -1 ? this.MenuHostHelper$$ExternalSyntheticLambda0.findFragmentById(resourceId) : null;
            if (findFragmentById == null && string != null) {
                findFragmentById = this.MenuHostHelper$$ExternalSyntheticLambda0.findFragmentByTag(string);
            }
            if (findFragmentById == null && id != -1) {
                findFragmentById = this.MenuHostHelper$$ExternalSyntheticLambda0.findFragmentById(id);
            }
            if (findFragmentById == null) {
                ParcelImpl parcelImpl = this.MenuHostHelper$$ExternalSyntheticLambda0;
                setForegroundTintMode setforegroundtintmode2 = parcelImpl.setUnboundedRipple;
                setDropDownBackgroundResource setdropdownbackgroundresource = parcelImpl.setGuidelinePercent;
                if (setdropdownbackgroundresource != null) {
                    ParcelImpl parcelImpl2 = setdropdownbackgroundresource.ViewPager$SavedState$1;
                    while (true) {
                        setForegroundTintMode setforegroundtintmode3 = parcelImpl2.setUnboundedRipple;
                        setDropDownBackgroundResource setdropdownbackgroundresource2 = parcelImpl2.setGuidelinePercent;
                        if (setdropdownbackgroundresource2 == null) {
                            break;
                        }
                        parcelImpl2 = setdropdownbackgroundresource2.ViewPager$SavedState$1;
                    }
                    setforegroundtintmode = parcelImpl2.setTextAlignment;
                } else {
                    setforegroundtintmode = parcelImpl.setTextAlignment;
                }
                findFragmentById = setforegroundtintmode.MenuHostHelper$$ExternalSyntheticLambda1(context.getClassLoader(), attributeValue);
                findFragmentById.setChipCornerRadius = true;
                findFragmentById.setCenterIfNoTextEnabled = resourceId != 0 ? resourceId : id;
                findFragmentById.setLayoutAnimation = id;
                findFragmentById.setObjectValues = string;
                findFragmentById.setAnimationFromJson = true;
                findFragmentById.ViewPager$SavedState$1 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                findFragmentById.setOnNavigationItemSelectedListener = this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled;
                findFragmentById.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY, attributeSet, findFragmentById.FragmentStateAdapter$2);
                x = this.MenuHostHelper$$ExternalSyntheticLambda0.setY(findFragmentById);
                isLoggable2 = Log.isLoggable("FragmentManager", 2);
                if (isLoggable2) {
                    StringBuilder sb2 = new StringBuilder("Fragment ");
                    sb2.append(findFragmentById);
                    sb2.append(" has been inflated via the <fragment> tag: id=0x");
                    sb2.append(Integer.toHexString(resourceId));
                    Log.v("FragmentManager", sb2.toString());
                }
            } else if (findFragmentById.setAnimationFromJson) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Duplicate id 0x");
                sb3.append(Integer.toHexString(resourceId));
                sb3.append(", tag ");
                sb3.append(string);
                sb3.append(", or parent id 0x");
                sb3.append(Integer.toHexString(id));
                sb3.append(" with another fragment for ");
                sb3.append(attributeValue);
                throw new IllegalArgumentException(sb3.toString());
            } else {
                findFragmentById.setAnimationFromJson = true;
                findFragmentById.ViewPager$SavedState$1 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                findFragmentById.setOnNavigationItemSelectedListener = this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled;
                findFragmentById.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY, attributeSet, findFragmentById.FragmentStateAdapter$2);
                x = this.MenuHostHelper$$ExternalSyntheticLambda0.setX(findFragmentById);
                isLoggable = Log.isLoggable("FragmentManager", 2);
                if (isLoggable) {
                    StringBuilder sb4 = new StringBuilder("Retained Fragment ");
                    sb4.append(findFragmentById);
                    sb4.append(" has been re-attached via the <fragment> tag: id=0x");
                    sb4.append(Integer.toHexString(resourceId));
                    Log.v("FragmentManager", sb4.toString());
                }
            }
            findFragmentById.setUnboundedRipple = (ViewGroup) view;
            x.setNavigationOnClickListener();
            x.setLayoutAnimation();
            if (findFragmentById.setImageTintMode == null) {
                StringBuilder sb5 = new StringBuilder("Fragment ");
                sb5.append(attributeValue);
                sb5.append(" did not create a view.");
                throw new IllegalStateException(sb5.toString());
            }
            if (resourceId != 0) {
                findFragmentById.setImageTintMode.setId(resourceId);
            }
            if (findFragmentById.setImageTintMode.getTag() == null) {
                findFragmentById.setImageTintMode.setTag(string);
            }
            findFragmentById.setImageTintMode.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.onActivityCreated.3
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    EmojiCompatInitializer emojiCompatInitializer;
                    setDropDownBackgroundResource setdropdownbackgroundresource3 = x.setIconTintList;
                    x.setNavigationOnClickListener();
                    ViewGroup viewGroup = (ViewGroup) setdropdownbackgroundresource3.setImageTintMode.getParent();
                    ParcelImpl parcelImpl3 = onActivityCreated.this.MenuHostHelper$$ExternalSyntheticLambda0;
                    EmojiCompatInitializer emojiCompatInitializer2 = parcelImpl3.setLayoutDirection;
                    setDropDownBackgroundResource setdropdownbackgroundresource4 = parcelImpl3.setGuidelinePercent;
                    if (setdropdownbackgroundresource4 != null) {
                        ParcelImpl parcelImpl4 = setdropdownbackgroundresource4.ViewPager$SavedState$1;
                        while (true) {
                            EmojiCompatInitializer emojiCompatInitializer3 = parcelImpl4.setLayoutDirection;
                            setDropDownBackgroundResource setdropdownbackgroundresource5 = parcelImpl4.setGuidelinePercent;
                            if (setdropdownbackgroundresource5 == null) {
                                break;
                            }
                            parcelImpl4 = setdropdownbackgroundresource5.ViewPager$SavedState$1;
                        }
                        emojiCompatInitializer = parcelImpl4.setLayoutAnimation;
                    } else {
                        emojiCompatInitializer = parcelImpl3.setLayoutAnimation;
                    }
                    setEdgeEffectColor.setY(viewGroup, emojiCompatInitializer).setY();
                }
            });
            return findFragmentById.setImageTintMode;
        }
        return null;
    }
}