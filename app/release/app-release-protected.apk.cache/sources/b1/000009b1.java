package o;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class setBoxStrokeErrorColor {
    public Rect MenuHostHelper$$ExternalSyntheticLambda0;
    public float MenuHostHelper$$ExternalSyntheticLambda1;
    public Map<String, List<setSimpleItems>> setCenterIfNoTextEnabled;
    public float setChipCornerRadius;
    public float setIconTintList;
    public boolean setLayoutAnimation;
    public List<IconCompat> setNavigationOnClickListener;
    public List<setSimpleItems> setOnLongClickListener;
    public setPrefixTextAppearance<setSimpleItems> setUiOptions;
    public Map<String, setErrorIconOnClickListener> setUnboundedRipple;
    public Map<String, setThumbOffset> setX;
    public onAppEnteredBackground<setImageBitmap> setY;
    public final setChoiceMode setIconSize = new setChoiceMode();
    public final HashSet<String> setTextAlignment = new HashSet<>();
    public int ViewPager$SavedState$1 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r3.substring(0, r3.length() - 1).equalsIgnoreCase(r7) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.IconCompat MenuHostHelper$$ExternalSyntheticLambda0(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List<o.IconCompat> r0 = r6.setNavigationOnClickListener
            r0.size()
            r0 = 0
            r1 = 0
        L7:
            java.util.List<o.IconCompat> r2 = r6.setNavigationOnClickListener
            int r2 = r2.size()
            if (r1 >= r2) goto L44
            java.util.List<o.IconCompat> r2 = r6.setNavigationOnClickListener
            java.lang.Object r2 = r2.get(r1)
            o.IconCompat r2 = (o.IconCompat) r2
            java.lang.String r3 = r2.MenuHostHelper$$ExternalSyntheticLambda1
            boolean r3 = r3.equalsIgnoreCase(r7)
            r4 = 1
            if (r3 == 0) goto L21
            goto L3e
        L21:
            java.lang.String r3 = r2.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.String r5 = o.IconCompat.MenuHostHelper$$ExternalSyntheticLambda0
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L3d
            java.lang.String r3 = r2.MenuHostHelper$$ExternalSyntheticLambda1
            int r5 = r3.length()
            int r5 = r5 - r4
            java.lang.String r3 = r3.substring(r0, r5)
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L41
            return r2
        L41:
            int r1 = r1 + 1
            goto L7
        L44:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBoxStrokeErrorColor.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.String):o.IconCompat");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (setSimpleItems setsimpleitems : this.setOnLongClickListener) {
            sb.append(setsimpleitems.setX("\t"));
        }
        return sb.toString();
    }
}