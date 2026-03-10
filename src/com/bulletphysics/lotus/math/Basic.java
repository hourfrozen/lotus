package com.bulletphysics.lotus.math;

/// # Basic math.
///
/// The bare essentials for math work.
/// @author hourfrozen

public class Basic {
    public static int clamp(float val, float min, float max) {
        return (int) Math.max((double) min, Math.min((double) max, (double) val));
    }

    public static float lerp1f(float old, float newv, float alpha) {
        return old + (newv - old) * alpha;
    }
}