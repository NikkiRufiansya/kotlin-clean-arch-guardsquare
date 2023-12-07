package o;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class hG extends AbstractC0210hi<Date> {
    public static final InterfaceC0209hh MenuHostHelper$$ExternalSyntheticLambda1 = new InterfaceC0209hh() { // from class: o.hG.1
        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            if (hQVar.setIconTintList == Date.class) {
                return new hG();
            }
            return null;
        }
    };
    private final DateFormat MenuHostHelper$$ExternalSyntheticLambda0 = new SimpleDateFormat("MMM d, yyyy");

    @Override // o.AbstractC0210hi
    public final /* synthetic */ void setY(hR hRVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            hRVar.setY(date2 == null ? null : this.MenuHostHelper$$ExternalSyntheticLambda0.format((java.util.Date) date2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.AbstractC0210hi
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
    public Date setX(hP hPVar) {
        synchronized (this) {
            if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                hPVar.ViewPager$SavedState$1();
                return null;
            }
            try {
                return new Date(this.MenuHostHelper$$ExternalSyntheticLambda0.parse(hPVar.setIconSize()).getTime());
            } catch (ParseException e) {
                throw new C0203hb(e);
            }
        }
    }
}