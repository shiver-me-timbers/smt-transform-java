package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class ClassOrInterfaceModifier extends CompositeTransformation {
    public static final String NAME = "classOrInterfaceModifier";

    public ClassOrInterfaceModifier(Applyer applyer) {
        super(NAME, applyer);
    }
}
