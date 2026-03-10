package com.bulletphysics.lotus;

public class CFG {
    // PGS constants
    // i want to make it extremely clear that these arent used in pgs, but rather sequential impulse
    // which means...
    // bugs, bugs, bugs! lots of em.
    // found some? report them as an issue.

    public static final int numIterations = 20;
    public static final float PGSPenetrationMarginMax = 0.05f;
    public static final float PGSPenetrationMarginMin = 0.0001f;
    public static final float PGSPenetrationMarginMaxBump = 0.05f; // 5%
    public static final float PGSPenetrationResolutionDamping = 0.7f;
    public static final float PGSPenetrationVelocityForMinMargin = 20f;
    public static final float PGSAlign2AxesCorrectionDamping = 1.0f;
    public static final float PGSBallInSocketCorrectionDamping = 1.0f;


    // SOR modulation - constraints
    public static float sorConstraintsModulation_thresholdMax = 1.0f;
    public static float sorConstraintsModulation_thresholdMin = 0.01f;
    public static float sorConstraintsModulation_aggressiveValue = 1.5f;
    public static float sorConstraintsModulation_conservativeValue = 0.75f;
    public static float sorConstraintsModulation_easingUpToAggressive = 0.0001f;
    public static float sorConstraintsModulation_easingDownToConservative = 0.2f;

    // SOR modulation - collisions
    public static float sorCollisionsModulation_thresholdMax = 0.05f;
    public static float sorCollisionsModulation_thresholdMin = 0.01f;
    public static float sorCollisionsModulation_aggressiveValue = 1.9f;
    public static float sorCollisionsModulation_conservativeValue = 1.0f;
    public static float sorCollisionsModulation_easingUpToAggressive = 0.0001f;
    public static float sorCollisionsModulation_easingDownToConservative = 0.2f;

    public static float angularDamp() {
        return 0.911328f;
    }
}
