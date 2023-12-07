package o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.setEdgeEffectColor;
import o.setRenderMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class setEdgeEffectColor {
    private final ViewGroup setY;
    final ArrayList<setY> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
    final ArrayList<setY> setX = new ArrayList<>();
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    boolean setIconTintList = false;

    abstract void setX(List<setY> list, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setEdgeEffectColor setY(ViewGroup viewGroup, EmojiCompatInitializer emojiCompatInitializer) {
        Object tag = viewGroup.getTag(R.id.res_0x7f0a01c1);
        if (tag instanceof setEdgeEffectColor) {
            return (setEdgeEffectColor) tag;
        }
        setEdgeEffectColor iconTintList = emojiCompatInitializer.setIconTintList(viewGroup);
        viewGroup.setTag(R.id.res_0x7f0a01c1, iconTintList);
        return iconTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEdgeEffectColor(ViewGroup viewGroup) {
        this.setY = viewGroup;
    }

    public final ViewGroup MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    private setY setX(setDropDownBackgroundResource setdropdownbackgroundresource) {
        Iterator<setY> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (it.hasNext()) {
            setY next = it.next();
            if (next.MenuHostHelper$$ExternalSyntheticLambda1.equals(setdropdownbackgroundresource) && !next.setX) {
                return next;
            }
        }
        return null;
    }

    private setY setY(setDropDownBackgroundResource setdropdownbackgroundresource) {
        Iterator<setY> it = this.setX.iterator();
        while (it.hasNext()) {
            setY next = it.next();
            if (next.MenuHostHelper$$ExternalSyntheticLambda1.equals(setdropdownbackgroundresource) && !next.setX) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, setOverscrollHeader setoverscrollheader) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(setoverscrollheader.setIconTintList);
            Log.v("FragmentManager", sb.toString());
        }
        setIconTintList(setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, setY.setIconTintList.ADDING, setoverscrollheader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setOverscrollHeader setoverscrollheader) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(setoverscrollheader.setIconTintList);
            Log.v("FragmentManager", sb.toString());
        }
        setIconTintList(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE, setY.setIconTintList.NONE, setoverscrollheader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(setOverscrollHeader setoverscrollheader) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(setoverscrollheader.setIconTintList);
            Log.v("FragmentManager", sb.toString());
        }
        setIconTintList(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.GONE, setY.setIconTintList.NONE, setoverscrollheader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setOverscrollHeader setoverscrollheader) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(setoverscrollheader.setIconTintList);
            Log.v("FragmentManager", sb.toString());
        }
        setIconTintList(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED, setY.setIconTintList.REMOVING, setoverscrollheader);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o.setEdgeEffectColor$setY, o.setEdgeEffectColor$MenuHostHelper$$ExternalSyntheticLambda1, java.lang.Object] */
    private void setIconTintList(final setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, final setY.setIconTintList seticontintlist, final setOverscrollHeader setoverscrollheader) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            final setRenderMode setrendermode = new setRenderMode();
            setY x = setX(setoverscrollheader.setIconTintList);
            if (x != null) {
                x.setY(setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, seticontintlist);
                return;
            }
            final ?? r2 = new setY(setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, seticontintlist, setoverscrollheader, setrendermode) { // from class: o.setEdgeEffectColor$MenuHostHelper$$ExternalSyntheticLambda1
                private final setOverscrollHeader setUiOptions;

                @Override // o.setEdgeEffectColor.setY
                public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                    super.MenuHostHelper$$ExternalSyntheticLambda0();
                    this.setUiOptions.setNavigationOnClickListener();
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
                    this.setUiOptions = setoverscrollheader;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // o.setEdgeEffectColor.setY
                public final void setY() {
                    boolean isLoggable;
                    if (this.setNavigationOnClickListener == setEdgeEffectColor.setY.setIconTintList.ADDING) {
                        setDropDownBackgroundResource setdropdownbackgroundresource = this.setUiOptions.setIconTintList;
                        View findFocus = setdropdownbackgroundresource.setImageTintMode.findFocus();
                        if (findFocus != null) {
                            setdropdownbackgroundresource.setIconTintList(findFocus);
                            isLoggable = Log.isLoggable("FragmentManager", 2);
                            if (isLoggable) {
                                StringBuilder sb = new StringBuilder("requestFocus: Saved focused view ");
                                sb.append(findFocus);
                                sb.append(" for Fragment ");
                                sb.append(setdropdownbackgroundresource);
                                Log.v("FragmentManager", sb.toString());
                            }
                        }
                        View errorIconTintList = this.MenuHostHelper$$ExternalSyntheticLambda1.setErrorIconTintList();
                        if (errorIconTintList.getParent() == null) {
                            setOverscrollHeader setoverscrollheader2 = this.setUiOptions;
                            setoverscrollheader2.setIconTintList.setUnboundedRipple.addView(setoverscrollheader2.setIconTintList.setImageTintMode, setoverscrollheader2.MenuHostHelper$$ExternalSyntheticLambda0.setY(setoverscrollheader2.setIconTintList));
                            errorIconTintList.setAlpha(0.0f);
                        }
                        if (errorIconTintList.getAlpha() == 0.0f && errorIconTintList.getVisibility() == 0) {
                            errorIconTintList.setVisibility(4);
                        }
                        errorIconTintList.setAlpha(setdropdownbackgroundresource.setAdapter());
                    }
                }
            };
            this.MenuHostHelper$$ExternalSyntheticLambda0.add(r2);
            r2.setY.add(new Runnable() { // from class: o.setEdgeEffectColor.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (setEdgeEffectColor.this.MenuHostHelper$$ExternalSyntheticLambda0.contains(r2)) {
                        r2.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(r2.MenuHostHelper$$ExternalSyntheticLambda1.setImageTintMode);
                    }
                }
            });
            r2.setY.add(new Runnable() { // from class: o.setEdgeEffectColor.5
                @Override // java.lang.Runnable
                public final void run() {
                    setEdgeEffectColor.this.MenuHostHelper$$ExternalSyntheticLambda0.remove(r2);
                    setEdgeEffectColor.this.setX.remove(r2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        r6.setIconTintList = r2.MenuHostHelper$$ExternalSyntheticLambda1.getCallingPid();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setX() {
        /*
            r6 = this;
            java.util.ArrayList<o.setEdgeEffectColor$setY> r0 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            monitor-enter(r0)
            r6.setIconTintList()     // Catch: java.lang.Throwable -> L3b
            r1 = 0
            r6.setIconTintList = r1     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList<o.setEdgeEffectColor$setY> r1 = r6.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L3b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L3b
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L39
            java.util.ArrayList<o.setEdgeEffectColor$setY> r2 = r6.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L3b
            o.setEdgeEffectColor$setY r2 = (o.setEdgeEffectColor.setY) r2     // Catch: java.lang.Throwable -> L3b
            o.setDropDownBackgroundResource r3 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L3b
            android.view.View r3 = r3.setImageTintMode     // Catch: java.lang.Throwable -> L3b
            o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 r3 = o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(r3)     // Catch: java.lang.Throwable -> L3b
            o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 r4 = r2.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L3b
            o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 r5 = o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE     // Catch: java.lang.Throwable -> L3b
            if (r4 != r5) goto L36
            o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 r4 = o.setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE     // Catch: java.lang.Throwable -> L3b
            if (r3 == r4) goto L36
            o.setDropDownBackgroundResource r1 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.getCallingPid()     // Catch: java.lang.Throwable -> L3b
            r6.setIconTintList = r1     // Catch: java.lang.Throwable -> L3b
            goto L39
        L36:
            int r1 = r1 + (-1)
            goto L11
        L39:
            monitor-exit(r0)
            return
        L3b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEdgeEffectColor.setX():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        boolean isLoggable;
        if (this.setIconTintList) {
            return;
        }
        if (!setBaselineAlignBottom.setChipIconTintResource(this.setY)) {
            setY();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            return;
        }
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.setX);
                this.setX.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    setY sety = (setY) it.next();
                    isLoggable = Log.isLoggable("FragmentManager", 2);
                    if (isLoggable) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: Cancelling operation ");
                        sb.append(sety);
                        Log.v("FragmentManager", sb.toString());
                    }
                    sety.setX();
                    if (!sety.setIconTintList) {
                        this.setX.add(sety);
                    }
                }
                setIconTintList();
                ArrayList arrayList2 = new ArrayList(this.MenuHostHelper$$ExternalSyntheticLambda0);
                this.MenuHostHelper$$ExternalSyntheticLambda0.clear();
                this.setX.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((setY) it2.next()).setY();
                }
                setX(arrayList2, this.MenuHostHelper$$ExternalSyntheticLambda1);
                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        boolean isLoggable;
        String obj;
        boolean isLoggable2;
        String obj2;
        boolean chipIconTintResource = setBaselineAlignBottom.setChipIconTintResource(this.setY);
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setIconTintList();
            Iterator<setY> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it.hasNext()) {
                it.next().setY();
            }
            Iterator it2 = new ArrayList(this.setX).iterator();
            while (it2.hasNext()) {
                setY sety = (setY) it2.next();
                isLoggable2 = Log.isLoggable("FragmentManager", 2);
                if (isLoggable2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (chipIconTintResource) {
                        obj2 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.setY);
                        sb2.append(" is not attached to window. ");
                        obj2 = sb2.toString();
                    }
                    sb.append(obj2);
                    sb.append("Cancelling running operation ");
                    sb.append(sety);
                    Log.v("FragmentManager", sb.toString());
                }
                sety.setX();
            }
            Iterator it3 = new ArrayList(this.MenuHostHelper$$ExternalSyntheticLambda0).iterator();
            while (it3.hasNext()) {
                setY sety2 = (setY) it3.next();
                isLoggable = Log.isLoggable("FragmentManager", 2);
                if (isLoggable) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (chipIconTintResource) {
                        obj = "";
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.setY);
                        sb4.append(" is not attached to window. ");
                        obj = sb4.toString();
                    }
                    sb3.append(obj);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(sety2);
                    Log.v("FragmentManager", sb3.toString());
                }
                sety2.setX();
            }
        }
    }

    private void setIconTintList() {
        Iterator<setY> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (it.hasNext()) {
            setY next = it.next();
            if (next.setNavigationOnClickListener == setY.setIconTintList.ADDING) {
                next.setY(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(next.MenuHostHelper$$ExternalSyntheticLambda1.setErrorIconTintList().getVisibility()), setY.setIconTintList.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0;
        final setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1;
        setIconTintList setNavigationOnClickListener;
        private static byte[] setUnboundedRipple = {112, 117, 112, -122, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
        public static final int setOnLongClickListener = 27;
        final List<Runnable> setY = new ArrayList();
        final HashSet<setRenderMode> setLayoutAnimation = new HashSet<>();
        boolean setX = false;
        boolean setIconTintList = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public enum setIconTintList {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.setEdgeEffectColor.setY.setUnboundedRipple
                int r8 = 106 - r8
                int r6 = r6 * 2
                int r6 = 16 - r6
                int r7 = r7 * 15
                int r7 = 18 - r7
                byte[] r1 = new byte[r6]
                int r6 = r6 + (-1)
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r8
                r3 = 0
                r8 = r7
                r7 = r6
                goto L30
            L18:
                r3 = 0
            L19:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L30:
                int r6 = r6 + r4
                int r6 = r6 + 2
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setEdgeEffectColor.setY.a(int, short, int, java.lang.Object[]):void");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void setY() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setY(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, setIconTintList seticontintlist, setDropDownBackgroundResource setdropdownbackgroundresource, setRenderMode setrendermode) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1;
            this.setNavigationOnClickListener = seticontintlist;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setdropdownbackgroundresource;
            setrendermode.setX(new setRenderMode.setY() { // from class: o.setEdgeEffectColor.setY.5
                @Override // o.setRenderMode.setY
                public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                    setY.this.setX();
                }
            });
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Operation {");
            try {
                Object[] objArr = {this};
                byte b = (byte) (setUnboundedRipple[5] + 1);
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b3 = (byte) (-setUnboundedRipple[5]);
                Object[] objArr3 = new Object[1];
                a((byte) (setUnboundedRipple[5] + 1), b3, b3, objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append("} {mFinalState = ");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                sb.append("} {mLifecycleImpact = ");
                sb.append(this.setNavigationOnClickListener);
                sb.append("} {mFragment = ");
                sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                sb.append("}");
                return sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        final void setY(setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1 setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1, setIconTintList seticontintlist) {
            boolean isLoggable;
            boolean isLoggable2;
            boolean isLoggable3;
            int i = AnonymousClass4.setY[seticontintlist.ordinal()];
            if (i == 1) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED) {
                    isLoggable = Log.isLoggable("FragmentManager", 2);
                    if (isLoggable) {
                        StringBuilder sb = new StringBuilder("SpecialEffectsController: For fragment ");
                        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                        sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        sb.append(this.setNavigationOnClickListener);
                        sb.append(" to ADDING.");
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE;
                    this.setNavigationOnClickListener = setIconTintList.ADDING;
                }
            } else if (i == 2) {
                isLoggable2 = Log.isLoggable("FragmentManager", 2);
                if (isLoggable2) {
                    StringBuilder sb2 = new StringBuilder("SpecialEffectsController: For fragment ");
                    sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb2.append(" mFinalState = ");
                    sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                    sb2.append(this.setNavigationOnClickListener);
                    sb2.append(" to REMOVING.");
                    Log.v("FragmentManager", sb2.toString());
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED;
                this.setNavigationOnClickListener = setIconTintList.REMOVING;
            } else if (i != 3 || this.MenuHostHelper$$ExternalSyntheticLambda0 == setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED) {
            } else {
                isLoggable3 = Log.isLoggable("FragmentManager", 2);
                if (isLoggable3) {
                    StringBuilder sb3 = new StringBuilder("SpecialEffectsController: For fragment ");
                    sb3.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
                    sb3.append(" mFinalState = ");
                    sb3.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    sb3.append(" -> ");
                    sb3.append(setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1);
                    sb3.append(". ");
                    Log.v("FragmentManager", sb3.toString());
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setedgeeffectcolor_sety_menuhosthelper__externalsyntheticlambda1;
            }
        }

        public void MenuHostHelper$$ExternalSyntheticLambda0() {
            boolean isLoggable;
            if (this.setIconTintList) {
                return;
            }
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.setIconTintList = true;
            for (Runnable runnable : this.setY) {
                runnable.run();
            }
        }

        final void setX() {
            if (this.setX) {
                return;
            }
            this.setX = true;
            if (this.setLayoutAnimation.isEmpty()) {
                MenuHostHelper$$ExternalSyntheticLambda0();
                return;
            }
            Iterator it = new ArrayList(this.setLayoutAnimation).iterator();
            while (it.hasNext()) {
                ((setRenderMode) it.next()).MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setEdgeEffectColor$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;
        static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setY.setIconTintList.values().length];
            setY = iArr;
            try {
                iArr[setY.setIconTintList.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setY[setY.setIconTintList.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setY[setY.setIconTintList.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr2;
            try {
                iArr2[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[setEdgeEffectColor$setY$MenuHostHelper$$ExternalSyntheticLambda1.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setEdgeEffectColor setY(ViewGroup viewGroup, ParcelImpl parcelImpl) {
        EmojiCompatInitializer emojiCompatInitializer;
        EmojiCompatInitializer emojiCompatInitializer2 = parcelImpl.setLayoutDirection;
        setDropDownBackgroundResource setdropdownbackgroundresource = parcelImpl.setGuidelinePercent;
        if (setdropdownbackgroundresource != null) {
            ParcelImpl parcelImpl2 = setdropdownbackgroundresource.ViewPager$SavedState$1;
            while (true) {
                EmojiCompatInitializer emojiCompatInitializer3 = parcelImpl2.setLayoutDirection;
                setDropDownBackgroundResource setdropdownbackgroundresource2 = parcelImpl2.setGuidelinePercent;
                if (setdropdownbackgroundresource2 == null) {
                    break;
                }
                parcelImpl2 = setdropdownbackgroundresource2.ViewPager$SavedState$1;
            }
            emojiCompatInitializer = parcelImpl2.setLayoutAnimation;
        } else {
            emojiCompatInitializer = parcelImpl.setLayoutAnimation;
        }
        return setY(viewGroup, emojiCompatInitializer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setY.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(setOverscrollHeader setoverscrollheader) {
        setY x = setX(setoverscrollheader.setIconTintList);
        setY.setIconTintList seticontintlist = x != null ? x.setNavigationOnClickListener : null;
        setY y = setY(setoverscrollheader.setIconTintList);
        return (y == null || !(seticontintlist == null || seticontintlist == setY.setIconTintList.NONE)) ? seticontintlist : y.setNavigationOnClickListener;
    }
}