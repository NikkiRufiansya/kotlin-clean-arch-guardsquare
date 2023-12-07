package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.EmojiCompatInitializer;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setFastScrollStyle implements EmojiCompatInitializer.AnonymousClass1, setTitleEllipsize, setSubtitleTextAppearance.setX, setDropDownBackgroundDrawable {
    setChipIconSizeResource MenuHostHelper$$ExternalSyntheticLambda0;
    final Matrix MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPointerIcon setIconTintList;
    private final Path setLayoutAnimation;
    private List<setTitleEllipsize> setNavigationOnClickListener;
    private final String setOnLongClickListener;
    private final RectF setTextAlignment;
    private Paint setUiOptions;
    private RectF setUnboundedRipple;
    private final List<setContentInsetStartWithNavigation> setX;
    private final boolean setY;

    private static List<setContentInsetStartWithNavigation> setX(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, List<getRootAlpha> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            setContentInsetStartWithNavigation iconTintList = list.get(i).setIconTintList(setpointericon, setendiconcheckable);
            if (iconTintList != null) {
                arrayList.add(iconTintList);
            }
        }
        return arrayList;
    }

    private static setup MenuHostHelper$$ExternalSyntheticLambda1(List<getRootAlpha> list) {
        for (int i = 0; i < list.size(); i++) {
            getRootAlpha getrootalpha = list.get(i);
            if (getrootalpha instanceof setup) {
                return (setup) getrootalpha;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFastScrollStyle(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, String str, boolean z, List<setContentInsetStartWithNavigation> list, setup setupVar) {
        this.setUiOptions = new setExpandedTitleMarginStart();
        this.setUnboundedRipple = new RectF();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new Matrix();
        this.setLayoutAnimation = new Path();
        this.setTextAlignment = new RectF();
        this.setOnLongClickListener = str;
        this.setIconTintList = setpointericon;
        this.setY = z;
        this.setX = list;
        if (setupVar != null) {
            setChipIconSizeResource setchipiconsizeresource = new setChipIconSizeResource(setupVar);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setchipiconsizeresource;
            setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1(setendiconcheckable);
            this.MenuHostHelper$$ExternalSyntheticLambda0.setX(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = list.get(size);
            if (setcontentinsetstartwithnavigation instanceof setTouchscreenBlocksFocus) {
                arrayList.add((setTouchscreenBlocksFocus) setcontentinsetstartwithnavigation);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((setTouchscreenBlocksFocus) arrayList.get(size2)).setIconTintList(list.listIterator(list.size()));
        }
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setIconTintList.invalidateSelf();
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setOnLongClickListener;
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.setX.size());
        arrayList.addAll(list);
        for (int size = this.setX.size() - 1; size >= 0; size--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.setX.get(size);
            setcontentinsetstartwithnavigation.setX(arrayList, this.setX.subList(0, size));
            arrayList.add(setcontentinsetstartwithnavigation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<setTitleEllipsize> setIconTintList() {
        if (this.setNavigationOnClickListener == null) {
            this.setNavigationOnClickListener = new ArrayList();
            for (int i = 0; i < this.setX.size(); i++) {
                setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.setX.get(i);
                if (setcontentinsetstartwithnavigation instanceof setTitleEllipsize) {
                    this.setNavigationOnClickListener.add((setTitleEllipsize) setcontentinsetstartwithnavigation);
                }
            }
        }
        return this.setNavigationOnClickListener;
    }

    @Override // o.setTitleEllipsize
    public final Path setX() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.reset();
        setChipIconSizeResource setchipiconsizeresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setchipiconsizeresource != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.set(setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1());
        }
        this.setLayoutAnimation.reset();
        if (this.setY) {
            return this.setLayoutAnimation;
        }
        for (int size = this.setX.size() - 1; size >= 0; size--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.setX.get(size);
            if (setcontentinsetstartwithnavigation instanceof setTitleEllipsize) {
                this.setLayoutAnimation.addPath(((setTitleEllipsize) setcontentinsetstartwithnavigation).setX(), this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        return this.setLayoutAnimation;
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        if (this.setY) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(matrix);
        setChipIconSizeResource setchipiconsizeresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setchipiconsizeresource != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.preConcat(setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1());
            i = (int) (((((this.MenuHostHelper$$ExternalSyntheticLambda0.setX == null ? 100 : this.MenuHostHelper$$ExternalSyntheticLambda0.setX.setOnLongClickListener().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z2 = false;
        if (this.setIconTintList.setUnboundedRipple) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= this.setX.size()) {
                    z = false;
                    break;
                } else if ((this.setX.get(i2) instanceof EmojiCompatInitializer.AnonymousClass1) && (i3 = i3 + 1) >= 2) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z && i != 255) {
                z2 = true;
            }
        }
        if (z2) {
            this.setUnboundedRipple.set(0.0f, 0.0f, 0.0f, 0.0f);
            setIconTintList(this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda1, true);
            this.setUiOptions.setAlpha(i);
            setOnPageChangeListener.setX(canvas, this.setUnboundedRipple, this.setUiOptions, 31);
        }
        if (z2) {
            i = 255;
        }
        for (int size = this.setX.size() - 1; size >= 0; size--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.setX.get(size);
            if (setcontentinsetstartwithnavigation instanceof EmojiCompatInitializer.AnonymousClass1) {
                ((EmojiCompatInitializer.AnonymousClass1) setcontentinsetstartwithnavigation).setIconTintList(canvas, this.MenuHostHelper$$ExternalSyntheticLambda1, i);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(matrix);
        setChipIconSizeResource setchipiconsizeresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setchipiconsizeresource != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.preConcat(setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1());
        }
        this.setTextAlignment.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.setX.size() - 1; size >= 0; size--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.setX.get(size);
            if (setcontentinsetstartwithnavigation instanceof EmojiCompatInitializer.AnonymousClass1) {
                ((EmojiCompatInitializer.AnonymousClass1) setcontentinsetstartwithnavigation).setIconTintList(this.setTextAlignment, this.MenuHostHelper$$ExternalSyntheticLambda1, z);
                rectF.union(this.setTextAlignment);
            }
        }
    }

    @Override // o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        setChipIconSizeResource setchipiconsizeresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setchipiconsizeresource != null) {
            setchipiconsizeresource.setY(t, setprompt);
        }
    }

    public setFastScrollStyle(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setEndIconOnClickListener setendicononclicklistener) {
        this(setpointericon, setendiconcheckable, setendicononclicklistener.MenuHostHelper$$ExternalSyntheticLambda1, setendicononclicklistener.setX, setX(setpointericon, setendiconcheckable, setendicononclicklistener.setY), MenuHostHelper$$ExternalSyntheticLambda1(setendicononclicklistener.setY));
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        if (setsupportbackgroundtintlist.setY(this.setOnLongClickListener, i)) {
            if (!"__container".equals(this.setOnLongClickListener)) {
                String str = this.setOnLongClickListener;
                setSupportBackgroundTintList setsupportbackgroundtintlist3 = new setSupportBackgroundTintList(setsupportbackgroundtintlist2);
                setsupportbackgroundtintlist3.setIconTintList.add(str);
                if (setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener, i)) {
                    setSupportBackgroundTintList setsupportbackgroundtintlist4 = new setSupportBackgroundTintList(setsupportbackgroundtintlist3);
                    setsupportbackgroundtintlist4.MenuHostHelper$$ExternalSyntheticLambda1 = this;
                    list.add(setsupportbackgroundtintlist4);
                }
                setsupportbackgroundtintlist2 = setsupportbackgroundtintlist3;
            }
            if (setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener, i)) {
                int x = setsupportbackgroundtintlist.setX(this.setOnLongClickListener, i);
                for (int i2 = 0; i2 < this.setX.size(); i2++) {
                    setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = this.setX.get(i2);
                    if (setcontentinsetstartwithnavigation instanceof setDropDownBackgroundDrawable) {
                        ((setDropDownBackgroundDrawable) setcontentinsetstartwithnavigation).setIconTintList(setsupportbackgroundtintlist, i + x, list, setsupportbackgroundtintlist2);
                    }
                }
            }
        }
    }
}