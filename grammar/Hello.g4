grammar Hello;
r : 'main('listvar'){'bloc'}';
listvar : VAR
      | VAR','listvar;
bloc : inst bloc|;
inst : affct';'
       | decl';'
       | decaf';'
       | boucle;
decl : 'var'listvar;
affct : VAR':='op;
boucle : if2
     | while2
     | for2;
	 
decaf: 'var'affct;
if2: 'if('cond'){'bloc'}'elif*(else2|);
elif: 'elif('cond'){'bloc'}';
else2: 'else{'bloc'}';
while2: 'while('cond'){'bloc'}';
for2:'for('decaf';'cond';'affct'){'bloc'}';

cond:
	(op'='op
	| op'>'op
	| op'<'op
	| op'<='op
	| op'>='op);

op : terme('+'terme | '-'terme)*;
terme : factor('*'factor | '/'factor)*;
factor : '-'factor | nb | '('op')';
nb: CONST | VAR;

CONST: [0-9]+ ;
VAR : [a-z]+ ;

WS : [ \t\r\n]+ -> skip ;