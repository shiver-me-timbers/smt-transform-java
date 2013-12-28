package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Type extends CompositeTokenTransformation {
    public static final String NAME = "type";

    public Type(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
