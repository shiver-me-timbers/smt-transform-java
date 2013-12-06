package shiver.me.timbers.types;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class Char extends CompositeTransformation {
    public static final String NAME = "'char'";

    public Char(Applyer applyer) {
        super(NAME, applyer);
    }
}
