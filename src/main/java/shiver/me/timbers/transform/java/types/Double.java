package shiver.me.timbers.transform.java.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class Double extends CompositeTokenTransformation {
    public static final String NAME = "'double'";

    public Double(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
