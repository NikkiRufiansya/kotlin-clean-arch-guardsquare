package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: o.mu */
/* loaded from: classes.dex */
public final class C0306mu extends setDropDownBackgroundResource {
    private C0267lg setError;

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d003a, viewGroup, false);
        int i = R.id.res_0x7f0a00a1;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
        if (textView != null) {
            ImageView imageView = (ImageView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00f5);
            if (imageView != null) {
                FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0113);
                if (fabTransformationSheetBehavior != null) {
                    TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                    if (textView2 != null) {
                        C0267lg c0267lg = new C0267lg((setMIndicatorOptions) inflate, textView, imageView, fabTransformationSheetBehavior, textView2);
                        this.setError = c0267lg;
                        pN.setX(c0267lg);
                        c0267lg.setY.setOnClickListener(new View.OnClickListener() { // from class: o.mw
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C0306mu.MenuHostHelper$$ExternalSyntheticLambda0(C0306mu.this);
                            }
                        });
                        C0267lg c0267lg2 = this.setError;
                        pN.setX(c0267lg2);
                        setMIndicatorOptions setmindicatoroptions = c0267lg2.MenuHostHelper$$ExternalSyntheticLambda1;
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
                        return setmindicatoroptions;
                    }
                    i = R.id.res_0x7f0a01fc;
                } else {
                    i = R.id.res_0x7f0a0113;
                }
            } else {
                i = R.id.res_0x7f0a00f5;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0306mu c0306mu) {
        pN.setY(c0306mu, "");
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(c0306mu.FragmentStateAdapter$5());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a00d7, new C0309mx(), null, 2);
        if (!setbackgroundtintlist.setX) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setbackgroundtintlist.setTextAlignment = "topic";
        setbackgroundtintlist.setX();
    }
}