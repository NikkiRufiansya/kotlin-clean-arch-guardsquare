package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class setOnMenuItemClickListener$MenuHostHelper$$ExternalSyntheticLambda1 {
    private final Object MenuHostHelper$$ExternalSyntheticLambda0;
    private final List MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList();

    public final setOnMenuItemClickListener$MenuHostHelper$$ExternalSyntheticLambda1 setX(String str, Object obj) {
        List list = this.MenuHostHelper$$ExternalSyntheticLambda1;
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=");
        sb.append(valueOf);
        list.add(sb.toString());
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0.getClass().getSimpleName());
        sb.append('{');
        int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.MenuHostHelper$$ExternalSyntheticLambda1.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}