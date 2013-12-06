package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Finally extends CompositeTransformation {
    public static final String NAME = "'finally'";

    public Finally(Applyer applyer) {
        super(NAME, applyer);
    }
}
