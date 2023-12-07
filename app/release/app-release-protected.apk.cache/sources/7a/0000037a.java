package o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o.C0286m;
import o.ReflectedParcelable;
import o.setConverter;
import o.setDrawingCacheBackgroundColor;
import o.setStableInsets;
import o.setVerticalScrollbarPosition;

/* loaded from: classes.dex */
public final /* synthetic */ class clearCallingWorkSource implements Runnable {
    private /* synthetic */ Runnable MenuHostHelper$$ExternalSyntheticLambda1;
    private /* synthetic */ StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setIconTintList;
    private /* synthetic */ int setX;
    private /* synthetic */ setEditableFactory setY;

    public /* synthetic */ clearCallingWorkSource(setEditableFactory seteditablefactory, StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, int i, Runnable runnable) {
        this.setY = seteditablefactory;
        this.setIconTintList = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
        this.setX = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        setStableInsets y;
        final setEditableFactory seteditablefactory = this.setY;
        final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 = this.setIconTintList;
        final int i = this.setX;
        Runnable runnable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        try {
            try {
                setVerticalScrollbarPosition setverticalscrollbarposition = seteditablefactory.setNavigationOnClickListener;
                final setCloseIconSize setcloseiconsize = seteditablefactory.setIconTintList;
                Objects.requireNonNull(setcloseiconsize);
                setverticalscrollbarposition.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setClickable
                    @Override // o.setVerticalScrollbarPosition.setY
                    public final Object setX() {
                        return Integer.valueOf(setCloseIconSize.this.MenuHostHelper$$ExternalSyntheticLambda0());
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) seteditablefactory.setX.getSystemService("connectivity")).getActiveNetworkInfo();
                if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                    seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.getChangingConfigurations
                        @Override // o.setVerticalScrollbarPosition.setY
                        public final Object setX() {
                            setEditableFactory seteditablefactory2 = setEditableFactory.this;
                            seteditablefactory2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, i + 1);
                            return null;
                        }
                    });
                } else {
                    setCheckMarkTintMode x = seteditablefactory.MenuHostHelper$$ExternalSyntheticLambda0.setX(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setX());
                    final long j = 0;
                    new setChipStartPaddingResource(setStableInsets.setY.OK, 0L);
                    while (true) {
                        if (((Boolean) seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setIgnoreGravity
                            @Override // o.setVerticalScrollbarPosition.setY
                            public final Object setX() {
                                setEditableFactory seteditablefactory2 = setEditableFactory.this;
                                return Boolean.valueOf(seteditablefactory2.setIconTintList.setX(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1));
                            }
                        })).booleanValue()) {
                            final Iterable<setSelection> iterable = (Iterable) seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setKeyboardNavigationCluster
                                @Override // o.setVerticalScrollbarPosition.setY
                                public final Object setX() {
                                    setEditableFactory seteditablefactory2 = setEditableFactory.this;
                                    return seteditablefactory2.setIconTintList.setIconTintList(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1);
                                }
                            });
                            if (!iterable.iterator().hasNext()) {
                                break;
                            }
                            if (x == null) {
                                setTitleCollapseMode.setX("Uploader", "Unknown backend for %s, deleting event batch for it...", staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1);
                                y = new setChipStartPaddingResource(setStableInsets.setY.FATAL_ERROR, -1L);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (setSelection setselection : iterable) {
                                    arrayList.add(setselection.setIconTintList());
                                }
                                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY() != null) {
                                    setVerticalScrollbarPosition setverticalscrollbarposition2 = seteditablefactory.setNavigationOnClickListener;
                                    final setChipBackgroundColorResource setchipbackgroundcolorresource = seteditablefactory.MenuHostHelper$$ExternalSyntheticLambda1;
                                    Objects.requireNonNull(setchipbackgroundcolorresource);
                                    setConverter.setIconTintList seticontintlist = new setConverter.setIconTintList();
                                    seticontintlist.setX = new HashMap();
                                    arrayList.add(x.MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist.setX(seteditablefactory.setY.setY()).setY(seteditablefactory.setLayoutAnimation.setY()).setIconTintList("GDT_CLIENT_METRICS").setIconTintList(new setOnChildClickListener(new attachInterface("proto"), C0286m.AnonymousClass3.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0((setAccessibilityClassName) setverticalscrollbarposition2.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setAccessibilityDelegateCompat
                                        @Override // o.setVerticalScrollbarPosition.setY
                                        public final Object setX() {
                                            return setChipBackgroundColorResource.this.setX();
                                        }
                                    })))).MenuHostHelper$$ExternalSyntheticLambda1()));
                                }
                                y = x.setY(new setDrawingCacheBackgroundColor.setX().setX(arrayList).MenuHostHelper$$ExternalSyntheticLambda1(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY()).setIconTintList());
                            }
                            if (y.setY() == setStableInsets.setY.TRANSIENT_ERROR) {
                                seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setStateListAnimator
                                    @Override // o.setVerticalScrollbarPosition.setY
                                    public final Object setX() {
                                        setEditableFactory seteditablefactory2 = setEditableFactory.this;
                                        Iterable<setSelection> iterable2 = iterable;
                                        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$12 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
                                        long j2 = j;
                                        seteditablefactory2.setIconTintList.setY(iterable2);
                                        seteditablefactory2.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$12, seteditablefactory2.setY.setY() + j2);
                                        return null;
                                    }
                                });
                                seteditablefactory.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, i + 1, true);
                                break;
                            }
                            seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setStartIconDrawable
                                @Override // o.setVerticalScrollbarPosition.setY
                                public final Object setX() {
                                    setEditableFactory seteditablefactory2 = setEditableFactory.this;
                                    seteditablefactory2.setIconTintList.setX(iterable);
                                    return null;
                                }
                            });
                            if (y.setY() == setStableInsets.setY.OK) {
                                j = Math.max(j, y.setIconTintList());
                                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setY() != null) {
                                    seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.ViewPager2$SavedState$1
                                        @Override // o.setVerticalScrollbarPosition.setY
                                        public final Object setX() {
                                            setEditableFactory.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
                                            return null;
                                        }
                                    });
                                }
                            } else if (y.setY() == setStableInsets.setY.INVALID_PAYLOAD) {
                                final HashMap hashMap = new HashMap();
                                for (setSelection setselection2 : iterable) {
                                    String y2 = setselection2.setIconTintList().setY();
                                    if (!hashMap.containsKey(y2)) {
                                        hashMap.put(y2, 1);
                                    } else {
                                        hashMap.put(y2, Integer.valueOf(((Integer) hashMap.get(y2)).intValue() + 1));
                                    }
                                }
                                seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setAutoSizeTextTypeWithDefaults
                                    @Override // o.setVerticalScrollbarPosition.setY
                                    public final Object setX() {
                                        setEditableFactory seteditablefactory2 = setEditableFactory.this;
                                        for (Map.Entry entry : hashMap.entrySet()) {
                                            seteditablefactory2.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(((Integer) entry.getValue()).intValue(), ReflectedParcelable.setIconTintList.INVALID_PAYLOD, (String) entry.getKey());
                                        }
                                        return null;
                                    }
                                });
                            }
                        } else {
                            seteditablefactory.setNavigationOnClickListener.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setOverflowIcon
                                @Override // o.setVerticalScrollbarPosition.setY
                                public final Object setX() {
                                    setEditableFactory seteditablefactory2 = setEditableFactory.this;
                                    seteditablefactory2.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, seteditablefactory2.setY.setY() + j);
                                    return null;
                                }
                            });
                            break;
                        }
                    }
                }
            } catch (setIndicatorGap unused) {
                seteditablefactory.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}