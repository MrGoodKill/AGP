grammar Hello;
r returns [R r]: 
'main(' l=listvar'){'b=bloc'}' {$r = new R($l.listvar,$b.bloc);

listvar : VAR
      | VAR','listvar;
bloc : inst bloc;
inst :  affectation';'
        | decl';'
        | decaf';'
        | comment
        | boucle;
decl : 'var'listvar;
affectation returns [Affectation a] :
    v=VAR':='o=operation {$a=new Affectation($v.text,$o.op)};
    
boucle : if2
     | while2
     | for2;
comment: '/*'(nb|','|';'|'!'|'.'|'?'|'*'|'/')*'*/';
decaf: 'var'affectation;
if2: 'if('cond'){'bloc'}'elif*(else2|);
elif: 'elif('cond'){'bloc'}';
else2: 'else{'bloc'}';
while2: 'while('cond'){'bloc'}';
for2:'for('decaf';'cond';'affectation'){'bloc'}';
cond:
    operation'='operation
    | operation'>'operation
    | operation'<'operation
    | operation'<='operation
    | operation'>='operation;
operation returns [operation op] :
    f=factor'+'op2=operation {$op=new operation($f.f,$op2.op)}
    | f=factor'-'op2=operation {$op=new operation($f.f,$op2.op)}
    | f=factor {$op=new Operation($f.f)};
    
factor returns [Factor f] :
    f2=factor'*'fin=final2 {$f=new Factor($f2.f,$fin.fin)}
    | f2=factor'/'fin=final2 {$f=new Factor($f2.f,$fin.fin)}
    | fin=final2 {$f=new Factor($fin.fin)};
final2 returns [Final2 fin] :
    '('op=operation')' {$fin=new Final2($op.op)}
    | numb=nb {$fin=new Final2($numb.numb)};
nb returns [Number numb] :
    c=CONST  {$numb=new Number($c.text)}
    | v=VAR {$numb=new Number($v.text)};
CONST: [0-9]+ ;
VAR: [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip ;