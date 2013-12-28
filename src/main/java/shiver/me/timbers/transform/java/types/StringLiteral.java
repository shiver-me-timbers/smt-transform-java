package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class StringLiteral extends CompositeTokenTransformation {
    public static final String NAME = "StringLiteral";

    public StringLiteral(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
