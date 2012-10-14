package com.google.dart.compiler.backend.js.ast;

import com.google.dart.compiler.backend.js.JsToStringGenerationVisitor;
import com.google.dart.compiler.common.HasSourceInfo;
import com.google.dart.compiler.util.TextOutputImpl;

abstract class AbstractNode implements JsNode, HasSourceInfo {
    @Override
    public String toString() {
        TextOutputImpl out = new TextOutputImpl();
        new JsToStringGenerationVisitor(out).accept(this);
        return out.toString();
    }
}