package org.spacehq.mc.protocol.data.game;

public class NetRotation {
    private float pitch;
    private float yaw;
    private float roll;

    public NetRotation() {
        this(0, 0, 0);
    }

    public NetRotation(float pitch, float yaw, float roll) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }

    public float getPitch() {
        return this.pitch;
    }

    public float getYaw() {
        return this.yaw;
    }

    public float getRoll() {
        return this.roll;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        NetRotation netRotation = (NetRotation) o;

        if(Float.compare(netRotation.pitch, pitch) != 0) return false;
        if(Float.compare(netRotation.roll, roll) != 0) return false;
        if(Float.compare(netRotation.yaw, yaw) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (pitch != +0.0f ? Float.floatToIntBits(pitch) : 0);
        result = 31 * result + (yaw != +0.0f ? Float.floatToIntBits(yaw) : 0);
        result = 31 * result + (roll != +0.0f ? Float.floatToIntBits(roll) : 0);
        return result;
    }

}