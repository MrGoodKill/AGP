grammar Hello;

r returns [Root root]: 
	p=prog
		{$root = new Root($p.p);};
		
prog returns [Prog p]:
	'main(' l=listvar'){'b=bloc'}'
		{$p = new Prog($l.lv,$b.bc);};

listvar returns[ListVar lv]:
	v=VAR
		{$lv = new ListVar(new Var($v.getText()));}
	| v=VAR','l=listvar
		{$lv = new ListVar(new Var($v.getText()),$l.lv);};

bloc returns[Bloc bc]:
	i=inst b=bloc
		{$bc = new Bloc($i.instruct,$b.bc);}
	| i=inst
		{$bc = new Bloc($i.instruct);};

inst returns[Inst instruct]: 
	a=affct';'
		{$instruct = new Inst($a.aff);}
	| d1=declaration';'
		{$instruct = new Inst($d1.decl);}
	| d2=declaffct';'
		{$instruct = new Inst($d2.decaf);}
//	| c=comment
//		{$instruct = new Inst($c.com);}
	| i=if2
		{$instruct = new Inst($i.i);}
    | w=while2
		{$instruct = new Inst($w.w);};

declaration returns[Decl decl]:
	'var 'l=listvar
		{$decl = new Decl($l.lv);};
		
affct returns[Affct aff]:
	v=VAR':='o=operation
		{$aff = new Affct(new Var($v.getText()),$o.op);};

//comment returns[Comment com]:
//	'/*'(numb|','|';'|'!'|'.'|'?'|'*'|'/')*'*/'
		
declaffct returns[Decaf decaf]:
	'var 'a=affct
		{$decaf = new Decaf($a.aff);};
		
//if2 returns[If2 i]:
//	'if('c=cond'){'b=bloc'}'
//		{$i = new If2($c.c,$b.bc);};

if2 returns[If2 i]: 
    'if('c=cond'){'b=bloc'}else{'b2=bloc'}' {$i = new If2($c.c,$b.bc,$b2.bc);}
    | 'if('c=cond'){'b=bloc'}'{$i = new If2($c.c,$b.bc);};

    
//else2 returns [Else2 e]:
//    'else{'b=bloc'}' {$e = new Else2($b.bc);};


while2 returns[While2 w]:
	'while('c=cond'){'b=bloc'}'
		{$w = new While2($c.c,$b.bc);};

cond returns[Cond c]:
	(op1=operation'='op2=operation {$c = new Cond($op1.op,$op2.op,"=");}
	| op1=operation'>'op2=operation {$c = new Cond($op1.op,$op2.op,">");}
	| op1=operation'<'op2=operation {$c = new Cond($op1.op,$op2.op,"<");}
	| op1=operation'<='op2=operation {$c = new Cond($op1.op,$op2.op,"<=");}
	| op1=operation'>='op2=operation) {$c = new Cond($op1.op,$op2.op,">=");};

operation returns [Op op] :
    f1=factor'+'op2=operation {$op=new Op($f1.f,$op2.op,"+");}
    | f1=factor'-'op2=operation {$op=new Op($f1.f,$op2.op,"-");}
    | f1=factor {$op=new Op($f1.f);};
    
factor returns [Factor f] :
    f1=factor'*'f2=final2 {$f=new Factor($f1.f,$f2.f,"*");}
    | f1=factor'/'f2=final2 {$f=new Factor($f1.f,$f2.f,"/");}
    | f3=final2 {$f=new Factor($f3.f);};
	
final2 returns [Final2 f] :
    '('op1=operation')' {$f=new Final2($op1.op);}
    | nb1=numb {$f=new Final2($nb1.nb);};
	
numb returns [Number nb] :
    c=CONST  {$nb=new Number(new Const2($c.getText()));}
    | v=VAR {$nb=new Number(new Var($v.getText()));};

CONST: [0-9]+ ;
VAR : [a-zA-Z]+ ;

WS : [ \t\r\n]+ -> skip ;