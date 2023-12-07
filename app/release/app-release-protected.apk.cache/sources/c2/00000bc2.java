package o;

import java.util.Set;
import o.C0286m;

/* loaded from: classes.dex */
public final class setFabCradleMargin implements setIconPadding {
    private final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setIconTintList;
    private final setShowMotionSpecResource setX;
    private final Set<attachInterface> setY;

    public setFabCradleMargin(Set<attachInterface> set, StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, setShowMotionSpecResource setshowmotionspecresource) {
        this.setY = set;
        this.setIconTintList = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
        this.setX = setshowmotionspecresource;
    }

    @Override // o.setIconPadding
    public final <T> setNestedScrollingEnabled<T> setY(String str, attachInterface attachinterface, setChecked<T, byte[]> setchecked) {
        if (!this.setY.contains(attachinterface)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", attachinterface, this.setY));
        }
        return new setNestedScrollingEnabled<T>(this.setIconTintList, str, attachinterface, setchecked, this.setX) { // from class: o.m.5
            private final setChecked<T, byte[]> MenuHostHelper$$ExternalSyntheticLambda0;
            private final String MenuHostHelper$$ExternalSyntheticLambda1;
            private final setShowMotionSpecResource setIconTintList;
            private final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 setX;
            private final attachInterface setY;

            {
                this.setX = r1;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
                this.setY = attachinterface;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setchecked;
                this.setIconTintList = r5;
            }

            @Override // o.setNestedScrollingEnabled
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setBottomEdgeEffectColor<T> setbottomedgeeffectcolor) {
                this.setIconTintList.setX(new m$6$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.setImageLevel$MenuHostHelper$$ExternalSyntheticLambda1
                    private String MenuHostHelper$$ExternalSyntheticLambda0;
                    private StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 MenuHostHelper$$ExternalSyntheticLambda1;
                    private attachInterface setIconTintList;
                    private setBottomEdgeEffectColor<?> setX;
                    private setChecked<?, byte[]> setY;

                    @Override // o.m$6$MenuHostHelper$$ExternalSyntheticLambda1
                    public final m$6$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1) {
                        if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 == null) {
                            throw new NullPointerException("Null transportContext");
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
                        return this;
                    }

                    @Override // o.m$6$MenuHostHelper$$ExternalSyntheticLambda1
                    public final m$6$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(String str2) {
                        if (str2 == null) {
                            throw new NullPointerException("Null transportName");
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = str2;
                        return this;
                    }

                    @Override // o.m$6$MenuHostHelper$$ExternalSyntheticLambda1
                    final m$6$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(setBottomEdgeEffectColor<?> setbottomedgeeffectcolor2) {
                        if (setbottomedgeeffectcolor2 == null) {
                            throw new NullPointerException("Null event");
                        }
                        this.setX = setbottomedgeeffectcolor2;
                        return this;
                    }

                    @Override // o.m$6$MenuHostHelper$$ExternalSyntheticLambda1
                    final m$6$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(setChecked<?, byte[]> setchecked2) {
                        if (setchecked2 == null) {
                            throw new NullPointerException("Null transformer");
                        }
                        this.setY = setchecked2;
                        return this;
                    }

                    @Override // o.m$6$MenuHostHelper$$ExternalSyntheticLambda1
                    final m$6$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(attachInterface attachinterface2) {
                        if (attachinterface2 == null) {
                            throw new NullPointerException("Null encoding");
                        }
                        this.setIconTintList = attachinterface2;
                        return this;
                    }

                    @Override // o.m$6$MenuHostHelper$$ExternalSyntheticLambda1
                    public final C0286m.AnonymousClass6 setIconTintList() {
                        String str2 = this.MenuHostHelper$$ExternalSyntheticLambda1 == null ? " transportContext" : "";
                        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str2);
                            sb.append(" transportName");
                            str2 = sb.toString();
                        }
                        if (this.setX == null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(" event");
                            str2 = sb2.toString();
                        }
                        if (this.setY == null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str2);
                            sb3.append(" transformer");
                            str2 = sb3.toString();
                        }
                        if (this.setIconTintList == null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str2);
                            sb4.append(" encoding");
                            str2 = sb4.toString();
                        }
                        if (!str2.isEmpty()) {
                            StringBuilder sb5 = new StringBuilder("Missing required properties:");
                            sb5.append(str2);
                            throw new IllegalStateException(sb5.toString());
                        }
                        return new setImageLevel(this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX, this.setY, this.setIconTintList, (byte) 0);
                    }
                }.setIconTintList(this.setX).setIconTintList((setBottomEdgeEffectColor<?>) setbottomedgeeffectcolor).MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1).MenuHostHelper$$ExternalSyntheticLambda0((setChecked<?, byte[]>) this.MenuHostHelper$$ExternalSyntheticLambda0).MenuHostHelper$$ExternalSyntheticLambda1(this.setY).setIconTintList(), new setCheckedIconTintResource() { // from class: o.m.7
                });
            }
        };
    }
}