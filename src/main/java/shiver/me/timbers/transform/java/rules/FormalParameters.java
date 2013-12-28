package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class FormalParameters extends CompositeTokenTransformation {
    public static final String NAME = "formalParameters";

    public FormalParameters(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
