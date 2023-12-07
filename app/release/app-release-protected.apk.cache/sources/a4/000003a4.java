package o;

/* loaded from: classes.dex */
public final class dD extends dC {
    private final eO setY;

    public dD(eO eOVar) {
        this.setY = eOVar;
    }

    @Override // o.dC
    public final boolean setIconTintList() {
        if ((this.setY.bitField0_ & 1) != 0) {
            if (this.setY.cpuMetricReadings_.size() > 0 || this.setY.androidMemoryReadings_.size() > 0) {
                return true;
            }
            if ((this.setY.bitField0_ & 2) != 0) {
                eN eNVar = this.setY.gaugeMetadata_;
                if (eNVar == null) {
                    eNVar = eN.setX();
                }
                if ((eNVar.bitField0_ & 16) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}