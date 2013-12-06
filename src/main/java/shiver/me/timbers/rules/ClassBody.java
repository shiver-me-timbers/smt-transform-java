package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassBody extends CompositeTransformation {
    public static final String NAME = "classBody";

    public ClassBody(Applyer applyer) {
        super(NAME, applyer);
    }
}
