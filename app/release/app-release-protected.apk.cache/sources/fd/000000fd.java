package com.rmldemo.guardsquare.ui.activity;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.rmldemo.guardsquare.ui.activity.MainActivity;
import com.rmldemo.guardsquare.ui.fregment.bookmark.BookmarkFragment;
import com.rmldemo.guardsquare.ui.fregment.category.CategoryFragment;
import com.rmldemo.guardsquare.ui.fregment.home.HomeFragment;
import com.rmldemo.guardsquare.ui.fregment.profile.ProfileFragment;
import java.util.Locale;
import o.ExpandableTransformationBehavior;
import o.R;
import o.SubMenuC0247m;
import o.aC;
import o.setBaselineAlignedChildIndex;
import o.setBoxStrokeWidth;
import o.setCheckedState;
import o.setCompletionHint;
import o.setDividerDrawableVertical;
import o.setEndIconCheckable;
import o.setImageTintList;
import o.setLeftTopRightBottom;
import o.setMapTrackballToArrowKeys;
import o.setMinFrame;
import o.setProgressTintList;
import o.setTextEndPadding;
import o.setTranslationX;

/* loaded from: classes.dex */
public final class MainActivity extends setEndIconCheckable implements setTextEndPadding, ExpandableTransformationBehavior {
    public setMapTrackballToArrowKeys setLayoutAnimation;
    private SharedPreferences setUnboundedRipple;

