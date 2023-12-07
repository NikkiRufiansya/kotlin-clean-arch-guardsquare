package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import o.dO;
import o.eX;

/* loaded from: classes.dex */
public class dO implements Parcelable {
    public static final Parcelable.Creator<dO> CREATOR = new Parcelable.Creator<dO>() { // from class: com.google.firebase.perf.session.PerfSession$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ dO createFromParcel(Parcel parcel) {
            return new dO(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ dO[] newArray(int i) {
            return new dO[i];
        }
    };
    public final eA MenuHostHelper$$ExternalSyntheticLambda1;
    public boolean setIconTintList;
    public final String setY;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public /* synthetic */ dO(Parcel parcel, byte b) {
        this(parcel);
    }

    public static dO setIconTintList(String str) {
        String replace = str.replace("-", "");
        new C0135ep();
        dO dOVar = new dO(replace);
        cW y = cW.setY();
        dOVar.setIconTintList = y.setOnNavigationItemSelectedListener() && Math.random() < y.ViewPager$SavedState$1();
        return dOVar;
    }

    private dO(String str) {
        this.setIconTintList = false;
        this.setY = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new eA();
    }

    private dO(Parcel parcel) {
        this.setIconTintList = false;
        this.setY = parcel.readString();
        this.setIconTintList = parcel.readByte() != 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = (eA) parcel.readParcelable(eA.class.getClassLoader());
    }

    public final eX setY() {
        eX.setX MenuHostHelper$$ExternalSyntheticLambda1 = eX.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1(this.setY);
        if (this.setIconTintList) {
            MenuHostHelper$$ExternalSyntheticLambda1.setX(eU.GAUGES_AND_SYSTEM_EVENTS);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1();
    }

    public static eX[] MenuHostHelper$$ExternalSyntheticLambda1(List<dO> list) {
        if (list.isEmpty()) {
            return null;
        }
        eX[] eXVarArr = new eX[list.size()];
        eX y = list.get(0).setY();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            eX y2 = list.get(i).setY();
            if (!z && list.get(i).setIconTintList) {
                eXVarArr[0] = y2;
                eXVarArr[i] = y;
                z = true;
            } else {
                eXVarArr[i] = y2;
            }
        }
        if (!z) {
            eXVarArr[0] = y;
        }
        return eXVarArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setY);
        parcel.writeByte(this.setIconTintList ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.MenuHostHelper$$ExternalSyntheticLambda1, 0);
    }
}