package model;

enum StrafeGrund { TRACK_LIMITS, COLLISION, UNSAFE_RELEASE, SPEEDING_PITLANE }

public class Strafe {
    int id;
    int fahrerId;
    StrafeGrund grund;
    int seconds;
    int lap;
}
