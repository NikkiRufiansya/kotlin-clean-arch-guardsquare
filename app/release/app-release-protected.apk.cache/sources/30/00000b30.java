package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o.setRendererPriorityPolicy;

/* loaded from: classes.dex */
public class setEmojiCompatEnabled extends setTickMarkTintList {
    @Override // o.setTickMarkTintList
    public boolean setX(Object obj) {
        return obj instanceof setRendererPriorityPolicy;
    }

    @Override // o.setTickMarkTintList
    public Object setY(Object obj) {
        if (obj != null) {
            return ((setRendererPriorityPolicy) obj).clone();
        }
        return null;
    }

    @Override // o.setTickMarkTintList
    public Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj == null) {
            return null;
        }
        setColumnWidth setcolumnwidth = new setColumnWidth();
        setcolumnwidth.MenuHostHelper$$ExternalSyntheticLambda1((setRendererPriorityPolicy) obj);
        return setcolumnwidth;
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, View view, ArrayList<View> arrayList) {
        setColumnWidth setcolumnwidth = (setColumnWidth) obj;
        ArrayList<View> arrayList2 = setcolumnwidth.setLayoutAnimation;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            setX((List<View>) arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        setIconTintList(setcolumnwidth, arrayList);
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            setIconTintList(view, rect);
            ((setRendererPriorityPolicy) obj).MenuHostHelper$$ExternalSyntheticLambda0(new setRendererPriorityPolicy.setY() { // from class: o.setEmojiCompatEnabled.2
            });
        }
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, ArrayList<View> arrayList) {
        setRendererPriorityPolicy setrendererprioritypolicy = (setRendererPriorityPolicy) obj;
        if (setrendererprioritypolicy == null) {
            return;
        }
        int i = 0;
        if (setrendererprioritypolicy instanceof setColumnWidth) {
            setColumnWidth setcolumnwidth = (setColumnWidth) setrendererprioritypolicy;
            int size = setcolumnwidth.setTextAlignment.size();
            while (i < size) {
                setIconTintList((i < 0 || i >= setcolumnwidth.setTextAlignment.size()) ? null : setcolumnwidth.setTextAlignment.get(i), arrayList);
                i++;
            }
        } else if (MenuHostHelper$$ExternalSyntheticLambda1(setrendererprioritypolicy) || !MenuHostHelper$$ExternalSyntheticLambda0(setrendererprioritypolicy.setLayoutAnimation)) {
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // o.setTickMarkTintList
    public Object setY(Object obj, Object obj2, Object obj3) {
        setColumnWidth setcolumnwidth = new setColumnWidth();
        if (obj != null) {
            setcolumnwidth.MenuHostHelper$$ExternalSyntheticLambda1((setRendererPriorityPolicy) obj);
        }
        if (obj2 != null) {
            setcolumnwidth.MenuHostHelper$$ExternalSyntheticLambda1((setRendererPriorityPolicy) obj2);
        }
        if (obj3 != null) {
            setcolumnwidth.MenuHostHelper$$ExternalSyntheticLambda1((setRendererPriorityPolicy) obj3);
        }
        return setcolumnwidth;
    }

    @Override // o.setTickMarkTintList
    public void setX(Object obj, final View view, final ArrayList<View> arrayList) {
        ((setRendererPriorityPolicy) obj).setY(new setRendererPriorityPolicy.setIconTintList() { // from class: o.setEmojiCompatEnabled.5
            @Override // o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            }

            @Override // o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            }

            @Override // o.setRendererPriorityPolicy.setIconTintList
            public final void setIconTintList() {
            }

            @Override // o.setRendererPriorityPolicy.setIconTintList
            public final void setX() {
            }

            @Override // o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
                setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // o.setTickMarkTintList
    public Object setIconTintList(Object obj, Object obj2, Object obj3) {
        setRendererPriorityPolicy setrendererprioritypolicy = (setRendererPriorityPolicy) obj;
        setRendererPriorityPolicy setrendererprioritypolicy2 = (setRendererPriorityPolicy) obj2;
        setRendererPriorityPolicy setrendererprioritypolicy3 = (setRendererPriorityPolicy) obj3;
        if (setrendererprioritypolicy != null && setrendererprioritypolicy2 != null) {
            setrendererprioritypolicy = new setColumnWidth().MenuHostHelper$$ExternalSyntheticLambda1(setrendererprioritypolicy).MenuHostHelper$$ExternalSyntheticLambda1(setrendererprioritypolicy2).setX(1);
        } else if (setrendererprioritypolicy == null) {
            setrendererprioritypolicy = setrendererprioritypolicy2 != null ? setrendererprioritypolicy2 : null;
        }
        if (setrendererprioritypolicy3 != null) {
            setColumnWidth setcolumnwidth = new setColumnWidth();
            if (setrendererprioritypolicy != null) {
                setcolumnwidth.MenuHostHelper$$ExternalSyntheticLambda1(setrendererprioritypolicy);
            }
            setcolumnwidth.MenuHostHelper$$ExternalSyntheticLambda1(setrendererprioritypolicy3);
            return setcolumnwidth;
        }
        return setrendererprioritypolicy;
    }

    @Override // o.setTickMarkTintList
    public void setY(ViewGroup viewGroup, Object obj) {
        setHelperText.setIconTintList(viewGroup, (setRendererPriorityPolicy) obj);
    }

    @Override // o.setTickMarkTintList
    public void setY(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((setRendererPriorityPolicy) obj).setY(new setBoxBackgroundColor() { // from class: o.setEmojiCompatEnabled.1
            @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                Object obj5 = obj2;
                if (obj5 != null) {
                    setEmojiCompatEnabled.this.setY(obj5, arrayList, (ArrayList<View>) null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    setEmojiCompatEnabled.this.setY(obj6, arrayList2, (ArrayList<View>) null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    setEmojiCompatEnabled.this.setY(obj7, arrayList3, (ArrayList<View>) null);
                }
            }

            @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
                setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        });
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        setColumnWidth setcolumnwidth = (setColumnWidth) obj;
        if (setcolumnwidth != null) {
            setcolumnwidth.setLayoutAnimation.clear();
            setcolumnwidth.setLayoutAnimation.addAll(arrayList2);
            setY((Object) setcolumnwidth, arrayList, arrayList2);
        }
    }

    @Override // o.setTickMarkTintList
    public void setY(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        setRendererPriorityPolicy setrendererprioritypolicy = (setRendererPriorityPolicy) obj;
        int i = 0;
        if (setrendererprioritypolicy instanceof setColumnWidth) {
            setColumnWidth setcolumnwidth = (setColumnWidth) setrendererprioritypolicy;
            int size = setcolumnwidth.setTextAlignment.size();
            while (i < size) {
                setY((Object) ((i < 0 || i >= setcolumnwidth.setTextAlignment.size()) ? null : setcolumnwidth.setTextAlignment.get(i)), arrayList, arrayList2);
                i++;
            }
        } else if (!MenuHostHelper$$ExternalSyntheticLambda1(setrendererprioritypolicy)) {
            ArrayList<View> arrayList3 = setrendererprioritypolicy.setLayoutAnimation;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    setrendererprioritypolicy.setX(arrayList.get(size3));
                }
            }
        }
    }

    @Override // o.setTickMarkTintList
    public void setX(Object obj, View view) {
        if (obj != null) {
            ((setRendererPriorityPolicy) obj).MenuHostHelper$$ExternalSyntheticLambda1(view);
        }
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, final Rect rect) {
        if (obj != null) {
            ((setRendererPriorityPolicy) obj).MenuHostHelper$$ExternalSyntheticLambda0(new setRendererPriorityPolicy.setY() { // from class: o.setEmojiCompatEnabled.3
            });
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(setRendererPriorityPolicy setrendererprioritypolicy) {
        return (MenuHostHelper$$ExternalSyntheticLambda0(setrendererprioritypolicy.setOnLongClickListener) && MenuHostHelper$$ExternalSyntheticLambda0(setrendererprioritypolicy.setNavigationOnClickListener) && MenuHostHelper$$ExternalSyntheticLambda0(setrendererprioritypolicy.setUnboundedRipple)) ? false : true;
    }
}