package o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class setTickMarkTintList {
    public abstract Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj);

    public abstract Object setIconTintList(Object obj, Object obj2, Object obj3);

    public abstract void setIconTintList(Object obj, Rect rect);

    public abstract void setIconTintList(Object obj, View view);

    public abstract void setIconTintList(Object obj, View view, ArrayList<View> arrayList);

    public abstract void setIconTintList(Object obj, ArrayList<View> arrayList);

    public abstract void setIconTintList(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void setX(Object obj, View view);

    public abstract void setX(Object obj, View view, ArrayList<View> arrayList);

    public abstract boolean setX(Object obj);

    public abstract Object setY(Object obj);

    public abstract Object setY(Object obj, Object obj2, Object obj3);

    public abstract void setY(ViewGroup viewGroup, Object obj);

    public abstract void setY(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void setY(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: Access modifiers changed from: protected */
    public void setIconTintList(View view, Rect rect) {
        if (setBaselineAlignBottom.setChipIconTintResource(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(setBaselineAlignBottom.setLayoutDirection(view));
            view.setTransitionName(null);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String layoutDirection = setBaselineAlignBottom.setLayoutDirection(view2);
            arrayList4.add(layoutDirection);
            if (layoutDirection != null) {
                view2.setTransitionName(null);
                String str = map.get(layoutDirection);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        arrayList2.get(i2).setTransitionName(layoutDirection);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        setRawInputType.MenuHostHelper$$ExternalSyntheticLambda0(view, new Runnable() { // from class: o.setTickMarkTintList.2
            @Override // java.lang.Runnable
            public final void run() {
                for (int i3 = 0; i3 < size; i3++) {
                    ((View) arrayList2.get(i3)).setTransitionName((String) arrayList3.get(i3));
                    ((View) arrayList.get(i3)).setTransitionName((String) arrayList4.get(i3));
                }
            }
        });
    }

    public void setX(setDropDownBackgroundResource setdropdownbackgroundresource, Object obj, setRenderMode setrendermode, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void setX(List<View> list, View view) {
        int size = list.size();
        if (setIconTintList(list, view, size)) {
            return;
        }
        if (setBaselineAlignBottom.setLayoutDirection(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!setIconTintList(list, childAt, size) && setBaselineAlignBottom.setLayoutDirection(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean setIconTintList(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(List list) {
        return list == null || list.isEmpty();
    }
}