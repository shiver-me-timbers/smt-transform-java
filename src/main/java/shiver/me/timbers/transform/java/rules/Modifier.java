package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Modifier extends CompositeTokenTransformation {
    public static final String NAME = "modifier";

    public Modifier(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
