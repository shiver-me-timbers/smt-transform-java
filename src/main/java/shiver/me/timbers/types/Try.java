package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class Try extends CompositeTransformation {
    public static final String NAME = "'try'";

    public Try(Applyer applyer) {
        super(NAME, applyer);
    }
}
