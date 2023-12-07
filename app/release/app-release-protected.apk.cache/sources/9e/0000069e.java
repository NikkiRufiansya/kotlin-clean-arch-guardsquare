package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.lK;
import o.pY;

/* loaded from: classes.dex */
public final class lK extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<setX> {
    private final kO MenuHostHelper$$ExternalSyntheticLambda0;
    private final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
    public List<kP> setIconTintList;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda0(kP kPVar);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setX setY(ViewGroup viewGroup) {
        pN.setY(viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.res_0x7f0d003c, viewGroup, false);
        int i = R.id.res_0x7f0a0071;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0071);
        if (textView != null) {
            TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
            if (textView2 != null) {
                ImageView imageView = (ImageView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00f5);
                if (imageView != null) {
                    ImageView imageView2 = (ImageView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0191);
                    if (imageView2 != null) {
                        C0270lj c0270lj = new C0270lj((setScrimVisibleHeightTrigger) inflate, textView, textView2, imageView, imageView2);
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0270lj, "");
                        return new setX(this, c0270lj);
                    }
                    i = R.id.res_0x7f0a0191;
                } else {
                    i = R.id.res_0x7f0a00f5;
                }
            } else {
                i = R.id.res_0x7f0a00a1;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, o.kP] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, o.kP, java.lang.Object] */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ void setY(setX setx, int i) {
        String str;
        setX setx2 = setx;
        String str2 = "";
        pN.setY(setx2, "");
        final kP kPVar = this.setIconTintList.get(i);
        pN.setY(kPVar, "");
        final C0270lj c0270lj = setx2.setAnimationFromJson;
        final lK lKVar = setx2.setTextScaleX;
        if (kPVar.image_url != null) {
            if (kPVar.image_url.length() > 0) {
                mU.MenuHostHelper$$ExternalSyntheticLambda1().setY(kPVar.image_url).setX(setx2.setAnimationFromJson.setIconTintList, null);
            }
        }
        TextView textView = c0270lj.setY;
        List<String> list = kPVar.categories;
        if (list != null && (str = list.get(0)) != null) {
            str2 = str;
        }
        textView.setText(str2);
        TextView textView2 = c0270lj.MenuHostHelper$$ExternalSyntheticLambda1;
        String str3 = kPVar.title;
        if (str3 == null) {
            str3 = kPVar.description;
        }
        textView2.setText(str3);
        final pY.setX setx3 = new pY.setX();
        setx3.setX = lKVar.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(kPVar.uuid);
        if (setx3.setX != 0 && ((kP) setx3.setX).isSaved) {
            c0270lj.MenuHostHelper$$ExternalSyntheticLambda0.setImageResource(R.drawable.res_0x7f080081);
        } else {
            setx3.setX = kPVar;
            c0270lj.MenuHostHelper$$ExternalSyntheticLambda0.setImageResource(R.drawable.res_0x7f080082);
        }
        c0270lj.setX.setOnClickListener(new View.OnClickListener() { // from class: o.lR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lK.setX.setY(lK.this, kPVar);
            }
        });
        c0270lj.MenuHostHelper$$ExternalSyntheticLambda0.setOnClickListener(new View.OnClickListener() { // from class: o.lT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lK.setX.setIconTintList(pY.setX.this, c0270lj, lKVar);
            }
        });
    }

    public lK(setIconTintList seticontintlist, kO kOVar) {
        pN.setY(seticontintlist, "");
        pN.setY(kOVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = kOVar;
        this.setIconTintList = new ArrayList();
    }

    /* loaded from: classes.dex */
    public final class setX extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled {
        final C0270lj setAnimationFromJson;
        final /* synthetic */ lK setTextScaleX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(lK lKVar, C0270lj c0270lj) {
            super(c0270lj.setX);
            pN.setY(c0270lj, "");
            this.setTextScaleX = lKVar;
            this.setAnimationFromJson = c0270lj;
        }

        public static /* synthetic */ void setY(lK lKVar, kP kPVar) {
            pN.setY(lKVar, "");
            pN.setY(kPVar, "");
            lKVar.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(kPVar);
        }

        public static /* synthetic */ void setIconTintList(pY.setX setx, C0270lj c0270lj, lK lKVar) {
            pN.setY(setx, "");
            pN.setY(c0270lj, "");
            pN.setY(lKVar, "");
            if (((kP) setx.setX).isSaved) {
                c0270lj.MenuHostHelper$$ExternalSyntheticLambda0.setImageResource(R.drawable.res_0x7f080082);
                ((kP) setx.setX).isSaved = false;
                lKVar.MenuHostHelper$$ExternalSyntheticLambda0.setY((kP) setx.setX);
                return;
            }
            c0270lj.MenuHostHelper$$ExternalSyntheticLambda0.setImageResource(R.drawable.res_0x7f080081);
            ((kP) setx.setX).isSaved = true;
            lKVar.MenuHostHelper$$ExternalSyntheticLambda0.setY((kP) setx.setX);
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final int setY() {
        if (this.setIconTintList.size() <= 8) {
            return this.setIconTintList.size();
        }
        return 8;
    }
}