package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ConstantDeclarator extends CompositeTransformation {
    public static final String NAME = "constantDeclarator";

    public ConstantDeclarator(Applyer applyer) {
        super(NAME, applyer);
    }
}
