module Plugin

import util::IDE;
import lang::ql::util::Parse;
import ParseTree;

private str LANG = "QL-R";
private str EXT = "q";


public void main() {
  registerLanguage(LANG, EXT, Tree(str src, loc l) {
     return parse(src, l);
  });
}
