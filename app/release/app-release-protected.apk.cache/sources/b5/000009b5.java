package o;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class setBoxStrokeWidthResource implements Comparable<setBoxStrokeWidthResource> {
    static int setX = 1;
    public float setIconTintList;
    setIconTintList setLayoutAnimation;
    private String setMaxEms;
    public boolean setOnLongClickListener;
    public int setY = -1;
    int MenuHostHelper$$ExternalSyntheticLambda1 = -1;
    public int setNavigationOnClickListener = 0;
    public boolean setUnboundedRipple = false;
    float[] setChipCornerRadius = new float[9];
    float[] MenuHostHelper$$ExternalSyntheticLambda0 = new float[9];
    private setShortcut[] ViewPager$SavedState$1 = new setShortcut[16];
    private int setCenterIfNoTextEnabled = 0;
    public int setTextAlignment = 0;
    boolean setUiOptions = false;
    private int setZ = -1;
    private float setOnNavigationItemSelectedListener = 0.0f;
    private HashSet<setShortcut> setIconSize = null;

    /* loaded from: classes.dex */
    public enum setIconTintList {
        UNRESTRICTED,
        /* JADX INFO: Fake field, exist only in values array */
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(setBoxStrokeWidthResource setboxstrokewidthresource) {
        return this.setY - setboxstrokewidthresource.setY;
    }

    public setBoxStrokeWidthResource(setIconTintList seticontintlist) {
        this.setLayoutAnimation = seticontintlist;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(setShortcut setshortcut) {
        int i = 0;
        while (true) {
            int i2 = this.setCenterIfNoTextEnabled;
            if (i < i2) {
                if (this.ViewPager$SavedState$1[i] == setshortcut) {
                    return;
                }
                i++;
            } else {
                setShortcut[] setshortcutArr = this.ViewPager$SavedState$1;
                if (i2 >= setshortcutArr.length) {
                    this.ViewPager$SavedState$1 = (setShortcut[]) Arrays.copyOf(setshortcutArr, setshortcutArr.length << 1);
                }
                setShortcut[] setshortcutArr2 = this.ViewPager$SavedState$1;
                int i3 = this.setCenterIfNoTextEnabled;
                setshortcutArr2[i3] = setshortcut;
                this.setCenterIfNoTextEnabled = i3 + 1;
                return;
            }
        }
    }

    public final void setIconTintList(setShortcut setshortcut) {
        int i = this.setCenterIfNoTextEnabled;
        int i2 = 0;
        while (i2 < i) {
            if (this.ViewPager$SavedState$1[i2] == setshortcut) {
                while (i2 < i - 1) {
                    setShortcut[] setshortcutArr = this.ViewPager$SavedState$1;
                    int i3 = i2 + 1;
                    setshortcutArr[i2] = setshortcutArr[i3];
                    i2 = i3;
                }
                this.setCenterIfNoTextEnabled--;
                return;
            }
            i2++;
        }
    }

    public final void setX(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, setShortcut setshortcut) {
        int i = this.setCenterIfNoTextEnabled;
        for (int i2 = 0; i2 < i; i2++) {
            this.ViewPager$SavedState$1[i2].MenuHostHelper$$ExternalSyntheticLambda1(setwebcontentsdebuggingenabled, setshortcut, false);
        }
        this.setCenterIfNoTextEnabled = 0;
    }

    public final void setIconTintList(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, float f) {
        this.setIconTintList = f;
        this.setUnboundedRipple = true;
        this.setUiOptions = false;
        this.setZ = -1;
        this.setOnNavigationItemSelectedListener = 0.0f;
        int i = this.setCenterIfNoTextEnabled;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.ViewPager$SavedState$1[i2].MenuHostHelper$$ExternalSyntheticLambda0(setwebcontentsdebuggingenabled, this, false);
        }
        this.setCenterIfNoTextEnabled = 0;
    }

    public final void setX() {
        this.setMaxEms = null;
        this.setLayoutAnimation = setIconTintList.UNKNOWN;
        this.setNavigationOnClickListener = 0;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setIconTintList = 0.0f;
        this.setUnboundedRipple = false;
        this.setUiOptions = false;
        this.setZ = -1;
        this.setOnNavigationItemSelectedListener = 0.0f;
        int i = this.setCenterIfNoTextEnabled;
        for (int i2 = 0; i2 < i; i2++) {
            this.ViewPager$SavedState$1[i2] = null;
        }
        this.setCenterIfNoTextEnabled = 0;
        this.setTextAlignment = 0;
        this.setOnLongClickListener = false;
        Arrays.fill(this.MenuHostHelper$$ExternalSyntheticLambda0, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.setY);
        return sb.toString();
    }
}