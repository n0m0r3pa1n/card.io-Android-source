package io.card.payment;

import android.app.Activity;
import android.graphics.Bitmap;

/**
 * Created by nmp on 16.03.17.
 */

public interface CardIOScanDetection {
    Activity getActivity();
    void onFirstFrame(int orientation);
    void onCardDetected(Bitmap detectedBitmap, DetectionInfo dInfo);
    void onEdgeUpdate(DetectionInfo dInfo);
}
