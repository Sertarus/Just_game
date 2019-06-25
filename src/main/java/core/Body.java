package core;

import org.jetbrains.annotations.Nullable;

public class Body {

    @Nullable
    private BodyPart head;

    @Nullable
    private BodyPart chest;

    @Nullable
    private BodyPart leftHand;

    @Nullable
    private BodyPart rightHand;

    @Nullable
    private BodyPart leftLeg;

    @Nullable
    private BodyPart rightLeg;

    public Body(){
        this.head = null;
        this.chest = null;
        this.leftHand = null;
        this.rightHand = null;
        this.leftLeg = null;
        this.rightLeg = null;
    }

    @Nullable
    public BodyPart getHead() {
        return head;
    }

    @Nullable
    public BodyPart getChest() {
        return chest;
    }

    @Nullable
    public BodyPart getLeftHand() {
        return leftHand;
    }

    @Nullable
    public BodyPart getRightHand() {
        return rightHand;
    }

    @Nullable
    public BodyPart getLeftLeg() {
        return leftLeg;
    }

    @Nullable
    public BodyPart getRightLeg() {
        return rightLeg;
    }

    public void setHead(@Nullable BodyPart  head ) {
        this.head = head;
    }

    public void setChest(@Nullable BodyPart chest) {
        this.chest = chest;
    }

    public void setLeftHand(@Nullable BodyPart leftHand) {
        this.leftHand = leftHand;
    }

    public void setRightHand(@Nullable BodyPart rightHand) {
        this.rightHand = rightHand;
    }

    public void setLeftLeg(@Nullable BodyPart leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(@Nullable BodyPart rightLeg) {
        this.rightLeg = rightLeg;
    }
}
