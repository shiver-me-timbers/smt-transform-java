package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Char extends CompositeTokenTransformation {
    public static final String NAME = "'char'";

    public Char(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
