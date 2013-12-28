package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class CatchClause extends CompositeTokenTransformation {
    public static final String NAME = "catchClause";

    public CatchClause(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
