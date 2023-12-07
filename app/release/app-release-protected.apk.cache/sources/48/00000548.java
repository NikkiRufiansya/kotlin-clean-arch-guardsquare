package o;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class hC extends AbstractC0210hi<Date> {
    public static final InterfaceC0209hh MenuHostHelper$$ExternalSyntheticLambda1 = new InterfaceC0209hh() { // from class: o.hC.3
        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            if (hQVar.setIconTintList == Date.class) {
                return new hC();
            }
            return null;
        }
    };
    private final List<DateFormat> setX;

    @Override // o.AbstractC0210hi
    public final /* synthetic */ void setY(hR hRVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                hRVar.setY();
            } else {
                hRVar.setY(this.setX.get(0).format(date2));
            }
        }
    }

    public hC() {
        ArrayList arrayList = new ArrayList();
        this.setX = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C0220hs.MenuHostHelper$$ExternalSyntheticLambda1()) {
            StringBuilder sb = new StringBuilder();
            sb.append("MMM d, yyyy");
            sb.append(" ");
            sb.append("h:mm:ss a");
            arrayList.add(new SimpleDateFormat(sb.toString(), Locale.US));
        }
    }

    private Date setIconTintList(String str) {
        synchronized (this) {
            for (DateFormat dateFormat : this.setX) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return hM.MenuHostHelper$$ExternalSyntheticLambda1(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new C0203hb(str, e);
            }
        }
    }

    @Override // o.AbstractC0210hi
    public final /* synthetic */ Date setX(hP hPVar) {
        if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
            hPVar.ViewPager$SavedState$1();
            return null;
        }
        return setIconTintList(hPVar.setIconSize());
    }
}