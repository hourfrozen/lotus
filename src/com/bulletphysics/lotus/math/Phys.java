package com.bulletphysics.lotus.math;

import com.bulletphysics.lotus.CFG;

public class Phys {
    public static float computePenetrationMargin(float penetrationVelocity) {
        float min = CFG.PGSPenetrationMarginMin;
        float max = CFG.PGSPenetrationMarginMax;

        if (Math.abs(penetrationVelocity) < CFG.PGSPenetrationVelocityForMinMargin) {
            return min;
        }

        float t = Math.min(1f, Math.abs(penetrationVelocity) / CFG.PGSPenetrationVelocityForMinMargin);
        float margin = min + (max - min) * t;

        margin *= (1f + CFG.PGSPenetrationMarginMaxBump * 0.01f);

        return margin;
    }

}