    @Override // o.ExpandableTransformationBehavior
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Animator animator) {
        aC.MenuHostHelper$$ExternalSyntheticLambda0(animator, "");
    }

    @Override // o.ExpandableTransformationBehavior
    public final void setX(Animator animator) {
        aC.MenuHostHelper$$ExternalSyntheticLambda0(animator, "");
    }

    @Override // o.ExpandableTransformationBehavior
    public final void setY(Animator animator) {
        aC.MenuHostHelper$$ExternalSyntheticLambda0(animator, "");
    }

    @Override // o.setEndIconCheckable
    public final setBoxStrokeWidth setOnNavigationItemSelectedListener() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("shared", 0);
        aC.setIconTintList(sharedPreferences, "");
        aC.MenuHostHelper$$ExternalSyntheticLambda0(sharedPreferences, "");
        this.setUnboundedRipple = sharedPreferences;
        if (sharedPreferences == null) {
            aC.setIconTintList("");
            sharedPreferences = null;
        }
        if (aC.MenuHostHelper$$ExternalSyntheticLambda1((Object) sharedPreferences.getString("mode", ""), (Object) "night")) {
            return new setLeftTopRightBottom();
        }
        return new setMinFrame();
    }

    @Override // o.setHasDecor, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        setTranslationX settranslationx = setTranslationX.setX;
        aC.setIconTintList(context);
        aC.MenuHostHelper$$ExternalSyntheticLambda0(context, "");
        String language = Locale.getDefault().getLanguage();
        aC.setIconTintList((Object) language, "");
        setTranslationX.setX(context, setTranslationX.setIconTintList(context, language));
        super.attachBaseContext(context);
    }

    @Override // o.setEndIconCheckable, o.setIconEndPadding, o.setX, o.setHelperTextColor, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCompletionHint setcompletionhint = setCompletionHint.setX;
        setCompletionHint.MenuHostHelper$$ExternalSyntheticLambda0();
        setMapTrackballToArrowKeys setmaptrackballtoarrowkeys = null;
        View inflate = getLayoutInflater().inflate(R.layout.res_0x7f0d001c, (ViewGroup) null, false);
        int i = R.id.res_0x7f0a0065;
        setDividerDrawableVertical setdividerdrawablevertical = (setDividerDrawableVertical) setCheckedState.setY(inflate, R.id.res_0x7f0a0065);
        if (setdividerdrawablevertical != null) {
            FrameLayout frameLayout = (FrameLayout) setCheckedState.setY(inflate, R.id.res_0x7f0a00d5);
            if (frameLayout != null) {
                View y = setCheckedState.setY(inflate, R.id.res_0x7f0a0211);
                if (y != null) {
                    setMapTrackballToArrowKeys setmaptrackballtoarrowkeys2 = new setMapTrackballToArrowKeys((setBaselineAlignedChildIndex) inflate, setdividerdrawablevertical, frameLayout, y);
                    aC.setIconTintList(setmaptrackballtoarrowkeys2, "");
                    this.setLayoutAnimation = setmaptrackballtoarrowkeys2;
                    setContentView(setmaptrackballtoarrowkeys2.setX);
                    setX((ExpandableTransformationBehavior) this);
                    setProgressTintList setprogresstintlist = new setProgressTintList(ViewPager$SavedState$1());
                    setprogresstintlist.MenuHostHelper$$ExternalSyntheticLambda0(R.id.res_0x7f0a00d5, new HomeFragment(), null, 2);
                    setprogresstintlist.setY();
                    setMapTrackballToArrowKeys setmaptrackballtoarrowkeys3 = this.setLayoutAnimation;
                    if (setmaptrackballtoarrowkeys3 == null) {
                        aC.setIconTintList("");
                    } else {
                        setmaptrackballtoarrowkeys = setmaptrackballtoarrowkeys3;
                    }
                    setmaptrackballtoarrowkeys.setIconTintList.setOnItemSelectedListener(new SubMenuC0247m.AnonymousClass6.setY() { // from class: o.setAppSearchData
                        @Override // o.SubMenuC0247m.AnonymousClass6.setY
                        public final boolean setX(MenuItem menuItem) {
                            return MainActivity.MenuHostHelper$$ExternalSyntheticLambda1(MainActivity.this, menuItem);
                        }
                    });
                    return;
                }
                i = R.id.res_0x7f0a0211;
            } else {
                i = R.id.res_0x7f0a00d5;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // o.setEndIconCheckable
    public final void setIconTintList(setBoxStrokeWidth setboxstrokewidth) {
        aC.MenuHostHelper$$ExternalSyntheticLambda0(setboxstrokewidth, "");
        setImageTintList setimagetintlist = (setImageTintList) setboxstrokewidth;
        setMapTrackballToArrowKeys setmaptrackballtoarrowkeys = this.setLayoutAnimation;
        if (setmaptrackballtoarrowkeys == null) {
            aC.setIconTintList("");
            setmaptrackballtoarrowkeys = null;
        }
        setmaptrackballtoarrowkeys.setIconTintList.setBackgroundColor(setimagetintlist.setY(this));
    }

    @Override // o.setTextEndPadding
    public final void setLayoutDirection() {
        setMapTrackballToArrowKeys setmaptrackballtoarrowkeys = this.setLayoutAnimation;
        if (setmaptrackballtoarrowkeys == null) {
            aC.setIconTintList("");
            setmaptrackballtoarrowkeys = null;
        }
        setmaptrackballtoarrowkeys.setIconTintList.setVisibility(8);
    }

    @Override // o.setTextEndPadding
    public final void setTextAppearanceResource() {
        setMapTrackballToArrowKeys setmaptrackballtoarrowkeys = this.setLayoutAnimation;
        if (setmaptrackballtoarrowkeys == null) {
            aC.setIconTintList("");
            setmaptrackballtoarrowkeys = null;
        }
        setmaptrackballtoarrowkeys.setIconTintList.setVisibility(0);
    }

    @Override // o.setTextEndPadding
    public final void setGuidelinePercent() {
        onBackPressed();
    }

    @Override // o.setTextEndPadding
    public final void setTextScaleX() {
        recreate();
    }

    @Override // o.ExpandableTransformationBehavior
    public final void setIconTintList(Animator animator) {
        aC.MenuHostHelper$$ExternalSyntheticLambda0(animator, "");
        setMapTrackballToArrowKeys setmaptrackballtoarrowkeys = this.setLayoutAnimation;
        if (setmaptrackballtoarrowkeys == null) {
            aC.setIconTintList("");
            setmaptrackballtoarrowkeys = null;
        }
        setmaptrackballtoarrowkeys.setY.setVisibility(8);
    }

    public static /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda1(MainActivity mainActivity, MenuItem menuItem) {
        BookmarkFragment bookmarkFragment;
        aC.MenuHostHelper$$ExternalSyntheticLambda0(mainActivity, "");
        aC.MenuHostHelper$$ExternalSyntheticLambda0(menuItem, "");
        switch (menuItem.getItemId()) {
            case R.id.res_0x7f0a0063 /* 2131361891 */:
                bookmarkFragment = new BookmarkFragment();
                break;
            case R.id.res_0x7f0a0070 /* 2131361904 */:
                bookmarkFragment = new CategoryFragment();
                break;
            case R.id.res_0x7f0a00e8 /* 2131362024 */:
                bookmarkFragment = new HomeFragment();
                break;
            case R.id.res_0x7f0a0175 /* 2131362165 */:
                bookmarkFragment = new ProfileFragment();
                break;
            default:
                bookmarkFragment = new HomeFragment();
                break;
        }
        setProgressTintList setprogresstintlist = new setProgressTintList(mainActivity.ViewPager$SavedState$1());
        setprogresstintlist.MenuHostHelper$$ExternalSyntheticLambda0(R.id.res_0x7f0a00d5, bookmarkFragment, null, 2);
        setprogresstintlist.setY();
        return true;
    }
}