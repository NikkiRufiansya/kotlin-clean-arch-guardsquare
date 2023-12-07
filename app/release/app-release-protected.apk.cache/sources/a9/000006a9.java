package o;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.lQ;

/* loaded from: classes.dex */
public final class lQ extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<setY> {
    private ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda0;
    public ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1;
    private final List<String> setIconTintList;

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setY setY(ViewGroup viewGroup) {
        pN.setY(viewGroup, "");
        C0274ln x = C0274ln.setX(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) x, "");
        return new setY(this, x);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ void setY(setY sety, final int i) {
        ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1;
        setY sety2 = sety;
        pN.setY(sety2, "");
        String str = this.setIconTintList.get(i);
        pN.setY(str, "");
        if (i == 0) {
            lQ lQVar = sety2.setAnimationFromJson;
            C0311mz c0311mz = C0311mz.setY;
            MenuHostHelper$$ExternalSyntheticLambda1 = C0348oi.MenuHostHelper$$ExternalSyntheticLambda1("General", "Politics", "Sports", "Business", "Travel", "Tech", "Health", "Food", "Science", "Entertainment");
            lQVar.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        sety2.setZ.setX.setText(str);
        sety2.setZ.setX.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.lS
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                lQ.setY.setIconTintList(lQ.this, i, z);
            }
        });
    }

    public lQ(List<String> list) {
        pN.setY(list, "");
        this.setIconTintList = list;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
    }

    /* loaded from: classes.dex */
    public final class setY extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled {
        final /* synthetic */ lQ setAnimationFromJson;
        final C0274ln setZ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(lQ lQVar, C0274ln c0274ln) {
            super(c0274ln.MenuHostHelper$$ExternalSyntheticLambda1);
            pN.setY(c0274ln, "");
            this.setAnimationFromJson = lQVar;
            this.setZ = c0274ln;
        }

        public static /* synthetic */ void setIconTintList(lQ lQVar, int i, boolean z) {
            pN.setY(lQVar, "");
            if (z) {
                ArrayList arrayList = lQVar.MenuHostHelper$$ExternalSyntheticLambda1;
                Object obj = lQVar.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
                pN.MenuHostHelper$$ExternalSyntheticLambda0(obj, "");
                String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
                arrayList.add(lowerCase);
                return;
            }
            ArrayList arrayList2 = lQVar.MenuHostHelper$$ExternalSyntheticLambda1;
            Object obj2 = lQVar.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
            pN.MenuHostHelper$$ExternalSyntheticLambda0(obj2, "");
            String lowerCase2 = ((String) obj2).toLowerCase(Locale.ROOT);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase2, "");
            arrayList2.remove(lowerCase2);
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1
    public final int setY() {
        return this.setIconTintList.size();
    }
}