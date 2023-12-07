package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lI extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<lI$MenuHostHelper$$ExternalSyntheticLambda0> {
    public ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
    public ArrayList<String> setUiOptions = new ArrayList<>();
    public ArrayList<String> setIconTintList = new ArrayList<>();
    public String MenuHostHelper$$ExternalSyntheticLambda0 = "";

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ lI$MenuHostHelper$$ExternalSyntheticLambda0 setY(ViewGroup viewGroup) {
        pN.setY(viewGroup, "");
        C0274ln x = C0274ln.setX(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) x, "");
        return new lI$MenuHostHelper$$ExternalSyntheticLambda0(this, x);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ void setY(lI$MenuHostHelper$$ExternalSyntheticLambda0 li_menuhosthelper__externalsyntheticlambda0, final int i) {
        lI$MenuHostHelper$$ExternalSyntheticLambda0 li_menuhosthelper__externalsyntheticlambda02 = li_menuhosthelper__externalsyntheticlambda0;
        pN.setY(li_menuhosthelper__externalsyntheticlambda02, "");
        String str = this.setIconTintList.get(i);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, "");
        String str2 = str;
        pN.setY(str2, "");
        C0274ln c0274ln = li_menuhosthelper__externalsyntheticlambda02.setMaxEms;
        lI lIVar = li_menuhosthelper__externalsyntheticlambda02.setAnimationFromJson;
        String str3 = lIVar.setUiOptions.get(i);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str3, "");
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
        if (qR.setIconTintList((CharSequence) lIVar.MenuHostHelper$$ExternalSyntheticLambda0, (CharSequence) lowerCase, false)) {
            c0274ln.setX.setChecked(true);
        }
        c0274ln.setX.setText(str2);
        c0274ln.setX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.lO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                lI$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(lI.this, i, z);
            }
        });
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final int setY() {
        return this.setIconTintList.size();
    }
}