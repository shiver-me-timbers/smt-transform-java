package shiver.me.timbers.rules;

import shiver.me.timbers.Applyer;
import shiver.me.timbers.CompositeTransformation;

public class TypeList extends CompositeTransformation {
    public static final String NAME = "typeList";

    public TypeList(Applyer applyer) {
        super(NAME, applyer);
    }
}
