package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Block extends CompositeTransformation {
    public static final String NAME = "block";

    public Block(Applyer applyer) {
        super(NAME, applyer);
    }
}
