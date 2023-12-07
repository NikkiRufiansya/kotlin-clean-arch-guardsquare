package o;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class hF extends AbstractC0210hi<Time> {
    public static final InterfaceC0209hh setX = new InterfaceC0209hh() { // from class: o.hF.2
        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            if (hQVar.setIconTintList == Time.class) {
                return new hF();
            }
            return null;
        }
    };
    private final DateFormat setIconTintList = new SimpleDateFormat("hh:mm:ss a");

    @Override // o.AbstractC0210hi
    public final /* synthetic */ void setY(hR hRVar, Time time) {
        Time time2 = time;
        synchronized (this) {
            hRVar.setY(time2 == null ? null : this.setIconTintList.format((Date) time2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.AbstractC0210hi
    /* renamed from: setIconTintList */
    public Time setX(hP hPVar) {
        synchronized (this) {
            if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                hPVar.ViewPager$SavedState$1();
                return null;
            }
            try {
                return new Time(this.setIconTintList.parse(hPVar.setIconSize()).getTime());
            } catch (ParseException e) {
                throw new C0203hb(e);
            }
        }
    }
}