package shiver.me.timbers;

import org.apache.commons.io.IOUtils;
import shiver.me.timbers.rules.ClassDeclaration;
import shiver.me.timbers.rules.ClassDefinition;
import shiver.me.timbers.rules.ClassOrInterfaceModifier;
import shiver.me.timbers.rules.ClassOrInterfaceType;
import shiver.me.timbers.rules.ConstructorDeclaration;
import shiver.me.timbers.rules.Literal;
import shiver.me.timbers.rules.MethodDefinition;
import shiver.me.timbers.rules.Modifier;
import shiver.me.timbers.rules.PackageDeclaration;
import shiver.me.timbers.rules.PrimitiveType;
import shiver.me.timbers.rules.TypeDeclaration;
import shiver.me.timbers.rules.VariableDeclaratorId;
import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.IndividualTransformations;
import shiver.me.timbers.transform.Transformation;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.types.Comment;
import shiver.me.timbers.types.JavaDoc;
import shiver.me.timbers.types.LineComment;
import shiver.me.timbers.types.Private;
import shiver.me.timbers.types.Public;
import shiver.me.timbers.types.Return;
import shiver.me.timbers.types.Static;
import shiver.me.timbers.types.This;
import shiver.me.timbers.types.Void;

import java.io.IOException;
import java.io.InputStream;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;

public final class TestData {

    private TestData() {
    }

    public static final String TEST_FILE_NAME = "Test.java";
    public static final String INVALID_TEST_FILE_NAME = "InvalidTest.javor";
    public static final String TRANSFORMED_TEST_FILE_NAME = "Test.java.transformed";
    public static final String TRANSFORMED_INVALID_TEST_FILE_NAME = "InvalidTest.javor.transformed";

    public static final Applyer MOCK_APPLYER = mock(Applyer.class);

    public static final Transformation WRAPPING_CLASS_DECLARATION = new NameWrappingTransformation(ClassDeclaration.NAME);
    public static final Transformation WRAPPING_CLASS_OR_INTERFACE_MODIFIER =
            new NameWrappingTransformation(ClassOrInterfaceModifier.NAME);
    public static final Transformation WRAPPING_CLASS_OR_INTERFACE_TYPE = new NameWrappingTransformation(ClassOrInterfaceType.NAME);
    public static final Transformation WRAPPING_COMMENT = new NameWrappingTransformation(Comment.NAME);
    public static final Transformation WRAPPING_JAVA_DOC = new NameWrappingTransformation(JavaDoc.NAME);
    public static final Transformation WRAPPING_LINE_COMMENT = new NameWrappingTransformation(LineComment.NAME);
    public static final Transformation WRAPPING_LITERAL = new NameWrappingTransformation(Literal.NAME);
    public static final Transformation WRAPPING_MODIFIER = new NameWrappingTransformation(Modifier.NAME);
    public static final Transformation WRAPPING_PACKAGE_DECLARATION = new NameWrappingTransformation(PackageDeclaration.NAME);
    public static final Transformation WRAPPING_PRIMITIVE_TYPE = new NameWrappingTransformation(PrimitiveType.NAME);
    public static final Transformation WRAPPING_RETURN = new NameWrappingTransformation(Return.NAME);
    public static final Transformation WRAPPING_THIS = new NameWrappingTransformation(This.NAME);
    public static final Transformation WRAPPING_TYPE_DECLARATION = new NameWrappingTransformation(TypeDeclaration.NAME);
    public static final Transformation WRAPPING_VARIABLE_DECLARATOR_ID = new NameWrappingTransformation(VariableDeclaratorId.NAME);
    public static final Transformation WRAPPING_CONSTRUCTOR_DECLARATION = new NameWrappingTransformation(ConstructorDeclaration.NAME);
    public static final Transformation WRAPPING_CLASS_DEFINITION = new NameWrappingTransformation(ClassDefinition.NAME);
    public static final Transformation WRAPPING_METHOD_DEFINITION = new NameWrappingTransformation(MethodDefinition.NAME);
    public static final Transformation WRAPPING_PUBLIC = new NameWrappingTransformation(Public.NAME);
    public static final Transformation WRAPPING_STATIC = new NameWrappingTransformation(Static.NAME);
    public static final Transformation WRAPPING_VOID = new NameWrappingTransformation(Void.NAME);
    public static final Transformation WRAPPING_PRIVATE = new NameWrappingTransformation(Private.NAME);

    public static final Transformations TRANSFORMATIONS = new IndividualTransformations(asList(
            WRAPPING_CLASS_DECLARATION,
            WRAPPING_CLASS_OR_INTERFACE_MODIFIER,
            WRAPPING_CLASS_OR_INTERFACE_TYPE,
            WRAPPING_COMMENT,
            WRAPPING_JAVA_DOC,
            WRAPPING_LINE_COMMENT,
            WRAPPING_MODIFIER,
            WRAPPING_PACKAGE_DECLARATION,
            WRAPPING_PRIMITIVE_TYPE,
            WRAPPING_LITERAL,
            WRAPPING_THIS,
            WRAPPING_RETURN,
            WRAPPING_TYPE_DECLARATION,
            WRAPPING_VARIABLE_DECLARATOR_ID,
            WRAPPING_CONSTRUCTOR_DECLARATION,
            WRAPPING_CLASS_DEFINITION,
            WRAPPING_METHOD_DEFINITION,
            WRAPPING_PUBLIC,
            WRAPPING_STATIC,
            WRAPPING_VOID,
            WRAPPING_PRIVATE
    ));

    public static final String SOURCE = readTestFileToString(TEST_FILE_NAME);
    public static final String TRANSFORMED_SOURCE = readTestFileToString(TRANSFORMED_TEST_FILE_NAME);
    public static final String TRANSFORMED_INVALID_SOURCE = readTestFileToString(TRANSFORMED_INVALID_TEST_FILE_NAME);

    /**
     * @return the input stream for the default test file.
     */
    public static InputStream readTestFile() {

        return readTestFile(TEST_FILE_NAME);
    }

    /**
     * @return an input stream for the test file in the {@code shiver.me.timbers} package with the supplied name.
     */
    public static InputStream readTestFile(String fileName) {

        return TestData.class.getResourceAsStream(fileName);
    }

    /**
     * @return a {@code String} containing the contents of the test file in the {@code shiver.me.timbers} package with
     *         the supplied name.
     */
    public static String readTestFileToString(String fileName) {

        try {

            return IOUtils.toString(readTestFile(fileName));

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    /**
     * A simple Transformation that wraps the related text with the name of the wrapped Transformation surrounded in square
     * brackets e.g. [type]int[type].
     */
    private static class NameWrappingTransformation implements Transformation {

        private final String name;

        private NameWrappingTransformation(String name) {

            this.name = name;
        }

        @Override
        public String getName() {

            return name;
        }

        @Override
        public String apply(String string) {

            return '[' + getName() + ']' + string + '[' + getName() + ']';
        }
    }
}
