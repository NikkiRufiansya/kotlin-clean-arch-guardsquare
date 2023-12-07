package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o.registerIn;

/* loaded from: classes.dex */
public final class setAdjustViewBounds extends registerIn {
    private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    private registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation;
    private ArrayList<registerIn$MenuHostHelper$$ExternalSyntheticLambda1> setOnLongClickListener;
    private notifyAll<setOnFlingListener, setY> setUiOptions;
    private boolean setUnboundedRipple;
    private final WeakReference<setTouchDelegate> setX;

    public setAdjustViewBounds(setTouchDelegate settouchdelegate) {
        this(settouchdelegate, (byte) 0);
    }

    private setAdjustViewBounds(setTouchDelegate settouchdelegate, byte b) {
        this.setUiOptions = new notifyAll<>();
        this.setIconTintList = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        this.setUnboundedRipple = false;
        this.setOnLongClickListener = new ArrayList<>();
        this.setX = new WeakReference<>(settouchdelegate);
        this.setLayoutAnimation = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        MenuHostHelper$$ExternalSyntheticLambda0("setCurrentState");
        MenuHostHelper$$ExternalSyntheticLambda1(registerin_menuhosthelper__externalsyntheticlambda1);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX setx) {
        MenuHostHelper$$ExternalSyntheticLambda0("handleLifecycleEvent");
        MenuHostHelper$$ExternalSyntheticLambda1(setx.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda12 = this.setLayoutAnimation;
        if (registerin_menuhosthelper__externalsyntheticlambda12 == registerin_menuhosthelper__externalsyntheticlambda1) {
            return;
        }
        if (registerin_menuhosthelper__externalsyntheticlambda12 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED && registerin_menuhosthelper__externalsyntheticlambda1 == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.setLayoutAnimation);
            throw new IllegalStateException(sb.toString());
        }
        this.setLayoutAnimation = registerin_menuhosthelper__externalsyntheticlambda1;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 || this.setIconTintList != 0) {
            this.setUnboundedRipple = true;
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setIconTintList();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        if (this.setLayoutAnimation == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED) {
            this.setUiOptions = new notifyAll<>();
        }
    }

    private boolean setX() {
        if (this.setUiOptions.setIconTintList == 0) {
            return true;
        }
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1 = this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0.getValue().setIconTintList;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda12 = this.setUiOptions.setY.getValue().setIconTintList;
        return registerin_menuhosthelper__externalsyntheticlambda1 == registerin_menuhosthelper__externalsyntheticlambda12 && this.setLayoutAnimation == registerin_menuhosthelper__externalsyntheticlambda12;
    }

