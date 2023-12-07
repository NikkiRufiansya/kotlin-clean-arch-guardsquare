package o;

import java.util.Arrays;
import java.util.logging.Logger;
import o.vV;

/* loaded from: classes.dex */
public final class vY {
    public static final String MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        String obj;
        if (j <= -999500000) {
            StringBuilder sb = new StringBuilder();
            sb.append((j - 500000000) / 1000000000);
            sb.append(" s ");
            obj = sb.toString();
        } else if (j <= -999500) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((j - 500000) / 1000000);
            sb2.append(" ms");
            obj = sb2.toString();
        } else if (j <= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((j - 500) / 1000);
            sb3.append(" µs");
            obj = sb3.toString();
        } else if (j < 999500) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append((j + 500) / 1000);
            sb4.append(" µs");
            obj = sb4.toString();
        } else if (j < 999500000) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append((j + 500000) / 1000000);
            sb5.append(" ms");
            obj = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append((j + 500000000) / 1000000000);
            sb6.append(" s ");
            obj = sb6.toString();
        }
        pW pWVar = pW.setY;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{obj}, 1));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) format, "");
        return format;
    }

    public static final /* synthetic */ void setIconTintList(vR vRVar, vW vWVar, String str) {
        vV.setIconTintList seticontintlist = vV.setX;
        Logger logger = vV.setIconTintList;
        StringBuilder sb = new StringBuilder();
        sb.append(vWVar.setX);
        sb.append(' ');
        pW pWVar = pW.setY;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) format, "");
        sb.append(format);
        sb.append(": ");
        sb.append(vRVar.setIconTintList);
        logger.fine(sb.toString());
    }
}