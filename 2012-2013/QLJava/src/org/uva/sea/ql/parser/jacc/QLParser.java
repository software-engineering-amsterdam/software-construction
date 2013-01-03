// Output created by jacc on Thu Jan 03 15:28:05 CET 2013

package org.uva.sea.ql.parser.jacc;

import org.uva.sea.ql.ast.*;

class QLParser implements QLTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private org.uva.sea.ql.ast.ASTNode[] yysv;
    private org.uva.sea.ql.ast.ASTNode yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new org.uva.sea.ql.ast.ASTNode[yyss];
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 39:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 40:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 78;
                            continue;
                    }
                    yyn = 81;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 41:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 42:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 81;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 43:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 44:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 45:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 46:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 47:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 48:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 49:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 50:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 51:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 52:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 53:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 54:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 55:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 56:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 57:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 58:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 59:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 60:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 61:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 62:
                    switch (yytok) {
                        case ')':
                            yyn = 38;
                            continue;
                    }
                    yyn = 81;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 63:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 64:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 65:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 66:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 67:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 68:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 69:
                    yyn = yys30();
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 70:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 71:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 72:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 73:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 74:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 75:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 76:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 77:
                    yyn = yys38();
                    continue;

                case 78:
                    return true;
                case 79:
                    yyerror("stack overflow");
                case 80:
                    return false;
                case 81:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        org.uva.sea.ql.ast.ASTNode[] newyysv = new org.uva.sea.ql.ast.ASTNode[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys2() {
        switch (yytok) {
            case AND:
                return 10;
            case EQ:
                return 11;
            case GEQ:
                return 12;
            case LEQ:
                return 13;
            case NEQ:
                return 14;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case '<':
                return 20;
            case '>':
                return 21;
            case ENDINPUT:
            case ')':
                return yyr8();
        }
        return 81;
    }

    private int yys4() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr19();
    }

    private int yys5() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr18();
    }

    private int yys6() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys7() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys8() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys9() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys10() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys11() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys12() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys13() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys14() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys15() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys16() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys17() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys18() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys19() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys20() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys21() {
        switch (yytok) {
            case IDENT:
                return 4;
            case INT:
                return 5;
            case '!':
                return 6;
            case '(':
                return 7;
            case '+':
                return 8;
            case '-':
                return 9;
        }
        return 81;
    }

    private int yys22() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr11();
    }

    private int yys24() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr9();
    }

    private int yys25() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr10();
    }

    private int yys26() {
        switch (yytok) {
            case INT:
            case '(':
            case UPLUS:
            case UMIN:
            case IDENT:
            case NEW:
            case error:
            case '!':
            case UNOT:
                return 81;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
        }
        return yyr16();
    }

    private int yys27() {
        switch (yytok) {
            case AND:
                return 10;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case ENDINPUT:
            case ')':
                return yyr2();
        }
        return 81;
    }

    private int yys28() {
        switch (yytok) {
            case AND:
                return 10;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case ENDINPUT:
            case ')':
                return yyr6();
        }
        return 81;
    }

    private int yys29() {
        switch (yytok) {
            case AND:
                return 10;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case ENDINPUT:
            case ')':
                return yyr7();
        }
        return 81;
    }

    private int yys30() {
        switch (yytok) {
            case AND:
                return 10;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case ENDINPUT:
            case ')':
                return yyr3();
        }
        return 81;
    }

    private int yys31() {
        switch (yytok) {
            case AND:
                return 10;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case NEQ:
            case LEQ:
            case GEQ:
            case '>':
            case '<':
            case OR:
            case ')':
            case ENDINPUT:
            case EQ:
                return yyr17();
        }
        return 81;
    }

    private int yys32() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr12();
    }

    private int yys33() {
        switch (yytok) {
            case UNOT:
            case error:
            case UPLUS:
            case NEW:
            case '(':
            case '!':
            case UMIN:
            case INT:
            case IDENT:
                return 81;
            case '*':
                return 16;
            case '/':
                return 19;
        }
        return yyr14();
    }

    private int yys34() {
        switch (yytok) {
            case UNOT:
            case error:
            case UPLUS:
            case NEW:
            case '(':
            case '!':
            case UMIN:
            case INT:
            case IDENT:
                return 81;
            case '*':
                return 16;
            case '/':
                return 19;
        }
        return yyr15();
    }

    private int yys35() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr13();
    }

    private int yys36() {
        switch (yytok) {
            case AND:
                return 10;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case ENDINPUT:
            case ')':
                return yyr5();
        }
        return 81;
    }

    private int yys37() {
        switch (yytok) {
            case AND:
                return 10;
            case OR:
                return 15;
            case '*':
                return 16;
            case '+':
                return 17;
            case '-':
                return 18;
            case '/':
                return 19;
            case ENDINPUT:
            case ')':
                return yyr4();
        }
        return 81;
    }

    private int yys38() {
        switch (yytok) {
            case '!':
            case NEW:
            case INT:
            case '(':
            case error:
            case UPLUS:
            case UNOT:
            case UMIN:
            case IDENT:
                return 81;
        }
        return yyr20();
    }

    private int yyr1() { // top : comp
        { result = ((Expr)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr9() { // expr : '+' expr
        { yyrv = new Pos(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr10() { // expr : '-' expr
        { yyrv = new Neg(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr11() { // expr : '!' expr
        { yyrv = new Not(((Expr)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypexpr();
    }

    private int yyr12() { // expr : expr '*' expr
        { yyrv = new Mul(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr13() { // expr : expr '/' expr
        { yyrv = new Div(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr14() { // expr : expr '+' expr
        { yyrv = new Add(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr15() { // expr : expr '-' expr
        { yyrv = new Sub(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr16() { // expr : expr AND expr
        { yyrv = new And(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr17() { // expr : expr OR expr
        { yyrv = new Or(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yyr18() { // expr : INT
        { yyrv = ((Int)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr19() { // expr : IDENT
        { yyrv = yysv[yysp-1]; }
        yysv[yysp-=1] = yyrv;
        return yypexpr();
    }

    private int yyr20() { // expr : '(' comp ')'
        { yyrv = ((Expr)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypexpr();
    }

    private int yypexpr() {
        switch (yyst[yysp-1]) {
            case 21: return 37;
            case 20: return 36;
            case 19: return 35;
            case 18: return 34;
            case 17: return 33;
            case 16: return 32;
            case 15: return 31;
            case 14: return 30;
            case 13: return 29;
            case 12: return 28;
            case 11: return 27;
            case 10: return 26;
            case 9: return 25;
            case 8: return 24;
            case 6: return 22;
            default: return 2;
        }
    }

    private int yyr2() { // comp : expr EQ expr
        { yyrv = new Eq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr3() { // comp : expr NEQ expr
        { yyrv = new NEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr4() { // comp : expr '>' expr
        { yyrv = new GT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr5() { // comp : expr '<' expr
        { yyrv = new LT(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr6() { // comp : expr GEQ expr
        { yyrv = new GEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr7() { // comp : expr LEQ expr
        { yyrv = new LEq(((Expr)yysv[yysp-3]), ((Expr)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypcomp();
    }

    private int yyr8() { // comp : expr
        { yyrv = ((Expr)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypcomp();
    }

    private int yypcomp() {
        switch (yyst[yysp-1]) {
            case 0: return 3;
            default: return 23;
        }
    }

    protected String[] yyerrmsgs = {
    };

private QLLexer lexer; 

private Expr result;

public Expr getResult() {
  return result;
}

public QLParser(QLLexer lexer) { 
  this.lexer = lexer; 
}

private void yyerror(String msg) { 
  System.err.println(msg); 
}

}
