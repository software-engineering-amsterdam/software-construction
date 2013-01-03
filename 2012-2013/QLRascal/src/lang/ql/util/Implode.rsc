module lang::ql::util::Implode

import ParseTree;
import lang::ql::util::Parse;
import lang::ql::ast::AST;
import IO;


public Expr implode(Tree t) = implode(#Expr, t);

public Expr load(loc l) = implode(parse(readFile(l), l));