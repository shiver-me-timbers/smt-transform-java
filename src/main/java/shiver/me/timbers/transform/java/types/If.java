package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class If extends CompositeTokenTransformation {
    public static final String NAME = "'if'";

    public If(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
