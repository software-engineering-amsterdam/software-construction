// $ANTLR 3.4 /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g 2013-01-03 12:00:35

package org.uva.sea.ql.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int COMMENT=4;
    public static final int Ident=5;
    public static final int Int=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QLLexer() {} 
    public QLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:6:6: ( '!' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:6:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:7:6: ( '!=' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:7:8: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:8:7: ( '&&' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:8:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:9:7: ( '(' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:10:7: ( ')' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:11:7: ( '*' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:12:7: ( '+' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:13:7: ( '-' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:14:7: ( '/' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:15:7: ( '<' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:15:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:16:7: ( '<=' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:16:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:17:7: ( '==' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:17:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:18:7: ( '>' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:18:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:19:7: ( '>=' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:19:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:20:7: ( '||' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:20:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:88:5: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:88:7: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:92:6: ( '/*' ( . )* '*/' )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:92:8: '/*' ( . )* '*/'
            {
            match("/*"); 



            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:92:13: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '.')||(LA1_1 >= '0' && LA1_1 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ')')||(LA1_0 >= '+' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:92:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "Ident"
    public final void mIdent() throws RecognitionException {
        try {
            int _type = Ident;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:95:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:95:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:95:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Ident"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:97:4: ( ( '0' .. '9' )+ )
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:97:6: ( '0' .. '9' )+
            {
            // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:97:6: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Int"

    public void mTokens() throws RecognitionException {
        // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | WS | COMMENT | Ident | Int )
        int alt4=19;
        switch ( input.LA(1) ) {
        case '!':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='=') ) {
                alt4=2;
            }
            else {
                alt4=1;
            }
            }
            break;
        case '&':
            {
            alt4=3;
            }
            break;
        case '(':
            {
            alt4=4;
            }
            break;
        case ')':
            {
            alt4=5;
            }
            break;
        case '*':
            {
            alt4=6;
            }
            break;
        case '+':
            {
            alt4=7;
            }
            break;
        case '-':
            {
            alt4=8;
            }
            break;
        case '/':
            {
            int LA4_8 = input.LA(2);

            if ( (LA4_8=='*') ) {
                alt4=17;
            }
            else {
                alt4=9;
            }
            }
            break;
        case '<':
            {
            int LA4_9 = input.LA(2);

            if ( (LA4_9=='=') ) {
                alt4=11;
            }
            else {
                alt4=10;
            }
            }
            break;
        case '=':
            {
            alt4=12;
            }
            break;
        case '>':
            {
            int LA4_11 = input.LA(2);

            if ( (LA4_11=='=') ) {
                alt4=14;
            }
            else {
                alt4=13;
            }
            }
            break;
        case '|':
            {
            alt4=15;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=16;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt4=18;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=19;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }

        switch (alt4) {
            case 1 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:56: T__16
                {
                mT__16(); 


                }
                break;
            case 10 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:62: T__17
                {
                mT__17(); 


                }
                break;
            case 11 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:68: T__18
                {
                mT__18(); 


                }
                break;
            case 12 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:74: T__19
                {
                mT__19(); 


                }
                break;
            case 13 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:80: T__20
                {
                mT__20(); 


                }
                break;
            case 14 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:86: T__21
                {
                mT__21(); 


                }
                break;
            case 15 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:92: T__22
                {
                mT__22(); 


                }
                break;
            case 16 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:98: WS
                {
                mWS(); 


                }
                break;
            case 17 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:101: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 18 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:109: Ident
                {
                mIdent(); 


                }
                break;
            case 19 :
                // /Users/tvdstorm/SEA/courses/sc/2012-2013/repos/sc-ql-2012-2013-java/src/org/uva/sea/ql/parser/antlr/QL.g:1:115: Int
                {
                mInt(); 


                }
                break;

        }

    }


 

}