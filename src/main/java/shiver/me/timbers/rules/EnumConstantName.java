package shiver.me.timbers.rules;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class EnumConstantName extends CompositeTransformation {
    public static final String NAME = "enumConstantName";

    public EnumConstantName(Applyer applyer) {
        super(NAME, applyer);
    }
}
