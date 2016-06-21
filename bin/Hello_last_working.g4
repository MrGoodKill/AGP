grammar Hello;
r : 'main('listvar'){'bloc'}';
listvar : VAR
      | VAR','listvar;
bloc : inst bloc|;
inst :  affct';'
		| decl';'
		| decaf';'
		| comment
		| boucle;
decl : 'var'listvar;
affct : VAR':='op;
boucle : if2
     | while2;

comment: '/*'(nb|','|';'|'!'|'.'|'?'|'*'|'/')*'*/';
decaf: 'var'affct;
if2: 'if('cond'){'bloc'}'(else2|);
else2: 'else{'bloc'}';
while2: 'while('cond'){'bloc'}';

cond:
	(op'='op
	| op'>'op
	| op'<'op
	| op'<='op
	| op'>='op);

op : factor'+'op | factor'-'op | factor;   
factor : final2'*'factor | final2'/'factor | final2;
final2 :
    '('op')'
    | nb;
nb: CONST | VAR ;

CONST: [0-9]+ ;
VAR : [a-zA-Z]+ ;

WS : [ \t\r\n]+ -> skip ;