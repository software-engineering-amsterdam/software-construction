module lang::ql::util::Parse

import lang::ql::syntax::QL;
import ParseTree;

public start[Expr] parse(str src, loc l) = parse(#start[Expr], src, l);