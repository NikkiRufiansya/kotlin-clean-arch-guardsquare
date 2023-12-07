package o;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import o.setRootViewData;

/* loaded from: classes.dex */
public final class setStatusBarBackgroundResource implements setTitleEllipsize, setTouchscreenBlocksFocus {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final setRootViewData MenuHostHelper$$ExternalSyntheticLambda1;
    private final Path setY = new Path();
    private final Path setUnboundedRipple = new Path();
    private final Path setIconTintList = new Path();
    private final List<setTitleEllipsize> setX = new ArrayList();

    public setStatusBarBackgroundResource(setRootViewData setrootviewdata) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setrootviewdata.MenuHostHelper$$ExternalSyntheticLambda1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setrootviewdata;
    }

    @Override // o.setTouchscreenBlocksFocus
    public final void setIconTintList(ListIterator<setContentInsetStartWithNavigation> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            setContentInsetStartWithNavigation previous = listIterator.previous();
            if (previous instanceof setTitleEllipsize) {
                this.setX.add((setTitleEllipsize) previous);
                listIterator.remove();
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        for (int i = 0; i < this.setX.size(); i++) {
            this.setX.get(i).setX(list, list2);
        }
    }

    @Override // o.setTitleEllipsize
    public final Path setX() {
        this.setIconTintList.reset();
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList) {
            return this.setIconTintList;
        }
        int i = AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.setX.size(); i2++) {
                this.setIconTintList.addPath(this.setX.get(i2).setX());
            }
        } else if (i == 2) {
            MenuHostHelper$$ExternalSyntheticLambda0(Path.Op.UNION);
        } else if (i == 3) {
            MenuHostHelper$$ExternalSyntheticLambda0(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            MenuHostHelper$$ExternalSyntheticLambda0(Path.Op.INTERSECT);
        } else if (i == 5) {
            MenuHostHelper$$ExternalSyntheticLambda0(Path.Op.XOR);
        }
        return this.setIconTintList;
    }

    /* renamed from: o.setStatusBarBackgroundResource$4  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[setRootViewData.setY.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[setRootViewData.setY.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setRootViewData.setY.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setRootViewData.setY.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setRootViewData.setY.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setRootViewData.setY.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.setUnboundedRipple.reset();
        this.setY.reset();
        for (int size = this.setX.size() - 1; size > 0; size--) {
            setTitleEllipsize settitleellipsize = this.setX.get(size);
            if (settitleellipsize instanceof setFastScrollStyle) {
                setFastScrollStyle setfastscrollstyle = (setFastScrollStyle) settitleellipsize;
                List<setTitleEllipsize> iconTintList = setfastscrollstyle.setIconTintList();
                for (int size2 = iconTintList.size() - 1; size2 >= 0; size2--) {
                    Path x = iconTintList.get(size2).setX();
                    setChipIconSizeResource setchipiconsizeresource = setfastscrollstyle.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (setchipiconsizeresource != null) {
                        matrix2 = setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1();
                    } else {
                        setfastscrollstyle.MenuHostHelper$$ExternalSyntheticLambda1.reset();
                        matrix2 = setfastscrollstyle.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    x.transform(matrix2);
                    this.setUnboundedRipple.addPath(x);
                }
            } else {
                this.setUnboundedRipple.addPath(settitleellipsize.setX());
            }
        }
        setTitleEllipsize settitleellipsize2 = this.setX.get(0);
        if (settitleellipsize2 instanceof setFastScrollStyle) {
            setFastScrollStyle setfastscrollstyle2 = (setFastScrollStyle) settitleellipsize2;
            List<setTitleEllipsize> iconTintList2 = setfastscrollstyle2.setIconTintList();
            for (int i = 0; i < iconTintList2.size(); i++) {
                Path x2 = iconTintList2.get(i).setX();
                setChipIconSizeResource setchipiconsizeresource2 = setfastscrollstyle2.MenuHostHelper$$ExternalSyntheticLambda0;
                if (setchipiconsizeresource2 != null) {
                    matrix = setchipiconsizeresource2.MenuHostHelper$$ExternalSyntheticLambda1();
                } else {
                    setfastscrollstyle2.MenuHostHelper$$ExternalSyntheticLambda1.reset();
                    matrix = setfastscrollstyle2.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                x2.transform(matrix);
                this.setY.addPath(x2);
            }
        } else {
            this.setY.set(settitleellipsize2.setX());
        }
        this.setIconTintList.op(this.setY, this.setUnboundedRipple, op);
    }
}