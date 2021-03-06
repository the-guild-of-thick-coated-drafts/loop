package loop.ast;

import loop.LexprParser;

/**
 * An inline list. Can be a range or
 */
public class ListRange extends Node {
  public final Node from;
  private final boolean slice;
  public final Node to;

  public ListRange(Node from, boolean slice, Node to) {
    this.from = from;
    this.slice = slice;
    this.to = to;
  }

  @Override
  public String toSymbol() {
    return "list "
        + (from == null ? "" : LexprParser.stringify(from))
        + (slice ? ".." : "")
        + (to == null ? "" : LexprParser.stringify(to));
  }
}
