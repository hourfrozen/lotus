package com.bulletphysics.lotus;

import com.bulletphysics.lotus.math.Basic;

public class sor {

    ///  # Compute the SOR Factor based on penetration.
    ///
    /// @param p The penetration value.
    /// @author hourfrozen
    public static float computeFactor(float p, float currentSor) {
        float t = Basic.clamp((p - CFG.sorConstraintsModulation_thresholdMin) / (CFG.sorConstraintsModulation_thresholdMax - CFG.sorConstraintsModulation_thresholdMin), 0, 1);

        float target = Basic.lerp1f(CFG.sorConstraintsModulation_conservativeValue, CFG.sorConstraintsModulation_aggressiveValue, t);

        if (target > currentSor) {
            currentSor += CFG.sorConstraintsModulation_easingUpToAggressive;
        } else {
            currentSor -= CFG.sorConstraintsModulation_easingDownToConservative;
        }

        // Clamp
        return Basic.clamp(currentSor, CFG.sorConstraintsModulation_thresholdMin, CFG.sorConstraintsModulation_thresholdMax);
    }
}
