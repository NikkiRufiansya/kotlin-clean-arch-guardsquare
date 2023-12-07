package o;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class setMarqueeRepeatLimit {
    final String MenuHostHelper$$ExternalSyntheticLambda0;
    final List<List<byte[]>> MenuHostHelper$$ExternalSyntheticLambda1;
    final String setIconTintList;
    final String setNavigationOnClickListener;
    final int setX = 0;
    final String setY;

    public setMarqueeRepeatLimit(String str, String str2, String str3, List<List<byte[]>> list) {
        this.setIconTintList = str;
        this.setY = str2;
        this.setNavigationOnClickListener = str3;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = list;
        StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.setIconTintList);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.setY);
        sb2.append(", mQuery: ");
        sb2.append(this.setNavigationOnClickListener);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.setX);
        sb.append(sb3.toString());
        return sb.toString();
    }
}