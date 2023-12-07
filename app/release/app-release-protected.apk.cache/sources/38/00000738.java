package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: o.mp */
/* loaded from: classes.dex */
public final class C0301mp extends setDropDownBackgroundResource {
    private C0265le setTitleMarginEnd;

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0035, viewGroup, false);
        int i = R.id.res_0x7f0a00a1;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
        if (textView != null) {
            C0322nj c0322nj = (C0322nj) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00f9);
            if (c0322nj != null) {
                FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0113);
                if (fabTransformationSheetBehavior != null) {
                    TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                    if (textView2 != null) {
                        setContentHeight setcontentheight = (setContentHeight) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0214);
                        if (setcontentheight != null) {
                            C0265le c0265le = new C0265le((setMIndicatorOptions) inflate, textView, c0322nj, fabTransformationSheetBehavior, textView2, setcontentheight);
                            this.setTitleMarginEnd = c0265le;
                            pN.setX(c0265le);
                            ArrayList MenuHostHelper$$ExternalSyntheticLambda1 = C0348oi.MenuHostHelper$$ExternalSyntheticLambda1("https://static.toiimg.com/photo/84475061.cms", "https://cdn.vox-cdn.com/thumbor/YqtFL7c39ikKKr8P2zNXhxuD7QE=/0x0:3888x2592/1200x800/filters:focal(1633x985:2255x1607)/cdn.vox-cdn.com/uploads/chorus_image/image/66646657/shutterstock_302433650.0.jpg", "https://wamu.org/wp-content/uploads/2020/06/200601_DCProtest_Turner_26-1500x1000.jpg");
                            lN lNVar = new lN(MenuHostHelper$$ExternalSyntheticLambda1);
                            C0322nj c0322nj2 = c0265le.MenuHostHelper$$ExternalSyntheticLambda0;
                            c0322nj2.setNormalSlideWidth(30.0f);
                            c0322nj2.setCheckedSlideWidth(70.0f);
                            c0322nj2.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = 30.0f;
                            c0322nj2.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation = 4;
                            c0322nj2.MenuHostHelper$$ExternalSyntheticLambda1.setY = 4;
                            setContentHeight setcontentheight2 = c0265le.setIconTintList;
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setcontentheight2, "");
                            c0322nj2.setupWithViewPager(setcontentheight2);
                            c0322nj2.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1.size();
                            c0322nj2.setX();
                            c0265le.setIconTintList.setAdapter(lNVar);
                            c0265le.setIconTintList.setOffscreenPageLimit(1);
                            setContentHeight setcontentheight3 = c0265le.setIconTintList;
                            Context context = c0265le.setX.getContext();
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
                            setcontentheight3.setPageTransformer(new C0307mv(context));
                            Context context2 = c0265le.setX.getContext();
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context2, "");
                            C0310my c0310my = new C0310my(context2);
                            c0265le.setIconTintList.setLayoutAnimation.setIconTintList(c0310my);
                            C0265le c0265le2 = this.setTitleMarginEnd;
                            pN.setX(c0265le2);
                            c0265le2.MenuHostHelper$$ExternalSyntheticLambda1.setOnClickListener(new View.OnClickListener() { // from class: o.mr
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C0301mp.MenuHostHelper$$ExternalSyntheticLambda0(C0301mp.this);
                                }
                            });
                            C0265le c0265le3 = this.setTitleMarginEnd;
                            pN.setX(c0265le3);
                            setMIndicatorOptions setmindicatoroptions = c0265le3.setX;
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
                            return setmindicatoroptions;
                        }
                        i = R.id.res_0x7f0a0214;
                    } else {
                        i = R.id.res_0x7f0a01fc;
                    }
                } else {
                    i = R.id.res_0x7f0a0113;
                }
            } else {
                i = R.id.res_0x7f0a00f9;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0301mp c0301mp) {
        pN.setY(c0301mp, "");
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(c0301mp.FragmentStateAdapter$5());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a00d7, new C0306mu(), null, 2);
        if (!setbackgroundtintlist.setX) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setbackgroundtintlist.setTextAlignment = "welcome";
        setbackgroundtintlist.setX();
    }
}