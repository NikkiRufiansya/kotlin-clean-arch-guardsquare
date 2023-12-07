package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class setStatusBarScrim$MenuHostHelper$$ExternalSyntheticLambda1 extends setStatusBarScrim {
    private static final Class<?> setY = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private setStatusBarScrim$MenuHostHelper$$ExternalSyntheticLambda1() {
        super((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setStatusBarScrim$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setStatusBarScrim
    public final <L> List<L> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j) {
        return MenuHostHelper$$ExternalSyntheticLambda0(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setStatusBarScrim
    public final void setIconTintList(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) WindowInsetsCompat$Impl20.setUnboundedRipple(obj, j);
        if (list instanceof ExecutorsRegistrar) {
            unmodifiableList = ((ExecutorsRegistrar) list).MenuHostHelper$$ExternalSyntheticLambda0();
        } else if (setY.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof setAutofillId) && (list instanceof setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1)) {
                setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setviewcacheextension_menuhosthelper__externalsyntheticlambda1 = (setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) list;
                if (setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setY()) {
                    setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setX();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, unmodifiableList);
    }

    private static <L> List<L> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, long j, int i) {
        AbstractList setitemtextcolor;
        List<L> arrayList;
        List<L> list = (List) WindowInsetsCompat$Impl20.setUnboundedRipple(obj, j);
        if (list.isEmpty()) {
            if (list instanceof ExecutorsRegistrar) {
                arrayList = new setItemTextColor(i);
            } else if ((list instanceof setAutofillId) && (list instanceof setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1)) {
                arrayList = ((setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) list).setX(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, arrayList);
            return arrayList;
        }
        if (setY.isAssignableFrom(list.getClass())) {
            setitemtextcolor = new ArrayList(list.size() + i);
            setitemtextcolor.addAll(list);
            WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, setitemtextcolor);
        } else if (list instanceof setExpandedComponentIdHint) {
            setitemtextcolor = new setItemTextColor(list.size() + i);
            setitemtextcolor.addAll((setExpandedComponentIdHint) list);
            WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, setitemtextcolor);
        } else if ((list instanceof setAutofillId) && (list instanceof setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1)) {
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setviewcacheextension_menuhosthelper__externalsyntheticlambda1 = (setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1) list;
            if (setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setY()) {
                return list;
            }
            setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 x = setviewcacheextension_menuhosthelper__externalsyntheticlambda1.setX(list.size() + i);
            WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, x);
            return x;
        } else {
            return list;
        }
        return setitemtextcolor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setStatusBarScrim
    public final <E> void MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Object obj2, long j) {
        List list = (List) WindowInsetsCompat$Impl20.setUnboundedRipple(obj2, j);
        List MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(obj, j, list.size());
        int size = MenuHostHelper$$ExternalSyntheticLambda0.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            MenuHostHelper$$ExternalSyntheticLambda0.addAll(list);
        }
        if (size > 0) {
            list = MenuHostHelper$$ExternalSyntheticLambda0;
        }
        WindowInsetsCompat$Impl20.setUiOptions.setIconTintList.putObject(obj, j, list);
    }
}