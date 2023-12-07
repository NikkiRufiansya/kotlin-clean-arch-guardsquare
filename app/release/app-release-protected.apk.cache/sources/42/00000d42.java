package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.setEdgeEffectColor;
import o.setRenderMode;
import o.setSelectedItemId;

/* loaded from: classes.dex */
final class setMargin extends setEdgeEffectColor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setMargin(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [o.setMargin] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // o.setEdgeEffectColor
    final void setX(List<setEdgeEffectColor.setY> list, final boolean z) {
        ArrayList<setY> arrayList;
        HashMap hashMap;
        ArrayList arrayList2;
        String str;
        boolean isLoggable;
        String str2;
        Iterator it;
        View view;
        View view2;
        setFabAnchorMode setfabanchormode;
        ArrayList<View> arrayList3;
        View view3;
        final Rect rect;
        ArrayList arrayList4;
        HashMap hashMap2;
        ArrayList arrayList5;
        setEdgeEffectColor.setY sety;
        final setTickMarkTintList settickmarktintlist;
        setEdgeEffectColor.setY sety2;
        ArrayList<View> arrayList6;
        setIsHandwritingDelegate layoutDirection;
        setIsHandwritingDelegate ExtendableSavedState$1;
        Rect rect2;
        int i;
        setMargin setmargin;
        final View view4;
        String x;
        Rect rect3;
        boolean isLoggable2;
        boolean isLoggable3;
        boolean isLoggable4;
        boolean z2 = z;
        setEdgeEffectColor.setY sety3 = null;
        setEdgeEffectColor.setY sety4 = null;
        for (setEdgeEffectColor.setY sety5 : list) {
            setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(sety5.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
            int i2 = AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda1[sety5.MenuHostHelper$$ExternalSyntheticLambda0.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (MenuHostHelper$$ExternalSyntheticLambda1 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE && sety3 == null) {
                    sety3 = sety5;
                }
            } else if (i2 == 4 && MenuHostHelper$$ExternalSyntheticLambda1 != setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE) {
                sety4 = sety5;
            }
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList<setIconTintList> arrayList8 = new ArrayList();
        final ArrayList arrayList9 = new ArrayList(list);
        Iterator<setEdgeEffectColor.setY> it2 = list.iterator();
        while (it2.hasNext()) {
            final setEdgeEffectColor.setY next = it2.next();
            setRenderMode setrendermode = new setRenderMode();
            next.setY();
            next.setLayoutAnimation.add(setrendermode);
            arrayList7.add(new setY(next, setrendermode, z2));
            setRenderMode setrendermode2 = new setRenderMode();
            next.setY();
            next.setLayoutAnimation.add(setrendermode2);
            arrayList8.add(new setIconTintList(next, setrendermode2, z2, !z2 ? next != sety4 : next != sety3));
            next.setY.add(new Runnable() { // from class: o.setMargin.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (arrayList9.contains(next)) {
                        arrayList9.remove(next);
                        setEdgeEffectColor.setY sety6 = next;
                        sety6.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(sety6.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
                    }
                }
            });
        }
        HashMap hashMap3 = new HashMap();
        setTickMarkTintList settickmarktintlist2 = null;
        for (setIconTintList seticontintlist : arrayList8) {
            if (!seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1()) {
                setTickMarkTintList iconTintList = seticontintlist.setIconTintList(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
                setTickMarkTintList iconTintList2 = seticontintlist.setIconTintList(seticontintlist.setX);
                if (iconTintList != null && iconTintList2 != null && iconTintList != iconTintList2) {
                    StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb.append(seticontintlist.setY.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb.append(" returned Transition ");
                    sb.append(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb.append(" which uses a different Transition  type than its shared element transition ");
                    sb.append(seticontintlist.setX);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iconTintList == null) {
                    iconTintList = iconTintList2;
                }
                if (settickmarktintlist2 == null) {
                    settickmarktintlist2 = iconTintList;
                } else if (iconTintList != null && settickmarktintlist2 != iconTintList) {
                    StringBuilder sb2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb2.append(seticontintlist.setY.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb2.append(" returned Transition ");
                    sb2.append(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        String str3 = "FragmentManager";
        if (settickmarktintlist2 == null) {
            for (setIconTintList seticontintlist2 : arrayList8) {
                hashMap3.put(seticontintlist2.setY, Boolean.FALSE);
                setEdgeEffectColor.setY sety6 = seticontintlist2.setY;
                if (sety6.setLayoutAnimation.remove(seticontintlist2.setIconTintList) && sety6.setLayoutAnimation.isEmpty()) {
                    sety6.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            }
            arrayList2 = arrayList9;
            str = "FragmentManager";
            arrayList = arrayList7;
            hashMap = hashMap3;
        } else {
            View view5 = new View(MenuHostHelper$$ExternalSyntheticLambda0().getContext());
            Rect rect4 = new Rect();
            ArrayList<View> arrayList10 = new ArrayList<>();
            ArrayList<View> arrayList11 = new ArrayList<>();
            setFabAnchorMode setfabanchormode2 = new setFabAnchorMode();
            HashMap hashMap4 = hashMap3;
            ArrayList arrayList12 = arrayList9;
            setMargin setmargin2 = this;
            setEdgeEffectColor.setY sety7 = sety3;
            setEdgeEffectColor.setY sety8 = sety4;
            arrayList = arrayList7;
            Object obj = null;
            View view6 = null;
            boolean z3 = false;
            for (setIconTintList seticontintlist3 : arrayList8) {
                String str4 = str3;
                Object obj2 = obj;
                if (!(seticontintlist3.setX != null) || sety7 == null || sety8 == null) {
                    setfabanchormode = setfabanchormode2;
                    arrayList3 = arrayList10;
                    view3 = view5;
                    rect = rect4;
                    arrayList4 = arrayList8;
                    hashMap2 = hashMap4;
                    arrayList5 = arrayList12;
                    sety = sety4;
                    settickmarktintlist = settickmarktintlist2;
                    sety2 = sety3;
                    arrayList6 = arrayList11;
                    obj = obj2;
                } else {
                    obj = settickmarktintlist2.MenuHostHelper$$ExternalSyntheticLambda1(settickmarktintlist2.setY(seticontintlist3.setX));
                    ArrayList<String> RecyclerView$SavedState$1 = sety4.MenuHostHelper$$ExternalSyntheticLambda1.RecyclerView$SavedState$1();
                    ArrayList<String> RecyclerView$SavedState$12 = sety3.MenuHostHelper$$ExternalSyntheticLambda1.RecyclerView$SavedState$1();
                    ArrayList<String> floatValues = sety3.MenuHostHelper$$ExternalSyntheticLambda1.setFloatValues();
                    setTickMarkTintList settickmarktintlist3 = settickmarktintlist2;
                    arrayList4 = arrayList8;
                    int i3 = 0;
                    while (i3 < floatValues.size()) {
                        int indexOf = RecyclerView$SavedState$1.indexOf(floatValues.get(i3));
                        ArrayList<String> arrayList13 = floatValues;
                        if (indexOf != -1) {
                            RecyclerView$SavedState$1.set(indexOf, RecyclerView$SavedState$12.get(i3));
                        }
                        i3++;
                        floatValues = arrayList13;
                    }
                    ArrayList<String> floatValues2 = sety4.MenuHostHelper$$ExternalSyntheticLambda1.setFloatValues();
                    if (!z2) {
                        layoutDirection = sety3.MenuHostHelper$$ExternalSyntheticLambda1.ExtendableSavedState$1();
                        ExtendableSavedState$1 = sety4.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection();
                    } else {
                        layoutDirection = sety3.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutDirection();
                        ExtendableSavedState$1 = sety4.MenuHostHelper$$ExternalSyntheticLambda1.ExtendableSavedState$1();
                    }
                    View view7 = view5;
                    int i4 = 0;
                    for (int size = RecyclerView$SavedState$1.size(); i4 < size; size = size) {
                        setfabanchormode2.put(RecyclerView$SavedState$1.get(i4), floatValues2.get(i4));
                        i4++;
                    }
                    setFabAnchorMode setfabanchormode3 = new setFabAnchorMode();
                    setmargin2.MenuHostHelper$$ExternalSyntheticLambda1(setfabanchormode3, sety3.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
                    setOnConstraintsChanged.MenuHostHelper$$ExternalSyntheticLambda1((Map) setfabanchormode3, (Collection<?>) RecyclerView$SavedState$1);
                    if (layoutDirection != null) {
                        int size2 = RecyclerView$SavedState$1.size() - 1;
                        while (size2 >= 0) {
                            String str5 = RecyclerView$SavedState$1.get(size2);
                            View view8 = (View) setfabanchormode3.get(str5);
                            if (view8 == null) {
                                setfabanchormode2.remove(str5);
                                rect3 = rect4;
                            } else {
                                rect3 = rect4;
                                if (!str5.equals(setBaselineAlignBottom.setLayoutDirection(view8))) {
                                    setfabanchormode2.put(setBaselineAlignBottom.setLayoutDirection(view8), (String) setfabanchormode2.remove(str5));
                                }
                            }
                            size2--;
                            rect4 = rect3;
                        }
                        rect2 = rect4;
                    } else {
                        rect2 = rect4;
                        setOnConstraintsChanged.MenuHostHelper$$ExternalSyntheticLambda1((Map) setfabanchormode2, (Collection<?>) setfabanchormode3.keySet());
                    }
                    final setFabAnchorMode setfabanchormode4 = new setFabAnchorMode();
                    setmargin2.MenuHostHelper$$ExternalSyntheticLambda1(setfabanchormode4, sety4.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
                    setOnConstraintsChanged.MenuHostHelper$$ExternalSyntheticLambda1((Map) setfabanchormode4, (Collection<?>) floatValues2);
                    setOnConstraintsChanged.MenuHostHelper$$ExternalSyntheticLambda1((Map) setfabanchormode4, (Collection<?>) setfabanchormode2.values());
                    if (ExtendableSavedState$1 != null) {
                        for (int size3 = floatValues2.size() - 1; size3 >= 0; size3--) {
                            String str6 = floatValues2.get(size3);
                            View view9 = (View) setfabanchormode4.get(str6);
                            if (view9 == null) {
                                String x2 = getClass.setX(setfabanchormode2, str6);
                                if (x2 != null) {
                                    setfabanchormode2.remove(x2);
                                }
                            } else if (!str6.equals(setBaselineAlignBottom.setLayoutDirection(view9)) && (x = getClass.setX(setfabanchormode2, str6)) != null) {
                                setfabanchormode2.put(x, setBaselineAlignBottom.setLayoutDirection(view9));
                            }
                        }
                    } else {
                        getClass.setIconTintList(setfabanchormode2, setfabanchormode4);
                    }
                    setY(setfabanchormode3, setfabanchormode2.keySet());
                    setY(setfabanchormode4, setfabanchormode2.values());
                    if (setfabanchormode2.isEmpty()) {
                        arrayList10.clear();
                        arrayList11.clear();
                        setfabanchormode = setfabanchormode2;
                        arrayList3 = arrayList10;
                        sety2 = sety3;
                        sety7 = sety2;
                        sety8 = sety4;
                        sety = sety8;
                        hashMap2 = hashMap4;
                        arrayList5 = arrayList12;
                        settickmarktintlist = settickmarktintlist3;
                        view3 = view7;
                        rect = rect2;
                        obj = null;
                        arrayList6 = arrayList11;
                    } else {
                        getClass.setIconTintList(sety4.MenuHostHelper$$ExternalSyntheticLambda1, sety3.MenuHostHelper$$ExternalSyntheticLambda1, z2, setfabanchormode3);
                        setfabanchormode = setfabanchormode2;
                        final setEdgeEffectColor.setY sety9 = sety4;
                        setEdgeEffectColor.setY sety10 = sety4;
                        HashMap hashMap5 = hashMap4;
                        settickmarktintlist = settickmarktintlist3;
                        final setEdgeEffectColor.setY sety11 = sety3;
                        arrayList3 = arrayList10;
                        setEdgeEffectColor.setY sety12 = sety3;
                        arrayList5 = arrayList12;
                        arrayList6 = arrayList11;
                        setRawInputType.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), new Runnable() { // from class: o.setMargin.7
                            @Override // java.lang.Runnable
                            public final void run() {
                                getClass.setIconTintList(sety9.MenuHostHelper$$ExternalSyntheticLambda1, sety11.MenuHostHelper$$ExternalSyntheticLambda1, z, setfabanchormode4);
                            }
                        });
                        arrayList3.addAll(setfabanchormode3.values());
                        if (RecyclerView$SavedState$1.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            View view10 = (View) setfabanchormode3.get(RecyclerView$SavedState$1.get(0));
                            settickmarktintlist.setIconTintList(obj, view10);
                            view6 = view10;
                        }
                        arrayList6.addAll(setfabanchormode4.values());
                        if (floatValues2.isEmpty() || (view4 = (View) setfabanchormode4.get(floatValues2.get(i))) == null) {
                            setmargin = this;
                            rect = rect2;
                            view3 = view7;
                        } else {
                            setmargin = this;
                            rect = rect2;
                            setRawInputType.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), new Runnable() { // from class: o.setMargin.8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    settickmarktintlist.setIconTintList(view4, rect);
                                }
                            });
                            view3 = view7;
                            z3 = true;
                        }
                        settickmarktintlist.setIconTintList(obj, view3, arrayList3);
                        settickmarktintlist.setY(obj, null, null, null, null, obj, arrayList6);
                        hashMap2 = hashMap5;
                        sety2 = sety12;
                        hashMap2.put(sety2, Boolean.TRUE);
                        sety = sety10;
                        hashMap2.put(sety, Boolean.TRUE);
                        sety7 = sety2;
                        setmargin2 = setmargin;
                        sety8 = sety;
                    }
                }
                rect4 = rect;
                arrayList10 = arrayList3;
                hashMap4 = hashMap2;
                arrayList11 = arrayList6;
                str3 = str4;
                arrayList8 = arrayList4;
                arrayList12 = arrayList5;
                z2 = z;
                sety3 = sety2;
                settickmarktintlist2 = settickmarktintlist;
                sety4 = sety;
                view5 = view3;
                setfabanchormode2 = setfabanchormode;
                setmargin2 = setmargin2;
            }
            setFabAnchorMode setfabanchormode5 = setfabanchormode2;
            ArrayList<View> arrayList14 = arrayList11;
            setTickMarkTintList settickmarktintlist4 = settickmarktintlist2;
            ArrayList<View> arrayList15 = arrayList10;
            String str7 = str3;
            View view11 = view5;
            Rect rect5 = rect4;
            Object obj3 = obj;
            ArrayList<setIconTintList> arrayList16 = arrayList8;
            hashMap = hashMap4;
            arrayList2 = arrayList12;
            ArrayList arrayList17 = new ArrayList();
            Iterator it3 = arrayList16.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it3.hasNext()) {
                setIconTintList seticontintlist4 = (setIconTintList) it3.next();
                if (seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda1()) {
                    it = it3;
                    hashMap.put(seticontintlist4.setY, Boolean.FALSE);
                    setEdgeEffectColor.setY sety13 = seticontintlist4.setY;
                    if (sety13.setLayoutAnimation.remove(seticontintlist4.setIconTintList) && sety13.setLayoutAnimation.isEmpty()) {
                        sety13.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                } else {
                    it = it3;
                    Object y = settickmarktintlist4.setY(seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda1);
                    setEdgeEffectColor.setY sety14 = seticontintlist4.setY;
                    boolean z4 = obj3 != null && (sety14 == sety7 || sety14 == sety8);
                    if (y != null) {
                        final ArrayList<View> arrayList18 = new ArrayList<>();
                        setEdgeEffectColor.setY sety15 = sety8;
                        setmargin2.setY(arrayList18, sety14.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
                        if (z4) {
                            if (sety14 == sety7) {
                                arrayList18.removeAll(arrayList15);
                            } else {
                                arrayList18.removeAll(arrayList14);
                            }
                        }
                        if (arrayList18.isEmpty()) {
                            settickmarktintlist4.setX(y, view11);
                            view = view11;
                        } else {
                            settickmarktintlist4.setIconTintList(y, arrayList18);
                            settickmarktintlist4.setY(y, y, arrayList18, null, null, null, null);
                            view = view11;
                            if (sety14.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.GONE) {
                                arrayList2.remove(sety14);
                                ArrayList<View> arrayList19 = new ArrayList<>(arrayList18);
                                arrayList19.remove(sety14.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
                                settickmarktintlist4.setX(y, sety14.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode, arrayList19);
                                setRawInputType.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0(), new Runnable() { // from class: o.setMargin.10
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        getClass.setX(arrayList18, 4);
                                    }
                                });
                            }
                        }
                        if (sety14.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE) {
                            arrayList17.addAll(arrayList18);
                            if (z3) {
                                settickmarktintlist4.setIconTintList(y, rect5);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            settickmarktintlist4.setIconTintList(y, view2);
                        }
                        hashMap.put(sety14, Boolean.TRUE);
                        if (seticontintlist4.MenuHostHelper$$ExternalSyntheticLambda0) {
                            obj4 = settickmarktintlist4.setY(obj4, y, (Object) null);
                        } else {
                            obj5 = settickmarktintlist4.setY(obj5, y, (Object) null);
                        }
                        it3 = it;
                        view6 = view2;
                        sety8 = sety15;
                        view11 = view;
                    } else if (!z4) {
                        hashMap.put(sety14, Boolean.FALSE);
                        setEdgeEffectColor.setY sety16 = seticontintlist4.setY;
                        if (sety16.setLayoutAnimation.remove(seticontintlist4.setIconTintList) && sety16.setLayoutAnimation.isEmpty()) {
                            sety16.MenuHostHelper$$ExternalSyntheticLambda0();
                        }
                    }
                }
                it3 = it;
            }
            setEdgeEffectColor.setY sety17 = sety8;
            Object iconTintList3 = settickmarktintlist4.setIconTintList(obj4, obj5, obj3);
            for (final setIconTintList seticontintlist5 : arrayList16) {
                if (!seticontintlist5.MenuHostHelper$$ExternalSyntheticLambda1()) {
                    Object obj6 = seticontintlist5.MenuHostHelper$$ExternalSyntheticLambda1;
                    setEdgeEffectColor.setY sety18 = seticontintlist5.setY;
                    setEdgeEffectColor.setY sety19 = sety17;
                    boolean z5 = obj3 != null && (sety18 == sety7 || sety18 == sety19);
                    if (obj6 != null || z5) {
                        if (!setBaselineAlignBottom.setConstraintSet(MenuHostHelper$$ExternalSyntheticLambda0())) {
                            isLoggable = Log.isLoggable("FragmentManager", 2);
                            if (isLoggable) {
                                StringBuilder sb3 = new StringBuilder("SpecialEffectsController: Container ");
                                sb3.append(MenuHostHelper$$ExternalSyntheticLambda0());
                                sb3.append(" has not been laid out. Completing operation ");
                                sb3.append(sety18);
                                str2 = str7;
                                Log.v(str2, sb3.toString());
                            } else {
                                str2 = str7;
                            }
                            setEdgeEffectColor.setY sety20 = seticontintlist5.setY;
                            if (sety20.setLayoutAnimation.remove(seticontintlist5.setIconTintList) && sety20.setLayoutAnimation.isEmpty()) {
                                sety20.MenuHostHelper$$ExternalSyntheticLambda0();
                            }
                            str7 = str2;
                        } else {
                            settickmarktintlist4.setX(seticontintlist5.setY.MenuHostHelper$$ExternalSyntheticLambda1, iconTintList3, seticontintlist5.setIconTintList, new Runnable() { // from class: o.setMargin.9
                                @Override // java.lang.Runnable
                                public final void run() {
                                    setIconTintList seticontintlist6 = seticontintlist5;
                                    setEdgeEffectColor.setY sety21 = seticontintlist6.setY;
                                    if (sety21.setLayoutAnimation.remove(seticontintlist6.setIconTintList) && sety21.setLayoutAnimation.isEmpty()) {
                                        sety21.MenuHostHelper$$ExternalSyntheticLambda0();
                                    }
                                }
                            });
                        }
                    }
                    sety17 = sety19;
                }
            }
            str = str7;
            if (setBaselineAlignBottom.setConstraintSet(MenuHostHelper$$ExternalSyntheticLambda0())) {
                getClass.setX(arrayList17, 4);
                ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda12 = settickmarktintlist4.MenuHostHelper$$ExternalSyntheticLambda1(arrayList14);
                settickmarktintlist4.setY(MenuHostHelper$$ExternalSyntheticLambda0(), iconTintList3);
                settickmarktintlist4.setX(MenuHostHelper$$ExternalSyntheticLambda0(), arrayList15, arrayList14, MenuHostHelper$$ExternalSyntheticLambda12, setfabanchormode5);
                getClass.setX(arrayList17, 0);
                settickmarktintlist4.setIconTintList(obj3, arrayList15, arrayList14);
            }
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        final ViewGroup MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        Context context = MenuHostHelper$$ExternalSyntheticLambda0.getContext();
        ArrayList arrayList20 = new ArrayList();
        boolean z6 = false;
        for (final setY sety21 : arrayList) {
            if (!sety21.MenuHostHelper$$ExternalSyntheticLambda1()) {
                setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0 iconTintList4 = sety21.setIconTintList(context);
                if (iconTintList4 != null) {
                    final Animator animator = iconTintList4.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (animator == null) {
                        arrayList20.add(sety21);
                    } else {
                        final setEdgeEffectColor.setY sety22 = sety21.setY;
                        setDropDownBackgroundResource setdropdownbackgroundresource = sety22.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (Boolean.TRUE.equals(hashMap.get(sety22))) {
                            isLoggable4 = Log.isLoggable("FragmentManager", 2);
                            if (isLoggable4) {
                                StringBuilder sb4 = new StringBuilder("Ignoring Animator set on ");
                                sb4.append(setdropdownbackgroundresource);
                                sb4.append(" as this Fragment was involved in a Transition.");
                                Log.v(str, sb4.toString());
                            }
                            setEdgeEffectColor.setY sety23 = sety21.setY;
                            if (sety23.setLayoutAnimation.remove(sety21.setIconTintList) && sety23.setLayoutAnimation.isEmpty()) {
                                sety23.MenuHostHelper$$ExternalSyntheticLambda0();
                            }
                        } else {
                            final boolean z7 = sety22.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.GONE;
                            ArrayList arrayList21 = arrayList2;
                            if (z7) {
                                arrayList21.remove(sety22);
                            }
                            final View view12 = setdropdownbackgroundresource.setImageTintMode;
                            MenuHostHelper$$ExternalSyntheticLambda0.startViewTransition(view12);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: o.setMargin.2
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator2) {
                                    MenuHostHelper$$ExternalSyntheticLambda0.endViewTransition(view12);
                                    if (z7) {
                                        sety22.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(view12);
                                    }
                                    setY sety24 = sety21;
                                    setEdgeEffectColor.setY sety25 = sety24.setY;
                                    if (sety25.setLayoutAnimation.remove(sety24.setIconTintList) && sety25.setLayoutAnimation.isEmpty()) {
                                        sety25.MenuHostHelper$$ExternalSyntheticLambda0();
                                    }
                                }
                            });
                            animator.setTarget(view12);
                            animator.start();
                            sety21.setIconTintList.setX(new setRenderMode.setY() { // from class: o.setMargin.4
                                @Override // o.setRenderMode.setY
                                public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                                    animator.end();
                                }
                            });
                            arrayList2 = arrayList21;
                            hashMap = hashMap;
                            z6 = true;
                        }
                    }
                } else {
                    setEdgeEffectColor.setY sety24 = sety21.setY;
                    if (sety24.setLayoutAnimation.remove(sety21.setIconTintList) && sety24.setLayoutAnimation.isEmpty()) {
                        sety24.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                }
            } else {
                setEdgeEffectColor.setY sety25 = sety21.setY;
                if (sety25.setLayoutAnimation.remove(sety21.setIconTintList) && sety25.setLayoutAnimation.isEmpty()) {
                    sety25.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            }
        }
        ArrayList<setEdgeEffectColor.setY> arrayList22 = arrayList2;
        Iterator it4 = arrayList20.iterator();
        while (it4.hasNext()) {
            final setY sety26 = (setY) it4.next();
            setEdgeEffectColor.setY sety27 = sety26.setY;
            setDropDownBackgroundResource setdropdownbackgroundresource2 = sety27.MenuHostHelper$$ExternalSyntheticLambda1;
            if (containsValue) {
                isLoggable2 = Log.isLoggable("FragmentManager", 2);
                if (isLoggable2) {
                    StringBuilder sb5 = new StringBuilder("Ignoring Animation set on ");
                    sb5.append(setdropdownbackgroundresource2);
                    sb5.append(" as Animations cannot run alongside Transitions.");
                    Log.v(str, sb5.toString());
                }
                setEdgeEffectColor.setY sety28 = sety26.setY;
                if (sety28.setLayoutAnimation.remove(sety26.setIconTintList) && sety28.setLayoutAnimation.isEmpty()) {
                    sety28.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            } else if (z6) {
                isLoggable3 = Log.isLoggable("FragmentManager", 2);
                if (isLoggable3) {
                    StringBuilder sb6 = new StringBuilder("Ignoring Animation set on ");
                    sb6.append(setdropdownbackgroundresource2);
                    sb6.append(" as Animations cannot run alongside Animators.");
                    Log.v(str, sb6.toString());
                }
                setEdgeEffectColor.setY sety29 = sety26.setY;
                if (sety29.setLayoutAnimation.remove(sety26.setIconTintList) && sety29.setLayoutAnimation.isEmpty()) {
                    sety29.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            } else {
                final View view13 = setdropdownbackgroundresource2.setImageTintMode;
                Animation animation = sety26.setIconTintList(context).setX;
                if (sety27.MenuHostHelper$$ExternalSyntheticLambda0 != setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED) {
                    view13.startAnimation(animation);
                    setEdgeEffectColor.setY sety30 = sety26.setY;
                    if (sety30.setLayoutAnimation.remove(sety26.setIconTintList) && sety30.setLayoutAnimation.isEmpty()) {
                        sety30.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0.startViewTransition(view13);
                    setSelectedItemId.setY sety31 = new setSelectedItemId.setY(animation, MenuHostHelper$$ExternalSyntheticLambda0, view13);
                    sety31.setAnimationListener(new Animation.AnimationListener() { // from class: o.setMargin.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation2) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation2) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            MenuHostHelper$$ExternalSyntheticLambda0.post(new Runnable() { // from class: o.setMargin.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MenuHostHelper$$ExternalSyntheticLambda0.endViewTransition(view13);
                                    setY sety32 = sety26;
                                    setEdgeEffectColor.setY sety33 = sety32.setY;
                                    if (sety33.setLayoutAnimation.remove(sety32.setIconTintList) && sety33.setLayoutAnimation.isEmpty()) {
                                        sety33.MenuHostHelper$$ExternalSyntheticLambda0();
                                    }
                                }
                            });
                        }
                    });
                    view13.startAnimation(sety31);
                }
                sety26.setIconTintList.setX(new setRenderMode.setY() { // from class: o.setMargin.6
                    @Override // o.setRenderMode.setY
                    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                        view13.clearAnimation();
                        MenuHostHelper$$ExternalSyntheticLambda0.endViewTransition(view13);
                        setY sety32 = sety26;
                        setEdgeEffectColor.setY sety33 = sety32.setY;
                        if (sety33.setLayoutAnimation.remove(sety32.setIconTintList) && sety33.setLayoutAnimation.isEmpty()) {
                            sety33.MenuHostHelper$$ExternalSyntheticLambda0();
                        }
                    }
                });
            }
        }
        for (setEdgeEffectColor.setY sety32 : arrayList22) {
            sety32.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(sety32.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
        }
        arrayList22.clear();
    }

    /* renamed from: o.setMargin$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void setY(setFabAnchorMode<String, View> setfabanchormode, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = setfabanchormode.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(setBaselineAlignBottom.setLayoutDirection(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    private void setY(ArrayList<View> arrayList, View view) {
        boolean isTransitionGroup;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            isTransitionGroup = viewGroup.isTransitionGroup();
            if (isTransitionGroup) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    setY(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(Map<String, View> map, View view) {
        String layoutDirection = setBaselineAlignBottom.setLayoutDirection(view);
        if (layoutDirection != null) {
            map.put(layoutDirection, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    MenuHostHelper$$ExternalSyntheticLambda1(map, childAt);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        final setRenderMode setIconTintList;
        final setEdgeEffectColor.setY setY;

        setX(setEdgeEffectColor.setY sety, setRenderMode setrendermode) {
            this.setY = sety;
            this.setIconTintList = setrendermode;
        }

        final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
            setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0;
            return MenuHostHelper$$ExternalSyntheticLambda1 == setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1 || !(MenuHostHelper$$ExternalSyntheticLambda1 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE || setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE);
        }
    }

    /* loaded from: classes.dex */
    static class setY extends setX {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setX;

        setY(setEdgeEffectColor.setY sety, setRenderMode setrendermode, boolean z) {
            super(sety, setrendermode);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            this.setX = z;
        }

        final setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(Context context) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            setSelectedItemId$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1 = setSelectedItemId.MenuHostHelper$$ExternalSyntheticLambda1(context, this.setY.MenuHostHelper$$ExternalSyntheticLambda1, this.setY.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE, this.setX);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            return MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends setX {
        final boolean MenuHostHelper$$ExternalSyntheticLambda0;
        final Object MenuHostHelper$$ExternalSyntheticLambda1;
        final Object setX;

        setIconTintList(setEdgeEffectColor.setY sety, setRenderMode setrendermode, boolean z, boolean z2) {
            super(sety, setrendermode);
            Object chipIconTintResource;
            Object textAppearanceResource;
            boolean onNavigationItemSelectedListener;
            if (sety.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE) {
                if (z) {
                    textAppearanceResource = sety.MenuHostHelper$$ExternalSyntheticLambda1.setObjectValues();
                } else {
                    textAppearanceResource = sety.MenuHostHelper$$ExternalSyntheticLambda1.setTextAppearanceResource();
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = textAppearanceResource;
                if (z) {
                    onNavigationItemSelectedListener = sety.MenuHostHelper$$ExternalSyntheticLambda1.setZ();
                } else {
                    onNavigationItemSelectedListener = sety.MenuHostHelper$$ExternalSyntheticLambda1.setOnNavigationItemSelectedListener();
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = onNavigationItemSelectedListener;
            } else {
                if (z) {
                    chipIconTintResource = sety.MenuHostHelper$$ExternalSyntheticLambda1.setChipIconEnabled();
                } else {
                    chipIconTintResource = sety.MenuHostHelper$$ExternalSyntheticLambda1.setChipIconTintResource();
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = chipIconTintResource;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            }
            if (!z2) {
                this.setX = null;
            } else if (z) {
                this.setX = sety.MenuHostHelper$$ExternalSyntheticLambda1.setSelectedChildViewEnabled();
            } else {
                this.setX = sety.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode();
            }
        }

        final setTickMarkTintList setIconTintList(Object obj) {
            if (obj == null) {
                return null;
            }
            if (getClass.MenuHostHelper$$ExternalSyntheticLambda0 != null && getClass.MenuHostHelper$$ExternalSyntheticLambda0.setX(obj)) {
                return getClass.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            if (getClass.setY != null && getClass.setY.setX(obj)) {
                return getClass.setY;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(this.setY.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}