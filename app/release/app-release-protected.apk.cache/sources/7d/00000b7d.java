package o;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class setErrorEnabled extends setTickMarkTintList {
    @Override // o.setTickMarkTintList
    public boolean setX(Object obj) {
        return obj instanceof Transition;
    }

    @Override // o.setTickMarkTintList
    public Object setY(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // o.setTickMarkTintList
    public Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            setX(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        setIconTintList(transitionSet, arrayList);
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            setIconTintList(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: o.setErrorEnabled.2
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                setIconTintList(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (MenuHostHelper$$ExternalSyntheticLambda0(transition) || !MenuHostHelper$$ExternalSyntheticLambda0(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(Transition transition) {
        return (MenuHostHelper$$ExternalSyntheticLambda0(transition.getTargetIds()) && MenuHostHelper$$ExternalSyntheticLambda0(transition.getTargetNames()) && MenuHostHelper$$ExternalSyntheticLambda0(transition.getTargetTypes())) ? false : true;
    }

    @Override // o.setTickMarkTintList
    public Object setY(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // o.setTickMarkTintList
    public void setX(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: o.setErrorEnabled.4
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
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
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // o.setTickMarkTintList
    public void setY(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // o.setTickMarkTintList
    public void setY(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: o.setErrorEnabled.5
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                Object obj5 = obj2;
                if (obj5 != null) {
                    setErrorEnabled.this.setY(obj5, arrayList, (ArrayList<View>) null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    setErrorEnabled.this.setY(obj6, arrayList2, (ArrayList<View>) null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    setErrorEnabled.this.setY(obj7, arrayList3, (ArrayList<View>) null);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }
        });
    }

    @Override // o.setTickMarkTintList
    public void setX(setDropDownBackgroundResource setdropdownbackgroundresource, Object obj, setRenderMode setrendermode, final Runnable runnable) {
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: o.setErrorEnabled.1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                runnable.run();
            }
        });
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            setY((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // o.setTickMarkTintList
    public void setY(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                setY((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!MenuHostHelper$$ExternalSyntheticLambda0(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // o.setTickMarkTintList
    public void setX(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // o.setTickMarkTintList
    public void setIconTintList(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() { // from class: o.setErrorEnabled.3
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    Rect rect2 = rect;
                    if (rect2 == null || rect2.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }
}