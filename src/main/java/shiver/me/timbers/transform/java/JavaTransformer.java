package shiver.me.timbers.transform.java;

import shiver.me.timbers.antlr4.java.JavaParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.Antlr4StreamTransformer;
import shiver.me.timbers.transform.antlr4.TokenTransformation;

/**
 * A StreamTransformer for Java source code, it will apply any Transformations that have names matching the different token
 * and rule names. These names can be found in the {@link JavaParser#tokenNames} and {@link JavaParser#ruleNames}
 * arrays.
 */
public class JavaTransformer extends Antlr4StreamTransformer<JavaParser> {

    public JavaTransformer() {
        super(new JavaParserBuilder());
    }

    public JavaTransformer(Transformations<TokenTransformation> parentRuleTransformations) {
        super(new JavaParserBuilder(), parentRuleTransformations);
    }
}
