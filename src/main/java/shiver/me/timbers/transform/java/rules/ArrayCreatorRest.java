package shiver.me.timbers.transform.java.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplyer;

public class ArrayCreatorRest extends CompositeTokenTransformation {
    public static final String NAME = "arrayCreatorRest";

    public ArrayCreatorRest(TokenApplyer applyer) {
        super(NAME, applyer);
    }
}