    private registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(setOnFlingListener setonflinglistener) {
        notifyAll<setOnFlingListener, setY> notifyall = this.setUiOptions;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1 = null;
        setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<setOnFlingListener, setY> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = notifyall.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setonflinglistener) ? notifyall.MenuHostHelper$$ExternalSyntheticLambda1.get(setonflinglistener).setY : null;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda12 = setcounterenabled_menuhosthelper__externalsyntheticlambda0 != null ? setcounterenabled_menuhosthelper__externalsyntheticlambda0.getValue().setIconTintList : null;
        if (!this.setOnLongClickListener.isEmpty()) {
            ArrayList<registerIn$MenuHostHelper$$ExternalSyntheticLambda1> arrayList = this.setOnLongClickListener;
            registerin_menuhosthelper__externalsyntheticlambda1 = arrayList.get(arrayList.size() - 1);
        }
        return setX(setX(this.setLayoutAnimation, registerin_menuhosthelper__externalsyntheticlambda12), registerin_menuhosthelper__externalsyntheticlambda1);
    }

    @Override // o.registerIn
    public final void setY(setOnFlingListener setonflinglistener) {
        setTouchDelegate settouchdelegate;
        MenuHostHelper$$ExternalSyntheticLambda0("addObserver");
        setY sety = new setY(setonflinglistener, this.setLayoutAnimation == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED ? registerIn$MenuHostHelper$$ExternalSyntheticLambda1.DESTROYED : registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED);
        if (this.setUiOptions.setX(setonflinglistener, sety) == null && (settouchdelegate = this.setX.get()) != null) {
            boolean z = this.setIconTintList != 0 || this.MenuHostHelper$$ExternalSyntheticLambda1;
            registerIn$MenuHostHelper$$ExternalSyntheticLambda1 iconTintList = setIconTintList(setonflinglistener);
            this.setIconTintList++;
            while (sety.setIconTintList.compareTo(iconTintList) < 0 && this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(setonflinglistener)) {
                setIconTintList(sety.setIconTintList);
                registerIn.setX y = registerIn.setX.setY(sety.setIconTintList);
                if (y == null) {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(sety.setIconTintList);
                    throw new IllegalStateException(sb.toString());
                }
                sety.setIconTintList(settouchdelegate, y);
                setY();
                iconTintList = setIconTintList(setonflinglistener);
            }
            if (!z) {
                setIconTintList();
            }
            this.setIconTintList--;
        }
    }

    private void setY() {
        ArrayList<registerIn$MenuHostHelper$$ExternalSyntheticLambda1> arrayList = this.setOnLongClickListener;
        arrayList.remove(arrayList.size() - 1);
    }

    private void setIconTintList(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
        this.setOnLongClickListener.add(registerin_menuhosthelper__externalsyntheticlambda1);
    }

    @Override // o.registerIn
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setOnFlingListener setonflinglistener) {
        MenuHostHelper$$ExternalSyntheticLambda0("removeObserver");
        this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(setonflinglistener);
    }

    @Override // o.registerIn
    public final registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setLayoutAnimation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x000e, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setX(o.setTouchDelegate r6) {
        /*
            r5 = this;
            o.notifyAll<o.setOnFlingListener, o.setAdjustViewBounds$setY> r0 = r5.setUiOptions
            o.setCounterEnabled$setY r1 = new o.setCounterEnabled$setY
            r1.<init>()
            java.util.WeakHashMap<o.setCounterEnabled$setUnboundedRipple<K, V>, java.lang.Boolean> r0 = r0.setX
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
        Le:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6c
            boolean r0 = r5.setUnboundedRipple
            if (r0 != 0) goto L6c
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            o.setAdjustViewBounds$setY r2 = (o.setAdjustViewBounds.setY) r2
        L24:
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r2.setIconTintList
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r5.setLayoutAnimation
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto Le
            boolean r3 = r5.setUnboundedRipple
            if (r3 != 0) goto Le
            o.notifyAll<o.setOnFlingListener, o.setAdjustViewBounds$setY> r3 = r5.setUiOptions
            java.lang.Object r4 = r0.getKey()
            o.setOnFlingListener r4 = (o.setOnFlingListener) r4
            java.util.HashMap<K, o.setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V>> r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto Le
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r2.setIconTintList
            r5.setIconTintList(r3)
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r2.setIconTintList
            o.registerIn$setX r3 = o.registerIn.setX.setY(r3)
            if (r3 == 0) goto L56
            r2.setIconTintList(r6, r3)
            r5.setY()
            goto L24
        L56:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "no event up from "
            r6.<init>(r0)
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r2.setIconTintList
            r6.append(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAdjustViewBounds.setX(o.setTouchDelegate):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0012, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setY(o.setTouchDelegate r6) {
        /*
            r5 = this;
            o.notifyAll<o.setOnFlingListener, o.setAdjustViewBounds$setY> r0 = r5.setUiOptions
            o.setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda1 r1 = new o.setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda1
            o.setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> r2 = r0.setY
            o.setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V> r3 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            java.util.WeakHashMap<o.setCounterEnabled$setUnboundedRipple<K, V>, java.lang.Boolean> r0 = r0.setX
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L72
            boolean r0 = r5.setUnboundedRipple
            if (r0 != 0) goto L72
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getValue()
            o.setAdjustViewBounds$setY r2 = (o.setAdjustViewBounds.setY) r2
        L28:
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r2.setIconTintList
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r5.setLayoutAnimation
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L12
            boolean r3 = r5.setUnboundedRipple
            if (r3 != 0) goto L12
            o.notifyAll<o.setOnFlingListener, o.setAdjustViewBounds$setY> r3 = r5.setUiOptions
            java.lang.Object r4 = r0.getKey()
            o.setOnFlingListener r4 = (o.setOnFlingListener) r4
            java.util.HashMap<K, o.setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<K, V>> r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L12
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r2.setIconTintList
            o.registerIn$setX r3 = o.registerIn.setX.setIconTintList(r3)
            if (r3 == 0) goto L5c
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r3.MenuHostHelper$$ExternalSyntheticLambda1()
            r5.setIconTintList(r4)
            r2.setIconTintList(r6, r3)
            r5.setY()
            goto L28
        L5c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "no event down from "
            r6.<init>(r0)
            o.registerIn$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r2.setIconTintList
            r6.append(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAdjustViewBounds.setY(o.setTouchDelegate):void");
    }

    private void setIconTintList() {
        setTouchDelegate settouchdelegate = this.setX.get();
        if (settouchdelegate == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (!setX()) {
            this.setUnboundedRipple = false;
            if (this.setLayoutAnimation.compareTo(this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0.getValue().setIconTintList) < 0) {
                setY(settouchdelegate);
            }
            setCounterEnabled$MenuHostHelper$$ExternalSyntheticLambda0<setOnFlingListener, setY> setcounterenabled_menuhosthelper__externalsyntheticlambda0 = this.setUiOptions.setY;
            if (!this.setUnboundedRipple && setcounterenabled_menuhosthelper__externalsyntheticlambda0 != null && this.setLayoutAnimation.compareTo(setcounterenabled_menuhosthelper__externalsyntheticlambda0.getValue().setIconTintList) > 0) {
                setX(settouchdelegate);
            }
        }
        this.setUnboundedRipple = false;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0 || setMenuCallbacks.setY().setIconTintList()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString());
    }

    static registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setX(registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda12) {
        return (registerin_menuhosthelper__externalsyntheticlambda12 == null || registerin_menuhosthelper__externalsyntheticlambda12.compareTo(registerin_menuhosthelper__externalsyntheticlambda1) >= 0) ? registerin_menuhosthelper__externalsyntheticlambda1 : registerin_menuhosthelper__externalsyntheticlambda12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList;
        private setCheckable setX;

        setY(setOnFlingListener setonflinglistener, registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1) {
            this.setX = setApplyingOpacityToLayersEnabled.setX(setonflinglistener);
            this.setIconTintList = registerin_menuhosthelper__externalsyntheticlambda1;
        }

        final void setIconTintList(setTouchDelegate settouchdelegate, registerIn.setX setx) {
            registerIn$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = setx.MenuHostHelper$$ExternalSyntheticLambda1();
            this.setIconTintList = setAdjustViewBounds.setX(this.setIconTintList, MenuHostHelper$$ExternalSyntheticLambda1);
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(settouchdelegate, setx);
            this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }
}