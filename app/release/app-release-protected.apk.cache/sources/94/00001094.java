package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class setTitleTextAppearance<TResult> extends setAutoSizeTextTypeUniformWithConfiguration<TResult> {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private volatile boolean setIconTintList;
    private Exception setNavigationOnClickListener;
    private Object setX;
    private final Object MenuHostHelper$$ExternalSyntheticLambda0 = new Object();
    private final setScrimAnimationDuration setY = new setScrimAnimationDuration();

    private final void setLayoutAnimation() {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.setY.setIconTintList(this);
            }
        }
    }

    private final void setNavigationOnClickListener() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw setLeftEdgeEffectColor.setX(this);
        }
    }

    private final void setOnLongClickListener() {
        setExpandedTitleMarginBottom.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, "Task is not yet complete");
    }

    private final void setUnboundedRipple() {
        if (this.setIconTintList) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            z = false;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 && !this.setIconTintList && this.setNavigationOnClickListener == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final TResult MenuHostHelper$$ExternalSyntheticLambda1() {
        TResult tresult;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setOnLongClickListener();
            setUnboundedRipple();
            Exception exc = this.setNavigationOnClickListener;
            if (exc == null) {
                tresult = (TResult) this.setX;
            } else {
                throw new setChipIconVisible(exc);
            }
        }
        return tresult;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(Exception exc) {
        setExpandedTitleMarginBottom.setIconTintList(exc, "Exception must not be null");
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setNavigationOnClickListener = exc;
            this.setY.setIconTintList(this);
            return true;
        }
    }

    public final void setIconTintList(Exception exc) {
        setExpandedTitleMarginBottom.setIconTintList(exc, "Exception must not be null");
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setNavigationOnClickListener();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setNavigationOnClickListener = exc;
        }
        this.setY.setIconTintList(this);
    }

    public final void setIconTintList(Object obj) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            setNavigationOnClickListener();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setX = obj;
        }
        this.setY.setIconTintList(this);
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final boolean setIconTintList() {
        return this.setIconTintList;
    }

    public final boolean setUiOptions() {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setIconTintList = true;
            this.setY.setIconTintList(this);
            return true;
        }
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final boolean setX() {
        boolean z;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            z = this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return z;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final Exception setY() {
        Exception exc;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            exc = this.setNavigationOnClickListener;
        }
        return exc;
    }

    public final boolean setY(Object obj) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return false;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setX = obj;
            this.setY.setIconTintList(this);
            return true;
        }
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final <TContinuationResult> setAutoSizeTextTypeUniformWithConfiguration<TContinuationResult> setIconTintList(Executor executor, setAllowedHandwritingDelegatePackage<TResult, TContinuationResult> setallowedhandwritingdelegatepackage) {
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        this.setY.setX(new setBoxStrokeColor(executor, setallowedhandwritingdelegatepackage, settitletextappearance));
        setLayoutAnimation();
        return settitletextappearance;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final <TContinuationResult> setAutoSizeTextTypeUniformWithConfiguration<TContinuationResult> setY(Executor executor, setAllowedHandwritingDelegatePackage<TResult, setAutoSizeTextTypeUniformWithConfiguration<TContinuationResult>> setallowedhandwritingdelegatepackage) {
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        this.setY.setX(new getLocalMatrix(executor, setallowedhandwritingdelegatepackage, settitletextappearance));
        setLayoutAnimation();
        return settitletextappearance;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final <TContinuationResult> setAutoSizeTextTypeUniformWithConfiguration<TContinuationResult> MenuHostHelper$$ExternalSyntheticLambda0(Executor executor, getCallingUid<TResult, TContinuationResult> getcallinguid) {
        setTitleTextAppearance settitletextappearance = new setTitleTextAppearance();
        this.setY.setX(new setCheckedIconMarginResource(executor, getcallinguid, settitletextappearance));
        setLayoutAnimation();
        return settitletextappearance;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final setAutoSizeTextTypeUniformWithConfiguration<TResult> setX(Executor executor, CalendarConstraints$1<? super TResult> calendarConstraints$1) {
        this.setY.setX(new setCloseIconEndPaddingResource(executor, calendarConstraints$1));
        setLayoutAnimation();
        return this;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final setAutoSizeTextTypeUniformWithConfiguration<TResult> setX(Executor executor, getTrimPathStart gettrimpathstart) {
        this.setY.setX(new setImportantForAccessibility(executor, gettrimpathstart));
        setLayoutAnimation();
        return this;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final setAutoSizeTextTypeUniformWithConfiguration<TResult> setX(Executor executor, setAccessibilityDataSensitive setaccessibilitydatasensitive) {
        this.setY.setX(new setEndIconOnLongClickListener(executor, setaccessibilitydatasensitive));
        setLayoutAnimation();
        return this;
    }

    @Override // o.setAutoSizeTextTypeUniformWithConfiguration
    public final setAutoSizeTextTypeUniformWithConfiguration<TResult> setX(Executor executor, setSelectedTabIndicatorColor<TResult> setselectedtabindicatorcolor) {
        this.setY.setX(new setButtonTintMode(executor, setselectedtabindicatorcolor));
        setLayoutAnimation();
        return this;
    }
}