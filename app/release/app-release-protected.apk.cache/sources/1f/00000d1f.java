package o;

import android.content.Context;
import java.util.HashMap;
import o.C0286m;
import o.setConverter;
import o.setVerticalScrollbarPosition;

@nH
/* loaded from: classes.dex */
public class setLengthCounter implements setShowMotionSpecResource {
    public static volatile setStackedBackground MenuHostHelper$$ExternalSyntheticLambda0;
    private final setSearchableInfo MenuHostHelper$$ExternalSyntheticLambda1;
    private final SavedStateHandleController setIconTintList;
    public final setEditableFactory setX;
    private final setSearchableInfo setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    @nE
    public setLengthCounter(setSearchableInfo setsearchableinfo, setSearchableInfo setsearchableinfo2, SavedStateHandleController savedStateHandleController, setEditableFactory seteditablefactory, final setBackgroundTintBlendMode setbackgroundtintblendmode) {
        this.setY = setsearchableinfo;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setsearchableinfo2;
        this.setIconTintList = savedStateHandleController;
        this.setX = seteditablefactory;
        setbackgroundtintblendmode.setY.execute(new Runnable() { // from class: o.setToggleCheckedStateOnClick
            @Override // java.lang.Runnable
            public final void run() {
                final setBackgroundTintBlendMode setbackgroundtintblendmode2 = setBackgroundTintBlendMode.this;
                setbackgroundtintblendmode2.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.readResolve
                    @Override // o.setVerticalScrollbarPosition.setY
                    public final Object setX() {
                        setBackgroundTintBlendMode setbackgroundtintblendmode3 = setBackgroundTintBlendMode.this;
                        for (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 : setbackgroundtintblendmode3.setX.setY()) {
                            setbackgroundtintblendmode3.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static void setY(Context context) {
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            synchronized (setLengthCounter.class) {
                if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = new C0286m.AnonymousClass1.setY((byte) 0).setY(context).setX();
                }
            }
        }
    }

    @Override // o.setShowMotionSpecResource
    public final void setX(C0286m.AnonymousClass6 anonymousClass6, setCheckedIconTintResource setcheckedicontintresource) {
        SavedStateHandleController savedStateHandleController = this.setIconTintList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 MenuHostHelper$$ExternalSyntheticLambda02 = anonymousClass6.MenuHostHelper$$ExternalSyntheticLambda0();
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 y = StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1.setIconTintList().setIconTintList(MenuHostHelper$$ExternalSyntheticLambda02.setX()).MenuHostHelper$$ExternalSyntheticLambda1(anonymousClass6.setX().setY()).MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda02.setY()).setY();
        setConverter.setIconTintList seticontintlist = new setConverter.setIconTintList();
        seticontintlist.setX = new HashMap();
        savedStateHandleController.MenuHostHelper$$ExternalSyntheticLambda0(y, seticontintlist.setX(this.setY.setY()).setY(this.MenuHostHelper$$ExternalSyntheticLambda1.setY()).setIconTintList(anonymousClass6.setY()).setIconTintList(new setOnChildClickListener(anonymousClass6.setIconTintList(), anonymousClass6.MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList(anonymousClass6.setX().MenuHostHelper$$ExternalSyntheticLambda0()))).setX(anonymousClass6.setX().setX()).MenuHostHelper$$ExternalSyntheticLambda1(), setcheckedicontintresource);
    }
}