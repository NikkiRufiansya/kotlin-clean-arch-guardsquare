package o;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class CctBackendFactory extends Property<ImageView, Matrix> {
    private final Matrix MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // android.util.Property
    public final /* synthetic */ Matrix get(ImageView imageView) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.set(imageView.getImageMatrix());
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }

    public CctBackendFactory() {
        super(Matrix.class, "imageMatrixProperty");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Matrix();
    }
}