package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Final extends CompositeTokenTransformation {
    public static final String NAME = "'final'";

    public Final(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
