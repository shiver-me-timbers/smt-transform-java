package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class VariableInitializer extends CompositeTransformation {
    public static final String NAME = "variableInitializer";

    public VariableInitializer(Applyer applyer) {
        super(NAME, applyer);
    }
}
