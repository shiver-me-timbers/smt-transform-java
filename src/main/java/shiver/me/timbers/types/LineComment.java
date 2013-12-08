package shiver.me.timbers.types;

import shiver.me.timbers.transform.Applyer;
import shiver.me.timbers.transform.CompositeTransformation;

public class LineComment extends CompositeTransformation {
    public static final String NAME = "LINE_COMMENT";

    public LineComment(Applyer applyer) {
        super(NAME, applyer);
    }
}
